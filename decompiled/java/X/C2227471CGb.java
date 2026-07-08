package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227471CGb extends Message<C2227471CGb, C2227481CGc> {
    public static final ProtoAdapter<C2227471CGb> ADAPTER = new ProtoAdapter<C2227471CGb>() { // from class: X.1CGa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227471CGb decode(ProtoReader protoReader) {
            C2227481CGc c2227481CGc = new C2227481CGc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227481CGc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227481CGc.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227481CGc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227471CGb c2227471CGb) {
            C2227471CGb c2227471CGb2 = c2227471CGb;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2227471CGb2.anchor_id) + c2227471CGb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227471CGb redact(C2227471CGb c2227471CGb) {
            C2227481CGc c2227481CGcNewBuilder = c2227471CGb.newBuilder();
            c2227481CGcNewBuilder.clearUnknownFields();
            return c2227481CGcNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227471CGb c2227471CGb) {
            C2227471CGb c2227471CGb2 = c2227471CGb;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2227471CGb2.anchor_id);
            protoWriter.writeBytes(c2227471CGb2.unknownFields());
        }
    };
    public static final Long DEFAULT_ANCHOR_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long anchor_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.anchor_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227481CGc newBuilder() {
        C2227481CGc c2227481CGc = new C2227481CGc();
        c2227481CGc.LIZLLL = this.anchor_id;
        c2227481CGc.addUnknownFields(unknownFields());
        return c2227481CGc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", anchor_id=");
        sb.append(this.anchor_id);
        sb.replace(0, 2, "LinkMicMultiLiveBizCancelApplyParams{");
        sb.append('}');
        return sb.toString();
    }

    public C2227471CGb(Long l) {
        this(l, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227471CGb)) {
            return false;
        }
        C2227471CGb c2227471CGb = (C2227471CGb) obj;
        if (unknownFields().equals(c2227471CGb.unknownFields()) && this.anchor_id.equals(c2227471CGb.anchor_id)) {
            return true;
        }
        return false;
    }

    public C2227471CGb(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.anchor_id = l;
    }
}
