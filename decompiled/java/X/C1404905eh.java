package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.viewbinder.playtools.header.playtools.ui.PlayToolListViewKt$PlayToolListView$1$1", f = "PlayToolListView.kt", l = {75}, m = "invokeSuspend")
public final class C1404905eh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ List<C941240abK> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ InterfaceC383701eN LLILZLL;
    public final /* synthetic */ InterfaceC1676320tiw LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1404905eh(C1690080u58 c1690080u58, float f, List<C941240abK> list, int i, InterfaceC383701eN interfaceC383701eN, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C1404905eh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = f;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = interfaceC383701eN;
        this.LLIZ = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1404905eh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayToolListViewKt@1f10.PlayToolListView$1$1");
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
            final C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new C1405305el(this.LLILLJJLI));
            InterfaceC346201Wa<Boolean> interfaceC346201Wa = new InterfaceC346201Wa<Boolean>() { // from class: X.05ei
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c095dLJIIIZ.collect(new C1405105ej(interfaceC346701Wf), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            C1404705ef c1404705ef = new C1404705ef(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
            this.LL = 1;
            if (interfaceC346201Wa.collect(c1404705ef, this) == objLJFF) {
                C1C7U.LIZIZ("PlayToolListViewKt@1f10.PlayToolListView$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayToolListViewKt@1f10.PlayToolListView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
