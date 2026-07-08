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

/* JADX INFO: renamed from: X.02Zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C610802Zu extends Message<C610802Zu, C610902Zv> {
    public static final ProtoAdapter<C610802Zu> ADAPTER = new ProtoAdapter<C610802Zu>() { // from class: X.02Zt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C610802Zu decode(ProtoReader protoReader) {
            C610802Zu c610802Zu = new C610802Zu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c610802Zu.tts_voice_info = C634802dm.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c610802Zu.vc_filter_info = C716802r0.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c610802Zu.im_info = C588702Rh.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c610802Zu.sub_only_video = C02ZK.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c610802Zu.add_yours_recommendation_info = C713802qW.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c610802Zu.game_partnership = C02DE.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c610802Zu.ba_info = C2223271Bzx.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c610802Zu.creator_analytics = C02RD.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c610802Zu.e_commerce = C655002h2.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c610802Zu.tako = C610402Zq.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c610802Zu.map_info = C739602ug.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c610802Zu.live_info = C672802ju.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c610802Zu.cm_preview_info = C02CD.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c610802Zu.local_alliance_info = C605602Xu.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c610802Zu.declaration_info = C1C2T.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c610802Zu.lemon_info = C735302tz.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c610802Zu.music_edit_info = C726402sY.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c610802Zu.ai_comment_photo = C669902jR.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c610802Zu.interest = C605202Xq.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c610802Zu.ai_music_task_struct = C725502sP.ADAPTER.decode(protoReader);
                            break;
                        case 21:
                            c610802Zu.ai_chat_meta = C738702uX.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c610802Zu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C610802Zu c610802Zu) {
            C610802Zu c610802Zu2 = c610802Zu;
            return C634802dm.ADAPTER.encodedSizeWithTag(1, c610802Zu2.tts_voice_info) + C716802r0.ADAPTER.encodedSizeWithTag(2, c610802Zu2.vc_filter_info) + C588702Rh.ADAPTER.encodedSizeWithTag(3, c610802Zu2.im_info) + C02ZK.ADAPTER.encodedSizeWithTag(4, c610802Zu2.sub_only_video) + C713802qW.ADAPTER.encodedSizeWithTag(5, c610802Zu2.add_yours_recommendation_info) + C02DE.ADAPTER.encodedSizeWithTag(6, c610802Zu2.game_partnership) + C2223271Bzx.ADAPTER.encodedSizeWithTag(7, c610802Zu2.ba_info) + C02RD.ADAPTER.encodedSizeWithTag(8, c610802Zu2.creator_analytics) + C655002h2.ADAPTER.encodedSizeWithTag(9, c610802Zu2.e_commerce) + C610402Zq.ADAPTER.encodedSizeWithTag(10, c610802Zu2.tako) + C739602ug.ADAPTER.encodedSizeWithTag(11, c610802Zu2.map_info) + C672802ju.ADAPTER.encodedSizeWithTag(12, c610802Zu2.live_info) + C02CD.ADAPTER.encodedSizeWithTag(13, c610802Zu2.cm_preview_info) + C605602Xu.ADAPTER.encodedSizeWithTag(14, c610802Zu2.local_alliance_info) + C1C2T.ADAPTER.encodedSizeWithTag(15, c610802Zu2.declaration_info) + C735302tz.ADAPTER.encodedSizeWithTag(16, c610802Zu2.lemon_info) + C726402sY.ADAPTER.encodedSizeWithTag(17, c610802Zu2.music_edit_info) + C669902jR.ADAPTER.encodedSizeWithTag(18, c610802Zu2.ai_comment_photo) + C605202Xq.ADAPTER.encodedSizeWithTag(19, c610802Zu2.interest) + C725502sP.ADAPTER.encodedSizeWithTag(20, c610802Zu2.ai_music_task_struct) + C738702uX.ADAPTER.encodedSizeWithTag(21, c610802Zu2.ai_chat_meta) + c610802Zu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C610802Zu c610802Zu) {
            C610802Zu c610802Zu2 = c610802Zu;
            C634802dm.ADAPTER.encodeWithTag(protoWriter, 1, c610802Zu2.tts_voice_info);
            C716802r0.ADAPTER.encodeWithTag(protoWriter, 2, c610802Zu2.vc_filter_info);
            C588702Rh.ADAPTER.encodeWithTag(protoWriter, 3, c610802Zu2.im_info);
            C02ZK.ADAPTER.encodeWithTag(protoWriter, 4, c610802Zu2.sub_only_video);
            C713802qW.ADAPTER.encodeWithTag(protoWriter, 5, c610802Zu2.add_yours_recommendation_info);
            C02DE.ADAPTER.encodeWithTag(protoWriter, 6, c610802Zu2.game_partnership);
            C2223271Bzx.ADAPTER.encodeWithTag(protoWriter, 7, c610802Zu2.ba_info);
            C02RD.ADAPTER.encodeWithTag(protoWriter, 8, c610802Zu2.creator_analytics);
            C655002h2.ADAPTER.encodeWithTag(protoWriter, 9, c610802Zu2.e_commerce);
            C610402Zq.ADAPTER.encodeWithTag(protoWriter, 10, c610802Zu2.tako);
            C739602ug.ADAPTER.encodeWithTag(protoWriter, 11, c610802Zu2.map_info);
            C672802ju.ADAPTER.encodeWithTag(protoWriter, 12, c610802Zu2.live_info);
            C02CD.ADAPTER.encodeWithTag(protoWriter, 13, c610802Zu2.cm_preview_info);
            C605602Xu.ADAPTER.encodeWithTag(protoWriter, 14, c610802Zu2.local_alliance_info);
            C1C2T.ADAPTER.encodeWithTag(protoWriter, 15, c610802Zu2.declaration_info);
            C735302tz.ADAPTER.encodeWithTag(protoWriter, 16, c610802Zu2.lemon_info);
            C726402sY.ADAPTER.encodeWithTag(protoWriter, 17, c610802Zu2.music_edit_info);
            C669902jR.ADAPTER.encodeWithTag(protoWriter, 18, c610802Zu2.ai_comment_photo);
            C605202Xq.ADAPTER.encodeWithTag(protoWriter, 19, c610802Zu2.interest);
            C725502sP.ADAPTER.encodeWithTag(protoWriter, 20, c610802Zu2.ai_music_task_struct);
            C738702uX.ADAPTER.encodeWithTag(protoWriter, 21, c610802Zu2.ai_chat_meta);
            protoWriter.writeBytes(c610802Zu2.unknownFields());
        }
    };
    public C713802qW add_yours_recommendation_info;
    public C738702uX ai_chat_meta;
    public C669902jR ai_comment_photo;
    public C725502sP ai_music_task_struct;
    public C2223271Bzx ba_info;
    public C02CD cm_preview_info;
    public C02RD creator_analytics;
    public C1C2T declaration_info;
    public C655002h2 e_commerce;
    public C02DE game_partnership;
    public C588702Rh im_info;
    public C605202Xq interest;
    public C735302tz lemon_info;
    public C672802ju live_info;
    public C605602Xu local_alliance_info;
    public C739602ug map_info;
    public C726402sY music_edit_info;
    public C02ZK sub_only_video;
    public C610402Zq tako;
    public C634802dm tts_voice_info;
    public C716802r0 vc_filter_info;

    public C610802Zu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C610902Zv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
