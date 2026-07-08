package X;

import android.graphics.Bitmap;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.LiveInviteGuestSelectedChannel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.bulletin.LiveBoardsViewModel;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.PreviewMgGuideInviteUidListChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.anchor.TopGuestGamePlayAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget;
import com.bytedance.android.live.liveinteract.multilive.social.model.SuggestGuestsResp;
import com.bytedance.android.livesdk.broadcast.preview.widget.MultiPreviewInviteGuestWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerDataSourceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuideEnableInviteModuleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;
import com.bytedance.android.livesdk.model.message.OecLiveRankMessage;
import com.bytedance.android.livesdk.model.message.RoomUserSeqMessage;
import com.bytedance.android.livesdk.rank.impl.widget.OnlineAudienceRankWidget;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.EventReceiver;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.slideslip.fullwidthhorizontal.g;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.TopGuestMetaContent;

/* JADX INFO: renamed from: X.01zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C517001zs implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return emit$11(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return emit$12(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return emit$13(this, obj, interfaceC1364105Vn);
            case 14:
                return emit$14(this, obj, interfaceC1364105Vn);
            case 15:
                return emit$15(this, obj, interfaceC1364105Vn);
            case 16:
                return emit$16(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return emit$17(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return emit$18(this, obj, interfaceC1364105Vn);
            case 19:
                return emit$19(this, obj, interfaceC1364105Vn);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return emit$20(this, obj, interfaceC1364105Vn);
            case 21:
                return emit$21(this, obj, interfaceC1364105Vn);
            case 22:
                return emit$22(this, obj, interfaceC1364105Vn);
            case 23:
                return emit$23(this, obj, interfaceC1364105Vn);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return emit$24(this, obj, interfaceC1364105Vn);
            case 25:
                return emit$25(this, obj, interfaceC1364105Vn);
            case 26:
                return emit$26(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public C517001zs(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(com.bytedance.android.livesdk.model.message.OecLiveRankMessage r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C01P3
            if (r0 == 0) goto L59
            r5 = r8
            X.01P3 r5 = (X.C01P3) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r0 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L5f
            X.C155000ia.LIZIZ(r0)
        L22:
            if (r0 == 0) goto L34
            java.lang.String r2 = "AudienceRankingEntranceViewModel"
            java.lang.String r1 = "Received API data from OecLiveRankMessage"
            X.C20441214yg.LIZIZ(r2, r1)
            java.lang.Object r1 = r6.l0
            com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel r1 = (com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel) r1
            X.1DDq r1 = r1.LLILZLL
            r1.setValue(r0)
        L34:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            X.C155000ia.LIZIZ(r0)
            java.lang.Object r0 = r6.l0
            com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel r0 = (com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel) r0
            X.00oY r2 = r0.LLILLL
            r5.LLILLL = r3
            r2.getClass()
            java.lang.String r1 = "HandleOecLiveRankMessageUseCase"
            java.lang.String r0 = "invoke: OecLiveRankMessage received"
            X.C20441214yg.LIZIZ(r1, r0)
            int r0 = r7.actionType
            if (r0 != r3) goto L57
            java.lang.Object r0 = r2.LIZ(r5)
        L54:
            if (r0 != r4) goto L22
            return r4
        L57:
            r0 = 0
            goto L54
        L59:
            X.01P3 r5 = new X.01P3
            r5.<init>(r6, r8)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C517001zs.LIZ$0(com.bytedance.android.livesdk.model.message.OecLiveRankMessage, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$1(com.bytedance.android.livesdk.model.message.RoomUserSeqMessage r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C01P7
            if (r0 == 0) goto La1
            r3 = r10
            X.01P7 r3 = (X.C01P7) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La1
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r5 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L28
            if (r0 == r7) goto L86
            if (r0 != r4) goto La8
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            java.lang.Object r0 = r8.l0
            com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel r0 = (com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel) r0
            X.01O8 r1 = r0.LLILZ
            r3.LLILLL = r7
            X.00ob r0 = r1.LIZ
            java.lang.Boolean r0 = r0.LJI()
            if (r0 == 0) goto L82
            boolean r6 = r0.booleanValue()
        L3f:
            X.00ob r0 = r1.LIZ
            X.00no r5 = r0.LJFF()
            X.00no r0 = X.EnumC187400no.TOP_BUYER
            if (r5 == r0) goto L4a
            r7 = 0
        L4a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "HandleRoomUserSeqMessage: canShowTopBuyer="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", currentRankingType="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", hasBuyerData="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r1 = "HandleRoomUserSeqMessageUseCase"
            X.C20441214yg.LIZIZ(r1, r0)
            if (r6 == 0) goto L7c
            if (r7 == 0) goto L7c
            java.lang.String r0 = "Skipping RoomUserSeqMessage processing - showing Top Buyer"
            X.C20441214yg.LIZIZ(r1, r0)
            r9 = 0
        L79:
            if (r9 != r2) goto L84
            return r2
        L7c:
            java.lang.String r0 = "Processing RoomUserSeqMessage successfully"
            X.C20441214yg.LIZIZ(r1, r0)
            goto L79
        L82:
            r6 = 0
            goto L3f
        L84:
            r5 = r9
            goto L89
        L86:
            X.C155000ia.LIZIZ(r5)
        L89:
            if (r5 == 0) goto Lb0
            java.lang.String r1 = "AudienceRankingEntranceViewModel"
            java.lang.String r0 = "Received IM message from RoomUserSeqMessage"
            X.C20441214yg.LIZIZ(r1, r0)
            java.lang.Object r0 = r8.l0
            com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel r0 = (com.bytedance.android.livesdk.rank.impl.viewmodel.AudienceRankingEntranceViewModel) r0
            X.1DDr r0 = r0.LLIZLLLIL
            r3.LLILLL = r4
            java.lang.Object r0 = r0.emit(r5, r3)
            if (r0 != r2) goto L25
            return r2
        La1:
            X.01P7 r3 = new X.01P7
            r3.<init>(r8, r10)
            goto L12
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C517001zs.LIZ$1(com.bytedance.android.livesdk.model.message.RoomUserSeqMessage, X.05Vn):java.lang.Object");
    }

    public static final Object emit$0(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((BaseCountDownForAllV2ViewModel) c517001zs.l0).LLILLJJLI.setValue(C2286608xc.LJ(((Number) obj).intValue()));
        return Unit.LIZ;
    }

    public static final Object emit$1(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C445960HeE c445960HeE = ((C445880He6) c517001zs.l0).LLILLL;
        c445960HeE.LLILZ.clear();
        c445960HeE.LLILLL = (List) obj;
        c445960HeE.notifyDataSetChanged();
        return Unit.LIZ;
    }

    public static final Object emit$10(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC399701gx abstractC399701gx = (AbstractC399701gx) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveEffectAction, ");
        sbLIZ.append(abstractC399701gx);
        C20441214yg.LIZIZ("BoardEffectService", C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC399701gx instanceof C395501gH) {
            LiveBoardsViewModel liveBoardsViewModel = (LiveBoardsViewModel) c517001zs.l0;
            String str = ((C395501gH) abstractC399701gx).LIZ;
            liveBoardsViewModel.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveBoardsViewModel), C0PEM.LIZJ, null, new C396301gP(liveBoardsViewModel, str, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object emit$11(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        EventReceiver eventReceiver = (EventReceiver) c517001zs.l0;
        if (eventReceiver.LLILZIL) {
            return Unit.LIZ;
        }
        Function1 function1 = (Function1) eventReceiver.LLILLL.get(C2286608xc.LJ(obj.hashCode()));
        if (function1 != null || (function1 = (Function1) ((EventReceiver) c517001zs.l0).LLILLL.get(C2286608xc.LJ(obj.getClass().hashCode()))) != null) {
            function1.invoke(obj);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$12(X.C517001zs r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C460201qi
            if (r0 == 0) goto L2a
            r5 = r8
            X.01qi r5 = (X.C460201qi) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 == r2) goto L6a
            if (r0 == r3) goto L6a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2a:
            X.01qi r5 = new X.01qi
            r5.<init>(r6, r8)
            goto L12
        L30:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r6.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.01qj r7 = (X.InterfaceC460301qj) r7
            X.01qk r0 = X.C460401qk.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 != 0) goto L6d
            X.01ql r0 = X.C460501ql.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L53
            r5.LLILLJJLI = r2
            r0 = 0
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r4) goto L6d
            return r4
        L53:
            boolean r0 = r7 instanceof X.C460701qn
            if (r0 == 0) goto L64
            X.01qn r7 = (X.C460701qn) r7
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r7.LIZ
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r4) goto L6d
            return r4
        L64:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L6a:
            X.C155000ia.LIZIZ(r1)
        L6d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C517001zs.emit$12(X.01zs, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$13(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C01S7((Function1) c517001zs.l0, (Map) obj, null));
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }

    public static final Object emit$14(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (obj instanceof C403101hV) {
            ComposerFilterViewModel composerFilterViewModel = (ComposerFilterViewModel) c517001zs.l0;
            composerFilterViewModel.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(composerFilterViewModel), C0PEM.LIZJ, null, new C761030TtF(composerFilterViewModel, null), 2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$15(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((C259800zU) c517001zs.l0).element = obj;
        return Unit.LIZ;
    }

    public static final Object emit$16(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC401801hI abstractC401801hI = (AbstractC401801hI) obj;
        if (abstractC401801hI instanceof C403601ha) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("state is LiveEffectState.LiveEffectPanelList, state=");
            sbLIZ.append(abstractC401801hI);
            C20441214yg.LJIIIZ("LiveMultiGuestEffectFetchUtils", C2188811AlT.LIZIZ(sbLIZ));
            C766550U5d.LIZ(((C403601ha) abstractC401801hI).LIZ, (C0U78) c517001zs.l0, null);
        }
        return Unit.LIZ;
    }

    public static final Object emit$17(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Long lLJFF;
        ImageModel avatarThumb;
        C01JL c01jl = (C01JL) obj;
        boolean z = false;
        if (c01jl instanceof C01JM) {
            C445980HeG c445980HeG = ((MultiPreviewInviteGuestWidget) c517001zs.l0).LLILZIL;
            if (c445980HeG != null) {
                c445980HeG.setAvatarImages(C13BV.INSTANCE);
            }
            if (MultiGuestGuideEnableInviteModuleSetting.INSTANCE.isEnable()) {
                MultiPreviewInviteGuestWidget multiPreviewInviteGuestWidget = (MultiPreviewInviteGuestWidget) c517001zs.l0;
                multiPreviewInviteGuestWidget.LLIZ = false;
                multiPreviewInviteGuestWidget.H1(false);
            }
        } else if (c01jl instanceof C01JJ) {
            C445980HeG c445980HeG2 = ((MultiPreviewInviteGuestWidget) c517001zs.l0).LLILZIL;
            if (c445980HeG2 != null) {
                c445980HeG2.setAvatarImages(C13BV.INSTANCE);
            }
            if (MultiGuestGuideEnableInviteModuleSetting.INSTANCE.isEnable()) {
                MultiPreviewInviteGuestWidget multiPreviewInviteGuestWidget2 = (MultiPreviewInviteGuestWidget) c517001zs.l0;
                multiPreviewInviteGuestWidget2.LLIZ = false;
                multiPreviewInviteGuestWidget2.H1(false);
            }
        } else if (c01jl instanceof C01JK) {
            C01JK c01jk = (C01JK) c01jl;
            ((MultiPreviewInviteGuestWidget) c517001zs.l0).LLIZ = C500260Jjc.LJJIJIIJI(c01jk.LIZIZ);
            MultiPreviewInviteGuestWidget multiPreviewInviteGuestWidget3 = (MultiPreviewInviteGuestWidget) c517001zs.l0;
            if (!multiPreviewInviteGuestWidget3.LLIZ) {
                multiPreviewInviteGuestWidget3.H1(false);
                return Unit.LIZ;
            }
            if (MultiGuestGuideEnableInviteModuleSetting.INSTANCE.isEnable()) {
                ((MultiPreviewInviteGuestWidget) c517001zs.l0).H1(true);
            }
            List list = (List) DataChannelGlobal.LLILZ.gg0(PreviewMgGuideInviteUidListChannel.class);
            if ((list == null && (list = C13BV.INSTANCE) == null) || list.isEmpty()) {
                z = true;
            }
            if (z) {
                List listLJLIL = C13LP.LJLIL(c01jk.LIZIZ, c01jk.LIZJ);
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) listLJLIL).iterator();
                while (it2.hasNext()) {
                    User user = ((SuggestGuestsResp.ResponseData.SuggestUser) it2.next()).user;
                    if (user != null && (avatarThumb = user.getAvatarThumb()) != null) {
                        arrayList.add(avatarThumb);
                    }
                }
                List<? extends ImageModel> listLL = C13LP.LL(arrayList, 3);
                C445980HeG c445980HeG3 = ((MultiPreviewInviteGuestWidget) c517001zs.l0).LLILZIL;
                if (c445980HeG3 != null) {
                    c445980HeG3.setAvatarImages(listLL);
                }
                return Unit.LIZ;
            }
            if (Intrinsics.LJFF(c01jk.LIZ, "go_live_page_suggest_preload")) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(C2286608xc.LJFF(((C418801k2) it3.next()).LIZ));
                }
                List<SuggestGuestsResp.ResponseData.SuggestUser> list2 = c01jk.LIZIZ;
                ArrayList arrayList3 = new ArrayList();
                for (SuggestGuestsResp.ResponseData.SuggestUser suggestUser : list2) {
                    User user2 = suggestUser.user;
                    if (user2 != null) {
                        lLJFF = C2286608xc.LJFF(user2.getId());
                    } else {
                        lLJFF = null;
                    }
                    if (C13LP.LJJJJ(lLJFF, arrayList2)) {
                        arrayList3.add(suggestUser);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    User user3 = ((SuggestGuestsResp.ResponseData.SuggestUser) it4.next()).user;
                    if (user3 != null) {
                        arrayList4.add(user3);
                    }
                }
                DataChannelGlobal.LLILZ.HQ2(LiveInviteGuestSelectedChannel.class, new C0J9U(arrayList4, arrayList4, C13BV.INSTANCE));
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object emit$18(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Function1) c517001zs.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object emit$19(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AnonymousClass0956 anonymousClass0956;
        AbstractC399701gx abstractC399701gx = (AbstractC399701gx) obj;
        if (abstractC399701gx instanceof C403101hV) {
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = (LiveSmallItemBeautyViewModel) c517001zs.l0;
            liveSmallItemBeautyViewModel.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveSmallItemBeautyViewModel), C0PEM.LIZJ, null, new C510801ys(liveSmallItemBeautyViewModel, null), 2);
        } else if (abstractC399701gx instanceof C403701hb) {
            C403701hb c403701hb = (C403701hb) abstractC399701gx;
            ((LiveSmallItemBeautyViewModel) c517001zs.l0).BQ2(c403701hb.LIZ, c403701hb.LIZIZ);
        } else if (abstractC399701gx instanceof C007Q) {
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel2 = (LiveSmallItemBeautyViewModel) c517001zs.l0;
            abstractC399701gx.getClass();
            liveSmallItemBeautyViewModel2.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveSmallItemBeautyViewModel2), C0PEM.LIZJ, null, new C508901yZ(liveSmallItemBeautyViewModel2, null, 0, null), 2);
        } else if (abstractC399701gx instanceof C080700Rx) {
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel3 = (LiveSmallItemBeautyViewModel) c517001zs.l0;
            Bitmap bitmap = ((C080700Rx) abstractC399701gx).LIZ;
            liveSmallItemBeautyViewModel3.getClass();
            liveSmallItemBeautyViewModel3.LLJILLL = System.currentTimeMillis();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveSmallItemBeautyViewModel3), C0PEM.LIZJ, null, new C509101yb(liveSmallItemBeautyViewModel3, bitmap, null), 2);
        } else if (abstractC399701gx instanceof C400301h3) {
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel4 = (LiveSmallItemBeautyViewModel) c517001zs.l0;
            C400301h3 c400301h3 = (C400301h3) abstractC399701gx;
            String str = c400301h3.LIZ;
            String str2 = c400301h3.LIZIZ;
            liveSmallItemBeautyViewModel4.LLJJIJI = "";
            liveSmallItemBeautyViewModel4.LLJILJILJ = false;
            AnonymousClass0956 anonymousClass09562 = liveSmallItemBeautyViewModel4.LLJJIII;
            if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = liveSmallItemBeautyViewModel4.LLJJIII) != null) {
                anonymousClass0956.LIZIZ(new CancellationException("Canceled"));
            }
            liveSmallItemBeautyViewModel4.LLJJIII = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveSmallItemBeautyViewModel4), C0PEM.LIZJ, null, new C0U7Z(liveSmallItemBeautyViewModel4, str, 2000L, str2, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        CountdownForAllConfig countdownForAllConfig = (CountdownForAllConfig) obj;
        CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = ((CountDownForAllV2AnchorWidget) c517001zs.l0).LLIZ;
        if (countDownForAllV2SettingsDialog != null) {
            if (countdownForAllConfig == null) {
                countdownForAllConfig = new CountdownForAllConfig();
            }
            CountdownForAllConfigWrapper countdownForAllConfigWrapperLIZ = C01JD.LIZ(countdownForAllConfig);
            countDownForAllV2SettingsDialog.LLLFF = countdownForAllConfigWrapperLIZ;
            countDownForAllV2SettingsDialog.LLLLIIL = countdownForAllConfigWrapperLIZ.duration;
            int i = (int) (countdownForAllConfigWrapperLIZ.duration / ((long) 60));
            if (i < 1) {
                i = 1;
            }
            countDownForAllV2SettingsDialog.LLLLIIIILLL = i;
            countDownForAllV2SettingsDialog.HS();
            CountdownForAllConfigWrapper countdownForAllConfigWrapper = countDownForAllV2SettingsDialog.LLLFF;
            if (countdownForAllConfigWrapper == null || (str = countdownForAllConfigWrapper.resourceId) == null) {
                str = "";
            }
            countDownForAllV2SettingsDialog.zS(null, str);
            countDownForAllV2SettingsDialog.FS();
            countDownForAllV2SettingsDialog.GS();
        }
        return Unit.LIZ;
    }

    public static final Object emit$20(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String name;
        C387101ev c387101ev = (C387101ev) obj;
        LiveEffect liveEffect = c387101ev.LIZIZ;
        int i = c387101ev.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchAndDownload ");
        if (liveEffect != null) {
            name = liveEffect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        sbLIZ.append(" Suc");
        C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Function2 function2 = (Function2) c517001zs.l0;
        if (function2 != null) {
            function2.invoke(C2286608xc.LJ(i), liveEffect);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$21(X.C517001zs r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C390301fR
            if (r0 == 0) goto L39
            r4 = r7
            X.01fR r4 = (X.C390301fR) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L3f
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L39:
            X.01fR r4 = new X.01fR
            r4.<init>(r5, r7)
            goto L12
        L3f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C517001zs.emit$21(X.01zs, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object emit$22(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC399701gx abstractC399701gx = (AbstractC399701gx) obj;
        if (abstractC399701gx instanceof C403101hV) {
            StickerEffectViewModel stickerEffectViewModel = (StickerEffectViewModel) c517001zs.l0;
            stickerEffectViewModel.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel), C0PEM.LIZJ, null, new C400001h0(stickerEffectViewModel, null), 2);
        } else if (abstractC399701gx instanceof C400401h4) {
            StickerEffectViewModel stickerEffectViewModel2 = (StickerEffectViewModel) c517001zs.l0;
            stickerEffectViewModel2.getClass();
            if (LiveStickerDataSourceOptSetting.INSTANCE.enable()) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel2), C0PEM.LIZJ, null, new C399201gs(stickerEffectViewModel2, null), 2);
            } else {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel2), C0PEM.LIZJ, null, new C399301gt(stickerEffectViewModel2, null), 2);
            }
        } else if (abstractC399701gx instanceof C395501gH) {
            StickerEffectViewModel stickerEffectViewModel3 = (StickerEffectViewModel) c517001zs.l0;
            String str = ((C395501gH) abstractC399701gx).LIZ;
            stickerEffectViewModel3.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel3), C0PEM.LIZJ, null, new C399501gv(stickerEffectViewModel3, str, null), 2);
        } else if (abstractC399701gx instanceof C00YH) {
            StickerEffectViewModel stickerEffectViewModel4 = (StickerEffectViewModel) c517001zs.l0;
            C00YH c00yh = (C00YH) abstractC399701gx;
            String str2 = c00yh.LIZ;
            boolean z = c00yh.LIZIZ;
            stickerEffectViewModel4.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel4), C0PEM.LIZJ, null, new C402301hN(stickerEffectViewModel4, str2, null, z), 2);
        } else if (abstractC399701gx instanceof C399601gw) {
            StickerEffectViewModel stickerEffectViewModel5 = (StickerEffectViewModel) c517001zs.l0;
            C399601gw c399601gw = (C399601gw) abstractC399701gx;
            LiveEffect liveEffect = (LiveEffect) c399601gw.LIZ;
            boolean z2 = c399601gw.LIZIZ;
            stickerEffectViewModel5.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel5), C0PEM.LIZJ, null, new C401201hC(stickerEffectViewModel5, liveEffect, z2, null), 2);
        } else if (abstractC399701gx instanceof C402701hR) {
            StickerEffectViewModel stickerEffectViewModel6 = (StickerEffectViewModel) c517001zs.l0;
            stickerEffectViewModel6.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel6), C0PEM.LIZJ, null, new C401101hB(stickerEffectViewModel6, null), 2);
        } else if (abstractC399701gx instanceof C402801hS) {
            StickerEffectViewModel stickerEffectViewModel7 = (StickerEffectViewModel) c517001zs.l0;
            stickerEffectViewModel7.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel7), C0PEM.LIZJ, null, new C399901gz(stickerEffectViewModel7, null), 2);
        } else if (abstractC399701gx instanceof C340701Tx) {
            StickerEffectViewModel stickerEffectViewModel8 = (StickerEffectViewModel) c517001zs.l0;
            LiveEffect liveEffect2 = (LiveEffect) ((C340701Tx) abstractC399701gx).LIZ;
            stickerEffectViewModel8.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModel8), C0PEM.LIZJ, null, new C398701gn(stickerEffectViewModel8, liveEffect2, null), 2);
        } else {
            if (abstractC399701gx instanceof C204500qZ) {
                Unit unitRQ2 = ((StickerEffectViewModel) c517001zs.l0).RQ2(((C204500qZ) abstractC399701gx).LIZ, false);
                if (unitRQ2 == C099R.LJFF()) {
                    return unitRQ2;
                }
                return Unit.LIZ;
            }
            if (abstractC399701gx instanceof C400201h2) {
                Object objQQ2 = ((StickerEffectViewModel) c517001zs.l0).QQ2(interfaceC1364105Vn);
                if (objQQ2 == C099R.LJFF()) {
                    return objQQ2;
                }
                return Unit.LIZ;
            }
            if (abstractC399701gx instanceof C080800Ry) {
                C080800Ry c080800Ry = (C080800Ry) abstractC399701gx;
                Object objWQ2 = ((StickerEffectViewModel) c517001zs.l0).WQ2(c080800Ry.LIZ, c080800Ry.LIZIZ, interfaceC1364105Vn);
                if (objWQ2 == C099R.LJFF()) {
                    return objWQ2;
                }
                return Unit.LIZ;
            }
            if (abstractC399701gx instanceof C399801gy) {
                C399801gy c399801gy = (C399801gy) abstractC399701gx;
                Object objHQ2 = ((StickerEffectViewModel) c517001zs.l0).HQ2(c399801gy.LIZ, c399801gy.LIZIZ, interfaceC1364105Vn);
                if (objHQ2 == C099R.LJFF()) {
                    return objHQ2;
                }
                return Unit.LIZ;
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object emit$23(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return c517001zs.LIZ$0((OecLiveRankMessage) obj, interfaceC1364105Vn);
    }

    public static final /* bridge */ /* synthetic */ Object emit$24(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return c517001zs.LIZ$1((RoomUserSeqMessage) obj, interfaceC1364105Vn);
    }

    public static final Object emit$25(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        long jLongValue = ((Number) obj).longValue();
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C964690bD9(jLongValue, (C964680bD8) c517001zs.l0, null));
        if (objLJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJI;
    }

    public static final Object emit$26(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        RoomUserSeqMessage roomUserSeqMessage = (RoomUserSeqMessage) obj;
        C20441214yg.LIZIZ("OnlineAudienceRankWidget", "Received IM message update from ViewModel");
        C1105320ery c1105320ery = ((OnlineAudienceRankWidget) c517001zs.l0).LLILZ;
        if ((c1105320ery instanceof C01VE) && c1105320ery != null) {
            c1105320ery.LIZ(roomUserSeqMessage);
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        long j;
        TopGuestMetaContent topGuestMetaContent;
        if (obj instanceof C354601Zg) {
            long jLJI = C01JX.LJI();
            VM vm = ((TopGuestGamePlayAnchorWidget) c517001zs.l0).LL;
            if (vm != 0 && (topGuestMetaContent = vm.vQ2().LJIIIIZZ) != null) {
                j = topGuestMetaContent.playId;
            } else {
                j = 0;
            }
            String str = MultiGuestFeSchemaConfigSetting.INSTANCE.getValue().topGuestPanel;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("&channel_id=");
            sbLIZ.append(jLJI);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (j > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("&play_id=");
                sbLIZ2.append(j);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(((TopGuestGamePlayAnchorWidget) c517001zs.l0).context, strLIZIZ, null);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }

    public static final Object emit$4(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        long jLongValue;
        C356201Zw c356201Zw = (C356201Zw) obj;
        if (c356201Zw.LIZ != 0) {
            C355501Zp c355501ZpX1 = ((BaseTopGuestGamePlayWidget) c517001zs.l0).x1();
            int i = c356201Zw.LIZ;
            boolean z = c356201Zw.LIZJ;
            Long l = c356201Zw.LIZIZ;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            c355501ZpX1.LIZIZ(null, C00FW.LIZ(i, C01JX.LJIIIIZZ(jLongValue), z));
        }
        if (c356201Zw.LIZ == 1) {
            ((BaseTopGuestGamePlayWidget) c517001zs.l0).x1().LIZ("top_guest_start");
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[PHI: r2 r3
      0x0040: PHI (r2v1 int) = (r2v0 int), (r2v3 int), (r2v3 int) binds: [B:20:0x003d, B:13:0x0023, B:15:0x0027] A[DONT_GENERATE, DONT_INLINE]
      0x0040: PHI (r3v2 boolean) = (r3v1 boolean), (r3v4 boolean), (r3v4 boolean) binds: [B:20:0x003d, B:13:0x0023, B:15:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(X.C517001zs r3, java.lang.Object r4, X.InterfaceC1364105Vn r5) {
        /*
            java.lang.Object r0 = r3.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget) r0
            X.01Zp r5 = r0.x1()
            java.lang.Object r0 = r3.l0
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayWidget) r0
            VM extends com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel r4 = r0.LL
            r3 = 0
            if (r4 == 0) goto L3c
            X.01Zw r0 = r4.LL
            if (r0 == 0) goto L3c
            int r2 = r0.LIZ
        L17:
            X.01Zw r0 = r4.LL
            if (r0 == 0) goto L21
            boolean r1 = r0.LIZJ
            r0 = 1
            if (r1 != r0) goto L21
            r3 = 1
        L21:
            X.01Zw r0 = r4.LL
            if (r0 == 0) goto L40
            java.lang.Long r0 = r0.LIZIZ
            if (r0 == 0) goto L40
            long r0 = r0.longValue()
        L2d:
            com.bytedance.android.live.base.model.user.User r0 = X.C01JX.LJIIIIZZ(r0)
            org.json.JSONObject r1 = X.C00FW.LIZ(r2, r0, r3)
            r0 = 0
            r5.LIZIZ(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            r2 = 0
            if (r4 == 0) goto L40
            goto L17
        L40:
            r0 = -1
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C517001zs.emit$5(X.01zs, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$6(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Function1) c517001zs.l0).invoke(obj);
        return Unit.LIZ;
    }

    public static final Object emit$7(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (((Boolean) obj).booleanValue()) {
            ((g) c517001zs.l0).i3(AFwS266S0000000_25.get$arr$(326));
        } else {
            ((g) c517001zs.l0).i3(AFwS266S0000000_25.get$arr$(327));
        }
        return Unit.LIZ;
    }

    public static final Object emit$8(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        Effect effect;
        InterfaceC461401qu interfaceC461401qu = (InterfaceC461401qu) obj;
        g gVar = (g) c517001zs.l0;
        if (interfaceC461401qu instanceof C461501qv) {
            C461501qv c461501qv = (C461501qv) interfaceC461401qu;
            gVar.LLJJLIIIJLLLLLLLZ = c461501qv;
            gVar.H4(gVar.C5(c461501qv.LIZ));
            if (!((g) c517001zs.l0).s7()) {
                ((g) c517001zs.l0).I7(c461501qv.LIZIZ);
            }
            boolean zLJJII = ((g) c517001zs.l0).n7().LJJII(c461501qv.LIZ.getEffectId());
            C1632470saD c1632470saD = C1632470saD.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("carouselEffectSelectFlow isFavorite = ");
            sbLIZ.append(zLJJII);
            C201955140j.LJIILL(c1632470saD, "FullWidthCarouselBottomComponent", C2188811AlT.LIZIZ(sbLIZ));
            ((g) c517001zs.l0).i3(new AwS37S0010000_25(zLJJII, 26));
            ((g) c517001zs.l0).P6(c461501qv.LIZ, zLJJII);
            effect = c461501qv.LIZ;
        } else {
            effect = null;
        }
        gVar.LLJJIJI = effect;
        return Unit.LIZ;
    }

    public static final Object emit$9(C517001zs c517001zs, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((g) c517001zs.l0).N6();
        return Unit.LIZ;
    }
}
