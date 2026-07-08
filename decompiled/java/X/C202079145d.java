package X;

import android.app.Application;
import android.content.Context;

/* JADX INFO: renamed from: X.145d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202079145d {
    public static volatile boolean LIZ;

    public static boolean LIZIZ() {
        return LIZ;
    }

    public static C202080145e LIZ(String str) {
        return new C202080145e(str, C202079145d.class.getClassLoader());
    }

    public static void LIZJ(Context context) {
        if (C202078145c.LIZ == null) {
            if (!(context instanceof Application) && C786410Ut5.N3(context) != null) {
                C202078145c.LIZ = C786410Ut5.N3(context);
            } else {
                C202078145c.LIZ = context;
            }
        }
        LIZ = true;
    }
}
