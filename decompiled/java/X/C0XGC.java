package X;

import android.content.Context;
import android.database.Cursor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.account.oneclicklogin.OIDCToken;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0XGC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XGC {
    public static final C0XGC LIZ = new C0XGC();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0XGE());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C0XGD());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C0XGF());

    public static Context LIZIZ() {
        return (Context) LIZIZ.getValue();
    }

    public static void LIZ(String str) {
        IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
        if (iAccountLoginMethodsService != null && iAccountLoginMethodsService.LIZJ() && !iAccountLoginMethodsService.LJIILJJIL()) {
            return;
        }
        LIZIZ().getContentResolver().delete(UriProtector.parse(C786410Ut5.j4("content://%s.provider.onetaplogintoken", Arrays.copyOf(new Object[]{LIZJ.getValue()}, 1))), str, null);
    }

    public static OIDCToken LIZLLL(C0XO2 c0xo2) {
        String strOptString = c0xo2.LJJII.optString("id_token", "");
        String strOptString2 = c0xo2.LJJII.optString("id_token_id", "");
        String strOptString3 = c0xo2.LJJII.optString("oidc_device_secret", "");
        if (strOptString.length() != 0 && strOptString2.length() != 0 && strOptString3.length() != 0) {
            return new OIDCToken(strOptString, strOptString3, strOptString2);
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x0065
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.util.Map LJ(java.lang.String r14) {
        /*
            r0 = 2
            kotlin.Pair[] r5 = new kotlin.Pair[r0]
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "is_oidc_get_token"
            java.lang.String r0 = "1"
            r2.<init>(r1, r0)
            r6 = 0
            r5[r6] = r2
            java.lang.String r1 = "id_token_id"
            r4 = 1
            android.content.Context r0 = LIZIZ()     // Catch: java.lang.Exception -> L6d
            android.content.ContentResolver r7 = r0.getContentResolver()     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = "content://%s.provider.onetaplogintoken"
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L6d
            X.01GW r0 = X.C0XGC.LIZJ     // Catch: java.lang.Exception -> L6d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L6d
            r2[r6] = r0     // Catch: java.lang.Exception -> L6d
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r4)     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = X.C786410Ut5.j4(r3, r0)     // Catch: java.lang.Exception -> L6d
            android.net.Uri r8 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)     // Catch: java.lang.Exception -> L6d
            r9 = 0
            X.0WZX r13 = new X.0WZX     // Catch: java.lang.Exception -> L6d
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+7Zo2AySZ03EWaPixOia0tU1Km6x2euyaDCouSU/9N"
            r2 = 0
            r13.<init>(r0, r9)     // Catch: java.lang.Exception -> L6d
            r10 = r14
            r11 = r9
            r12 = r9
            android.database.Cursor r3 = X.C2204961BRm.LJJJ(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L6d
            if (r3 == 0) goto L71
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L59
            X.0XGC r0 = X.C0XGC.LIZ     // Catch: java.lang.Throwable -> L5d
            r0.getClass()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r2 = LIZJ(r3, r1)     // Catch: java.lang.Throwable -> L5d
            X.C2107108Nh.LIZ(r3, r9)     // Catch: java.lang.Exception -> L6d
            goto L73
        L59:
            X.C2107108Nh.LIZ(r3, r9)     // Catch: java.lang.Exception -> L6d
            goto L71
        L5d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L65
            throw r1     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            r2 = r1
            goto L66
        L65:
            r0 = move-exception
        L66:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L65
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Exception -> L6d
            throw r0     // Catch: java.lang.Exception -> L6d
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L71:
            java.lang.String r2 = ""
        L73:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "oidc_id_token_id"
            r1.<init>(r0, r2)
            r5[r4] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIJ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XGC.LJ(java.lang.String):java.util.Map");
    }

    public static String LIZJ(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex > -1) {
            return cursor.getString(columnIndex);
        }
        return "";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:55:0x0108
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJFF(X.C0XGC r15, java.lang.String r16, boolean r17, com.ss.android.ugc.aweme.account.oneclicklogin.OIDCToken r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function1 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XGC.LJFF(X.0XGC, java.lang.String, boolean, com.ss.android.ugc.aweme.account.oneclicklogin.OIDCToken, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, int):void");
    }
}
