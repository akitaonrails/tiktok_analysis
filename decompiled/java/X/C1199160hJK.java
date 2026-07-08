package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.experiment.PoiExpandScopeMetaDataExp;
import com.ss.android.ugc.aweme.poi.model.PoiSearchRequestBody;
import com.ss.android.ugc.aweme.poi_api.experiment.PoiEnableExperiment;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hJK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199160hJK {
    public static final /* synthetic */ C1199160hJK LIZ = new C1199160hJK();

    public static String LIZJ(long j) {
        C844470XAv.LIZ.getClass();
        return C2084808Es.LIZ(String.valueOf(C844470XAv.LJIIJ) + PoiEnableExperiment.LIZIZ() + j);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PopupEnableResponse> r8) {
        /*
            r7 = this;
            r0 = 137723(0x219fb, float:1.92991E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r8 instanceof X.C1199290hJX
            if (r0 == 0) goto L34
            r5 = r8
            X.0hJX r5 = (X.C1199290hJX) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r5.LLILLL = r2
        L19:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L62
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r6 == 0) goto L33
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L33:
            throw r1
        L34:
            X.0hJX r5 = new X.0hJX
            r5.<init>(r7, r8)
            goto L19
        L3a:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r1 = com.ss.android.ugc.aweme.app.api.Api.LIZ     // Catch: java.lang.Throwable -> L6b
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = X.C09S2.LIZLLL()     // Catch: java.lang.Throwable -> L6b
            X.011f r1 = r0.LIZ(r1)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L58
            java.lang.Class<com.ss.android.ugc.aweme.poi.api.PoiSearchApi> r0 = com.ss.android.ugc.aweme.poi.api.PoiSearchApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Throwable -> L6b
        L4f:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi r0 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi) r0     // Catch: java.lang.Throwable -> L6b
            r5.LLILLL = r2     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r0.LIZLLL(r5)     // Catch: java.lang.Throwable -> L6b
            goto L5a
        L58:
            r0 = r3
            goto L4f
        L5a:
            if (r1 != r4) goto L65
            if (r6 == 0) goto L61
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L61:
            return r4
        L62:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6b
        L65:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PopupEnableResponse r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PopupEnableResponse) r1     // Catch: java.lang.Throwable -> L6b
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L6b
            goto L77
        L6b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L77:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L7e
            r3 = r1
        L7e:
            if (r6 == 0) goto L83
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199160hJK.LJ(X.05Vn):java.lang.Object");
    }

    public static PoiSearchRequestBody LIZIZ(long j, C1199140hJI c1199140hJI, String str) {
        C1199590hK1 c1199590hK1LIZIZ;
        Boolean bool;
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generateRequestBody poiSearchQuery = ");
        sbLIZ.append(c1199140hJI.LJJI);
        C2188811AlT.LIZIZ(sbLIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            double d = c1199140hJI.LIZIZ;
            double d2 = c1199140hJI.LIZ;
            TokenCert tokenCertWith = TokenCert.Companion.with("bpea-poi_search_encrypt_location_data");
            tokenCertWith.auth("hyqv");
            c1199590hK1LIZIZ = C839940WxE.LIZIZ(d, d2, tokenCertWith);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1199590hK1LIZIZ = null;
        }
        if (c1199590hK1LIZIZ != null && !C305410By7.LIZ) {
            linkedHashMap.put("encrypt_location", c1199590hK1LIZIZ.LIZIZ + ',' + c1199590hK1LIZIZ.LIZ);
        } else {
            linkedHashMap.put("encrypt_location", "");
        }
        String str2 = c1199140hJI.LJ;
        if (str2 != null) {
            linkedHashMap.put("keywords", str2);
        }
        PoiExpandScopeMetaDataExp.LIZ.getClass();
        if (PoiExpandScopeMetaDataExp.LIZ()) {
            linkedHashMap.put("encrypt_meta_location", C1279604za.LIZ(c1199140hJI.LIZJ));
        }
        C1186030gy9.LIZ(new AwS562S0100000_18(linkedHashMap, (Map<String, Object>) 870));
        String strLIZ = C2088308Gb.LIZ(C2365509Or.LJ(linkedHashMap));
        String strJ3 = c1199140hJI.LJIILL;
        if (strJ3 == null) {
            strJ3 = null;
        } else if (!Intrinsics.LJFF(str, "/tiktok/poi/api/searchrecall")) {
            if (Intrinsics.LJFF(str, "/tiktok/poi/api/place/recommend")) {
                try {
                    JSONObject jSONObject = new JSONObject(strJ3);
                    C1197910hHJ.LIZJ(jSONObject, jSONObject);
                    strJ3 = C786410Ut5.J3(jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("handleClientExtraData error: ");
                    sbLIZ2.append(e.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(strJ3);
                    jSONObject2.remove("retag_enter_method");
                    jSONObject2.remove("post_after_days");
                    strJ3 = C786410Ut5.J3(jSONObject2);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("handleClientExtraData error: ");
                    sbLIZ3.append(e2.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
        }
        if (Intrinsics.LJFF(str, "/tiktok/poi/api/place/recommend")) {
            bool = c1199140hJI.LJIJI;
        } else {
            bool = null;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("generateRequestBody poiSearchQuery = ");
        sbLIZ4.append(c1199140hJI.LJJI);
        C2188811AlT.LIZIZ(sbLIZ4);
        C1367960lha.LIZ.getClass();
        String strLIZIZ = C1367960lha.LIZIZ();
        String appLanguage = ((IAVSettingService) ServiceManager.get().getService(IAVSettingService.class)).getAppLanguage();
        String str3 = c1199140hJI.LJFF;
        long j2 = c1199140hJI.LIZLLL;
        long j3 = c1199140hJI.LJI;
        if (j3 <= 0) {
            j3 = 20;
        }
        long j4 = c1199140hJI.LJII;
        if (j4 <= 0) {
            j4 = 1;
        }
        C844470XAv.LIZ.getClass();
        int i = C844470XAv.LJIIJ;
        String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
        String strValueOf = String.valueOf(C844470XAv.LJ());
        boolean z = c1199140hJI.LJIIIIZZ;
        String strLIZ2 = C292490BdH.LIZ();
        long j5 = c1199140hJI.LJIIIZ;
        if (j5 > 0) {
            lValueOf = Long.valueOf(j5);
        } else {
            lValueOf = null;
        }
        return new PoiSearchRequestBody(strLIZIZ, appLanguage, str3, j2, j3, j4, 0, i, strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId, strValueOf, "1.2.0-rc.5", j, z ? 1 : 0, 0, 4, strLIZ2, strLIZ, lValueOf, c1199140hJI.LJIIJ, c1199140hJI.LJIIJJI, c1199140hJI.LJIIL, c1199140hJI.LJIILIIL, c1199140hJI.LJIILJJIL, strJ3, c1199140hJI.LJIILLIIL, c1199140hJI.LJIIZILJ, c1199140hJI.LJIJ, bool, c1199140hJI.LJIJJ, c1199140hJI.LJJI);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x022f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C1199140hJI r24, java.lang.String r25, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiSearchResultWrapper> r26) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199160hJK.LIZ(X.0hJI, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r8, com.ss.android.ugc.aweme.poi.PoiData r9, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiReTagResponse> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1199250hJT
            if (r0 == 0) goto L21
            r4 = r10
            X.0hJT r4 = (X.C1199250hJT) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto L70
        L21:
            X.0hJT r4 = new X.0hJT
            r4.<init>(r7, r10)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r1 = com.ss.android.ugc.aweme.app.api.Api.LIZ     // Catch: java.lang.Throwable -> L79
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r0 = X.C09S2.LIZLLL()     // Catch: java.lang.Throwable -> L79
            X.011f r1 = r0.LIZ(r1)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L6d
            java.lang.Class<com.ss.android.ugc.aweme.poi.api.PoiSearchApi> r0 = com.ss.android.ugc.aweme.poi.api.PoiSearchApi.class
            java.lang.Object r2 = r1.create(r0)     // Catch: java.lang.Throwable -> L79
        L44:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi r2 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi) r2     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = r9.poiId     // Catch: java.lang.Throwable -> L79
            X.0hJK r0 = X.C1199160hJK.LIZ     // Catch: java.lang.Throwable -> L79
            r0.getClass()     // Catch: java.lang.Throwable -> L79
            X.0lha r0 = X.C1367960lha.LIZ     // Catch: java.lang.Throwable -> L79
            r0.getClass()     // Catch: java.lang.Throwable -> L79
            com.ss.android.ugc.aweme.poi_api.service.IPoiService r0 = X.C1367960lha.LIZ()     // Catch: java.lang.Throwable -> L79
            com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo r0 = r0.LJZ(r9)     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L62
            java.lang.String r0 = X.C08JS.LIZLLL(r0)     // Catch: java.lang.Throwable -> L79
            if (r0 != 0) goto L64
        L62:
            java.lang.String r0 = ""
        L64:
            r4.LLILLL = r3     // Catch: java.lang.Throwable -> L79
            java.lang.Object r1 = r2.LIZJ(r8, r1, r0, r4)     // Catch: java.lang.Throwable -> L79
            if (r1 != r5) goto L73
            goto L6f
        L6d:
            r2 = r6
            goto L44
        L6f:
            return r5
        L70:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L79
        L73:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PoiReTagResponse r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiReTagResponse) r1     // Catch: java.lang.Throwable -> L79
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L79
            goto L85
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L85:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L8c
            return r1
        L8c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199160hJK.LIZLLL(java.lang.String, com.ss.android.ugc.aweme.poi.PoiData, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C1199140hJI r6, java.lang.String r7, X.InterfaceC1364105Vn r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C1199260hJU
            if (r0 == 0) goto L20
            r4 = r8
            X.0hJU r4 = (X.C1199260hJU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            goto L26
        L20:
            X.0hJU r4 = new X.0hJU
            r4.<init>(r5, r8)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L3f
            return r3
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L3f
            java.lang.Object r3 = r5.LIZ(r6, r7, r4)     // Catch: java.lang.Exception -> L3f
            if (r3 != r2) goto L3e
            return r2
        L3e:
            return r3
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199160hJK.LJI(X.0hJI, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C1199140hJI r19, java.lang.Long r20, boolean r21, X.InterfaceC1364105Vn r22) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199160hJK.LJFF(X.0hJI, java.lang.Long, boolean, X.05Vn):java.lang.Object");
    }
}
