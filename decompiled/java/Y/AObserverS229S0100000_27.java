package Y;

import X.AbstractC1556290qbL;
import X.AbstractC1568580qvA;
import X.AbstractC1779240wOw;
import X.AbstractC1805640x5W;
import X.AbstractC1806340x6e;
import X.AbstractC1836580xtQ;
import X.C07OF;
import X.C098200Yq;
import X.C0I7D;
import X.C0JT6;
import X.C0TRX;
import X.C0WZX;
import X.C10CC;
import X.C1105900esu;
import X.C1126800fQc;
import X.C1134860fdc;
import X.C11GO;
import X.C123100dR;
import X.C1233040iBy;
import X.C1260120ite;
import X.C127A;
import X.C127K;
import X.C127M;
import X.C12ES;
import X.C12MX;
import X.C1391190mJ3;
import X.C1556270qbJ;
import X.C1556280qbK;
import X.C1556300qbM;
import X.C1568550qv7;
import X.C16F5;
import X.C1749280vcc;
import X.C1777720wMU;
import X.C1779150wOn;
import X.C1779250wOx;
import X.C1779260wOy;
import X.C1790720whS;
import X.C1790730whT;
import X.C1790870whh;
import X.C1804450x3b;
import X.C1805460x5E;
import X.C1805650x5X;
import X.C1805720x5e;
import X.C1805810x5n;
import X.C1805840x5q;
import X.C1806080x6E;
import X.C1806690x7D;
import X.C1806860x7U;
import X.C1807180x80;
import X.C1809770xCB;
import X.C1809780xCC;
import X.C1809980xCW;
import X.C1810000xCY;
import X.C1810040xCc;
import X.C1810170xCp;
import X.C1810210xCt;
import X.C1810420xDE;
import X.C1836570xtP;
import X.C1836590xtR;
import X.C1836600xtS;
import X.C1838170xvz;
import X.C1838890xx9;
import X.C1850540yFw;
import X.C1851330yHD;
import X.C1851340yHE;
import X.C1851370yHH;
import X.C1851600yHe;
import X.C1851620yHg;
import X.C189200o6;
import X.C1954807lC;
import X.C19549411e8;
import X.C19549911eD;
import X.C19EG;
import X.C1B46;
import X.C1B4F;
import X.C20441214yg;
import X.C2187451AjH;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C343970De7;
import X.C380220EvU;
import X.C439101nJ;
import X.C472030IfB;
import X.C497740JfY;
import X.C500260Jjc;
import X.C618310OMz;
import X.C786410Ut5;
import X.CountDownTimerC1811820xFU;
import X.EnumC1568540qv6;
import X.EnumC1704090uRj;
import X.EnumC1805450x5D;
import X.EnumC1805520x5K;
import X.EnumC1805630x5V;
import X.EnumC1809020xAy;
import X.EnumC19300510f5;
import X.InterfaceC1094280eaA;
import X.InterfaceC1790880whi;
import X.InterfaceC1806200x6Q;
import X.InterfaceC1810050xCd;
import X.InterfaceC1810570xDT;
import X.InterfaceC1850580yG0;
import X.InterfaceC1851410yHL;
import X.ViewTreeObserverOnGlobalLayoutListenerC1864770yct;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.list.GiftListFragment;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankLeagueFragment;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.live.wallet.viewmodel.recharge.component.incentive.KycIncentiveFooterViewModel;
import com.bytedance.android.live.walletclean.presentation.assem.body.view.RechargePanelBodyAssemAbility;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchIntermediateFragment;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchIntermediateViewModel;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchResultFragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig;
import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingTilesConfig;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargePanelRefactorSetting;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.aigc.aiplayground.IAIPlaygroundMobService;
import com.ss.android.ugc.aweme.compliance.agegate.view.AgeGateCelebrationSettingFragment;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGenerationType;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.newcreatoredit.translation.TranslationLanguagePanelFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.share.SystemShareActivityViewModel;
import com.ss.android.ugc.aweme.share.linkshare.LinkShareEntryFragment;
import com.ss.android.ugc.aweme.share.systemshare.SystemShareEntryFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.ranklist.LynxRankView;
import webcast.api.ranklist_class.TileRewardConfig;

