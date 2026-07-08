package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DB5, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DB5 extends Message<C1DB5, C1DB6> {
    public static final ProtoAdapter<C1DB5> ADAPTER = new ProtoAdapter<C1DB5>() { // from class: X.1DB4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DB5 decode(ProtoReader protoReader) {
            C1DB6 c1db6 = new C1DB6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1db6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1db6.LJI = ProtoAdapter.DOUBLE.decode(protoReader);
                                }
                            } else {
                                c1db6.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c1db6.LJ = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c1db6.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1db6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DB5 c1db5) {
            C1DB5 c1db52 = c1db5;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c1db52.hand);
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1db52.confidence) + protoAdapter.encodedSizeWithTag(3, c1db52.left_percent) + protoAdapter.encodedSizeWithTag(4, c1db52.right_percent) + c1db52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DB5 c1db5) {
            C1DB5 c1db52 = c1db5;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1db52.hand);
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 2, c1db52.confidence);
            protoAdapter.encodeWithTag(protoWriter, 3, c1db52.left_percent);
            protoAdapter.encodeWithTag(protoWriter, 4, c1db52.right_percent);
            protoWriter.writeBytes(c1db52.unknownFields());
        }
    };
    public Double confidence;
    public Integer hand;
    public Double left_percent;
    public Double right_percent;

    @Override // com.squareup.wire.Message
    public C1DB6 newBuilder() {
        return null;
    }

    public C1DB5(Integer num, Double d, Double d2, Double d3) {
        this(num, d, d2, d3, ByteString.EMPTY);
    }

    public C1DB5(Integer num, Double d, Double d2, Double d3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.hand = num;
        this.confidence = d;
        this.left_percent = d2;
        this.right_percent = d3;
    }
}
