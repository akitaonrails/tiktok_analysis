package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CNT extends Message<C1CNT, C1CNU> {
    public static final ProtoAdapter<C1CNT> ADAPTER = new ProtoAdapter<C1CNT>() { // from class: X.1CNS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNT decode(ProtoReader protoReader) {
            C1CNU c1cnu = new C1CNU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cnu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cnu.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cnu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CNT c1cnt) {
            C1CNT c1cnt2 = c1cnt;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cnt2.source) + c1cnt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CNT redact(C1CNT c1cnt) {
            C1CNU c1cnuNewBuilder = c1cnt.newBuilder();
            c1cnuNewBuilder.clearUnknownFields();
            return c1cnuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CNT c1cnt) {
            C1CNT c1cnt2 = c1cnt;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cnt2.source);
            protoWriter.writeBytes(c1cnt2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CNU newBuilder() {
        C1CNU c1cnu = new C1CNU();
        c1cnu.LIZLLL = this.source;
        c1cnu.addUnknownFields(unknownFields());
        return c1cnu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", source=");
        sb.append(this.source);
        sb.replace(0, 2, "LinkMicImp2pGroupListChangeModel{");
        sb.append('}');
        return sb.toString();
    }

    public C1CNT(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CNT)) {
            return false;
        }
        C1CNT c1cnt = (C1CNT) obj;
        if (unknownFields().equals(c1cnt.unknownFields()) && this.source.equals(c1cnt.source)) {
            return true;
        }
        return false;
    }

    public C1CNT(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.source = str;
    }
}
