package Y;

import X.AnonymousClass1428;
import X.C1036420d4q;
import X.C1440005kM;
import X.C1533950q1J;
import X.C197039127h;
import X.C20106713lp;
import X.C20280814Xe;
import X.C20286714Zl;
import X.C20287814Zw;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C483280IxK;
import X.C607770Nsd;
import X.C786410Ut5;
import X.EnumC1528090prr;
import X.EnumC20295614bC;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model.AiPdpEnterParams;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.model.AiPdpProductInfo;
import com.ss.android.ugc.aweme.commercialize.quickconversion.aipdp.ui.CommerceAiPdpFragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility;
import com.ss.android.ugc.aweme.detail.prefab.videos.DetailVideoCellAssem;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.pipo.component.nativecamera.NativeCameraPictureTakingFragment;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.csi.CSICreateButtonAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.csi.InspirationParams;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.CsiBotData;
import com.zhiliaoapp.musically.R;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes31.dex */
public class ACListenerS132S0200000_30 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException, UnsupportedEncodingException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS132S0200000_30 aCListenerS132S0200000_30, View view) throws JSONException {
        String str;
        String str2;
        Function1<String, Unit> function1;
        CommerceAiPdpFragment commerceAiPdpFragment = (CommerceAiPdpFragment) aCListenerS132S0200000_30.l0;
        commerceAiPdpFragment.LLIZ = true;
        commerceAiPdpFragment.LLIZLLLIL = "cta_button";
        AiPdpProductInfo aiPdpProductInfo = (AiPdpProductInfo) aCListenerS132S0200000_30.l1;
        String str3 = null;
        if (aiPdpProductInfo != null) {
            str = aiPdpProductInfo.shopNowSelector;
            str2 = aiPdpProductInfo.addCartSelector;
        } else {
            str = null;
            str2 = null;
        }
        boolean zIsOneSku = false;
        if (commerceAiPdpFragment.LLILZIL && C1533950q1J.LJ(str)) {
            ((CommerceAiPdpFragment) aCListenerS132S0200000_30.l0).LLJ = "shop now";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("eventName", "shop_now");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("selector", str);
            AiPdpProductInfo aiPdpProductInfo2 = (AiPdpProductInfo) aCListenerS132S0200000_30.l1;
            if (aiPdpProductInfo2 != null) {
                zIsOneSku = aiPdpProductInfo2.isOneSku();
            }
            jSONObject2.put("is_one_sku", zIsOneSku);
            jSONObject.put("data", jSONObject2);
            AiPdpEnterParams aiPdpEnterParams = ((CommerceAiPdpFragment) aCListenerS132S0200000_30.l0).LLILLJJLI;
            if (aiPdpEnterParams != null) {
                str3 = aiPdpEnterParams.sessionId;
            }
            jSONObject.put("iabContainerId", str3);
            C1440005kM.LIZ(new C1036420d4q(C786410Ut5.J3(jSONObject)));
        } else if (((CommerceAiPdpFragment) aCListenerS132S0200000_30.l0).LLILZLL && C1533950q1J.LJ(str2)) {
            ((CommerceAiPdpFragment) aCListenerS132S0200000_30.l0).LLJ = "add cart";
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("eventName", "add_to_cart");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("selector", str2);
            AiPdpProductInfo aiPdpProductInfo3 = (AiPdpProductInfo) aCListenerS132S0200000_30.l1;
            if (aiPdpProductInfo3 != null) {
                zIsOneSku = aiPdpProductInfo3.isOneSku();
            }
            jSONObject4.put("is_one_sku", zIsOneSku);
            jSONObject3.put("data", jSONObject4);
            AiPdpEnterParams aiPdpEnterParams2 = ((CommerceAiPdpFragment) aCListenerS132S0200000_30.l0).LLILLJJLI;
            if (aiPdpEnterParams2 != null) {
                str3 = aiPdpEnterParams2.sessionId;
            }
            jSONObject3.put("iabContainerId", str3);
            C1440005kM.LIZ(new C1036420d4q(C786410Ut5.J3(jSONObject3)));
        } else {
            CommerceAiPdpFragment commerceAiPdpFragment2 = (CommerceAiPdpFragment) aCListenerS132S0200000_30.l0;
            commerceAiPdpFragment2.LLJ = commerceAiPdpFragment2.getString(2131833078);
        }
        AiPdpEnterParams aiPdpEnterParams3 = ((CommerceAiPdpFragment) aCListenerS132S0200000_30.l0).LLILLJJLI;
        if (aiPdpEnterParams3 != null && (function1 = aiPdpEnterParams3.onExpandAction) != null) {
            function1.invoke("");
        }
    }

    public static final void onClick$1(ACListenerS132S0200000_30 aCListenerS132S0200000_30, View view) {
        DetailVideoCellAssem detailVideoCellAssem = (DetailVideoCellAssem) aCListenerS132S0200000_30.l0;
        InnerFlowAbility<C607770Nsd> innerFlowAbility = detailVideoCellAssem.LLJJLIIIJLLLLLLLZ;
        if (innerFlowAbility != null) {
            innerFlowAbility.Nu0((C607770Nsd) detailVideoCellAssem.bo(), (View) aCListenerS132S0200000_30.l1);
        }
    }

    public static final void onClick$2(ACListenerS132S0200000_30 aCListenerS132S0200000_30, View view) {
        NativeCameraPictureTakingFragment nativeCameraPictureTakingFragment = (NativeCameraPictureTakingFragment) aCListenerS132S0200000_30.l0;
        if (nativeCameraPictureTakingFragment.LLJJIJI) {
            return;
        }
        int i = (nativeCameraPictureTakingFragment.LLJJJ + 1) % 3;
        nativeCameraPictureTakingFragment.LLJJJ = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    nativeCameraPictureTakingFragment.LLJJIJIL = EnumC20295614bC.LLILLL;
                    ((TuxIconView) aCListenerS132S0200000_30.l1).setIconRes(R.raw.icon_color_flash_slash);
                    ((NativeCameraPictureTakingFragment) aCListenerS132S0200000_30.l0).LLJJJ = 0;
                } else {
                    nativeCameraPictureTakingFragment.LLJJIJIL = EnumC20295614bC.LL;
                    ((TuxIconView) aCListenerS132S0200000_30.l1).setIconRes(R.raw.icon_flash_fill);
                }
            } else {
                nativeCameraPictureTakingFragment.LLJJIJIL = EnumC20295614bC.LLILLJJLI;
                ((TuxIconView) aCListenerS132S0200000_30.l1).setIconRes(R.raw.icon_flash_auto_fill);
            }
        } else {
            nativeCameraPictureTakingFragment.LLJJIJIL = EnumC20295614bC.LLILLL;
            ((TuxIconView) aCListenerS132S0200000_30.l1).setIconRes(R.raw.icon_color_flash_slash);
        }
        ((NativeCameraPictureTakingFragment) aCListenerS132S0200000_30.l0).bS();
    }

    public static final void onClick$3(ACListenerS132S0200000_30 aCListenerS132S0200000_30, View view) throws UnsupportedEncodingException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j;
        Message messageYy1;
        String str6;
        AIBotInfo aIBotInfo;
        CsiBotData csiBotData;
        CsiBotData csiBotData2;
        Gson gson = AnonymousClass1428.LIZ;
        TakoEnterParams takoEnterParams = ((CSICreateButtonAssem) aCListenerS132S0200000_30.l0).op().LLILLL;
        String str7 = "";
        if (takoEnterParams == null || (str = takoEnterParams.enterFrom) == null) {
            str = "";
        }
        TakoEnterParams takoEnterParams2 = ((CSICreateButtonAssem) aCListenerS132S0200000_30.l0).op().LLILLL;
        if (takoEnterParams2 == null || (str2 = takoEnterParams2.enterMethod) == null) {
            str2 = "";
        }
        TakoEnterParams takoEnterParams3 = ((CSICreateButtonAssem) aCListenerS132S0200000_30.l0).op().LLILLL;
        if (takoEnterParams3 == null || (csiBotData2 = takoEnterParams3.csiBotData) == null || (str3 = csiBotData2.tagId) == null) {
            str3 = "";
        }
        TakoEnterParams takoEnterParams4 = ((CSICreateButtonAssem) aCListenerS132S0200000_30.l0).op().LLILLL;
        if (takoEnterParams4 == null || (csiBotData = takoEnterParams4.csiBotData) == null || (str4 = csiBotData.inspirationSessionId) == null) {
            str4 = "";
        }
        TakoEnterParams takoEnterParams5 = ((CSICreateButtonAssem) aCListenerS132S0200000_30.l0).op().LLILLL;
        if (takoEnterParams5 == null || (str5 = takoEnterParams5.processId) == null) {
            str5 = "";
        }
        TakoEnterParams takoEnterParams6 = ((CSICreateButtonAssem) aCListenerS132S0200000_30.l0).op().LLILLL;
        if (takoEnterParams6 != null && (aIBotInfo = takoEnterParams6.botInfo) != null) {
            j = aIBotInfo.botId;
        } else {
            j = 0;
        }
        TakoCardAbility takoCardAbility = (TakoCardAbility) ((CSICreateButtonAssem) aCListenerS132S0200000_30.l0).LLJL.getValue();
        if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null && (str6 = messageYy1.uuid) != null) {
            str7 = str6;
        }
        InspirationParams inspirationParams = new InspirationParams("", str, str2, "[\"search\"]", str3, "creator_search_insight", "challenge", "1", false, str4, str5, j, str7, "csi", "create_button");
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("inspiration_result_id", inspirationParams.inspirationResultId), new Pair("enter_from", inspirationParams.enterFrom), new Pair("enter_method", inspirationParams.enterMethod), new Pair("inspiration_type", inspirationParams.inspirationType), new Pair("tag_id", inspirationParams.tagId), new Pair("source", inspirationParams.source), new Pair("shoot_way", inspirationParams.shootWay), new Pair("is_inspiration_scene", inspirationParams.isInspirationScene), new Pair("has_tracker_shoot_event", Boolean.valueOf(inspirationParams.hasTrackerShootEvent)), new Pair("inspiration_session_id", inspirationParams.inspirationSessionId), new Pair("process_id", inspirationParams.processId), new Pair("bot_id", Long.valueOf(inspirationParams.botId)), new Pair("message_id", inspirationParams.messageId), new Pair("bot_type", inspirationParams.botType), new Pair("card_type", inspirationParams.cardType));
        String strEncode = URLEncoder.encode(GsonProtectorUtils.toJson(AnonymousClass1428.LIZ, mapLJIIIIZZ), "UTF-8");
        StringBuilder sb = new StringBuilder("?type=use_challenge");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("&challenge_id=");
        sbLIZ.append(inspirationParams.tagId);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("&extra_log_params=");
        sbLIZ2.append(strEncode);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("&search_extra=");
        sbLIZ3.append(strEncode);
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        for (Map.Entry entry : mapLJIIIIZZ.entrySet()) {
            String str8 = (String) entry.getKey();
            String strEncode2 = URLEncoder.encode(entry.getValue().toString(), "UTF-8");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append('&');
            sbLIZ4.append(str8);
            sbLIZ4.append('=');
            sbLIZ4.append(strEncode2);
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("aweme://openShoot");
        sbLIZ5.append((Object) sb);
        SmartRouter.buildRoute(((C197039127h) aCListenerS132S0200000_30.l1).getContext(), C2188811AlT.LIZIZ(sbLIZ5)).open();
    }

    public static final void onClick$4(ACListenerS132S0200000_30 aCListenerS132S0200000_30, View view) {
        ((TuxSheet) aCListenerS132S0200000_30.l0).dismiss();
        Option option = C20286714Zl.LLJILJIL;
        if (option != null) {
            C20286714Zl.LLJI.LJIILLIIL(option);
        }
        C1440005kM.LIZ(new C483280IxK());
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2((Context) aCListenerS132S0200000_30.l1, 64));
    }

    public static final void onClick$5(ACListenerS132S0200000_30 aCListenerS132S0200000_30, View view) {
        C20280814Xe c20280814Xe = (C20280814Xe) aCListenerS132S0200000_30.l0;
        Option option = c20280814Xe.LLJIJIL;
        if (option != null) {
            c20280814Xe.LJIILLIIL(option);
        }
        C1440005kM.LIZ(new C483280IxK());
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2((Context) aCListenerS132S0200000_30.l1, 65));
    }

    public static final void onClick$6(ACListenerS132S0200000_30 aCListenerS132S0200000_30, View view) {
        Function1 function1 = (Function1) aCListenerS132S0200000_30.l0;
        if (function1 != null) {
            function1.invoke((C20106713lp) aCListenerS132S0200000_30.l1);
        }
    }

    public static final void onClick$7(ACListenerS132S0200000_30 aCListenerS132S0200000_30, View view) {
        C20287814Zw c20287814Zw = (C20287814Zw) aCListenerS132S0200000_30.l0;
        ImageView imageView = (ImageView) aCListenerS132S0200000_30.l1;
        if (c20287814Zw.LLILLL) {
            int i = (int) c20287814Zw.LLIZLLLIL;
            if (new BigDecimal(Float.toString(c20287814Zw.LLIZLLLIL)).subtract(new BigDecimal(Integer.toString(i))).floatValue() == 0.0f) {
                i--;
            }
            if (c20287814Zw.LLILLJJLI.indexOfChild(view) > i) {
                c20287814Zw.setStar(c20287814Zw.LLILLJJLI.indexOfChild(view) + 1);
                return;
            }
            if (c20287814Zw.LLILLJJLI.indexOfChild(view) == i) {
                if (c20287814Zw.LLJILJIL == EnumC1528090prr.Full) {
                    return;
                }
                if (imageView.getDrawable().getCurrent().getConstantState().equals(c20287814Zw.LLJIJIL.getConstantState())) {
                    c20287814Zw.setStar(c20287814Zw.LLILLJJLI.indexOfChild(view) + 1);
                    return;
                } else {
                    c20287814Zw.setStar(c20287814Zw.LLILLJJLI.indexOfChild(view) + 0.5f);
                    return;
                }
            }
            c20287814Zw.setStar(c20287814Zw.LLILLJJLI.indexOfChild(view) + 1.0f);
        }
    }

    public ACListenerS132S0200000_30(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
