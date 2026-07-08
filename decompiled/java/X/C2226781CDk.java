package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226781CDk extends Message<C2226781CDk, C2226801CDm> {
    public static final ProtoAdapter<C2226781CDk> ADAPTER = new ProtoAdapter<C2226781CDk>() { // from class: X.1CDl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226781CDk decode(ProtoReader protoReader) {
            C2226801CDm c2226801CDm = new C2226801CDm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2226801CDm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2226801CDm.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2226801CDm.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226801CDm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226781CDk c2226781CDk) {
            C2226781CDk c2226781CDk2 = c2226781CDk;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2226781CDk2.link_mic_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2226781CDk2.is_mute) + c2226781CDk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226781CDk redact(C2226781CDk c2226781CDk) {
            C2226801CDm c2226801CDmNewBuilder = c2226781CDk.newBuilder();
            c2226801CDmNewBuilder.clearUnknownFields();
            return c2226801CDmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226781CDk c2226781CDk) {
            C2226781CDk c2226781CDk2 = c2226781CDk;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2226781CDk2.link_mic_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2226781CDk2.is_mute);
            protoWriter.writeBytes(c2226781CDk2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_MUTE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean is_mute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.link_mic_id.hashCode()) * 37) + this.is_mute.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226801CDm newBuilder() {
        C2226801CDm c2226801CDm = new C2226801CDm();
        c2226801CDm.LIZLLL = this.link_mic_id;
        c2226801CDm.LJ = this.is_mute;
        c2226801CDm.addUnknownFields(unknownFields());
        return c2226801CDm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", is_mute=");
        sb.append(this.is_mute);
        sb.replace(0, 2, "FuncParamsX99dd528c5917b614{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226781CDk)) {
            return false;
        }
        C2226781CDk c2226781CDk = (C2226781CDk) obj;
        if (unknownFields().equals(c2226781CDk.unknownFields()) && this.link_mic_id.equals(c2226781CDk.link_mic_id) && this.is_mute.equals(c2226781CDk.is_mute)) {
            return true;
        }
        return false;
    }

    public C2226781CDk(String str, Boolean bool) {
        this(str, bool, ByteString.EMPTY);
    }

    public C2226781CDk(String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.is_mute = bool;
    }
}
