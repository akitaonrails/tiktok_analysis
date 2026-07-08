package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: renamed from: X.0fQo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126920fQo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(C16F5 c16f5, boolean z) {
        if (c16f5 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateGiftName(selected=");
            sbLIZ.append(z);
            sbLIZ.append(')');
            C20441214yg.LIZIZ("LiveFirstRechargeViewHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                C500260Jjc.LLFFF(c16f5);
                InterfaceC1133710fbl.LIZ.getClass();
                C1120710fGn.LIZ().getClass();
                GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2 = C1134860fdc.LIZJ;
                if (firstRechargeCampaignV2 != null) {
                    int i = firstRechargeCampaignV2.remainingFrozenCoins;
                    c16f5.setText(u.LJJIFFI(C497740JfY.LJIIJJI(2131755526, i), "{num}", String.valueOf(i), false));
                }
                C500260Jjc.LJLJL(1, c16f5);
                return;
            }
            C500260Jjc.LLFFF(c16f5);
            InterfaceC1133710fbl.LIZ.getClass();
            C1120710fGn.LIZ().getClass();
            GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV22 = C1134860fdc.LIZJ;
            if (firstRechargeCampaignV22 == null) {
                return;
            }
            int i2 = firstRechargeCampaignV22.remainingFrozenCoins;
            c16f5.setText(u.LJJIFFI(C497740JfY.LJIIJJI(2131755525, i2), "{num}", String.valueOf(i2), false));
        }
    }

    public static void LIZIZ(boolean z, C520690KbT c520690KbT, C16F5 c16f5) {
        if (c520690KbT != null) {
            InterfaceC1133710fbl.LIZ.getClass();
            C1120710fGn.LIZ();
            if (C1133940fc8.LJIILJJIL() && !z) {
                C500260Jjc.LLFFF(c520690KbT);
                if (c16f5 != null) {
                    C500260Jjc.LJIILIIL(c16f5);
                }
                C1120710fGn.LIZ();
                c520690KbT.LIZ(C1133940fc8.LJIIIIZZ());
                return;
            }
            C500260Jjc.LJIILIIL(c520690KbT);
        }
    }

    public static void LIZJ(ImageView imageView, C16F5 c16f5, boolean z) {
        Integer numLIZJ;
        if (imageView != null && c16f5 != null) {
            InterfaceC1133710fbl.LIZ.getClass();
            C1120710fGn.LIZ();
            if (!C1133940fc8.LJIILJJIL()) {
                C500260Jjc.LJIILIIL(imageView);
                if (z) {
                    C500260Jjc.LJIILIIL(c16f5);
                    return;
                }
                C500260Jjc.LLFFF(c16f5);
                String strLJIJI = C497740JfY.LJIJI(2131841727);
                SpannableString spannableString = new SpannableString(strLJIJI);
                Context contextLIZ = C176600m4.LIZ();
                ForegroundColorSpan foregroundColorSpan = null;
                if (contextLIZ != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ete, contextLIZ)) != null) {
                    foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
                }
                C786410Ut5.p2(spannableString, foregroundColorSpan, 0, strLJIJI.length(), 33);
                c16f5.setText(spannableString);
                return;
            }
            C500260Jjc.LJIILIIL(imageView);
            C500260Jjc.LJIILIIL(c16f5);
        }
    }

    public static void LIZLLL(boolean z, C1295960jpS c1295960jpS, C1324720kZq c1324720kZq, C1324720kZq c1324720kZq2, C1324720kZq c1324720kZq3) {
        if (c1295960jpS != null && c1324720kZq != null && c1324720kZq2 != null && c1324720kZq3 != null) {
            C500260Jjc.LJIILIIL(c1295960jpS);
            C500260Jjc.LJIILIIL(c1324720kZq3);
            if (z) {
                C500260Jjc.LJIILIIL(c1324720kZq);
                C500260Jjc.LLFFF(c1324720kZq2);
                C1143680frq.LIZLLL(c1324720kZq2, "tiktok_live_revenue_normal_1", "ttlive_frozen_coin_icon.png");
            } else {
                C500260Jjc.LLFFF(c1324720kZq);
                C500260Jjc.LJIILIIL(c1324720kZq2);
                C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_revenue_normal_1", "ttlive_frozen_coin_icon.png");
            }
        }
    }

    public static void LIZ(View view, C1295960jpS c1295960jpS, C1324720kZq c1324720kZq, C1324720kZq c1324720kZq2, C1324720kZq c1324720kZq3, C520690KbT c520690KbT, C16F5 c16f5, ImageView imageView, C16F5 c16f52, View view2, C16F5 c16f53, Long l, Integer num) {
        long jLongValue;
        int iIntValue;
        if (view != null && c1295960jpS != null && c1324720kZq != null && c1324720kZq2 != null && c1324720kZq3 != null && c520690KbT != null && c16f5 != null && imageView != null && c16f52 != null && view2 != null && c16f53 != null) {
            if (C1126800fQc.LIZ() != null) {
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                C1127240fRK.LIZLLL(iIntValue, jLongValue);
            }
            C1143680frq.LIZLLL(c1324720kZq3, "tiktok_live_revenue_normal_1", "ttlive_frozen_coin_icon.png");
        }
    }
}
