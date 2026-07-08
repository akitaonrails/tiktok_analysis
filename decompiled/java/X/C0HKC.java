package X;

import com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl;
import com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl$performUploadProcessInBackground$2$2", f = "SocialAvatarCreationServiceImpl.kt", l = {275}, m = "invokeSuspend")
public final class C0HKC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarCreationServiceImpl LLILLJJLI;
    public final /* synthetic */ C0HL8 LLILLL;
    public final /* synthetic */ SocialAvatarGenerateData LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HKC(SocialAvatarCreationServiceImpl socialAvatarCreationServiceImpl, C0HL8 c0hl8, SocialAvatarGenerateData socialAvatarGenerateData, InterfaceC1364105Vn<? super C0HKC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarCreationServiceImpl;
        this.LLILLL = c0hl8;
        this.LLILZ = socialAvatarGenerateData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HKC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[PHI: r5
      0x002a: PHI (r5v5 boolean) = (r5v1 boolean), (r5v0 boolean) binds: [B:27:0x0094, B:11:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[PHI: r5
      0x0097: PHI (r5v2 boolean) = (r5v1 boolean), (r5v5 boolean) binds: [B:27:0x0094, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r4 = r24
            java.lang.String r12 = "SocialAvatarCreationServiceImpl@40e4.performUploadProcessInBackground$2$2"
            X.C1C7U.LIZ(r12)
            java.lang.Object r2 = X.C099R.LJFF()
            r3 = r23
            int r0 = r3.LL
            r5 = 1
            if (r0 == 0) goto L9a
            if (r0 != r5) goto Lb5
            X.C155000ia.LIZIZ(r4)
        L17:
            com.ss.android.ugc.ur.socialavatar.SocialAvatarQueueStatusResult r4 = (com.ss.android.ugc.ur.socialavatar.SocialAvatarQueueStatusResult) r4
            r10 = 0
            r7 = 0
            if (r4 == 0) goto L93
            java.lang.Long r0 = r4.queueWaitTime
            if (r0 == 0) goto L93
            long r1 = r0.longValue()
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L93
        L2a:
            java.lang.Long r0 = r4.queueWaitTime
            if (r0 == 0) goto L97
            long r0 = r0.longValue()
        L32:
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r8
            if (r4 == 0) goto L3f
            java.lang.Long r2 = r4.avgTaskTime
            if (r2 == 0) goto L3f
            long r10 = r2.longValue()
        L3f:
            java.lang.Long.signum(r10)
            long r10 = r10 * r8
            long r0 = r0 + r10
            com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl r2 = r3.LLILLJJLI
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService r8 = r2.LIZJ()
            com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl r2 = r3.LLILLJJLI
            r2.getClass()
            java.lang.String r6 = com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl.LJ()
            X.0HJa r13 = new X.0HJa
            r14 = -4
            r15 = 0
            r17 = 0
            X.0HJe r2 = new X.0HJe
            r2.<init>(r7, r5, r0)
            r22 = 190(0xbe, float:2.66E-43)
            r16 = r15
            r18 = r15
            r19 = r15
            r20 = r2
            r21 = r15
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r8.LIZJ(r6, r13)
            X.0HLd r2 = X.C439470HLd.LIZ
            X.0HL8 r1 = r3.LLILLL
            java.lang.String r5 = r1.LIZIZ
            java.lang.String r6 = r1.LIZ
            com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData r0 = r3.LLILZ
            X.0HKn r7 = r0.creationMethod
            java.lang.Boolean r8 = r1.LIZJ
            if (r4 == 0) goto L91
            java.lang.Long r15 = r4.queueWaitTime
            java.lang.Long r10 = r4.avgTaskTime
        L84:
            r2.getClass()
            r9 = r15
            X.C439470HLd.LIZIZ(r5, r6, r7, r8, r9, r10)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r12)
            return r0
        L91:
            r10 = r15
            goto L84
        L93:
            r5 = 0
            if (r4 == 0) goto L97
            goto L2a
        L97:
            r0 = 0
            goto L32
        L9a:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.ur.socialavatar.ISocialAvatarService> r0 = com.ss.android.ugc.ur.socialavatar.ISocialAvatarService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r0 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarService) r0
            r3.LL = r5
            java.lang.Object r4 = r0.LJI(r3)
            if (r4 != r2) goto L17
            X.C1C7U.LIZIZ(r12)
            return r2
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HKC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
