package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQ0, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQ0 extends Message<C1CQ0, C1CQ2> {
    public static final ProtoAdapter<C1CQ0> ADAPTER = new ProtoAdapter<C1CQ0>() { // from class: X.1CQ1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQ0 decode(ProtoReader protoReader) {
            C1CQ2 c1cq2 = new C1CQ2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cq2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cq2.LIZLLL = C1CQD.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cq2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQ0 c1cq0) {
            C1CQ0 c1cq02 = c1cq0;
            return C1CQD.ADAPTER.encodedSizeWithTag(1, c1cq02.ret) + c1cq02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQ0 redact(C1CQ0 c1cq0) {
            C1CQ2 c1cq2NewBuilder = c1cq0.newBuilder();
            c1cq2NewBuilder.LIZLLL = C1CQD.ADAPTER.redact(c1cq2NewBuilder.LIZLLL);
            c1cq2NewBuilder.clearUnknownFields();
            return c1cq2NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQ0 c1cq0) {
            C1CQ0 c1cq02 = c1cq0;
            C1CQD.ADAPTER.encodeWithTag(protoWriter, 1, c1cq02.ret);
            protoWriter.writeBytes(c1cq02.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.SyeEditBranchResult#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CQD ret;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.ret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CQ2 newBuilder() {
        C1CQ2 c1cq2 = new C1CQ2();
        c1cq2.LIZLLL = this.ret;
        c1cq2.addUnknownFields(unknownFields());
        return c1cq2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ret=");
        sb.append(this.ret);
        sb.replace(0, 2, "FuncReturnX86896fdf83a954bc{");
        sb.append('}');
        return sb.toString();
    }

    public C1CQ0(C1CQD c1cqd) {
        this(c1cqd, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQ0)) {
            return false;
        }
        C1CQ0 c1cq0 = (C1CQ0) obj;
        if (unknownFields().equals(c1cq0.unknownFields()) && this.ret.equals(c1cq0.ret)) {
            return true;
        }
        return false;
    }

    public C1CQ0(C1CQD c1cqd, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = c1cqd;
    }
}
