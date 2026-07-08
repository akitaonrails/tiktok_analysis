package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.cover.PlaybookEditorCoverDialogV2;
import com.bytedance.android.livesdk.chatroom.viewmodule.QuickCommentWidget;
import com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget;
import com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.message.ActivityQuizCardMessage;
import com.bytedance.android.livesdk.model.message.ActivityQuizCardMessageSEIWrapper;
import com.bytedance.android.livesdk.model.message.ImDeleteMessage;
import com.bytedance.android.livesdk.model.message.PartnershipDropsCardChangeMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdk.quiz.ActQuizWidget;
import com.bytedance.android.livesdk.watch.WatchLiveService;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.series.vip.cell.SeriesVipSubscriptionHeaderCell;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.vm.LoadMoreResponse;
import com.ss.android.ugc.profile.business.ur.nickname.ProfileInfoNicknameProtocol;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.PlayImage;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.01zT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC514501zT implements Runnable {
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
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                run$36(this);
                break;
            case 37:
                run$37(this);
                break;
            case 38:
                run$38(this);
                break;
            case 39:
                run$39(this);
                break;
            case 40:
                run$40(this);
                break;
            case 41:
                run$41(this);
                break;
            case 42:
                run$42(this);
                break;
            case 43:
                run$43(this);
                break;
            case 44:
                run$44(this);
                break;
            case 45:
                run$45(this);
                break;
            case 46:
                run$46(this);
                break;
            case 47:
                run$47(this);
                break;
            case 48:
                run$48(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$0() {
        List<GiftMode> list;
        String str;
        String str2;
        List<TextPiece> list2;
        String str3;
        TextPieceImage textPieceImage;
        ImageModel imageModel;
        List<String> listLIZ;
        List<TextPiece> list3;
        C974990bTl c974990bTl = (C974990bTl) this.l0;
        C470590Icr c470590Icr = (C470590Icr) this.l1;
        MultiMatchPrepareResponse multiMatchPrepareResponse = c470590Icr != null ? (MultiMatchPrepareResponse) c470590Icr.data : null;
        c974990bTl.getClass();
        Text text = multiMatchPrepareResponse != null ? multiMatchPrepareResponse.giftEventDesc : null;
        if (((text == null || (list3 = text.pieces) == null) ? 0 : list3.size()) > 0 && text != null && (list2 = text.pieces) != null) {
            Iterator<TextPiece> it2 = list2.iterator();
            while (it2.hasNext()) {
                TextPiece next = it2.next();
                if ((next != null ? next.type : 0) == EnumC1133850fbz.IMAGE.getPieceType()) {
                    IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
                    if (next == null || (textPieceImage = next.imageValue) == null || (imageModel = textPieceImage.imageModel) == null || (listLIZ = C842240X2g.LIZ(imageModel)) == null || (str3 = (String) C13LP.LJJJLZIJ(0, listLIZ)) == null) {
                        str3 = "";
                    }
                    iHostFrescoHelper.my0(str3);
                }
            }
        }
        if (multiMatchPrepareResponse == null || (list = multiMatchPrepareResponse.giftMode) == null) {
            return;
        }
        for (GiftMode giftMode : list) {
            ImageModel imageModel2 = giftMode.giftIconImage;
            if (imageModel2 != null) {
                List<String> listLIZ2 = C842240X2g.LIZ(imageModel2);
                if (listLIZ2 == null || (str2 = (String) C13LP.LJJJLZIJ(0, listLIZ2)) == null) {
                    str2 = "";
                }
                C1143680frq.LJJIII(str2);
            }
            ImageModel imageModel3 = giftMode.eventIconImage;
            if (imageModel3 != null) {
                List<String> listLIZ3 = C842240X2g.LIZ(imageModel3);
                if (listLIZ3 == null || (str = (String) C13LP.LJJJLZIJ(0, listLIZ3)) == null) {
                    str = "";
                }
                C1143680frq.LJJIII(str);
            }
        }
    }

    public final void LIZ$1() {
        Layout layout = ((TextView) this.l0).getLayout();
        if (layout != null) {
            View view = (View) this.l1;
            if (layout.getLineCount() > 1) {
                view.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
                view.requestLayout();
            } else {
                view.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                view.requestLayout();
            }
        }
    }

    public final void LIZ$2() {
        Playbook playbook;
        Playbook playbook2;
        ((BasePlaybookViewModel) this.l0).LLILLL.setValue((C20379114of) this.l1);
        C20379114of c20379114of = (C20379114of) this.l1;
        Long lValueOf = null;
        Long lValueOf2 = (c20379114of == null || (playbook2 = c20379114of.LIZ) == null) ? null : Long.valueOf(playbook2.playbookId);
        C20379114of value = ((BasePlaybookViewModel) this.l0).LLILZ.getValue();
        if (value != null && (playbook = value.LIZ) != null) {
            lValueOf = Long.valueOf(playbook.playbookId);
        }
        if (Intrinsics.LJFF(lValueOf2, lValueOf) && lValueOf2 != null && lValueOf != null) {
            ((BasePlaybookViewModel) this.l0).LLILZ.setValue((C20379114of) this.l1);
        }
        String strXQ2 = ((BasePlaybookViewModel) this.l0).xQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set detailPlaybookLiveData: ");
        sbLIZ.append((C20379114of) this.l1);
        C20441214yg.LIZIZ(strXQ2, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ$3() throws JSONException {
        ((C118300cf) this.l0).element++;
        C162800jq c162800jq = C162800jq.LIZ;
        String[] strArr = (String[]) this.l1;
        c162800jq.getClass();
        Map mapLIZ = C162800jq.LIZ(strArr);
        if (mapLIZ == null || mapLIZ.isEmpty()) {
            return;
        }
        C118300cf c118300cf = (C118300cf) this.l0;
        for (Map.Entry entry : mapLIZ.entrySet()) {
            Object key = entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", key);
            jSONObject.put("count", jLongValue);
            jSONObject.put("index", c118300cf.element);
            C0S4Q.LIZJ(jSONObject);
            C20684815ws.LJIJ("memory_dumpsys_debug", jSONObject);
        }
    }

    public final void LIZ$5() {
        ((C703900RjI) this.l0).LJFF.clear();
        for (Map.Entry entry : ((Map) this.l1).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (str.length() > 0) {
                ((C703900RjI) this.l0).LJFF.put(str, (Set<String>) value);
            }
        }
    }

    public final void LIZ$6() throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = (Map) this.l0;
        Map map2 = (Map) this.l1;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            if (((List) map2.get(key)) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!r4.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put(key, arrayList);
                }
            } else {
                linkedHashMap.put(key, list);
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("missing", new JSONObject(linkedHashMap));
        C185100nR.LIZIZ(C185100nR.LIZ, "biz_scenes", jSONObject, null, 12);
    }

    public final void LIZ$7() {
        if (((View) this.l0).getParent() == null) {
            return;
        }
        Iterator it2 = ((ArrayList) ((C1258650irH) this.l1).LLILZ).iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
            it2.remove();
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeTaskList: ");
        sbLIZ.append(((ArrayList) ((C1258650irH) this.l1).LLILZ).size());
        C1720106oR.LJI("PostListScrollListener", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ$4() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insertRealTimeGift: timeout ");
        sbLIZ.append(((C012H) this.l0).LIZJ);
        C20441214yg.LJ("RecommendGiftWrapper", C2188811AlT.LIZIZ(sbLIZ));
        C012H c012h = (C012H) this.l0;
        if (c012h.LIZJ) {
            return;
        }
        c012h.LJ = null;
        if (c012h.LIZIZ != null) {
            System.currentTimeMillis();
        }
        ((Function2) this.l1).invoke(null, C13BV.INSTANCE);
    }

    public static final void run$0(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("MessageHandler@e520.consumeMessage$2$1");
        try {
            ((C381501e1) runnableC514501zT.l0).LIZIZ((C381601e2) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MessageHandler@e520.consumeMessage$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$1(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("CohostInviteUtilKt@bc0b.showMultiGuestDisconnectDialog$1$1$1");
        try {
            LiveDialog liveDialog = (LiveDialog) ((C259800zU) runnableC514501zT.l0).element;
            if (liveDialog != null) {
                liveDialog.dismiss();
                C785410UrT.LIZ(liveDialog);
            }
            ((Function1) runnableC514501zT.l1).invoke(Boolean.valueOf(!C924810aAp.LJ().LJIIIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CohostInviteUtilKt@bc0b.showMultiGuestDisconnectDialog$1$1$1");
    }

    public static final void run$10(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("VideoImageMixedController@1fe.resizeImages$1$1$1$1");
        try {
            ((VideoImageMixedController) runnableC514501zT.l0).LJLJJI((Activity) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoImageMixedController@1fe.resizeImages$1$1$1$1");
    }

    public static final void run$11(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("VideoImageMixedController@1fe.prepareWithLoading$1$1$1$1");
        try {
            ((VideoImageMixedController) runnableC514501zT.l0).LJLJJI((Activity) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoImageMixedController@1fe.prepareWithLoading$1$1$1$1");
    }

    public static final void run$12(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("TakoNimbleVM@c644.requestSourceData$1$1$2$1");
        try {
            Function1 function1 = (Function1) runnableC514501zT.l0;
            if (function1 != null) {
                function1.invoke((LoadMoreResponse) runnableC514501zT.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoNimbleVM@c644.requestSourceData$1$1$2$1");
    }

    public static final void run$13(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("TopicReviewListAssem@b688.onViewCreated$2$1$1");
        try {
            RecyclerView.LayoutManager layoutManager = ((ViewOnAttachStateChangeListenerC20604515jv) runnableC514501zT.l0).getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(((Integer) runnableC514501zT.l1).intValue());
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopicReviewListAssem@b688.onViewCreated$2$1$1");
    }

    public static final void run$14(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("ProfileInfoNicknameProtocol@8e9f.emptyNameView$2$1$1$1$1");
        try {
            if (((TuxTextView) runnableC514501zT.l0).getVisibility() == 0) {
                ProfileInfoNicknameProtocol profileInfoNicknameProtocol = (ProfileInfoNicknameProtocol) runnableC514501zT.l1;
                Context context = ((TuxTextView) runnableC514501zT.l0).getContext();
                TuxTextView tuxTextView = (TuxTextView) runnableC514501zT.l0;
                profileInfoNicknameProtocol.getClass();
                ProfileInfoNicknameProtocol.LJLL(context, tuxTextView);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProfileInfoNicknameProtocol@8e9f.emptyNameView$2$1$1$1$1");
    }

    public static final void run$15(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("IAPErrorToWebHandler@b3e7.handleRechargeException$2");
        try {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) runnableC514501zT.l0, ((C495520Jby) runnableC514501zT.l1).LIZLLL());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IAPErrorToWebHandler@b3e7.handleRechargeException$2");
    }

    public static final void run$16(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("EventNotifyManager@ab61.onViewClick$1");
        try {
            ((HashSet) ((C1847950yBl) runnableC514501zT.l1).LIZLLL).remove(Integer.valueOf(((View) runnableC514501zT.l0).hashCode()));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EventNotifyManager@ab61.onViewClick$1");
    }

    public static final void run$17(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("CompetitionAnchorLauncher@ecb7.requestMatchPrepareApi$2$1");
        try {
            runnableC514501zT.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CompetitionAnchorLauncher@ecb7.requestMatchPrepareApi$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$18(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        int i;
        C1C7U.LIZ("SelectorConfirmWidgetAssem@2252.setupVM$6$1");
        try {
            View viewLJJIJL = ((UIAssem) runnableC514501zT.l0).LJJIJL();
            if (((Boolean) ((C291001Au) runnableC514501zT.l1).LIZ).booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SelectorConfirmWidgetAssem@2252.setupVM$6$1");
    }

    public static final void run$19(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("SeriesVipPlanOptionBinder@7617.bind$3$1$1$1");
        try {
            if (((View) runnableC514501zT.l0).getParent() != null && ((View) runnableC514501zT.l0).isSelected()) {
                View view = (View) runnableC514501zT.l0;
                view.setBackground(new BitmapDrawable(view.getResources(), (Bitmap) runnableC514501zT.l1));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesVipPlanOptionBinder@7617.bind$3$1$1$1");
    }

    public static final void run$2(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("BasePlaybookService@14a.onCreate$1$1");
        try {
            MutableLiveData<ActivePlaybook> mutableLiveData = ((BasePlaybookViewModel) runnableC514501zT.l0).LLILLJJLI;
            BasePlaybookService basePlaybookService = (BasePlaybookService) runnableC514501zT.l1;
            mutableLiveData.observe(basePlaybookService, basePlaybookService.LLJ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BasePlaybookService@14a.onCreate$1$1");
    }

    public static final void run$20(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("GamePartnershipGamePinCardWidget@3fec.onPartnershipDropsCardChangeMessage$1");
        try {
            GamePartnershipGamePinCardWidget gamePartnershipGamePinCardWidget = (GamePartnershipGamePinCardWidget) runnableC514501zT.l0;
            PartnershipDropsCardChangeMessage partnershipDropsCardChangeMessage = (PartnershipDropsCardChangeMessage) runnableC514501zT.l1;
            gamePartnershipGamePinCardWidget.M1(1, partnershipDropsCardChangeMessage.dropsId, partnershipDropsCardChangeMessage.gameId, "from_message");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GamePartnershipGamePinCardWidget@3fec.onPartnershipDropsCardChangeMessage$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$21(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("RouterHelper@9760.reportActivityEntranceAction$1");
        try {
            C20684815ws.LJIILLIIL((String) ((C259800zU) runnableC514501zT.l0).element, (Map) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RouterHelper@9760.reportActivityEntranceAction$1");
    }

    public static final void run$22(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("SugStringUtilsKt@28f2.updateMusicSugText$1");
        try {
            runnableC514501zT.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SugStringUtilsKt@28f2.updateMusicSugText$1");
    }

    public static final void run$23(RunnableC514501zT runnableC514501zT) {
        List<Long> list;
        Collection collection = (Collection) runnableC514501zT.l0;
        ImDeleteMessage imDeleteMessage = (ImDeleteMessage) runnableC514501zT.l1;
        C1C7U.LIZ("PublicScreenPresenter@c5a7.removeModelFromBuffer$1L");
        if (collection != null && !collection.isEmpty() && imDeleteMessage != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) it2.next();
                if (interfaceC1112060f2q.LJJLIIIJL() && (interfaceC1112060f2q instanceof AbstractC1110800f0o)) {
                    AbstractC1110800f0o abstractC1110800f0o = (AbstractC1110800f0o) interfaceC1112060f2q;
                    List<Long> list2 = imDeleteMessage.deleteUserIds;
                    if ((list2 != null && list2.contains(Long.valueOf(abstractC1110800f0o.LLIIJI()))) || ((list = imDeleteMessage.deleteMsgIds) != null && list.contains(Long.valueOf(abstractC1110800f0o.LJIL.getMessageId())))) {
                        interfaceC1112060f2q.dispose();
                        it2.remove();
                    }
                }
            }
            C1C7U.LIZIZ("PublicScreenPresenter@c5a7.removeModelFromBuffer$1L");
            return;
        }
        C1C7U.LIZIZ("PublicScreenPresenter@c5a7.removeModelFromBuffer$1L");
    }

    public static final void run$24(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("PreloadServiceImpl@2dec.postDelayedWithLifecycle$runnable$1");
        try {
            Fragment fragment = (Fragment) ((WeakReference) runnableC514501zT.l0).get();
            if (fragment != null) {
                ((Function1) runnableC514501zT.l1).invoke(fragment);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreloadServiceImpl@2dec.postDelayedWithLifecycle$runnable$1");
    }

    public static final void run$25(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("IMDebugUtilKt@ec80.debugToast$1");
        try {
            C1389890mGx c1389890mGx = new C1389890mGx((Fragment) runnableC514501zT.l0);
            c1389890mGx.LJIIJ((CharSequence) ((C259800zU) runnableC514501zT.l1).element);
            c1389890mGx.LJIIJJI();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMDebugUtilKt@ec80.debugToast$1");
    }

    public static final void run$26(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("ShareBgViewModel@593b.fetchEffectData$1$onSuccess$1");
        try {
            ((Function2) runnableC514501zT.l0).invoke((List) runnableC514501zT.l1, Boolean.TRUE);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShareBgViewModel@593b.fetchEffectData$1$onSuccess$1");
    }

    public static final void run$27(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("GestureGuideHelper@31ab.fadeOut$1$1");
        try {
            ((Function1) runnableC514501zT.l0).invoke((View) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GestureGuideHelper@31ab.fadeOut$1$1");
    }

    public static final void run$28(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("IconLabelHorizontalCell@7a55.onBindItemView$lambda$6$lambda$5$$inlined$doOnPreDraw$1");
        try {
            Layout layout = ((TuxTextView) runnableC514501zT.l1).getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                TuxTextView tuxTextView = (TuxTextView) runnableC514501zT.l1;
                HandlerHook.viewPost(tuxTextView, new RunnableC514801zW(tuxTextView, 115));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IconLabelHorizontalCell@7a55.onBindItemView$lambda$6$lambda$5$$inlined$doOnPreDraw$1");
    }

    public static final void run$29(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("MatchOptionViewModel@a2a8.onCommunityGiftTooltipTitleAnchorReady$1");
        try {
            ((Function1) runnableC514501zT.l0).invoke((View) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchOptionViewModel@a2a8.onCommunityGiftTooltipTitleAnchorReady$1");
    }

    public static final void run$3(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("PlaybookEditorCoverDialogV2@f26c.fetchAIPlaybookImage$2$1");
        try {
            ((PlaybookEditorCoverDialogV2) runnableC514501zT.l0).BS((PlayImage) runnableC514501zT.l1, 1, "delayFetchAIImageRunnable");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlaybookEditorCoverDialogV2@f26c.fetchAIPlaybookImage$2$1");
    }

    public static final void run$30(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("BasePlaybookViewModel@9898.updateDetailPlaybook$1");
        try {
            runnableC514501zT.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BasePlaybookViewModel@9898.updateDetailPlaybook$1");
    }

    public static final void run$31(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("MemoryDumpsysDebug@b178.start$action$1");
        try {
            runnableC514501zT.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MemoryDumpsysDebug@b178.start$action$1");
    }

    public static final void run$32(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("RecommendGiftWrapper@7109.insertRealTimeRecommendGift$4");
        try {
            runnableC514501zT.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecommendGiftWrapper@7109.insertRealTimeRecommendGift$4");
    }

    public static final void run$33(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("FadeToolKt@5c15.fadeIn$1");
        try {
            C786410Ut5.T4((View) runnableC514501zT.l0, 1.0f);
            Function0 function0 = (Function0) runnableC514501zT.l1;
            if (function0 != null) {
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FadeToolKt@5c15.fadeIn$1");
    }

    public static final void run$34(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("FcpSlotMetricSession@d56d.syncSlotChildrenMap$$inlined$runOnMainThread$1");
        try {
            runnableC514501zT.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FcpSlotMetricSession@d56d.syncSlotChildrenMap$$inlined$runOnMainThread$1");
    }

    public static final void run$35(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("InterestNetworkUtils@1823.postIsTagsUpdateAsync$2$1");
        try {
            Function1 function1 = (Function1) runnableC514501zT.l0;
            if (function1 != null) {
                if (((BaseResponse) runnableC514501zT.l1).status_code == 0) {
                    z = true;
                } else {
                    z = false;
                }
                function1.invoke(Boolean.valueOf(z));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InterestNetworkUtils@1823.postIsTagsUpdateAsync$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$36(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("MultiHostLinkViewHolderDelegate@81d.showMultiGuestDisconnectDialog$1$1$2");
        try {
            LiveDialog liveDialog = (LiveDialog) ((C259800zU) runnableC514501zT.l0).element;
            if (liveDialog != null) {
                liveDialog.dismiss();
                C785410UrT.LIZ(liveDialog);
            }
            ((Function1) runnableC514501zT.l1).invoke(Boolean.valueOf(!C924810aAp.LJ().LJIIIZ));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiHostLinkViewHolderDelegate@81d.showMultiGuestDisconnectDialog$1$1$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$37(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("MultiViewModel@a25.reportActivityAction$2");
        try {
            C20684815ws.LJIILLIIL((String) ((C259800zU) runnableC514501zT.l0).element, (Map) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiViewModel@a25.reportActivityAction$2");
    }

    public static final void run$38(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("SdkMonitorWrapper@f316.reportBizScenes$1");
        try {
            runnableC514501zT.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SdkMonitorWrapper@f316.reportBizScenes$1");
    }

    public static final void run$39(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("AEVoiceChangeCategoryView@2176.requestData$2$7");
        try {
            ((Function1) runnableC514501zT.l0).invoke((List) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AEVoiceChangeCategoryView@2176.requestData$2$7");
    }

    public static final void run$4(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("QuickCommentWidget@bd17.onLoad$1$1");
        try {
            ((QuickCommentWidget) runnableC514501zT.l0).z1((JSONObject) runnableC514501zT.l1, "2", false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("QuickCommentWidget@bd17.onLoad$1$1");
    }

    public static final void run$40(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("MultiGuestAsGuestModeratorManageDialog@daf7.onInviteClickFusion$1$1");
        try {
            if (((C013C) runnableC514501zT.l0).element) {
                ((Function0) runnableC514501zT.l1).invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MultiGuestAsGuestModeratorManageDialog@daf7.onInviteClickFusion$1$1");
    }

    public static final void run$41(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("SearchAdHybridCardModule@a2e7.hideWithAnimation$1");
        try {
            C786410Ut5.LJLLLLLL(8, (View) runnableC514501zT.l0);
            C786410Ut5.T4((View) runnableC514501zT.l0, 1.0f);
            Function0 function0 = (Function0) runnableC514501zT.l1;
            if (function0 != null) {
                function0.invoke();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchAdHybridCardModule@a2e7.hideWithAnimation$1");
    }

    public static final void run$42(RunnableC514501zT runnableC514501zT) {
        ImageModel imageModel = (ImageModel) runnableC514501zT.l0;
        C1324720kZq c1324720kZq = (C1324720kZq) runnableC514501zT.l1;
        C1C7U.LIZ("LiveCoverController@a25b.handleRemoteCover$1L");
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJJ = Boolean.FALSE;
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.e85;
        c1324610kZfLJIIIZ.LJJIJ(ImageView.ScaleType.FIT_XY);
        c1324610kZfLJIIIZ.LJJI(c1324720kZq);
        C1C7U.LIZIZ("LiveCoverController@a25b.handleRemoteCover$1L");
    }

    public static final void run$43(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("SharedElementSceneTransitionExecutor@9880.executePushChangeV21$4");
        try {
            C786410Ut5.LJLLLLLL(8, (View) runnableC514501zT.l0);
            ((Runnable) runnableC514501zT.l1).run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharedElementSceneTransitionExecutor@9880.executePushChangeV21$4");
    }

    public static final void run$44(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("LocalServiceBottomPhotosAssem@4ef6.initSubscribe$2$2$2$1");
        try {
            ((ViewOnAttachStateChangeListenerC20604515jv) runnableC514501zT.l0).scrollToPosition(((List) runnableC514501zT.l1).size() - 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocalServiceBottomPhotosAssem@4ef6.initSubscribe$2$2$2$1");
    }

    public static final void run$45(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        Lifecycle lifecycle;
        C1C7U.LIZ("LifecycleExtensionsKt@38c0.addLifecycleObserverOnMainThreadPost$1");
        try {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) runnableC514501zT.l0;
            if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver((LifecycleObserver) runnableC514501zT.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LifecycleExtensionsKt@38c0.addLifecycleObserverOnMainThreadPost$1");
    }

    public static final void run$46(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("PostListScrollListener@3a05.executeTaskList$1");
        try {
            runnableC514501zT.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostListScrollListener@3a05.executeTaskList$1");
    }

    public static final void run$47(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("ParamsCheckV2Handler@7bb.checkParamsV2$1$4");
        try {
            Function1 function1 = (Function1) runnableC514501zT.l0;
            if (function1 != null) {
                function1.invoke((Map) runnableC514501zT.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ParamsCheckV2Handler@7bb.checkParamsV2$1$4");
    }

    public static final void run$48(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        BitmapDrawable bitmapDrawable;
        C1C7U.LIZ("SeriesVipSubscriptionHeaderCell@c5d4.bindHeaderBackground$1$1");
        try {
            View view = ((SeriesVipSubscriptionHeaderCell) runnableC514501zT.l0).itemView;
            Bitmap bitmap = (Bitmap) runnableC514501zT.l1;
            if (bitmap != null) {
                bitmapDrawable = new BitmapDrawable(view.getResources(), bitmap);
            } else {
                bitmapDrawable = null;
            }
            view.setBackground(bitmapDrawable);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SeriesVipSubscriptionHeaderCell@c5d4.bindHeaderBackground$1$1");
    }

    public static final void run$5(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("ActQuizWidget@94df.onMessage$1");
        try {
            ActQuizWidget actQuizWidget = (ActQuizWidget) runnableC514501zT.l0;
            ActivityQuizCardMessage activityQuizCardMessage = (ActivityQuizCardMessage) ((IMessage) runnableC514501zT.l1);
            ActivityQuizCardMessageSEIWrapper activityQuizCardMessageSEIWrapper = new ActivityQuizCardMessageSEIWrapper();
            activityQuizCardMessageSEIWrapper.quizCardMessage = activityQuizCardMessage;
            actQuizWidget.A1(activityQuizCardMessageSEIWrapper, "message");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ActQuizWidget@94df.onMessage$1");
    }

    public static final void run$6(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("KtUtil@f1ff.doAfterHasSize$1");
        try {
            ((Function1) runnableC514501zT.l0).invoke((View) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("KtUtil@f1ff.doAfterHasSize$1");
    }

    public static final void run$7(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("GiftServiceKt@f898.fetchGiftAnchorPanelActivityInfo$disposable$1$1");
        try {
            C096800Yc.LIZ = new C096700Yb((C096600Ya) runnableC514501zT.l0, (GiftListByCreatorResponse.Data) runnableC514501zT.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftServiceKt@f898.fetchGiftAnchorPanelActivityInfo$disposable$1$1");
    }

    public static final void run$8(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("WatchLiveService@2a3.optimizePullStream$1");
        try {
            ((WatchLiveService) runnableC514501zT.l0).getClass();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("WatchLiveService@2a3.optimizePullStream$1");
    }

    public static final void run$9(RunnableC514501zT runnableC514501zT) {
        boolean zLIZ;
        C1C7U.LIZ("FetchFeedDetectorManager$FeedNullNetNotifyUIHelper@d18f.toToShowNotifyBar$1");
        try {
            ((C1492470owP) runnableC514501zT.l0).LIZIZ.set(true);
            Iterator it2 = ((List) runnableC514501zT.l1).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(Boolean.TRUE);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FetchFeedDetectorManager$FeedNullNetNotifyUIHelper@d18f.toToShowNotifyBar$1");
    }

    public RunnableC514501zT(Map map, int i) {
        this.$t = i;
        this.l0 = null;
        this.l1 = map;
    }

    public RunnableC514501zT(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
