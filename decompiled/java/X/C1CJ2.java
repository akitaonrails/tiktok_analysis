package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJ2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJ2 extends Message<C1CJ2, C1CJ4> {
    public static final ProtoAdapter<C1CJ2> ADAPTER = new ProtoAdapter<C1CJ2>() { // from class: X.1CJ3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJ2 decode(ProtoReader protoReader) {
            C1CJ4 c1cj4 = new C1CJ4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cj4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cj4.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cj4.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cj4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJ2 c1cj2) {
            C1CJ2 c1cj22 = c1cj2;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c1cj22.uid) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1cj22.link_mic_id) + c1cj22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJ2 redact(C1CJ2 c1cj2) {
            C1CJ4 c1cj4NewBuilder = c1cj2.newBuilder();
            c1cj4NewBuilder.clearUnknownFields();
            return c1cj4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CJ2 c1cj2) {
            C1CJ2 c1cj22 = c1cj2;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c1cj22.uid);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1cj22.link_mic_id);
            protoWriter.writeBytes(c1cj22.unknownFields());
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
    public C1CJ4 newBuilder() {
        C1CJ4 c1cj4 = new C1CJ4();
        c1cj4.LIZLLL = this.uid;
        c1cj4.LJ = this.link_mic_id;
        c1cj4.addUnknownFields(unknownFields());
        return c1cj4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsX84e6720e52274106{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CJ2)) {
            return false;
        }
        C1CJ2 c1cj2 = (C1CJ2) obj;
        if (unknownFields().equals(c1cj2.unknownFields()) && this.uid.equals(c1cj2.uid) && this.link_mic_id.equals(c1cj2.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C1CJ2(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public C1CJ2(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.link_mic_id = str;
    }
}
