package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NAS, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NAS implements InterfaceC589470NAb {
    public final String LIZ;
    public final ArrayList<C0NAZ> LIZIZ;
    public final Executor LIZJ;
    public final C0NAT LIZLLL;
    public int LJ;
    public int LJFF;
    public String LJI;

    public C0NAS() {
        throw null;
    }

    public final void LIZ() {
        this.LJ = -1;
        this.LJFF = -1;
        this.LJI = "";
        for (C0NAZ c0naz : this.LIZIZ) {
            AbstractC1321260kUG abstractC1321260kUG = c0naz.LJ;
            if (abstractC1321260kUG != null) {
                abstractC1321260kUG.close();
            }
            c0naz.LJ = null;
            c0naz.LIZIZ = null;
        }
        this.LIZIZ.clear();
    }

    public final void LJFF() {
        this.LJ = -1;
        this.LJFF = -1;
        this.LJI = "";
        for (C0NAZ c0naz : this.LIZIZ) {
            AbstractC1321260kUG abstractC1321260kUG = c0naz.LJ;
            if (abstractC1321260kUG != null) {
                abstractC1321260kUG.close();
            }
            c0naz.LJ = null;
        }
    }

    public final void LIZJ() {
        if (this.LIZIZ.size() <= 0) {
            return;
        }
        for (int size = this.LIZIZ.size() - 1; -1 < size; size--) {
            if (((C0NAZ) ListProtector.get(this.LIZIZ, size)).LIZ.get() == null) {
                ListProtector.remove(this.LIZIZ, size);
            }
        }
    }

    @Override // X.InterfaceC589470NAb
    public final void LIZLLL() {
        int i = this.LJFF;
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        this.LJFF = i2;
        if (i2 >= this.LIZIZ.size() || (this.LJFF - this.LJ) + 1 > this.LIZLLL.LIZ()) {
            LIZJ();
        } else {
            ((C0NAZ) ListProtector.get(this.LIZIZ, this.LJFF)).LIZ();
        }
    }

    @Override // X.InterfaceC589470NAb
    public final void onFailure() {
        LIZJ();
    }

    public final int LIZIZ(String str) {
        String sourceId;
        int size = this.LIZIZ.size();
        for (int i = 0; i < size; i++) {
            SimVideoUrlModel simVideoUrlModel = ((C0NAZ) ListProtector.get(this.LIZIZ, i)).LIZ.get();
            if (simVideoUrlModel != null) {
                sourceId = simVideoUrlModel.getSourceId();
            } else {
                sourceId = null;
            }
            if (TextUtils.equals(str, sourceId)) {
                return i;
            }
        }
        return -1;
    }

    public final void LJ(String str) {
        int iLIZIZ = LIZIZ(str);
        if (iLIZIZ < 0 || Intrinsics.LJFF(this.LJI, str)) {
            return;
        }
        this.LJI = str;
        int i = iLIZIZ;
        do {
            C0NAZ c0naz = (C0NAZ) ListProtector.get(this.LIZIZ, i);
            AbstractC1321260kUG abstractC1321260kUG = c0naz.LJ;
            if (abstractC1321260kUG != null) {
                abstractC1321260kUG.close();
            }
            c0naz.LJ = null;
            c0naz.LIZIZ = null;
            if (i < iLIZIZ) {
                ListProtector.remove(this.LIZIZ, i);
            }
            i--;
        } while (-1 < i);
        this.LJ = 1;
        this.LJFF = 1;
        if (1 < this.LIZIZ.size()) {
            ((C0NAZ) ListProtector.get(this.LIZIZ, this.LJFF)).LIZ();
        }
    }

    public C0NAS(String str, ExecutorC587170N1f executorC587170N1f, C0NAT c0nat) {
        ArrayList<C0NAZ> arrayList = new ArrayList<>();
        this.LIZ = str;
        this.LIZIZ = arrayList;
        this.LIZJ = executorC587170N1f;
        this.LIZLLL = c0nat;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJI = "";
    }
}
