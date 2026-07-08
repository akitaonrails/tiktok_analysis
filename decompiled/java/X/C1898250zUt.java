package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.bytedance.touchpoint.core.pendant.base.BaseTimerPendantManager;
import com.bytedance.touchpoint.core.pendant.manager.SpecActPendantManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zUt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1898250zUt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BaseTimerPendantManager<?> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Bubble LLILZIL;
    public final /* synthetic */ View.OnClickListener LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1898250zUt(int i, View.OnClickListener onClickListener, Bubble bubble, BaseTimerPendantManager baseTimerPendantManager, String str, String str2, String str3, boolean z, boolean z2) {
        super(0);
        this.LL = baseTimerPendantManager;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = bubble;
        this.LLILZLL = onClickListener;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = z2;
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        BaseTimerPendantManager<?> baseTimerPendantManager;
        EnumC1898320zV0 enumC1898320zV0;
        Object c098200Yq;
        C19EG c19egLJIIIIZZ;
        C0P0T c0p0t;
        ?? LJJIFFI;
        String str;
        String strLJJIFFI;
        boolean z;
        BaseTimerPendantManager<?> baseTimerPendantManager2 = this.LL;
        if (baseTimerPendantManager2 == null || !baseTimerPendantManager2.LJJ() || 1 == 0 || (((baseTimerPendantManager = this.LL) == null || !baseTimerPendantManager.LJJJJJ()) && !this.LLILLJJLI)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("widget status does not match(isBound:");
            BaseTimerPendantManager<?> baseTimerPendantManager3 = this.LL;
            sbLIZ.append(baseTimerPendantManager3 != null ? Boolean.valueOf(baseTimerPendantManager3.LJJ()) : null);
            sbLIZ.append(", isShowing:");
            BaseTimerPendantManager<?> baseTimerPendantManager4 = this.LL;
            sbLIZ.append(baseTimerPendantManager4 != null ? Boolean.valueOf(baseTimerPendantManager4.LJJJJJ()) : null);
            sbLIZ.append(", return.");
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            C1897020zSu c1897020zSu = C1897020zSu.LIZ;
            final Bubble bubbleLIZ = C1897020zSu.LIZ(this.LLILLL, this.LLILZ, this.LLILZIL);
            if (bubbleLIZ != null) {
                BaseTimerPendantManager<?> baseTimerPendantManager5 = this.LL;
                View.OnClickListener onClickListener = this.LLILZLL;
                String str2 = this.LLIZ;
                String str3 = this.LLIZLLLIL;
                boolean z2 = this.LLJ;
                String str4 = this.LLILZ;
                Bubble bubble = baseTimerPendantManager5.LLJIJIL;
                int i = bubbleLIZ.bubbleType;
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    abstractC1896090zRP.LJJJ();
                }
                switch (i) {
                    case 7:
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                    case 22:
                    case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                    case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                        enumC1898320zV0 = EnumC1898320zV0.TIMER_LONG_BUBBLE;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    case BdTuring.TYPE_EMAIL /* 11 */:
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                    case 19:
                    default:
                        enumC1898320zV0 = EnumC1898320zV0.UNKNOWN;
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    case 14:
                    case 23:
                    case 27:
                    case 30:
                    case 32:
                    case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                        enumC1898320zV0 = EnumC1898320zV0.SHAPE_BUBBLE;
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                    case 15:
                        enumC1898320zV0 = EnumC1898320zV0.COUNTDOWN_BUBBLE;
                        break;
                    case 16:
                    case 21:
                    case 25:
                    case 28:
                        enumC1898320zV0 = EnumC1898320zV0.NORMAL_SHAPE_BUBBLE;
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                    case 29:
                    case 31:
                        enumC1898320zV0 = EnumC1898320zV0.ANTI_FRAUD_BUBBLE;
                        break;
                    case 26:
                        enumC1898320zV0 = EnumC1898320zV0.REMINDER_BUBBLE;
                        break;
                }
                switch (C1898330zV1.LIZ[enumC1898320zV0.ordinal()]) {
                    case 1:
                        String str5 = bubbleLIZ.longContent;
                        if (str5 == null) {
                            str5 = "";
                        }
                        BaseTimerPendantManager.LJJLI(baseTimerPendantManager5, str5, bubbleLIZ, false, onClickListener);
                        z = true;
                        break;
                    case 2:
                        baseTimerPendantManager5.LJJL(bubbleLIZ, str2, str3, z2);
                        z = true;
                        break;
                    case 3:
                        C1898700zVc c1898700zVc = baseTimerPendantManager5.LLIZ;
                        if (c1898700zVc == null || !c1898700zVc.LLJLL) {
                            baseTimerPendantManager5.LLJIJIL = bubbleLIZ;
                            if (c1898700zVc != null && c1898700zVc.LLJLLL && (str = bubbleLIZ.longContent) != null && (strLJJIFFI = u.LJJIFFI(str, "{countdownTimer}", str2, false)) != null) {
                                c1898700zVc.getShapeBubbleView().LIZ();
                                c1898700zVc.getShapeBubbleView().setBubbleText(strLJJIFFI);
                                if (c1898700zVc.getShapeBubbleView().getVisibility() != 0) {
                                    c1898700zVc.LJJIJ();
                                } else if (Intrinsics.LJFF(str2, "00:00")) {
                                    c1898700zVc.getShapeBubbleView().LJ(new AwS572S0100000_28(c1898700zVc, 1053));
                                }
                            }
                        }
                        z = true;
                        break;
                    case 4:
                        baseTimerPendantManager5.LJJJLIIL(bubbleLIZ, z2);
                        z = true;
                        break;
                    case 5:
                        baseTimerPendantManager5.LLJIJIL = bubbleLIZ;
                        final C1898700zVc c1898700zVc2 = baseTimerPendantManager5.LLIZ;
                        if (c1898700zVc2 != null) {
                            try {
                                AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                                if (abstractC1896090zRP2 != null && (c19egLJIIIIZZ = abstractC1896090zRP2.LJIIIIZZ()) != null && ((c0p0t = c1898700zVc2.LLJJJJ) == null || !c0p0t.isShowing())) {
                                    final C259800zU c259800zU = new C259800zU();
                                    String str6 = bubbleLIZ.longContent;
                                    if (str6 != null && (LJJIFFI = u.LJJIFFI(str6, "{countdown}", "00:00", false)) != 0) {
                                        c259800zU.element = LJJIFFI;
                                        final C450650Hln c450650Hln = new C450650Hln(c19egLJIIIIZZ);
                                        c450650Hln.LIZJ((CharSequence) c259800zU.element);
                                        c450650Hln.LIZIZ(EnumC450670Hlp.SMALL);
                                        c450650Hln.LIZ(0);
                                        c450650Hln.setCustomImage(null);
                                        EnumC1235690iGF enumC1235690iGF = c1898700zVc2.LJII() ? EnumC1235690iGF.END : EnumC1235690iGF.START;
                                        C1391550mJd c1391550mJd = new C1391550mJd(c19egLJIIIIZZ);
                                        c1391550mJd.LLILLJJLI.LJIIZILJ = c450650Hln;
                                        View pendantLayout = c1898700zVc2.getPendantLayout();
                                        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
                                        c1391600mJi.LIZIZ = pendantLayout;
                                        c1391600mJi.LIZLLL = enumC1235690iGF;
                                        c1391550mJd.LJII(R.attr.uj);
                                        C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
                                        c1391600mJi2.LJIIIZ = true;
                                        c1391600mJi2.LJIJJ = false;
                                        Integer num = bubbleLIZ.showDuration;
                                        c1391550mJd.LLILLJJLI.LJII = (((long) (num != null ? num.intValue() : 0)) * 1000) + 200;
                                        c1391550mJd.LIZJ(new AwS607S0100000_28(c1898700zVc2, 368));
                                        C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
                                        c1898700zVc2.LLJJJJ = c0p0tLIZIZ;
                                        c0p0tLIZIZ.show();
                                        final C118300cf c118300cf = new C118300cf();
                                        c1898700zVc2.getTimer().LIZ(new InterfaceC1899330zWd() { // from class: X.0zUw
                                            @Override // X.InterfaceC1899330zWd
                                            public final void LIZLLL() {
                                            }

                                            /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
                                            @Override // X.InterfaceC1899330zWd
                                            public final void LJIIIIZZ() {
                                                String str7;
                                                C118300cf c118300cf2 = c118300cf;
                                                int i2 = c118300cf2.element + 1;
                                                c118300cf2.element = i2;
                                                Integer num2 = bubbleLIZ.showDuration;
                                                if (i2 > (num2 != null ? num2.intValue() : 0)) {
                                                    return;
                                                }
                                                C259800zU<String> c259800zU2 = c259800zU;
                                                String str8 = bubbleLIZ.longContent;
                                                if (str8 != null) {
                                                    C1898700zVc c1898700zVc3 = c1898700zVc2;
                                                    int i3 = c118300cf.element;
                                                    c1898700zVc3.getClass();
                                                    if (i3 < 0 || (str7 = new SimpleDateFormat("mm:ss", Locale.US).format(Integer.valueOf(i3 * LSPassThroughRecordSizeConfig.DEFAULT))) == null) {
                                                        str7 = "";
                                                    }
                                                    ?? LJJIFFI2 = u.LJJIFFI(str8, "{countdown}", str7, false);
                                                    if (LJJIFFI2 != 0) {
                                                        c259800zU2.element = LJJIFFI2;
                                                        c450650Hln.LIZJ(c259800zU.element);
                                                    }
                                                }
                                            }
                                        });
                                        c1898700zVc2.getTimer().LIZJ();
                                    }
                                }
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            C189200o6.m5exceptionOrNullimpl(c098200Yq);
                        }
                        z = true;
                        break;
                    case 6:
                        baseTimerPendantManager5.LLJIJIL = bubbleLIZ;
                        C1898700zVc c1898700zVc3 = baseTimerPendantManager5.LLIZ;
                        if (c1898700zVc3 != null) {
                            c1898700zVc3.LLJLL = true;
                            String str7 = bubbleLIZ.longContent;
                            if (str7 != null && str7.length() != 0) {
                                c1898700zVc3.getShapeBubbleView().LIZ();
                                c1898700zVc3.getShapeBubbleView().setBubbleText(str7);
                                if (c1898700zVc3.getShapeBubbleView().getVisibility() != 0) {
                                    c1898700zVc3.LJJIJ();
                                } else {
                                    c1898700zVc3.LJIIL();
                                }
                                c1898700zVc3.getCoinTextView().setText(bubbleLIZ.shortContent);
                            }
                        }
                        z = true;
                        break;
                    default:
                        z = false;
                        break;
                }
                String str8 = bubbleLIZ.LIZIZ;
                if (str8 != null && str8.length() != 0 && z) {
                    C1897020zSu c1897020zSu2 = C1897020zSu.LIZ;
                    int i2 = bubbleLIZ.bubbleType;
                    if ((i2 != 13 && i2 != 15) || bubble == null || bubble.bubbleType != i2) {
                        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String strValueOf = String.valueOf(bubbleLIZ.bubbleType);
                        linkedHashMap.put("sub_type", strValueOf != null ? strValueOf : "");
                        C01GW<SpecActPendantManager> c01gw = SpecActPendantManager.LLJJIJIIJIL;
                        linkedHashMap.put("vv_cnt", String.valueOf(C1894330zOZ.LIZ().LJIILJJIL()));
                        linkedHashMap.put("task_key", str4);
                        c1894320zOY.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("touch_point_id", String.valueOf(bubbleLIZ.LIZ));
                        linkedHashMap2.put("touch_point_name", bubbleLIZ.LIZIZ);
                        linkedHashMap2.put("launch_plan_id", String.valueOf(bubbleLIZ.LIZJ));
                        linkedHashMap2.put("touch_point_ab_versions", String.valueOf(bubbleLIZ.LIZLLL));
                        C1619720sFe c1619720sFe2 = C1619720sFe.LIZ;
                        AbstractC1896090zRP abstractC1896090zRP3 = (AbstractC1896090zRP) c1619720sFe2.LIZ(0);
                        linkedHashMap2.put("region", abstractC1896090zRP3 != null ? abstractC1896090zRP3.LJIJJ() : null);
                        linkedHashMap2.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
                        linkedHashMap2.put("is_login", C1894310zOX.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
                        Map<String, String> map = bubbleLIZ.LJ;
                        if (map != null) {
                            linkedHashMap2.putAll(map);
                        }
                        linkedHashMap2.putAll(linkedHashMap);
                        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe2.LIZIZ();
                        if (interfaceC1897260zTILIZIZ != null) {
                            interfaceC1897260zTILIZIZ.LIZ("touch_point_show", linkedHashMap2);
                        }
                        C01GW<C1894700zPA> c01gw2 = C1894700zPA.LJIJ;
                        TouchPoint touchPointLIZJ = C2178808gE.LIZ().LIZJ(bubbleLIZ.LIZ, bubbleLIZ.LIZJ);
                        if (touchPointLIZJ != null) {
                            C1893680zNW.LIZ.getClass();
                            C1893680zNW.LJIIIIZZ(touchPointLIZJ);
                        }
                        ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                        if (iTouchPointModuleService != null) {
                            iTouchPointModuleService.LJIIJ();
                        }
                    }
                }
                String str9 = bubbleLIZ.notificationId;
                if (str9 != null && str9.length() != 0) {
                    C1897020zSu c1897020zSu3 = C1897020zSu.LIZ;
                    C1897020zSu.LIZLLL(bubbleLIZ, 2);
                }
            }
        }
        return Unit.LIZ;
    }
}
