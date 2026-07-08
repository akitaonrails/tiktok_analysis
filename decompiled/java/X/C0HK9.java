package X;

import android.graphics.RectF;
import com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HK9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl$start$1", f = "SocialAvatarCreationServiceImpl.kt", l = {104, 125, 126}, m = "invokeSuspend")
public final class C0HK9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ RectF LLILZ;
    public final /* synthetic */ SocialAvatarCreationServiceImpl LLILZIL;
    public final /* synthetic */ C0HHC LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HK9(String str, float f, RectF rectF, SocialAvatarCreationServiceImpl socialAvatarCreationServiceImpl, C0HHC c0hhc, InterfaceC1364105Vn<? super C0HK9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = f;
        this.LLILZ = rectF;
        this.LLILZIL = socialAvatarCreationServiceImpl;
        this.LLILZLL = c0hhc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HK9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r12 = r20
            java.lang.String r7 = "SocialAvatarCreationServiceImpl@40e4.start$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            r6 = r19
            int r0 = r6.LL
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 == r2) goto L36
            if (r0 == r3) goto L84
            if (r0 != r4) goto L9f
            X.C155000ia.LIZIZ(r12)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L23:
            X.C155000ia.LIZIZ(r12)
            X.0HLI r1 = X.C0HLI.LIZ
            java.lang.String r0 = r6.LLILLJJLI
            r6.LL = r2
            java.lang.Object r12 = r1.LIZJ(r0, r6)
            if (r12 != r5) goto L39
            X.C1C7U.LIZIZ(r7)
            return r5
        L36:
            X.C155000ia.LIZIZ(r12)
        L39:
            java.lang.String r12 = (java.lang.String) r12
            com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData r8 = new com.ss.android.ugc.aweme.socialavatar.view.v2.SocialAvatarGenerateData
            X.0HKn r9 = X.EnumC439310HKn.METHOD_UPLOAD
            float r10 = r6.LLILLL
            java.lang.String r11 = r6.LLILLJJLI
            android.graphics.RectF r13 = r6.LLILZ
            r14 = 0
            r17 = 7
            r18 = 256(0x100, float:3.59E-43)
            r15 = r14
            r16 = r14
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl r1 = r6.LLILZIL
            X.0HHC r0 = r6.LLILZLL
            r1.getClass()
            X.0HL8 r0 = com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl.LJIIIIZZ(r0)
            r1.LJI(r8, r0)
            com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl r0 = r6.LLILZIL
            com.ss.android.ugc.aweme.socialavatar.api.SocialAvatarFastFlowService r1 = r0.LIZLLL()
            com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl r0 = r6.LLILZIL
            r0.getClass()
            java.lang.String r0 = com.ss.android.ugc.aweme.socialavatar.SocialAvatarCreationServiceImpl.LJ()
            X.05YD r2 = r1.LIZIZ(r0)
            X.0IDq r1 = new X.0IDq
            r0 = 37
            r1.<init>(r2, r0)
            r6.LL = r3
            java.lang.Object r0 = X.C09IC.LJIIZILJ(r1, r6)
            if (r0 != r5) goto L87
            X.C1C7U.LIZIZ(r7)
            return r5
        L84:
            X.C155000ia.LIZIZ(r12)
        L87:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0HEf r2 = new X.0HEf
            X.0HHC r1 = r6.LLILZLL
            r0 = 0
            r2.<init>(r1, r0)
            r6.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r6, r3, r2)
            if (r0 != r5) goto L1d
            X.C1C7U.LIZIZ(r7)
            return r5
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HK9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
