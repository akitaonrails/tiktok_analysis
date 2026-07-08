package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lhx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.generate.component.AIPortraitGenerationLogicComponent$uploadPhotoAndSubmitWorkflow$1", f = "AIPortraitGenerationLogicComponent.kt", l = {185}, m = "invokeSuspend")
public final class C550190Lhx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C550110Lhp LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550190Lhx(String str, C550110Lhp c550110Lhp, InterfaceC1364105Vn<? super C550190Lhx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c550110Lhp;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C550190Lhx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e A[PHI: r12
      0x006e: PHI (r12v3 com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult) = 
      (r12v1 com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult)
      (r12v5 com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult)
      (r12v5 com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult)
      (r12v5 com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult)
      (r12v5 com.ss.android.ugc.aweme.portrait.model.AIPortraitImageUploadResult)
     binds: [B:29:0x006d, B:7:0x0016, B:9:0x001b, B:11:0x0025, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C550190Lhx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
