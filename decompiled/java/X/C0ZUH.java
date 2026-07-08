package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.im.b2c.card.DefaultShareProductClickHandler;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.DefaultRecentActivityHandler;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAwemeCardClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListPhotoClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListQuotedMessageClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListShareWebClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListStickerClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextBigEmojiClickAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListTextClickAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quoted.ui.DefaultQuotedMessageClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.adapter.DefaultGroupInviteCardClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.aweme.DefaultAwemeCardClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.camera.DefaultPhotoClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.camera.DefaultVideoClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.comment.DefaultCommentClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultGifClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.gif.DefaultStickerClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.live.DefaultShareLiveEventClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.portrait.DefaultPortraitCardClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.repost.DefaultRepostClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.DefaultAvatarClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.DefaultForwardShareMessageHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.slots.DefaultResendMessageHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.DefaultTextBigEmojiClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.DefaultTextClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.unified.DefaultShareWebClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.user.DefaultContentFollowClickHandler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.user.DefaultShareUserClickHandler;

/* JADX INFO: renamed from: X.0ZUH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZUH {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJJIIJZLJL;
    public final SessionInfo LIZ;
    public final Fragment LIZIZ;
    public volatile DefaultAwemeCardClickHandler LIZJ;
    public volatile DefaultStickerClickHandler LIZLLL;
    public volatile DefaultGifClickHandler LJ;
    public volatile DefaultPhotoClickHandler LJFF;
    public volatile DefaultVideoClickHandler LJI;
    public volatile DefaultCommentClickHandler LJII;
    public volatile DefaultShareLiveEventClickHandler LJIIIIZZ;
    public volatile DefaultAvatarClickHandler LJIIIZ;
    public volatile DefaultGroupInviteCardClickHandler LJIIJ;
    public volatile DefaultShareProductClickHandler LJIIJJI;
    public volatile DefaultPortraitCardClickHandler LJIIL;
    public volatile DefaultContentFollowClickHandler LJIILIIL;
    public volatile DefaultShareUserClickHandler LJIILJJIL;
    public volatile C0ZQ7 LJIILL;
    public volatile C0ZUQ LJIILLIIL;
    public volatile C0ZUI LJIIZILJ;
    public volatile C0ZUP LJIJ;
    public volatile C0ZUK LJIJI;
    public volatile C2244401Csw LJIJJ;
    public volatile DefaultQuotedMessageClickHandler LJIJJLI;
    public volatile DefaultShareWebClickHandler LJIL;
    public volatile DefaultResendMessageHandler LJJ;
    public volatile DefaultForwardShareMessageHandler LJJI;
    public volatile DefaultRecentActivityHandler LJJIFFI;
    public volatile DefaultRepostClickHandler LJJII;
    public volatile DefaultTextBigEmojiClickHandler LJJIII;
    public volatile DefaultTextClickHandler LJJIIJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0ZUH.class, "awemeCardClick", "getAwemeCardClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListAwemeCardClickAbility;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0ZUH.class, "stickerClick", "getStickerClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListStickerClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0ZUH.class, "gifClick", "getGifClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListGifClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0ZUH.class, "photoClick", "getPhotoClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListPhotoClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0ZUH.class, "videoClick", "getVideoClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListVideoClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C0ZUH.class, "commentClick", "getCommentClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListCommentClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C0ZUH.class, "shareLiveEventClick", "getShareLiveEventClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListShareLiveEventClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C0ZUH.class, "avatarClick", "getAvatarClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListAvatarClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(C0ZUH.class, "groupInviteCardClick", "getGroupInviteCardClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListGroupInviteCardClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(C0ZUH.class, "shareProductClick", "getShareProductClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListShareProductClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(C0ZUH.class, "portraitCardClick", "getPortraitCardClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListPortraitCardClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS12 = new C2217381BqS(C0ZUH.class, "contentFollowClick", "getContentFollowClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListContentFollowClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS13 = new C2217381BqS(C0ZUH.class, "shareUserClick", "getShareUserClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListShareUserClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS14 = new C2217381BqS(C0ZUH.class, "shareMusicClick", "getShareMusicClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListMultiShareShareMusicClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS15 = new C2217381BqS(C0ZUH.class, "shareQnAClick", "getShareQnAClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListMultiShareShareQnAClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS16 = new C2217381BqS(C0ZUH.class, "shareChallengeClick", "getShareChallengeClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListMultiShareShareChallengeClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS17 = new C2217381BqS(C0ZUH.class, "shareCompilationClick", "getShareCompilationClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListMultiShareShareCompilationClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS18 = new C2217381BqS(C0ZUH.class, "shareEffectClick", "getShareEffectClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListMultiShareShareEffectClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS19 = new C2217381BqS(C0ZUH.class, "shareCardClick", "getShareCardClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListMultiShareImageCardClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS20 = new C2217381BqS(C0ZUH.class, "quotedMessageClick", "getQuotedMessageClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListQuotedMessageClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS21 = new C2217381BqS(C0ZUH.class, "shareWebClick", "getShareWebClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListShareWebClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS22 = new C2217381BqS(C0ZUH.class, "resendMessage", "getResendMessage()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListResendMessageAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS23 = new C2217381BqS(C0ZUH.class, "forwardShareMessage", "getForwardShareMessage()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListForwardShareMessageAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS24 = new C2217381BqS(C0ZUH.class, "recentActivity", "getRecentActivity()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListRecentActivityAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS25 = new C2217381BqS(C0ZUH.class, "repostClick", "getRepostClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListRepostClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS26 = new C2217381BqS(C0ZUH.class, "textBigEmojiClick", "getTextBigEmojiClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListTextBigEmojiClickAbility;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS27 = new C2217381BqS(C0ZUH.class, "textClick", "getTextClick()Lcom/ss/android/ugc/aweme/im/messagelist/api/ability/MessageListTextClickAbility;", 0);
        c09r3.getClass();
        LJJIIJZLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11, c2217381BqS12, c2217381BqS13, c2217381BqS14, c2217381BqS15, c2217381BqS16, c2217381BqS17, c2217381BqS18, c2217381BqS19, c2217381BqS20, c2217381BqS21, c2217381BqS22, c2217381BqS23, c2217381BqS24, c2217381BqS25, c2217381BqS26, c2217381BqS27};
    }

    public final MessageListAwemeCardClickAbility LIZ() {
        DefaultAwemeCardClickHandler defaultAwemeCardClickHandler = this.LIZJ;
        if (defaultAwemeCardClickHandler == null) {
            synchronized (this) {
                defaultAwemeCardClickHandler = this.LIZJ;
                if (defaultAwemeCardClickHandler == null) {
                    DefaultAwemeCardClickHandler defaultAwemeCardClickHandler2 = new DefaultAwemeCardClickHandler(this.LIZIZ, this.LIZ);
                    this.LIZJ = defaultAwemeCardClickHandler2;
                    return defaultAwemeCardClickHandler2;
                }
            }
        }
        return defaultAwemeCardClickHandler;
    }

    public final MessageListPhotoClickAbility LIZIZ() {
        DefaultPhotoClickHandler defaultPhotoClickHandler = this.LJFF;
        if (defaultPhotoClickHandler == null) {
            synchronized (this) {
                defaultPhotoClickHandler = this.LJFF;
                if (defaultPhotoClickHandler == null) {
                    DefaultPhotoClickHandler defaultPhotoClickHandler2 = new DefaultPhotoClickHandler(this.LIZ);
                    this.LJFF = defaultPhotoClickHandler2;
                    return defaultPhotoClickHandler2;
                }
            }
        }
        return defaultPhotoClickHandler;
    }

    public final MessageListQuotedMessageClickAbility LIZJ() {
        DefaultQuotedMessageClickHandler defaultQuotedMessageClickHandler = this.LJIJJLI;
        if (defaultQuotedMessageClickHandler == null) {
            synchronized (this) {
                defaultQuotedMessageClickHandler = this.LJIJJLI;
                if (defaultQuotedMessageClickHandler == null) {
                    DefaultQuotedMessageClickHandler defaultQuotedMessageClickHandler2 = new DefaultQuotedMessageClickHandler(this.LIZIZ, this.LIZ);
                    this.LJIJJLI = defaultQuotedMessageClickHandler2;
                    return defaultQuotedMessageClickHandler2;
                }
            }
        }
        return defaultQuotedMessageClickHandler;
    }

    public final MessageListShareWebClickAbility LIZLLL() {
        DefaultShareWebClickHandler defaultShareWebClickHandler = this.LJIL;
        if (defaultShareWebClickHandler == null) {
            synchronized (this) {
                defaultShareWebClickHandler = this.LJIL;
                if (defaultShareWebClickHandler == null) {
                    DefaultShareWebClickHandler defaultShareWebClickHandler2 = new DefaultShareWebClickHandler();
                    this.LJIL = defaultShareWebClickHandler2;
                    return defaultShareWebClickHandler2;
                }
            }
        }
        return defaultShareWebClickHandler;
    }

    public final MessageListStickerClickAbility LJ() {
        DefaultStickerClickHandler defaultStickerClickHandler = this.LIZLLL;
        if (defaultStickerClickHandler == null) {
            synchronized (this) {
                defaultStickerClickHandler = this.LIZLLL;
                if (defaultStickerClickHandler == null) {
                    DefaultStickerClickHandler defaultStickerClickHandler2 = new DefaultStickerClickHandler(this.LIZIZ, this.LIZ);
                    this.LIZLLL = defaultStickerClickHandler2;
                    return defaultStickerClickHandler2;
                }
            }
        }
        return defaultStickerClickHandler;
    }

    public final MessageListTextBigEmojiClickAbility LJFF() {
        DefaultTextBigEmojiClickHandler defaultTextBigEmojiClickHandler = this.LJJIII;
        if (defaultTextBigEmojiClickHandler == null) {
            synchronized (this) {
                defaultTextBigEmojiClickHandler = this.LJJIII;
                if (defaultTextBigEmojiClickHandler == null) {
                    DefaultTextBigEmojiClickHandler defaultTextBigEmojiClickHandler2 = new DefaultTextBigEmojiClickHandler(this.LIZ);
                    this.LJJIII = defaultTextBigEmojiClickHandler2;
                    return defaultTextBigEmojiClickHandler2;
                }
            }
        }
        return defaultTextBigEmojiClickHandler;
    }

    public final MessageListTextClickAbility LJI() {
        DefaultTextClickHandler defaultTextClickHandler = this.LJJIIJ;
        if (defaultTextClickHandler == null) {
            synchronized (this) {
                defaultTextClickHandler = this.LJJIIJ;
                if (defaultTextClickHandler == null) {
                    DefaultTextClickHandler defaultTextClickHandler2 = new DefaultTextClickHandler(this.LIZ);
                    this.LJJIIJ = defaultTextClickHandler2;
                    return defaultTextClickHandler2;
                }
            }
        }
        return defaultTextClickHandler;
    }

    public C0ZUH(Fragment fragment, SessionInfo sessionInfo) {
        this.LIZ = sessionInfo;
        this.LIZIZ = fragment;
    }
}
