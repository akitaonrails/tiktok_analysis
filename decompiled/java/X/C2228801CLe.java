package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228801CLe extends Message<C2228801CLe, C2228821CLg> {
    public static final ProtoAdapter<C2228801CLe> ADAPTER = new ProtoAdapter<C2228801CLe>() { // from class: X.1CLf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228801CLe decode(ProtoReader protoReader) {
            C2228821CLg c2228821CLg = new C2228821CLg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2228821CLg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2228821CLg.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228821CLg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228801CLe c2228801CLe) {
            C2228801CLe c2228801CLe2 = c2228801CLe;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2228801CLe2.link_mic_id) + c2228801CLe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228801CLe redact(C2228801CLe c2228801CLe) {
            C2228821CLg c2228821CLgNewBuilder = c2228801CLe.newBuilder();
            c2228821CLgNewBuilder.clearUnknownFields();
            return c2228821CLgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228801CLe c2228801CLe) {
            C2228801CLe c2228801CLe2 = c2228801CLe;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2228801CLe2.link_mic_id);
            protoWriter.writeBytes(c2228801CLe2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228821CLg newBuilder() {
        C2228821CLg c2228821CLg = new C2228821CLg();
        c2228821CLg.LIZLLL = this.link_mic_id;
        c2228821CLg.addUnknownFields(unknownFields());
        return c2228821CLg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsX6e926a1c3e9d6fc5{");
        sb.append('}');
        return sb.toString();
    }

    public C2228801CLe(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228801CLe)) {
            return false;
        }
        C2228801CLe c2228801CLe = (C2228801CLe) obj;
        if (unknownFields().equals(c2228801CLe.unknownFields()) && this.link_mic_id.equals(c2228801CLe.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C2228801CLe(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
    }
}
