package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQ9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQ9 extends Message<C1CQ9, C1CQB> {
    public static final ProtoAdapter<C1CQ9> ADAPTER = new ProtoAdapter<C1CQ9>() { // from class: X.1CQA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQ9 decode(ProtoReader protoReader) {
            C1CQB c1cqb = new C1CQB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cqb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cqb.LIZLLL = C1CQI.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cqb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQ9 c1cq9) {
            C1CQ9 c1cq92 = c1cq9;
            return C1CQI.ADAPTER.encodedSizeWithTag(1, c1cq92.root_flow) + c1cq92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQ9 redact(C1CQ9 c1cq9) {
            C1CQB c1cqbNewBuilder = c1cq9.newBuilder();
            c1cqbNewBuilder.LIZLLL = C1CQI.ADAPTER.redact(c1cqbNewBuilder.LIZLLL);
            c1cqbNewBuilder.clearUnknownFields();
            return c1cqbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQ9 c1cq9) {
            C1CQ9 c1cq92 = c1cq9;
            C1CQI.ADAPTER.encodeWithTag(protoWriter, 1, c1cq92.root_flow);
            protoWriter.writeBytes(c1cq92.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.SyeRootFlow#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CQI root_flow;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.root_flow.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CQB newBuilder() {
        C1CQB c1cqb = new C1CQB();
        c1cqb.LIZLLL = this.root_flow;
        c1cqb.addUnknownFields(unknownFields());
        return c1cqb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", root_flow=");
        sb.append(this.root_flow);
        sb.replace(0, 2, "FuncParamsXe531f87bf23651e5{");
        sb.append('}');
        return sb.toString();
    }

    public C1CQ9(C1CQI c1cqi) {
        this(c1cqi, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQ9)) {
            return false;
        }
        C1CQ9 c1cq9 = (C1CQ9) obj;
        if (unknownFields().equals(c1cq9.unknownFields()) && this.root_flow.equals(c1cq9.root_flow)) {
            return true;
        }
        return false;
    }

    public C1CQ9(C1CQI c1cqi, ByteString byteString) {
        super(ADAPTER, byteString);
        this.root_flow = c1cqi;
    }
}
