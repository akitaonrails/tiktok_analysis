package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01Xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C350801Xu {
    public static final C350801Xu LIZ = new C350801Xu();

    public static void LIZIZ(Function0 function0) {
        if (C350901Xv.LIZ()) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01WB(function0, null), 2);
        } else {
            function0.invoke();
        }
    }

    public static void LIZ(long j, String str, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("checker_name", str);
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "cancel_time_from_start");
        c2344009Gk.LJIIIIZZ("check_name", str2);
        c2344009Gk.LJ(Boolean.valueOf(z), "is_time_out");
        LIZIZ(new C5182020e(c2344009Gk, 166));
    }
}
