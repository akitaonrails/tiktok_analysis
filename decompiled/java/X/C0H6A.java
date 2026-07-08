package X;

import android.view.View;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H6A, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment$tryAddAdditionView$2", f = "SkeletonSharePanelFragment.kt", l = {1682}, m = "invokeSuspend")
public final class C0H6A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SkeletonSharePanelFragment LLILLL;
    public final /* synthetic */ InterfaceC1370520lli LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H6A(SkeletonSharePanelFragment skeletonSharePanelFragment, InterfaceC1370520lli interfaceC1370520lli, InterfaceC1364105Vn<? super C0H6A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = skeletonSharePanelFragment;
        this.LLILZ = interfaceC1370520lli;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0H6A c0h6a = new C0H6A(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0h6a.LLILLJJLI = obj;
        return c0h6a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkeletonSharePanelFragment@a513.tryAddAdditionView$2");
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
            Object obj2 = this.LLILLJJLI;
            if (!this.LLILLL.isDetached()) {
                InterfaceC1370520lli interfaceC1370520lli = this.LLILZ;
                SkeletonSharePanelFragment skeletonSharePanelFragment = this.LLILLL;
                C1361400lX0 c1361400lX0 = skeletonSharePanelFragment.LLJJL;
                C1371590lnR c1371590lnR = skeletonSharePanelFragment.LLILZ;
                if (c1371590lnR == null) {
                    c1371590lnR = null;
                }
                View viewLJI = interfaceC1370520lli.LJI(c1361400lX0, c1371590lnR, skeletonSharePanelFragment);
                if (viewLJI != null) {
                    viewLJI.setTag(R.id.x10, obj2);
                }
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C0H69 c0h69 = new C0H69(viewLJI, this.LLILLL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c0h69) == objLJFF) {
                    C1C7U.LIZIZ("SkeletonSharePanelFragment@a513.tryAddAdditionView$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkeletonSharePanelFragment@a513.tryAddAdditionView$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
