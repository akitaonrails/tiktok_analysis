package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.021v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5225021v extends Message<C5225021v, C566002Io> {
    public static final ProtoAdapter<C5225021v> ADAPTER = new ProtoAdapter<C5225021v>() { // from class: X.021R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5225021v decode(ProtoReader protoReader) {
            C5225021v c5225021v = new C5225021v();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5225021v.poi_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5225021v.poi_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5225021v.poi_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5225021v.info_source = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5225021v.collect_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5225021v.poi_mapkit_collect = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c5225021v.video_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c5225021v.address_info = C659202hi.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5225021v.video_anchor = C022F.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5225021v.comment_anchor = C022F.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5225021v.nearby_tag = C674302k9.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5225021v.poi_review_config = C713202qQ.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 14:
                            c5225021v.poi_claim_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            c5225021v.icon = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c5225021v.thumbnail = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5225021v.type_level = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5225021v.video_tag = C633602da.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c5225021v.anchor_subject_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5225021v.product_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 21:
                            c5225021v.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c5225021v.anchor_pass_through_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c5225021v.poi_request_extra_params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5225021v;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5225021v c5225021v) {
            C5225021v c5225021v2 = c5225021v;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5225021v2.poi_name) + protoAdapter.encodedSizeWithTag(2, c5225021v2.poi_id) + protoAdapter.encodedSizeWithTag(3, c5225021v2.poi_type) + protoAdapter.encodedSizeWithTag(4, c5225021v2.info_source) + protoAdapter.encodedSizeWithTag(5, c5225021v2.collect_info) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c5225021v2.poi_mapkit_collect) + ProtoAdapter.INT64.encodedSizeWithTag(7, c5225021v2.video_count) + C659202hi.ADAPTER.encodedSizeWithTag(8, c5225021v2.address_info);
            ProtoAdapter<C022F> protoAdapter2 = C022F.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(9, c5225021v2.video_anchor) + protoAdapter2.encodedSizeWithTag(10, c5225021v2.comment_anchor) + C674302k9.ADAPTER.encodedSizeWithTag(11, c5225021v2.nearby_tag) + C713202qQ.ADAPTER.encodedSizeWithTag(12, c5225021v2.poi_review_config);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(14, c5225021v2.poi_claim_status);
            ProtoAdapter<C673002jw> protoAdapter4 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(15, c5225021v2.icon) + protoAdapter4.encodedSizeWithTag(16, c5225021v2.thumbnail) + protoAdapter.encodedSizeWithTag(17, c5225021v2.type_level) + C633602da.ADAPTER.encodedSizeWithTag(18, c5225021v2.video_tag) + protoAdapter3.encodedSizeWithTag(19, c5225021v2.anchor_subject_type) + protoAdapter.asRepeated().encodedSizeWithTag(20, c5225021v2.product_ids) + protoAdapter.encodedSizeWithTag(21, c5225021v2.extra) + protoAdapter.encodedSizeWithTag(22, c5225021v2.anchor_pass_through_info) + protoAdapter.encodedSizeWithTag(23, c5225021v2.poi_request_extra_params) + c5225021v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5225021v c5225021v) {
            C5225021v c5225021v2 = c5225021v;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5225021v2.poi_name);
            protoAdapter.encodeWithTag(protoWriter, 2, c5225021v2.poi_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c5225021v2.poi_type);
            protoAdapter.encodeWithTag(protoWriter, 4, c5225021v2.info_source);
            protoAdapter.encodeWithTag(protoWriter, 5, c5225021v2.collect_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c5225021v2.poi_mapkit_collect);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, c5225021v2.video_count);
            C659202hi.ADAPTER.encodeWithTag(protoWriter, 8, c5225021v2.address_info);
            ProtoAdapter<C022F> protoAdapter2 = C022F.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 9, c5225021v2.video_anchor);
            protoAdapter2.encodeWithTag(protoWriter, 10, c5225021v2.comment_anchor);
            C674302k9.ADAPTER.encodeWithTag(protoWriter, 11, c5225021v2.nearby_tag);
            C713202qQ.ADAPTER.encodeWithTag(protoWriter, 12, c5225021v2.poi_review_config);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 14, c5225021v2.poi_claim_status);
            ProtoAdapter<C673002jw> protoAdapter4 = C673002jw.ADAPTER;
            protoAdapter4.encodeWithTag(protoWriter, 15, c5225021v2.icon);
            protoAdapter4.encodeWithTag(protoWriter, 16, c5225021v2.thumbnail);
            protoAdapter.encodeWithTag(protoWriter, 17, c5225021v2.type_level);
            C633602da.ADAPTER.encodeWithTag(protoWriter, 18, c5225021v2.video_tag);
            protoAdapter3.encodeWithTag(protoWriter, 19, c5225021v2.anchor_subject_type);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 20, c5225021v2.product_ids);
            protoAdapter.encodeWithTag(protoWriter, 21, c5225021v2.extra);
            protoAdapter.encodeWithTag(protoWriter, 22, c5225021v2.anchor_pass_through_info);
            protoAdapter.encodeWithTag(protoWriter, 23, c5225021v2.poi_request_extra_params);
            protoWriter.writeBytes(c5225021v2.unknownFields());
        }
    };
    public C659202hi address_info;
    public String anchor_pass_through_info;
    public Integer anchor_subject_type;
    public String collect_info;
    public C022F comment_anchor;
    public String extra;
    public C673002jw icon;
    public String info_source;
    public C674302k9 nearby_tag;
    public Integer poi_claim_status;
    public String poi_id;
    public Boolean poi_mapkit_collect;
    public String poi_name;
    public String poi_request_extra_params;
    public C713202qQ poi_review_config;
    public String poi_type;
    public List<String> product_ids;
    public C673002jw thumbnail;
    public String type_level;
    public C022F video_anchor;
    public Long video_count;
    public C633602da video_tag;

    public C5225021v() {
        super(ADAPTER, ByteString.EMPTY);
        this.product_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C566002Io newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
