package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response;
import java.io.File;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0pGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504890pGR {
    public static volatile NearbyRegionListV1Response LIZIZ;
    public static final C1504890pGR LIZ = new C1504890pGR();
    public static final Object LIZJ = new Object();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(817));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(274));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(275));

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response LIZIZ(java.lang.String r7) {
        /*
            X.01GW r3 = X.C1504890pGR.LIZLLL
            java.lang.Object r1 = r3.getValue()
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
            java.lang.String r0 = "nearby_cache_last_region"
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            r7 = 0
            if (r0 == 0) goto L99
            java.lang.Object r1 = r3.getValue()
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
            java.lang.String r0 = "nearby_cache_last_language"
            java.lang.String r1 = r1.getString(r0, r2)
            java.lang.Class<com.ss.android.ugc.aweme.main.service.ILanguageService> r2 = com.ss.android.ugc.aweme.main.service.ILanguageService.class
            r3 = 0
            r6 = 14
            r4 = r3
            r5 = r3
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.main.service.ILanguageService r0 = (com.ss.android.ugc.aweme.main.service.ILanguageService) r0
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.getAppLanguage()
        L36:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L99
            goto L3f
        L3d:
            r0 = r7
            goto L36
        L3f:
            X.01GW r0 = X.C1504890pGR.LJFF     // Catch: java.lang.Exception -> L94
            java.lang.Object r3 = r0.getValue()     // Catch: java.lang.Exception -> L94
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Exception -> L94
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L94
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L94
            X.0VSP r0 = new X.0VSP     // Catch: java.lang.Exception -> L94
            r0.<init>(r3)     // Catch: java.lang.Exception -> L94
            r2.<init>(r0, r1)     // Catch: java.lang.Exception -> L94
            boolean r0 = r2 instanceof java.io.BufferedReader     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L5a
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2     // Catch: java.lang.Exception -> L94
            goto L62
        L5a:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L94
            r0 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L94
            r2 = r1
        L62:
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()     // Catch: java.lang.Throwable -> L81
            com.google.gson.Gson r1 = r0.getGson()     // Catch: java.lang.Throwable -> L81
            java.lang.Class<com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response> r0 = com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response.class
            java.lang.Object r1 = r1.LJFF(r2, r0)     // Catch: java.lang.Throwable -> L81
            com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response r1 = (com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response) r1     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L7c
            java.util.List<com.ss.android.ugc.tiktok.location_api.service.LocationRegion> r0 = r1.allRegions     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L7c
            java.util.List<com.ss.android.ugc.tiktok.location_api.service.LocationRegion> r0 = r1.popularRegions     // Catch: java.lang.Throwable -> L81
            if (r0 != 0) goto L7d
        L7c:
            r1 = r7
        L7d:
            X.C2107108Nh.LIZ(r2, r7)     // Catch: java.lang.Exception -> L94
            return r1
        L81:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L88
            throw r1     // Catch: java.lang.Throwable -> L86
        L86:
            r0 = move-exception
            goto L8a
        L88:
            r0 = move-exception
            r1 = r7
        L8a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8e
            goto L90
        L8e:
            r0 = move-exception
            goto L8a
        L90:
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Exception -> L94
            throw r0     // Catch: java.lang.Exception -> L94
        L94:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r7
        L99:
            X.01GW r0 = X.C1504890pGR.LJFF
            java.lang.Object r0 = r0.getValue()
            java.io.File r0 = (java.io.File) r0
            r0.delete()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1504890pGR.LIZIZ(java.lang.String):com.ss.android.ugc.nearby.roaming.NearbyRegionListV1Response");
    }

    public static void LIZ(NearbyRegionListV1Response nearbyRegionListV1Response, String str) {
        synchronized (LIZJ) {
            try {
                if (nearbyRegionListV1Response == null) {
                    return;
                }
                try {
                    LIZ.getClass();
                    ((File) LJ.getValue()).mkdirs();
                    String strLJIILL = C7740030o.LIZ().getGson().LJIILL(nearbyRegionListV1Response);
                    if (!TextUtils.isEmpty(strLJIILL)) {
                        String appLanguage = null;
                        LIZIZ = null;
                        C09BH.LJIIIZ((File) LJFF.getValue(), strLJIILL, Charsets.UTF_8);
                        C01GW c01gw = LIZLLL;
                        ((Keva) c01gw.getValue()).storeString("nearby_cache_last_region", str);
                        ((Keva) c01gw.getValue()).storeLong("nearby_cache_save_time", System.currentTimeMillis());
                        Keva keva = (Keva) c01gw.getValue();
                        ILanguageService iLanguageService = (ILanguageService) PluggableExtentionKt.pluggableSpi$default(ILanguageService.class, false, false, false, 14, null);
                        if (iLanguageService != null) {
                            appLanguage = iLanguageService.getAppLanguage();
                        }
                        keva.storeString("nearby_cache_last_language", appLanguage);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
