package X;

import Y.AAListenerS262S0200000_7;
import Y.AUListenerS0S0200004_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.dataChannel.FullScreenSurveyShowing;
import com.bytedance.android.livesdk.survey.fullscreenstyle.InnerSurveyViewModel;
import com.bytedance.android.livesdk.survey.fullscreenstyle.LiveInnerSurveyTtmOptSetting;
import com.bytedance.android.livesdk.survey.model.SurveyData;
import com.bytedance.android.livesdk.survey.model.SurveyShowMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tiktok.ttm.TTMCore;
import com.tiktok.ttm.TTMInput;
import com.tiktok.ttm.TTMOutput;
import com.tiktok.ttm.TTMParamData;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482930Iwl extends FrameLayout {
    public static final int LLLF = (int) C497740JfY.LIZIZ(4.0f);
    public View LL;
    public View LLILLJJLI;
    public C1324720kZq LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public InnerSurveyViewModel LLILZLL;
    public boolean LLIZ;
    public EnumC482940Iwm LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;
    public float LLJJJIL;
    public float LLJJJJ;
    public float LLJJJJJIL;
    public float LLJJJJLIIL;
    public float LLJJL;
    public float LLJJLIIIJLLLLLLLZ;
    public Function0<Boolean> LLJL;
    public boolean LLJLIL;
    public Boolean LLJLILLLLZIIL;
    public ValueAnimator LLJLL;
    public boolean LLJLLIL;
    public final C01GW LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public final AwS586S0100000_7 LLL;

    public final void LJ() {
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            float y = view.getY();
            long jAbs = (this.LLJJIJIL > y || y > 0.0f) ? 0L : (long) ((Math.abs(y - 0.0f) / this.LLJJJ) * 250);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playDragDownAnim[1]: startY=");
            sbLIZ.append(y);
            sbLIZ.append(" videoTargetTransY=");
            sbLIZ.append(this.LLJJIJIL);
            sbLIZ.append(" duration=");
            sbLIZ.append(jAbs);
            C2188811AlT.LIZIZ(sbLIZ);
            if (jAbs <= 0.0f) {
                C786410Ut5.Ld(view, 0.0f);
                LJI(1.0f);
                C786410Ut5.Kd(this.LLJJIII, getSurveyContainer());
                View view2 = this.LL;
                if (view2 != null) {
                    C786410Ut5.T4(view2, 1.0f);
                }
                View view3 = this.LL;
                if (view3 != null) {
                    C500260Jjc.LLFFF(view3);
                }
                setCurrentInnerStatus(EnumC482940Iwm.CLOSED);
                return;
            }
            View view4 = this.LL;
            float alpha = view4 != null ? view4.getAlpha() : 0.0f;
            float scaleY = view.getScaleY();
            float f = (scaleY - 1) / y;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("playDragDownAnim[2]: scaleNow=");
            sbLIZ2.append(scaleY);
            sbLIZ2.append(" scaleSpeed=");
            sbLIZ2.append(f);
            sbLIZ2.append(" startY=");
            sbLIZ2.append(y);
            sbLIZ2.append(" endY=");
            sbLIZ2.append(0.0f);
            C2188811AlT.LIZIZ(sbLIZ2);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y, 0.0f);
            this.LLJLL = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(jAbs);
            }
            ValueAnimator valueAnimator2 = this.LLJLL;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new AUListenerS0S0200004_7(y, scaleY, f, this, view, alpha, 0));
            }
            ValueAnimator valueAnimator3 = this.LLJLL;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new AAListenerS262S0200000_7(view, this, 3));
            }
            ValueAnimator valueAnimator4 = this.LLJLL;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    public final void LJFF() {
        C500260Jjc.LLFFF(getSurveyContainer());
        C1143680frq.LIZLLL(this.LLILLL, C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_full_screen_survey_bg.png");
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.LLILLJJLI;
        if (view != null) {
            float y = view.getY();
            float f = this.LLJJIJIL;
            long jAbs = (f > y || y > 0.0f) ? 0L : (long) ((Math.abs(y - f) / this.LLJJJ) * 250);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("playSlideUpAnim[1]: startY=");
            sbLIZ.append(y);
            sbLIZ.append(" videoTargetTransY=");
            sbLIZ.append(this.LLJJIJIL);
            sbLIZ.append(" duration=");
            sbLIZ.append(jAbs);
            C2188811AlT.LIZIZ(sbLIZ);
            if (jAbs <= 0.0f) {
                C786410Ut5.Ld(view, this.LLJJIJIL);
                LJI(1 - this.LLJJJJ);
                C786410Ut5.Kd(this.LLJJJIL, getSurveyContainer());
                View view2 = this.LL;
                if (view2 != null) {
                    C786410Ut5.T4(view2, 0.0f);
                }
                View view3 = this.LL;
                if (view3 != null) {
                    C500260Jjc.LJIILIIL(view3);
                }
                setCurrentInnerStatus(EnumC482940Iwm.OPENED);
                return;
            }
            View view4 = this.LL;
            float alpha = view4 != null ? view4.getAlpha() : 0.0f;
            float f2 = this.LLJJIJIL;
            float scaleY = view.getScaleY();
            float f3 = (scaleY - (1 - this.LLJJJJ)) / (y - this.LLJJIJIL);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("playSlideUpAnim[2]: scaleNow=");
            sbLIZ2.append(scaleY);
            sbLIZ2.append(" scaleSpeed=");
            sbLIZ2.append(f3);
            sbLIZ2.append(" startY=");
            sbLIZ2.append(y);
            sbLIZ2.append(" endY=");
            sbLIZ2.append(f2);
            C2188811AlT.LIZIZ(sbLIZ2);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y, f2);
            this.LLJLL = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(jAbs);
            }
            ValueAnimator valueAnimator2 = this.LLJLL;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new AUListenerS0S0200004_7(y, scaleY, f3, this, view, alpha, 1));
            }
            ValueAnimator valueAnimator3 = this.LLJLL;
            if (valueAnimator3 != null) {
                valueAnimator3.addListener(new AAListenerS262S0200000_7(view, this, 4));
            }
            ValueAnimator valueAnimator4 = this.LLJLL;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    private final C482950Iwn getRoundedCornerProvider() {
        return (C482950Iwn) this.LLJLLL.getValue();
    }

    public final void LIZJ() {
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZLL;
        if (innerSurveyViewModel != null) {
            EnumC482970Iwp enumC482970Iwp = innerSurveyViewModel.LLIZLLLIL ? EnumC482970Iwp.SUBMIT : (innerSurveyViewModel.LLILLL == null || innerSurveyViewModel.LLILZIL.size() <= 0) ? innerSurveyViewModel.LLILLL != null ? EnumC482970Iwp.SELECTED : EnumC482970Iwp.CANCEL : EnumC482970Iwp.SELECTED_SECONDARY;
            if (innerSurveyViewModel.LLJJL && !innerSurveyViewModel.LLJJLIIIJLLLLLLLZ) {
                innerSurveyViewModel.BQ2();
                innerSurveyViewModel.CQ2();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = innerSurveyViewModel.LLJILJIL;
                long j2 = jElapsedRealtime - j;
                if (j > 0 && !Intrinsics.LJFF(enumC482970Iwp.getMethod(), "nl")) {
                    innerSurveyViewModel.JQ2("primary", j2, enumC482970Iwp);
                    innerSurveyViewModel.HQ2();
                }
                SurveyData surveyData = innerSurveyViewModel.LL;
                if (surveyData != null && surveyData.surveyVersion == 3 && innerSurveyViewModel.LLJJIII > 0) {
                    innerSurveyViewModel.JQ2("secondary", j2, enumC482970Iwp);
                    innerSurveyViewModel.IQ2();
                }
                innerSurveyViewModel.LLJILJILJ = 0L;
                innerSurveyViewModel.LLJILLL = 0L;
                innerSurveyViewModel.LLJJIII = 0L;
                innerSurveyViewModel.LLJJLIIIJLLLLLLLZ = true;
                DataChannel dataChannel = innerSurveyViewModel.getDataChannel();
                if (dataChannel != null) {
                    dataChannel.zW(FullScreenSurveyShowing.class, Boolean.FALSE);
                }
            }
        }
        setSurveyEnable(false);
        LJII();
    }

    public final boolean LIZLLL() {
        String str;
        C0IHW c0ihw;
        SurveyData surveyData;
        SurveyShowMode surveyShowMode;
        List<String> list;
        SurveyData surveyData2;
        SurveyShowMode surveyShowMode2;
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZLL;
        if (innerSurveyViewModel == null || (surveyData2 = innerSurveyViewModel.LL) == null || (surveyShowMode2 = surveyData2.showMode) == null) {
            str = null;
            if (innerSurveyViewModel == null) {
                c0ihw = null;
            }
            if (str != null || c0ihw == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("surveyEnableCheck: false rawCode=");
                sbLIZ.append(str);
                sbLIZ.append(" rawParams=");
                sbLIZ.append(c0ihw);
                C2188811AlT.LIZIZ(sbLIZ);
                return false;
            }
            TTMCore tTMCore = TTMCore.getInstance();
            if (!tTMCore.isInit()) {
                return false;
            }
            HashMap map = new HashMap();
            InnerSurveyViewModel innerSurveyViewModel2 = this.LLILZLL;
            if (innerSurveyViewModel2 == null || (surveyData = innerSurveyViewModel2.LL) == null || (surveyShowMode = surveyData.showMode) == null || (list = surveyShowMode.filterNeedFeatureKeys) == null || !(!list.isEmpty())) {
                map.put("watch_time", Long.valueOf((System.currentTimeMillis() - c0ihw.LIZJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
                map.put("has_send_live_goal", Boolean.valueOf(c0ihw.LJFF));
                map.put("live_goal_success", Boolean.valueOf(c0ihw.LJI));
                map.put("send_gift_count", Integer.valueOf(c0ihw.LJII));
                map.put("send_gift_amount", Integer.valueOf(c0ihw.LJIIIIZZ));
                map.put("total_comment_views", Integer.valueOf(c0ihw.LJIIIZ));
                map.put("send_gift_id_cnt_map", c0ihw.LJ);
                long[] jArrLLIIIILZ = C13LP.LLIIIILZ(c0ihw.LJ.keySet());
                int length = jArrLLIIIILZ.length;
                Long[] lArr = new Long[length];
                for (int i = 0; i < length; i++) {
                    lArr[i] = Long.valueOf(jArrLLIIIILZ[i]);
                }
                map.put("send_gift_ids", lArr);
            } else {
                map.putAll(C483390IxV.LIZ.LJII(list, this.LLL));
            }
            TTMInput tTMInput = new TTMInput();
            tTMInput.machineCode = str;
            tTMInput.paramType = TTMInput.ParamType.TYPE_MAP;
            tTMInput.paramData = new TTMParamData((Map<String, Object>) map);
            TTMOutput tTMOutputExecute = tTMCore.execute(tTMInput);
            Object data = tTMOutputExecute != null ? tTMOutputExecute.getData() : null;
            boolean zLJFF = Intrinsics.LJFF(data, Boolean.TRUE);
            Objects.toString(this.LLIZLLLIL);
            map.toString();
            Objects.toString(data);
            return zLJFF;
        }
        str = surveyShowMode2.filterExpression;
        c0ihw = innerSurveyViewModel.LLJLL;
        if (str != null) {
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("surveyEnableCheck: false rawCode=");
        sbLIZ2.append(str);
        sbLIZ2.append(" rawParams=");
        sbLIZ2.append(c0ihw);
        C2188811AlT.LIZIZ(sbLIZ2);
        return false;
    }

    public final void LJII() {
        View view = this.LL;
        if (view != null) {
            C786410Ut5.T4(view, 1.0f);
        }
        C500260Jjc.LLFFF(this.LL);
        this.LL = null;
        LJI(1.0f);
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.Ld(view2, 0.0f);
        }
        this.LLILLJJLI = null;
        C1324720kZq c1324720kZq = this.LLILLL;
        if (c1324720kZq != null) {
            C500260Jjc.LJIILIIL(c1324720kZq);
        }
        this.LLILLL = null;
        C500260Jjc.LJIILIIL(getSurveyContainer());
        ValueAnimator valueAnimator = this.LLJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJLL = null;
        setCurrentInnerStatus(EnumC482940Iwm.CLOSED);
    }

    public final boolean LJIIIIZZ() {
        boolean zLIZLLL;
        SurveyData surveyData;
        String str;
        Long lValueOf = null;
        if (this.LLIZ) {
            Function0<Boolean> function0 = this.LLJL;
            this.LLIZ = function0 != null ? function0.invoke().booleanValue() : true;
            this.LLJL = null;
        }
        if (!this.LLIZ || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1()) {
            return false;
        }
        if (LiveInnerSurveyTtmOptSetting.INSTANCE.getValue()) {
            Boolean bool = this.LLJLILLLLZIIL;
            if (bool != null) {
                zLIZLLL = bool.booleanValue();
            } else {
                zLIZLLL = LIZLLL();
                this.LLJLILLLLZIIL = Boolean.valueOf(zLIZLLL);
            }
        } else {
            zLIZLLL = LIZLLL();
        }
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZLL;
        if (innerSurveyViewModel == null || (surveyData = innerSurveyViewModel.LL) == null || !surveyData.isReverse) {
            return zLIZLLL;
        }
        if (!innerSurveyViewModel.LLJL) {
            innerSurveyViewModel.KQ2("primary");
            C483410IxX c483410IxX = C483410IxX.LIZ;
            SurveyData surveyData2 = innerSurveyViewModel.LL;
            if (surveyData2 != null) {
                str = surveyData2.surveyId;
                lValueOf = Long.valueOf(surveyData2.surveyVersion);
            } else {
                str = null;
            }
            c483410IxX.LIZ(4, lValueOf, str);
            innerSurveyViewModel.LLJL = true;
        }
        return false;
    }

    public final ViewGroup getSurveyContainer() {
        return (ViewGroup) this.LLILZ.getValue();
    }

    public final FrameLayout getSurveyContentContainer() {
        return (FrameLayout) this.LLILZIL.getValue();
    }

    public final Function0<Boolean> getCanFullSurveyReally() {
        return this.LLJL;
    }

    public final void LIZ(boolean z) {
        this.LLJZ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("callParentDisallowIntercept: surveyNeedIntercept=");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(" childNeedIntercep=");
        sbLIZ.append(this.LLJZIJLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLJZIJLIL && !z) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(z);
    }

    public final void LIZIZ(C483100Ix2 c483100Ix2) {
        float f;
        float f2;
        float f3;
        c483100Ix2.setSmallSize(this.LLJLLIL);
        if (this.LLJLLIL) {
            f = 80.0f;
        } else {
            f = 100.0f;
        }
        this.LLJJIJI = (int) C497740JfY.LIZIZ(f);
        if (this.LLJLLIL) {
            f2 = 108.0f;
        } else {
            f2 = 130.0f;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(f2);
        this.LLJJIJIIJIL = iLIZIZ;
        float f4 = 1;
        float f5 = f4 - (this.LLJJIJI / this.LLJJI);
        this.LLJJJJJIL = f5;
        float f6 = f4 - (iLIZIZ / this.LLJJIII);
        this.LLJJJJLIIL = f6;
        this.LLJJJJ = Math.min(f5, f6);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("computeTargetSizeV2: scaleVideoWidth=");
        sbLIZ.append(this.LLJJIJI);
        sbLIZ.append(" scaleVideoHeight=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(" realScreenWidth=");
        sbLIZ.append(this.LLJJI);
        sbLIZ.append(" realScreenHeight=");
        sbLIZ.append(this.LLJJIII);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("computeTargetSizeV2: maxScaleWidth=");
        sbLIZ2.append(this.LLJJJJJIL);
        sbLIZ2.append(" maxScaleHeight=");
        sbLIZ2.append(this.LLJJJJLIIL);
        sbLIZ2.append(" maxScaleRate=");
        sbLIZ2.append(this.LLJJJJ);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LLJLLIL) {
            f3 = 16.0f;
        } else {
            f3 = 24.0f;
        }
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(f3);
        int height = getSurveyContentContainer().getHeight();
        int iLIZIZ3 = (int) C497740JfY.LIZIZ(63.0f);
        float f7 = this.LLJJIII;
        float f8 = iLIZIZ2;
        float f9 = 2;
        float f10 = ((((f7 - this.LLJJIJIIJIL) - f8) - height) - iLIZIZ3) / f9;
        float f11 = ((r8 / 2) + f10) - (f7 / f9);
        this.LLJJIJIL = f11;
        this.LLJJJ = Math.abs(f11);
        this.LLJJJIL = this.LLJJIJIIJIL + f10 + f8;
        C500260Jjc.LJJLJ((int) f10, getSurveyContentContainer());
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("computeTargetSizeV2: gapHeight=");
        sbLIZ3.append(iLIZIZ2);
        sbLIZ3.append(" surveyHeight=");
        sbLIZ3.append(height);
        sbLIZ3.append(" arrowHeight=");
        sbLIZ3.append(iLIZIZ3);
        sbLIZ3.append(" emptySpace=");
        sbLIZ3.append(f10);
        sbLIZ3.append(" videoTargetTransY=");
        sbLIZ3.append(this.LLJJIJIL);
        C2188811AlT.LIZIZ(sbLIZ3);
        this.LLJJLIIIJLLLLLLLZ = (int) C497740JfY.LIZIZ(50.0f);
        this.LLJJL = this.LLJJIII;
        if (f10 < 0.0f && !this.LLJLLIL) {
            this.LLJLLIL = true;
            LIZIZ(c483100Ix2);
        }
    }

    public final void LJI(float f) {
        ViewOutlineProvider outlineProvider;
        View view;
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.Ob(view2, f);
        }
        View view3 = this.LLILLJJLI;
        if (view3 != null) {
            C786410Ut5.pc(view3, f);
        }
        if (this.LLJJJJ > 0.0f) {
            View view4 = this.LLILLJJLI;
            if (view4 != null) {
                outlineProvider = view4.getOutlineProvider();
            } else {
                outlineProvider = null;
            }
            if (outlineProvider == null || ((view = this.LLILLJJLI) != null && !view.getClipToOutline())) {
                View view5 = this.LLILLJJLI;
                if (view5 != null) {
                    view5.setOutlineProvider(getRoundedCornerProvider());
                }
                View view6 = this.LLILLJJLI;
                if (view6 != null) {
                    view6.setClipToOutline(true);
                }
            }
            float f2 = 1;
            float f3 = this.LLJJJJ;
            float f4 = (f2 - f) / f3;
            int i = LLLF;
            float f5 = (i * f4) / (f2 - f3);
            float f6 = this.LLJJIJI;
            float f7 = this.LLJJJJJIL;
            float f8 = f6 / ((f2 - f7) + ((f7 - f3) * f4));
            float f9 = this.LLJJIJIIJIL;
            float f10 = this.LLJJJJLIIL;
            float f11 = f9 / ((f2 - f10) + ((f10 - f3) * f4));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("syncPlayerViewOutline: scaleFactor=");
            sbLIZ.append(f);
            sbLIZ.append(" cornerRadius=");
            sbLIZ.append(i);
            sbLIZ.append(" scaleFactor=");
            sbLIZ.append(f);
            sbLIZ.append(" progress=");
            sbLIZ.append(f4);
            sbLIZ.append(" radius=");
            sbLIZ.append(f5);
            sbLIZ.append(" width=");
            sbLIZ.append(f8);
            sbLIZ.append(" height=");
            sbLIZ.append(f11);
            C2188811AlT.LIZIZ(sbLIZ);
            C482950Iwn roundedCornerProvider = getRoundedCornerProvider();
            roundedCornerProvider.LIZ = f5;
            roundedCornerProvider.LIZIZ = f8;
            roundedCornerProvider.LIZJ = f11;
            View view7 = this.LLILLJJLI;
            if (view7 != null) {
                view7.invalidateOutline();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2 != 3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482930Iwl.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.LJIIIIZZ()
            r2 = 0
            if (r0 != 0) goto L8
            return r2
        L8:
            int r1 = r7.getAction()
            if (r1 == 0) goto L88
            r5 = 1
            if (r1 == r5) goto L7b
            r0 = 2
            if (r1 == r0) goto L1e
            r0 = 3
            if (r1 == r0) goto L7b
        L17:
            r7.getAction()
            r7.getY()
            return r2
        L1e:
            boolean r0 = r6.LLJILJIL
            if (r0 != 0) goto L86
            float r1 = r7.getY()
            float r0 = r6.LLJIJIL
            float r1 = r1 - r0
            int r4 = (int) r1
            float r1 = r7.getX()
            float r0 = r6.LLJI
            float r1 = r1 - r0
            int r3 = (int) r1
            java.lang.Math.abs(r4)
            boolean r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveFullScreenSurveyUiAdjustment.v2()
            if (r0 == 0) goto L5e
            X.0Iwm r1 = r6.LLIZLLLIL
            X.0Iwm r0 = X.EnumC482940Iwm.OPENED
            if (r1 != r0) goto L5e
            int r1 = java.lang.Math.abs(r3)
            r0 = 5
            if (r1 <= r0) goto L5e
            int r1 = java.lang.Math.abs(r3)
            int r0 = java.lang.Math.abs(r4)
            if (r1 <= r0) goto L5e
            r6.LLJILJIL = r5
            r3 = 1
        L55:
            X.0Iwm r1 = r6.LLIZLLLIL
            X.0Iwm r0 = X.EnumC482940Iwm.CLOSED
            if (r1 != r0) goto L72
            if (r4 <= 0) goto L79
            goto L17
        L5e:
            int r1 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r3)
            if (r1 >= r0) goto L70
            X.0Iwm r1 = r6.LLIZLLLIL
            X.0Iwm r0 = X.EnumC482940Iwm.OPENED
            if (r1 == r0) goto L70
            r6.LLJILJIL = r2
        L70:
            r3 = 0
            goto L55
        L72:
            X.0Iwm r0 = X.EnumC482940Iwm.OPENED
            if (r1 != r0) goto L84
            if (r4 >= 0) goto L79
            goto L17
        L79:
            r2 = r3
            goto L17
        L7b:
            r6.LLJILJIL = r2
            X.0Iwm r1 = r6.LLIZLLLIL
            X.0Iwm r0 = X.EnumC482940Iwm.MOVING
            if (r1 != r0) goto L17
            goto L86
        L84:
            r6.LLJILJIL = r5
        L86:
            r2 = 1
            goto L17
        L88:
            float r0 = r7.getX()
            r6.LLJ = r0
            float r1 = r7.getY()
            float r0 = r6.LLJ
            r6.LLJI = r0
            r6.LLJIJIL = r1
            android.view.View r0 = r6.LLILLJJLI
            r1 = 0
            if (r0 == 0) goto Lbe
            float r0 = r0.getScaleY()
        La1:
            r6.LLJJ = r0
            android.view.View r0 = r6.LLILLJJLI
            if (r0 == 0) goto Lab
            float r1 = r0.getY()
        Lab:
            r6.LLJILLL = r1
            r6.LLJILJIL = r2
            android.view.View r0 = r6.LL
            if (r0 == 0) goto Lbb
            float r0 = r0.getAlpha()
        Lb7:
            r6.LLJILJILJ = r0
            goto L17
        Lbb:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto Lb7
        Lbe:
            r0 = 0
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482930Iwl.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r1 != 3) goto L33;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instruction units count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C482930Iwl.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.LLJZIJLIL = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestDisallowInterceptTouchEvent: surveyNeedIntercept=");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(" childNeedIntercep=");
        sbLIZ.append(this.LLJZIJLIL);
        C2188811AlT.LIZIZ(sbLIZ);
        super.requestDisallowInterceptTouchEvent(z);
        if (!z && this.LLJZ) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void setCanFullSurveyReally(Function0<Boolean> function0) {
        this.LLJL = function0;
    }

    public final void setCurrentInnerStatus(EnumC482940Iwm enumC482940Iwm) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentInnerStatus --> old value = ");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(" ,new value =");
        sbLIZ.append(enumC482940Iwm);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLIZLLLIL != enumC482940Iwm) {
            this.LLIZLLLIL = enumC482940Iwm;
            if (enumC482940Iwm == EnumC482940Iwm.OPENED) {
                C1324720kZq c1324720kZq = this.LLILLL;
                if (c1324720kZq != null) {
                    C500260Jjc.LLFFF(c1324720kZq);
                }
                InnerSurveyViewModel innerSurveyViewModel = this.LLILZLL;
                if (innerSurveyViewModel != null && !innerSurveyViewModel.LLJJL) {
                    Long lValueOf = null;
                    innerSurveyViewModel.LLILLL = null;
                    innerSurveyViewModel.LLILZ.clear();
                    innerSurveyViewModel.LLJILJIL = SystemClock.elapsedRealtime();
                    SurveyData surveyData = innerSurveyViewModel.LL;
                    if (surveyData != null && surveyData.surveyVersion == 3) {
                        innerSurveyViewModel.LLJJ = SystemClock.elapsedRealtime();
                    }
                    if (!innerSurveyViewModel.LLJJL) {
                        innerSurveyViewModel.KQ2("primary");
                    }
                    C483410IxX c483410IxX = C483410IxX.LIZ;
                    SurveyData surveyData2 = innerSurveyViewModel.LL;
                    if (surveyData2 != null) {
                        str = surveyData2.surveyId;
                        lValueOf = Long.valueOf(surveyData2.surveyVersion);
                    } else {
                        str = null;
                    }
                    c483410IxX.LIZ(4, lValueOf, str);
                    innerSurveyViewModel.LLJJL = true;
                    DataChannel dataChannel = innerSurveyViewModel.getDataChannel();
                    if (dataChannel != null) {
                        dataChannel.zW(FullScreenSurveyShowing.class, Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            }
            if (enumC482940Iwm != EnumC482940Iwm.CLOSED) {
                return;
            }
            LIZJ();
        }
    }

    public final void setSurveyData(SurveyData surveyData) {
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZLL;
        if (innerSurveyViewModel != null) {
            innerSurveyViewModel.LL = surveyData;
            NextLiveData<SurveyData> nextLiveData = innerSurveyViewModel.LLJLIL;
            if (nextLiveData != null) {
                nextLiveData.setValue(surveyData);
            }
        }
    }

    public final void setSurveyEnable(boolean z) {
        InnerSurveyViewModel innerSurveyViewModel = this.LLILZLL;
        if (innerSurveyViewModel == null || innerSurveyViewModel.LL == null || this.LLIZLLLIL != EnumC482940Iwm.CLOSED || z == this.LLIZ) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSurveyEnable: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLIZ = z;
    }

    public C482930Iwl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 636));
        this.LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 637));
        this.LLIZLLLIL = EnumC482940Iwm.CLOSED;
        this.LLJJI = C14KS.LJFF();
        float fLIZLLL = C14KS.LIZLLL();
        this.LLJJIII = fLIZLLL;
        this.LLJLLIL = C497740JfY.LJJI((int) fLIZLLL) <= 640.0f;
        this.LLJLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(264));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.hq0, this, true);
        C786410Ut5.Kd(this.LLJJIII, getSurveyContainer());
        LJII();
        this.LLL = new AwS586S0100000_7(this, 396);
    }
}
