package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.browser.IHybridLegacyStorageService;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelExchangeParams;
import com.bytedance.android.livesdk.firstrecharge.RechargePanelInputParams;
import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1144090fsV extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ RechargePanelInputParams LL;
    public final /* synthetic */ RechargePanelExchangeParams LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0IR5 LLILZ;
    public final /* synthetic */ Activity LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1144090fsV(RechargePanelInputParams rechargePanelInputParams, RechargePanelExchangeParams rechargePanelExchangeParams, String str, C0IR5 c0ir5, C19EG c19eg, AwS561S0100000_17 awS561S0100000_17) {
        super(1);
        this.LL = rechargePanelInputParams;
        this.LLILLJJLI = rechargePanelExchangeParams;
        this.LLILLL = str;
        this.LLILZ = c0ir5;
        this.LLILZIL = c19eg;
        this.LLILZLL = awS561S0100000_17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.bytedance.hybrid.spark.SparkContext] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        int iLongValue;
        int iLongValue2;
        ?? BooleanValue;
        TaskInfo taskInfo;
        C0IXL c0ixl;
        String str;
        SparkContext sparkContext2 = sparkContext;
        String str2 = this.LL.profilePosition;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        sparkContext2.LJJJZ("profile_position", str2);
        String str4 = this.LL.requestPage;
        if (str4 == null) {
            str4 = "";
        }
        sparkContext2.LJJJZ("request_page", str4);
        sparkContext2.LJJJZ("exchange_type_for_first", String.valueOf(this.LLILLJJLI.exchangeTypeForFirst));
        sparkContext2.LJJJZ("exchange_price", this.LLILLL);
        sparkContext2.LJJJZ("show_amount", this.LLILLL);
        sparkContext2.LJJJZ("base_package_id", String.valueOf(this.LLILLJJLI.basePackageId));
        sparkContext2.LJJJLZIJ(C1151360g4E.LJFF(), "is_first_recharge");
        sparkContext2.LJJJZ("way", String.valueOf(this.LLILLJJLI.way));
        int i = (int) 1;
        Long l = this.LLILLJJLI.basePackagePrice;
        int iIntValue = 0;
        if (l != null) {
            iLongValue = (int) l.longValue();
        } else {
            iLongValue = 0;
        }
        sparkContext2.LJJJLZIJ(i * iLongValue, "local_amount");
        String str5 = this.LLILLJJLI.currencyCode;
        if (str5 == null) {
            str5 = "";
        }
        sparkContext2.LJJJZ("currency_code", str5);
        String str6 = this.LLILLJJLI.symbol;
        if (str6 == null) {
            str6 = "";
        }
        sparkContext2.LJJJZ("symbol", str6);
        Long l2 = this.LLILLJJLI.realDot;
        if (l2 != null) {
            iLongValue2 = (int) l2.longValue();
        } else {
            iLongValue2 = 0;
        }
        sparkContext2.LJJJLZIJ(iLongValue2, "real_dot");
        String str7 = this.LL.enterFromMerge;
        if (str7 == null) {
            str7 = "";
        }
        sparkContext2.LJJJZ("enter_from_merge", str7);
        String str8 = this.LL.enterMethod;
        if (str8 == null) {
            str8 = "";
        }
        sparkContext2.LJJJZ("enter_method", str8);
        C0IR5 c0ir5 = this.LLILZ;
        Integer numValueOf = null;
        if (c0ir5 != null && (c0ixl = c0ir5.LJFF) != null && (str = c0ixl.LJFF) != null) {
            str3 = str;
        }
        sparkContext2.LJJJZ("action_type", str3);
        Boolean bool = this.LL.recommendationPage;
        if (bool != null) {
            BooleanValue = bool.booleanValue();
        } else {
            BooleanValue = 0;
        }
        sparkContext2.LJJJLZIJ(BooleanValue, "recommendation_page");
        Integer num = this.LLILLJJLI.isPeriodicPayout;
        if (num != null) {
            iIntValue = num.intValue();
        }
        sparkContext2.LJJJLZIJ(iIntValue, "is_periodic_payout");
        String strLIZIZ = this.LL.chargeReason;
        if (strLIZIZ == null) {
            strLIZIZ = C1144050fsR.LIZIZ();
        }
        sparkContext2.LJJJZ("charge_reason", strLIZIZ);
        sparkContext2.LJJJZ("discount_gift_price_hide", CardStruct.IStatusCode.DEFAULT);
        sparkContext2.LJJJLZIJ(2, "first_recharge_backpack_gift_switch");
        C1134410fct c1134410fctLJ = TaskManagerV2.LIZ.LJ();
        if (c1134410fctLJ != null && (taskInfo = (TaskInfo) c1134410fctLJ.LIZ) != null) {
            numValueOf = Integer.valueOf(taskInfo.taskType);
        }
        sparkContext2.LJJJZ("campaign_type", String.valueOf(numValueOf));
        final Activity activity = this.LLILZIL;
        final Function0<Unit> function0 = this.LLILZLL;
        sparkContext2.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0fsX
            @Override // X.InterfaceC1554220qY0
            public final void LIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILJJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILL(SparkPopup sparkPopup, int i2) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILLIIL() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJI(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJIJJ(SparkPopup sparkPopup) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIJJLI(SparkPopup sparkPopup, float f) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIL(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIFFI(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJII() {
            }

            @Override // X.InterfaceC1554220qY0
            public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext3) {
                return false;
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJ(SparkPopup sparkPopup) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z) {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZ() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJJIIZI() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewAttachedToWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void onViewDetachedFromWindow() {
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIIZILJ(SparkPopup sparkPopup) {
                function0.invoke();
            }

            @Override // X.InterfaceC1554220qY0
            public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                ((IHybridLegacyStorageService) C1161920gLG.LIZJ(IHybridLegacyStorageService.class)).au0(activity, "LIVE_FIRST_HAD_SHOW_RETENTION_DIALOG");
            }
        });
        return Unit.LIZ;
    }
}
