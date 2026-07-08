package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oOy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471740oOy {
    public final List<String> LIZ;
    public final InterfaceC1471730oOx LIZIZ;
    public int LIZJ;
    public String LIZLLL;

    public final synchronized String LIZ() {
        int i = this.LIZJ + 1;
        this.LIZJ = i;
        if (((ArrayList) this.LIZ).size() <= i) {
            return "";
        }
        String str = (String) ListProtector.get(this.LIZ, i);
        this.LIZLLL = str;
        return str;
    }

    public final synchronized String LIZJ() {
        if (C2093608Ic.LJ(this.LIZLLL)) {
            int size = ((ArrayList) this.LIZ).size();
            int i = this.LIZJ;
            if (size > i) {
                this.LIZLLL = (String) ListProtector.get(this.LIZ, i);
            }
        }
        return this.LIZLLL;
    }

    public final synchronized void LIZLLL() {
        C1471720oOw c1471720oOw = (C1471720oOw) this.LIZIZ;
        c1471720oOw.LIZIZ = 0;
        c1471720oOw.LIZJ = 0;
        this.LIZLLL = null;
        this.LIZJ = 0;
    }

    public final synchronized Pair<String, Long> LIZIZ(C0XLY c0xly) {
        String strLIZJ;
        long jLIZ;
        strLIZJ = LIZJ();
        jLIZ = ((C1471710oOv) this.LIZIZ).LIZ(c0xly);
        if (jLIZ == -1) {
            C1471720oOw c1471720oOw = (C1471720oOw) this.LIZIZ;
            c1471720oOw.LIZIZ = 0;
            c1471720oOw.LIZJ = 0;
            strLIZJ = LIZ();
            if (!TextUtils.isEmpty(strLIZJ)) {
                ((C1471710oOv) this.LIZIZ).getClass();
                jLIZ = (long) ((Math.random() * 4500.0d) + 500.0d);
            }
        }
        return new Pair<>(strLIZJ, Long.valueOf(jLIZ));
    }

    public C1471740oOy(List<String> list, InterfaceC1471730oOx interfaceC1471730oOx) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.LIZIZ = interfaceC1471730oOx;
        LIZLLL();
    }
}
