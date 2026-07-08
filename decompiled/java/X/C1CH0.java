package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CH0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CH0 extends Message<C1CH0, C1CH1> {
    public static final ProtoAdapter<C1CH0> ADAPTER = new ProtoAdapter<C1CH0>() { // from class: X.1CGz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CH0 decode(ProtoReader protoReader) {
            C1CH1 c1ch1 = new C1CH1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ch1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ch1.LIZLLL = C2227681CGw.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ch1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CH0 c1ch0) {
            C1CH0 c1ch02 = c1ch0;
            return C2227681CGw.ADAPTER.encodedSizeWithTag(1, c1ch02.query_data) + c1ch02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CH0 redact(C1CH0 c1ch0) {
            C1CH1 c1ch1NewBuilder = c1ch0.newBuilder();
            C2227681CGw c2227681CGw = c1ch1NewBuilder.LIZLLL;
            if (c2227681CGw != null) {
                c1ch1NewBuilder.LIZLLL = C2227681CGw.ADAPTER.redact(c2227681CGw);
            }
            c1ch1NewBuilder.clearUnknownFields();
            return c1ch1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CH0 c1ch0) {
            C1CH0 c1ch02 = c1ch0;
            C2227681CGw.ADAPTER.encodeWithTag(protoWriter, 1, c1ch02.query_data);
            protoWriter.writeBytes(c1ch02.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.QueryData#ADAPTER", tag = 1)
    public final C2227681CGw query_data;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2227681CGw c2227681CGw = this.query_data;
        int iHashCode2 = iHashCode + (c2227681CGw != null ? c2227681CGw.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CH1 newBuilder() {
        C1CH1 c1ch1 = new C1CH1();
        c1ch1.LIZLLL = this.query_data;
        c1ch1.addUnknownFields(unknownFields());
        return c1ch1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.query_data != null) {
            sb.append(", query_data=");
            sb.append(this.query_data);
        }
        sb.replace(0, 2, "BaseReq{");
        sb.append('}');
        return sb.toString();
    }

    public C1CH0(C2227681CGw c2227681CGw) {
        this(c2227681CGw, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CH0)) {
            return false;
        }
        C1CH0 c1ch0 = (C1CH0) obj;
        if (unknownFields().equals(c1ch0.unknownFields()) && C1516540pZE.LJ(this.query_data, c1ch0.query_data)) {
            return true;
        }
        return false;
    }

    public C1CH0(C2227681CGw c2227681CGw, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query_data = c2227681CGw;
    }
}
