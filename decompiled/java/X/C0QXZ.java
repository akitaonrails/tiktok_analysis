package X;

import Y.AfS146S0200000_10;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QXZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QXZ extends FrameLayout implements C0QY2 {
    public final C671890QXb LL;
    public final Function0<Unit> LLILLJJLI;
    public final MutableLiveData<C0QW4> LLILLL;
    public final SmartRoute LLILZ;
    public List<Function1<C0QW4, Unit>> LLILZIL;
    public final String LLILZLL;
    public final Map<String, String> LLIZ;
    public final Map<String, String> LLIZLLLIL;
    public final Map<String, String> LLJ;

    @Override // X.C0QY2
    public void Aj() {
    }

    @Override // X.C0QY2
    public void Rm(int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.C0QY2
    public void f7() {
    }

    @Override // X.C0QY2
    public void fc(Long l) {
    }

    @Override // X.C0QY2
    public abstract /* synthetic */ EnumC671980QXk getEntranceViewType();

    @Override // X.C0QY2
    public void gw(EnumC671640QWc enumC671640QWc) {
    }

    public void setIconBackgroundAlpha(int i) {
    }

    public void setIconTintColorRes(int i) {
    }

    public C2344009Gk LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c2344009Gk.LIZJ(1, "is_ecom_search");
        String str = this.LL.LJIJJ;
        if (str != null) {
            c2344009Gk.LJFF("enter_product_id", str);
        }
        String str2 = this.LL.LIZLLL;
        if (str2 != null) {
            c2344009Gk.LJFF("enter_group_id", str2);
        }
        String str3 = this.LL.LJJIIZI;
        if (str3 != null) {
            c2344009Gk.LJFF("product_panel_type", str3);
        }
        c2344009Gk.LJFF("root_enter_from_type", String.valueOf(this.LL.LJIIJ));
        C1766860w4y.LIZ.getClass();
        String strLIZIZ = C1766860w4y.LIZIZ("traffic_diversion_info");
        if (strLIZIZ != null) {
            c2344009Gk.LJFF("traffic_diversion_info", strLIZIZ);
        }
        return c2344009Gk;
    }

    public final List<Function1<C0QW4, Unit>> getCallbacksWhenRefreshResult() {
        return this.LLILZIL;
    }

    public final MutableLiveData<C0QW4> getCurrentSearchHintWord() {
        return this.LLILLL;
    }

    public final String getDefaultHintWord() {
        return this.LLILZLL;
    }

    public final C671890QXb getEntranceModel() {
        return this.LL;
    }

    public final Function0<Unit> getOnClick() {
        return this.LLILLJJLI;
    }

    public SmartRoute getSmartRoute() {
        return this.LLILZ;
    }

    public SmartRoute LIZIZ(Context context) {
        String strLJIJ;
        String strLIZ;
        int i;
        Word word;
        String word2;
        Word word3;
        String implId;
        Word word4;
        ICommonFeedApiService iCommonFeedApiService = (ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class);
        String str = "";
        if (iCommonFeedApiService == null || (strLJIJ = iCommonFeedApiService.LJIJ()) == null) {
            strLJIJ = "";
        }
        if (this.LL.LJIIJ != C0QXR.DEFAULT.getValue()) {
            C671890QXb c671890QXb = this.LL;
            String str2 = c671890QXb.LIZ;
            if (c671890QXb.LJIIJ == C0QXR.PDP.getValue()) {
                int[] iArr = C0QYF.LIZ;
                if (C0QYF.LIZ(this.LL.LJIIJ)) {
                    str2 = this.LL.LJIILIIL;
                }
            }
            String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("c48787.d46894", PageFinder.via((View) this), null);
            SmartRoute smartRoute = getSmartRoute();
            smartRoute.withParam("root_enter_from_type", this.LL.LJIIJ);
            smartRoute.withParam("enter_from", str2);
            smartRoute.withParam("traffic_source_list", this.LL.LJ);
            smartRoute.withParam("in_single_stack", true);
            smartRoute.withParam("set_hint_by_sug_word", false);
            smartRoute.withParam("keep_tab_position", true);
            smartRoute.withParam("target_tab", EnumC669620QOi.SHOP.getTabName());
            smartRoute.withParam("blankpage_enter_from", this.LL.LIZ);
            smartRoute.withParam("blankpage_enter_method", "enter");
            smartRoute.withParam("group_id", strLJIJ);
            smartRoute.withParam("enter_group_id", strLJIJ);
            C0QW4 value = this.LLILLL.getValue();
            if (value == null || (word4 = value.LIZ) == null || (strLIZ = C1208204o4.LIZ(word4)) == null) {
                strLIZ = "";
            }
            smartRoute.withParam("hint_group_id", strLIZ);
            C0QW4 value2 = this.LLILLL.getValue();
            if (value2 != null && (word3 = value2.LIZ) != null && (implId = word3.getImplId()) != null) {
                str = implId;
            }
            smartRoute.withParam("hint_imp_id", str);
            C0QW4 value3 = this.LLILLL.getValue();
            if (value3 != null) {
                i = value3.LIZIZ;
            } else {
                i = 0;
            }
            smartRoute.withParam("hint_position", i);
            smartRoute.withParam("source_btm_token", strCreateJumpSourceBtmToken);
            EnumC669620QOi[] enumC669620QOiArrValues = EnumC669620QOi.values();
            int iLIZIZ = C2097908Jt.LIZIZ(enumC669620QOiArrValues.length);
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (EnumC669620QOi enumC669620QOi : enumC669620QOiArrValues) {
                linkedHashMap.put(enumC669620QOi.getTabName(), enumC669620QOi);
            }
            if (linkedHashMap.containsKey(this.LL.LJIIJJI)) {
                smartRoute.withParam("single_tab_type", this.LL.LJIIJJI);
            }
            C0QW4 value4 = this.LLILLL.getValue();
            if (value4 != null && (word = value4.LIZ) != null && (word2 = word.getWord()) != null && C123100dR.LIZ(word2)) {
                smartRoute.withParam("search_hint_word", word2);
            }
            String str3 = this.LL.LJIJJ;
            if (str3 != null) {
                smartRoute.withParam("src_material_id", str3);
                this.LLIZLLLIL.put("enter_product_id", str3);
                this.LLJ.put("enter_product_id", str3);
            }
            String str4 = this.LL.LJJIIZ;
            if (str4 != null) {
                smartRoute.withParam("src_anchor_product_id", str4);
            }
            String str5 = this.LL.LJJIIZI;
            if (str5 != null) {
                smartRoute.withParam("product_panel_type", str5);
                this.LLIZLLLIL.put("product_panel_type", str5);
                this.LLJ.put("product_panel_type", str5);
            }
            C671890QXb c671890QXb2 = this.LL;
            String str6 = c671890QXb2.LJIILIIL;
            if (str6 != null) {
                this.LLIZ.put("search_entrance", str6);
            }
            String str7 = c671890QXb2.LJIILJJIL;
            if (str7 != null) {
                this.LLIZ.put("result_search_entrance", str7);
            }
            String str8 = c671890QXb2.LIZIZ;
            if (str8 != null) {
                this.LLIZ.put("enter_from_second", str8);
            }
            String str9 = this.LL.LJIIIIZZ;
            if (str9 != null) {
                smartRoute.withParam("last_search_pid_list", str9);
            }
            smartRoute.withParam("source_btm_token", this.LL.LJJIJLIJ);
            this.LLIZLLLIL.put("enter_group_id", strLJIJ);
            this.LLJ.put("enter_group_id", strLJIJ);
            this.LLIZLLLIL.put("is_ecom_search", "1");
            this.LLJ.put("is_ecom_search", "1");
            Map<String, Object> map = this.LL.LJJIL;
            if (map != null) {
                List list = (List) C1208704o9.LIZIZ.getValue();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (C756302xN.LIZ(list)) {
                    for (Object obj : list) {
                        Object obj2 = map.get(obj);
                        if (obj2 != null) {
                            linkedHashMap2.put(obj, obj2);
                        }
                    }
                } else {
                    linkedHashMap2.putAll(map);
                }
                smartRoute.withParam("ec_search_common_params", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), linkedHashMap2));
            }
            smartRoute.withParam("ec_extra_log_params", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LLIZ));
            smartRoute.withParam("ec_middle_extra_log_params", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LLIZLLLIL));
            smartRoute.withParam("ec_result_extra_log_params", GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), this.LLJ));
            return smartRoute;
        }
        throw new Throwable("generateJumpSearchRoute, rootEnterFromType empty");
    }

    @Override // X.C0QY2
    public final void dn(AwS589S0100000_10 awS589S0100000_10) {
        C013C c013c = new C013C();
        this.LLILZIL.add(new AwS376S0200000_10(awS589S0100000_10, c013c, 127));
        if (!c013c.element && this.LLILLL.getValue() != null) {
            awS589S0100000_10.invoke(this.LLILLL.getValue());
        }
    }

    @Override // X.C0QY2
    public final void ei(C0QW4 c0qw4) {
        this.LLILLL.setValue(c0qw4);
    }

    public final void setCallbacksWhenRefreshResult(List<Function1<C0QW4, Unit>> list) {
        this.LLILZIL = list;
    }

    public final void setDefaultHintWordInView(String str) {
        MutableLiveData<C0QW4> mutableLiveData = this.LLILLL;
        Word word = new Word();
        if (!C123100dR.LIZ(str)) {
            str = this.LLILZLL;
        }
        word.setWord(str);
        mutableLiveData.setValue(new C0QW4(word, 2, 0));
    }

    @Override // X.C0QY2
    public final boolean Gc(C0QYL c0qyl, Function1<? super Boolean, Unit> function1) {
        Object c098200Yq;
        String str;
        if (c0qyl == null) {
            c0qyl = new C0QYL();
        }
        C671890QXb c671890QXb = this.LL;
        c0qyl.LIZJ = c671890QXb.LJI;
        c0qyl.LIZLLL = c671890QXb.LJIJJ;
        c0qyl.LJ = c671890QXb.LJJIIZ;
        c0qyl.LJFF = c671890QXb.LJIJJLI;
        c0qyl.LJI = c671890QXb.LJIL;
        c0qyl.LJII = c671890QXb.LJIILJJIL;
        if (c671890QXb.LJJII == EnumC672060QXs.HALF) {
            c0qyl.LJIIIIZZ = C00BQ.SCENE_HALF_PDP.getValue();
        }
        try {
            C0QXY c0qxy = C0QXY.LIZ;
            C844470XAv.LIZ.getClass();
            if (C2093608Ic.LIZJ(C844470XAv.LJIILL, "local_test")) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c0qyl.LIZ = str;
            c0qxy.getClass();
            C0QXY.LIZ(c0qyl).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS146S0200000_10(function1, this, 2), new AfS146S0200000_10(function1, this, 3));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C2344809Gs.LJ("refreshHintWord request fail: " + thM5exceptionOrNullimpl.getMessage());
            return false;
        }
        return true;
    }

    public C0QXZ(Context context, C671890QXb c671890QXb, Function0 function0) {
        String str;
        super(context, null);
        this.LL = c671890QXb;
        this.LLILLJJLI = function0;
        this.LLILLL = new MutableLiveData<>();
        C672050QXr c672050QXr = C672050QXr.LIZIZ;
        int i = c671890QXb.LJIIJ;
        c672050QXr.getClass();
        Object obj = C0QXQ.LIZ(i).get(C672050QXr.LIZLLL);
        Boolean boolLJI = C672050QXr.LJI(obj != null ? obj.toString() : null);
        if (Intrinsics.LJFF(boolLJI, Boolean.TRUE)) {
            str = "//ec/search";
        } else {
            if (!Intrinsics.LJFF(boolLJI, Boolean.FALSE) && boolLJI != null) {
                throw new C1954807lC();
            }
            str = "//search";
        }
        this.LLILZ = SmartRouter.buildRoute(context, str);
        this.LLILZIL = new ArrayList();
        this.LLILZLL = C1ER1.LIZIZ.LJZ(context);
        this.LLIZ = new LinkedHashMap();
        this.LLIZLLLIL = new LinkedHashMap();
        this.LLJ = new LinkedHashMap();
    }
}
