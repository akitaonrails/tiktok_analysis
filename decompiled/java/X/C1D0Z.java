package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D0Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1D0Z extends Message<C1D0Z, C2248791D0b> {
    public static final ProtoAdapter<C1D0Z> ADAPTER = new ProtoAdapter<C1D0Z>() { // from class: X.1D0a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D0Z decode(ProtoReader protoReader) {
            C2248791D0b c2248791D0b = new C2248791D0b();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2248791D0b.LIZLLL = C2248801D0c.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2248791D0b.LJ = C2248801D0c.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2248791D0b.LJFF = C898010ZKt.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2248791D0b.LJI.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            c2248791D0b.LJII = C1D0R.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2248791D0b.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2248791D0b.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2248791D0b.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1D0Z c1d0z) {
            C1D0Z c1d0z2 = c1d0z;
            ProtoAdapter<C2248801D0c> protoAdapter = C2248801D0c.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1d0z2.sender_user_info) + protoAdapter.encodedSizeWithTag(2, c1d0z2.receiver_user_info) + C898010ZKt.ADAPTER.encodedSizeWithTag(3, c1d0z2.b2c_info);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(4, c1d0z2.labels) + C1D0R.ADAPTER.encodedSizeWithTag(5, c1d0z2.user_relation_info) + protoAdapter2.encodedSizeWithTag(6, c1d0z2.timezone) + c1d0z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D0Z redact(C1D0Z c1d0z) {
            C2248791D0b c2248791D0bNewBuilder = c1d0z.newBuilder();
            C2248801D0c c2248801D0c = c2248791D0bNewBuilder.LIZLLL;
            if (c2248801D0c != null) {
                c2248791D0bNewBuilder.LIZLLL = C2248801D0c.ADAPTER.redact(c2248801D0c);
            }
            C2248801D0c c2248801D0c2 = c2248791D0bNewBuilder.LJ;
            if (c2248801D0c2 != null) {
                c2248791D0bNewBuilder.LJ = C2248801D0c.ADAPTER.redact(c2248801D0c2);
            }
            C898010ZKt c898010ZKt = c2248791D0bNewBuilder.LJFF;
            if (c898010ZKt != null) {
                c2248791D0bNewBuilder.LJFF = C898010ZKt.ADAPTER.redact(c898010ZKt);
            }
            C1D0R c1d0r = c2248791D0bNewBuilder.LJII;
            if (c1d0r != null) {
                c2248791D0bNewBuilder.LJII = C1D0R.ADAPTER.redact(c1d0r);
            }
            c2248791D0bNewBuilder.clearUnknownFields();
            return c2248791D0bNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1D0Z c1d0z) {
            C1D0Z c1d0z2 = c1d0z;
            ProtoAdapter<C2248801D0c> protoAdapter = C2248801D0c.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c1d0z2.sender_user_info);
            protoAdapter.encodeWithTag(protoWriter, 2, c1d0z2.receiver_user_info);
            C898010ZKt.ADAPTER.encodeWithTag(protoWriter, 3, c1d0z2.b2c_info);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, c1d0z2.labels);
            C1D0R.ADAPTER.encodeWithTag(protoWriter, 5, c1d0z2.user_relation_info);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1d0z2.timezone);
            protoWriter.writeBytes(c1d0z2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.B2CInfoStruct#ADAPTER", tag = 3)
    public final C898010ZKt b2c_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 4)
    public final List<String> labels;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.UserInfoStruct#ADAPTER", tag = 2)
    public final C2248801D0c receiver_user_info;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.UserInfoStruct#ADAPTER", tag = 1)
    public final C2248801D0c sender_user_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String timezone;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.UserRelationStruct#ADAPTER", tag = 5)
    public final C1D0R user_relation_info;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2248801D0c c2248801D0c = this.sender_user_info;
        int iHashCode2 = (iHashCode + (c2248801D0c != null ? c2248801D0c.hashCode() : 0)) * 37;
        C2248801D0c c2248801D0c2 = this.receiver_user_info;
        int iHashCode3 = (iHashCode2 + (c2248801D0c2 != null ? c2248801D0c2.hashCode() : 0)) * 37;
        C898010ZKt c898010ZKt = this.b2c_info;
        int iHashCode4 = (((iHashCode3 + (c898010ZKt != null ? c898010ZKt.hashCode() : 0)) * 37) + this.labels.hashCode()) * 37;
        C1D0R c1d0r = this.user_relation_info;
        int iHashCode5 = (iHashCode4 + (c1d0r != null ? c1d0r.hashCode() : 0)) * 37;
        String str = this.timezone;
        int iHashCode6 = iHashCode5 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2248791D0b newBuilder() {
        C2248791D0b c2248791D0b = new C2248791D0b();
        c2248791D0b.LIZLLL = this.sender_user_info;
        c2248791D0b.LJ = this.receiver_user_info;
        c2248791D0b.LJFF = this.b2c_info;
        c2248791D0b.LJI = C1516540pZE.LIZJ("labels", this.labels);
        c2248791D0b.LJII = this.user_relation_info;
        c2248791D0b.LJIIIIZZ = this.timezone;
        c2248791D0b.addUnknownFields(unknownFields());
        return c2248791D0b;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.sender_user_info != null) {
            sb.append(", sender_user_info=");
            sb.append(this.sender_user_info);
        }
        if (this.receiver_user_info != null) {
            sb.append(", receiver_user_info=");
            sb.append(this.receiver_user_info);
        }
        if (this.b2c_info != null) {
            sb.append(", b2c_info=");
            sb.append(this.b2c_info);
        }
        if (!this.labels.isEmpty()) {
            sb.append(", labels=");
            sb.append(this.labels);
        }
        if (this.user_relation_info != null) {
            sb.append(", user_relation_info=");
            sb.append(this.user_relation_info);
        }
        if (this.timezone != null) {
            sb.append(", timezone=");
            sb.append(this.timezone);
        }
        sb.replace(0, 2, "TransientExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1D0Z)) {
            return false;
        }
        C1D0Z c1d0z = (C1D0Z) obj;
        if (unknownFields().equals(c1d0z.unknownFields()) && C1516540pZE.LJ(this.sender_user_info, c1d0z.sender_user_info) && C1516540pZE.LJ(this.receiver_user_info, c1d0z.receiver_user_info) && C1516540pZE.LJ(this.b2c_info, c1d0z.b2c_info) && this.labels.equals(c1d0z.labels) && C1516540pZE.LJ(this.user_relation_info, c1d0z.user_relation_info) && C1516540pZE.LJ(this.timezone, c1d0z.timezone)) {
            return true;
        }
        return false;
    }

    public C1D0Z(C2248801D0c c2248801D0c, C2248801D0c c2248801D0c2, C898010ZKt c898010ZKt, List<String> list, C1D0R c1d0r, String str) {
        this(c2248801D0c, c2248801D0c2, c898010ZKt, list, c1d0r, str, ByteString.EMPTY);
    }

    public C1D0Z(C2248801D0c c2248801D0c, C2248801D0c c2248801D0c2, C898010ZKt c898010ZKt, List<String> list, C1D0R c1d0r, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sender_user_info = c2248801D0c;
        this.receiver_user_info = c2248801D0c2;
        this.b2c_info = c898010ZKt;
        this.labels = C1516540pZE.LJFF("labels", list);
        this.user_relation_info = c1d0r;
        this.timezone = str;
    }
}