/* JADX INFO: loaded from: classes28.dex */
public class AObserverS229S0100000_27 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
            case 38:
                onChanged$38(this, obj);
                break;
            case 39:
                onChanged$39(this, obj);
                break;
            case 40:
                onChanged$40(this, obj);
                break;
            case 41:
                onChanged$41(this, obj);
                break;
            case 42:
                onChanged$42(this, obj);
                break;
            case 43:
                onChanged$43(this, obj);
                break;
            case 44:
                onChanged$44(this, obj);
                break;
            case 45:
                onChanged$45(this, obj);
                break;
            case 46:
                onChanged$46(this, obj);
                break;
            case 47:
                onChanged$47(this, obj);
                break;
            case 48:
                onChanged$48(this, obj);
                break;
            case 49:
                onChanged$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                onChanged$50(this, obj);
                break;
            case 51:
                onChanged$51(this, obj);
                break;
            case 52:
                onChanged$52(this, obj);
                break;
            case 53:
                onChanged$53(this, obj);
                break;
            case 54:
                onChanged$54(this, obj);
                break;
            case 55:
                onChanged$55(this, obj);
                break;
            case 56:
                onChanged$56(this, obj);
                break;
            case 57:
                onChanged$57(this, obj);
                break;
            case 58:
                onChanged$58(this, obj);
                break;
            case 59:
                onChanged$59(this, obj);
                break;
            case 60:
                onChanged$60(this, obj);
                break;
            case 61:
                onChanged$61(this, obj);
                break;
        }
    }

    public AObserverS229S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0I7D c0i7d = null;
        if (zBooleanValue) {
            C19549911eD keyboardHelper = ((C19549411e8) aObserverS229S0100000_27.l0).getKeyboardHelper();
            if (keyboardHelper != null) {
                C0I7D c0i7d2 = ((C19549411e8) aObserverS229S0100000_27.l0).LLJI;
                if (c0i7d2 != null) {
                    c0i7d = c0i7d2;
                }
                HandlerHook.viewPostDelay(c0i7d, new ARunnableS96S0200000_27(c0i7d, keyboardHelper, 0), 300L);
                return;
            }
            return;
        }
        C19549911eD keyboardHelper2 = ((C19549411e8) aObserverS229S0100000_27.l0).getKeyboardHelper();
        if (keyboardHelper2 == null) {
            return;
        }
        C0I7D c0i7d3 = ((C19549411e8) aObserverS229S0100000_27.l0).LLJI;
        if (c0i7d3 != null) {
            c0i7d = c0i7d3;
        }
        ((InputMethodManager) C786410Ut5.F2(keyboardHelper2.LIZ, "input_method")).hideSoftInputFromWindow(c0i7d.getWindowToken(), 0);
    }

    public static final void onChanged$1(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0I7D c0i7d = null;
        if (zBooleanValue) {
            if (((C19549411e8) aObserverS229S0100000_27.l0).getKeyboardHelper() != null) {
                C0I7D c0i7d2 = ((C19549411e8) aObserverS229S0100000_27.l0).LLJI;
                if (c0i7d2 == null) {
                    c0i7d2 = null;
                }
                c0i7d2.setFocusable(true);
                c0i7d2.setFocusableInTouchMode(true);
                c0i7d2.setOnTouchListener(null);
                return;
            }
            return;
        }
        if (((C19549411e8) aObserverS229S0100000_27.l0).getKeyboardHelper() == null) {
            return;
        }
        C0I7D c0i7d3 = ((C19549411e8) aObserverS229S0100000_27.l0).LLJI;
        if (c0i7d3 != null) {
            c0i7d = c0i7d3;
        }
        c0i7d.setFocusable(false);
        c0i7d.setFocusableInTouchMode(false);
        c0i7d.setOnTouchListener(new View.OnTouchListener() { // from class: X.0y98
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                view.onTouchEvent(motionEvent);
                return true;
            }
        });
    }

    public static final void onChanged$10(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((RechargeDialogNew) aObserverS229S0100000_27.l0).Vc();
        }
    }

    public static final void onChanged$11(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        RankPageController rankPageController;
        RankPageViewModel rankPageViewModelLJIIL;
        List<? extends SubRankTabInfo> list;
        C1810000xCY c1810000xCY = (C1810000xCY) obj;
        if (c1810000xCY != null && !((RankListController) aObserverS229S0100000_27.l0).LJIIIZ().LLILLL && c1810000xCY.LIZ > 0) {
            RankListController rankListController = (RankListController) aObserverS229S0100000_27.l0;
            CountDownTimerC1811820xFU countDownTimerC1811820xFU = rankListController.LLIZ;
            if ((countDownTimerC1811820xFU == null || countDownTimerC1811820xFU.LIZIZ) && (rankPageController = rankListController.LLILZIL) != null && (rankPageViewModelLJIIL = rankPageController.LJIIL()) != null && (list = rankPageViewModelLJIIL.LLIZLLLIL) != null && list.size() > 1) {
                CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = ((RankListController) aObserverS229S0100000_27.l0).LLIZ;
                if (countDownTimerC1811820xFU2 != null) {
                    countDownTimerC1811820xFU2.cancel();
                }
                RankListController rankListController2 = (RankListController) aObserverS229S0100000_27.l0;
                CountDownTimerC1811820xFU countDownTimerC1811820xFU3 = rankListController2.LLIZ;
                if (countDownTimerC1811820xFU3 != null) {
                    countDownTimerC1811820xFU3.LIZ = null;
                }
                rankListController2.LLIZ = null;
                rankListController2.LLIZLLLIL = false;
                CountDownTimerC1811820xFU countDownTimerC1811820xFU4 = new CountDownTimerC1811820xFU(c1810000xCY.LIZ * 1000);
                RankListController rankListController3 = (RankListController) aObserverS229S0100000_27.l0;
                countDownTimerC1811820xFU4.start();
                countDownTimerC1811820xFU4.LIZ = rankListController3.LLJ;
                rankListController2.LLIZ = countDownTimerC1811820xFU4;
            }
        }
    }

    public static final void onChanged$12(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1810420xDE c1810420xDE;
        RankListV2Response.WeeklyRookieRankExtra weeklyRookieRankExtra;
        RankListV2Response.RankInfo rankInfo = (RankListV2Response.RankInfo) obj;
        if (((GiftListFragment) aObserverS229S0100000_27.l0).getUserVisibleHint() && (c1810420xDE = ((GiftListFragment) aObserverS229S0100000_27.l0).LLLILZJ) != null) {
            if (rankInfo != null) {
                weeklyRookieRankExtra = rankInfo.weeklyRookieRankExtra;
            } else {
                weeklyRookieRankExtra = null;
            }
            c1810420xDE.LIZ(weeklyRookieRankExtra);
        }
    }

    public static final void onChanged$13(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1809980xCW c1809980xCW = (C1809980xCW) obj;
        if (((RankLeagueFragment) aObserverS229S0100000_27.l0).getUserVisibleHint()) {
            ((RankLeagueFragment) aObserverS229S0100000_27.l0).gS(c1809980xCW);
        }
    }

    public static final void onChanged$14(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        String str;
        long j;
        String str2;
        C1809780xCC c1809780xCC = (C1809780xCC) obj;
        C1809770xCB c1809770xCB = ((RankListFragment) aObserverS229S0100000_27.l0).LLJJI;
        if (c1809770xCB != null) {
            C20441214yg.LIZIZ("Creator League Ranking And Tiles", "CreatorTilesServiceImpl#handleCreatorTilesInfo");
            RankListV2Response.TileExtra tileExtra = c1809780xCC.LIZ;
            if (tileExtra != null) {
                long j2 = 0;
                if (tileExtra.tilesAvailable <= 0) {
                    C20441214yg.LIZIZ("Creator League Ranking And Tiles", "return - no tiles gained");
                    return;
                }
                long j3 = c1809780xCC.LIZJ;
                C0JT6<Map<String, String>> c0jt6 = InterfaceC1094280eaA.Id;
                Map<String, String> mapLIZ = c0jt6.LIZ();
                String str3 = CardStruct.IStatusCode.DEFAULT;
                if (mapLIZ == null || (str = mapLIZ.get(c1809770xCB.LIZIZ)) == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                String strValueOf = String.valueOf(j3);
                if (strValueOf.compareTo(str) <= 0) {
                    C20441214yg.LIZIZ("Creator League Ranking And Tiles", "return - ranking page displayed not first time");
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (mapLIZ != null) {
                    linkedHashMap.putAll(mapLIZ);
                }
                linkedHashMap.put(c1809770xCB.LIZIZ, strValueOf);
                c0jt6.LIZJ(linkedHashMap);
                LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig liveCreatorLeagueRankingIntegrationWithTilesFeatureConfig = LiveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.INSTANCE;
                if (liveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.rankingTilesPageOpt()) {
                    long j4 = tileExtra.tilesAvailable;
                    TileRewardConfig tileRewardConfig = tileExtra.popWindowRedeemItem;
                    if (tileRewardConfig != null) {
                        j = tileRewardConfig.price;
                    } else {
                        j = 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("checkIfTilesAvailableReachThreshold - tilesAvailable: ");
                    sbLIZ.append(j4);
                    sbLIZ.append(", tilesThreshold: ");
                    sbLIZ.append(j);
                    C20441214yg.LIZIZ("Creator League Ranking And Tiles", C2188811AlT.LIZIZ(sbLIZ));
                    if (j > 0 && j4 >= j) {
                        C20441214yg.LIZIZ("Creator League Ranking And Tiles", "checkIfTilesThresholdIsReachedForTheFirstTime");
                        C0JT6<Map<String, String>> c0jt62 = InterfaceC1094280eaA.Hd;
                        Map<String, String> mapLIZ2 = c0jt62.LIZ();
                        if (mapLIZ2 != null && (str2 = mapLIZ2.get(c1809770xCB.LIZIZ)) != null) {
                            str3 = str2;
                        }
                        TileRewardConfig tileRewardConfig2 = tileExtra.popWindowRedeemItem;
                        if (tileRewardConfig2 != null) {
                            j2 = tileRewardConfig2.price;
                        }
                        String strValueOf2 = String.valueOf(j2);
                        if (Intrinsics.LJFF(strValueOf2, str3)) {
                            C20441214yg.LIZIZ("Creator League Ranking And Tiles", "return - frequency control for tiles threshold");
                        } else {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            if (mapLIZ2 != null) {
                                linkedHashMap2.putAll(mapLIZ2);
                            }
                            linkedHashMap2.put(c1809770xCB.LIZIZ, strValueOf2);
                            c0jt62.LIZJ(linkedHashMap2);
                            C20441214yg.LIZIZ("Creator League Ranking And Tiles", "openPopularityRankingEducationPage");
                            String json = GsonProtectorUtils.toJson(new Gson(), tileExtra);
                            String string = UriProtector.parse(LiveCreatorRankingTilesConfig.INSTANCE.getRankingTilesPageSchema()).buildUpon().appendQueryParameter("enter_from", C1810210xCt.LJIIIZ).appendQueryParameter("rank_type", c1809770xCB.LIZIZ).build().toString();
                            boolean z = C1105900esu.LIZIZ;
                            C1105900esu.LJ(c1809770xCB.LIZ, string, true, true, json, new LinkedHashMap());
                        }
                    }
                }
                if (!liveCreatorLeagueRankingIntegrationWithTilesFeatureConfig.rankingPageBottomBarTilesNoticeOpt()) {
                    return;
                }
                C20441214yg.LIZIZ("Creator League Ranking And Tiles", "display bottom bar tile info");
                c1809770xCB.LIZJ = c1809780xCC.LIZIZ;
            }
        }
    }

    public static final void onChanged$15(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        AbstractC1556290qbL value;
        NextLiveData<AbstractC1556290qbL> nextLiveDataWQ2;
        LiveSearchIntermediateFragment liveSearchIntermediateFragment = (LiveSearchIntermediateFragment) aObserverS229S0100000_27.l0;
        if (liveSearchIntermediateFragment.mStatusViewValid && liveSearchIntermediateFragment.getUserVisibleHint()) {
            LiveSearchIntermediateViewModel liveSearchIntermediateViewModel = liveSearchIntermediateFragment.LLILZIL;
            if (liveSearchIntermediateViewModel != null && (nextLiveDataWQ2 = liveSearchIntermediateViewModel.wQ2()) != null) {
                value = nextLiveDataWQ2.getValue();
            } else {
                value = null;
            }
            if (value instanceof C1556280qbK) {
                liveSearchIntermediateFragment.LLIZ = null;
                liveSearchIntermediateFragment.OR(EnumC1809020xAy.PAGE_HISTORY, null);
                return;
            }
            if (value instanceof C1556270qbJ) {
                C1556270qbJ c1556270qbJ = (C1556270qbJ) value;
                if (TextUtils.equals(liveSearchIntermediateFragment.LLIZ, c1556270qbJ.LIZ)) {
                    RecyclerView recyclerView = liveSearchIntermediateFragment.LLILLJJLI;
                    if (recyclerView == null) {
                        return;
                    }
                    C12ES.LJIILL(0, recyclerView);
                    return;
                }
                String str = c1556270qbJ.LIZ;
                liveSearchIntermediateFragment.LLIZ = str;
                liveSearchIntermediateFragment.OR(EnumC1809020xAy.PAGE_SUG, str);
                return;
            }
            if (!(value instanceof C1556300qbM)) {
                return;
            }
            liveSearchIntermediateFragment.OR(EnumC1809020xAy.PAGE_INIT, null);
        }
    }

    public static final void onChanged$16(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        AIGenerationType aIGenerationType = (AIGenerationType) obj;
        if (aIGenerationType != AIGenerationType.NONE) {
            C1851370yHH c1851370yHH = (C1851370yHH) aObserverS229S0100000_27.l0;
            c1851370yHH.i3(new AwS393S0200000_27(aIGenerationType, c1851370yHH, 27));
            ((C1851370yHH) aObserverS229S0100000_27.l0).H5();
            IAIPlaygroundMobService iAIPlaygroundMobServiceLIZ = C07OF.LIZ();
            if (iAIPlaygroundMobServiceLIZ != null) {
                iAIPlaygroundMobServiceLIZ.LIZLLL(C380220EvU.LIZ(aIGenerationType), ((C1851370yHH) aObserverS229S0100000_27.l0).LLJJ);
            }
        }
    }

    public static final void onChanged$17(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1838890xx9 c1838890xx9 = (C1838890xx9) obj;
        InterfaceC1851410yHL interfaceC1851410yHLP4 = ((C1851370yHH) aObserverS229S0100000_27.l0).P4();
        if (interfaceC1851410yHLP4 != null) {
            interfaceC1851410yHLP4.kY1();
        }
        ((C1851370yHH) aObserverS229S0100000_27.l0).i3(new AwS606S0100000_27(c1838890xx9, 78));
    }

    public static final void onChanged$18(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        if (((C1851370yHH) aObserverS229S0100000_27.l0).T2().LIZ == AIGenerationType.TEXT_TO_VIDEO) {
            ((C1851370yHH) aObserverS229S0100000_27.l0).H5();
        }
    }

    public static final void onChanged$19(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        if (((C1851370yHH) aObserverS229S0100000_27.l0).T2().LIZ == AIGenerationType.AI_TRANSITION || ((C1851370yHH) aObserverS229S0100000_27.l0).T2().LIZ == AIGenerationType.IMAGE_TO_VIDEO) {
            ((C1851370yHH) aObserverS229S0100000_27.l0).H5();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        ((java.util.ArrayList) r5.LJFF).add(r4);
        r5.LJ(r5.LJFF);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$2(Y.AObserverS229S0100000_27 r5, java.lang.Object r6) {
        /*
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r5.l0
            com.bytedance.android.live.walletnew.RechargeDialogNew r0 = (com.bytedance.android.live.walletnew.RechargeDialogNew) r0
            com.bytedance.android.live.walletnew.RechargeViewModel r0 = r0.qS()
            X.0x7U r1 = r0.aR2()
            r0 = 0
            r1.LJI(r6, r0)
            java.lang.Object r0 = r5.l0
            com.bytedance.android.live.walletnew.RechargeDialogNew r0 = (com.bytedance.android.live.walletnew.RechargeDialogNew) r0
            com.bytedance.android.live.walletnew.RechargeViewModel r0 = r0.qS()
            X.0x7U r0 = r0.aR2()
            webcast.api.profit.IapListResult$VoucherItem r0 = r0.LJFF
            if (r0 == 0) goto L77
            com.bytedance.android.livesdk.wallet.Diamond r1 = new com.bytedance.android.livesdk.wallet.Diamond
            r1.<init>()
            r0 = 4
            r1.LIZ = r0
            java.lang.Object r6 = r5.l0
            com.bytedance.android.live.walletnew.RechargeDialogNew r6 = (com.bytedance.android.live.walletnew.RechargeDialogNew) r6
            X.0x80 r5 = r6.LLL
            if (r5 == 0) goto L6c
            X.0x74 r4 = new X.0x74
            int r0 = r1.LIZ
            r4.<init>(r0, r1)
            kotlin.jvm.internal.AwS606S0100000_27 r3 = new kotlin.jvm.internal.AwS606S0100000_27
            r0 = 34
            r3.<init>(r1, r0)
            java.util.List<X.0x74> r0 = r5.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L48:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
            if (r1 != 0) goto L6c
        L60:
            java.util.List<X.0x74> r0 = r5.LJFF
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            java.util.List<X.0x74> r0 = r5.LJFF
            r5.LJ(r0)
        L6c:
            X.0x80 r0 = r6.LLL
            if (r0 == 0) goto L77
            X.0x7h r0 = r0.LIZJ()
            r0.notifyDataSetChanged()
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS229S0100000_27.onChanged$2(Y.AObserverS229S0100000_27, java.lang.Object):void");
    }

    public static final void onChanged$20(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        AIGenerationType aIGenerationType = (AIGenerationType) obj;
        if (aIGenerationType != null && aIGenerationType != ((C1851330yHD) aObserverS229S0100000_27.l0).T2().LIZ) {
            ((C1851330yHD) aObserverS229S0100000_27.l0).i3(new AwS606S0100000_27(aIGenerationType, 76));
        }
    }

    public static final void onChanged$21(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1838890xx9 c1838890xx9 = (C1838890xx9) obj;
        InterfaceC1851410yHL interfaceC1851410yHLH4 = ((C1851330yHD) aObserverS229S0100000_27.l0).H4();
        if (interfaceC1851410yHLH4 != null) {
            interfaceC1851410yHLH4.kY1();
        }
        ((C1851330yHD) aObserverS229S0100000_27.l0).i3(new AwS606S0100000_27(c1838890xx9, 77));
    }

    public static final void onChanged$22(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((C1851340yHE) aObserverS229S0100000_27.l0).i3(new AwS606S0100000_27((C1838890xx9) obj, 85));
    }

    public static final void onChanged$23(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            ((C1851620yHg) aObserverS229S0100000_27.l0).i3(new AwS606S0100000_27(bool, 86));
        }
    }

    public static final void onChanged$24(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        AIGenerationType aIGenerationType = (AIGenerationType) obj;
        if (aIGenerationType != ((C1851600yHe) aObserverS229S0100000_27.l0).T2().LIZ) {
            ((C1851600yHe) aObserverS229S0100000_27.l0).v5();
            ((C1851600yHe) aObserverS229S0100000_27.l0).K4();
            ((C1851600yHe) aObserverS229S0100000_27.l0).i3(new AwS606S0100000_27(aIGenerationType, 91));
            ((C1851600yHe) aObserverS229S0100000_27.l0).t5(aIGenerationType);
        }
    }

    public static final void onChanged$25(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((C1851600yHe) aObserverS229S0100000_27.l0).i3(new AwS606S0100000_27((C1838890xx9) obj, 92));
    }

    public static final void onChanged$26(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C11GO c11go;
        AbstractC1836580xtQ abstractC1836580xtQ = (AbstractC1836580xtQ) obj;
        if (abstractC1836580xtQ instanceof C1836590xtR) {
            C127K c127kDS = ((AgeGateCelebrationSettingFragment) aObserverS229S0100000_27.l0).dS();
            if (c127kDS != null) {
                c127kDS.setLoading(false);
                C127M accessory = c127kDS.getAccessory();
                if ((accessory instanceof C127A) && (c11go = (C11GO) accessory) != null) {
                    boolean zLJIILIIL = c11go.LJIILIIL();
                    boolean z = ((C1836590xtR) abstractC1836580xtQ).LIZ;
                    if (zLJIILIIL != z) {
                        c11go.LJIILJJIL(z);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC1836580xtQ instanceof C1836600xtS) {
            C127K c127kDS2 = ((AgeGateCelebrationSettingFragment) aObserverS229S0100000_27.l0).dS();
            if (c127kDS2 != null) {
                c127kDS2.setLoading(false);
            }
            if (!C123100dR.LIZ(((C1836600xtS) abstractC1836580xtQ).LIZ)) {
                return;
            }
            AgeGateCelebrationSettingFragment ageGateCelebrationSettingFragment = (AgeGateCelebrationSettingFragment) aObserverS229S0100000_27.l0;
            Integer numValueOf = Integer.valueOf(EnumC19300510f5.MINOR.getType());
            String str = AgeGateCelebrationSettingFragment._pnsPageId;
            ageGateCelebrationSettingFragment.UR(new PNSErrorModel(numValueOf, C1838170xvz.LIZ(2131834217, (AgeGateCelebrationSettingFragment) aObserverS229S0100000_27.l0), null, null));
            return;
        }
        if (abstractC1836580xtQ instanceof C1836570xtP) {
            C127K c127kDS3 = ((AgeGateCelebrationSettingFragment) aObserverS229S0100000_27.l0).dS();
            if (c127kDS3 == null) {
                return;
            }
            c127kDS3.setLoading(true);
            return;
        }
        throw new C1954807lC();
    }

    public static final void onChanged$27(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ViewTreeObserver viewTreeObserver;
        List list = (List) obj;
        if (list.size() == 0) {
            String str = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF((RepostPanelFragment) aObserverS229S0100000_27.l0, C343970De7.LIZ);
            return;
        }
        ((RepostPanelFragment) aObserverS229S0100000_27.l0).WR(list.size());
        ((RepostPanelFragment) aObserverS229S0100000_27.l0).VR();
        RepostPanelFragment repostPanelFragment = (RepostPanelFragment) aObserverS229S0100000_27.l0;
        LinearLayout linearLayout = repostPanelFragment.LLIZLLLIL;
        if (linearLayout != null && (viewTreeObserver = linearLayout.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1864770yct viewTreeObserverOnGlobalLayoutListenerC1864770yct = new ViewTreeObserverOnGlobalLayoutListenerC1864770yct(repostPanelFragment, 7);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1864770yct);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1864770yct, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ((PowerPageSource) ((RepostPanelFragment) aObserverS229S0100000_27.l0).LLJJI.getValue()).getOperator().refresh();
    }

    public static final void onChanged$28(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        AbstractC1779240wOw abstractC1779240wOw = (AbstractC1779240wOw) obj;
        if (abstractC1779240wOw instanceof C1777720wMU) {
            C1749280vcc c1749280vcc = ((TranslationLanguagePanelFragment) aObserverS229S0100000_27.l0).LLIZ;
            if (c1749280vcc != null) {
                c1749280vcc.LLJJJJLIIL = C618310OMz.LIZ;
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
                return;
            }
            return;
        }
        if (abstractC1779240wOw instanceof C1779150wOn) {
            C1749280vcc c1749280vcc2 = ((TranslationLanguagePanelFragment) aObserverS229S0100000_27.l0).LLIZ;
            if (c1749280vcc2 != null) {
                c1749280vcc2.LLJJJJLIIL = C618310OMz.LIZ;
                C786410Ut5.LLLZLZ(c1749280vcc2, 8);
            }
            C0TRX c0trx = ((TranslationLanguagePanelFragment) aObserverS229S0100000_27.l0).LLILZLL;
            if (c0trx != null) {
                c0trx.LLILLJJLI = (List) ((C1779150wOn) abstractC1779240wOw).LIZ;
                c0trx.notifyDataSetChanged();
            }
            RecyclerView recyclerView = ((TranslationLanguagePanelFragment) aObserverS229S0100000_27.l0).LLILLL;
            if (recyclerView == null) {
                return;
            }
            C786410Ut5.LLIZLLLIL(recyclerView, 0);
            return;
        }
        if (Intrinsics.LJFF(abstractC1779240wOw, C1779250wOx.LIZ)) {
            C1749280vcc c1749280vcc3 = ((TranslationLanguagePanelFragment) aObserverS229S0100000_27.l0).LLIZ;
            if (c1749280vcc3 != null) {
                C786410Ut5.LLLZLZ(c1749280vcc3, 0);
            }
            C1749280vcc c1749280vcc4 = ((TranslationLanguagePanelFragment) aObserverS229S0100000_27.l0).LLIZ;
            if (c1749280vcc4 == null) {
                return;
            }
            c1749280vcc4.LJ();
            return;
        }
        if (Intrinsics.LJFF(abstractC1779240wOw, C1779260wOy.LIZ)) {
            ((TranslationLanguagePanelFragment) aObserverS229S0100000_27.l0).MR();
            return;
        }
        throw new C1954807lC();
    }

    public static final void onChanged$29(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C19EG c19eg;
        WeakReference<C19EG> weakReferenceVQ2 = ((SystemShareActivityViewModel) aObserverS229S0100000_27.l0).vQ2();
        if (weakReferenceVQ2 != null && (c19eg = weakReferenceVQ2.get()) != null) {
            c19eg.finish();
        }
    }

    public static final void onChanged$3(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C16F5 c16f5NS = ((RechargeDialogNew) aObserverS229S0100000_27.l0).nS();
        if (c16f5NS != null) {
            c16f5NS.setText(String.valueOf(((RechargeDialogNew) aObserverS229S0100000_27.l0).qS().No0()));
        }
    }

    public static final void onChanged$30(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((LinkShareEntryFragment) aObserverS229S0100000_27.l0).RR((C12MX) obj);
    }

    public static final void onChanged$31(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        LinkShareEntryFragment linkShareEntryFragment = (LinkShareEntryFragment) aObserverS229S0100000_27.l0;
        linkShareEntryFragment.getClass();
        C1260120ite.LIZIZ(new ARunnableS113S0100000_13(linkShareEntryFragment, 274));
    }

    public static final void onChanged$32(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        LinkShareEntryFragment linkShareEntryFragment = (LinkShareEntryFragment) aObserverS229S0100000_27.l0;
        linkShareEntryFragment.getClass();
        C1260120ite.LIZIZ(new ARunnableS113S0100000_13(linkShareEntryFragment, 275));
    }

    public static final void onChanged$33(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((LinkShareEntryFragment) aObserverS229S0100000_27.l0).LLJI = (InterfaceC1850580yG0) obj;
    }

    public static final void onChanged$34(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((SystemShareEntryFragment) aObserverS229S0100000_27.l0).RR((C12MX) obj);
    }

    public static final void onChanged$35(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        SystemShareEntryFragment systemShareEntryFragment = (SystemShareEntryFragment) aObserverS229S0100000_27.l0;
        systemShareEntryFragment.getClass();
        C1260120ite.LIZIZ(new ARunnableS113S0100000_13(systemShareEntryFragment, 274));
    }

    public static final void onChanged$36(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        SystemShareEntryFragment systemShareEntryFragment = (SystemShareEntryFragment) aObserverS229S0100000_27.l0;
        systemShareEntryFragment.getClass();
        C1260120ite.LIZIZ(new ARunnableS113S0100000_13(systemShareEntryFragment, 274));
    }

    public static final void onChanged$37(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((SystemShareEntryFragment) aObserverS229S0100000_27.l0).LLJI = (InterfaceC1850580yG0) obj;
    }

    public static final void onChanged$38(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1B4F c1b4f = (C1B4F) obj;
        C19EG activity = ((SystemShareEntryFragment) aObserverS229S0100000_27.l0).getActivity();
        if (activity != null) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error ");
            sbLIZ.append(c1b4f);
            sbLIZ.append(".errorCode ");
            sbLIZ.append(c1b4f.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1233040iBy c1233040iBy = new C1233040iBy(C786410Ut5.P3(activity));
            c1233040iBy.LIZJ(c1b4f.LIZJ);
            c1233040iBy.LIZLLL();
            if (c1b4f.LIZ != -7) {
                C1850540yFw c1850540yFw = C1850540yFw.LIZ;
                C1B4F c1b4f2 = C1B4F.LJJIJIIJI;
                c1850540yFw.getClass();
                C1850540yFw.LIZ(c1b4f2);
                C1B46.LIZ.getClass();
                C1B46.LIZIZ();
            }
        }
    }

    public static final void onChanged$39(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        Object c098200Yq;
        EnumC1704090uRj level;
        int i;
        EnumC1805450x5D enumC1805450x5D = (EnumC1805450x5D) obj;
        if (enumC1805450x5D != null) {
            Context context = ((C1805810x5n) aObserverS229S0100000_27.l0).LIZ.getContext();
            LiveIconView liveIconView = new LiveIconView(context, null);
            LiveIconView liveIconView2 = new LiveIconView(context, null);
            FrameLayout frameLayout = (FrameLayout) ((C1805810x5n) aObserverS229S0100000_27.l0).LIZ.findViewById(R.id.m3z);
            TextView textView = (TextView) ((C1805810x5n) aObserverS229S0100000_27.l0).LIZ.findViewById(R.id.m40);
            FrameLayout frameLayout2 = (FrameLayout) ((C1805810x5n) aObserverS229S0100000_27.l0).LIZ.findViewById(R.id.m3y);
            C786410Ut5.LJJJJIZL(frameLayout);
            frameLayout.addView(liveIconView);
            boolean z = true;
            try {
                int i2 = C1805650x5X.LIZ[enumC1805450x5D.getGroup().ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("SupplementaryNoticeAttributes.getIconDrawableId(): group not expected: ");
                            sbLIZ.append(enumC1805450x5D.getGroup().getGroupName());
                            C20441214yg.LIZIZ("KycIncentiveFooterView", C2188811AlT.LIZIZ(sbLIZ));
                            i = R.drawable.ff5;
                        } else {
                            i = R.drawable.ff6;
                        }
                    } else {
                        i = R.drawable.ff7;
                    }
                    liveIconView.setIcon(i);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } else {
                    i = R.drawable.ff5;
                    liveIconView.setIcon(i);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                C20441214yg.LIZIZ("KycIncentiveFooterView", "SupplementaryNoticeAttributes observer: set icon failed");
            }
            textView.setText(new SpannableStringBuilder(enumC1805450x5D.getTitle()));
            C786410Ut5.LJJJJIZL(frameLayout2);
            frameLayout2.addView(liveIconView2);
            if (C497740JfY.LJJ()) {
                liveIconView2.setIcon(R.drawable.ff4);
            } else {
                liveIconView2.setIcon(R.drawable.ff3);
            }
            C1805810x5n c1805810x5n = (C1805810x5n) aObserverS229S0100000_27.l0;
            C786410Ut5.R7(c1805810x5n.LIZ, new ACListenerS161S0100000_27(c1805810x5n, 134));
            KycIncentiveFooterViewModel kycIncentiveFooterViewModel = ((C1805810x5n) aObserverS229S0100000_27.l0).LIZIZ;
            EnumC1805450x5D value = kycIncentiveFooterViewModel.vQ2().getValue();
            if (value != null) {
                AbstractC1806340x6e abstractC1806340x6e = new AbstractC1806340x6e() { // from class: X.0x6K
                    {
                        LIZ("page_type", "kyc_before_annual_limit_incentive_2025");
                        LIZ("popup_entrance", "room_recharge");
                    }
                };
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("level");
                sbLIZ2.append(value.getLevel().getLevelValue());
                sbLIZ2.append("_incentive");
                abstractC1806340x6e.LIZ("banner_type", C2188811AlT.LIZIZ(sbLIZ2));
                if (value == EnumC1805450x5D.NOTICE_ID_KYC_INCENTIVE_REVAMP_NOTICE) {
                    abstractC1806340x6e.LIZ("page_type", "kyc_revamp_2026");
                }
                if (C500260Jjc.LJJIIZ(kycIncentiveFooterViewModel.LLILLJJLI)) {
                    level = EnumC1704090uRj.L3;
                } else {
                    level = value.getLevel();
                }
                abstractC1806340x6e.LIZ("kyc_incentive_level", String.valueOf(level.getLevelValue()));
                if (value.getGroup() != EnumC1805520x5K.NEW) {
                    z = false;
                }
                abstractC1806340x6e.LIZ("is_new_user", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0));
                abstractC1806340x6e.LIZIZ();
            }
        }
    }

    public static final void onChanged$4(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        Boolean boolValueOf;
        RechargeDialogNew rechargeDialogNew = (RechargeDialogNew) aObserverS229S0100000_27.l0;
        rechargeDialogNew.LLLIIIIL = false;
        KycIncentiveFooterViewModel kycIncentiveFooterViewModelBR2 = rechargeDialogNew.qS().bR2();
        if (kycIncentiveFooterViewModelBR2 != null && kycIncentiveFooterViewModelBR2.wQ2()) {
            C1805810x5n c1805810x5n = ((RechargeDialogNew) aObserverS229S0100000_27.l0).LLLIIIL;
            if (c1805810x5n != null) {
                C12ES.LJIILL(0, c1805810x5n.LIZ);
            }
            C1805720x5e c1805720x5e = ((RechargeDialogNew) aObserverS229S0100000_27.l0).LLLIIL;
            if (c1805720x5e != null) {
                C439101nJ.LJI(c1805720x5e.LIZ);
            }
            RechargeDialogNew rechargeDialogNew2 = (RechargeDialogNew) aObserverS229S0100000_27.l0;
            rechargeDialogNew2.LLLIIIIL = true;
            rechargeDialogNew2.qS().LLLLJ.postValue(new C1806690x7D(true));
        } else {
            C1805810x5n c1805810x5n2 = ((RechargeDialogNew) aObserverS229S0100000_27.l0).LLLIIIL;
            if (c1805810x5n2 != null) {
                C439101nJ.LJI(c1805810x5n2.LIZ);
            }
            RechargeDialogNew rechargeDialogNew3 = (RechargeDialogNew) aObserverS229S0100000_27.l0;
            C1805720x5e c1805720x5e2 = rechargeDialogNew3.LLLIIL;
            if (c1805720x5e2 != null) {
                InterfaceC1806200x6Q interfaceC1806200x6Q = (InterfaceC1806200x6Q) rechargeDialogNew3.qS().LLLILZ.getValue();
                if (interfaceC1806200x6Q != null) {
                    boolValueOf = Boolean.valueOf(interfaceC1806200x6Q.LIZJ(EnumC1805630x5V.LIVE_RECHARGE_PANEL_FOOTER));
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    C12ES.LJIILL(0, c1805720x5e2.LIZ);
                } else {
                    C439101nJ.LJI(c1805720x5e2.LIZ);
                }
            }
        }
        ((RechargeDialogNew) aObserverS229S0100000_27.l0).PR();
    }

    public static final void onChanged$40(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        int priority;
        AbstractC1805640x5W c1805460x5E;
        View view;
        EnumC1568540qv6 enumC1568540qv6LIZ;
        AbstractC1568580qvA abstractC1568580qvA = (AbstractC1568580qvA) obj;
        C1805840x5q c1805840x5q = (C1805840x5q) aObserverS229S0100000_27.l0;
        ViewGroup viewGroup = c1805840x5q.LIZJ;
        if (viewGroup != null) {
            AbstractC1805640x5W abstractC1805640x5W = c1805840x5q.LIZLLL;
            EnumC1568540qv6 enumC1568540qv6LIZ2 = null;
            if (abstractC1805640x5W != null) {
                enumC1568540qv6LIZ2 = abstractC1805640x5W.LIZ();
            }
            if (enumC1568540qv6LIZ2 == abstractC1568580qvA.LIZ()) {
                AbstractC1805640x5W abstractC1805640x5W2 = c1805840x5q.LIZLLL;
                if (abstractC1805640x5W2 != null) {
                    abstractC1805640x5W2.LIZLLL(abstractC1568580qvA);
                    return;
                }
                return;
            }
            AbstractC1805640x5W abstractC1805640x5W3 = c1805840x5q.LIZLLL;
            if (abstractC1805640x5W3 != null && (enumC1568540qv6LIZ = abstractC1805640x5W3.LIZ()) != null) {
                priority = enumC1568540qv6LIZ.getPriority();
            } else {
                priority = 0;
            }
            if (priority > abstractC1568580qvA.LIZ().getPriority()) {
                return;
            }
            EnumC1568540qv6 enumC1568540qv6LIZ3 = abstractC1568580qvA.LIZ();
            ViewModelStoreOwner viewModelStoreOwner = c1805840x5q.LIZ;
            int i = C1568550qv7.LIZ[enumC1568540qv6LIZ3.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4 && i != 5) {
                        return;
                    }
                    C1126800fQc.LIZ.py();
                    C1134860fdc c1134860fdc = C1134860fdc.LIZ;
                    c1805460x5E = (AbstractC1805640x5W) C1134860fdc.LJFF(enumC1568540qv6LIZ3.name(), viewGroup, viewModelStoreOwner);
                    if (c1805460x5E == null) {
                        return;
                    }
                } else {
                    c1805460x5E = new C1806080x6E(viewGroup, viewModelStoreOwner);
                }
            } else {
                c1805460x5E = new C1805460x5E(viewGroup);
            }
            c1805460x5E.LIZJ();
            ViewGroup viewGroup2 = c1805840x5q.LIZJ;
            if (viewGroup2 == null || (view = c1805460x5E.LIZIZ) == null) {
                return;
            }
            C786410Ut5.LJJJJI(viewGroup2);
            AbstractC1805640x5W abstractC1805640x5W4 = c1805840x5q.LIZLLL;
            if (abstractC1805640x5W4 != null) {
                abstractC1805640x5W4.LJ();
            }
            viewGroup2.addView(view);
            c1805460x5E.LIZLLL(abstractC1568580qvA);
            c1805460x5E.LJFF();
            c1805840x5q.LIZLLL = c1805460x5E;
        }
    }

    public static final void onChanged$41(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C10CC c10cc = (C10CC) aObserverS229S0100000_27.l0;
            TuxIconView tuxIconView = (TuxIconView) c10cc.LIZLLL.getValue();
            if (tuxIconView != null) {
                tuxIconView.setTintColorRes(R.attr.a01);
            }
            TuxTextView tuxTextView = (TuxTextView) c10cc.LJ.getValue();
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.a1h);
            }
            TuxTextView tuxTextViewLIZ = c10cc.LIZ();
            if (tuxTextViewLIZ != null) {
                tuxTextViewLIZ.setTextColorRes(R.attr.a1k);
            }
            TuxIconView tuxIconView2 = (TuxIconView) c10cc.LJI.getValue();
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColor(R.attr.a1k);
                return;
            }
            return;
        }
        C10CC c10cc2 = (C10CC) aObserverS229S0100000_27.l0;
        TuxIconView tuxIconView3 = (TuxIconView) c10cc2.LIZLLL.getValue();
        if (tuxIconView3 != null) {
            tuxIconView3.setTintColorRes(R.attr.a03);
        }
        TuxTextView tuxTextView2 = (TuxTextView) c10cc2.LJ.getValue();
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColorRes(R.attr.a1k);
        }
        TuxTextView tuxTextViewLIZ2 = c10cc2.LIZ();
        if (tuxTextViewLIZ2 != null) {
            tuxTextViewLIZ2.setTextColorRes(R.attr.a03);
        }
        TuxIconView tuxIconView4 = (TuxIconView) c10cc2.LJI.getValue();
        if (tuxIconView4 == null) {
            return;
        }
        tuxIconView4.setTintColor(R.attr.a03);
    }

    public static final void onChanged$42(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((C1806860x7U) aObserverS229S0100000_27.l0).LJII(false);
    }

    public static final void onChanged$43(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        RankListController rankListController = (RankListController) aObserverS229S0100000_27.l0;
        if (rankListController.LLILLL.LIZIZ.type == rankListController.LJ().LLJJIII.type) {
            ((RankListController) aObserverS229S0100000_27.l0).LJ().LLJIJIL.postValue(obj);
        }
    }

    public static final void onChanged$44(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((RankListController) aObserverS229S0100000_27.l0).LJ().LLJILLL.postValue(obj);
    }

    public static final void onChanged$45(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((InterfaceC1810050xCd) aObserverS229S0100000_27.l0).c2((List) obj);
    }

    public static final void onChanged$46(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        RankListV2Response.RankView rankView = (RankListV2Response.RankView) obj;
        if (rankView != null) {
            ((RankPageController) aObserverS229S0100000_27.l0).LLILZLL.LIZ().wQ2(rankView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$47(Y.AObserverS229S0100000_27 r6, java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS229S0100000_27.onChanged$47(Y.AObserverS229S0100000_27, java.lang.Object):void");
    }

    public static final void onChanged$48(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        CountDownTimerC1811820xFU countDownTimerC1811820xFU;
        C1810000xCY c1810000xCY = (C1810000xCY) obj;
        if (c1810000xCY != null) {
            RankPageController rankPageController = (RankPageController) aObserverS229S0100000_27.l0;
            if (!rankPageController.LJIIL().LLILZIL) {
                if (c1810000xCY.LIZIZ && (countDownTimerC1811820xFU = rankPageController.LLJ) != null && !countDownTimerC1811820xFU.LIZIZ) {
                    return;
                }
                CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = rankPageController.LLJ;
                if (countDownTimerC1811820xFU2 != null) {
                    countDownTimerC1811820xFU2.cancel();
                }
                CountDownTimerC1811820xFU countDownTimerC1811820xFU3 = rankPageController.LLJ;
                if (countDownTimerC1811820xFU3 != null) {
                    countDownTimerC1811820xFU3.LIZ = null;
                }
                CountDownTimerC1811820xFU countDownTimerC1811820xFU4 = new CountDownTimerC1811820xFU(c1810000xCY.LIZ * 1000);
                countDownTimerC1811820xFU4.start();
                C1810040xCc c1810040xCc = rankPageController.LLJI;
                countDownTimerC1811820xFU4.LIZ = c1810040xCc;
                if (c1810040xCc != null) {
                    c1810040xCc.LJJI(c1810000xCY.LIZ * 1000);
                }
                rankPageController.LLJ = countDownTimerC1811820xFU4;
                return;
            }
            InterfaceC1810050xCd interfaceC1810050xCd = rankPageController.LLIZLLLIL;
            if (interfaceC1810050xCd == null) {
                return;
            }
            interfaceC1810050xCd.mi();
        }
    }

    public static final void onChanged$49(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        List<RankListV2Response.Bulletin> list = (List) obj;
        if (list != null) {
            ((InterfaceC1810050xCd) aObserverS229S0100000_27.l0).Ug(list);
        }
    }

    public static final void onChanged$5(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        if (!LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
            ((RechargeDialogNew) aObserverS229S0100000_27.l0).yS();
            C1807180x80 c1807180x80 = ((RechargeDialogNew) aObserverS229S0100000_27.l0).LLL;
            if (c1807180x80 != null) {
                c1807180x80.LIZLLL();
                return;
            }
            return;
        }
        RechargePanelBodyAssemAbility rechargePanelBodyAssemAbilityGS = ((RechargeDialogNew) aObserverS229S0100000_27.l0).gS();
        if (rechargePanelBodyAssemAbilityGS == null) {
            return;
        }
        rechargePanelBodyAssemAbilityGS.de2();
    }

    public static final void onChanged$50(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        LynxRankView lynxRankView = (LynxRankView) obj;
        if (lynxRankView != null) {
            ((InterfaceC1810050xCd) aObserverS229S0100000_27.l0).Ok(lynxRankView);
        }
    }

    public static final void onChanged$51(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        RankListV2Response.RankView rankView = (RankListV2Response.RankView) obj;
        if (rankView != null) {
            ((InterfaceC1810050xCd) aObserverS229S0100000_27.l0).z8(rankView);
        }
    }

    public static final void onChanged$52(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        RankListV2Response.ClassActivityBannerExtra.CountdownInfo countdownInfo;
        C1790870whh c1790870whh = (C1790870whh) obj;
        if (c1790870whh != null) {
            RankRootController rankRootController = (RankRootController) aObserverS229S0100000_27.l0;
            RankListV2Response.ClassActivityBannerExtra classActivityBannerExtra = c1790870whh.LIZJ;
            if (classActivityBannerExtra != null && (countdownInfo = classActivityBannerExtra.countdownInfo) != null) {
                rankRootController.getClass();
                long jCurrentTimeMillis = countdownInfo.endTimestampSec - (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                CountDownTimerC1811820xFU countDownTimerC1811820xFU = rankRootController.LLILZLL;
                if (countDownTimerC1811820xFU != null) {
                    countDownTimerC1811820xFU.cancel();
                }
                CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = rankRootController.LLILZLL;
                if (countDownTimerC1811820xFU2 != null) {
                    countDownTimerC1811820xFU2.LIZ = null;
                }
                long j = 1000 * jCurrentTimeMillis;
                CountDownTimerC1811820xFU countDownTimerC1811820xFU3 = new CountDownTimerC1811820xFU(j);
                countDownTimerC1811820xFU3.start();
                C1790720whS c1790720whS = rankRootController.LLIZ;
                countDownTimerC1811820xFU3.LIZ = c1790720whS;
                if (c1790720whS != null) {
                    c1790720whS.LJJI(j);
                }
                InterfaceC1790880whi interfaceC1790880whi = rankRootController.LLILZ;
                if (interfaceC1790880whi != null) {
                    interfaceC1790880whi.YE(jCurrentTimeMillis);
                }
                rankRootController.LLILZLL = countDownTimerC1811820xFU3;
            } else {
                InterfaceC1790880whi interfaceC1790880whi2 = rankRootController.LLILZ;
                if (interfaceC1790880whi2 != null) {
                    interfaceC1790880whi2.YE(-1L);
                }
            }
            InterfaceC1790880whi interfaceC1790880whi3 = ((RankRootController) aObserverS229S0100000_27.l0).LLILZ;
            if (interfaceC1790880whi3 != null) {
                interfaceC1790880whi3.qj(c1790870whh);
            }
        }
    }

    public static final void onChanged$53(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        InterfaceC1790880whi interfaceC1790880whi;
        C1790730whT c1790730whT = (C1790730whT) obj;
        if (c1790730whT != null && (interfaceC1790880whi = ((RankRootController) aObserverS229S0100000_27.l0).LLILZ) != null) {
            interfaceC1790880whi.i(c1790730whT);
        }
    }

    public static final void onChanged$54(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((InterfaceC1810570xDT) aObserverS229S0100000_27.l0).c2((List) obj);
    }

    public static final void onChanged$55(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        String str = (String) obj;
        if (str != null) {
            ((InterfaceC1810570xDT) aObserverS229S0100000_27.l0).LJLILLLLZI(str);
        }
    }

    public static final void onChanged$56(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        String str = (String) obj;
        if (str != null) {
            ((InterfaceC1810570xDT) aObserverS229S0100000_27.l0).Pi(str);
        }
    }

    public static final void onChanged$57(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1810170xCp c1810170xCp = (C1810170xCp) obj;
        if (c1810170xCp != null) {
            ((InterfaceC1810570xDT) aObserverS229S0100000_27.l0).Ty(c1810170xCp);
        }
    }

    public static final void onChanged$58(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1790730whT c1790730whT = (C1790730whT) obj;
        if (c1790730whT != null) {
            ((InterfaceC1810570xDT) aObserverS229S0100000_27.l0).i(c1790730whT);
        }
    }

    public static final void onChanged$59(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1790870whh c1790870whh = (C1790870whh) obj;
        if (c1790870whh != null) {
            ((InterfaceC1810570xDT) aObserverS229S0100000_27.l0).mk(c1790870whh);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$6(Y.AObserverS229S0100000_27 r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS229S0100000_27.onChanged$6(Y.AObserverS229S0100000_27, java.lang.Object):void");
    }

    public static final void onChanged$60(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) throws Throwable {
        Pair pair = (Pair) obj;
        if (pair != null) {
            LiveSearchResultFragment liveSearchResultFragment = (LiveSearchResultFragment) aObserverS229S0100000_27.l0;
            EditText editText = liveSearchResultFragment.LL;
            Editable editableLLJILLL = null;
            if (editText != null) {
                editableLLJILLL = C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl7S+2DnkbzffxjyqvOq01IYdy3U3sot4Nq0BUPT9XZNE/sSZ7pF27HePL3ouwTvs=", null));
            }
            if (!TextUtils.equals(editableLLJILLL, (CharSequence) pair.getFirst())) {
                EditText editText2 = liveSearchResultFragment.LL;
                if (editText2 != null) {
                    editText2.setText((CharSequence) pair.getFirst());
                }
                EditText editText3 = liveSearchResultFragment.LL;
                if (editText3 != null) {
                    editText3.setSelection(((String) pair.getFirst()).length());
                }
                if (((Number) pair.getSecond()).intValue() == 0) {
                    liveSearchResultFragment.OR(true);
                } else {
                    liveSearchResultFragment.OR(false);
                }
            }
        }
    }

    public static final void onChanged$61(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((LiveSearchResultFragment) aObserverS229S0100000_27.l0).SR((C472030IfB) obj);
    }

    public static final void onChanged$7(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        ((RechargeDialogNew) aObserverS229S0100000_27.l0).GS(false);
    }

    public static final void onChanged$8(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1804450x3b.LIZ("google_play");
        if (LiveRechargePanelRefactorSetting.INSTANCE.getValue()) {
            RechargePanelBodyAssemAbility rechargePanelBodyAssemAbilityGS = ((RechargeDialogNew) aObserverS229S0100000_27.l0).gS();
            if (rechargePanelBodyAssemAbilityGS != null) {
                rechargePanelBodyAssemAbilityGS.C30();
                return;
            }
            return;
        }
        ((RechargeDialogNew) aObserverS229S0100000_27.l0).UR();
    }

    public static final void onChanged$9(AObserverS229S0100000_27 aObserverS229S0100000_27, Object obj) {
        C1804450x3b.LIZ("tiktok");
        ((RechargeDialogNew) aObserverS229S0100000_27.l0).UR();
    }
}
