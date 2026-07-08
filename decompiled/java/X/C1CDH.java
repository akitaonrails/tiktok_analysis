package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CDH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CDH extends Message<C1CDH, C1CDJ> {
    public static final ProtoAdapter<C1CDH> ADAPTER = new ProtoAdapter<C1CDH>() { // from class: X.1CDI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDH decode(ProtoReader protoReader) {
            C1CDJ c1cdj = new C1CDJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cdj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cdj.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cdj.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cdj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CDH c1cdh) {
            C1CDH c1cdh2 = c1cdh;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cdh2.link_mic_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c1cdh2.volume) + c1cdh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CDH redact(C1CDH c1cdh) {
            C1CDJ c1cdjNewBuilder = c1cdh.newBuilder();
            c1cdjNewBuilder.clearUnknownFields();
            return c1cdjNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CDH c1cdh) {
            C1CDH c1cdh2 = c1cdh;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cdh2.link_mic_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c1cdh2.volume);
            protoWriter.writeBytes(c1cdh2.unknownFields());
        }
    };
    public static final Long DEFAULT_VOLUME = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long volume;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.link_mic_id.hashCode()) * 37) + this.volume.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CDJ newBuilder() {
        C1CDJ c1cdj = new C1CDJ();
        c1cdj.LIZLLL = this.link_mic_id;
        c1cdj.LJ = this.volume;
        c1cdj.addUnknownFields(unknownFields());
        return c1cdj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", volume=");
        sb.append(this.volume);
        sb.replace(0, 2, "FuncParamsXd0a07b18a3db4481{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CDH)) {
            return false;
        }
        C1CDH c1cdh = (C1CDH) obj;
        if (unknownFields().equals(c1cdh.unknownFields()) && this.link_mic_id.equals(c1cdh.link_mic_id) && this.volume.equals(c1cdh.volume)) {
            return true;
        }
        return false;
    }

    public C1CDH(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public C1CDH(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.volume = l;
    }
}
