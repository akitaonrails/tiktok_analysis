package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.025b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5309025b extends Message<C5309025b, C02M8> {
    public static final ProtoAdapter<C5309025b> ADAPTER = new ProtoAdapter<C5309025b>() { // from class: X.022p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5309025b decode(ProtoReader protoReader) {
            C5309025b c5309025b = new C5309025b();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5309025b.display_image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c5309025b.owner_watermark_image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5309025b.user_watermark_image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5309025b.thumbnail = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c5309025b.bitrate_images.add(C560402Gk.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c5309025b.dynamic_image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5309025b.ocr_language = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5309025b.translated_image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5309025b.alternate_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5309025b.live_photo_info = C02DD.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5309025b.subscription_info = C669602jO.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5309025b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5309025b c5309025b) {
            C5309025b c5309025b2 = c5309025b;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5309025b2.display_image) + protoAdapter.encodedSizeWithTag(2, c5309025b2.owner_watermark_image) + protoAdapter.encodedSizeWithTag(3, c5309025b2.user_watermark_image) + protoAdapter.encodedSizeWithTag(4, c5309025b2.thumbnail) + C560402Gk.ADAPTER.asRepeated().encodedSizeWithTag(5, c5309025b2.bitrate_images) + protoAdapter.encodedSizeWithTag(6, c5309025b2.dynamic_image);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, c5309025b2.ocr_language) + protoAdapter.encodedSizeWithTag(8, c5309025b2.translated_image) + protoAdapter2.encodedSizeWithTag(9, c5309025b2.alternate_text) + C02DD.ADAPTER.encodedSizeWithTag(10, c5309025b2.live_photo_info) + C669602jO.ADAPTER.encodedSizeWithTag(11, c5309025b2.subscription_info) + c5309025b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5309025b c5309025b) {
            C5309025b c5309025b2 = c5309025b;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c5309025b2.display_image);
            protoAdapter.encodeWithTag(protoWriter, 2, c5309025b2.owner_watermark_image);
            protoAdapter.encodeWithTag(protoWriter, 3, c5309025b2.user_watermark_image);
            protoAdapter.encodeWithTag(protoWriter, 4, c5309025b2.thumbnail);
            C560402Gk.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, c5309025b2.bitrate_images);
            protoAdapter.encodeWithTag(protoWriter, 6, c5309025b2.dynamic_image);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 7, c5309025b2.ocr_language);
            protoAdapter.encodeWithTag(protoWriter, 8, c5309025b2.translated_image);
            protoAdapter2.encodeWithTag(protoWriter, 9, c5309025b2.alternate_text);
            C02DD.ADAPTER.encodeWithTag(protoWriter, 10, c5309025b2.live_photo_info);
            C669602jO.ADAPTER.encodeWithTag(protoWriter, 11, c5309025b2.subscription_info);
            protoWriter.writeBytes(c5309025b2.unknownFields());
        }
    };
    public String alternate_text;
    public List<C560402Gk> bitrate_images;
    public C673002jw display_image;
    public C673002jw dynamic_image;
    public C02DD live_photo_info;
    public String ocr_language;
    public C673002jw owner_watermark_image;
    public C669602jO subscription_info;
    public C673002jw thumbnail;
    public C673002jw translated_image;
    public C673002jw user_watermark_image;

    public C5309025b() {
        super(ADAPTER, ByteString.EMPTY);
        this.bitrate_images = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02M8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
