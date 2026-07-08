package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226721CDe extends Message<C2226721CDe, C2226741CDg> {
    public static final ProtoAdapter<C2226721CDe> ADAPTER = new ProtoAdapter<C2226721CDe>() { // from class: X.1CDf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226721CDe decode(ProtoReader protoReader) {
            C2226741CDg c2226741CDg = new C2226741CDg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2226741CDg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2226741CDg.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2226741CDg.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226741CDg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226721CDe c2226721CDe) {
            C2226721CDe c2226721CDe2 = c2226721CDe;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2226721CDe2.is_video_mute) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2226721CDe2.link_mic_id) + c2226721CDe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226721CDe redact(C2226721CDe c2226721CDe) {
            C2226741CDg c2226741CDgNewBuilder = c2226721CDe.newBuilder();
            c2226741CDgNewBuilder.clearUnknownFields();
            return c2226741CDgNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226721CDe c2226721CDe) {
            C2226721CDe c2226721CDe2 = c2226721CDe;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2226721CDe2.is_video_mute);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2226721CDe2.link_mic_id);
            protoWriter.writeBytes(c2226721CDe2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_VIDEO_MUTE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean is_video_mute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.is_video_mute.hashCode()) * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226741CDg newBuilder() {
        C2226741CDg c2226741CDg = new C2226741CDg();
        c2226741CDg.LIZLLL = this.is_video_mute;
        c2226741CDg.LJ = this.link_mic_id;
        c2226741CDg.addUnknownFields(unknownFields());
        return c2226741CDg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_video_mute=");
        sb.append(this.is_video_mute);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsX02943317026052e9{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226721CDe)) {
            return false;
        }
        C2226721CDe c2226721CDe = (C2226721CDe) obj;
        if (unknownFields().equals(c2226721CDe.unknownFields()) && this.is_video_mute.equals(c2226721CDe.is_video_mute) && this.link_mic_id.equals(c2226721CDe.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C2226721CDe(Boolean bool, String str) {
        this(bool, str, ByteString.EMPTY);
    }

    public C2226721CDe(Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_video_mute = bool;
        this.link_mic_id = str;
    }
}
