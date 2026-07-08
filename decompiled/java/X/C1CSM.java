package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CSM, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CSM extends Message<C1CSM, C1CSO> {
    public static final ProtoAdapter<C1CSM> ADAPTER = new ProtoAdapter<C1CSM>() { // from class: X.1CSN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSM decode(ProtoReader protoReader) {
            C1CSO c1cso = new C1CSO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cso.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cso.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cso.LIZLLL = ProtoAdapter.BYTES.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cso.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CSM c1csm) {
            C1CSM c1csm2 = c1csm;
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, c1csm2.avatar) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1csm2.link_mic_id) + c1csm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CSM redact(C1CSM c1csm) {
            C1CSO c1csoNewBuilder = c1csm.newBuilder();
            c1csoNewBuilder.clearUnknownFields();
            return c1csoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CSM c1csm) {
            C1CSM c1csm2 = c1csm;
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, c1csm2.avatar);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1csm2.link_mic_id);
            protoWriter.writeBytes(c1csm2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_AVATAR = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 1)
    public final ByteString avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.avatar;
        int iHashCode2 = ((iHashCode + (byteString != null ? byteString.hashCode() : 0)) * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CSO newBuilder() {
        C1CSO c1cso = new C1CSO();
        c1cso.LIZLLL = this.avatar;
        c1cso.LJ = this.link_mic_id;
        c1cso.addUnknownFields(unknownFields());
        return c1cso;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.avatar != null) {
            sb.append(", avatar=");
            sb.append(this.avatar);
        }
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsX01b19a479072d838{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CSM)) {
            return false;
        }
        C1CSM c1csm = (C1CSM) obj;
        if (unknownFields().equals(c1csm.unknownFields()) && C1516540pZE.LJ(this.avatar, c1csm.avatar) && this.link_mic_id.equals(c1csm.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C1CSM(ByteString byteString, String str) {
        this(byteString, str, ByteString.EMPTY);
    }

    public C1CSM(ByteString byteString, String str, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.avatar = byteString;
        this.link_mic_id = str;
    }
}
