package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Crj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243651Crj extends Message<C2243651Crj, C2243751Crt> {
    public static final ProtoAdapter<C2243651Crj> ADAPTER = new ProtoAdapter<C2243651Crj>() { // from class: X.1Crm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243651Crj decode(ProtoReader protoReader) {
            C2243751Crt c2243751Crt = new C2243751Crt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2243751Crt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2243751Crt.LIZLLL.add(C2243641Cri.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243751Crt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243651Crj c2243651Crj) {
            C2243651Crj c2243651Crj2 = c2243651Crj;
            return C2243641Cri.ADAPTER.asRepeated().encodedSizeWithTag(1, c2243651Crj2.users) + c2243651Crj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243651Crj redact(C2243651Crj c2243651Crj) {
            C2243751Crt c2243751CrtNewBuilder = c2243651Crj.newBuilder();
            C1516540pZE.LJIIIZ(c2243751CrtNewBuilder.LIZLLL, C2243641Cri.ADAPTER);
            c2243751CrtNewBuilder.clearUnknownFields();
            return c2243751CrtNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243651Crj c2243651Crj) {
            C2243651Crj c2243651Crj2 = c2243651Crj;
            C2243641Cri.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2243651Crj2.users);
            protoWriter.writeBytes(c2243651Crj2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.UserInfo#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C2243641Cri> users;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.users.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2243751Crt newBuilder() {
        C2243751Crt c2243751Crt = new C2243751Crt();
        c2243751Crt.LIZLLL = C1516540pZE.LIZJ("users", this.users);
        c2243751Crt.addUnknownFields(unknownFields());
        return c2243751Crt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.users.isEmpty()) {
            sb.append(", users=");
            sb.append(this.users);
        }
        sb.replace(0, 2, "AvatarDuoInfo{");
        sb.append('}');
        return sb.toString();
    }

    public C2243651Crj(List<C2243641Cri> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243651Crj)) {
            return false;
        }
        C2243651Crj c2243651Crj = (C2243651Crj) obj;
        if (unknownFields().equals(c2243651Crj.unknownFields()) && this.users.equals(c2243651Crj.users)) {
            return true;
        }
        return false;
    }

    public C2243651Crj(List<C2243641Cri> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.users = C1516540pZE.LJFF("users", list);
    }
}
