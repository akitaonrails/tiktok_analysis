package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3L, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C3L extends Message<C1C3L, C1C3N> {
    public static final ProtoAdapter<C1C3L> ADAPTER = new ProtoAdapter<C1C3L>() { // from class: X.1C3M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3L decode(ProtoReader protoReader) {
            C1C3N c1c3n = new C1C3N();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c3n.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c3n.LIZLLL.add(C1C3O.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c3n.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C3L c1c3l) {
            C1C3L c1c3l2 = c1c3l;
            return C1C3O.ADAPTER.asRepeated().encodedSizeWithTag(1, c1c3l2.kv) + c1c3l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C3L redact(C1C3L c1c3l) {
            C1C3N c1c3nNewBuilder = c1c3l.newBuilder();
            C1516540pZE.LJIIIZ(c1c3nNewBuilder.LIZLLL, C1C3O.ADAPTER);
            c1c3nNewBuilder.clearUnknownFields();
            return c1c3nNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C3L c1c3l) {
            C1C3L c1c3l2 = c1c3l;
            C1C3O.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1c3l2.kv);
            protoWriter.writeBytes(c1c3l2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.MetadataEntry#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C1C3O> kv;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.kv.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C3N newBuilder() {
        C1C3N c1c3n = new C1C3N();
        c1c3n.LIZLLL = C1516540pZE.LIZJ("kv", this.kv);
        c1c3n.addUnknownFields(unknownFields());
        return c1c3n;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.kv.isEmpty()) {
            sb.append(", kv=");
            sb.append(this.kv);
        }
        sb.replace(0, 2, "Metadata{");
        sb.append('}');
        return sb.toString();
    }

    public C1C3L(List<C1C3O> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C3L)) {
            return false;
        }
        C1C3L c1c3l = (C1C3L) obj;
        if (unknownFields().equals(c1c3l.unknownFields()) && this.kv.equals(c1c3l.kv)) {
            return true;
        }
        return false;
    }

    public C1C3L(List<C1C3O> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.kv = C1516540pZE.LJFF("kv", list);
    }
}
