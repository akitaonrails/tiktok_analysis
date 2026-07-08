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

/* JADX INFO: renamed from: X.1DAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251421DAe extends Message<C2251421DAe, C2251431DAf> {
    public static final ProtoAdapter<C2251421DAe> ADAPTER = new ProtoAdapter<C2251421DAe>() { // from class: X.1DAd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251421DAe decode(ProtoReader protoReader) {
            C2251421DAe c2251421DAe = new C2251421DAe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251421DAe.bit_rate.add(C2251391DAb.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c2251421DAe.play_addr = C1DAY.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2251421DAe.play_addr_byte_vc1 = C1DAY.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2251421DAe.play_addr_h264 = C1DAY.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2251421DAe.height = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2251421DAe.width = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c2251421DAe.duration = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c2251421DAe.ratio = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2251421DAe.is_byte_vc1 = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2251421DAe.cover = C1DAY.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251421DAe;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251421DAe c2251421DAe) {
            C2251421DAe c2251421DAe2 = c2251421DAe;
            int iEncodedSizeWithTag = C2251391DAb.ADAPTER.asRepeated().encodedSizeWithTag(1, c2251421DAe2.bit_rate);
            ProtoAdapter<C1DAY> protoAdapter = C1DAY.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2251421DAe2.play_addr) + protoAdapter.encodedSizeWithTag(3, c2251421DAe2.play_addr_byte_vc1) + protoAdapter.encodedSizeWithTag(4, c2251421DAe2.play_addr_h264);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(5, c2251421DAe2.height) + protoAdapter2.encodedSizeWithTag(6, c2251421DAe2.width);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(7, c2251421DAe2.duration) + ProtoAdapter.STRING.encodedSizeWithTag(8, c2251421DAe2.ratio) + protoAdapter3.encodedSizeWithTag(9, c2251421DAe2.is_byte_vc1) + protoAdapter.encodedSizeWithTag(10, c2251421DAe2.cover) + c2251421DAe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2251421DAe c2251421DAe) {
        }
    };
    public List<C2251391DAb> bit_rate;
    public C1DAY cover;
    public Integer duration;
    public Long height;
    public Integer is_byte_vc1;
    public C1DAY play_addr;
    public C1DAY play_addr_byte_vc1;
    public C1DAY play_addr_h264;
    public String ratio;
    public Long width;

    public C2251421DAe() {
        super(ADAPTER, ByteString.EMPTY);
        this.bit_rate = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2251431DAf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
