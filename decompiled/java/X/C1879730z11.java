package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0z11, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.gamedetail.GameDetailMixPageHost$openRewardDetailPage$3", f = "GameDetailMixPageHost.kt", l = {}, m = "invokeSuspend")
public final class C1879730z11 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1881590z41 LL;
    public final /* synthetic */ C760370TsB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879730z11(C1881590z41 c1881590z41, C760370TsB c760370TsB, InterfaceC1364105Vn<? super C1879730z11> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1881590z41;
        this.LLILLJJLI = c760370TsB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1879730z11(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameDetailMixPageHost@9f5f.openRewardDetailPage$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C476770Imp.LIZ(this.LL.LJIIIZ().getContext(), "claim", C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LL.LJIIIZ()), "enter_from"), C1882380z5I.LJFF(C1882380z5I.LIZJ(this.LL.LJIIIZ()), "source_entrance"), new C1879740z12(this.LL, this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameDetailMixPageHost@9f5f.openRewardDetailPage$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
