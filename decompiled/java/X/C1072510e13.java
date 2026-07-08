package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072510e13 {
    public static final C1072510e13 LIZ = new C1072510e13();

    public static String LIZLLL() {
        C338980DQq.LIZ.getClass();
        return C338980DQq.LIZIZ() ? "ad_disclosure" : "no_ad_disclosure";
    }

    public static void LIZ(int i, String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (i == EnumC1072920e1i.NEW_VERSION_FACEBOOK.getValue()) {
            str2 = "facebook";
        } else {
            str2 = "contact";
        }
        c2344009Gk.LJIIIIZZ("platform", str2);
        c2344009Gk.LJIIIIZZ("enter_from", "version_update");
        c2344009Gk.LJIIIIZZ("result", str);
        if (i == EnumC1072920e1i.NEW_VERSION_CONTACT.getValue()) {
            LIZ.getClass();
            c2344009Gk.LJFF("prompt_content", LIZLLL());
        }
        C20684815ws.LJIILLIIL("click_authorize_reconfirm_pop_up", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("exit_from", str);
        c2344009Gk.LJIIIIZZ("enter_from", "version_update");
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        if (Intrinsics.LJFF(str, "contact")) {
            LIZ.getClass();
            c2344009Gk.LJFF("prompt_content", LIZLLL());
        }
        C20684815ws.LJIILLIIL("exit_update_authorize_process", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r8, int r9, long r10, java.lang.String r12) {
        /*
            r0 = 1
            r4 = 3
            java.lang.String r3 = "facebook"
            java.lang.String r1 = "contact"
            if (r8 == r0) goto L9b
            r0 = 2
            if (r8 == r0) goto L98
            if (r8 == r4) goto L90
            java.lang.String r5 = ""
        Lf:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r3)
            r6 = 0
            if (r0 == 0) goto L86
            r2 = r3
        L17:
            X.0dzs r0 = X.C1071780dzs.LIZ
            r0.getClass()
            java.lang.String r7 = X.C1071780dzs.LIZLLL(r2)
            X.0dzs r0 = X.C1071780dzs.LIZ
            r0.getClass()
            java.lang.String r6 = X.C1071780dzs.LIZJ(r2)
        L29:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r0 = "platform"
            r2.LJIIIIZZ(r0, r5)
            if (r8 != r4) goto L83
            java.lang.String r4 = "version_update"
        L37:
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r4)
            java.lang.String r0 = "result"
            r2.LJIIIIZZ(r0, r12)
            java.lang.String r0 = "duration"
            r2.LIZLLL(r10, r0)
            if (r7 == 0) goto L4d
            java.lang.String r0 = "did_status"
            r2.LJFF(r0, r7)
        L4d:
            if (r6 == 0) goto L54
            java.lang.String r0 = "uid_status"
            r2.LJFF(r0, r6)
        L54:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r3)
            if (r0 == 0) goto L73
            X.0e19 r0 = X.C1072570e19.LIZ
            java.lang.Integer r0 = r0.LIZLLL()
            if (r0 == 0) goto L6b
            int r1 = r0.intValue()
            java.lang.String r0 = "server_fb_token"
            r2.LIZJ(r1, r0)
        L6b:
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "confirm_auth_page"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L73:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r1)
            if (r0 == 0) goto L6b
            java.lang.String r1 = LIZLLL()
            java.lang.String r0 = "prompt_content"
            r2.LJFF(r0, r1)
            goto L6b
        L83:
            java.lang.String r4 = "login_onboarding"
            goto L37
        L86:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r1)
            if (r0 == 0) goto L8e
            r2 = r1
            goto L17
        L8e:
            r7 = r6
            goto L29
        L90:
            X.0e1i r0 = X.EnumC1072920e1i.NEW_VERSION_FACEBOOK
            int r0 = r0.getValue()
            if (r9 != r0) goto L9b
        L98:
            r5 = r3
            goto Lf
        L9b:
            r5 = r1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1072510e13.LIZIZ(int, int, long, java.lang.String):void");
    }
}
