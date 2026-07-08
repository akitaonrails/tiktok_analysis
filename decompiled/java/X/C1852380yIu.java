package X;

import Y.ARunnableS127S0100000_27;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateTabFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateTabFragment$initList$config$1$onRefresh$1$1$1", f = "TakoImageCreateTabFragment.kt", l = {}, m = "invokeSuspend")
public final class C1852380yIu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoImageCreateTabFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1852380yIu(TakoImageCreateTabFragment takoImageCreateTabFragment, InterfaceC1364105Vn<? super C1852380yIu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoImageCreateTabFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1852380yIu(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoImageCreateTabFragment@e4bf.initList$config$1$onRefresh$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C1852420yIy) this.LL.LLJJIJI.getValue()).LIZIZ(true);
        TakoImageCreateTabFragment takoImageCreateTabFragment = this.LL;
        View view = takoImageCreateTabFragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS127S0100000_27(takoImageCreateTabFragment, 77));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageCreateTabFragment@e4bf.initList$config$1$onRefresh$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
