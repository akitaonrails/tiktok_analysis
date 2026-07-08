package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H69, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment$tryAddAdditionView$2$1", f = "SkeletonSharePanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C0H69 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ SkeletonSharePanelFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H69(View view, SkeletonSharePanelFragment skeletonSharePanelFragment, InterfaceC1364105Vn<? super C0H69> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = skeletonSharePanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H69(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup viewGroup;
        C1C7U.LIZ("SkeletonSharePanelFragment@a513.tryAddAdditionView$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = this.LL;
        ViewParent parent = null;
        if (view != null) {
            parent = view.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(this.LL, viewGroup);
        }
        FrameLayout frameLayoutSR = this.LLILLJJLI.SR();
        if (frameLayoutSR != null) {
            frameLayoutSR.addView(this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkeletonSharePanelFragment@a513.tryAddAdditionView$2$1");
        return unit;
    }
}
