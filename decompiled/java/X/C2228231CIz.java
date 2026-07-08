package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228231CIz extends Message<C2228231CIz, C1CJ1> {
    public static final ProtoAdapter<C2228231CIz> ADAPTER = new ProtoAdapter<C2228231CIz>() { // from class: X.1CJ0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228231CIz decode(ProtoReader protoReader) {
            C1CJ1 c1cj1 = new C1CJ1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cj1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cj1.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cj1.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cj1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228231CIz c2228231CIz) {
            C2228231CIz c2228231CIz2 = c2228231CIz;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2228231CIz2.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2228231CIz2.link_mic_id) + c2228231CIz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228231CIz redact(C2228231CIz c2228231CIz) {
            C1CJ1 c1cj1NewBuilder = c2228231CIz.newBuilder();
            c1cj1NewBuilder.clearUnknownFields();
            return c1cj1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228231CIz c2228231CIz) {
            C2228231CIz c2228231CIz2 = c2228231CIz;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2228231CIz2.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c2228231CIz2.link_mic_id);
            protoWriter.writeBytes(c2228231CIz2.unknownFields());
        }
    };
    public static final Long DEFAULT_UID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long uid;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.uid.hashCode()) * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CJ1 newBuilder() {
        C1CJ1 c1cj1 = new C1CJ1();
        c1cj1.LIZLLL = this.uid;
        c1cj1.LJ = this.link_mic_id;
        c1cj1.addUnknownFields(unknownFields());
        return c1cj1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsX08240fb2afb17ffe{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228231CIz)) {
            return false;
        }
        C2228231CIz c2228231CIz = (C2228231CIz) obj;
        if (unknownFields().equals(c2228231CIz.unknownFields()) && this.uid.equals(c2228231CIz.uid) && this.link_mic_id.equals(c2228231CIz.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C2228231CIz(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public C2228231CIz(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.link_mic_id = str;
    }
}
