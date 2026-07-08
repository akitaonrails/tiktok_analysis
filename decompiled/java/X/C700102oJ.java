package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02oJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C700102oJ extends Message<C700102oJ, C700202oK> {
    public static final ProtoAdapter<C700102oJ> ADAPTER = new ProtoAdapter<C700102oJ>() { // from class: X.02oI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C700102oJ decode(ProtoReader protoReader) {
            C700102oJ c700102oJ = new C700102oJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c700102oJ.height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c700102oJ.width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c700102oJ.duration = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c700102oJ.play_addr = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c700102oJ.play_addr_h264 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c700102oJ.play_addr_265 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c700102oJ.play_addr_bytevc1 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c700102oJ.bit_rate.add(AnonymousClass0244.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c700102oJ.fake_landscape_video_info = C02DQ.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c700102oJ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C700102oJ c700102oJ) {
            C700102oJ c700102oJ2 = c700102oJ;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c700102oJ2.height) + protoAdapter.encodedSizeWithTag(2, c700102oJ2.width) + protoAdapter.encodedSizeWithTag(3, c700102oJ2.duration);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c700102oJ2.play_addr) + protoAdapter2.encodedSizeWithTag(5, c700102oJ2.play_addr_h264) + protoAdapter2.encodedSizeWithTag(6, c700102oJ2.play_addr_265) + protoAdapter2.encodedSizeWithTag(7, c700102oJ2.play_addr_bytevc1) + AnonymousClass0244.ADAPTER.asRepeated().encodedSizeWithTag(8, c700102oJ2.bit_rate) + C02DQ.ADAPTER.encodedSizeWithTag(9, c700102oJ2.fake_landscape_video_info) + c700102oJ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C700102oJ c700102oJ) {
            C700102oJ c700102oJ2 = c700102oJ;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c700102oJ2.height);
            protoAdapter.encodeWithTag(protoWriter, 2, c700102oJ2.width);
            protoAdapter.encodeWithTag(protoWriter, 3, c700102oJ2.duration);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 4, c700102oJ2.play_addr);
            protoAdapter2.encodeWithTag(protoWriter, 5, c700102oJ2.play_addr_h264);
            protoAdapter2.encodeWithTag(protoWriter, 6, c700102oJ2.play_addr_265);
            protoAdapter2.encodeWithTag(protoWriter, 7, c700102oJ2.play_addr_bytevc1);
            AnonymousClass0244.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c700102oJ2.bit_rate);
            C02DQ.ADAPTER.encodeWithTag(protoWriter, 9, c700102oJ2.fake_landscape_video_info);
            protoWriter.writeBytes(c700102oJ2.unknownFields());
        }
    };
    public List<AnonymousClass0244> bit_rate;
    public Integer duration;
    public C02DQ fake_landscape_video_info;
    public Integer height;
    public C673002jw play_addr;
    public C673002jw play_addr_265;
    public C673002jw play_addr_bytevc1;
    public C673002jw play_addr_h264;
    public Integer width;

    public C700102oJ() {
        super(ADAPTER, ByteString.EMPTY);
        this.bit_rate = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C700202oK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
