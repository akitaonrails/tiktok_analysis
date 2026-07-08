package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiofflineeffect.AiOfflineEffectContentResourceResolver$resolve$1$1", f = "AiOfflineEffectContentResourceResolver.kt", l = {56, 70}, m = "invokeSuspend")
public final class C535760Kzm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C535020Kya LLILLJJLI;
    public final /* synthetic */ C0LPJ LLILLL;
    public final /* synthetic */ InterfaceC2329309At<C535020Kya> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535760Kzm(C535020Kya c535020Kya, C0LPJ c0lpj, InterfaceC2329309At<C535020Kya> interfaceC2329309At, InterfaceC1364105Vn<? super C535760Kzm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c535020Kya;
        this.LLILLL = c0lpj;
        this.LLILZ = interfaceC2329309At;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535760Kzm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C535760Kzm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
