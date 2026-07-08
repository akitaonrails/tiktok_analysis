package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01y6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.ies.powerlist.optimize.preload.ViewCacheAbility$onScrolled$1", f = "ViewCacheExtension.kt", l = {}, m = "invokeSuspend")
public final class C506001y6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RecyclerView LLILLJJLI;
    public final /* synthetic */ C344380Dem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506001y6(RecyclerView recyclerView, C344380Dem c344380Dem, InterfaceC1364105Vn<? super C506001y6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recyclerView;
        this.LLILLL = c344380Dem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C506001y6 c506001y6 = new C506001y6(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c506001y6.LL = obj;
        return c506001y6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        LinearLayoutManager linearLayoutManager2;
        C1C7U.LIZ("ViewCacheAbility@bdf3.onScrolled$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        RecyclerView recyclerView = this.LLILLJJLI;
        C344380Dem c344380Dem = this.LLILLL;
        try {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Unit unit = null;
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            } else {
                linearLayoutManager = null;
            }
            int iFindLastVisibleItemPosition = -1;
            if (linearLayoutManager == null) {
                iFindFirstVisibleItemPosition = -1;
            } else {
                iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            }
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
                iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
            }
            if ((recyclerView instanceof ViewOnAttachStateChangeListenerC20604515jv) && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) recyclerView) != null) {
                c344380Dem.LJJIZ(viewOnAttachStateChangeListenerC20604515jv, iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ViewCacheAbility@bdf3.onScrolled$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
