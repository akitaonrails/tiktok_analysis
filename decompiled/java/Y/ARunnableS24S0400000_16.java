package Y;

import X.AbstractC1014240cV4;
import X.AbstractC1045430dJN;
import X.AbstractC1048230dNt;
import X.C0N4L;
import X.C0NBE;
import X.C1014260cV6;
import X.C1014530cVX;
import X.C1016660cYy;
import X.C1030580cvQ;
import X.C1045340dJE;
import X.C1045640dJi;
import X.C1045720dJq;
import X.C1045770dJv;
import X.C1058910df7;
import X.C1059940dgm;
import X.C1385550m9x;
import X.C1611490s2N;
import X.C16G0;
import X.C16G1;
import X.C1C7U;
import X.C2188811AlT;
import X.C2277881EDy;
import X.C2382909Vj;
import X.C341940Daq;
import X.C588650N6x;
import X.C786410Ut5;
import X.C810560Vqw;
import X.EnumC1254690ikt;
import X.EnumC1999407sO;
import X.InterfaceC1048240dNu;
import X.InterfaceC1048290dNz;
import X.InterfaceC634840OvC;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class ARunnableS24S0400000_16 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int i;
        int i2;
        int i3 = 63;
        int i4 = 0;
        try {
            String string = JSONObjectProtectorUtils.getString((JSONObject) this.l0, "user_id");
            String strOptString = ((JSONObject) this.l0).optString("sec_user_id");
            C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
            long j = c2277881EDy.queryUser(c2277881EDy.userUrl(strOptString, string, null, 0, EnumC1254690ikt.WATCH_LIVE), false, null).roomId;
            if (j == 0) {
                i2 = 47;
                i = 0;
            } else {
                i = 1;
                i2 = 31;
            }
            ((JSONObject) this.l0).put("room_id", String.valueOf(j));
            i4 = i;
            i3 = i2;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C810560Vqw.LIZJ(new ARunnableS5S0102000_16(this, i3, i4, 1));
    }

    public final void LIZ$1() {
        int i = 63;
        try {
            String string = JSONObjectProtectorUtils.getString((JSONObject) this.l0, "user_id");
            String strOptString = ((JSONObject) this.l0).optString("sec_user_id");
            C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
            long j = c2277881EDy.queryUser(c2277881EDy.userUrl(strOptString, string, null, 0, EnumC1254690ikt.WATCH_LIVE), false, null).roomId;
            int i2 = j == 0 ? 47 : 31;
            ((JSONObject) this.l0).put("room_id", String.valueOf(j));
            i = i2;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C810560Vqw.LIZJ(new ARunnableS10S0301000_16(i, (C1059940dgm) this.l1, (C1058910df7) this.l2, (CompletionBlock) this.l3, 0));
    }

    public final void LIZ$2() {
        if (((ViewGroup) this.l0).getParent() == null) {
            ((AbstractC1014240cV4) this.l1).LJIIZILJ();
            return;
        }
        AbstractC1014240cV4 abstractC1014240cV4 = (AbstractC1014240cV4) this.l1;
        AnimatorSet animatorSetLIZJ = C1014530cVX.LIZJ(abstractC1014240cV4, (ViewGroup) this.l0, (View) this.l2, ((AnoleComponentAppearModel) this.l3).animations, false);
        if (animatorSetLIZJ != null) {
            animatorSetLIZJ.start();
            animatorSetLIZJ.addListener(new ALAdapterS12S0100000_16(abstractC1014240cV4, 19));
        } else {
            animatorSetLIZJ = null;
        }
        abstractC1014240cV4.LLJJJIL = animatorSetLIZJ;
    }

    public final void LIZ$3() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        AbstractC1014240cV4 abstractC1014240cV4 = (AbstractC1014240cV4) this.l0;
        if (abstractC1014240cV4.LLILZIL) {
            abstractC1014240cV4.LJIILL();
            return;
        }
        boolean z = false;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.LJLZ(8, (ViewGroup) this.l1);
            ViewGroup viewGroup = ((AbstractC1014240cV4) this.l0).LLJJIJI;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
            }
            ((AbstractC1014240cV4) this.l0).LJIIIIZZ(String.valueOf(th.getMessage()));
            ((AbstractC1014240cV4) this.l0).LJIILL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show fail, because exception, ");
            sbLIZ.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (((ViewGroup) this.l1).getParent() == null) {
            throw new C0NBE("after post, containerView.parent = null");
        }
        ((AbstractC1014240cV4) this.l0).LJIILL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("containerView width: ");
        sbLIZ2.append(C341940Daq.LIZIZ(((ViewGroup) this.l1).getWidth()));
        sbLIZ2.append(", height: ");
        sbLIZ2.append(C341940Daq.LIZIZ(((ViewGroup) this.l1).getHeight()));
        C2188811AlT.LIZIZ(sbLIZ2);
        C1014260cV6.LJ((View) this.l2, (ViewGroup) this.l1, (AnoleComponentAppearModel) this.l3, (AbstractC1014240cV4) this.l0);
        ViewGroup.LayoutParams layoutParams = ((View) this.l2).getLayoutParams();
        AnimatorSet animatorSet = null;
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            AbstractC1014240cV4 abstractC1014240cV42 = (AbstractC1014240cV4) this.l0;
            View view = (View) this.l2;
            ViewGroup viewGroup2 = (ViewGroup) this.l1;
            abstractC1014240cV42.LJIILL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("show_layout_debug contentWidth=");
            sbLIZ3.append(C341940Daq.LIZIZ(view.getWidth()));
            sbLIZ3.append(",contentHeight=");
            sbLIZ3.append(C341940Daq.LIZIZ(view.getHeight()));
            sbLIZ3.append(",layoutWidth=");
            sbLIZ3.append(marginLayoutParams.width);
            sbLIZ3.append(",layoutHeight=");
            sbLIZ3.append(marginLayoutParams.height);
            sbLIZ3.append(",marginStart=");
            sbLIZ3.append(marginLayoutParams.getMarginStart());
            sbLIZ3.append(",marginEnd=");
            sbLIZ3.append(marginLayoutParams.getMarginEnd());
            sbLIZ3.append(",topMargin=");
            sbLIZ3.append(marginLayoutParams.topMargin);
            sbLIZ3.append(",bottomMargin=");
            sbLIZ3.append(marginLayoutParams.bottomMargin);
            sbLIZ3.append(",finalMargins=");
            sbLIZ3.append(abstractC1014240cV42.LLJJJ);
            sbLIZ3.append(",containerVisibility=");
            sbLIZ3.append(viewGroup2.getVisibility());
            sbLIZ3.append(",contentVisibility=");
            sbLIZ3.append(view.getVisibility());
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        if (!C1016660cYy.LIZJ((AnoleComponentAppearModel) this.l3)) {
            C786410Ut5.LJLLLLLL(0, (View) this.l2);
            ((AbstractC1014240cV4) this.l0).LJIJ((View) this.l2);
        } else if (((AnoleComponentAppearModel) this.l3).progressZeroNoAnimation()) {
            C1014530cVX.LIZ((View) this.l2, (AnoleComponentAppearModel) this.l3, (AbstractC1014240cV4) this.l0);
        } else {
            AbstractC1014240cV4 abstractC1014240cV43 = (AbstractC1014240cV4) this.l0;
            ViewGroup viewGroup3 = (ViewGroup) this.l1;
            View view2 = (View) this.l2;
            AnimatorSet animatorSetLIZJ = C1014530cVX.LIZJ(abstractC1014240cV43, viewGroup3, view2, ((AnoleComponentAppearModel) this.l3).animations, true);
            if (animatorSetLIZJ != null) {
                C786410Ut5.LJLLLLLL(0, view2);
                animatorSetLIZJ.start();
                animatorSetLIZJ.addListener(new ALAdapterS11S0200000_16(view2, abstractC1014240cV43, 15));
                animatorSet = animatorSetLIZJ;
            }
            abstractC1014240cV43.LLJJJIL = animatorSet;
        }
        ((AbstractC1014240cV4) this.l0).LJII((AnoleComponentAppearModel) this.l3);
        z = true;
        abstractC1014240cV4.LLILZIL = z;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0dNq, X.0qPp] */
    public final void LIZ$4() {
        C1385550m9x c1385550m9x = (C1385550m9x) this.l0;
        final JSONObject jSONObject = (JSONObject) this.l1;
        c1385550m9x.getClass();
        InterfaceC1048240dNu interfaceC1048240dNu = new InterfaceC1048240dNu() { // from class: X.0dOB
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final Map<String, Object> convert() {
                return null;
            }

            @Override // X.InterfaceC1048240dNu
            public final String getEventName() {
                return jSONObject.optString("eventName");
            }

            @Override // X.InterfaceC1048240dNu
            public final Map<String, Object> getExtJson() {
                C1543800qHC c1543800qHC = C1543800qHC.LIZ;
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extJson");
                c1543800qHC.getClass();
                Map mapLIZIZ = C1543800qHC.LIZIZ(jSONObjectOptJSONObject);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : mapLIZIZ.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return linkedHashMap;
            }

            @Override // X.InterfaceC1048240dNu
            public final String getExtValue() {
                return jSONObject.optString("extValue");
            }

            @Override // X.InterfaceC1048240dNu
            public final String getLabelName() {
                return jSONObject.optString("labelName");
            }

            @Override // X.InterfaceC1048240dNu
            public final String getValue() {
                return jSONObject.optString("value");
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final JSONObject toJSON() {
                return new JSONObject();
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel
            public final List<String> provideParamList() {
                return C13BV.INSTANCE;
            }
        };
        ?? r2 = new AbstractC1048230dNt() { // from class: X.0dNq
            public static final void LIZJ(JSONObject jSONObject2, C1035880d3y c1035880d3y) throws JSONException {
                Long l;
                jSONObject2.put("tt_visible", !C1906580ziK.LJI());
                if (c1035880d3y == null) {
                    jSONObject2.put("page_visible_status", EnumC1037150d61.UNKNOWN.getValue());
                    return;
                }
                jSONObject2.put("stopLoading", c1035880d3y.getWebLoadStatusModel().stopLoading);
                jSONObject2.put("landing_page_style", c1035880d3y.isNineScreen());
                jSONObject2.put("lp_refer", c1035880d3y.getRefer());
                jSONObject2.put("sheet_ratio", c1035880d3y.getSheetRatio());
                C1035890d3z adCommonData = c1035880d3y.getAdCommonData();
                jSONObject2.put("page_visible_status", adCommonData.webViewVisible.getValue());
                Long l2 = adCommonData.enterWebViewTimeStamp;
                if (adCommonData.webViewVisible == EnumC1037150d61.INVISIBLE && (l = adCommonData.exitWebViewTimeStamp) != null) {
                    jSONObject2.put("time_to_leave", SystemClock.elapsedRealtime() - l.longValue());
                    if (l2 != null) {
                        jSONObject2.put("page_stay_duration", l.longValue() - l2.longValue());
                    } else {
                        return;
                    }
                } else if (l2 == null) {
                    return;
                }
                jSONObject2.put("time_to_page_show", SystemClock.elapsedRealtime() - l2.longValue());
            }

            /* JADX WARN: Removed duplicated region for block: B:133:0x0250  */
            /* JADX WARN: Removed duplicated region for block: B:206:0x0417  */
            /* JADX WARN: Removed duplicated region for block: B:214:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(X.InterfaceC1048240dNu r30, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.InterfaceC1048290dNz> r31) {
                /*
                    Method dump skipped, instruction units count: 1074
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1048200dNq.LIZLLL(X.0dNu, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock):void");
            }

            @Override // X.AbstractC1549150qPp
            public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                try {
                    LIZLLL((InterfaceC1048240dNu) xBaseParamModel, completionBlock);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
                }
            }
        };
        final Activity activity = (Activity) this.l2;
        r2.setBridgeContext(new InterfaceC634840OvC() { // from class: X.0dOC
            @Override // X.InterfaceC634840OvC
            public final C1543410qGZ LIZJ() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final String getContainerID() {
                return "";
            }

            @Override // X.InterfaceC634840OvC
            public final View getView() {
                return null;
            }

            @Override // X.InterfaceC634840OvC
            public final void sendEvent(String str, JSONObject jSONObject2) {
            }

            @Override // X.InterfaceC634840OvC
            public final Activity LIZLLL() {
                return activity;
            }

            @Override // X.InterfaceC634840OvC
            public final Context getContext() {
                return activity;
            }

            @Override // X.InterfaceC634840OvC
            public final <T> T LIZIZ(Class<T> cls) {
                if (SchemaParserData.class.isAssignableFrom(cls)) {
                    return cls.cast(C2195221Avo.LJII);
                }
                return null;
            }
        });
        final C1385550m9x c1385550m9x2 = (C1385550m9x) this.l0;
        final Number number = (Number) this.l3;
        CompletionBlock<InterfaceC1048290dNz> completionBlock = new CompletionBlock<InterfaceC1048290dNz>() { // from class: X.0dOD
            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                C1385550m9x c1385550m9x3 = c1385550m9x2;
                Number number2 = number;
                c1385550m9x3.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("is_success", true);
                c1385550m9x3.LJFF(number2, jSONObject2);
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
            public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                C1385550m9x c1385550m9x3 = c1385550m9x2;
                Number number2 = number;
                c1385550m9x3.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("is_success", true);
                c1385550m9x3.LJ(number2, jSONObject2);
            }
        };
        try {
            r2.LIZLLL(interfaceC1048240dNu, completionBlock);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, "", null, 4);
        }
    }

    public static final void run$0(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeParamMethod@7f80.watchLive$1");
        try {
            aRunnableS24S0400000_16.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeParamMethod@7f80.watchLive$1");
    }

    public static final void run$1(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeParamMethodIDL@9699.watchLive$1");
        try {
            aRunnableS24S0400000_16.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeParamMethodIDL@9699.watchLive$1");
    }

    public static final void run$2(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("PdpFragment@ab0c.initWidget$5$3$1$1");
        try {
            ((ViewGroup.MarginLayoutParams) ((C16G1) aRunnableS24S0400000_16.l0)).bottomMargin = ((View) aRunnableS24S0400000_16.l1).getHeight();
            C16G0 c16g0 = ((PdpFragment) aRunnableS24S0400000_16.l2).LLJZIJLIL;
            if (c16g0 != null) {
                c16g0.addView((FrameLayout) aRunnableS24S0400000_16.l3, (C16G1) aRunnableS24S0400000_16.l0);
            }
            ((FrameLayout) aRunnableS24S0400000_16.l3).bringToFront();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PdpFragment@ab0c.initWidget$5$3$1$1");
    }

    public static final void run$3(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("BaseOMSDKServiceImpl@6d53.mayTriggerSkipAndFinishAdSessionWithDelay$1");
        try {
            ((C1045640dJi) aRunnableS24S0400000_16.l0).LJIIZILJ((C1045720dJq) aRunnableS24S0400000_16.l1, (C588650N6x) aRunnableS24S0400000_16.l2, "play_complete");
            ((AbstractC1045430dJN) aRunnableS24S0400000_16.l3).LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseOMSDKServiceImpl@6d53.mayTriggerSkipAndFinishAdSessionWithDelay$1");
    }

    public static final void run$4(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleComponent@2a5f.hide$1");
        try {
            aRunnableS24S0400000_16.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleComponent@2a5f.hide$1");
    }

    public static final void run$5(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AnoleComponent@2a5f.show$2");
        try {
            aRunnableS24S0400000_16.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnoleComponent@2a5f.show$2");
    }

    public static final void run$6(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        C1045340dJE c1045340dJE = (C1045340dJE) aRunnableS24S0400000_16.l0;
        C0N4L c0n4l = (C0N4L) aRunnableS24S0400000_16.l1;
        Aweme aweme = (Aweme) aRunnableS24S0400000_16.l2;
        AbstractC1045430dJN abstractC1045430dJN = (AbstractC1045430dJN) aRunnableS24S0400000_16.l3;
        c1045340dJE.getClass();
        C1C7U.LIZ("AdOmSdkManager@a4ef.mayTriggerSkipAndFinishAdSessionWithDelay$1L");
        C1045340dJE.LIZJ(c0n4l, aweme, "play_complete");
        if (abstractC1045430dJN != null) {
            abstractC1045430dJN.LIZJ();
        }
        C1C7U.LIZIZ("AdOmSdkManager@a4ef.mayTriggerSkipAndFinishAdSessionWithDelay$1L");
    }

    public static final void run$7(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("AdOmSdkManager@a4ef.onClick$2");
        try {
            C1045770dJv c1045770dJvLJIIJJI = ((C1045340dJE) aRunnableS24S0400000_16.l3).LJIIJJI((Context) aRunnableS24S0400000_16.l0, (View) aRunnableS24S0400000_16.l2, (Aweme) aRunnableS24S0400000_16.l1);
            if (c1045770dJvLJIIJJI != null) {
                c1045770dJvLJIIJJI.LIZ(EnumC1999407sO.CLICK);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdOmSdkManager@a4ef.onClick$2");
    }

    public static final void run$8(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("MinisSendLogMethodNative@f54b.handle$1");
        try {
            aRunnableS24S0400000_16.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisSendLogMethodNative@f54b.handle$1");
    }

    public static final void run$9(ARunnableS24S0400000_16 aRunnableS24S0400000_16) {
        boolean zLIZ;
        C1C7U.LIZ("MiniAppServiceProxy@cf.openMiniApp$3");
        try {
            if (((C1030580cvQ) aRunnableS24S0400000_16.l3).LIZ() != null && !(((C1030580cvQ) aRunnableS24S0400000_16.l3).LIZIZ() instanceof C1030580cvQ)) {
                ((C1030580cvQ) aRunnableS24S0400000_16.l3).LIZIZ().openMiniApp((Context) aRunnableS24S0400000_16.l0, (MicroAppInfo) aRunnableS24S0400000_16.l1, (C1611490s2N) aRunnableS24S0400000_16.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MiniAppServiceProxy@cf.openMiniApp$3");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS24S0400000_16(android.view.View r2, android.view.ViewGroup r3, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel r4, X.AbstractC1014240cV4 r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            int r6 = 4 - r6
            if (r6 == 0) goto L13
            r0 = r1
            r0.l0 = r5
            r0.l1 = r3
            r0.l2 = r2
            r0.l3 = r4
        Lf:
            r0.<init>()
            return
        L13:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r5
            r0.l2 = r2
            r0.l3 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS24S0400000_16.<init>(android.view.View, android.view.ViewGroup, com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel, X.0cV4, int):void");
    }

    public ARunnableS24S0400000_16(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l3 = obj3;
        this.l0 = obj;
        this.l1 = obj4;
        this.l2 = obj2;
    }
}
