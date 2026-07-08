package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248801D0c extends Message<C2248801D0c, C2248821D0e> {
    public static final ProtoAdapter<C2248801D0c> ADAPTER = new ProtoAdapter<C2248801D0c>() { // from class: X.1D0d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248801D0c decode(ProtoReader protoReader) {
            C2248821D0e c2248821D0e = new C2248821D0e();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 7) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2248821D0e.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2248821D0e.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2248821D0e.LIZLLL = C2248831D0f.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2248821D0e.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2248801D0c c2248801D0c) {
            C2248801D0c c2248801D0c2 = c2248801D0c;
            return C2248831D0f.ADAPTER.encodedSizeWithTag(1, c2248801D0c2.user_base) + ProtoAdapter.INT64.encodedSizeWithTag(7, c2248801D0c2.id) + c2248801D0c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248801D0c redact(C2248801D0c c2248801D0c) {
            C2248821D0e c2248821D0eNewBuilder = c2248801D0c.newBuilder();
            C2248831D0f c2248831D0f = c2248821D0eNewBuilder.LIZLLL;
            if (c2248831D0f != null) {
                c2248821D0eNewBuilder.LIZLLL = C2248831D0f.ADAPTER.redact(c2248831D0f);
            }
            c2248821D0eNewBuilder.clearUnknownFields();
            return c2248821D0eNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2248801D0c c2248801D0c) {
            C2248801D0c c2248801D0c2 = c2248801D0c;
            C2248831D0f.ADAPTER.encodeWithTag(protoWriter, 1, c2248801D0c2.user_base);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, c2248801D0c2.id);
            protoWriter.writeBytes(c2248801D0c2.unknownFields());
        }
    };
    public static final Long DEFAULT_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long id;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.UserBaseDTO#ADAPTER", tag = 1)
    public final C2248831D0f user_base;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2248831D0f c2248831D0f = this.user_base;
        int iHashCode2 = (iHashCode + (c2248831D0f != null ? c2248831D0f.hashCode() : 0)) * 37;
        Long l = this.id;
        int iHashCode3 = iHashCode2 + (l != null ? l.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2248821D0e newBuilder() {
        C2248821D0e c2248821D0e = new C2248821D0e();
        c2248821D0e.LIZLLL = this.user_base;
        c2248821D0e.LJ = this.id;
        c2248821D0e.addUnknownFields(unknownFields());
        return c2248821D0e;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.user_base != null) {
            sb.append(", user_base=");
            sb.append(this.user_base);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        sb.replace(0, 2, "UserInfoStruct{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2248801D0c)) {
            return false;
        }
        C2248801D0c c2248801D0c = (C2248801D0c) obj;
        if (unknownFields().equals(c2248801D0c.unknownFields()) && C1516540pZE.LJ(this.user_base, c2248801D0c.user_base) && C1516540pZE.LJ(this.id, c2248801D0c.id)) {
            return true;
        }
        return false;
    }

    public C2248801D0c(C2248831D0f c2248831D0f, Long l) {
        this(c2248831D0f, l, ByteString.EMPTY);
    }

    public C2248801D0c(C2248831D0f c2248831D0f, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_base = c2248831D0f;
        this.id = l;
    }
}
