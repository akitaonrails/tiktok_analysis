package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBF extends Message<C1CBF, C1CBH> {
    public static final ProtoAdapter<C1CBF> ADAPTER = new ProtoAdapter<C1CBF>() { // from class: X.1CBG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBF decode(ProtoReader protoReader) {
            C1CBH c1cbh = new C1CBH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cbh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cbh.LIZLLL.add(C1CB9.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cbh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CBF c1cbf) {
            C1CBF c1cbf2 = c1cbf;
            return C1CB9.ADAPTER.asRepeated().encodedSizeWithTag(1, c1cbf2.ret) + c1cbf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBF redact(C1CBF c1cbf) {
            C1CBH c1cbhNewBuilder = c1cbf.newBuilder();
            C1516540pZE.LJIIIZ(c1cbhNewBuilder.LIZLLL, C1CB9.ADAPTER);
            c1cbhNewBuilder.clearUnknownFields();
            return c1cbhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CBF c1cbf) {
            C1CBF c1cbf2 = c1cbf;
            C1CB9.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1cbf2.ret);
            protoWriter.writeBytes(c1cbf2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicContentPosition#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C1CB9> ret;

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
    public C1CBH newBuilder() {
        C1CBH c1cbh = new C1CBH();
        c1cbh.LIZLLL = C1516540pZE.LIZJ("ret", this.ret);
        c1cbh.addUnknownFields(unknownFields());
        return c1cbh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.ret.isEmpty()) {
            sb.append(", ret=");
            sb.append(this.ret);
        }
        sb.replace(0, 2, "FuncReturnXd83a712e52516931{");
        sb.append('}');
        return sb.toString();
    }

    public C1CBF(List<C1CB9> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CBF)) {
            return false;
        }
        C1CBF c1cbf = (C1CBF) obj;
        if (unknownFields().equals(c1cbf.unknownFields()) && this.ret.equals(c1cbf.ret)) {
            return true;
        }
        return false;
    }

    public C1CBF(List<C1CB9> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = C1516540pZE.LJFF("ret", list);
    }
}
