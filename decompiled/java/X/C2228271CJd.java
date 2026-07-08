package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228271CJd extends Message<C2228271CJd, C2228291CJf> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long child;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long parent;
    public static final ProtoAdapter<C2228271CJd> ADAPTER = new ProtoAdapter<C2228271CJd>() { // from class: X.1CJe
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228271CJd decode(ProtoReader protoReader) {
            C2228291CJf c2228291CJf = new C2228291CJf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228291CJf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2228291CJf.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2228291CJf.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228291CJf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228271CJd c2228271CJd) {
            C2228271CJd c2228271CJd2 = c2228271CJd;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2228271CJd2.parent) + protoAdapter.encodedSizeWithTag(2, c2228271CJd2.child) + c2228271CJd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228271CJd redact(C2228271CJd c2228271CJd) {
            C2228291CJf c2228291CJfNewBuilder = c2228271CJd.newBuilder();
            c2228291CJfNewBuilder.clearUnknownFields();
            return c2228291CJfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228271CJd c2228271CJd) {
            C2228271CJd c2228271CJd2 = c2228271CJd;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2228271CJd2.parent);
            protoAdapter.encodeWithTag(protoWriter, 2, c2228271CJd2.child);
            protoWriter.writeBytes(c2228271CJd2.unknownFields());
        }
    };
    public static final Long DEFAULT_PARENT = 0L;
    public static final Long DEFAULT_CHILD = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.parent.hashCode()) * 37) + this.child.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228291CJf newBuilder() {
        C2228291CJf c2228291CJf = new C2228291CJf();
        c2228291CJf.LIZLLL = this.parent;
        c2228291CJf.LJ = this.child;
        c2228291CJf.addUnknownFields(unknownFields());
        return c2228291CJf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", child=");
        sb.append(this.child);
        sb.replace(0, 2, "FuncParamsXa5c67f42ec5b932d{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228271CJd)) {
            return false;
        }
        C2228271CJd c2228271CJd = (C2228271CJd) obj;
        if (unknownFields().equals(c2228271CJd.unknownFields()) && this.parent.equals(c2228271CJd.parent) && this.child.equals(c2228271CJd.child)) {
            return true;
        }
        return false;
    }

    public C2228271CJd(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public C2228271CJd(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parent = l;
        this.child = l2;
    }
}
