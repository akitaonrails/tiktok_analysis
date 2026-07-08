package X;

import com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3$requestBannerList$2", f = "SearchCSIProfilerBannerAPIV3.kt", l = {91}, m = "invokeSuspend")
public final class C2158708cz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SearchCSIProfilerBannerAPIV3.BannerListResponseV3>, Object> {
    public int LL;
    public final /* synthetic */ C2158908d1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2158708cz(C2158908d1 c2158908d1, InterfaceC1364105Vn<? super C2158708cz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2158908d1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2158708cz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SearchCSIProfilerBannerAPIV3@a933.requestBannerList$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L1a
            if (r0 != r4) goto L12
            goto L43
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r8)
            X.01GW r0 = com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3.LIZIZ     // Catch: java.lang.Exception -> L79
            java.lang.Object r2 = r0.getValue()     // Catch: java.lang.Exception -> L79
            com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3$API r2 = (com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3.API) r2     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L41
            X.01GW r0 = com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3.LIZ     // Catch: java.lang.Exception -> L79
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Exception -> L79
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L79
            X.08d1 r0 = r7.LLILLJJLI     // Catch: java.lang.Exception -> L79
            java.util.Map r0 = r0.LIZ()     // Catch: java.lang.Exception -> L79
            r7.LL = r4     // Catch: java.lang.Exception -> L79
            java.lang.Object r8 = r2.bannerListV3(r1, r0, r7)     // Catch: java.lang.Exception -> L79
            if (r8 != r5) goto L46
            X.C1C7U.LIZIZ(r6)
            return r5
        L41:
            r8 = r3
            goto L48
        L43:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L79
        L46:
            com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3$BannerListResponseV3 r8 = (com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3.BannerListResponseV3) r8     // Catch: java.lang.Exception -> L79
        L48:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = "requestBannerList response: bannerCount="
            r1.append(r0)     // Catch: java.lang.Exception -> L79
            if (r8 == 0) goto L54
            goto L56
        L54:
            r0 = r3
            goto L62
        L56:
            java.util.List<com.ss.android.ugc.aweme.search.csi.profile.api.SearchCSIProfilerBannerAPIV3$BannerItemV3> r0 = r8.multiBannerDisplayInfo     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L54
            int r0 = r0.size()     // Catch: java.lang.Exception -> L79
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L79
        L62:
            r1.append(r0)     // Catch: java.lang.Exception -> L79
            java.lang.String r0 = ", cacheExpiryTimestamp="
            r1.append(r0)     // Catch: java.lang.Exception -> L79
            if (r8 == 0) goto L6d
            goto L6f
        L6d:
            r0 = r3
            goto L71
        L6f:
            java.lang.Long r0 = r8.cacheExpiryTimestamp     // Catch: java.lang.Exception -> L79
        L71:
            r1.append(r0)     // Catch: java.lang.Exception -> L79
            X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Exception -> L79
            r3 = r8
            goto L7d
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L7d:
            X.C1C7U.LIZIZ(r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2158708cz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SearchCSIProfilerBannerAPIV3.BannerListResponseV3> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
