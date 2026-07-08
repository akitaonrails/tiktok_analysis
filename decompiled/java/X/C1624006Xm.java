package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.SubOnlyLiveVipSettingSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06Xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1624006Xm extends C09AY implements Function2<C03H5, AbstractC1623806Xk<? extends Boolean>, Unit> {
    public final /* synthetic */ SubOnlyLiveVipSettingSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1624006Xm(SubOnlyLiveVipSettingSheet subOnlyLiveVipSettingSheet) {
        super(2);
        this.LL = subOnlyLiveVipSettingSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C03H5 c03h5, AbstractC1623806Xk<? extends Boolean> abstractC1623806Xk) {
        if (abstractC1623806Xk instanceof C1623706Xj) {
            C500260Jjc.LJLJLJ(this.LL.LLJZIJLIL, true);
        } else if (abstractC1623806Xk instanceof C491001vg) {
            SubOnlyLiveVipSettingSheet subOnlyLiveVipSettingSheet = this.LL;
            subOnlyLiveVipSettingSheet.getClass();
            C723850SaN.LIZ(subOnlyLiveVipSettingSheet, false, null, new C1624106Xn(subOnlyLiveVipSettingSheet), 3);
            C500260Jjc.LJLJLJ(this.LL.LLJZIJLIL, false);
        } else {
            SubOnlyLiveVipSettingSheet subOnlyLiveVipSettingSheet2 = this.LL;
            subOnlyLiveVipSettingSheet2.getClass();
            C723850SaN.LIZ(subOnlyLiveVipSettingSheet2, false, null, new C1140104d5(subOnlyLiveVipSettingSheet2), 3);
            C500260Jjc.LJLJLJ(this.LL.LLJZIJLIL, false);
        }
        return Unit.LIZ;
    }
}
