package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226181CBc extends Message<C2226181CBc, C2226201CBe> {
    public static final ProtoAdapter<C2226181CBc> ADAPTER = new ProtoAdapter<C2226181CBc>() { // from class: X.1CBd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226181CBc decode(ProtoReader protoReader) {
            C2226201CBe c2226201CBe = new C2226201CBe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2226201CBe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2226201CBe.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2226201CBe.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226201CBe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226181CBc c2226181CBc) {
            C2226181CBc c2226181CBc2 = c2226181CBc;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2226181CBc2.link_mic_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2226181CBc2.position) + c2226181CBc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226181CBc redact(C2226181CBc c2226181CBc) {
            C2226201CBe c2226201CBeNewBuilder = c2226181CBc.newBuilder();
            c2226201CBeNewBuilder.clearUnknownFields();
            return c2226201CBeNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226181CBc c2226181CBc) {
            C2226181CBc c2226181CBc2 = c2226181CBc;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2226181CBc2.link_mic_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2226181CBc2.position);
            protoWriter.writeBytes(c2226181CBc2.unknownFields());
        }
    };
    public static final Long DEFAULT_POSITION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long position;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.link_mic_id.hashCode()) * 37) + this.position.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226201CBe newBuilder() {
        C2226201CBe c2226201CBe = new C2226201CBe();
        c2226201CBe.LIZLLL = this.link_mic_id;
        c2226201CBe.LJ = this.position;
        c2226201CBe.addUnknownFields(unknownFields());
        return c2226201CBe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", position=");
        sb.append(this.position);
        sb.replace(0, 2, "LinkMicPosition{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2226181CBc)) {
            return false;
        }
        C2226181CBc c2226181CBc = (C2226181CBc) obj;
        if (unknownFields().equals(c2226181CBc.unknownFields()) && this.link_mic_id.equals(c2226181CBc.link_mic_id) && this.position.equals(c2226181CBc.position)) {
            return true;
        }
        return false;
    }

    public C2226181CBc(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public C2226181CBc(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.position = l;
    }
}
