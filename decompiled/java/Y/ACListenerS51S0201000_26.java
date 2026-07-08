package Y;

import X.C0WZX;
import X.C1716310ulR;
import X.C1721980uua;
import X.C1742820vSC;
import X.C1743160vSk;
import X.C1743170vSl;
import X.C1857350yQv;
import X.C1857750yRZ;
import X.C2097608Jq;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.ttpay.recharge.network.Amount;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerFrame;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.BannerType;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserGuideItem;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes27.dex */
public class ACListenerS51S0201000_26 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
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
        }
    }

    public static final void onClick$0(ACListenerS51S0201000_26 aCListenerS51S0201000_26, View view) throws Throwable {
        int length = 0;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "click"), new Pair("option_id", "button_" + ((Amount) aCListenerS51S0201000_26.l0).value), new Pair("option_type", "amount_selected"), new Pair("rank", String.valueOf(aCListenerS51S0201000_26.i2 + 1)));
        mapLJIIJ.putAll(((C1721980uua) aCListenerS51S0201000_26.l1).LLJJIJI);
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("pipo_option_click", mapLJIIJ);
        ((C1721980uua) aCListenerS51S0201000_26.l1).e0();
        view.setBackgroundResource(R.drawable.aqv);
        EditText editText = ((C1721980uua) aCListenerS51S0201000_26.l1).LLJJI;
        if (editText != null) {
            editText.setText(((Amount) aCListenerS51S0201000_26.l0).value);
            Editable editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhwMOXCw4YwRSzxfnVPcxJoskQoC66PRHLsUZ7j4+9lIy/3EcqONU4Pr7m8E=", null));
            if (editableLLJILLL != null) {
                length = editableLLJILLL.length();
            }
            editText.setSelection(length);
        }
    }

    public static final void onClick$1(ACListenerS51S0201000_26 aCListenerS51S0201000_26, View view) throws JSONException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (((C1743170vSl) aCListenerS51S0201000_26.l0).LLILLL.getAlpha() > 0.8f) {
            BannerFrame bannerFrame = (BannerFrame) ListProtector.get(((C1743170vSl) aCListenerS51S0201000_26.l0).LLILZIL, aCListenerS51S0201000_26.i2);
            Context context = ((SmartImageView) aCListenerS51S0201000_26.l1).getContext();
            String str6 = bannerFrame.schema;
            if (str6 == null) {
                str6 = "";
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str6);
            C1742820vSC c1742820vSC = ((C1743170vSl) aCListenerS51S0201000_26.l0).LLILZ.LL;
            String str7 = null;
            if (c1742820vSC != null) {
                str = c1742820vSC.LJIIIIZZ;
            } else {
                str = null;
            }
            String str8 = "auction";
            if (Intrinsics.LJFF(str, "auction")) {
                str2 = "auction_banner";
            } else {
                str8 = "trends";
                str2 = "trends_banner";
            }
            Integer num = bannerFrame.bannerType;
            int value = BannerType.ChannelBannerFrameType_Shop.getValue();
            String str9 = "homepage_mall";
            if (num != null && num.intValue() == value) {
                JSONObject jSONObject = new JSONObject();
                C1743170vSl c1743170vSl = (C1743170vSl) aCListenerS51S0201000_26.l0;
                jSONObject.put("source_previous_page", str8);
                jSONObject.put("enter_method", str2);
                C1742820vSC c1742820vSC2 = c1743170vSl.LLILZ.LL;
                if (c1742820vSC2 != null) {
                    str5 = c1742820vSC2.LJII;
                } else {
                    str5 = null;
                }
                jSONObject.put("source_module", str5);
                IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
                if (iECommerceMallService == null || !iECommerceMallService.hitTopTabExpExperiment()) {
                    str9 = "mall";
                }
                jSONObject.put("enter_from", str9);
                smartRouteBuildRoute.withParam("trackParams", C786410Ut5.J3(jSONObject));
            } else {
                Integer num2 = bannerFrame.bannerType;
                int value2 = BannerType.ChannelBannerFrameType_Live.getValue();
                if (num2 != null && num2.intValue() == value2) {
                    JSONObject jSONObject2 = new JSONObject();
                    C1742820vSC c1742820vSC3 = ((C1743170vSl) aCListenerS51S0201000_26.l0).LLILZ.LL;
                    if (c1742820vSC3 != null) {
                        str3 = c1742820vSC3.LJII;
                    } else {
                        str3 = null;
                    }
                    jSONObject2.put("source_module", str3);
                    jSONObject2.put("previous_page", str8);
                    jSONObject2.put("action_type", "click");
                    jSONObject2.put("enter_method", str2);
                    smartRouteBuildRoute.withParam("log_extra", C786410Ut5.J3(jSONObject2));
                    IECommerceMallService iECommerceMallService2 = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
                    if (iECommerceMallService2 == null || !iECommerceMallService2.hitTopTabExpExperiment()) {
                        str9 = "mall";
                    }
                    smartRouteBuildRoute.withParam("enter_from_merge", str9);
                    smartRouteBuildRoute.withParam("enter_method", str2);
                }
            }
            smartRouteBuildRoute.open();
            C1743160vSk c1743160vSk = C1743160vSk.LIZ;
            int i = aCListenerS51S0201000_26.i2;
            TrendingListViewModel trendingListViewModel = ((C1743170vSl) aCListenerS51S0201000_26.l0).LLILZ;
            PageFinder pageFinder = trendingListViewModel.LLILZLL;
            C1742820vSC c1742820vSC4 = trendingListViewModel.LL;
            if (c1742820vSC4 != null) {
                str7 = c1742820vSC4.LJIIIIZZ;
                str4 = c1742820vSC4.LJFF;
            } else {
                str4 = null;
            }
            c1743160vSk.getClass();
            C1743160vSk.LIZ(bannerFrame, "tiktokec_banner_click", i, pageFinder, str7, str4);
        }
    }

    public static final void onClick$2(ACListenerS51S0201000_26 aCListenerS51S0201000_26, View view) {
        Boolean boolLIZ = C1857750yRZ.LIZ(view);
        if (boolLIZ != null) {
            boolLIZ.booleanValue();
            Function2 function2 = (Function2) aCListenerS51S0201000_26.l0;
            String str = ((TakoUserGuideItem) aCListenerS51S0201000_26.l1).text;
            if (str == null) {
                str = "";
            }
            function2.invoke(C1857350yQv.LIZIZ(str), Integer.valueOf(aCListenerS51S0201000_26.i2));
        }
    }

    public ACListenerS51S0201000_26(Object obj, int i, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.l1 = obj2;
    }
}
