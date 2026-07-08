package X;

import com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iuM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.phototopicbanner.PhotoTopicBannersRepository$updateBanner$1", f = "PhotoTopicBannersRepository.kt", l = {77}, m = "invokeSuspend")
public final class C1260560iuM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ PhotoTopicBannerReadStatus LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ Long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260560iuM(String str, PhotoTopicBannerReadStatus photoTopicBannerReadStatus, Integer num, Long l, InterfaceC1364105Vn<? super C1260560iuM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = photoTopicBannerReadStatus;
        this.LLILZIL = num;
        this.LLILZLL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1260560iuM c1260560iuM = new C1260560iuM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1260560iuM.LLILLJJLI = obj;
        return c1260560iuM;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "PhotoTopicBannersRepository@910e.updateBanner$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r13.LL
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 != r3) goto L11
            goto L63
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r14)
            java.lang.String r8 = r13.LLILLL
            com.ss.android.ugc.aweme.model.PhotoTopicBannerReadStatus r5 = r13.LLILZ
            java.lang.Integer r2 = r13.LLILZIL
            java.lang.Long r11 = r13.LLILZLL
            X.0iuP r0 = com.ss.android.ugc.aweme.phototopicbanner.PhotoTopicBannerApi.LIZ     // Catch: java.lang.Throwable -> L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6c
            X.01GW<com.ss.android.ugc.aweme.phototopicbanner.PhotoTopicBannerApi> r0 = X.C1260590iuP.LIZIZ     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L6c
            com.ss.android.ugc.aweme.phototopicbanner.PhotoTopicBannerApi r1 = (com.ss.android.ugc.aweme.phototopicbanner.PhotoTopicBannerApi) r1     // Catch: java.lang.Throwable -> L6c
            com.ss.android.ugc.aweme.model.UpdatePhotoTopicBannerRequest r7 = new com.ss.android.ugc.aweme.model.UpdatePhotoTopicBannerRequest     // Catch: java.lang.Throwable -> L6c
            r10 = 0
            if (r8 != 0) goto L42
            com.ss.android.ugc.aweme.model.BannerDisplayInfo r0 = X.C1260550iuL.LIZLLL     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L3d
            java.lang.String r8 = r0.trendId     // Catch: java.lang.Throwable -> L6c
            goto L3e
        L3d:
            r8 = r10
        L3e:
            if (r8 != 0) goto L42
            java.lang.String r8 = ""
        L42:
            int r0 = r5.getValue()     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r9 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Throwable -> L6c
            if (r2 != 0) goto L52
            com.ss.android.ugc.aweme.model.BannerDisplayInfo r0 = X.C1260550iuL.LIZLLL     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L53
            java.lang.Integer r2 = r0.category     // Catch: java.lang.Throwable -> L6c
        L52:
            r10 = r2
        L53:
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L6c
            r13.LL = r3     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r14 = r1.updatePhotoTopicBanner(r7, r13)     // Catch: java.lang.Throwable -> L6c
            if (r14 != r4) goto L66
            X.C1C7U.LIZIZ(r6)
            return r4
        L63:
            X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Throwable -> L6c
        L66:
            com.ss.android.ugc.aweme.model.PhotoTopicBannerResponse r14 = (com.ss.android.ugc.aweme.model.PhotoTopicBannerResponse) r14     // Catch: java.lang.Throwable -> L6c
            X.C189200o6.m2constructorimpl(r14)     // Catch: java.lang.Throwable -> L6c
            goto L78
        L6c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L78:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1260560iuM.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
