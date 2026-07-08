package X;

import Y.AObserverS229S0100000_27;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.wallet.viewmodel.recharge.component.banner.VaultRechargeUnlockGiftViewModel;
import com.bytedance.android.live.walletnew.RechargeViewModel;
import com.bytedance.android.livesdk.livesetting.wallet.LiveEmailIncentiveSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargePanelRefactorSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x7U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806860x7U {
    public static String LJIIIIZZ = "";
    public final RechargeViewModel LIZ;
    public final LifecycleOwner LIZIZ;
    public final MutableLiveData<C1806930x7b> LIZJ = new MutableLiveData<>();
    public EnumC1806870x7V LIZLLL = EnumC1806870x7V.NOT_APPLICABLE_NEED_LESS;
    public List<IapListResult.VoucherItem> LJ;
    public IapListResult.VoucherItem LJFF;
    public boolean LJI;
    public boolean LJII;

    public final void LIZ() {
        C1806930x7b value = this.LIZJ.getValue();
        boolean z = !C500260Jjc.LJJJI(value != null ? Boolean.valueOf(value.LIZ) : null);
        C1806930x7b value2 = this.LIZJ.getValue();
        if (value2 != null) {
            value2.LIZ = z;
        }
        String str = z ? "select" : "cancel";
        IapListResult.VoucherItem voucherItem = this.LJFF;
        if (voucherItem != null) {
            AbstractC1806940x7c abstractC1806940x7c = new AbstractC1806940x7c() { // from class: X.0x7X
                {
                    LIZ("page_type", "incentive_productization");
                    LIZ("popup_entrance", "room_recharge");
                    LIZ("voucher_type", "cash_back_voucher");
                }
            };
            abstractC1806940x7c.LIZ("action_type", str);
            abstractC1806940x7c.LIZ("voucher_template_id", voucherItem.voucherTemplateId);
            String str2 = voucherItem.voucherToken;
            abstractC1806940x7c.LIZ("voucher_token", str2);
            abstractC1806940x7c.LIZ("voucher_id", str2);
            abstractC1806940x7c.LIZIZ();
        }
        LJII(false);
    }

    public final List<String> LIZJ() {
        IapListResult.VoucherItem voucherItem = this.LJFF;
        if (voucherItem == null || this.LIZLLL != EnumC1806870x7V.NORMAL) {
            return null;
        }
        C1806930x7b value = this.LIZJ.getValue();
        if (C500260Jjc.LJJIJIIJIL(value != null ? Boolean.valueOf(value.LIZ) : null)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(voucherItem.voucherToken);
        return arrayList;
    }

    public final void LJFF() {
        if (C500260Jjc.LJJIFFI(Boolean.valueOf(this.LJII))) {
            this.LJII = true;
            IapListResult.VoucherItem voucherItem = this.LJFF;
            if (voucherItem != null) {
                AbstractC1806940x7c abstractC1806940x7c = new AbstractC1806940x7c() { // from class: X.0x7Y
                    {
                        LIZ("page_type", "incentive_productization");
                        LIZ("popup_entrance", "room_recharge");
                        LIZ("voucher_type", "cash_back_voucher");
                    }
                };
                abstractC1806940x7c.LIZ("voucher_template_id", voucherItem.voucherTemplateId);
                String str = voucherItem.voucherToken;
                abstractC1806940x7c.LIZ("voucher_token", str);
                abstractC1806940x7c.LIZ("voucher_id", str);
                abstractC1806940x7c.LIZIZ();
            }
        }
    }

    public final void LIZLLL(Context context) {
        IapListResult.VoucherItem.CashbackInfo.CashbackPercentage cashbackPercentage;
        String str;
        IapListResult.VoucherItem.CashbackInfo.CashbackPercentage cashbackPercentage2;
        IapListResult.VoucherItem voucherItem = this.LJFF;
        if (voucherItem == null) {
            return;
        }
        C1806910x7Z c1806910x7Z = new C1806910x7Z();
        c1806910x7Z.LIZ.LIZIZ(voucherItem.expireTimestamp, "valid_until_date");
        c1806910x7Z.LIZ.LIZIZ(voucherItem.minOrderCoinsAmount, "min_amount");
        c1806910x7Z.LIZ.LIZIZ(voucherItem.maxOrderCoinsAmount, "max_amount");
        IapListResult.VoucherItem.CashbackInfo cashbackInfo = voucherItem.cashbackInfo;
        String str2 = null;
        if (cashbackInfo != null && (cashbackPercentage2 = cashbackInfo.cashbackPercentage) != null) {
            str2 = cashbackPercentage2.iap;
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c1806910x7Z.LIZ.LIZJ("iap_cashback_percentage", str2);
        IapListResult.VoucherItem.CashbackInfo cashbackInfo2 = voucherItem.cashbackInfo;
        if (cashbackInfo2 != null && (cashbackPercentage = cashbackInfo2.cashbackPercentage) != null && (str = cashbackPercentage.webapp) != null) {
            str3 = str;
        }
        c1806910x7Z.LIZ.LIZJ("webapp_cashback_percentage", str3);
        c1806910x7Z.LIZ.LIZJ("voucher_token", voucherItem.voucherToken);
        c1806910x7Z.LIZ.LIZJ("voucher_template_id", voucherItem.voucherTemplateId);
        c1806910x7Z.LIZ.LIZJ("voucher_type", "cash_back_voucher");
        c1806910x7Z.LIZ.LIZJ("page_type", "incentive_productization");
        c1806910x7Z.LIZ.LIZJ("popup_entrance", "room_recharge");
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c1806910x7Z.LIZ.LIZLLL());
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(boolean r13) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1806860x7U.LJII(boolean):void");
    }

    public C1806860x7U(RechargeViewModel rechargeViewModel, LifecycleOwner lifecycleOwner) {
        this.LIZ = rechargeViewModel;
        this.LIZIZ = lifecycleOwner;
    }

    public final void LJ(Context context, String str) {
        Number numberValueOf;
        String str2;
        Map<Long, String> map;
        IapListResult.VoucherItem voucherItem = this.LJFF;
        if (voucherItem == null) {
            return;
        }
        Diamond value = this.LIZ.LLLLIILL.getValue();
        if (value != null) {
            numberValueOf = Integer.valueOf(value.id);
        } else {
            numberValueOf = 0L;
        }
        IapListResult.VoucherItem.CashbackInfo cashbackInfo = voucherItem.cashbackInfo;
        if (cashbackInfo == null || (map = cashbackInfo.diamondIdToCashbackUsdAmt) == null || (str2 = map.get(Long.valueOf(numberValueOf.longValue()))) == null) {
            str2 = "";
        }
        C1805990x65 c1805990x65 = new C1805990x65();
        c1805990x65.LIZ.LIZJ("success_type", "cashback_pending");
        c1805990x65.LIZ.LIZJ("cashback_amount", str2);
        VaultRechargeUnlockGiftViewModel vaultRechargeUnlockGiftViewModel = this.LIZ.LLLIL;
        if (vaultRechargeUnlockGiftViewModel != null) {
            vaultRechargeUnlockGiftViewModel.vQ2(str, c1805990x65.LIZ);
        }
        c1805990x65.LIZ.LIZJ("popup_entrance", "room_recharge");
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, c1805990x65.LIZ.LIZLLL());
    }

    public final void LJI(List<IapListResult.VoucherItem> list, boolean z) {
        IapListResult.VoucherItem voucherItem;
        if (this.LIZ.YQ2() == 0) {
            this.LJ = list;
            if (list != null) {
                voucherItem = (IapListResult.VoucherItem) C13LP.LJJJLL(list);
            } else {
                voucherItem = null;
            }
            this.LJFF = voucherItem;
            if (C1533950q1J.LJ(LJIIIIZZ) && list != null) {
                for (IapListResult.VoucherItem voucherItem2 : list) {
                    if (Intrinsics.LJFF(voucherItem2.voucherTemplateId, LJIIIIZZ)) {
                        this.LJFF = voucherItem2;
                        LJIIIIZZ = "";
                    }
                }
            }
            LJII(z);
            if (!this.LJI) {
                this.LJI = true;
                LifecycleOwner lifecycleOwner = this.LIZIZ;
                if (lifecycleOwner != null) {
                    this.LIZ.LLLLIILL.observe(lifecycleOwner, new AObserverS229S0100000_27(this, 42));
                }
            }
        }
    }

    public final Map<String, String> LIZIZ(boolean z, boolean z2, boolean z3) {
        IapListResult.VoucherItem.CashbackInfo.CashbackPercentage cashbackPercentage;
        String str;
        IapListResult.VoucherItem.CashbackInfo cashbackInfo;
        IapListResult.VoucherItem.CashbackInfo.CashbackPercentage cashbackPercentage2;
        String str2;
        Double dLJII;
        String str3;
        Boolean boolValueOf;
        List<String> listLIZJ;
        Object objLJJJLL;
        IapListResult.VoucherItem.CashbackInfo.CashbackPercentage cashbackPercentage3;
        IapListResult.VoucherItem voucherItem = this.LJFF;
        if (voucherItem == null) {
            return C2097608Jq.LJI(new Pair("voucher_show_type", "no_voucher"));
        }
        String str4 = null;
        if (z) {
            IapListResult.VoucherItem.CashbackInfo cashbackInfo2 = voucherItem.cashbackInfo;
            if (cashbackInfo2 != null && (cashbackPercentage3 = cashbackInfo2.cashbackPercentage) != null) {
                str = cashbackPercentage3.webapp;
                if (str == null) {
                }
            }
            str = "";
        } else {
            IapListResult.VoucherItem.CashbackInfo cashbackInfo3 = voucherItem.cashbackInfo;
            if (cashbackInfo3 != null && (cashbackPercentage = cashbackInfo3.cashbackPercentage) != null) {
                str = cashbackPercentage.iap;
                if (str == null) {
                }
            }
            str = "";
        }
        HashMap map = new HashMap();
        if (LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
            Double dLJII2 = C2327809Ae.LJII(str);
            if (dLJII2 != null) {
                map.put("voucher_back_rate", String.valueOf(dLJII2.doubleValue() / ((double) 100)));
            }
        } else {
            IapListResult.VoucherItem voucherItem2 = this.LJFF;
            if (voucherItem2 != null && (cashbackInfo = voucherItem2.cashbackInfo) != null && (cashbackPercentage2 = cashbackInfo.cashbackPercentage) != null && (str2 = cashbackPercentage2.iap) != null && (dLJII = C2327809Ae.LJII(str2)) != null) {
                map.put("voucher_back_rate", String.valueOf(dLJII.doubleValue() / ((double) 100)));
            }
        }
        if (z2) {
            if (this.LIZLLL == EnumC1806870x7V.FROZEN) {
                map.put("voucher_show_type", "show_not_usable");
            } else {
                map.put("voucher_show_type", "show_usable");
            }
        }
        if (z3) {
            C1806930x7b value = this.LIZJ.getValue();
            if (value != null && value.LIZ) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_use_voucher", str3);
            C1806930x7b value2 = this.LIZJ.getValue();
            if (value2 != null) {
                boolValueOf = Boolean.valueOf(value2.LIZ);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (listLIZJ = LIZJ()) != null && (objLJJJLL = C13LP.LJJJLL(listLIZJ)) != null) {
                map.put("voucher_id", objLJJJLL);
            }
        }
        IapListResult.VoucherItem voucherItem3 = this.LJFF;
        if (voucherItem3 != null) {
            str4 = voucherItem3.voucherTemplateId;
        }
        if (Intrinsics.LJFF(str4, LiveEmailIncentiveSetting.INSTANCE.getValue().emailVoucherTemplateId)) {
            map.put("voucher_biz", "email_authorize");
        }
        return map;
    }
}
