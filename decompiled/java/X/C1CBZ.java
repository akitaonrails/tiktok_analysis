package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBZ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBZ extends Message<C1CBZ, C2226171CBb> {
    public static final ProtoAdapter<C1CBZ> ADAPTER = new ProtoAdapter<C1CBZ>() { // from class: X.1CBa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBZ decode(ProtoReader protoReader) {
            C2226171CBb c2226171CBb = new C2226171CBb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226171CBb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226171CBb.LIZLLL.add(C2226181CBc.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226171CBb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CBZ c1cbz) {
            C1CBZ c1cbz2 = c1cbz;
            return C2226181CBc.ADAPTER.asRepeated().encodedSizeWithTag(1, c1cbz2.ret) + c1cbz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBZ redact(C1CBZ c1cbz) {
            C2226171CBb c2226171CBbNewBuilder = c1cbz.newBuilder();
            C1516540pZE.LJIIIZ(c2226171CBbNewBuilder.LIZLLL, C2226181CBc.ADAPTER);
            c2226171CBbNewBuilder.clearUnknownFields();
            return c2226171CBbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CBZ c1cbz) {
            C1CBZ c1cbz2 = c1cbz;
            C2226181CBc.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1cbz2.ret);
            protoWriter.writeBytes(c1cbz2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosition#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2226181CBc> ret;

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
    public C2226171CBb newBuilder() {
        C2226171CBb c2226171CBb = new C2226171CBb();
        c2226171CBb.LIZLLL = C1516540pZE.LIZJ("ret", this.ret);
        c2226171CBb.addUnknownFields(unknownFields());
        return c2226171CBb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.ret.isEmpty()) {
            sb.append(", ret=");
            sb.append(this.ret);
        }
        sb.replace(0, 2, "FuncReturnX8a8b933a5cf1f6db{");
        sb.append('}');
        return sb.toString();
    }

    public C1CBZ(List<C2226181CBc> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CBZ)) {
            return false;
        }
        C1CBZ c1cbz = (C1CBZ) obj;
        if (unknownFields().equals(c1cbz.unknownFields()) && this.ret.equals(c1cbz.ret)) {
            return true;
        }
        return false;
    }

    public C1CBZ(List<C2226181CBc> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ret = C1516540pZE.LJFF("ret", list);
    }
}
