package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CIG extends Message<C1CIG, C1CII> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long instance_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long type_id;
    public static final ProtoAdapter<C1CIG> ADAPTER = new ProtoAdapter<C1CIG>() { // from class: X.1CIH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIG decode(ProtoReader protoReader) {
            C1CII c1cii = new C1CII();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cii.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cii.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cii.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cii.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CIG c1cig) {
            C1CIG c1cig2 = c1cig;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1cig2.type_id) + protoAdapter.encodedSizeWithTag(2, c1cig2.instance_id) + c1cig2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CIG redact(C1CIG c1cig) {
            C1CII c1ciiNewBuilder = c1cig.newBuilder();
            c1ciiNewBuilder.clearUnknownFields();
            return c1ciiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CIG c1cig) {
            C1CIG c1cig2 = c1cig;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cig2.type_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cig2.instance_id);
            protoWriter.writeBytes(c1cig2.unknownFields());
        }
    };
    public static final Long DEFAULT_TYPE_ID = 0L;
    public static final Long DEFAULT_INSTANCE_ID = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.type_id.hashCode()) * 37) + this.instance_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CII newBuilder() {
        C1CII c1cii = new C1CII();
        c1cii.LIZLLL = this.type_id;
        c1cii.LJ = this.instance_id;
        c1cii.addUnknownFields(unknownFields());
        return c1cii;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", type_id=");
        sb.append(this.type_id);
        sb.append(", instance_id=");
        sb.append(this.instance_id);
        sb.replace(0, 2, "MoltenFfiInstanceMsg{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CIG)) {
            return false;
        }
        C1CIG c1cig = (C1CIG) obj;
        if (unknownFields().equals(c1cig.unknownFields()) && this.type_id.equals(c1cig.type_id) && this.instance_id.equals(c1cig.instance_id)) {
            return true;
        }
        return false;
    }

    public C1CIG(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public C1CIG(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type_id = l;
        this.instance_id = l2;
    }
}
