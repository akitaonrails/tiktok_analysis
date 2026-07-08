package X;

import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2$performUploadProcessInBackground$3$1", f = "SocialAvatarCreationViewModelV2.kt", l = {250}, m = "invokeSuspend")
public final class C439430HKz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarCreationViewModelV2 LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C439430HKz(SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2, Boolean bool, InterfaceC1364105Vn<? super C439430HKz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarCreationViewModelV2;
        this.LLILLL = bool;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C439430HKz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098 A[PHI: r8
      0x0098: PHI (r8v1 boolean) = (r8v0 boolean), (r8v3 boolean) binds: [B:31:0x0095, B:14:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r11 = "SocialAvatarCreationViewModelV2@c606.performUploadProcessInBackground$3$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r12.LL
            r4 = 1
            if (r0 == 0) goto L9b
            if (r0 != r4) goto Lb6
            X.C155000ia.LIZIZ(r13)
        L13:
            com.ss.android.ugc.ur.socialavatar.SocialAvatarQueueStatusResult r13 = (com.ss.android.ugc.ur.socialavatar.SocialAvatarQueueStatusResult) r13
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "SocialAvatarCreationViewModelV2 choose photo async update get queueStatus as "
            r1.append(r0)
            r1.append(r13)
            X.C2188811AlT.LIZIZ(r1)
            r9 = 0
            r7 = 0
            if (r13 == 0) goto L94
            java.lang.Long r0 = r13.queueWaitTime
            if (r0 == 0) goto L94
            long r1 = r0.longValue()
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L94
            r8 = 1
        L36:
            java.lang.Long r0 = r13.queueWaitTime
            if (r0 == 0) goto L98
            long r1 = r0.longValue()
        L3e:
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r5
            if (r13 == 0) goto L4b
            java.lang.Long r0 = r13.avgTaskTime
            if (r0 == 0) goto L4b
            long r9 = r0.longValue()
        L4b:
            java.lang.Long.signum(r9)
            long r9 = r9 * r5
            long r1 = r1 + r9
            com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2 r0 = r12.LLILLJJLI
            kotlin.jvm.internal.AwS585S0100000_6 r3 = r0.LLJL
            X.0HJe r0 = new X.0HJe
            r0.<init>(r7, r8, r1)
            r3.invoke(r0)
            com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2 r0 = r12.LLILLJJLI
            X.1DDq r5 = r0.LLJIJIL
        L60:
            java.lang.Object r3 = r5.getValue()
            r0 = r3
            X.0HL5 r0 = (X.C0HL5) r0
            r7 = 0
            X.0HL5 r0 = X.C0HL5.LIZ(r0, r7, r1, r4)
            boolean r0 = r5.compareAndSet(r3, r0)
            if (r0 == 0) goto L60
            X.0HLd r1 = X.C439470HLd.LIZ
            com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2 r0 = r12.LLILLJJLI
            X.0HL8 r0 = r0.LLJLLL
            java.lang.String r2 = r0.LIZIZ
            java.lang.String r3 = r0.LIZ
            X.0HKn r4 = X.EnumC439310HKn.METHOD_UPLOAD
            java.lang.Boolean r5 = r12.LLILLL
            if (r13 == 0) goto L92
            java.lang.Long r6 = r13.queueWaitTime
            java.lang.Long r7 = r13.avgTaskTime
        L86:
            r1.getClass()
            X.C439470HLd.LIZIZ(r2, r3, r4, r5, r6, r7)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L92:
            r6 = r7
            goto L86
        L94:
            r8 = 0
            if (r13 == 0) goto L98
            goto L36
        L98:
            r1 = 0
            goto L3e
        L9b:
            X.C155000ia.LIZIZ(r13)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.ur.socialavatar.ISocialAvatarService> r0 = com.ss.android.ugc.ur.socialavatar.ISocialAvatarService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r0 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarService) r0
            r12.LL = r4
            java.lang.Object r13 = r0.LJI(r12)
            if (r13 != r2) goto L13
            X.C1C7U.LIZIZ(r11)
            return r2
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C439430HKz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
