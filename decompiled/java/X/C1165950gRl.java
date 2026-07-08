package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListViewModel;

/* JADX INFO: renamed from: X.0gRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListViewModel", f = "PackageListViewModel.kt", l = {96}, m = "onRefresh")
public final class C1165950gRl extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PackageListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165950gRl(PackageListViewModel packageListViewModel, InterfaceC1364105Vn<? super C1165950gRl> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = packageListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PackageListViewModel@3cda.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("PackageListViewModel@3cda.onRefresh$1");
        return objOnRefresh;
    }
}
