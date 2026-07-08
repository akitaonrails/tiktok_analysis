package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.ArrayMap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.setting.LiveMinusOneScreenTipsInFeedSetting;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.EnvelopePortalMessage;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.message.AISummaryMessage;
import com.bytedance.android.livesdk.model.message.AnchorGrowLevelMessage;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.CommentReplyMessage;
import com.bytedance.android.livesdk.model.message.CommentsMessage;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.bytedance.android.livesdk.model.message.DiggMessage;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.android.livesdk.model.message.GiftGalleryMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.InteractionHubGoalMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdk.model.message.LiveGameIntroMessage;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdk.model.message.ModeratorSpeakerMessage;
import com.bytedance.android.livesdk.model.message.PortalMessage;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdk.model.message.RankTextMessage;
import com.bytedance.android.livesdk.model.message.RichChatMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.ScreenMessage;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.SubNotifyMessage;
import com.bytedance.android.livesdk.model.message.UnauthorizedMemberMessage;
import com.bytedance.android.livesdk.model.message.UpgradeMessage;
import com.bytedance.android.livesdk.model.message.WhisperMessage;
import com.bytedance.android.livesdk.model.message.XGGoodsOrderMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceImage;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import qo2.w;
import webcast.data.AnchorGrowLevelImMsgNotification;
import webcast.data.AnchorGrowLevelImMsgV2;

