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

/* JADX INFO: renamed from: X.02mK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C687802mK extends Message<C687802mK, C687902mL> {
    public static final ProtoAdapter<C687802mK> ADAPTER = new ProtoAdapter<C687802mK>() { // from class: X.02mJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C687802mK decode(ProtoReader protoReader) {
            C687802mK c687802mK = new C687802mK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c687802mK.uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c687802mK.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            c687802mK.width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c687802mK.height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c687802mK.url_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c687802mK.data_size = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c687802mK.file_hash = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c687802mK.invalid = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c687802mK.file_cs = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c687802mK.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c687802mK.url_sub_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c687802mK.md5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c687802mK.player_access_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c687802mK.url_prefix.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            c687802mK.image_media_model = C1C5E.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c687802mK.primary_image_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c687802mK.image_index = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c687802mK.preview = C672202jo.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c687802mK.file_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c687802mK.image_source = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 21:
                            c687802mK.seq = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c687802mK;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C687802mK c687802mK) {
            C687802mK c687802mK2 = c687802mK;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c687802mK2.uri) + protoAdapter.asRepeated().encodedSizeWithTag(2, c687802mK2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c687802mK2.width) + protoAdapter2.encodedSizeWithTag(4, c687802mK2.height) + protoAdapter.encodedSizeWithTag(5, c687802mK2.url_key);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c687802mK2.data_size) + protoAdapter.encodedSizeWithTag(7, c687802mK2.file_hash) + ProtoAdapter.BOOL.encodedSizeWithTag(8, c687802mK2.invalid) + protoAdapter.encodedSizeWithTag(9, c687802mK2.file_cs) + protoAdapter2.encodedSizeWithTag(10, c687802mK2.type) + protoAdapter2.encodedSizeWithTag(11, c687802mK2.url_sub_type) + protoAdapter.encodedSizeWithTag(12, c687802mK2.md5) + protoAdapter.encodedSizeWithTag(13, c687802mK2.player_access_key) + protoAdapter.asRepeated().encodedSizeWithTag(14, c687802mK2.url_prefix) + C1C5E.ADAPTER.encodedSizeWithTag(15, c687802mK2.image_media_model) + protoAdapter2.encodedSizeWithTag(16, c687802mK2.primary_image_type) + protoAdapter2.encodedSizeWithTag(17, c687802mK2.image_index) + C672202jo.ADAPTER.encodedSizeWithTag(18, c687802mK2.preview) + protoAdapter.encodedSizeWithTag(19, c687802mK2.file_id) + protoAdapter3.encodedSizeWithTag(20, c687802mK2.image_source) + protoAdapter2.encodedSizeWithTag(21, c687802mK2.seq) + c687802mK2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C687802mK c687802mK) {
            C687802mK c687802mK2 = c687802mK;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c687802mK2.uri);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c687802mK2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, c687802mK2.width);
            protoAdapter2.encodeWithTag(protoWriter, 4, c687802mK2.height);
            protoAdapter.encodeWithTag(protoWriter, 5, c687802mK2.url_key);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 6, c687802mK2.data_size);
            protoAdapter.encodeWithTag(protoWriter, 7, c687802mK2.file_hash);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, c687802mK2.invalid);
            protoAdapter.encodeWithTag(protoWriter, 9, c687802mK2.file_cs);
            protoAdapter2.encodeWithTag(protoWriter, 10, c687802mK2.type);
            protoAdapter2.encodeWithTag(protoWriter, 11, c687802mK2.url_sub_type);
            protoAdapter.encodeWithTag(protoWriter, 12, c687802mK2.md5);
            protoAdapter.encodeWithTag(protoWriter, 13, c687802mK2.player_access_key);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 14, c687802mK2.url_prefix);
            C1C5E.ADAPTER.encodeWithTag(protoWriter, 15, c687802mK2.image_media_model);
            protoAdapter2.encodeWithTag(protoWriter, 16, c687802mK2.primary_image_type);
            protoAdapter2.encodeWithTag(protoWriter, 17, c687802mK2.image_index);
            C672202jo.ADAPTER.encodeWithTag(protoWriter, 18, c687802mK2.preview);
            protoAdapter.encodeWithTag(protoWriter, 19, c687802mK2.file_id);
            protoAdapter3.encodeWithTag(protoWriter, 20, c687802mK2.image_source);
            protoAdapter2.encodeWithTag(protoWriter, 21, c687802mK2.seq);
            protoWriter.writeBytes(c687802mK2.unknownFields());
        }
    };
    public Long data_size;
    public String file_cs;
    public String file_hash;
    public String file_id;
    public Integer height;
    public Integer image_index;
    public C1C5E image_media_model;
    public Long image_source;
    public Boolean invalid;
    public String md5;
    public String player_access_key;
    public C672202jo preview;
    public Integer primary_image_type;
    public Integer seq;
    public Integer type;
    public String uri;
    public String url_key;
    public List<String> url_list;
    public List<String> url_prefix;
    public Integer url_sub_type;
    public Integer width;

    public C687802mK() {
        super(ADAPTER, ByteString.EMPTY);
        this.url_list = C1516540pZE.LJIIIIZZ();
        this.url_prefix = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C687902mL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
