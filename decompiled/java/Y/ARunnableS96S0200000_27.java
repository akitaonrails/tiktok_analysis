package Y;

import X.AbstractC1801730wzD;
import X.AbstractC1841200y0s;
import X.AbstractC21673719rz;
import X.C098200Yq;
import X.C0DSB;
import X.C0I99;
import X.C1203430hQD;
import X.C1383370m6R;
import X.C13LE;
import X.C1561220qjI;
import X.C1697810uHb;
import X.C16F5;
import X.C1778020wMy;
import X.C1778070wN3;
import X.C1781330wSJ;
import X.C1793950wmf;
import X.C1794640wnm;
import X.C1801770wzH;
import X.C1801920wzW;
import X.C1810410xDD;
import X.C1810690xDf;
import X.C1811940xFg;
import X.C1833730xop;
import X.C1834580xqC;
import X.C1841180y0q;
import X.C1842270y2b;
import X.C1845060y76;
import X.C1849960yF0;
import X.C1853060yK0;
import X.C1854240yLu;
import X.C1854340yM4;
import X.C1854760yMk;
import X.C1861310yXJ;
import X.C1861330yXL;
import X.C189200o6;
import X.C19549911eD;
import X.C1C7U;
import X.C20189513zB;
import X.C20441214yg;
import X.C2174781A9k;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C339190DRl;
import X.C426320Gne;
import X.C475510Ikn;
import X.C723830SaL;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1811400xEo;
import X.InterfaceC1799250wvD;
import X.InterfaceC1801760wzG;
import X.InterfaceC1804390x3V;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import X.ViewOnLayoutChangeListenerC1861320yXK;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;
import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingSubPageFragment;
import com.bytedance.android.live.walletnew.RechargeDialogNew;
import com.bytedance.android.live.walletnew.event.WalletRechargePanelRendered;
import com.bytedance.android.livesdk.feed.drawerfeed.search.LiveSearchResultFragment;
import com.bytedance.android.livesdk.game.broadcast.highlight.DownloadProgressDialog;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletNewRechargeLatencyTrackingEnabledSetting;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLFragment;
import com.ss.android.ugc.aweme.ad.comment.reviewtab.ui.powerlist.ReviewCell;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelListCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MinisFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.view.TakoInputExpandTextViewFragment;
import com.ss.android.ugc.aweme.tako.botpage.cards.questionnaire.TakoQuestionnaireAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.multipletemplate.bottomselected.BottomSelectedMediaAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoMediaChooseView;
import com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto.PreviewPhotoFragment;
import com.ss.android.ugc.aweme.tako.performance.mob.experiment.TakoImgPreloadConfig;
import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.api.room.WebcastRoomRepostRepostersResponse;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS96S0200000_27 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
            case 32:
                run$32(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                run$33(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                run$34(this);
                break;
            case 35:
                run$35(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        RankListV2Response.RankView rankView = ((RankListController) this.l0).LJIIIZ().LLILLJJLI;
        C1810410xDD c1810410xDD = ((RankListFragment) this.l1).LLILLL;
        boolean z = ((RankListController) this.l0).LIZ().LLILLL;
        DataChannel dataChannelLJ = C475510Ikn.LJ((RankListFragment) this.l1);
        c1810690xDf.getClass();
        C1810690xDf.LJJIJIIJI(rankView, c1810410xDD, z, dataChannelLJ);
        if (((RankListController) this.l0).LJIIIZ().LL.LIZ == EnumC1811400xEo.E_COMMERCE) {
            C1810690xDf.LJIIL(C475510Ikn.LJ((RankListFragment) this.l1), ((RankListController) this.l0).LJIIIZ().LLILLJJLI);
            ((RankListFragment) this.l1).LLJJIJIIJIL.LIZLLL = System.currentTimeMillis();
        }
    }

    public final void LIZ$1() {
        C1810690xDf c1810690xDf = C1810690xDf.LIZ;
        RankListV2Response.RankView rankView = ((RankListController) this.l0).LJIIIZ().LLILLJJLI;
        C1810410xDD c1810410xDD = ((RankListFragment) this.l1).LLILLL;
        boolean z = ((RankListController) this.l0).LIZ().LLILLL;
        DataChannel dataChannelLJ = C475510Ikn.LJ((RankListFragment) this.l1);
        c1810690xDf.getClass();
        C1810690xDf.LJJIJIIJI(rankView, c1810410xDD, z, dataChannelLJ);
        if (((RankListController) this.l0).LJIIIZ().LL.LIZ == EnumC1811400xEo.E_COMMERCE) {
            C1810690xDf.LJIIL(C475510Ikn.LJ((RankListFragment) this.l1), ((RankListController) this.l0).LJIIIZ().LLILLJJLI);
            ((RankListFragment) this.l1).LLJJIJIIJIL.LIZLLL = System.currentTimeMillis();
        }
    }

    public final void LIZ$2() {
        LiveSearchResultFragment liveSearchResultFragment;
        EditText editText;
        if (((EditText) this.l0).getParent() == null || (editText = (liveSearchResultFragment = (LiveSearchResultFragment) this.l1).LL) == null || liveSearchResultFragment.LLJ || !liveSearchResultFragment.mStatusViewValid) {
            return;
        }
        try {
            editText.requestFocus();
            editText.setCursorVisible(true);
            KeyBoardUtil.LIZLLL(liveSearchResultFragment.getContext(), editText);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$3() {
        C1561220qjI.LIZ.getClass();
        if (C1561220qjI.LIZ()) {
            BottomSelectedMediaAssem bottomSelectedMediaAssem = (BottomSelectedMediaAssem) this.l0;
            View view = (View) this.l1;
            bottomSelectedMediaAssem.getClass();
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            bottomSelectedMediaAssem.kp().LLJIJIL = view.getMeasuredHeight();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$4() {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS96S0200000_27.LIZ$4():void");
    }

    public final void LIZ$5() {
        String strLIZIZ;
        WebcastRoomRepostRepostersResponse.Reposter reposter = (WebcastRoomRepostRepostersResponse.Reposter) this.l0;
        if (reposter != null) {
            TuxTextView tuxTextView = (TuxTextView) ((RepostPanelListCell) this.l1).LLILLL.getValue();
            String str = reposter.repostNote;
            long jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - reposter.repostTimestamp;
            String str2 = "";
            if (jCurrentTimeMillis < 0) {
                strLIZIZ = "";
            } else {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long minutes = timeUnit.toMinutes(jCurrentTimeMillis);
                if (minutes < 1) {
                    strLIZIZ = C1383370m6R.LJIIJ(2131855706);
                } else if (minutes < 60) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(minutes);
                    sbLIZ.append('m');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    long hours = timeUnit.toHours(jCurrentTimeMillis);
                    if (hours < 24) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(hours);
                        sbLIZ2.append('h');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    } else {
                        long days = timeUnit.toDays(jCurrentTimeMillis);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(days);
                        sbLIZ3.append('d');
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                }
            }
            try {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(str);
                sbLIZ4.append(" ");
                sbLIZ4.append(strLIZIZ);
                C2188811AlT.LIZIZ(sbLIZ4);
                if ((tuxTextView.getWidth() - tuxTextView.getPaddingLeft()) - tuxTextView.getPaddingRight() > 0) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(str);
                    sbLIZ5.append(" ");
                    sbLIZ5.append(strLIZIZ);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
                    if (RepostPanelListCell.L5(tuxTextView, strLIZIZ2).getLineCount() <= 2) {
                        tuxTextView.setText(RepostPanelListCell.I5(tuxTextView, strLIZIZ2, str));
                        return;
                    }
                    int length = str.length();
                    int i = 0;
                    while (i <= length) {
                        int i2 = (i + length) / 2;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append(a0.LJLILLLLZI(str.substring(0, i2)).toString());
                        sbLIZ6.append("…");
                        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(strLIZIZ3);
                        sbLIZ7.append(" ");
                        sbLIZ7.append(strLIZIZ);
                        if (RepostPanelListCell.L5(tuxTextView, C2188811AlT.LIZIZ(sbLIZ7)).getLineCount() <= 2) {
                            i = i2 + 1;
                            str2 = strLIZIZ3;
                        } else {
                            length = i2 - 1;
                        }
                    }
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(str2);
                    sbLIZ8.append(" ");
                    sbLIZ8.append(strLIZIZ);
                    tuxTextView.setText(RepostPanelListCell.I5(tuxTextView, C2188811AlT.LIZIZ(sbLIZ8), str2));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("RepostPanelListCell", e);
            }
        }
    }

    public final void LIZ$6() {
        LiveHighLightPageFragment liveHighLightPageFragment = (LiveHighLightPageFragment) this.l0;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = liveHighLightPageFragment.LLJJI;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            Iterator it2 = ((List) this.l1).iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                int i2 = ((C1833730xop) it2.next()).LLILLJJLI;
                C1834580xqC c1834580xqCLIZ = liveHighLightPageFragment.iS().getState().LLILZ.LIZ();
                if (i2 == (c1834580xqCLIZ != null ? c1834580xqCLIZ.LL : liveHighLightPageFragment.LLJJL)) {
                    break;
                } else {
                    i++;
                }
            }
            viewOnAttachStateChangeListenerC20631115oD.setCurrentItem(i);
        }
    }

    public final void LIZ$7() {
        TakoInputViewUIAbility takoInputViewUIAbility;
        TakoInputViewUIAbility takoInputViewUIAbility2 = (TakoInputViewUIAbility) ((TakoContentAssem) this.l0).LLLLII.getValue();
        if (takoInputViewUIAbility2 != null) {
            takoInputViewUIAbility2.fg(null, true);
        }
        if (!C1697810uHb.LJIIJJI(205, 206, 201).contains(Integer.valueOf(((Message) this.l1).LJFF)) || (takoInputViewUIAbility = (TakoInputViewUIAbility) ((TakoContentAssem) this.l0).LLLLII.getValue()) == null) {
            return;
        }
        takoInputViewUIAbility.Jd(null, false);
    }

    public static final void run$0(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("KeyboardHelper@e3a3.showKeyboard$1");
        try {
            ((EditText) aRunnableS96S0200000_27.l0).requestFocus();
            ((InputMethodManager) C786410Ut5.F2(((C19549911eD) aRunnableS96S0200000_27.l1).LIZ, "input_method")).showSoftInput((EditText) aRunnableS96S0200000_27.l0, 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KeyboardHelper@e3a3.showKeyboard$1");
    }

    public static final void run$1(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        DataChannel dataChannel;
        C1C7U.LIZ("RechargeDialogNew@383d.logProductLoadErrorTracking$1");
        try {
            if (LiveWalletNewRechargeLatencyTrackingEnabledSetting.INSTANCE.getValue() && (dataChannel = ((RechargeDialogNew) aRunnableS96S0200000_27.l0).LLJZ) != null) {
                dataChannel.zW(WalletRechargePanelRendered.class, new Pair(Boolean.FALSE, (InterfaceC1804390x3V) aRunnableS96S0200000_27.l1));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RechargeDialogNew@383d.logProductLoadErrorTracking$1");
    }

    public static final void run$10(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoInputExpandTextViewFragment@4694.onViewCreated$4$onClick$lambda$1$$inlined$postDelayed$1");
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) ((TakoInputExpandTextViewFragment) aRunnableS96S0200000_27.l0).LLIZ.getValue();
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput((C1842270y2b) aRunnableS96S0200000_27.l1, 1);
            }
            ((TakoInputExpandTextViewFragment) aRunnableS96S0200000_27.l0).gt2(((C1842270y2b) aRunnableS96S0200000_27.l1).getSelectionStart(), true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoInputExpandTextViewFragment@4694.onViewCreated$4$onClick$lambda$1$$inlined$postDelayed$1");
    }

    public static final void run$11(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("BottomSelectedMediaAssem@a3bf.onViewCreated$6");
        try {
            C1853060yK0 state = ((BottomSelectedMediaAssem) aRunnableS96S0200000_27.l0).kp().getState();
            ((BottomSelectedMediaAssem) aRunnableS96S0200000_27.l0).op(state.LL, state.LLIZ, true, (View) aRunnableS96S0200000_27.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomSelectedMediaAssem@a3bf.onViewCreated$6");
    }

    public static final void run$12(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("BottomSelectedMediaAssem@a3bf.refreshListData$1");
        try {
            aRunnableS96S0200000_27.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomSelectedMediaAssem@a3bf.refreshListData$1");
    }

    public static final void run$13(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewPhotoFragment@6965.onViewCreated$4$3");
        try {
            PreviewPhotoFragment previewPhotoFragment = (PreviewPhotoFragment) aRunnableS96S0200000_27.l0;
            if (!previewPhotoFragment.LLJJI) {
                previewPhotoFragment.LLJJI = true;
                ((ViewOnAttachStateChangeListenerC20631115oD) aRunnableS96S0200000_27.l1).setCurrentItem(previewPhotoFragment.LLJJ, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewPhotoFragment@6965.onViewCreated$4$3");
    }

    public static final void run$14(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoImageEditBottomInputView@2dbf.<init>$2$2$afterTextChanged$1");
        try {
            if (((C1842270y2b) aRunnableS96S0200000_27.l0).getLineCount() < 5) {
                TuxIconView tuxIconView = ((C1854340yM4) aRunnableS96S0200000_27.l1).LLILLL;
                if (tuxIconView != null) {
                    C339190DRl.LIZIZ(tuxIconView);
                }
            } else {
                TuxIconView tuxIconView2 = ((C1854340yM4) aRunnableS96S0200000_27.l1).LLILLL;
                if (tuxIconView2 != null) {
                    C0DSB.LIZJ(tuxIconView2);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoImageEditBottomInputView@2dbf.<init>$2$2$afterTextChanged$1");
    }

    public static final void run$15(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("AdjustablePaddingTargetFooter@578.getFooterHeight$1");
        try {
            ViewOnLayoutChangeListenerC1861320yXK viewOnLayoutChangeListenerC1861320yXK = (ViewOnLayoutChangeListenerC1861320yXK) aRunnableS96S0200000_27.l0;
            viewOnLayoutChangeListenerC1861320yXK.LLJILLL = false;
            C1861310yXJ c1861310yXJ = (C1861310yXJ) aRunnableS96S0200000_27.l1;
            C1861330yXL.LIZLLL(c1861310yXJ.LIZLLL, c1861310yXJ.LIZIZ, viewOnLayoutChangeListenerC1861320yXK.LLJJJJ, new AwS606S0100000_27(c1861310yXJ, 348));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdjustablePaddingTargetFooter@578.getFooterHeight$1");
    }

    public static final void run$16(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("AdjustablePaddingTargetFooter@578.getFooterHeight$2");
        try {
            ViewOnLayoutChangeListenerC1861320yXK viewOnLayoutChangeListenerC1861320yXK = (ViewOnLayoutChangeListenerC1861320yXK) aRunnableS96S0200000_27.l0;
            viewOnLayoutChangeListenerC1861320yXK.LLJILLL = false;
            C1861310yXJ c1861310yXJ = (C1861310yXJ) aRunnableS96S0200000_27.l1;
            C1861330yXL.LIZLLL(c1861310yXJ.LIZLLL, c1861310yXJ.LIZIZ, viewOnLayoutChangeListenerC1861320yXK.LLJJJJ, new AwS606S0100000_27(c1861310yXJ, 349));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdjustablePaddingTargetFooter@578.getFooterHeight$2");
    }

    public static final void run$17(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("AppearMotionItemAnimator@4aa3.runPendingAnimations$adder$1");
        try {
            aRunnableS96S0200000_27.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AppearMotionItemAnimator@4aa3.runPendingAnimations$adder$1");
    }

    public static final void run$18(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("RepostPanelListCell@8d10.bindNoteAndTime$1");
        try {
            aRunnableS96S0200000_27.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RepostPanelListCell@8d10.bindNoteAndTime$1");
    }

    public static final void run$19(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("BaseAppWidgetProvider@f288.onReceive$1");
        try {
            AbstractC1841200y0s abstractC1841200y0s = (AbstractC1841200y0s) aRunnableS96S0200000_27.l0;
            Context context = (Context) aRunnableS96S0200000_27.l1;
            abstractC1841200y0s.LJ(context, true, C1841180y0q.LIZ(context));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseAppWidgetProvider@f288.onReceive$1");
    }

    public static final void run$2(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("RankListFragment@6ae0.onVisibleChange$1$4");
        try {
            aRunnableS96S0200000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RankListFragment@6ae0.onVisibleChange$1$4");
    }

    public static final void run$20(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("LiveHighLightPageFragment@5404.subscribeData$10$3");
        try {
            aRunnableS96S0200000_27.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveHighLightPageFragment@5404.subscribeData$10$3");
    }

    public static final void run$21(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("BottomInputAssem@df38.initCarriedPhotoIfNeeded$$inlined$postDelayed$1");
        try {
            C20189513zB.LJIIIIZZ(1, C724240Sb0.LIZ((BottomInputAssem) aRunnableS96S0200000_27.l0), new AwS393S0200000_27((BottomInputAssem) aRunnableS96S0200000_27.l0, (View) aRunnableS96S0200000_27.l1, 120));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomInputAssem@df38.initCarriedPhotoIfNeeded$$inlined$postDelayed$1");
    }

    public static final void run$22(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("BottomInputAssem@df38.initInputView$4");
        try {
            ((C1854760yMk) aRunnableS96S0200000_27.l0).getInputView().setHintTextWithEndEllipsize(((BottomInputAssem) aRunnableS96S0200000_27.l1).NV1());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomInputAssem@df38.initInputView$4");
    }

    public static final void run$23(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoContentAssem@bd9.bind$2$5$1");
        try {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((TakoContentAssem) aRunnableS96S0200000_27.l0).LLJJL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                viewOnAttachStateChangeListenerC20604515jv.setItemAnimator((AbstractC21673719rz) aRunnableS96S0200000_27.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoContentAssem@bd9.bind$2$5$1");
    }

    public static final void run$24(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoContentAssem@bd9.bind$2$5");
        try {
            TakoContentAssem takoContentAssem = (TakoContentAssem) aRunnableS96S0200000_27.l0;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = takoContentAssem.LLJJL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS96S0200000_27(takoContentAssem, (AbstractC21673719rz) aRunnableS96S0200000_27.l1, 23));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoContentAssem@bd9.bind$2$5");
    }

    public static final void run$25(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoContentAssem@bd9.listenMessageState$1$onAskQuestionStart$1");
        try {
            aRunnableS96S0200000_27.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoContentAssem@bd9.listenMessageState$1$onAskQuestionStart$1");
    }

    public static final void run$26(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        C1794640wnm c1794640wnm = (C1794640wnm) aRunnableS96S0200000_27.l0;
        C1793950wmf c1793950wmf = (C1793950wmf) aRunnableS96S0200000_27.l1;
        c1794640wnm.getClass();
        C1C7U.LIZ("IapObserverServiceImpl@105b.notifyPayTimeOutCallback$1L");
        c1794640wnm.LIZLLL(c1793950wmf);
        C1C7U.LIZIZ("IapObserverServiceImpl@105b.notifyPayTimeOutCallback$1L");
    }

    public static final void run$27(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("RewardCarouselLoadingViewComponent@2a2b.hideProgress$1");
        try {
            C786410Ut5.LLLZZ((C426320Gne) aRunnableS96S0200000_27.l0, 8);
            C786410Ut5.E5((C426320Gne) aRunnableS96S0200000_27.l0, 1.0f);
            C1845060y76 c1845060y76 = (C1845060y76) aRunnableS96S0200000_27.l1;
            c1845060y76.LIZLLL = 10.0f;
            C426320Gne c426320Gne = c1845060y76.LIZIZ;
            if (c426320Gne != null) {
                c426320Gne.LIZ(10.0f, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RewardCarouselLoadingViewComponent@2a2b.hideProgress$1");
    }

    public static final void run$28(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MinisRevisitRewardConfigRepository@971f.dispatchResult$1");
        try {
            ((InterfaceC1799250wvD) aRunnableS96S0200000_27.l0).LIZ((C1781330wSJ) aRunnableS96S0200000_27.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisRevisitRewardConfigRepository@971f.dispatchResult$1");
    }

    public static final void run$29(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoMediaChooseView@829c.setupManagers$1$onStateChanged$1");
        try {
            C786410Ut5.LJLLLLLL(0, (View) aRunnableS96S0200000_27.l0);
            C1854240yLu c1854240yLu = ((TakoMediaChooseView) aRunnableS96S0200000_27.l1).LLJJJJ;
            if (c1854240yLu != null) {
                c1854240yLu.LIZ().setState(3);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoMediaChooseView@829c.setupManagers$1$onStateChanged$1");
    }

    public static final void run$3(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("RankListFragment@6ae0.onViewCreated$2$1$2");
        try {
            aRunnableS96S0200000_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RankListFragment@6ae0.onViewCreated$2$1$2");
    }

    public static final void run$30(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MinisStartEntranceMissionMethodNative@e1cb.handle$1");
        try {
            ((C1801770wzH) aRunnableS96S0200000_27.l0).getClass();
            new AbstractC1801730wzD() { // from class: X.0wzW
                public static void LIZJ(CompletionBlock completionBlock) {
                    Activity activityLIZIZ;
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null) {
                        activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
                    } else {
                        activityLIZIZ = null;
                    }
                    C2196701AyC.LIZ.getClass();
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    SchemaParserData schemaParserData = C2195221Avo.LJII;
                    if (schemaParserData != null) {
                        for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                            map.put(entry.getKey(), entry.getValue());
                        }
                    }
                    C08S3.LIZLLL("tm_center_edu_get_started_initiated", map, map2, null);
                    MiniGameFragment miniGameFragmentLIZIZ = C2195221Avo.LIZIZ();
                    if (miniGameFragmentLIZIZ != null) {
                        EnumC2196901AyW enumC2196901AyW = EnumC2196901AyW.STARTENTRANCEMISSION;
                        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MinisFragment.LLLLLLJ;
                        miniGameFragmentLIZIZ.SR(enumC2196901AyW, false);
                    }
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZIZ, "//main");
                    smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "USER");
                    smartRouteBuildRoute.withParam("minis_auto_open_profile_more", true);
                    smartRouteBuildRoute.withParam("minis_auto_open_profile_more_from", "revisit_edu_api");
                    if (((Boolean) C0AN1.LIZ.getValue()).booleanValue()) {
                        smartRouteBuildRoute.withParam("key_menu_specify_item_highlight", new String[]{"content_section_cell_tiktok_minis", "content_section_cell_tiktok_minis_rich_card"});
                    }
                    smartRouteBuildRoute.addFlags(67108864);
                    smartRouteBuildRoute.open();
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1801760wzG.class, null);
                    InterfaceC1801760wzG interfaceC1801760wzG = (InterfaceC1801760wzG) xBaseModelLIZJ;
                    interfaceC1801760wzG.setSuccess(Boolean.TRUE);
                    interfaceC1801760wzG.setErrorCode(0);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                }

                @Override // X.AbstractC1549150qPp
                public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
                    LIZJ(completionBlock);
                }
            };
            final C1801770wzH c1801770wzH = (C1801770wzH) aRunnableS96S0200000_27.l0;
            final Number number = (Number) aRunnableS96S0200000_27.l1;
            C1801920wzW.LIZJ(new CompletionBlock<InterfaceC1801760wzG>() { // from class: X.0wzI
                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final /* bridge */ /* synthetic */ void onRawSuccess(XBaseResultModel xBaseResultModel) {
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final void onSuccess(XBaseResultModel xBaseResultModel, String str) throws JSONException {
                    C1801770wzH c1801770wzH2 = c1801770wzH;
                    Number number2 = number;
                    c1801770wzH2.getClass();
                    c1801770wzH2.LJFF(number2, C1801770wzH.LJII((InterfaceC1801760wzG) xBaseResultModel));
                }

                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
                public final void onFailure(int i, String str, XBaseResultModel xBaseResultModel) throws JSONException {
                    C1801770wzH c1801770wzH2 = c1801770wzH;
                    Number number2 = number;
                    c1801770wzH2.getClass();
                    c1801770wzH2.LJ(number2, C1801770wzH.LJII((InterfaceC1801760wzG) xBaseResultModel));
                }
            });
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MinisStartEntranceMissionMethodNative@e1cb.handle$1");
    }

    public static final void run$31(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("MessagePatchHandler@605f.applyPatch$2");
        try {
            List list = (List) aRunnableS96S0200000_27.l0;
            TakoImgPreloadConfig takoImgPreloadConfig = (TakoImgPreloadConfig) aRunnableS96S0200000_27.l1;
            C0I99.LIZ(list, takoImgPreloadConfig.prefetchPriority, takoImgPreloadConfig.useCustomDiskCache, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessagePatchHandler@605f.applyPatch$2");
    }

    public static final void run$32(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        IMessageAbility iMessageAbility;
        C1C7U.LIZ("TakoQuestionnaireAssem@b499.dismissQuestionnaire$1$1");
        try {
            Function0 function0 = (Function0) aRunnableS96S0200000_27.l0;
            if (function0 != null) {
                function0.invoke();
            }
            C1203430hQD c1203430hQD = ((TakoQuestionnaireAssem) aRunnableS96S0200000_27.l1).LLJLIL;
            if (c1203430hQD != null) {
                c1203430hQD.setValue(0);
            }
            C1203430hQD c1203430hQD2 = ((TakoQuestionnaireAssem) aRunnableS96S0200000_27.l1).LLJLIL;
            if (c1203430hQD2 != null) {
                c1203430hQD2.setRatingTouchEnable(true);
            }
            TakoQuestionnaireAssem takoQuestionnaireAssem = (TakoQuestionnaireAssem) aRunnableS96S0200000_27.l1;
            Message message = takoQuestionnaireAssem.LLJLLL;
            if (message != null && (iMessageAbility = (IMessageAbility) takoQuestionnaireAssem.LLJZ.getValue()) != null) {
                iMessageAbility.dt0(message, false);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoQuestionnaireAssem@b499.dismissQuestionnaire$1$1");
    }

    public static final void run$33(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("CreatorRankingSubPageFragment@9b06.handlePendingScrollToRank$1$handled$3$1");
        try {
            if (((CreatorRankingSubPageFragment) aRunnableS96S0200000_27.l0).OR((C1778070wN3) aRunnableS96S0200000_27.l1)) {
                CreatorRankingPageViewModel creatorRankingPageViewModelNR = ((CreatorRankingSubPageFragment) aRunnableS96S0200000_27.l0).NR();
                C1778070wN3 c1778070wN3 = (C1778070wN3) aRunnableS96S0200000_27.l1;
                creatorRankingPageViewModelNR.onEvent(new C1778020wMy(c1778070wN3.LIZ, c1778070wN3.LIZIZ));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CreatorRankingSubPageFragment@9b06.handlePendingScrollToRank$1$handled$3$1");
    }

    public static final void run$34(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("WelcomeBackFeedLoadingView@78c4.playEntrance$2$1");
        try {
            C1849960yF0 c1849960yF0 = (C1849960yF0) aRunnableS96S0200000_27.l0;
            C1849960yF0.LIZ(c1849960yF0.LLILZLL, c1849960yF0.LIZIZ(6.0f));
            ((Function0) aRunnableS96S0200000_27.l1).invoke();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WelcomeBackFeedLoadingView@78c4.playEntrance$2$1");
    }

    public static final void run$35(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("WelcomeBackFeedLoadingView@78c4.playEntrance$2");
        try {
            C1849960yF0 c1849960yF0 = (C1849960yF0) aRunnableS96S0200000_27.l0;
            C1849960yF0.LIZ(c1849960yF0.LLILZ, c1849960yF0.LIZIZ(20.0f));
            C1849960yF0 c1849960yF02 = (C1849960yF0) aRunnableS96S0200000_27.l0;
            C786410Ut5.LJLIIL(200L, c1849960yF02.LL, new ARunnableS96S0200000_27(c1849960yF02, (Function0) aRunnableS96S0200000_27.l1, 34));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WelcomeBackFeedLoadingView@78c4.playEntrance$2");
    }

    public static final void run$4(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("LiveSearchResultFragment@49c0.handleKeyboardVisibility$1");
        try {
            aRunnableS96S0200000_27.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveSearchResultFragment@49c0.handleKeyboardVisibility$1");
    }

    public static final void run$5(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("HighLightVideoOperateImpl@b167.downloadVideoAndJumpShortVideoEditPage$2$onProgress$1");
        try {
            DownloadProgressDialog downloadProgressDialog = ((C1811940xFg) aRunnableS96S0200000_27.l0).LIZJ;
            if (downloadProgressDialog != null) {
                int downloadProcess = ((DownloadInfo) aRunnableS96S0200000_27.l1).getDownloadProcess();
                ProgressBar progressBar = downloadProgressDialog.LL;
                if (progressBar != null) {
                    progressBar.setProgress(downloadProcess);
                }
                C16F5 c16f5 = downloadProgressDialog.LLILLJJLI;
                if (c16f5 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(downloadProcess);
                    sbLIZ.append('%');
                    c16f5.setText(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HighLightVideoOperateImpl@b167.downloadVideoAndJumpShortVideoEditPage$2$onProgress$1");
    }

    public static final void run$6(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("SOTLFragment@9567.onConfigurationChanged$1");
        try {
            if (((SOTLFragment) aRunnableS96S0200000_27.l0).isAdded() && ((SOTLFragment) aRunnableS96S0200000_27.l0).getView() != null) {
                ((SOTLFragment) aRunnableS96S0200000_27.l0).MR((View) aRunnableS96S0200000_27.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SOTLFragment@9567.onConfigurationChanged$1");
    }

    public static final void run$7(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("ReviewCell@bca2.addExposureMonitor$1");
        try {
            C2211631BhB.LJ((View) aRunnableS96S0200000_27.l0, new AwS606S0100000_27((ReviewCell) aRunnableS96S0200000_27.l1, 73));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ReviewCell@bca2.addExposureMonitor$1");
    }

    public static final void run$8(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoBaseAssem@3fcb.onViewCreated$2");
        try {
            if (((View) aRunnableS96S0200000_27.l0).getParent() != null) {
                C723830SaL.LIZLLL((TakoBaseAssem) aRunnableS96S0200000_27.l1, C13LE.LIZ(TakoMultipleSelectAssem.class));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoBaseAssem@3fcb.onViewCreated$2");
    }

    public static final void run$9(ARunnableS96S0200000_27 aRunnableS96S0200000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoInputExpandTextViewFragment@4694.onViewCreated$3$2");
        try {
            C2174781A9k.LIZIZ((C1842270y2b) aRunnableS96S0200000_27.l0);
            ((TakoInputExpandTextViewFragment) aRunnableS96S0200000_27.l1).gt2(((C1842270y2b) aRunnableS96S0200000_27.l0).getSelectionStart(), false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoInputExpandTextViewFragment@4694.onViewCreated$3$2");
    }

    public ARunnableS96S0200000_27(RechargeDialogNew rechargeDialogNew, int i) {
        this.$t = i;
        this.l0 = rechargeDialogNew;
        this.l1 = null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS96S0200000_27(X.C1842270y2b r2, com.ss.android.ugc.aweme.tako.botpage.bottombox.view.TakoInputExpandTextViewFragment r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 9 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS96S0200000_27.<init>(X.0y2b, com.ss.android.ugc.aweme.tako.botpage.bottombox.view.TakoInputExpandTextViewFragment, int):void");
    }

    public ARunnableS96S0200000_27(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public ARunnableS96S0200000_27(C1801770wzH c1801770wzH, JSONObject jSONObject, Number number, int i) {
        this.$t = i;
        this.l0 = c1801770wzH;
        this.l1 = number;
    }
}
