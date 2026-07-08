package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelPreloadSortedListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lau, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelPreloadSortedListViewModel$bindPreLoadedShareList$1", f = "SharePanelPreloadSortedListViewModel.kt", l = {123}, m = "invokeSuspend")
public final class C1363820lau extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SharePanelPreloadSortedListViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<List<IMContact>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1363820lau(SharePanelPreloadSortedListViewModel sharePanelPreloadSortedListViewModel, String str, Function1<? super List<IMContact>, Unit> function1, InterfaceC1364105Vn<? super C1363820lau> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sharePanelPreloadSortedListViewModel;
        this.LLILLL = str;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1363820lau(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelPreloadSortedListViewModel@c97c.bindPreLoadedShareList$1");
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
            C099G c099g = this.LLILLJJLI.LL;
            if (c099g != null) {
                this.LL = 1;
                obj = c099g.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SharePanelPreloadSortedListViewModel@c97c.bindPreLoadedShareList$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1366160leg c1366160leg = this.LLILLJJLI.LLILLL;
        if (c1366160leg != null) {
            c1366160leg.LIZ("panel_source", this.LLILLL);
        }
        C1366160leg c1366160leg2 = this.LLILLJJLI.LLILLL;
        if (c1366160leg2 != null) {
            c1366160leg2.LIZIZ("bind_data");
        }
        C1364460lbw c1364460lbw = C1361760lXa.LIZ.get("im_data_load_latency");
        if (c1364460lbw != null) {
            c1364460lbw.LIZIZ = System.currentTimeMillis();
        }
        this.LLILZ.invoke((List<IMContact>) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelPreloadSortedListViewModel@c97c.bindPreLoadedShareList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
