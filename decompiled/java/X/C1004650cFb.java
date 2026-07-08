package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cFb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.util.RepostLazyLoadUtil$subscribeEventOpt$1$1", f = "RepostLazyLoadUtil.kt", l = {}, m = "invokeSuspend")
public final class C1004650cFb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RepostLazyLoadUtil<ReusedUIAssem<?>, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004650cFb(RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil, InterfaceC1364105Vn<? super C1004650cFb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = repostLazyLoadUtil;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1004650cFb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostLazyLoadUtil@3911.subscribeEventOpt$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RepostLazyLoadUtil<ReusedUIAssem<?>, Object> repostLazyLoadUtil = this.LL;
        ReusedUIAssem reusedUIAssem = repostLazyLoadUtil.LIZ;
        if (reusedUIAssem.getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            C736680Sv4.LJIIIIZZ(reusedUIAssem, (AssemViewModel) repostLazyLoadUtil.LJIIJ.getValue(), new C2217381BqS() { // from class: X.0cFZ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj2) {
                    return ((C1004620cFY) obj2).LL;
                }
            }, C736820SvI.LIZLLL(), new C1004660cFc(repostLazyLoadUtil), 4);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostLazyLoadUtil@3911.subscribeEventOpt$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
