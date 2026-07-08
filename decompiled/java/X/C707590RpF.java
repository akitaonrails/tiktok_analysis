package X;

import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RpF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger$NewPaywallCellOverlayComponent$onViewCreated$onHolderSelected$1$1", f = "PaywallComponentTrigger.kt", l = {365}, m = "invokeSuspend")
public final class C707590RpF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PaywallComponentTrigger.NewPaywallCellOverlayComponent LLILLJJLI;
    public final /* synthetic */ Function2<Set<String>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C707590RpF(PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent, Function2<? super Set<String>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C707590RpF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = newPaywallCellOverlayComponent;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C707590RpF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.onViewCreated$onHolderSelected$1$1");
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
            C1629806Zs c1629806Zs = new C1629806Zs(((C0K77) this.LLILLJJLI.LLJLLL.getValue()).LJIIJ());
            C0S5W c0s5w = new C0S5W(this.LLILLL);
            this.LL = 1;
            if (c1629806Zs.collect(c0s5w, this) == objLJFF) {
                C1C7U.LIZIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.onViewCreated$onHolderSelected$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.onViewCreated$onHolderSelected$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
