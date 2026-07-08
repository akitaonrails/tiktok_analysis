package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11bC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aicaption.AICaptionComponent$startGenerateAICaption$2", f = "AICaptionComponent.kt", l = {442, 446, 465}, m = "invokeSuspend")
public final class C19531211bC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AbstractC19531111bB LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ AbstractC19531111bB<API_COMPONENT> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19531211bC(AbstractC19531111bB<API_COMPONENT> abstractC19531111bB, InterfaceC1364105Vn<? super C19531211bC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = abstractC19531111bB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19531211bC c19531211bC = new C19531211bC(this.LLILZ, interfaceC1364105Vn);
        c19531211bC.LLILLL = obj;
        return c19531211bC;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0089 A[LOOP:0: B:30:0x0083->B:32:0x0089, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ca  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19531211bC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
