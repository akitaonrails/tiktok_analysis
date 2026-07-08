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

/* JADX INFO: renamed from: X.025c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5310025c extends Message<C5310025c, C02L8> {
    public static final ProtoAdapter<C5310025c> ADAPTER = new ProtoAdapter<C5310025c>() { // from class: X.022s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5310025c decode(ProtoReader protoReader) {
            C5310025c c5310025c = new C5310025c();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5310025c.img_num = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c5310025c.uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5310025c.img_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5310025c.img_x_size = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c5310025c.img_y_size = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c5310025c.img_x_len = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c5310025c.img_y_len = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c5310025c.duration = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5310025c.interval = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5310025c.fext = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5310025c.img_uris.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5310025c.img_urls.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5310025c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5310025c c5310025c) {
            C5310025c c5310025c2 = c5310025c;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5310025c2.img_num);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5310025c2.uri) + protoAdapter2.encodedSizeWithTag(3, c5310025c2.img_url) + protoAdapter.encodedSizeWithTag(4, c5310025c2.img_x_size) + protoAdapter.encodedSizeWithTag(5, c5310025c2.img_y_size) + protoAdapter.encodedSizeWithTag(6, c5310025c2.img_x_len) + protoAdapter.encodedSizeWithTag(7, c5310025c2.img_y_len);
            ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, c5310025c2.duration) + protoAdapter3.encodedSizeWithTag(9, c5310025c2.interval) + protoAdapter2.encodedSizeWithTag(10, c5310025c2.fext) + protoAdapter2.asRepeated().encodedSizeWithTag(11, c5310025c2.img_uris) + protoAdapter2.asRepeated().encodedSizeWithTag(12, c5310025c2.img_urls) + c5310025c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5310025c c5310025c) {
            C5310025c c5310025c2 = c5310025c;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c5310025c2.img_num);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c5310025c2.uri);
            protoAdapter2.encodeWithTag(protoWriter, 3, c5310025c2.img_url);
            protoAdapter.encodeWithTag(protoWriter, 4, c5310025c2.img_x_size);
            protoAdapter.encodeWithTag(protoWriter, 5, c5310025c2.img_y_size);
            protoAdapter.encodeWithTag(protoWriter, 6, c5310025c2.img_x_len);
            protoAdapter.encodeWithTag(protoWriter, 7, c5310025c2.img_y_len);
            ProtoAdapter<Double> protoAdapter3 = ProtoAdapter.DOUBLE;
            protoAdapter3.encodeWithTag(protoWriter, 8, c5310025c2.duration);
            protoAdapter3.encodeWithTag(protoWriter, 9, c5310025c2.interval);
            protoAdapter2.encodeWithTag(protoWriter, 10, c5310025c2.fext);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 11, c5310025c2.img_uris);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 12, c5310025c2.img_urls);
            protoWriter.writeBytes(c5310025c2.unknownFields());
        }
    };
    public Double duration;
    public String fext;
    public Long img_num;
    public List<String> img_uris;
    public String img_url;
    public List<String> img_urls;
    public Long img_x_len;
    public Long img_x_size;
    public Long img_y_len;
    public Long img_y_size;
    public Double interval;
    public String uri;

    public C5310025c() {
        super(ADAPTER, ByteString.EMPTY);
        this.img_uris = C1516540pZE.LJIIIIZZ();
        this.img_urls = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02L8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
