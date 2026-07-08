package X;

import webcast.api.anchor_tool.EffectBeautySuggestionResponse;

/* JADX INFO: renamed from: X.0U7c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel$fetchAiBeautyUntilEnd$1$4", f = "LiveSmallItemBeautyViewModel.kt", l = {364, 377, 395, 423, 449}, m = "emit")
public final class C767060U7c extends AbstractC23140094w {
    public EffectBeautySuggestionResponse.ResponseData LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0U7W<T> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C767060U7c(C0U7W<? super T> c0u7w, InterfaceC1364105Vn<? super C767060U7c> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0u7w;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type X.05Vn to X.0U7c for r3v1 'this'  X.05Vn
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.String r2 = "LiveSmallItemBeautyViewModel@ff2.fetchAiBeautyUntilEnd$1$4$emit$1"
            X.C1C7U.LIZ(r2)
            r3.LLILLJJLI = r4
            int r1 = r3.LLILZ
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 | r0
            r3.LLILZ = r1
            X.0U7W<T> r1 = r3.LLILLL
            r0 = 0
            java.lang.Object r0 = r1.LIZ(r0, r3)
            X.C1C7U.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C767060U7c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
