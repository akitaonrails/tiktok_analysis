package X;

import Y.AgS288S0100000_7;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0JN4, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoplayerpage.playerview.ui.PlayerOverlayPortraitLayout$initObserver$1$5", f = "PlayerOverlayPortraitLayout.kt", l = {162}, m = "invokeSuspend")
public final class C0JN4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C490900JMy LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JN4(C490900JMy c490900JMy, InterfaceC1364105Vn<? super C0JN4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c490900JMy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0JN4(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YC<Boolean> c05yc = this.LLILLJJLI.getPlayerChannel().LJIILLIIL;
            AgS288S0100000_7 agS288S0100000_7 = new AgS288S0100000_7(this.LLILLJJLI, 29);
            this.LL = 1;
            if (c05yc.collect(agS288S0100000_7, this) == objLJFF) {
                C1C7U.LIZIZ("PlayerOverlayPortraitLayout@af76.initObserver$1$5");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
