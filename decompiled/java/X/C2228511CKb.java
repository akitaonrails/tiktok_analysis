package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228511CKb extends Message<C2228511CKb, C2228531CKd> {
    public static final ProtoAdapter<C2228511CKb> ADAPTER = new ProtoAdapter<C2228511CKb>() { // from class: X.1CKc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228511CKb decode(ProtoReader protoReader) {
            C2228531CKd c2228531CKd = new C2228531CKd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228531CKd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2228531CKd.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2228531CKd.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228531CKd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228511CKb c2228511CKb) {
            C2228511CKb c2228511CKb2 = c2228511CKb;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2228511CKb2.audio_occupied) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2228511CKb2.link_mic_id) + c2228511CKb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228511CKb redact(C2228511CKb c2228511CKb) {
            C2228531CKd c2228531CKdNewBuilder = c2228511CKb.newBuilder();
            c2228531CKdNewBuilder.clearUnknownFields();
            return c2228531CKdNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228511CKb c2228511CKb) {
            C2228511CKb c2228511CKb2 = c2228511CKb;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2228511CKb2.audio_occupied);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2228511CKb2.link_mic_id);
            protoWriter.writeBytes(c2228511CKb2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_AUDIO_OCCUPIED = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean audio_occupied;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.audio_occupied.hashCode()) * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228531CKd newBuilder() {
        C2228531CKd c2228531CKd = new C2228531CKd();
        c2228531CKd.LIZLLL = this.audio_occupied;
        c2228531CKd.LJ = this.link_mic_id;
        c2228531CKd.addUnknownFields(unknownFields());
        return c2228531CKd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", audio_occupied=");
        sb.append(this.audio_occupied);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsXb4f53360966b5e68{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228511CKb)) {
            return false;
        }
        C2228511CKb c2228511CKb = (C2228511CKb) obj;
        if (unknownFields().equals(c2228511CKb.unknownFields()) && this.audio_occupied.equals(c2228511CKb.audio_occupied) && this.link_mic_id.equals(c2228511CKb.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C2228511CKb(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public C2228511CKb(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.audio_occupied = bool;
        this.link_mic_id = str;
    }
}
