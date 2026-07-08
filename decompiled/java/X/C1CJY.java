package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJY extends Message<C1CJY, C2228241CJa> {
    public static final ProtoAdapter<C1CJY> ADAPTER = new ProtoAdapter<C1CJY>() { // from class: X.1CJZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJY decode(ProtoReader protoReader) {
            C2228241CJa c2228241CJa = new C2228241CJa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228241CJa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228241CJa.LIZLLL = C2228361CJm.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228241CJa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJY c1cjy) {
            C1CJY c1cjy2 = c1cjy;
            return C2228361CJm.ADAPTER.encodedSizeWithTag(1, c1cjy2.key) + c1cjy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJY redact(C1CJY c1cjy) {
            C2228241CJa c2228241CJaNewBuilder = c1cjy.newBuilder();
            c2228241CJaNewBuilder.LIZLLL = C2228361CJm.ADAPTER.redact(c2228241CJaNewBuilder.LIZLLL);
            c2228241CJaNewBuilder.clearUnknownFields();
            return c2228241CJaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CJY c1cjy) {
            C1CJY c1cjy2 = c1cjy;
            C2228361CJm.ADAPTER.encodeWithTag(protoWriter, 1, c1cjy2.key);
            protoWriter.writeBytes(c1cjy2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicSetting#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2228361CJm key;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.key.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228241CJa newBuilder() {
        C2228241CJa c2228241CJa = new C2228241CJa();
        c2228241CJa.LIZLLL = this.key;
        c2228241CJa.addUnknownFields(unknownFields());
        return c2228241CJa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.replace(0, 2, "FuncParamsXbb645b8eeabec4a9{");
        sb.append('}');
        return sb.toString();
    }

    public C1CJY(C2228361CJm c2228361CJm) {
        this(c2228361CJm, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CJY)) {
            return false;
        }
        C1CJY c1cjy = (C1CJY) obj;
        if (unknownFields().equals(c1cjy.unknownFields()) && this.key.equals(c1cjy.key)) {
            return true;
        }
        return false;
    }

    public C1CJY(C2228361CJm c2228361CJm, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = c2228361CJm;
    }
}
