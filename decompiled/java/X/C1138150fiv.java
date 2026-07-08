package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fiv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.tray.animation.WaitingState$onTrayEventCombo$1$1", f = "GiftTrayAnimationOrchestrator.kt", l = {525}, m = "invokeSuspend")
public final class C1138150fiv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1138090fip LLILLJJLI;
    public final /* synthetic */ C1138240fj4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138150fiv(C1138090fip c1138090fip, C1138240fj4 c1138240fj4, InterfaceC1364105Vn<? super C1138150fiv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1138090fip;
        this.LLILLL = c1138240fj4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1138150fiv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WaitingState@c41c.onTrayEventCombo$1$1");
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
            InterfaceC1138270fj7 interfaceC1138270fj7 = this.LLILLJJLI.LIZ;
            EnumC1137200fhO enumC1137200fhO = EnumC1137200fhO.COMB_FROM_EVENT;
            this.LL = 1;
            obj = interfaceC1138270fj7.LJII(enumC1137200fhO, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("WaitingState@c41c.onTrayEventCombo$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZIZ(new C1138200fj0(this.LLILLL.LIZ));
        this.LLILLJJLI.LJ((C1138260fj6) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WaitingState@c41c.onTrayEventCombo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
