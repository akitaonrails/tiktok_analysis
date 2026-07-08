package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251641DBa extends Message<C2251641DBa, C2251651DBb> {
    public static final ProtoAdapter<C2251641DBa> ADAPTER = new ProtoAdapter<C2251641DBa>() { // from class: X.1DBZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251641DBa decode(ProtoReader protoReader) {
            C2251651DBb c2251651DBb = new C2251651DBb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2251651DBb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2251651DBb.LJI = ProtoAdapter.DOUBLE.decode(protoReader);
                                }
                            } else {
                                c2251651DBb.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c2251651DBb.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c2251651DBb.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251651DBb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251641DBa c2251641DBa) {
            C2251641DBa c2251641DBa2 = c2251641DBa;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c2251641DBa2.static_percent) + protoAdapter.encodedSizeWithTag(2, c2251641DBa2.by_car_percent) + protoAdapter.encodedSizeWithTag(3, c2251641DBa2.walking_percent) + protoAdapter.encodedSizeWithTag(4, c2251641DBa2.lie_down_percent) + c2251641DBa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251641DBa c2251641DBa) {
            C2251641DBa c2251641DBa2 = c2251641DBa;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251641DBa2.static_percent);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251641DBa2.by_car_percent);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251641DBa2.walking_percent);
            protoAdapter.encodeWithTag(protoWriter, 4, c2251641DBa2.lie_down_percent);
            protoWriter.writeBytes(c2251641DBa2.unknownFields());
        }
    };
    public Double by_car_percent;
    public Double lie_down_percent;
    public Double static_percent;
    public Double walking_percent;

    @Override // com.squareup.wire.Message
    public C2251651DBb newBuilder() {
        return null;
    }

    public C2251641DBa(Double d, Double d2, Double d3, Double d4) {
        this(d, d2, d3, d4, ByteString.EMPTY);
    }

    public C2251641DBa(Double d, Double d2, Double d3, Double d4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.static_percent = d;
        this.by_car_percent = d2;
        this.walking_percent = d3;
        this.lie_down_percent = d4;
    }
}
