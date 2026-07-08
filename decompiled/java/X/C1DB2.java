package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DB2, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DB2 extends Message<C1DB2, C1DB3> {
    public static final ProtoAdapter<C1DB2> ADAPTER = new ProtoAdapter<C1DB2>() { // from class: X.1DB1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DB2 decode(ProtoReader protoReader) {
            C1DB3 c1db3 = new C1DB3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1db3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1db3.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c1db3.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1db3.LIZLLL = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1db3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DB2 c1db2) {
            C1DB2 c1db22 = c1db2;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c1db22.screen_brightness) + ProtoAdapter.INT32.encodedSizeWithTag(2, c1db22.screen_auto_mode) + protoAdapter.encodedSizeWithTag(3, c1db22.env_light) + c1db22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DB2 c1db2) {
            C1DB2 c1db22 = c1db2;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c1db22.screen_brightness);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c1db22.screen_auto_mode);
            protoAdapter.encodeWithTag(protoWriter, 3, c1db22.env_light);
            protoWriter.writeBytes(c1db22.unknownFields());
        }
    };
    public Double env_light;
    public Integer screen_auto_mode;
    public Double screen_brightness;

    @Override // com.squareup.wire.Message
    public C1DB3 newBuilder() {
        return null;
    }

    public C1DB2(Double d, Integer num, Double d2) {
        this(d, num, d2, ByteString.EMPTY);
    }

    public C1DB2(Double d, Integer num, Double d2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.screen_brightness = d;
        this.screen_auto_mode = num;
        this.env_light = d2;
    }
}
