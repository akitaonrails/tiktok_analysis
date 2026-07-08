package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.024B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C024B extends Message<C024B, C566602Iu> {
    public static final ProtoAdapter<C024B> ADAPTER = new ProtoAdapter<C024B>() { // from class: X.022n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C024B decode(ProtoReader protoReader) {
            C024B c024b = new C024B();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c024b.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c024b.is_delete = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c024b.allow_share = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c024b.allow_comment = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c024b.is_private = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c024b.with_goods = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c024b.private_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c024b.in_reviewing = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c024b.reviewed = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c024b.self_see = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c024b.is_prohibited = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c024b.download_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c024b.dont_share_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            c024b.video_hide_search = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c024b.video_mute = C620802bW.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c024b.is_copyright_violation = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c024b.audio_change_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            c024b.tiktok_music_edit_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c024b.mute_strip_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            c024b.violation_display_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c024b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C024B c024b) {
            C024B c024b2 = c024b;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c024b2.aweme_id);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c024b2.is_delete) + protoAdapter.encodedSizeWithTag(3, c024b2.allow_share) + protoAdapter.encodedSizeWithTag(4, c024b2.allow_comment) + protoAdapter.encodedSizeWithTag(5, c024b2.is_private) + protoAdapter.encodedSizeWithTag(6, c024b2.with_goods);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(7, c024b2.private_status) + protoAdapter.encodedSizeWithTag(9, c024b2.in_reviewing) + protoAdapter2.encodedSizeWithTag(10, c024b2.reviewed) + protoAdapter.encodedSizeWithTag(11, c024b2.self_see) + protoAdapter.encodedSizeWithTag(12, c024b2.is_prohibited) + protoAdapter2.encodedSizeWithTag(13, c024b2.download_status) + protoAdapter2.encodedSizeWithTag(14, c024b2.dont_share_status) + protoAdapter2.encodedSizeWithTag(15, c024b2.video_hide_search) + C620802bW.ADAPTER.encodedSizeWithTag(16, c024b2.video_mute) + protoAdapter.encodedSizeWithTag(17, c024b2.is_copyright_violation) + protoAdapter2.encodedSizeWithTag(18, c024b2.audio_change_status) + protoAdapter2.encodedSizeWithTag(19, c024b2.tiktok_music_edit_status) + protoAdapter2.encodedSizeWithTag(20, c024b2.mute_strip_status) + protoAdapter2.encodedSizeWithTag(21, c024b2.violation_display_status) + c024b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C024B c024b) {
            C024B c024b2 = c024b;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c024b2.aweme_id);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 2, c024b2.is_delete);
            protoAdapter.encodeWithTag(protoWriter, 3, c024b2.allow_share);
            protoAdapter.encodeWithTag(protoWriter, 4, c024b2.allow_comment);
            protoAdapter.encodeWithTag(protoWriter, 5, c024b2.is_private);
            protoAdapter.encodeWithTag(protoWriter, 6, c024b2.with_goods);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 7, c024b2.private_status);
            protoAdapter.encodeWithTag(protoWriter, 9, c024b2.in_reviewing);
            protoAdapter2.encodeWithTag(protoWriter, 10, c024b2.reviewed);
            protoAdapter.encodeWithTag(protoWriter, 11, c024b2.self_see);
            protoAdapter.encodeWithTag(protoWriter, 12, c024b2.is_prohibited);
            protoAdapter2.encodeWithTag(protoWriter, 13, c024b2.download_status);
            protoAdapter2.encodeWithTag(protoWriter, 14, c024b2.dont_share_status);
            protoAdapter2.encodeWithTag(protoWriter, 15, c024b2.video_hide_search);
            C620802bW.ADAPTER.encodeWithTag(protoWriter, 16, c024b2.video_mute);
            protoAdapter.encodeWithTag(protoWriter, 17, c024b2.is_copyright_violation);
            protoAdapter2.encodeWithTag(protoWriter, 18, c024b2.audio_change_status);
            protoAdapter2.encodeWithTag(protoWriter, 19, c024b2.tiktok_music_edit_status);
            protoAdapter2.encodeWithTag(protoWriter, 20, c024b2.mute_strip_status);
            protoAdapter2.encodeWithTag(protoWriter, 21, c024b2.violation_display_status);
            protoWriter.writeBytes(c024b2.unknownFields());
        }
    };
    public Boolean allow_comment;
    public Boolean allow_share;
    public Integer audio_change_status;
    public String aweme_id;
    public Integer dont_share_status;
    public Integer download_status;
    public Boolean in_reviewing;
    public Boolean is_copyright_violation;
    public Boolean is_delete;
    public Boolean is_private;
    public Boolean is_prohibited;
    public Integer mute_strip_status;
    public Integer private_status;
    public Integer reviewed;
    public Boolean self_see;
    public Integer tiktok_music_edit_status;
    public Integer video_hide_search;
    public C620802bW video_mute;
    public Integer violation_display_status;
    public Boolean with_goods;

    public C024B() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C566602Iu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
