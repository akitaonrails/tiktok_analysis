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

/* JADX INFO: renamed from: X.025U, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C025U extends Message<C025U, C574402Lu> {
    public static final ProtoAdapter<C025U> ADAPTER = new ProtoAdapter<C025U>() { // from class: X.022e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C025U decode(ProtoReader protoReader) {
            C025U c025u = new C025U();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c025u.url_list = C02WH.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c025u.encoded_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c025u.media_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c025u.logo_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c025u.definition = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c025u.quality = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c025u.quality_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c025u.format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c025u.width = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c025u.height = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c025u.bitrate = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c025u.codec_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c025u.size = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c025u.fps = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            c025u.file_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c025u.file_hash = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c025u.sub_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c025u.bandwidth = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 19:
                            c025u.fid_profile_labels = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c025u;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C025U c025u) {
            C025U c025u2 = c025u;
            int iEncodedSizeWithTag = C02WH.ADAPTER.encodedSizeWithTag(1, c025u2.url_list);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c025u2.encoded_type) + protoAdapter.encodedSizeWithTag(3, c025u2.media_type) + protoAdapter.encodedSizeWithTag(4, c025u2.logo_type) + protoAdapter.encodedSizeWithTag(5, c025u2.definition) + protoAdapter.encodedSizeWithTag(6, c025u2.quality) + protoAdapter.encodedSizeWithTag(7, c025u2.quality_desc) + protoAdapter.encodedSizeWithTag(8, c025u2.format);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(9, c025u2.width) + protoAdapter2.encodedSizeWithTag(10, c025u2.height) + protoAdapter2.encodedSizeWithTag(11, c025u2.bitrate) + protoAdapter.encodedSizeWithTag(12, c025u2.codec_type) + protoAdapter2.encodedSizeWithTag(13, c025u2.size) + protoAdapter2.encodedSizeWithTag(14, c025u2.fps) + protoAdapter.encodedSizeWithTag(15, c025u2.file_id) + protoAdapter.encodedSizeWithTag(16, c025u2.file_hash) + protoAdapter.encodedSizeWithTag(17, c025u2.sub_info) + protoAdapter2.encodedSizeWithTag(18, c025u2.bandwidth) + protoAdapter.encodedSizeWithTag(19, c025u2.fid_profile_labels) + c025u2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C025U c025u) {
            C025U c025u2 = c025u;
            C02WH.ADAPTER.encodeWithTag(protoWriter, 1, c025u2.url_list);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c025u2.encoded_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c025u2.media_type);
            protoAdapter.encodeWithTag(protoWriter, 4, c025u2.logo_type);
            protoAdapter.encodeWithTag(protoWriter, 5, c025u2.definition);
            protoAdapter.encodeWithTag(protoWriter, 6, c025u2.quality);
            protoAdapter.encodeWithTag(protoWriter, 7, c025u2.quality_desc);
            protoAdapter.encodeWithTag(protoWriter, 8, c025u2.format);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 9, c025u2.width);
            protoAdapter2.encodeWithTag(protoWriter, 10, c025u2.height);
            protoAdapter2.encodeWithTag(protoWriter, 11, c025u2.bitrate);
            protoAdapter.encodeWithTag(protoWriter, 12, c025u2.codec_type);
            protoAdapter2.encodeWithTag(protoWriter, 13, c025u2.size);
            protoAdapter2.encodeWithTag(protoWriter, 14, c025u2.fps);
            protoAdapter.encodeWithTag(protoWriter, 15, c025u2.file_id);
            protoAdapter.encodeWithTag(protoWriter, 16, c025u2.file_hash);
            protoAdapter.encodeWithTag(protoWriter, 17, c025u2.sub_info);
            protoAdapter2.encodeWithTag(protoWriter, 18, c025u2.bandwidth);
            protoAdapter.encodeWithTag(protoWriter, 19, c025u2.fid_profile_labels);
            protoWriter.writeBytes(c025u2.unknownFields());
        }
    };
    public Long bandwidth;
    public Long bitrate;
    public String codec_type;
    public String definition;
    public String encoded_type;
    public String fid_profile_labels;
    public String file_hash;
    public String file_id;
    public String format;
    public Long fps;
    public Long height;
    public String logo_type;
    public String media_type;
    public String quality;
    public String quality_desc;
    public Long size;
    public String sub_info;
    public C02WH url_list;
    public Long width;

    public C025U() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C574402Lu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
