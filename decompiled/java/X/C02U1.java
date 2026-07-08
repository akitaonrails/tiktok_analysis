package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02U1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02U1 extends Message<C02U1, C02U2> {
    public static final ProtoAdapter<C02U1> ADAPTER = new ProtoAdapter<C02U1>() { // from class: X.02U0
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02U1 decode(ProtoReader protoReader) {
            C02U1 c02u1 = new C02U1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02u1.height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02u1.width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c02u1.mimetype = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02u1.thumb_uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02u1.thumb_url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c02u1.uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02u1.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            c02u1.color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02u1.size = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02u1.tint_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c02u1.blurhash = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c02u1.ratio = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c02u1.remove_gap = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c02u1.all_size_image_list.add(C02U1.ADAPTER.decode(protoReader));
                            break;
                        case 15:
                            c02u1.size_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c02u1.extra.putAll(this.LIZ.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c02u1.source_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c02u1.image_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            c02u1.view_height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c02u1.view_width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02u1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02U1 c02u1) {
            C02U1 c02u12 = c02u1;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02u12.height) + protoAdapter.encodedSizeWithTag(2, c02u12.width);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02u12.mimetype) + protoAdapter2.encodedSizeWithTag(4, c02u12.thumb_uri) + protoAdapter2.asRepeated().encodedSizeWithTag(5, c02u12.thumb_url_list) + protoAdapter2.encodedSizeWithTag(6, c02u12.uri) + protoAdapter2.asRepeated().encodedSizeWithTag(7, c02u12.url_list) + protoAdapter2.encodedSizeWithTag(8, c02u12.color) + protoAdapter2.encodedSizeWithTag(9, c02u12.size) + protoAdapter2.encodedSizeWithTag(10, c02u12.tint_color) + protoAdapter2.encodedSizeWithTag(11, c02u12.blurhash) + ProtoAdapter.FLOAT.encodedSizeWithTag(12, c02u12.ratio) + protoAdapter2.encodedSizeWithTag(13, c02u12.remove_gap) + C02U1.ADAPTER.asRepeated().encodedSizeWithTag(14, c02u12.all_size_image_list) + protoAdapter.encodedSizeWithTag(15, c02u12.size_type) + this.LIZ.encodedSizeWithTag(16, c02u12.extra) + protoAdapter.encodedSizeWithTag(17, c02u12.source_type) + protoAdapter.encodedSizeWithTag(18, c02u12.image_type) + protoAdapter.encodedSizeWithTag(19, c02u12.view_height) + protoAdapter.encodedSizeWithTag(20, c02u12.view_width) + c02u12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02U1 c02u1) {
        }
    };
    public List<C02U1> all_size_image_list;
    public String blurhash;
    public String color;
    public Map<String, String> extra;
    public Integer height;
    public Integer image_type;
    public String mimetype;
    public Float ratio;
    public String remove_gap;
    public String size;
    public Integer size_type;
    public Integer source_type;
    public String thumb_uri;
    public List<String> thumb_url_list;
    public String tint_color;
    public String uri;
    public List<String> url_list;
    public Integer view_height;
    public Integer view_width;
    public Integer width;

    @Override // com.squareup.wire.Message
    public C02U2 newBuilder() {
        return null;
    }

    public C02U1() {
        super(ADAPTER, ByteString.EMPTY);
        this.thumb_url_list = C1516540pZE.LJIIIIZZ();
        this.url_list = C1516540pZE.LJIIIIZZ();
        this.all_size_image_list = C1516540pZE.LJIIIIZZ();
        this.extra = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
