package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CHB extends Message<C1CHB, C1CHC> {
    public static final ProtoAdapter<C1CHB> ADAPTER = new ProtoAdapter<C1CHB>() { // from class: X.1CHA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CHB decode(ProtoReader protoReader) {
            C1CHC c1chc = new C1CHC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1chc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1chc.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1chc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CHB c1chb) {
            C1CHB c1chb2 = c1chb;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1chb2.text) + c1chb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CHB c1chb) {
        }
    };
    public String text;

    @Override // com.squareup.wire.Message
    public C1CHC newBuilder() {
        return null;
    }

    public C1CHB(String str) {
        this(str, ByteString.EMPTY);
    }

    public C1CHB(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
    }
}
