package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS35S0001000_22;
import njp.a;

/* JADX INFO: renamed from: X.0mjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.titlebar.component.AiChatTitleBarFeatureComponent$quotaListener$1$onChanged$1", f = "AiChatTitleBarFeatureComponent.kt", l = {}, m = "invokeSuspend")
public final class C1407830mjt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1408150mkP LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407830mjt(C1408150mkP c1408150mkP, int i, InterfaceC1364105Vn<? super C1407830mjt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1408150mkP;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407830mjt(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatTitleBarFeatureComponent@2681.quotaListener$1$onChanged$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.i3(new AwS35S0001000_22(this.LLILLJJLI, 28));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AiChatTitleBarFeatureComponent@2681.quotaListener$1$onChanged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
