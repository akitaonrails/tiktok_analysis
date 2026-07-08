package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.sticker.IEcommerceStickerComponentProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.aweme.tools.sticker.core.article.IArticleStickerComponentService;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.IGroupChatStickerApi;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.IEmojiSliderStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.IInteractiveEmojiStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.link.ILinkStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.service.ILiveEventStickerService;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.service.ILiveEventStoryStickerService;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.ILiveShare;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.ISecretRepliesStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.share2story.IShare2StoryStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.ISharedCommentStickerComponentProvider;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.ISocialAvatarStickerCoreService;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11nX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19607711nX implements C0RFT {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0RH9());
    public C19607811nY LIZIZ;

    @Override // X.C0RFT
    public final C09RD LIZ() {
        C19607811nY c19607811nY = this.LIZIZ;
        if (c19607811nY == null) {
            c19607811nY = null;
        }
        return new C09RD(c19607811nY.LIZ.LIZIZ);
    }

    @Override // X.C0RFT
    public final C11NJ LIZIZ() {
        return (C11NJ) this.LIZ.getValue();
    }

    @Override // X.C0RFT
    public final void pause() {
        C19607811nY c19607811nY = this.LIZIZ;
        if (c19607811nY == null) {
            c19607811nY = null;
        }
        c19607811nY.getClass();
    }

    @Override // X.C0RFT
    public final void resume() {
        C19607811nY c19607811nY = this.LIZIZ;
        if (c19607811nY == null) {
            c19607811nY = null;
        }
        c19607811nY.getClass();
    }

    @Override // X.C0RFT
    public final void destroy() {
        LIZIZ().dispose();
        C19607811nY c19607811nY = this.LIZIZ;
        if (c19607811nY == null) {
            c19607811nY = null;
        }
        c19607811nY.getClass();
        C19591311kt c19591311kt = C19591311kt.LIZ;
        FrameLayout frameLayout = c19607811nY.LIZ.LIZIZ;
        c19591311kt.getClass();
        ArrayList arrayList = new ArrayList();
        int childCount = frameLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = frameLayout.getChildAt(i);
            if (Intrinsics.LJFF(childAt.getTag(), "114_514")) {
                arrayList.add(childAt);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C786410Ut5.LJJJLZIJ((View) it2.next(), frameLayout);
        }
        Iterator it3 = ((ArrayList) c19607811nY.LIZIZ).iterator();
        while (it3.hasNext()) {
            ((AbstractC19589811ke) it3.next()).LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0RFT
    public final void LIZJ(C19591211ks c19591211ks) {
        Class<?> clsLJJI;
        Class<? extends AbstractC19589811ke<?>> clsLIZ;
        Class<? extends AbstractC19589811ke<?>> clsLJI;
        Class<AbstractC19589811ke<?>> clsLIZ2;
        Class<? extends AbstractC19589811ke<?>> clsLIZJ;
        ISecretRepliesStickerComponentProvider iSecretRepliesStickerComponentProvider;
        Class<? extends AbstractC19589811ke<?>> clsLIZ3;
        Class<AbstractC19589811ke<?>> clsLIZIZ;
        Class<? extends AbstractC19589811ke<?>> clsLIZIZ2;
        Class<? extends AbstractC19589811ke<?>> clsLIZIZ3;
        Class<? extends AbstractC19589811ke<?>> clsLIZIZ4;
        Class<? extends AbstractC19589811ke<?>> clsLIZ4;
        Class<? extends AbstractC19589811ke<?>> clsLIZ5;
        C19607811nY c19607811nY = new C19607811nY(c19591211ks);
        this.LIZIZ = c19607811nY;
        c19607811nY.LIZ(EnumC1466150oFx.PICTURE_HASHTAG_GLOBAL.getType(), C19589511kb.class);
        C19607811nY c19607811nY2 = this.LIZIZ;
        C19607811nY c19607811nY3 = 0;
        if (c19607811nY2 == null) {
            c19607811nY2 = null;
        }
        c19607811nY2.LIZ(EnumC1466150oFx.PICTURE_HASHTAG_SINGLE.getType(), C19591111kr.class);
        C19607811nY c19607811nY4 = this.LIZIZ;
        if (c19607811nY4 == null) {
            c19607811nY4 = null;
        }
        c19607811nY4.LIZ(EnumC1466150oFx.PICTURE_HASHTAG_EMBED.getType(), C19589611kc.class);
        C19607811nY c19607811nY5 = this.LIZIZ;
        if (c19607811nY5 == null) {
            c19607811nY5 = null;
        }
        c19607811nY5.LIZ(EnumC1466150oFx.DONATION.getType(), C19588611kS.class);
        C19607811nY c19607811nY6 = this.LIZIZ;
        if (c19607811nY6 == null) {
            c19607811nY6 = null;
        }
        c19607811nY6.LIZ(EnumC1466150oFx.MUSIC_STICKER.getType(), C19595611la.class);
        C19607811nY c19607811nY7 = this.LIZIZ;
        if (c19607811nY7 == null) {
            c19607811nY7 = null;
        }
        c19607811nY7.LIZ(EnumC1466150oFx.POLL.getType(), C19610511nz.class);
        C19607811nY c19607811nY8 = this.LIZIZ;
        if (c19607811nY8 == null) {
            c19607811nY8 = null;
        }
        c19607811nY8.LIZ(EnumC1466150oFx.ADD_YOURS.getType(), C19607511nV.class);
        C19607811nY c19607811nY9 = this.LIZIZ;
        if (c19607811nY9 == null) {
            c19607811nY9 = null;
        }
        c19607811nY9.LIZ(EnumC1466150oFx.TEXT.getType(), C19588811kU.class);
        C19607811nY c19607811nY10 = this.LIZIZ;
        if (c19607811nY10 == null) {
            c19607811nY10 = null;
        }
        c19607811nY10.LIZ(20, C19588811kU.class);
        C19607811nY c19607811nY11 = this.LIZIZ;
        if (c19607811nY11 == null) {
            c19607811nY11 = null;
        }
        c19607811nY11.LIZ(EnumC1466150oFx.LOCATION.getType(), C19608411ne.class);
        IEcommerceStickerComponentProvider iEcommerceStickerComponentProvider = (IEcommerceStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(IEcommerceStickerComponentProvider.class, false, false, false, 14, null);
        if (iEcommerceStickerComponentProvider != null && (clsLIZ5 = iEcommerceStickerComponentProvider.LIZ()) != null) {
            C19607811nY c19607811nY12 = this.LIZIZ;
            if (c19607811nY12 == null) {
                c19607811nY12 = null;
            }
            c19607811nY12.LIZ(EnumC1466150oFx.ECOMMERCE.getType(), clsLIZ5);
        }
        C19607811nY c19607811nY13 = this.LIZIZ;
        if (c19607811nY13 == null) {
            c19607811nY13 = null;
        }
        c19607811nY13.LIZ(EnumC1466150oFx.LIVE_COUNTDOWN.getType(), C19609211nm.class);
        C19607811nY c19607811nY14 = this.LIZIZ;
        if (c19607811nY14 == null) {
            c19607811nY14 = null;
        }
        c19607811nY14.LIZ(EnumC1466150oFx.HASH_TAG.getType(), C19609311nn.class);
        C19607811nY c19607811nY15 = this.LIZIZ;
        if (c19607811nY15 == null) {
            c19607811nY15 = null;
        }
        c19607811nY15.LIZ(EnumC1466150oFx.MENTION.getType(), C19619611pS.class);
        IShare2StoryStickerComponentProvider iShare2StoryStickerComponentProvider = (IShare2StoryStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(IShare2StoryStickerComponentProvider.class, false, false, false, 14, null);
        if (iShare2StoryStickerComponentProvider != null && (clsLIZ4 = iShare2StoryStickerComponentProvider.LIZ()) != null) {
            C19607811nY c19607811nY16 = this.LIZIZ;
            if (c19607811nY16 == null) {
                c19607811nY16 = null;
            }
            c19607811nY16.LIZ(19, clsLIZ4);
        }
        C19607811nY c19607811nY17 = this.LIZIZ;
        if (c19607811nY17 == null) {
            c19607811nY17 = null;
        }
        c19607811nY17.LIZ(EnumC1466150oFx.COMMENT.getType(), C19609111nl.class);
        IInteractiveEmojiStickerComponentProvider iInteractiveEmojiStickerComponentProvider = (IInteractiveEmojiStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(IInteractiveEmojiStickerComponentProvider.class, false, false, false, 14, null);
        if (iInteractiveEmojiStickerComponentProvider != null && (clsLIZIZ4 = iInteractiveEmojiStickerComponentProvider.LIZIZ()) != null) {
            C19607811nY c19607811nY18 = this.LIZIZ;
            if (c19607811nY18 == null) {
                c19607811nY18 = null;
            }
            c19607811nY18.LIZ(EnumC1466150oFx.INTERACTIVE_EMOJI.getType(), clsLIZIZ4);
        }
        IEmojiSliderStickerComponentProvider iEmojiSliderStickerComponentProvider = (IEmojiSliderStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(IEmojiSliderStickerComponentProvider.class, false, false, false, 14, null);
        if (iEmojiSliderStickerComponentProvider != null && (clsLIZIZ3 = iEmojiSliderStickerComponentProvider.LIZIZ()) != null) {
            C19607811nY c19607811nY19 = this.LIZIZ;
            if (c19607811nY19 == null) {
                c19607811nY19 = null;
            }
            c19607811nY19.LIZ(EnumC1466150oFx.EMOJI_SLIDER.getType(), clsLIZIZ3);
        }
        ILinkStickerComponentProvider iLinkStickerComponentProvider = (ILinkStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ILinkStickerComponentProvider.class, false, false, false, 14, null);
        if (iLinkStickerComponentProvider != null && (clsLIZIZ2 = iLinkStickerComponentProvider.LIZIZ()) != null) {
            C19607811nY c19607811nY20 = this.LIZIZ;
            if (c19607811nY20 == null) {
                c19607811nY20 = null;
            }
            c19607811nY20.LIZ(EnumC1466150oFx.LINK.getType(), clsLIZIZ2);
        }
        ILiveEventStickerService iLiveEventStickerService = (ILiveEventStickerService) PluggableExtentionKt.pluggableSpi$default(ILiveEventStickerService.class, false, false, false, 14, null);
        if (iLiveEventStickerService != null && (clsLIZIZ = iLiveEventStickerService.LIZIZ()) != null) {
            C19607811nY c19607811nY21 = this.LIZIZ;
            if (c19607811nY21 == null) {
                c19607811nY21 = null;
            }
            c19607811nY21.LIZ(EnumC1466150oFx.LIVE_EVENT_COUNTDOWN.getType(), clsLIZIZ);
        }
        C19607811nY c19607811nY22 = this.LIZIZ;
        if (c19607811nY22 == null) {
            c19607811nY22 = null;
        }
        c19607811nY22.LIZ(102, C19589011kW.class);
        C19607811nY c19607811nY23 = this.LIZIZ;
        if (c19607811nY23 == null) {
            c19607811nY23 = null;
        }
        c19607811nY23.LIZ(EnumC1466150oFx.ATTRIBUTION_LINK.getType(), C19592411l4.class);
        ILiveShare iLiveShare = (ILiveShare) PluggableExtentionKt.pluggableSpi$default(ILiveShare.class, false, false, false, 14, null);
        if (iLiveShare != null && iLiveShare.LIZIZ() != null) {
            C19607811nY c19607811nY24 = this.LIZIZ;
            if (c19607811nY24 == null) {
                c19607811nY24 = null;
            }
            c19607811nY24.LIZ(EnumC1466150oFx.LIVE_SHARE.getType(), C19610611o0.class);
        }
        ISharedCommentStickerComponentProvider iSharedCommentStickerComponentProvider = (ISharedCommentStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ISharedCommentStickerComponentProvider.class, false, false, false, 14, null);
        if (iSharedCommentStickerComponentProvider != null && (clsLIZ3 = iSharedCommentStickerComponentProvider.LIZ()) != null) {
            C19607811nY c19607811nY25 = this.LIZIZ;
            if (c19607811nY25 == null) {
                c19607811nY25 = null;
            }
            c19607811nY25.LIZ(EnumC1466150oFx.SHARED_COMMENT.getType(), clsLIZ3);
        }
        if (C0BWN.LIZ() && (iSecretRepliesStickerComponentProvider = (ISecretRepliesStickerComponentProvider) PluggableExtentionKt.pluggableSpi$default(ISecretRepliesStickerComponentProvider.class, false, false, false, 14, null)) != null) {
            Class<? extends AbstractC19589811ke<?>> clsLIZ6 = iSecretRepliesStickerComponentProvider.LIZ();
            if (clsLIZ6 != null) {
                C19607811nY c19607811nY26 = this.LIZIZ;
                if (c19607811nY26 == null) {
                    c19607811nY26 = null;
                }
                c19607811nY26.LIZ(EnumC1466150oFx.SECRET_REPLIES.getType(), clsLIZ6);
            }
            Class<? extends AbstractC19589811ke<?>> clsLIZLLL = iSecretRepliesStickerComponentProvider.LIZLLL();
            if (clsLIZLLL != null) {
                C19607811nY c19607811nY27 = this.LIZIZ;
                if (c19607811nY27 == null) {
                    c19607811nY27 = null;
                }
                c19607811nY27.LIZ(EnumC1466150oFx.SECRET_REPLIES_RESPONSE.getType(), clsLIZLLL);
            }
        }
        ISocialAvatarStickerCoreService iSocialAvatarStickerCoreService = (ISocialAvatarStickerCoreService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStickerCoreService.class, false, false, false, 14, null);
        if (iSocialAvatarStickerCoreService != null && (clsLIZJ = iSocialAvatarStickerCoreService.LIZJ()) != null) {
            C19607811nY c19607811nY28 = this.LIZIZ;
            if (c19607811nY28 == null) {
                c19607811nY28 = null;
            }
            c19607811nY28.LIZ(EnumC1466150oFx.SOCIAL_AVATAR.getType(), clsLIZJ);
        }
        ILiveEventStoryStickerService iLiveEventStoryStickerService = (ILiveEventStoryStickerService) PluggableExtentionKt.pluggableSpi$default(ILiveEventStoryStickerService.class, false, false, false, 14, null);
        if (iLiveEventStoryStickerService != null && (clsLIZ2 = iLiveEventStoryStickerService.LIZ()) != null) {
            C19607811nY c19607811nY29 = this.LIZIZ;
            if (c19607811nY29 == null) {
                c19607811nY29 = null;
            }
            c19607811nY29.LIZ(EnumC1466150oFx.LIVE_EVENT_STORY.getType(), clsLIZ2);
        }
        IGroupChatStickerApi iGroupChatStickerApi = (IGroupChatStickerApi) PluggableExtentionKt.pluggableSpi$default(IGroupChatStickerApi.class, false, false, false, 14, null);
        if (iGroupChatStickerApi != null && (clsLJI = iGroupChatStickerApi.LJI()) != null) {
            C19607811nY c19607811nY30 = this.LIZIZ;
            if (c19607811nY30 == null) {
                c19607811nY30 = null;
            }
            c19607811nY30.LIZ(EnumC1466150oFx.DM_GROUP_CHAT.getType(), clsLJI);
        }
        IArticleStickerComponentService.LIZ.getClass();
        IArticleStickerComponentService value = C19607911nZ.LIZIZ.getValue();
        if (value != null && (clsLIZ = value.LIZ()) != null) {
            C19607811nY c19607811nY31 = this.LIZIZ;
            if (c19607811nY31 == null) {
                c19607811nY31 = null;
            }
            c19607811nY31.LIZ(EnumC1466150oFx.ARTICLE.getType(), clsLIZ);
        }
        ITextToImageService iTextToImageService = (ITextToImageService) PluggableExtentionKt.pluggableSpi$default(ITextToImageService.class, false, false, false, 14, null);
        if (iTextToImageService != null && (clsLJJI = iTextToImageService.LJJI()) != null) {
            C19607811nY c19607811nY32 = this.LIZIZ;
            if (c19607811nY32 != null) {
                c19607811nY3 = c19607811nY32;
            }
            c19607811nY3.LIZ(EnumC1466150oFx.TEXT_IMAGE_COMMENT.getType(), clsLJJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    @Override // X.C0RFT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.util.List<? extends com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct> r19, java.util.List<? extends com.ss.android.ugc.aweme.tools.sticker.core.StickerModel> r20, X.C705930RmZ r21, com.ss.android.ugc.aweme.feed.model.Aweme r22) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19607711nX.LIZLLL(java.util.List, java.util.List, X.0RmZ, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
