package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Yz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892030Yz3 extends Message<C892030Yz3, C892050Yz5> {
    public static final ProtoAdapter<C892030Yz3> ADAPTER = new ProtoAdapter<C892030Yz3>() { // from class: X.0Yz4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C892030Yz3 decode(ProtoReader protoReader) {
            C892050Yz5 c892050Yz5 = new C892050Yz5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c892050Yz5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c892050Yz5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C892030Yz3 c892030Yz3) {
            return c892030Yz3.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C892030Yz3 redact(C892030Yz3 c892030Yz3) {
            C892050Yz5 c892050Yz5NewBuilder = c892030Yz3.newBuilder();
            c892050Yz5NewBuilder.clearUnknownFields();
            return c892050Yz5NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C892030Yz3 c892030Yz3) {
            protoWriter.writeBytes(c892030Yz3.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    public C892030Yz3() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C892050Yz5 newBuilder() {
        C892050Yz5 c892050Yz5 = new C892050Yz5();
        c892050Yz5.addUnknownFields(unknownFields());
        return c892050Yz5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "SettingTransientExtra{");
        sb.append('}');
        return sb.toString();
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    public C892030Yz3(ByteString byteString) {
        super(ADAPTER, byteString);
    }

    public boolean equals(Object obj) {
        return obj instanceof C892030Yz3;
    }
}
