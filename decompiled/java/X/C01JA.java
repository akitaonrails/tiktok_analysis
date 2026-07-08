package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01JA, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget$onCreate$3", f = "CountDownForAllV2AnchorWidget.kt", l = {190}, m = "invokeSuspend")
public final class C01JA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CountDownForAllV2AnchorWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01JA(CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget, InterfaceC1364105Vn<? super C01JA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = countDownForAllV2AnchorWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01JA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951;
        C1C7U.LIZ("CountDownForAllV2AnchorWidget@53af.onCreate$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            CountDownForAllV2AnchorWidget countDownForAllV2AnchorWidget = this.LLILLJJLI;
            CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) countDownForAllV2AnchorWidget.LL;
            if (countDownForAllV2AnchorViewModel != null && (anonymousClass0951 = countDownForAllV2AnchorViewModel.LLILZLL) != null) {
                C517001zs c517001zs = new C517001zs(countDownForAllV2AnchorWidget, 2);
                this.LL = 1;
                if (anonymousClass0951.collect(c517001zs, this) == objLJFF) {
                    C1C7U.LIZIZ("CountDownForAllV2AnchorWidget@53af.onCreate$3");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CountDownForAllV2AnchorWidget@53af.onCreate$3");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
