package X;

import com.google.gson.Gson;
import com.google.gson.e;

/* JADX INFO: renamed from: X.00S4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00S4 {
    public static Gson LIZ;

    public static synchronized Gson LIZ() {
        if (LIZ == null) {
            e eVar = new e();
            eVar.LJIIL = false;
            LIZ = eVar.LIZ();
        }
        return LIZ;
    }
}
