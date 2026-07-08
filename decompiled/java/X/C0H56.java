package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3Assem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS372S0200000_6;
import njp.a;

/* JADX INFO: renamed from: X.0H56, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3Assem$initSubscribe$2$1", f = "SearchKeyframeOptDir3Assem.kt", l = {}, m = "invokeSuspend")
public final class C0H56 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FrameLayout LL;
    public final /* synthetic */ SearchKeyframeOptDir3Assem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H56(FrameLayout frameLayout, SearchKeyframeOptDir3Assem searchKeyframeOptDir3Assem, InterfaceC1364105Vn<? super C0H56> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = frameLayout;
        this.LLILLJJLI = searchKeyframeOptDir3Assem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H56(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View view;
        C1C7U.LIZ("SearchKeyframeOptDir3Assem@530c.initSubscribe$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object parent = this.LL.getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            view = this.LL;
        }
        C2211631BhB.LJ(view, new AwS372S0200000_6(this.LLILLJJLI, this.LL, 86));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchKeyframeOptDir3Assem@530c.initSubscribe$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
