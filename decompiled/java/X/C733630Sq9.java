package X;

import com.ss.android.ugc.feed.platform.panel.share.ShareCoinIncentiveComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS151S0101000_11;
import njp.a;

/* JADX INFO: renamed from: X.0Sq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.share.ShareCoinIncentiveComponent$requestOnNotificationAction$1", f = "ShareCoinIncentiveComponent.kt", l = {}, m = "invokeSuspend")
public final class C733630Sq9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShareCoinIncentiveComponent LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733630Sq9(ShareCoinIncentiveComponent shareCoinIncentiveComponent, int i, InterfaceC1364105Vn<? super C733630Sq9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shareCoinIncentiveComponent;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C733630Sq9(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareCoinIncentiveComponent@7b59.requestOnNotificationAction$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01U6.LIZIZ(new AwS151S0101000_11(this.LL, this.LLILLJJLI, 3));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareCoinIncentiveComponent@7b59.requestOnNotificationAction$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
