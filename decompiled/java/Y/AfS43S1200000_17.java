package Y;

import X.C09JN;
import X.C0IPN;
import X.C1082860eHk;
import X.C1094580eae;
import X.C1095920eco;
import X.C1120950fHB;
import X.C1121120fHS;
import X.C1121190fHZ;
import X.C1143780fs0;
import X.C1150000g22;
import X.C1150020g24;
import X.C1151130g3r;
import X.C1151980g5E;
import X.C1161920gLG;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1324720kZq;
import X.C1797270ws1;
import X.C1802410x0J;
import X.C1954807lC;
import X.C1C7U;
import X.C495520Jby;
import X.C500260Jjc;
import X.EnumC1118040fCU;
import X.EnumC1120810fGx;
import X.EnumC1120990fHF;
import X.InterfaceC1121180fHY;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftIconDailyEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class AfS43S1200000_17 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS43S1200000_17 afS43S1200000_17, Object obj) {
        String str;
        Context context;
        Boolean bool;
        C1C7U.LIZ("FansClubAnchorEntranceController@473.openFansClubGuidePage$1");
        C1095920eco c1095920eco = (C1095920eco) afS43S1200000_17.l1;
        String str2 = afS43S1200000_17.s0;
        View view = (View) afS43S1200000_17.l2;
        c1095920eco.getClass();
        C495520Jby c495520Jby = new C495520Jby(str2);
        C1094580eae c1094580eae = C1094580eae.LIZ;
        DataChannel dataChannel = c1095920eco.LJIILL;
        c1094580eae.getClass();
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C1082860eHk.class)) != null && bool.booleanValue()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c495520Jby.LIZJ("is_enter_from_trendinglive", str);
        c495520Jby.LIZJ("show_entrance", "entrance");
        c495520Jby.LIZIZ(System.currentTimeMillis(), "entrance_click_ts");
        c495520Jby.LIZJ("direct_source_page", "entrance");
        if (view != null && (context = view.getContext()) != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, UriProtector.parse(c495520Jby.LIZLLL()));
        }
        C1C7U.LIZIZ("FansClubAnchorEntranceController@473.openFansClubGuidePage$1");
    }

    public static final void accept$1(AfS43S1200000_17 afS43S1200000_17, Object obj) throws Throwable {
        C1C7U.LIZ("KycExchangeViewModel@1af.checkKycLimitPassed$1");
        Throwable th = ((C1150000g22) obj).LIZ;
        if (th != null) {
            C1150020g24 c1150020g24 = (C1150020g24) afS43S1200000_17.l1;
            Context context = (Context) afS43S1200000_17.l2;
            String str = afS43S1200000_17.s0;
            if (th instanceof Exception) {
                int i = 18;
                if (c1150020g24.LIZIZ != 18) {
                    i = 11;
                }
                C1802410x0J c1802410x0J = new C1802410x0J();
                c1802410x0J.LJIIJJI = i;
                c1802410x0J.LJIIL = c1150020g24.LIZLLL;
                c1802410x0J.LIZLLL = (Exception) th;
                c1802410x0J.LJIILIIL = false;
                C1797270ws1.LIZ().LIZ(context, C1151130g3r.LIZ(c1802410x0J), "exchange_fail_block", str);
                throw th;
            }
            throw th;
        }
        C1C7U.LIZIZ("KycExchangeViewModel@1af.checkKycLimitPassed$1");
    }

    public static final void accept$2(AfS43S1200000_17 afS43S1200000_17, Object obj) {
        C1121190fHZ c1121190fHZ;
        C1C7U.LIZ("LiveGiftIconView@6ee6.playAnimation$1");
        if (!Intrinsics.LJFF(((EnumC1120990fHF) afS43S1200000_17.l1).getValue(), "daily") || LiveGiftIconDailyEffect.INSTANCE.getValue()) {
            int i = C1121120fHS.LIZ[((EnumC1120990fHF) afS43S1200000_17.l1).ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.EVENT, EnumC1118040fCU.ANIMATION, 0L, (Integer) null, 28);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.MATCH_ITEM_AWARD_GUIDE, EnumC1118040fCU.ANIMATION, 0L, (Integer) null, 28);
                }
            } else {
                c1121190fHZ = new C1121190fHZ(EnumC1120810fGx.EVENT, EnumC1118040fCU.ANIMATION, 0L, (Integer) null, 28);
            }
            InterfaceC1121180fHY iView = ((C1120950fHB) afS43S1200000_17.l2).getIView();
            if (iView != null) {
                iView.LIZJ(c1121190fHZ);
            }
            String strLJIIJ = afS43S1200000_17.s0;
            if (strLJIIJ == null) {
                strLJIIJ = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_2"), "ttlive_gift_icon_effect_normal_without_background.webp");
            }
            C500260Jjc.LJLJLJ(((C1120950fHB) afS43S1200000_17.l2).LLILZIL, true);
            C1324720kZq c1324720kZq = ((C1120950fHB) afS43S1200000_17.l2).LLILZIL;
            if (c1324720kZq != null) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJII(strLJIIJ);
                c1320810kTXLIZJ.LJIIJJI = true;
                c1320810kTXLIZJ.LJIIIIZZ = new C1151980g5E((EnumC1120990fHF) afS43S1200000_17.l1, (C1120950fHB) afS43S1200000_17.l2, 1);
                c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
            }
        }
        C1C7U.LIZIZ("LiveGiftIconView@6ee6.playAnimation$1");
    }

    public AfS43S1200000_17(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
