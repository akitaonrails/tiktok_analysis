package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHH extends Message<C1CHH, C1CHI> {
    public static final ProtoAdapter<C1CHH> ADAPTER = new ProtoAdapter<C1CHH>() { // from class: X.1CHG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHH decode(ProtoReader protoReader) {
            C1CHI c1chi = new C1CHI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1chi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1chi.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1chi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CHH c1chh) {
            C1CHH c1chh2 = c1chh;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1chh2.autoscroll_switch) + c1chh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CHH c1chh) {
            C1CHH c1chh2 = c1chh;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1chh2.autoscroll_switch);
            protoWriter.writeBytes(c1chh2.unknownFields());
        }
    };
    public Integer autoscroll_switch;

    @Override // com.squareup.wire.Message
    public C1CHI newBuilder() {
        return null;
    }

    public C1CHH(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public C1CHH(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.autoscroll_switch = num;
    }
}