/* JADX INFO: renamed from: X.00lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C175200lq {
    public static int LIZ(int i) {
        return C497740JfY.LJII().getResources().getColor(i);
    }

    public static AbstractC1110800f0o<? extends AbstractC1136060ffY> LJ(AbstractC1136060ffY abstractC1136060ffY) {
        switch (C001F.LIZ[abstractC1136060ffY.getMessageType().ordinal()]) {
            case 1:
                Set<Long> set = C087600Uo.LIZ;
                final ChatMessage chatMessage = (ChatMessage) abstractC1136060ffY;
                if (C087600Uo.LIZ.contains(Long.valueOf(chatMessage.chatId))) {
                    return new C1110280ezy(chatMessage);
                }
                if (abstractC1136060ffY.isLocalInsertMsg) {
                    return new C175500lt(chatMessage) { // from class: X.00ls
                    };
                }
                return new C1110310f01(chatMessage);
            case 2:
                return new C1110320f02((EmoteChatMessage) abstractC1136060ffY);
            case 3:
                return new C1111000f18((GiftMessage) abstractC1136060ffY);
            case 4:
                final DiggMessage diggMessage = (DiggMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<DiggMessage>(diggMessage) { // from class: X.00jQ
                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112680f3q
                    public final boolean LJJJJ() {
                        return true;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return ((DiggMessage) this.LJIL).user;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        C497740JfY.LJII();
                        Context contextLJII = C497740JfY.LJII();
                        String string = contextLJII != null ? contextLJII.getResources().getString(2131853538) : "lit";
                        ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Fo2().getClass();
                        return C175200lq.LIZJ(((DiggMessage) this.LJIL).user, " ", string, C175200lq.LIZ(R.color.a6c), C175200lq.LIZ(R.color.a6e), this);
                    }
                };
            case 5:
                return new C180400mg((LikeMessage) abstractC1136060ffY);
            case 6:
                return new C234500vP((MemberMessage) abstractC1136060ffY);
            case 7:
                final UnauthorizedMemberMessage unauthorizedMemberMessage = (UnauthorizedMemberMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<UnauthorizedMemberMessage>(unauthorizedMemberMessage) { // from class: X.00jR
                    public final C154700iX LJJI;

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                    public final int LIZLLL() {
                        return ((UnauthorizedMemberMessage) this.LJIL).action == 1 ? R.drawable.eui : R.drawable.eu1;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
                    @Override // X.AbstractC1110790f0n
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.CharSequence LLFF() {
                        /*
                            Method dump skipped, instruction units count: 267
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C160300jR.LLFF():java.lang.CharSequence");
                    }

                    @Override // X.AbstractC1110790f0n
                    public final PublicAreaMessageCommon LLIIII() {
                        return ((UnauthorizedMemberMessage) this.LJIL).publicAreaCommon;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final boolean LLJJ() {
                        if (((UnauthorizedMemberMessage) this.LJIL).action == 1) {
                            return LLIILII() || this.LJIL.baseMessage.foldType != 0;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return this.LJJI;
                    }

                    {
                        super(unauthorizedMemberMessage);
                        this.LJJI = new C154700iX(unauthorizedMemberMessage.nickName);
                    }
                };
            case 8:
                final RoomMessage roomMessage = (RoomMessage) abstractC1136060ffY;
                if (TextUtils.equals(roomMessage.scene, "match_virtual_ticket_public_message")) {
                    return new C239700wF(roomMessage) { // from class: X.00lo
                        public final C01GW LJJII;

                        @Override // X.C239700wF, X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                        public final ImageModel LJLLLLLL() {
                            return null;
                        }

                        @Override // X.C239700wF, X.AbstractC1110790f0n
                        public final CharSequence LLIZLLLIL() {
                            String string;
                            Text text;
                            List<TextPiece> list;
                            TextPiece next;
                            Spannable spannableLJIILJJIL;
                            String str;
                            Long lLJIILIIL;
                            CommonMessageData commonMessageData = this.LJIL.baseMessage;
                            if (commonMessageData != null && (text = commonMessageData.displayText) != null && (list = text.pieces) != null && !list.isEmpty()) {
                                int pieceType = EnumC1133850fbz.STRING.getPieceType();
                                Iterator<TextPiece> it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                    if (next.type == pieceType) {
                                        break;
                                    }
                                }
                                TextPiece textPiece = next;
                                String strLJIIJJI = C497740JfY.LJIIJJI(2131755904, (int) ((textPiece == null || (str = textPiece.stringValue) == null || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null) ? 0L : lLJIILIIL.longValue()));
                                if (strLJIIJJI != null && strLJIIJJI.length() != 0 && (spannableLJIILJJIL = C1133830fbx.LJIILJJIL(strLJIIJJI, text, this)) != null && spannableLJIILJJIL.length() != 0) {
                                    return spannableLJIILJJIL;
                                }
                            }
                            String str2 = ((RoomMessage) this.LJIL).content;
                            if (str2 == null || (string = a0.LJLIIIL(str2).toString()) == null) {
                                string = "";
                            }
                            if (a0.LJJJIL(string)) {
                                return C1133830fbx.LIZ;
                            }
                            User user = (User) this.LJJII.getValue();
                            return user == null ? C175200lq.LIZIZ(LJLLLL(), string) : C175200lq.LIZLLL(user, " ", string, LJIIL(), LJLLLL(), this);
                        }

                        @Override // X.C239700wF, X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                        public final User getUser() {
                            return (User) this.LJJII.getValue();
                        }

                        {
                            super(roomMessage);
                            this.LJJII = C452501pT.LIZIZ(new C5182020e(roomMessage, 23));
                        }
                    };
                }
                return new C239700wF(roomMessage);
            case BdTuring.TYPE_ECAF /* 9 */:
                SocialMessage socialMessage = (SocialMessage) abstractC1136060ffY;
                if (socialMessage.shareDisplayStyle == 1) {
                    return null;
                }
                return new C239500wD(socialMessage);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                final ControlMessage controlMessage = (ControlMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<ControlMessage>(controlMessage) { // from class: X.00jW
                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        ControlMessage controlMessage2 = (ControlMessage) this.LJIL;
                        if (controlMessage2 == null) {
                            return "";
                        }
                        Resources resources = C497740JfY.LJII().getResources();
                        int i = controlMessage2.action;
                        return i != 1 ? i == 2 ? Build.VERSION.SDK_INT >= 24 ? C497740JfY.LJIJI(2131853515) : resources.getString(2131853515) : "" : Build.VERSION.SDK_INT >= 24 ? C497740JfY.LJIJI(2131853477) : resources.getString(2131853477);
                    }
                };
            case BdTuring.TYPE_EMAIL /* 11 */:
                final ScreenMessage screenMessage = (ScreenMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<ScreenMessage>(screenMessage) { // from class: X.00iR
                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return ((ScreenMessage) this.LJIL).userInfo;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        int iLJIIL = LJIIL();
                        int iLJLLLL = LJLLLL();
                        MESSAGE message = this.LJIL;
                        return C175200lq.LIZJ(((ScreenMessage) message).userInfo, "：", ((ScreenMessage) message).content, iLJIIL, iLJLLLL, this);
                    }
                };
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                final RichChatMessage richChatMessage = (RichChatMessage) abstractC1136060ffY;
                return new AbstractC519260KYa<RichChatMessage>(richChatMessage) { // from class: X.00uJ
                    public static final String[] LJJIFFI = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
                    public final boolean LJJI;

                    @Override // X.AbstractC519260KYa, X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        this.LJIL.getClass();
                        return null;
                    }

                    @Override // X.AbstractC519260KYa
                    public final String LLJLILLLLZIIL() {
                        return ((RichChatMessage) this.LJIL).color;
                    }

                    @Override // X.AbstractC519260KYa
                    public final void LLJLL() {
                        this.LJIL.getClass();
                    }

                    @Override // X.AbstractC519260KYa
                    public final void LLJLLIL() {
                        this.LJIL.getClass();
                    }

                    @Override // X.AbstractC519260KYa
                    public final void LLJLLL() {
                        this.LJIL.getClass();
                    }

                    @Override // X.AbstractC519260KYa
                    public final ImageModel LLJZ() {
                        return ((RichChatMessage) this.LJIL).icon;
                    }

                    @Override // X.AbstractC519260KYa
                    public final void LLJLIL() {
                        C784440Upu.LIZ().LIZIZ(new C227800uK((RichChatMessage) this.LJIL));
                    }

                    @Override // X.AbstractC519260KYa
                    public final boolean LLJZIJLIL() {
                        return this.LJJI;
                    }

                    {
                        super(richChatMessage);
                        boolean z = false;
                        int i = 0;
                        while (true) {
                            String[] strArr = LJJIFFI;
                            if (i >= strArr.length) {
                                break;
                            }
                            if (TextUtils.equals(strArr[i], richChatMessage.actionType)) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                        this.LJJI = z;
                    }
                };
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                final CommentsMessage commentsMessage = (CommentsMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<CommentsMessage>(commentsMessage) { // from class: X.00iS
                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return C175200lq.LIZJ(((CommentsMessage) this.LJIL).user, "", " ", LJIIL(), LJLLLL(), this);
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return ((CommentsMessage) this.LJIL).user;
                    }
                };
            case 14:
                final XGGoodsOrderMessage xGGoodsOrderMessage = (XGGoodsOrderMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<XGGoodsOrderMessage>(xGGoodsOrderMessage) { // from class: X.00uF
                    public final User LJJI = C0KXJ.LIZIZ();

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        User user;
                        User user2 = this.LJJI;
                        int i = 0;
                        if (user2 != null && (user = ((XGGoodsOrderMessage) this.LJIL).user) != null && user2.getId() == user.getId() && ((XGGoodsOrderMessage) this.LJIL).goodsOrder != null) {
                            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
                            c784440UpuLIZ.LIZIZ(new Object() { // from class: X.00uI
                            });
                        }
                        XGGoodsOrderMessage xGGoodsOrderMessage2 = (XGGoodsOrderMessage) this.LJIL;
                        User user3 = xGGoodsOrderMessage2.user;
                        XGGoodsOrderMessage.GoodsOrder goodsOrder = xGGoodsOrderMessage2.goodsOrder;
                        String strLIZLLL = user3 != null ? C0KVU.LIZLLL(user3) : null;
                        String strValueOf = goodsOrder != null ? String.valueOf(goodsOrder.goodsRoomOrder) : null;
                        if (TextUtils.isEmpty(strLIZLLL) || TextUtils.isEmpty(strValueOf)) {
                            return null;
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZLLL + C497740JfY.LJIJJ(2131855013, strValueOf));
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LJFF((this.LJJI == null || ((XGGoodsOrderMessage) this.LJIL).user == null) ? 0 : R.color.a_r)), 0, strLIZLLL.length(), 17);
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LJFF(R.color.a_q)), strLIZLLL.length(), strLIZLLL.length() + 6, 17);
                        if (this.LJJI != null && ((XGGoodsOrderMessage) this.LJIL).user != null) {
                            i = R.color.a_r;
                        }
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C497740JfY.LJFF(i)), strLIZLLL.length() + 6, spannableStringBuilder.length(), 17);
                        return spannableStringBuilder;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return ((XGGoodsOrderMessage) this.LJIL).user;
                    }
                };
            case 15:
                final AssetMessage assetMessage = (AssetMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<AssetMessage>(assetMessage) { // from class: X.00jT
                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return null;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        TextPieceUser textPieceUser;
                        MESSAGE message = this.LJIL;
                        if (message.baseMessage == null || message.baseMessage.displayText == null) {
                            return null;
                        }
                        for (TextPiece textPiece : message.baseMessage.displayText.pieces) {
                            if (textPiece.type == EnumC1133850fbz.USER.getPieceType() && (textPieceUser = textPiece.userValue) != null) {
                                return textPieceUser.user;
                            }
                        }
                        return null;
                    }
                };
            case 16:
                final PortalMessage portalMessage = (PortalMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<PortalMessage>(portalMessage) { // from class: X.00hy
                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return null;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        MESSAGE message = this.LJIL;
                        if (((PortalMessage) message).payload instanceof PortalMessage.PortalFinish) {
                            return ((PortalMessage.PortalFinish) ((PortalMessage) message).payload).luckyPerson;
                        }
                        return null;
                    }
                };
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                final RedEnvelopMessage redEnvelopMessage = (RedEnvelopMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<RedEnvelopMessage>(redEnvelopMessage) { // from class: X.00lv
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                    public final int LIZLLL() {
                        return R.drawable.f9e;
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final boolean LJJLIL() {
                        return false;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return null;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }

                    {
                        Text text;
                        List<TextPiece> list;
                        IHostFrescoHelper iHostFrescoHelper;
                        ImageModel imageModel;
                        super(redEnvelopMessage);
                        CommonMessageData commonMessageData = redEnvelopMessage.baseMessage;
                        if (commonMessageData != null && (text = commonMessageData.displayText) != null && (list = text.pieces) != null) {
                            for (TextPiece textPiece : list) {
                                if (textPiece.type == EnumC1133850fbz.IMAGE.getPieceType() && (iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)) != null) {
                                    TextPieceImage textPieceImage = textPiece.imageValue;
                                    if (textPieceImage != null) {
                                        imageModel = textPieceImage.imageModel;
                                    } else {
                                        imageModel = null;
                                    }
                                    iHostFrescoHelper.xW1(imageModel, new InterfaceC177000m8() { // from class: X.00lw
                                        @Override // X.InterfaceC177000m8
                                        public final void LIZ(Bitmap bitmap) {
                                            C20441214yg.LIZIZ("RedEnvelopeMessageModel", "load icon success");
                                        }
                                    });
                                }
                            }
                        }
                    }
                };
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return new C1110230ezt((LiveIntroMessage) abstractC1136060ffY);
            case 19:
                return new C1110490f0J((WhisperMessage) abstractC1136060ffY);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return new C160900jX((AISummaryMessage) abstractC1136060ffY);
            case 21:
                final LiveGameIntroMessage liveGameIntroMessage = (LiveGameIntroMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<LiveGameIntroMessage>(liveGameIntroMessage) { // from class: X.00m3
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
                    public final boolean LJIIZILJ() {
                        return true;
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
                    public final int LJIJI() {
                        return 2;
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
                    public final long LJJII() {
                        return 2000L;
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
                    public final int LJLJJL() {
                        return 1;
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
                    public final boolean LJLLILLLL() {
                        return true;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return ((LiveGameIntroMessage) this.LJIL).LL;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
                    public final boolean LLJJIJIL() {
                        CommonMessageData commonMessageData = this.LJIL.baseMessage;
                        return (commonMessageData == null || commonMessageData.displayText == null) ? false : true;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
                    public final void onAttach() {
                        List<GameTag> list;
                        GameTag gameTag;
                        super.onAttach();
                        DataChannel dataChannel = LLIIIILZ().LJIIIZ;
                        if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(C0TZR.class), Boolean.TRUE)) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ingame_rank_show");
                            c474500IjALIZ.LJIL();
                            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
                            c474500IjALIZ.LJJIIZI(C494680Jac.LJIIZILJ(C517110KPt.LIZIZ()));
                            c474500IjALIZ.LJJII(C176600m4.LIZIZ(Boolean.valueOf(LLIIIILZ().LJI)) ? "anchor" : "audience", "user_type");
                            c474500IjALIZ.LJJII(Integer.valueOf(((LiveGameIntroMessage) this.LJIL).hasRankInfo ? 1 : 0), "has_rank");
                            Room room = LLIIIILZ().LJII;
                            if (room == null || (list = room.gameTags) == null || (gameTag = (GameTag) C13LP.LJJJLZIJ(0, list)) == null) {
                                String str = ((LiveGameIntroMessage) this.LJIL).LLILLJJLI;
                                if (str != null) {
                                    c474500IjALIZ.LJJII(str, "game_id");
                                }
                                String str2 = ((LiveGameIntroMessage) this.LJIL).LLILLL;
                                if (str2 != null) {
                                    c474500IjALIZ.LJJII(str2, "game_name");
                                }
                            } else {
                                c474500IjALIZ.LJJII(gameTag.id, "game_id");
                                c474500IjALIZ.LJJII(gameTag.showName, "game_name");
                            }
                            c474500IjALIZ.LIZ();
                            DataChannel dataChannel2 = LLIIIILZ().LJIIIZ;
                            if (dataChannel2 != null) {
                                dataChannel2.SX0(C0TZR.class, Boolean.TRUE);
                            }
                        }
                    }
                };
            case 22:
                return new C245000x6((SubNotifyMessage) abstractC1136060ffY);
            case 23:
                return new C176100lz((GiftCollectionUpdateMessage) abstractC1136060ffY);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                final RankTextMessage rankTextMessage = (RankTextMessage) abstractC1136060ffY;
                if (rankTextMessage.scene == 1) {
                    return new AbstractC1110800f0o<RankTextMessage>(rankTextMessage) { // from class: X.00m2
                        public BadgeStruct LJJI;

                        @Override // X.AbstractC1110790f0n
                        public final CharSequence LLFF() {
                            return null;
                        }

                        @Override // X.AbstractC1110790f0n
                        public final boolean LLJILLL() {
                            return true;
                        }

                        @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                        public final User getUser() {
                            return null;
                        }

                        public final Map<String, String> LLJLIL() {
                            ArrayMap arrayMap = new ArrayMap();
                            MESSAGE message = this.LJIL;
                            long jLongValue = ((RankTextMessage) message).ownerIdxBeforeUpdate != null ? ((RankTextMessage) message).ownerIdxBeforeUpdate.longValue() : 0L;
                            MESSAGE message2 = this.LJIL;
                            long jLongValue2 = ((RankTextMessage) message2).ownerIdxAfterUpdate != null ? ((RankTextMessage) message2).ownerIdxAfterUpdate.longValue() : 0L;
                            String str = "";
                            if (jLongValue >= 0 && jLongValue2 > 0) {
                                String str2 = (jLongValue <= 3 || jLongValue2 > 3) ? (jLongValue2 >= 3 || jLongValue2 >= jLongValue) ? "" : "top3_change" : "above_top3_change";
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(jLongValue2);
                                sbLIZ.append("");
                                arrayMap.put("to_user_rank", C2188811AlT.LIZIZ(sbLIZ));
                                str = str2;
                            }
                            arrayMap.put("top_active_user_rank_message_type", str);
                            return arrayMap;
                        }

                        @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
                        public final Text LLFZ() {
                            long currentUserId = UserService.getInstance().user().getCurrentUserId();
                            MESSAGE message = this.LJIL;
                            return currentUserId == ((RankTextMessage) message).curUserId ? ((RankTextMessage) message).selfGetBadgeMsg : ((RankTextMessage) message).otherGetBadgeMsg;
                        }

                        @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
                        public final boolean LLJJIJIL() {
                            return LLFZ() != null;
                        }

                        @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
                        public final void onAttach() {
                            super.onAttach();
                            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_top_active_user_rank_message_show", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
                            c474500IjALIZIZ.LJJIIZI(LLJLIL());
                            c474500IjALIZIZ.LJIL();
                            c474500IjALIZIZ.LJJII(LLIILII() ? "anchor" : "user", "user_type");
                            c474500IjALIZIZ.LJJII(Integer.valueOf(UserService.getInstance().user().getCurrentUserId() == ((RankTextMessage) this.LJIL).curUserId ? 1 : 0), "is_self");
                            c474500IjALIZIZ.LIZ();
                            C474500IjA c474500IjALIZIZ2 = C0IJT.LIZIZ("livesdk_top_active_user_rank_message_send", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_100()));
                            c474500IjALIZIZ2.LJJIIZI(LLJLIL());
                            c474500IjALIZIZ2.LJIL();
                            c474500IjALIZIZ2.LJJII(LLIILII() ? "anchor" : "user", "user_type");
                            c474500IjALIZIZ2.LJJII(Integer.valueOf(UserService.getInstance().user().getCurrentUserId() != ((RankTextMessage) this.LJIL).curUserId ? 0 : 1), "is_self");
                            c474500IjALIZIZ2.LIZ();
                        }

                        @Override // X.AbstractC1110790f0n
                        public final void LLILLL(BadgeStruct badgeStruct) {
                            String str;
                            if (C191100oP.LIZIZ(this.LJJI)) {
                                long j = ((RankTextMessage) this.LJIL).curUserId;
                                if (LLIILII()) {
                                    str = "anchor";
                                } else {
                                    str = "user";
                                }
                                C191100oP.LJ(j, "livesdk_top_active_user_rank_badge_click", "comment_area_rank_message", str);
                            }
                            if (C191100oP.LIZJ(badgeStruct) && badgeStruct != null) {
                                C498280JgQ.LIZ(badgeStruct, LLIIJI(), LJZL());
                            }
                        }

                        @Override // X.AbstractC1110790f0n
                        public final void LLILZ(BadgeStruct badgeStruct) {
                            String str;
                            if (C191100oP.LIZIZ(badgeStruct)) {
                                this.LJJI = badgeStruct;
                                long j = ((RankTextMessage) this.LJIL).curUserId;
                                if (LLIILII()) {
                                    str = "anchor";
                                } else {
                                    str = "user";
                                }
                                C191100oP.LJ(j, "livesdk_top_active_user_rank_badge_show", "comment_area_rank_message", str);
                            }
                        }
                    };
                }
                return new AbstractC1110800f0o<RankTextMessage>(rankTextMessage) { // from class: X.00jg
                    public long LJJI;

                    @Override // X.AbstractC1110790f0n
                    public final void LLILZ(BadgeStruct badgeStruct) {
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                    public final ImageModel LJLLLLLL() {
                        return ((RankTextMessage) this.LJIL).leftIcon;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
                    public final Text LLFZ() {
                        RankTextMessage rankTextMessage2 = (RankTextMessage) this.LJIL;
                        if (rankTextMessage2.scene != 11) {
                            return rankTextMessage2.content;
                        }
                        long currentUserId = UserService.getInstance().user().getCurrentUserId();
                        MESSAGE message = this.LJIL;
                        return currentUserId == ((RankTextMessage) message).curUserId ? ((RankTextMessage) message).selfGetBadgeMsg : ((RankTextMessage) message).otherGetBadgeMsg;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
                    public final boolean LLJJIJIL() {
                        return LLFZ() != null;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
                    public final void onAttach() {
                        super.onAttach();
                        long messageId = this.LJIL.getMessageId();
                        if (this.LJJI != messageId) {
                            this.LJJI = messageId;
                            RankTextMessage rankTextMessage2 = (RankTextMessage) this.LJIL;
                            int i = rankTextMessage2.rankType;
                            int i2 = rankTextMessage2.scene;
                            String str = "livesdk_room_public_screen_message_show";
                            String str2 = "";
                            switch (i2) {
                                case 2:
                                case 3:
                                    i = RankTypeV2.LJIIL.type;
                                    str = "livesdk_rank_midday_sprint_guide_message_show";
                                    break;
                                case 4:
                                    str2 = "league_tile";
                                    break;
                                case 5:
                                    str2 = "anchor_music_spotlight_guide";
                                    break;
                                case 6:
                                    str2 = "anchor_music_content_no_standard";
                                    break;
                                case 7:
                                    str2 = "anchor_popular_points_no_standard";
                                    break;
                                case 8:
                                    str2 = "anchor_music_nolisted_risk";
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    str2 = "user_first_guide";
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    str2 = "user_spotlight_notice";
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    str2 = "top_buyers";
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    str2 = "not_ranked";
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    str2 = "friends_ranking_suggest_match";
                                    break;
                            }
                            C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJJII(Long.valueOf(LLIIIILZ().LJIL), "anchor_id");
                            c474500IjALIZ.LJJII(Long.valueOf(LLIIIILZ().LJIIZILJ), "room_id");
                            c474500IjALIZ.LJJII(LLIIIILZ().LJI ? "anchor" : "user", "user_type");
                            c474500IjALIZ.LJJII(str2, "msg_type");
                            c474500IjALIZ.LJJII(Integer.valueOf(UserService.getInstance().user().getCurrentUserId() == ((RankTextMessage) this.LJIL).curUserId ? 1 : 0), "is_self");
                            long jIg0 = ((IRankService) C1161920gLG.LIZJ(IRankService.class)).Ig0(i);
                            boolean zI00 = ((IRankService) C1161920gLG.LIZJ(IRankService.class)).I00(i);
                            c474500IjALIZ.LJJII(Long.valueOf(jIg0), "anchor_rank_index");
                            c474500IjALIZ.LJJII(Integer.valueOf(zI00 ? 1 : 0), "anchor_rank");
                            RankTextMessage rankTextMessage3 = (RankTextMessage) this.LJIL;
                            if (rankTextMessage3.scene == 11) {
                                c474500IjALIZ.LJJII(rankTextMessage3.ownerIdxAfterUpdate, "anchor_rank_index");
                            }
                            c474500IjALIZ.LIZ();
                        }
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final C1110020ezY LJIILJJIL(int i, User user) {
                        return super.LJIILJJIL(i, user);
                    }
                };
            case 25:
                final ModeratorSpeakerMessage moderatorSpeakerMessage = (ModeratorSpeakerMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<ModeratorSpeakerMessage>(moderatorSpeakerMessage) { // from class: X.00jc
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                    public final int LIZLLL() {
                        return R.drawable.ewd;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112680f3q
                    public final boolean LJJJJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
                    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00da A[PHI: r4
                      0x00da: PHI (r4v1 java.lang.String) = (r4v0 java.lang.String), (r4v3 java.lang.String) binds: [B:42:0x00d6, B:8:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onAttach() {
                        /*
                            Method dump skipped, instruction units count: 221
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C161400jc.onAttach():void");
                    }
                };
            case 26:
                return new C1112330f3H((CapsuleMessage) abstractC1136060ffY, null, -1, -1, null);
            case 27:
                final EnvelopePortalMessage envelopePortalMessage = (EnvelopePortalMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<EnvelopePortalMessage>(envelopePortalMessage) { // from class: X.00ly
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                    public final int LIZLLL() {
                        return R.drawable.f9e;
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final boolean LJJLIL() {
                        return false;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
                    public final void onAttach() {
                        Object obj;
                        Text text;
                        String str;
                        InterfaceC500940Jki interfaceC500940JkiUser;
                        InterfaceC2262081DgM currentUser;
                        InterfaceC500940Jki interfaceC500940JkiUser2;
                        super.onAttach();
                        HashMap map = new HashMap(8);
                        UserService userService = UserService.getInstance();
                        map.put("user_id", String.valueOf((userService == null || (interfaceC500940JkiUser2 = userService.user()) == null) ? 0L : interfaceC500940JkiUser2.getCurrentUserId()));
                        boolean zLLIILII = LLIILII();
                        String str2 = CardStruct.IStatusCode.DEFAULT;
                        map.put("is_anchor", zLLIILII ? "1" : CardStruct.IStatusCode.DEFAULT);
                        UserService userService2 = UserService.getInstance();
                        String strValueOf = (userService2 == null || (interfaceC500940JkiUser = userService2.user()) == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null) ? "" : String.valueOf(currentUser.getId());
                        EnvelopePortalMessage.PortalInfo portalInfo = ((EnvelopePortalMessage) this.LJIL).portalInfo;
                        map.put("is_portal_owner", Intrinsics.LJFF(strValueOf, portalInfo != null ? portalInfo.senderId : null) ? "1" : CardStruct.IStatusCode.DEFAULT);
                        EnvelopePortalMessage.PortalInfo portalInfo2 = ((EnvelopePortalMessage) this.LJIL).portalInfo;
                        if (portalInfo2 != null && (str = portalInfo2.id) != null) {
                            str2 = str;
                        }
                        map.put("portal_id", str2);
                        w.LIZ.getClass();
                        map.put("enter_from_merge", w.LJIIIZ());
                        map.put("enter_method", w.LJIIL());
                        map.put("action_type", w.LIZLLL());
                        CommonMessageData commonMessageData = this.LJIL.baseMessage;
                        if (commonMessageData == null || (text = commonMessageData.displayText) == null || (obj = text.key) == null) {
                            obj = 0;
                        }
                        map.put("tips_text", obj.toString());
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_area_portal_message_show");
                        c474500IjALIZ.LJJIIZI(map);
                        c474500IjALIZ.LJIL();
                        c474500IjALIZ.LIZ();
                    }

                    {
                        boolean zEnablePortal;
                        Text text;
                        List<TextPiece> list;
                        IHostFrescoHelper iHostFrescoHelper;
                        ImageModel imageModel;
                        super(envelopePortalMessage);
                        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
                        if (iGiftService != null) {
                            zEnablePortal = iGiftService.enablePortal();
                        } else {
                            zEnablePortal = false;
                        }
                        envelopePortalMessage.LL = zEnablePortal;
                        CommonMessageData commonMessageData = envelopePortalMessage.baseMessage;
                        if (commonMessageData != null && (text = commonMessageData.displayText) != null && (list = text.pieces) != null) {
                            for (TextPiece textPiece : list) {
                                if (textPiece.type == EnumC1133850fbz.IMAGE.getPieceType() && (iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class)) != null) {
                                    TextPieceImage textPieceImage = textPiece.imageValue;
                                    if (textPieceImage != null) {
                                        imageModel = textPieceImage.imageModel;
                                    } else {
                                        imageModel = null;
                                    }
                                    iHostFrescoHelper.xW1(imageModel, new InterfaceC177000m8() { // from class: X.00lx
                                        @Override // X.InterfaceC177000m8
                                        public final void LIZ(Bitmap bitmap) {
                                        }
                                    });
                                }
                            }
                        }
                    }
                };
            case 28:
                final UpgradeMessage upgradeMessage = (UpgradeMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<UpgradeMessage>(upgradeMessage) { // from class: X.00lr
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                    public final int LIZLLL() {
                        return R.drawable.evx;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final boolean LLJILLL() {
                        return true;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return ((UpgradeMessage) this.LJIL).LL;
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
                    public final CharSequence LJLIL(User user) {
                        return C0KVU.LIZ(user);
                    }

                    @Override // X.AbstractC1110790f0n
                    public final void LLJILJIL(User user) {
                        C289001Aa.LIZIZ(user);
                    }

                    @Override // X.AbstractC1110790f0n
                    public final void LLJIJIL(int i, User user) {
                        C289001Aa.LIZ(i, user);
                    }
                };
            case 29:
                return new C181000mm((GiftGalleryMessage) abstractC1136060ffY);
            case 30:
                final AnchorGrowLevelMessage anchorGrowLevelMessage = (AnchorGrowLevelMessage) abstractC1136060ffY;
                return new AbstractC1110800f0o<AnchorGrowLevelMessage>(anchorGrowLevelMessage) { // from class: X.00jZ
                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112680f3q
                    public final boolean LJJJJ() {
                        return false;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification;
                        AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification2;
                        int iLJLLLL = LJLLLL();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCreateContent: ");
                        AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV2 = ((AnchorGrowLevelMessage) this.LJIL).anchorGrowLevelImMsgV2;
                        String str = null;
                        sbLIZ.append((anchorGrowLevelImMsgV2 == null || (anchorGrowLevelImMsgNotification2 = anchorGrowLevelImMsgV2.notificationData) == null) ? null : anchorGrowLevelImMsgNotification2.content);
                        C20441214yg.LIZIZ("LiveGrowth", C2188811AlT.LIZIZ(sbLIZ));
                        AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV22 = ((AnchorGrowLevelMessage) this.LJIL).anchorGrowLevelImMsgV2;
                        if (anchorGrowLevelImMsgV22 != null && (anchorGrowLevelImMsgNotification = anchorGrowLevelImMsgV22.notificationData) != null) {
                            str = anchorGrowLevelImMsgNotification.content;
                        }
                        return C175200lq.LIZIZ(iLJLLLL, str);
                    }

                    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
                    public final void onAttach() {
                        String str;
                        AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification;
                        AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification2;
                        AnchorGrowLevelImMsgNotification anchorGrowLevelImMsgNotification3;
                        super.onAttach();
                        MESSAGE message = this.LJIL;
                        LLIIIILZ();
                        C1091120eV4.LIZJ(message);
                        C20441214yg.LIZIZ("LiveGrowth", "onAttach");
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_promoting_message_show");
                        c474500IjALIZ.LJIJJLI(LLIIIILZ().LJIIIZ);
                        c474500IjALIZ.LJJIJIIJI(Long.valueOf(LLIIIILZ().LJIIZILJ));
                        c474500IjALIZ.LJI(Long.valueOf(LLIIIILZ().LJIL));
                        AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV2 = ((AnchorGrowLevelMessage) this.LJIL).anchorGrowLevelImMsgV2;
                        if (anchorGrowLevelImMsgV2 == null || (anchorGrowLevelImMsgNotification3 = anchorGrowLevelImMsgV2.notificationData) == null || (str = anchorGrowLevelImMsgNotification3.starlingKey) == null) {
                            str = "";
                        }
                        c474500IjALIZ.LJJII(str, "msg_id");
                        c474500IjALIZ.LJJII(LLIIIILZ().LJI ? "anchor" : "viewer", "admin_type");
                        AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV22 = ((AnchorGrowLevelMessage) this.LJIL).anchorGrowLevelImMsgV2;
                        long j = -1;
                        c474500IjALIZ.LJJII(Long.valueOf((anchorGrowLevelImMsgV22 == null || (anchorGrowLevelImMsgNotification2 = anchorGrowLevelImMsgV22.notificationData) == null) ? -1L : anchorGrowLevelImMsgNotification2.level), "growth_stage");
                        AnchorGrowLevelImMsgV2 anchorGrowLevelImMsgV23 = ((AnchorGrowLevelMessage) this.LJIL).anchorGrowLevelImMsgV2;
                        if (anchorGrowLevelImMsgV23 != null && (anchorGrowLevelImMsgNotification = anchorGrowLevelImMsgV23.notificationData) != null) {
                            j = anchorGrowLevelImMsgNotification.taskId;
                        }
                        c474500IjALIZ.LJJII(Long.valueOf(j), "task_id");
                        c474500IjALIZ.LIZ();
                    }
                };
            case 31:
                return new C1110640f0Y((CommentReplyMessage) abstractC1136060ffY);
            case 32:
                if (!LiveMinusOneScreenTipsInFeedSetting.isTipsInFeedEnabled()) {
                    return null;
                }
                return new C226800uA((InteractionHubGoalMessage) abstractC1136060ffY);
            default:
                return null;
        }
    }

    public static CharSequence LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        SpannableString spannableString = new SpannableString(str);
        C786410Ut5.o2(spannableString, new ForegroundColorSpan(i), 0, spannableString.length(), 18);
        return spannableString;
    }

    public static Spannable LJFF(User user, String str, int i, int i2, InterfaceC1133840fby interfaceC1133840fby) {
        SpannableString spannableString;
        if (user != null && !TextUtils.isEmpty(C0KVU.LIZ(user)) && !TextUtils.isEmpty(C0KVU.LIZ(user)) && !TextUtils.isEmpty(str)) {
            String strLIZ = C0KVU.LIZ(user);
            C1110020ezY c1110020ezYLJIILJJIL = interfaceC1133840fby.LJIILJJIL(i, user);
            C1110050ezb c1110050ezbLJJJ = interfaceC1133840fby.LJJJ(i2, user);
            int iIndexOf = str.indexOf(strLIZ);
            if (iIndexOf < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ);
                sbLIZ.append("  ");
                sbLIZ.append(str);
                spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
                iIndexOf = 0;
            } else {
                spannableString = new SpannableString(str);
            }
            C786410Ut5.o2(spannableString, c1110020ezYLJIILJJIL, iIndexOf, strLIZ.length() + iIndexOf, 17);
            C786410Ut5.o2(spannableString, c1110050ezbLJJJ, 0, iIndexOf, 17);
            C786410Ut5.o2(spannableString, c1110050ezbLJJJ, iIndexOf + strLIZ.length(), spannableString.length(), 17);
            return spannableString;
        }
        return C1133830fbx.LIZ;
    }

    public static Spannable LIZJ(User user, String str, String str2, int i, int i2, InterfaceC1133840fby interfaceC1133840fby) {
        if (user != null && !TextUtils.isEmpty(C0KVU.LIZ(user)) && !TextUtils.isEmpty(C0KVU.LIZ(user)) && !TextUtils.isEmpty(str2)) {
            String strLIZ = C0KVU.LIZ(user);
            C1110020ezY c1110020ezYLJIILJJIL = interfaceC1133840fby.LJIILJJIL(i, user);
            C1110050ezb c1110050ezbLJJJ = interfaceC1133840fby.LJJJ(i2, user);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(str);
            sbLIZ.append(str2);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.o2(spannableString, c1110020ezYLJIILJJIL, 0, strLIZ.length() + 1, 33);
            C786410Ut5.o2(spannableString, c1110050ezbLJJJ, strLIZ.length() + 1, spannableString.length(), 18);
            return spannableString;
        }
        return C1133830fbx.LIZ;
    }

    public static Spannable LIZLLL(User user, String str, String str2, int i, int i2, InterfaceC1133840fby interfaceC1133840fby) {
        if (user != null && !TextUtils.isEmpty(C0KVU.LIZ(user)) && !TextUtils.isEmpty(C0KVU.LIZ(user)) && !TextUtils.isEmpty(str2)) {
            String strLIZ = C0KVU.LIZ(user);
            C1110020ezY c1110020ezYLJIILJJIL = interfaceC1133840fby.LJIILJJIL(i, user);
            C1110050ezb c1110050ezbLJJJ = interfaceC1133840fby.LJJJ(i2, user);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ);
            sbLIZ.append(str);
            sbLIZ.append(str2);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.o2(spannableString, c1110020ezYLJIILJJIL, 0, strLIZ.length(), 33);
            C786410Ut5.o2(spannableString, c1110050ezbLJJJ, strLIZ.length(), spannableString.length(), 18);
            return spannableString;
        }
        return C1133830fbx.LIZ;
    }
}
