package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.draft.EffectDraftDetailModel$loadDraft$1", f = "EffectDraftDetailModel.kt", l = {52, 56, 59}, m = "invokeSuspend")
public final class C316090CaF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C316080CaE LLILLL;
    public final /* synthetic */ Function1<C1165704hD, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C316090CaF(C316080CaE c316080CaE, Function1<? super C1165704hD, Unit> function1, InterfaceC1364105Vn<? super C316090CaF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c316080CaE;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C316090CaF c316090CaF = new C316090CaF(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c316090CaF.LLILLJJLI = obj;
        return c316090CaF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (X.C0C64.LJIILLIIL().LJIIIZ(31744, "is_effect_draft_detail_cache_enabled", true, false) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0189  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316090CaF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
