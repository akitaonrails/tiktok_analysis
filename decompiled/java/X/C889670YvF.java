package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889670YvF extends Message<C889670YvF, C889660YvE> {
    public static final ProtoAdapter<C889670YvF> ADAPTER = new ProtoAdapter<C889670YvF>() { // from class: X.0YvG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C889670YvF decode(ProtoReader protoReader) {
            C889660YvE c889660YvE = new C889660YvE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c889660YvE.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c889660YvE.LJ = C892030Yz3.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c889660YvE.LIZLLL = C891130Yxb.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c889660YvE.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C889670YvF c889670YvF) {
            C889670YvF c889670YvF2 = c889670YvF;
            return C891130Yxb.ADAPTER.encodedSizeWithTag(1, c889670YvF2.persistent_ext) + C892030Yz3.ADAPTER.encodedSizeWithTag(2, c889670YvF2.transient_ext) + c889670YvF2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C889670YvF redact(C889670YvF c889670YvF) {
            C889660YvE c889660YvENewBuilder = c889670YvF.newBuilder();
            C891130Yxb c891130Yxb = c889660YvENewBuilder.LIZLLL;
            if (c891130Yxb != null) {
                c889660YvENewBuilder.LIZLLL = C891130Yxb.ADAPTER.redact(c891130Yxb);
            }
            C892030Yz3 c892030Yz3 = c889660YvENewBuilder.LJ;
            if (c892030Yz3 != null) {
                c889660YvENewBuilder.LJ = C892030Yz3.ADAPTER.redact(c892030Yz3);
            }
            c889660YvENewBuilder.clearUnknownFields();
            return c889660YvENewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C889670YvF c889670YvF) {
            C889670YvF c889670YvF2 = c889670YvF;
            C891130Yxb.ADAPTER.encodeWithTag(protoWriter, 1, c889670YvF2.persistent_ext);
            C892030Yz3.ADAPTER.encodeWithTag(protoWriter, 2, c889670YvF2.transient_ext);
            protoWriter.writeBytes(c889670YvF2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.conversation.extension.proto.SettingPersistentExtra#ADAPTER", tag = 1)
    public final C891130Yxb persistent_ext;

    @WireField(adapter = "com.bytedance.im.conversation.extension.proto.SettingTransientExtra#ADAPTER", tag = 2)
    public final C892030Yz3 transient_ext;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C891130Yxb c891130Yxb = this.persistent_ext;
        int iHashCode2 = (iHashCode + (c891130Yxb != null ? c891130Yxb.hashCode() : 0)) * 37;
        C892030Yz3 c892030Yz3 = this.transient_ext;
        int iHashCode3 = iHashCode2 + (c892030Yz3 != null ? c892030Yz3.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C889660YvE newBuilder() {
        C889660YvE c889660YvE = new C889660YvE();
        c889660YvE.LIZLLL = this.persistent_ext;
        c889660YvE.LJ = this.transient_ext;
        c889660YvE.addUnknownFields(unknownFields());
        return c889660YvE;
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
        sb.replace(0, 2, "ConversationSettingExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C889670YvF)) {
            return false;
        }
        C889670YvF c889670YvF = (C889670YvF) obj;
        if (unknownFields().equals(c889670YvF.unknownFields()) && C1516540pZE.LJ(this.persistent_ext, c889670YvF.persistent_ext) && C1516540pZE.LJ(this.transient_ext, c889670YvF.transient_ext)) {
            return true;
        }
        return false;
    }

    public C889670YvF(C891130Yxb c891130Yxb, C892030Yz3 c892030Yz3) {
        this(c891130Yxb, c892030Yz3, ByteString.EMPTY);
    }

    public C889670YvF(C891130Yxb c891130Yxb, C892030Yz3 c892030Yz3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.persistent_ext = c891130Yxb;
        this.transient_ext = c892030Yz3;
    }
}
