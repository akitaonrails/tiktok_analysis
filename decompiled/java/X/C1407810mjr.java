package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS601S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0mjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.titlebar.component.AiChatTitleBarFeatureComponent$initData$1", f = "AiChatTitleBarFeatureComponent.kt", l = {69}, m = "invokeSuspend")
public final class C1407810mjr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1408150mkP LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407810mjr(C1408150mkP c1408150mkP, InterfaceC1364105Vn<? super C1407810mjr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1408150mkP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407810mjr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatTitleBarFeatureComponent@2681.initData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1407820mjs c1407820mjs = new C1407820mjs(this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c1407820mjs) == objLJFF) {
                C1C7U.LIZIZ("AiChatTitleBarFeatureComponent@2681.initData$1");
                return objLJFF;
            }
        }
        C1408150mkP c1408150mkP = this.LLILLJJLI;
        c1408150mkP.i3(new AwS601S0100000_22(c1408150mkP, 622));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatTitleBarFeatureComponent@2681.initData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
