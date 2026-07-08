package X;

import android.content.Context;
import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerSubType;
import com.ss.android.ugc.aweme.im.common.model.VideoSticker;
import com.ss.android.ugc.aweme.im.message.content.BaseHeader;
import com.ss.android.ugc.aweme.im.message.content.FeatureAttachmentContent;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.PreshownStickerItem;
import java.util.Map;
import kotlin.Pair;
import okio.ByteString;

/* JADX INFO: renamed from: X.0HsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454680HsI implements InterfaceC454710HsL {
    public static final C454680HsI LIZ = new C454680HsI();

    @Override // X.InterfaceC454710HsL
    public final void LIZ(StickerItem stickerItem) {
    }

    @Override // X.InterfaceC454710HsL
    public final C454740HsO LIZIZ(StickerTemplate stickerTemplate) {
        return null;
    }

    @Override // X.InterfaceC454710HsL
    public final void LIZJ(Context context, C0YTK c0ytk, ReferenceInfo referenceInfo, InterfaceC454700HsK interfaceC454700HsK, StickerItem stickerItem, C441010HRb c441010HRb, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, String str, Map map, Map map2, ByteString byteString, boolean z) {
    }

    @Override // X.InterfaceC454710HsL
    public final void LJ(C19EG c19eg, StickerItem stickerItem, String str, Integer num, String str2) {
    }

    @Override // X.InterfaceC454710HsL
    public final UrlModel LJI(UrlModel urlModel, String str) {
        return urlModel;
    }

    @Override // X.InterfaceC454710HsL
    public final void LJII(Context context, C0YTK c0ytk, ReferenceInfo referenceInfo, InterfaceC454700HsK interfaceC454700HsK, SetSticker setSticker, AttachmentComponent attachmentComponent, BaseHeaderComponent baseHeaderComponent, String str, Map map, Map map2, ByteString byteString, boolean z) {
    }

    @Override // X.InterfaceC454710HsL
    public final String LJIIIIZZ(PreshownStickerItem preshownStickerItem) {
        return null;
    }

    @Override // X.InterfaceC454710HsL
    public final void LJIIIZ(C869590Y9l c869590Y9l) {
    }

    @Override // X.InterfaceC454710HsL
    public final void LJIIJ(String str) {
    }

    @Override // X.InterfaceC454710HsL
    public final void LJIIJJI(BusinessCommandMessage businessCommandMessage) {
    }

    @Override // X.InterfaceC454710HsL
    public final boolean LJIIL(StickerTemplate stickerTemplate) {
        return false;
    }

    @Override // X.InterfaceC454710HsL
    public final void LJIILIIL(C451030HmP c451030HmP, String str, C1867907Th c1867907Th, String str2, Map map, Map map2, ByteString byteString, C0YTK c0ytk, QuoteMode quoteMode, FeatureAttachmentContent featureAttachmentContent, BaseHeader baseHeader) {
    }

    @Override // X.InterfaceC454710HsL
    public final long LJIILJJIL() {
        return -1L;
    }

    @Override // X.InterfaceC454710HsL
    public final void LJIILLIIL(VideoSticker videoSticker, String str, InterfaceC454700HsK interfaceC454700HsK, Map<String, String> map, Map<String, String> map2, ByteString byteString, C0YTK c0ytk, Context context, QuoteMode quoteMode, BaseHeaderComponent baseHeaderComponent) {
    }

    @Override // X.InterfaceC454710HsL
    public final Long LJIJ(StickerTemplate stickerTemplate) {
        return null;
    }

    @Override // X.InterfaceC454710HsL
    public final void LJIJJ(PreshownStickerItem preshownStickerItem, String str, Map map, Context context, ReferenceInfo referenceInfo) {
    }

    @Override // X.InterfaceC454710HsL
    public final Map LJIIZILJ(StickerItem stickerItem) {
        return new C13DA().build();
    }

    @Override // X.InterfaceC454710HsL
    public final Map<String, String> LJIJI(SetSticker setSticker, AttachmentComponent attachmentComponent) {
        String string;
        String string2;
        String string3;
        Integer numValueOf;
        String string4;
        Pair[] pairArr = new Pair[9];
        Long stickerId = setSticker.getStickerId();
        String str = "";
        if (stickerId == null || (string = stickerId.toString()) == null) {
            string = "";
        }
        pairArr[0] = new Pair("a:sticker_id", string);
        Long setId = setSticker.getSetId();
        if (setId == null || (string2 = setId.toString()) == null) {
            string2 = "";
        }
        pairArr[1] = new Pair("a:sticker_set_id", string2);
        Long authorUid = setSticker.getAuthorUid();
        if (authorUid == null || (string3 = authorUid.toString()) == null) {
            string3 = "";
        }
        pairArr[2] = new Pair("a:sticker_creator_user_id", string3);
        Integer stickerType = setSticker.getStickerType();
        if (stickerType != null && (string4 = stickerType.toString()) != null) {
            str = string4;
        }
        pairArr[3] = new Pair("a:sticker_type", str);
        pairArr[4] = new Pair("sender_preview", "avatars_in_dm_notif_sender_side");
        pairArr[5] = new Pair("receiver_preview", "avatars_in_dm_notif_recipient_side");
        pairArr[6] = new Pair("quote_preview", "im_big_emoji_msg_hint");
        StickerSubType stickerSubType = setSticker.getStickerSubType();
        if (stickerSubType != null) {
            numValueOf = Integer.valueOf(stickerSubType.ordinal());
        } else {
            numValueOf = null;
        }
        pairArr[7] = new Pair("a:sticker_sub_type", String.valueOf(numValueOf));
        pairArr[8] = new Pair("a:tier_id", String.valueOf(setSticker.getTierId()));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    @Override // X.InterfaceC454710HsL
    public final Map<String, String> LIZLLL(Integer num, Long l, Long l2) {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC454710HsL
    public final Map<String, String> LJIILL(VideoSticker videoSticker, String str, String str2) {
        String string;
        String string2;
        String string3;
        String string4;
        Pair[] pairArr = new Pair[9];
        Long videoStickerId = videoSticker.getVideoStickerId();
        if (videoStickerId == null || (string = videoStickerId.toString()) == null) {
            string = "";
        }
        pairArr[0] = new Pair("a:sticker_id", string);
        Long originVideoId = videoSticker.getOriginVideoId();
        if (originVideoId == null || (string2 = originVideoId.toString()) == null) {
            string2 = "";
        }
        pairArr[1] = new Pair("a:origin_video_id", string2);
        Integer stickerType = videoSticker.getStickerType();
        if (stickerType == null || (string3 = stickerType.toString()) == null) {
            string3 = "";
        }
        pairArr[2] = new Pair("a:sticker_type", string3);
        Long creatorUid = videoSticker.getCreatorUid();
        if (creatorUid == null || (string4 = creatorUid.toString()) == null) {
            string4 = "";
        }
        pairArr[3] = new Pair("a:sticker_creator_user_id", string4);
        if (str == null) {
            str = "";
        }
        pairArr[4] = new Pair("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[5] = new Pair("enter_method", str2);
        pairArr[6] = new Pair("sender_preview", "avatars_in_dm_notif_sender_side");
        pairArr[7] = new Pair("receiver_preview", "avatars_in_dm_notif_recipient_side");
        pairArr[8] = new Pair("quote_preview", "im_big_emoji_msg_hint");
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b A[PHI: r6
      0x001b: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v4 java.lang.String), (r6v4 java.lang.String), (r6v4 java.lang.String) binds: [B:96:0x013d, B:10:0x0011, B:12:0x0015, B:14:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0139 A[PHI: r1
      0x0139: PHI (r1v1 int) = (r1v0 int), (r1v15 int), (r1v15 int), (r1v15 int) binds: [B:92:0x0135, B:26:0x0034, B:28:0x0038, B:30:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC454710HsL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate LJFF(com.ss.android.ugc.aweme.im.common.model.StickerItem r21, android.content.Context r22, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent r23, java.lang.String r24, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent r25) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454680HsI.LJFF(com.ss.android.ugc.aweme.im.common.model.StickerItem, android.content.Context, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent, java.lang.String, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent):com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0085  */
    @Override // X.InterfaceC454710HsL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate LJIJJLI(com.ss.android.ugc.aweme.im.common.model.SetSticker r22, android.content.Context r23, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent r24, java.lang.String r25, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent r26) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454680HsI.LJIJJLI(com.ss.android.ugc.aweme.im.common.model.SetSticker, android.content.Context, com.ss.android.ugc.aweme.im.message.template.component.AttachmentComponent, java.lang.String, com.ss.android.ugc.aweme.im.message.template.component.BaseHeaderComponent):com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate");
    }
}
