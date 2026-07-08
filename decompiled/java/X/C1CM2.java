package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CM2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CM2 extends Message<C1CM2, C1CM4> {
    public static final ProtoAdapter<C1CM2> ADAPTER = new ProtoAdapter<C1CM2>() { // from class: X.1CM3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CM2 decode(ProtoReader protoReader) {
            C1CM4 c1cm4 = new C1CM4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cm4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cm4.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1cm4.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cm4.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cm4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CM2 c1cm2) {
            C1CM2 c1cm22 = c1cm2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cm22.str_uid) + protoAdapter.encodedSizeWithTag(2, c1cm22.stream_id) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c1cm22.is_audio) + c1cm22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CM2 redact(C1CM2 c1cm2) {
            C1CM4 c1cm4NewBuilder = c1cm2.newBuilder();
            c1cm4NewBuilder.clearUnknownFields();
            return c1cm4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CM2 c1cm2) {
            C1CM2 c1cm22 = c1cm2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cm22.str_uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cm22.stream_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, c1cm22.is_audio);
            protoWriter.writeBytes(c1cm22.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_AUDIO = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean is_audio;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String str_uid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String stream_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.str_uid.hashCode()) * 37;
        String str = this.stream_id;
        int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.is_audio.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CM4 newBuilder() {
        C1CM4 c1cm4 = new C1CM4();
        c1cm4.LIZLLL = this.str_uid;
        c1cm4.LJ = this.stream_id;
        c1cm4.LJFF = this.is_audio;
        c1cm4.addUnknownFields(unknownFields());
        return c1cm4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", str_uid=");
        sb.append(this.str_uid);
        if (this.stream_id != null) {
            sb.append(", stream_id=");
            sb.append(this.stream_id);
        }
        sb.append(", is_audio=");
        sb.append(this.is_audio);
        sb.replace(0, 2, "LinkMicInteractSession{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CM2)) {
            return false;
        }
        C1CM2 c1cm2 = (C1CM2) obj;
        if (unknownFields().equals(c1cm2.unknownFields()) && this.str_uid.equals(c1cm2.str_uid) && C1516540pZE.LJ(this.stream_id, c1cm2.stream_id) && this.is_audio.equals(c1cm2.is_audio)) {
            return true;
        }
        return false;
    }

    public C1CM2(String str, String str2, Boolean bool) {
        this(str, str2, bool, ByteString.EMPTY);
    }

    public C1CM2(String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.str_uid = str;
        this.stream_id = str2;
        this.is_audio = bool;
    }
}
