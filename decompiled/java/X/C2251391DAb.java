package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251391DAb extends Message<C2251391DAb, C2251401DAc> {
    public static final ProtoAdapter<C2251391DAb> ADAPTER = new ProtoAdapter<C2251391DAb>() { // from class: X.1DAa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251391DAb decode(ProtoReader protoReader) {
            C2251391DAb c2251391DAb = new C2251391DAb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251391DAb.gear_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251391DAb.bit_rate = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2251391DAb.quality_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2251391DAb.play_addr = C1DAY.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2251391DAb.codec_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2251391DAb.hdr_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2251391DAb.hdr_bit = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2251391DAb.fps = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2251391DAb.format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2251391DAb.bandwidth = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251391DAb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251391DAb c2251391DAb) {
            C2251391DAb c2251391DAb2 = c2251391DAb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2251391DAb2.gear_name);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2251391DAb2.bit_rate) + protoAdapter2.encodedSizeWithTag(3, c2251391DAb2.quality_type) + C1DAY.ADAPTER.encodedSizeWithTag(4, c2251391DAb2.play_addr) + protoAdapter.encodedSizeWithTag(5, c2251391DAb2.codec_type) + protoAdapter.encodedSizeWithTag(6, c2251391DAb2.hdr_type) + protoAdapter.encodedSizeWithTag(7, c2251391DAb2.hdr_bit);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, c2251391DAb2.fps) + protoAdapter.encodedSizeWithTag(9, c2251391DAb2.format) + protoAdapter3.encodedSizeWithTag(10, c2251391DAb2.bandwidth) + c2251391DAb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2251391DAb c2251391DAb) {
        }
    };
    public Long bandwidth;
    public Integer bit_rate;
    public String codec_type;
    public String format;
    public Long fps;
    public String gear_name;
    public String hdr_bit;
    public String hdr_type;
    public C1DAY play_addr;
    public Integer quality_type;

    public C2251391DAb() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2251401DAc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
