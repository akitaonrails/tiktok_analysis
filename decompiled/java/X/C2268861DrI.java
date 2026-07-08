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

/* JADX INFO: renamed from: X.1DrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2268861DrI extends Message<C2268861DrI, C2268881DrK> {
    public static final ProtoAdapter<C2268861DrI> ADAPTER = new ProtoAdapter<C2268861DrI>() { // from class: X.1DrH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2268861DrI decode(ProtoReader protoReader) {
            C2268861DrI c2268861DrI = new C2268861DrI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2268861DrI.paid_video_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2268861DrI.max_timestamp = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2268861DrI.is_completed = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2268861DrI.aweme = C5186020i.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2268861DrI.is_intro = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c2268861DrI.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c2268861DrI.moderation_info = C1C06.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c2268861DrI.is_completed_bool = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2268861DrI.last_watch_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2268861DrI.is_reported = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2268861DrI.video_duration = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2268861DrI.seq_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        case 14:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 15:
                            c2268861DrI.full_paid_videos_for_partial_preview = C5186020i.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c2268861DrI.is_last_watched = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c2268861DrI.video_views = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c2268861DrI.is_safety_selected = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2268861DrI;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2268861DrI c2268861DrI) {
            C2268861DrI c2268861DrI2 = c2268861DrI;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2268861DrI2.paid_video_id) + protoAdapter.encodedSizeWithTag(2, c2268861DrI2.max_timestamp) + protoAdapter.encodedSizeWithTag(3, c2268861DrI2.is_completed);
            ProtoAdapter<C5186020i> protoAdapter2 = C5186020i.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c2268861DrI2.aweme);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c2268861DrI2.is_intro) + ProtoAdapter.INT32.encodedSizeWithTag(6, c2268861DrI2.status) + C1C06.ADAPTER.encodedSizeWithTag(7, c2268861DrI2.moderation_info) + protoAdapter3.encodedSizeWithTag(8, c2268861DrI2.is_completed_bool) + protoAdapter.encodedSizeWithTag(9, c2268861DrI2.last_watch_time) + protoAdapter3.encodedSizeWithTag(10, c2268861DrI2.is_reported) + protoAdapter.encodedSizeWithTag(11, c2268861DrI2.video_duration) + protoAdapter.encodedSizeWithTag(12, c2268861DrI2.seq_id) + protoAdapter2.encodedSizeWithTag(15, c2268861DrI2.full_paid_videos_for_partial_preview) + protoAdapter3.encodedSizeWithTag(16, c2268861DrI2.is_last_watched) + protoAdapter.encodedSizeWithTag(17, c2268861DrI2.video_views) + protoAdapter3.encodedSizeWithTag(18, c2268861DrI2.is_safety_selected) + c2268861DrI2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2268861DrI c2268861DrI) {
            C2268861DrI c2268861DrI2 = c2268861DrI;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2268861DrI2.paid_video_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2268861DrI2.max_timestamp);
            protoAdapter.encodeWithTag(protoWriter, 3, c2268861DrI2.is_completed);
            ProtoAdapter<C5186020i> protoAdapter2 = C5186020i.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 4, c2268861DrI2.aweme);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 5, c2268861DrI2.is_intro);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, c2268861DrI2.status);
            C1C06.ADAPTER.encodeWithTag(protoWriter, 7, c2268861DrI2.moderation_info);
            protoAdapter3.encodeWithTag(protoWriter, 8, c2268861DrI2.is_completed_bool);
            protoAdapter.encodeWithTag(protoWriter, 9, c2268861DrI2.last_watch_time);
            protoAdapter3.encodeWithTag(protoWriter, 10, c2268861DrI2.is_reported);
            protoAdapter.encodeWithTag(protoWriter, 11, c2268861DrI2.video_duration);
            protoAdapter.encodeWithTag(protoWriter, 12, c2268861DrI2.seq_id);
            protoAdapter2.encodeWithTag(protoWriter, 15, c2268861DrI2.full_paid_videos_for_partial_preview);
            protoAdapter3.encodeWithTag(protoWriter, 16, c2268861DrI2.is_last_watched);
            protoAdapter.encodeWithTag(protoWriter, 17, c2268861DrI2.video_views);
            protoAdapter3.encodeWithTag(protoWriter, 18, c2268861DrI2.is_safety_selected);
            protoWriter.writeBytes(c2268861DrI2.unknownFields());
        }
    };
    public C5186020i aweme;
    public C5186020i full_paid_videos_for_partial_preview;
    public Long is_completed;
    public Boolean is_completed_bool;
    public Boolean is_intro;
    public Boolean is_last_watched;
    public Boolean is_reported;
    public Boolean is_safety_selected;
    public Long last_watch_time;
    public Long max_timestamp;
    public C1C06 moderation_info;
    public Long paid_video_id;
    public Long seq_id;
    public Integer status;
    public Long video_duration;
    public Long video_views;

    public C2268861DrI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2268881DrK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
