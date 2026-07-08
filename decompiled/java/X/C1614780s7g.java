package X;

import android.content.Context;
import com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.vip.viewmodel.SeriesVipSubscriptionViewModel$cancelAutoRenew$1", f = "SeriesVipSubscriptionViewModel.kt", l = {566, 579}, m = "invokeSuspend")
public final class C1614780s7g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeriesVipSubscriptionViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1614780s7g(SeriesVipSubscriptionViewModel seriesVipSubscriptionViewModel, String str, Context context, InterfaceC1364105Vn<? super C1614780s7g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seriesVipSubscriptionViewModel;
        this.LLILLL = str;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1614780s7g(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:27:0x008e, B:28:0x0091, B:30:0x0095, B:31:0x00a0, B:18:0x0044, B:19:0x0047, B:21:0x007c, B:23:0x0082, B:10:0x002a, B:12:0x0030, B:14:0x0038, B:34:0x00b1), top: B:47:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1614780s7g.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
