package X;

import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.videopublish.PoiPublishExtensionVM;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0hJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1199410hJj implements InterfaceC1199830hKP {
    public final /* synthetic */ C1199440hJm LL;

    @Override // X.InterfaceC1199830hKP
    public final void LJJIJIIJI() {
        C099G c099g = this.LL.LLILLL;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        this.LL.LL = System.currentTimeMillis();
        C1199440hJm c1199440hJm = this.LL;
        c1199440hJm.LLILLJJLI = 0L;
        c1199440hJm.LLILLL = C23250099c.LIZIZ(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1199300hJY(null), 3);
    }

    @Override // X.InterfaceC1199830hKP
    public final void LJJJI() {
        C099G c099g = this.LL.LLILLL;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
    }

    public C1199410hJj(C1199440hJm c1199440hJm) {
        this.LL = c1199440hJm;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    @Override // X.InterfaceC1199830hKP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLZIJ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1199430hJl
            if (r0 == 0) goto L86
            r4 = r9
            X.0hJl r4 = (X.C1199430hJl) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L86
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r7 = 1
            if (r0 == 0) goto L70
            if (r0 != r7) goto L8c
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PopupEnableResponse r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PopupEnableResponse) r1
            long r4 = java.lang.System.currentTimeMillis()
            if (r1 == 0) goto L6e
            int r0 = r1.popupRes
            if (r0 != r7) goto L6e
        L2e:
            X.0hJo r6 = X.C1199460hJo.LIZ
            X.0hJn r3 = new X.0hJn
            java.lang.String r2 = "video_post_page"
            r3.<init>(r2)
            java.lang.String r0 = "data_parse"
            r3.LIZLLL = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            r3.LIZ(r0)
            r4 = 2
            r3.LIZIZ(r4)
            r6.getClass()
            X.C1199460hJo.LIZ(r3)
            X.0hJn r6 = new X.0hJn
            r6.<init>(r2)
            java.lang.String r0 = "network_and_data_parse"
            r6.LIZLLL = r0
            long r2 = java.lang.System.currentTimeMillis()
            X.0hJm r0 = r8.LL
            long r0 = r0.LL
            long r2 = r2 - r0
            r6.LIZ(r2)
            r6.LIZIZ(r4)
            X.C1199460hJo.LIZ(r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L6e:
            r7 = 0
            goto L2e
        L70:
            X.C155000ia.LIZIZ(r1)
            X.0hJk r2 = new X.0hJk
            X.0hJm r1 = r8.LL
            r0 = 0
            r2.<init>(r1, r0)
            r4.LLILLL = r7
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r1 = X.C099A.LIZJ(r0, r2, r4)
            if (r1 != r3) goto L22
            return r3
        L86:
            X.0hJl r4 = new X.0hJl
            r4.<init>(r8, r9)
            goto L12
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1199410hJj.LJJJLZIJ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1199830hKP
    public final void LLLZZIL(PoiPublishExtensionVM.PoiBDLocationCallbackProxy poiBDLocationCallbackProxy) {
        CertProviderManagerKt.findCert("bpea-poi_publish_extension_fetcher_location", 1476395008, "mttu");
        try {
            C1207450hWh c1207450hWh = C1207450hWh.LIZ;
            TokenCert.Companion companion = TokenCert.Companion;
            TokenCert tokenCertWith = companion.with("bpea-poi_publish_extension_fetcher_location");
            tokenCertWith.auth("mttu");
            TokenCert tokenCertWith2 = companion.with("bpea-poi_publish_extension_fetcher_location_decrypt");
            tokenCertWith2.auth("mckd");
            c1207450hWh.LJIIL("poi", "add_location", tokenCertWith, tokenCertWith2, poiBDLocationCallbackProxy, -1L);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }

    @Override // X.InterfaceC1199830hKP
    public final void b0(double d, double d2, List list, boolean z, long j, C1199810hKN c1199810hKN, String str, Map map, InterfaceC497601wk interfaceC497601wk, String str2, List list2, String str3, String str4, boolean z2) {
        Boolean boolValueOf;
        Boolean bool;
        String str5;
        boolean z3;
        String str6 = str4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("latitude = ");
        sbLIZ.append(d);
        sbLIZ.append(",longitude = ");
        sbLIZ.append(d2);
        C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zLIZ = C297510BlN.LIZ();
        if (map != null && (str5 = (String) map.get("retag_enter_method")) != null) {
            if (str5.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolValueOf = Boolean.valueOf(z3);
        } else {
            boolValueOf = null;
        }
        if (!C1189060h32.LJIILJJIL(boolValueOf)) {
            str6 = null;
        }
        String strLJJIIJZLJL = C1189060h32.LJJIIJZLJL(map);
        if (zLIZ) {
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1199190hJN(c1199810hKN, interfaceC497601wk, jCurrentTimeMillis, str3, new C1199140hJI(d2, d, list, 0L, null, "RECOMMEND", 20L, 0L, z, j, str6, str, null, null, null, strLJJIIJZLJL, str2, list2, Boolean.valueOf(zLIZ), bool, null, null, null, null, null, -2087854152, 31), z2, null), 3);
    }
}
