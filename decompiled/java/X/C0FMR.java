package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FMR, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FMR {
    public boolean LIZIZ;
    public String LIZ = "";
    public final SparseArray<ArrayList<C114D>> LIZJ = new SparseArray<>();
    public final HashMap<String, C0FMO> LIZLLL = new HashMap<>();

    public final boolean LIZ(String str) {
        ArrayList<C114D> arrayList = this.LIZJ.get(0);
        if (arrayList == null) {
            return false;
        }
        for (C114D c114d : arrayList) {
            if (Intrinsics.LJFF(c114d.LIZ.getEffectId(), str)) {
                if (c114d == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final C0FMO LIZIZ(String str) {
        return this.LIZLLL.get(str);
    }

    public final void LIZJ(String str, C0FMO c0fmo) {
        this.LIZLLL.put(str, c0fmo);
    }
}
