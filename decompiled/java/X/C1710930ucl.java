package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0ucl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1710930ucl {
    public static final C1710930ucl LIZ = new C1710930ucl();
    public static InterfaceC921603iw LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static boolean LJ;

    public static String LIZIZ(String str, String str2) {
        InterfaceC921603iw interfaceC921603iw = LIZIZ;
        if (interfaceC921603iw != null) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            String strLIZJ = interfaceC921603iw.LIZJ(str, str2);
            if (strLIZJ != null) {
                return strLIZJ;
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r13, java.lang.String r14, boolean r15) {
        /*
            java.lang.String r5 = "init error sdk, mid="
            r2 = 4
            java.lang.String r6 = "Cashier"
            if (r13 == 0) goto Lbb
            int r0 = r13.length()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto Lbb
            if (r14 == 0) goto Lbb
            int r0 = r14.length()     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto Lbb
            java.lang.String r0 = X.C1710930ucl.LIZJ     // Catch: java.lang.Exception -> Lab
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r13, r0)     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L29
            java.lang.String r0 = X.C1710930ucl.LIZLLL     // Catch: java.lang.Exception -> Lab
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r14, r0)     // Catch: java.lang.Exception -> Lab
            if (r0 == 0) goto L29
            boolean r0 = X.C1710930ucl.LJ     // Catch: java.lang.Exception -> Lab
            if (r15 == r0) goto Lbb
        L29:
            X.C1710930ucl.LIZJ = r13     // Catch: java.lang.Exception -> Lab
            X.C1710930ucl.LIZLLL = r14     // Catch: java.lang.Exception -> Lab
            X.C1710930ucl.LJ = r15     // Catch: java.lang.Exception -> Lab
            java.lang.Class<com.ss.android.ugc.aweme.setting.services.ISettingService> r7 = com.ss.android.ugc.aweme.setting.services.ISettingService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L53
            com.ss.android.ugc.aweme.setting.services.ISettingService r1 = (com.ss.android.ugc.aweme.setting.services.ISettingService) r1     // Catch: java.lang.Exception -> L53
            if (r1 == 0) goto L5d
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Exception -> L53
            r0.getClass()     // Catch: java.lang.Exception -> L53
            android.content.Context r0 = X.C844470XAv.LIZ()     // Catch: java.lang.Exception -> L53
            X.0znt r0 = r1.getCurrentI18nItem(r0)     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L5d
            java.lang.String r4 = r0.LIZ()     // Catch: java.lang.Exception -> L53
            goto L5b
        L53:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> Lab
            X.C1AF0.LJ(r0)     // Catch: java.lang.Exception -> Lab
            goto L5d
        L5b:
            if (r4 != 0) goto L5f
        L5d:
            java.lang.String r4 = "en"
        L5f:
            X.0uZC r3 = X.C1708710uZB.LIZ(r6)     // Catch: java.lang.Exception -> Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lab
            r1.<init>(r5)     // Catch: java.lang.Exception -> Lab
            r1.append(r13)     // Catch: java.lang.Exception -> Lab
            java.lang.String r0 = ", muid="
            r1.append(r0)     // Catch: java.lang.Exception -> Lab
            r1.append(r14)     // Catch: java.lang.Exception -> Lab
            java.lang.String r0 = ", locale="
            r1.append(r0)     // Catch: java.lang.Exception -> Lab
            r1.append(r4)     // Catch: java.lang.Exception -> Lab
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> Lab
            r3.LIZ(r2, r0)     // Catch: java.lang.Exception -> Lab
            java.lang.Class<com.ss.android.ugc.aweme.pipo.errorsdk.IErrorCodeSdk> r7 = com.ss.android.ugc.aweme.pipo.errorsdk.IErrorCodeSdk.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> Lab
            com.ss.android.ugc.aweme.pipo.errorsdk.IErrorCodeSdk r3 = (com.ss.android.ugc.aweme.pipo.errorsdk.IErrorCodeSdk) r3     // Catch: java.lang.Exception -> Lab
            if (r3 == 0) goto La2
            if (r15 == 0) goto L97
            java.lang.String r1 = "ttls_refund_cashier"
            goto L99
        L97:
            java.lang.String r1 = "general_embedded_cashier"
        L99:
            java.lang.String r0 = ""
            if (r13 != 0) goto L9e
            r13 = r0
        L9e:
            if (r14 != 0) goto La4
            r14 = r0
            goto La4
        La2:
            r0 = 0
            goto La8
        La4:
            X.03iw r0 = r3.LIZ(r1, r4, r13, r14)     // Catch: java.lang.Exception -> Lab
        La8:
            X.C1710930ucl.LIZIZ = r0     // Catch: java.lang.Exception -> Lab
            return
        Lab:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
            X.0uZC r1 = X.C1708710uZB.LIZ(r6)
            java.lang.String r0 = "init error sdk fail"
            r1.LIZ(r2, r0)
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1710930ucl.LIZJ(java.lang.String, java.lang.String, boolean):void");
    }

    public static void LIZLLL(C1710930ucl c1710930ucl, Fragment fragment, String str) {
        InterfaceC921603iw interfaceC921603iw;
        c1710930ucl.getClass();
        C1710940ucm c1710940ucmLIZ = LIZ(c1710930ucl, null, fragment, 1);
        if (c1710940ucmLIZ != null && (interfaceC921603iw = LIZIZ) != null) {
            interfaceC921603iw.LIZLLL(c1710940ucmLIZ, str, new C963003pc(null));
        }
    }

    public static C1710940ucm LIZ(C1710930ucl c1710930ucl, Context context, Fragment fragment, int i) {
        if ((i & 1) != 0) {
            context = null;
        }
        if ((i & 2) != 0) {
            fragment = null;
        }
        c1710930ucl.getClass();
        if (context != null) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            if (activityLIZ != null) {
                return new C1710940ucm(activityLIZ, activityLIZ);
            }
            return new C1710940ucm(context, null);
        }
        if (fragment == null) {
            return null;
        }
        return C921703ix.LIZ(fragment);
    }
}
