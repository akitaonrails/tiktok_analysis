package X;

import Y.AcS497S0100000_17;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.browser.IHybridStorageService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.gift.GiftBeaconBubbleRefreshEvent;
import com.bytedance.android.live.infrastructure.dialog.DelayLoadingDialog;
import com.bytedance.android.live.wallet.model.WalletStruct;
import com.bytedance.android.live.wallet.viewmodel.exchange.ExchangeDialogVM;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import com.bytedance.android.livesdk.livesetting.other.LiveExchangePopupLimit;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletExchangeUseNewStarlingSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1149720g1a implements InterfaceC1150010g23 {
    public static final ConcurrentHashSet<String> LJI = new ConcurrentHashSet<>();
    public final Context LIZ;
    public final C1144350fsv LIZIZ;
    public LiveDialog LIZJ = null;
    public boolean LIZLLL;
    public C1149810g1j LJ;
    public DelayLoadingDialog LJFF;

    public abstract ExchangeDialogVM LIZJ();

    public static boolean LJI() {
        WalletStruct walletStruct = C1151110g3p.LIZ.LL;
        return walletStruct != null && walletStruct.isPeriodicPayout;
    }

    public final void LIZIZ() {
        String strLJIJI;
        Context context = this.LIZ;
        if (context != null) {
            C782110Um9 c782110Um9 = new C782110Um9(context);
            if (LIZLLL().LJI) {
                c782110Um9.LJFF(R.drawable.eik);
            }
            Integer num = LIZLLL().LJIIJ;
            if (num != null) {
                c782110Um9.LJFF(num.intValue());
            } else {
                C1144330fst c1144330fst = LIZLLL().LJIIIZ;
                if (c1144330fst != null) {
                    C753530Th9 c753530Th9 = c1144330fst.LIZ;
                    c782110Um9.LIZIZ();
                    c753530Th9.LIZJ = 1;
                    c782110Um9.LJFF = c753530Th9;
                    c782110Um9.LJIIIZ = c1144330fst.LIZJ;
                    c782110Um9.LJIIIIZZ = c1144330fst.LIZIZ;
                }
            }
            c782110Um9.LJIILL = false;
            c782110Um9.LIZJ = LIZLLL().LIZ;
            c782110Um9.LJIIIZ(LIZLLL().LIZIZ);
            c782110Um9.LJIILJJIL = LIZLLL().LJIIIIZZ;
            c782110Um9.LJJIIJ = 1;
            c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0fsu
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    C1144350fsv c1144350fsv;
                    C1149870g1p c1149870g1p;
                    EnumC1134460fcy enumC1134460fcyLIZJ;
                    AbstractC1149720g1a abstractC1149720g1a = this.LL;
                    Context context2 = abstractC1149720g1a.LIZ;
                    if (context2 != null && (c1149870g1p = (c1144350fsv = abstractC1149720g1a.LIZIZ).LJII) != null) {
                        String str = c1149870g1p.LIZLLL;
                        if (str == null) {
                            str = "normal";
                        }
                        C1142550fq1.LIZJ(str, "11", c1144350fsv.LIZLLL);
                        IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
                        C1134410fct c1134410fctLJI = iRevenueStrategyService.KE0().LJI(11);
                        if (c1134410fctLJI != null) {
                            enumC1134460fcyLIZJ = c1134410fctLJI.LIZJ();
                        } else {
                            enumC1134460fcyLIZJ = null;
                        }
                        if (enumC1134460fcyLIZJ == EnumC1134460fcy.TASK_ENTER) {
                            iRevenueStrategyService.KE0().LJIJI(11, 15, c1144350fsv.LIZLLL, "creator_task_exchange_popup");
                        }
                        ((IHybridStorageService) C1161920gLG.LIZJ(IHybridStorageService.class)).CM(context2, 1, "enable_live_income_gift_pre_claim", null);
                        DataChannelGlobal.LLILZ.GQ2(GiftBeaconBubbleRefreshEvent.class);
                    }
                    this.LL.LIZJ().onShow();
                }
            };
            c782110Um9.LJJIII = new InterfaceC782250UmN() { // from class: X.0g1Y
                @Override // X.InterfaceC782250UmN
                public final void LIZIZ() {
                    this.LIZ.LIZJ().NQ2();
                }
            };
            c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC1151680g4k(this, 2);
            int i = this.LIZLLL ? 2 : 1;
            C494720Jag c494720Jag = new C494720Jag();
            C755620TkW c755620TkW = new C755620TkW();
            int i2 = LIZLLL().LIZLLL;
            String str = this.LIZIZ.LIZLLL;
            LiveWalletExchangeUseNewStarlingSetting liveWalletExchangeUseNewStarlingSetting = LiveWalletExchangeUseNewStarlingSetting.INSTANCE;
            if (liveWalletExchangeUseNewStarlingSetting.isEnable()) {
                Object[] objArr = new Object[1];
                objArr[0] = C497740JfY.LJIJI(liveWalletExchangeUseNewStarlingSetting.isEnable() ? Intrinsics.LJFF(str, EnumC1150610g31.TYPE_MAGIC_GIFT_CREATE.getType()) ? 2131852254 : Intrinsics.LJFF(str, EnumC1150610g31.TYPE_JOIN_ENIGMA.getType()) ? 2131852255 : 2131852256 : 2131852261);
                strLJIJI = C497740JfY.LJIJJ(i2, objArr);
            } else {
                strLJIJI = C497740JfY.LJIJI(i2);
            }
            c755620TkW.LIZ = strLJIJI;
            c755620TkW.LIZJ = new AcS497S0100000_17(this, 10);
            c494720Jag.LIZ(new C0TZ2(c755620TkW));
            C755630TkX c755630TkX = new C755630TkX();
            c755630TkX.LIZ = C497740JfY.LJIJI(LIZLLL().LIZJ);
            c755630TkX.LIZJ = new AcS497S0100000_17(this, 11);
            c494720Jag.LIZ(new C0TZ3(c755630TkX));
            c494720Jag.LIZIZ = i;
            c782110Um9.LIZJ(new C494730Jah(c494720Jag));
            boolean z = LIZLLL().LJFF;
            View view = LIZLLL().LJII;
            LinearLayout linearLayout = new LinearLayout(this.LIZ);
            C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(1);
            if (view != null) {
                linearLayout.addView(view);
            }
            if (z) {
                View viewSd = C786410Ut5.Sd(R.layout.fzl, C786410Ut5.ne(this.LIZ), null);
                C20744116Fj c20744116Fj = (C20744116Fj) viewSd.findViewById(R.id.dq1);
                c20744116Fj.setText(LIZLLL().LJ);
                if (view == null) {
                    TextView textView = (TextView) viewSd.findViewById(R.id.hfc);
                    textView.setText(LIZLLL().LIZIZ);
                    C12ES.LJIILL(0, textView);
                }
                C786410Ut5.z7(c20744116Fj, new C1151630g4f(this, 0));
                linearLayout.addView(viewSd);
            }
            LIZJ().LLILLL = z;
            if (linearLayout.getChildCount() > 0) {
                c782110Um9.LJIIIIZZ(linearLayout);
            }
            this.LIZJ = c782110Um9.LIZ();
            if (LiveExchangePopupLimit.INSTANCE.getValue() && LJI.contains(getClass().getSimpleName())) {
                return;
            }
            LJI.add(getClass().getSimpleName());
            LiveDialog liveDialog = this.LIZJ;
            if (liveDialog != null) {
                C786410Ut5.E4(liveDialog);
            }
        }
    }

    public final C1149810g1j LIZLLL() {
        C1149810g1j c1149810g1j = this.LJ;
        if (c1149810g1j != null) {
            return c1149810g1j;
        }
        return null;
    }

    @Override // X.InterfaceC1150010g23
    public final void LJ() {
        if (this.LJFF == null) {
            Context context = this.LIZ;
            this.LJFF = context != null ? new DelayLoadingDialog(context) : null;
        }
        DelayLoadingDialog delayLoadingDialog = this.LJFF;
        if (delayLoadingDialog != null) {
            delayLoadingDialog.LIZ(500L);
        }
    }

    @Override // X.InterfaceC1150010g23
    public final void LJIIL() {
        DelayLoadingDialog delayLoadingDialog = this.LJFF;
        if (delayLoadingDialog != null) {
            delayLoadingDialog.LIZIZ.removeMessages(10);
            C500260Jjc.LJJLIIIJL(delayLoadingDialog.LIZ);
        }
    }

    public static String LJFF(String str) {
        if (LiveWalletExchangeUseNewStarlingSetting.INSTANCE.isEnable()) {
            if (Intrinsics.LJFF(str, "redpacket_new")) {
                return C497740JfY.LJIJI(2131852264);
            }
            if (Intrinsics.LJFF(str, "portal")) {
                return C497740JfY.LJIJI(2131852262);
            }
            if (Intrinsics.LJFF(str, "star_comment")) {
                return C497740JfY.LJIJI(2131852263);
            }
            if (Intrinsics.LJFF(str, InterfaceC1149860g1o.LIZ)) {
                return C497740JfY.LJIJI(2131852259);
            }
            if (Intrinsics.LJFF(str, InterfaceC1149860g1o.LIZIZ)) {
                return C497740JfY.LJIJI(2131852260);
            }
            return C497740JfY.LJIJI(2131852261);
        }
        if (Intrinsics.LJFF(str, "redpacket_new")) {
            return C497740JfY.LJIJI(2131841634);
        }
        if (Intrinsics.LJFF(str, "portal")) {
            return C497740JfY.LJIJI(2131841633);
        }
        if (Intrinsics.LJFF(str, "star_comment")) {
            return C497740JfY.LJIJI(2131844127);
        }
        if (Intrinsics.LJFF(str, InterfaceC1149860g1o.LIZIZ)) {
            return C497740JfY.LJIJI(2131852260);
        }
        return C497740JfY.LJIJI(2131841632);
    }

    public AbstractC1149720g1a(Context context, C1144350fsv c1144350fsv) {
        this.LIZ = context;
        this.LIZIZ = c1144350fsv;
    }
}
