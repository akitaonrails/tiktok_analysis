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

/* JADX INFO: renamed from: X.026b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5335026b extends Message<C5335026b, C02IX> {
    public static final ProtoAdapter<C5335026b> ADAPTER = new ProtoAdapter<C5335026b>() { // from class: X.022h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5335026b decode(ProtoReader protoReader) {
            C5335026b c5335026b = new C5335026b();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5335026b.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5335026b.start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c5335026b.end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c5335026b.words.add(C557902Fl.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c5335026b.text_size = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c5335026b.text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5335026b.bg_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5335026b.alignment = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5335026b.source_width = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5335026b.source_height = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5335026b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5335026b c5335026b) {
            C5335026b c5335026b2 = c5335026b;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5335026b2.text);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5335026b2.start_time) + protoAdapter2.encodedSizeWithTag(3, c5335026b2.end_time) + C557902Fl.ADAPTER.asRepeated().encodedSizeWithTag(4, c5335026b2.words);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c5335026b2.text_size) + protoAdapter.encodedSizeWithTag(6, c5335026b2.text_color) + protoAdapter.encodedSizeWithTag(7, c5335026b2.bg_color) + protoAdapter3.encodedSizeWithTag(8, c5335026b2.alignment);
            ProtoAdapter<Double> protoAdapter4 = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(9, c5335026b2.source_width) + protoAdapter4.encodedSizeWithTag(10, c5335026b2.source_height) + c5335026b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5335026b c5335026b) {
            C5335026b c5335026b2 = c5335026b;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5335026b2.text);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c5335026b2.start_time);
            protoAdapter2.encodeWithTag(protoWriter, 3, c5335026b2.end_time);
            C557902Fl.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c5335026b2.words);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 5, c5335026b2.text_size);
            protoAdapter.encodeWithTag(protoWriter, 6, c5335026b2.text_color);
            protoAdapter.encodeWithTag(protoWriter, 7, c5335026b2.bg_color);
            protoAdapter3.encodeWithTag(protoWriter, 8, c5335026b2.alignment);
            ProtoAdapter<Double> protoAdapter4 = ProtoAdapter.DOUBLE;
            protoAdapter4.encodeWithTag(protoWriter, 9, c5335026b2.source_width);
            protoAdapter4.encodeWithTag(protoWriter, 10, c5335026b2.source_height);
            protoWriter.writeBytes(c5335026b2.unknownFields());
        }
    };
    public Integer alignment;
    public String bg_color;
    public Long end_time;
    public Double source_height;
    public Double source_width;
    public Long start_time;
    public String text;
    public String text_color;
    public Integer text_size;
    public List<C557902Fl> words;

    public C5335026b() {
        super(ADAPTER, ByteString.EMPTY);
        this.words = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
