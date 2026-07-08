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

/* JADX INFO: renamed from: X.025O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C025O extends Message<C025O, C564302Hx> {
    public static final ProtoAdapter<C025O> ADAPTER = new ProtoAdapter<C025O>() { // from class: X.022d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C025O decode(ProtoReader protoReader) {
            C025O c025o = new C025O();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c025o.id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c025o.type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c025o.sub_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c025o.keyword = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c025o.url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c025o.icon = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c025o.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c025o.start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c025o.end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c025o.priority = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c025o.exposures = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c025o.language = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c025o.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c025o.deep_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c025o.universal_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c025o.log_extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c025o.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c025o.thumbnail = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c025o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C025O c025o) {
            C025O c025o2 = c025o;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c025o2.id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c025o2.type) + protoAdapter2.encodedSizeWithTag(3, c025o2.sub_type) + protoAdapter2.encodedSizeWithTag(4, c025o2.keyword) + protoAdapter2.encodedSizeWithTag(5, c025o2.url);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c025o2.icon) + protoAdapter2.encodedSizeWithTag(7, c025o2.schema) + protoAdapter.encodedSizeWithTag(8, c025o2.start_time) + protoAdapter.encodedSizeWithTag(9, c025o2.end_time) + protoAdapter.encodedSizeWithTag(10, c025o2.priority) + protoAdapter.encodedSizeWithTag(11, c025o2.exposures) + protoAdapter2.encodedSizeWithTag(12, c025o2.language) + protoAdapter2.encodedSizeWithTag(13, c025o2.extra) + protoAdapter2.encodedSizeWithTag(14, c025o2.deep_link) + protoAdapter2.encodedSizeWithTag(15, c025o2.universal_link) + protoAdapter2.encodedSizeWithTag(16, c025o2.log_extra) + protoAdapter2.encodedSizeWithTag(17, c025o2.description) + protoAdapter3.encodedSizeWithTag(18, c025o2.thumbnail) + c025o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C025O c025o) {
            C025O c025o2 = c025o;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c025o2.id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c025o2.type);
            protoAdapter2.encodeWithTag(protoWriter, 3, c025o2.sub_type);
            protoAdapter2.encodeWithTag(protoWriter, 4, c025o2.keyword);
            protoAdapter2.encodeWithTag(protoWriter, 5, c025o2.url);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 6, c025o2.icon);
            protoAdapter2.encodeWithTag(protoWriter, 7, c025o2.schema);
            protoAdapter.encodeWithTag(protoWriter, 8, c025o2.start_time);
            protoAdapter.encodeWithTag(protoWriter, 9, c025o2.end_time);
            protoAdapter.encodeWithTag(protoWriter, 10, c025o2.priority);
            protoAdapter.encodeWithTag(protoWriter, 11, c025o2.exposures);
            protoAdapter2.encodeWithTag(protoWriter, 12, c025o2.language);
            protoAdapter2.encodeWithTag(protoWriter, 13, c025o2.extra);
            protoAdapter2.encodeWithTag(protoWriter, 14, c025o2.deep_link);
            protoAdapter2.encodeWithTag(protoWriter, 15, c025o2.universal_link);
            protoAdapter2.encodeWithTag(protoWriter, 16, c025o2.log_extra);
            protoAdapter2.encodeWithTag(protoWriter, 17, c025o2.description);
            protoAdapter3.encodeWithTag(protoWriter, 18, c025o2.thumbnail);
            protoWriter.writeBytes(c025o2.unknownFields());
        }
    };
    public String deep_link;
    public String description;
    public Long end_time;
    public Long exposures;
    public String extra;
    public C673002jw icon;
    public Long id;
    public String keyword;
    public String language;
    public String log_extra;
    public Long priority;
    public String schema;
    public Long start_time;
    public String sub_type;
    public C673002jw thumbnail;
    public String type;
    public String universal_link;
    public String url;

    public C025O() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C564302Hx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
