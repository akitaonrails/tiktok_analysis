package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891500YyC extends Message<C891500YyC, C891520YyE> {
    public static final ProtoAdapter<C891500YyC> ADAPTER = new ProtoAdapter<C891500YyC>() { // from class: X.0YyD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C891500YyC decode(ProtoReader protoReader) {
            C891520YyE c891520YyE = new C891520YyE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c891520YyE.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c891520YyE.LJ = C892000Yz0.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c891520YyE.LIZLLL = C1CE8.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c891520YyE.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C891500YyC c891500YyC) {
            C891500YyC c891500YyC2 = c891500YyC;
            return C1CE8.ADAPTER.encodedSizeWithTag(1, c891500YyC2.persistent_ext) + C892000Yz0.ADAPTER.encodedSizeWithTag(2, c891500YyC2.transient_ext) + c891500YyC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C891500YyC redact(C891500YyC c891500YyC) {
            C891520YyE c891520YyENewBuilder = c891500YyC.newBuilder();
            C1CE8 c1ce8 = c891520YyENewBuilder.LIZLLL;
            if (c1ce8 != null) {
                c891520YyENewBuilder.LIZLLL = C1CE8.ADAPTER.redact(c1ce8);
            }
            C892000Yz0 c892000Yz0 = c891520YyENewBuilder.LJ;
            if (c892000Yz0 != null) {
                c891520YyENewBuilder.LJ = C892000Yz0.ADAPTER.redact(c892000Yz0);
            }
            c891520YyENewBuilder.clearUnknownFields();
            return c891520YyENewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C891500YyC c891500YyC) {
            C891500YyC c891500YyC2 = c891500YyC;
            C1CE8.ADAPTER.encodeWithTag(protoWriter, 1, c891500YyC2.persistent_ext);
            C892000Yz0.ADAPTER.encodeWithTag(protoWriter, 2, c891500YyC2.transient_ext);
            protoWriter.writeBytes(c891500YyC2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.conversation.extension.proto.CorePersistentExtra#ADAPTER", tag = 1)
    public final C1CE8 persistent_ext;

    @WireField(adapter = "com.bytedance.im.conversation.extension.proto.CoreTransientExtra#ADAPTER", tag = 2)
    public final C892000Yz0 transient_ext;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C1CE8 c1ce8 = this.persistent_ext;
        int iHashCode2 = (iHashCode + (c1ce8 != null ? c1ce8.hashCode() : 0)) * 37;
        C892000Yz0 c892000Yz0 = this.transient_ext;
        int iHashCode3 = iHashCode2 + (c892000Yz0 != null ? c892000Yz0.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C891520YyE newBuilder() {
        C891520YyE c891520YyE = new C891520YyE();
        c891520YyE.LIZLLL = this.persistent_ext;
        c891520YyE.LJ = this.transient_ext;
        c891520YyE.addUnknownFields(unknownFields());
        return c891520YyE;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.persistent_ext != null) {
            sb.append(", persistent_ext=");
            sb.append(this.persistent_ext);
        }
        if (this.transient_ext != null) {
            sb.append(", transient_ext=");
            sb.append(this.transient_ext);
        }
        sb.replace(0, 2, "ConversationCoreExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C891500YyC)) {
            return false;
        }
        C891500YyC c891500YyC = (C891500YyC) obj;
        if (unknownFields().equals(c891500YyC.unknownFields()) && C1516540pZE.LJ(this.persistent_ext, c891500YyC.persistent_ext) && C1516540pZE.LJ(this.transient_ext, c891500YyC.transient_ext)) {
            return true;
        }
        return false;
    }

    public C891500YyC(C1CE8 c1ce8, C892000Yz0 c892000Yz0) {
        this(c1ce8, c892000Yz0, ByteString.EMPTY);
    }

    public C891500YyC(C1CE8 c1ce8, C892000Yz0 c892000Yz0, ByteString byteString) {
        super(ADAPTER, byteString);
        this.persistent_ext = c1ce8;
        this.transient_ext = c892000Yz0;
    }
}
