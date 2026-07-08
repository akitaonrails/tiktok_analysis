package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228331CJj extends Message<C2228331CJj, C2228351CJl> {
    public static final ProtoAdapter<C2228331CJj> ADAPTER = new ProtoAdapter<C2228331CJj>() { // from class: X.1CJk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228331CJj decode(ProtoReader protoReader) {
            C2228351CJl c2228351CJl = new C2228351CJl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2228351CJl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2228351CJl.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2228351CJl.LJ = C2232561CZq.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2228351CJl.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228351CJl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228331CJj c2228331CJj) {
            C2228331CJj c2228331CJj2 = c2228331CJj;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2228331CJj2.container) + C2232561CZq.ADAPTER.encodedSizeWithTag(2, c2228331CJj2.frame) + protoAdapter.encodedSizeWithTag(3, c2228331CJj2.z_order) + c2228331CJj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228331CJj redact(C2228331CJj c2228331CJj) {
            C2228351CJl c2228351CJlNewBuilder = c2228331CJj.newBuilder();
            c2228351CJlNewBuilder.LJ = C2232561CZq.ADAPTER.redact(c2228351CJlNewBuilder.LJ);
            c2228351CJlNewBuilder.clearUnknownFields();
            return c2228351CJlNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228331CJj c2228331CJj) {
            C2228331CJj c2228331CJj2 = c2228331CJj;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2228331CJj2.container);
            C2232561CZq.ADAPTER.encodeWithTag(protoWriter, 2, c2228331CJj2.frame);
            protoAdapter.encodeWithTag(protoWriter, 3, c2228331CJj2.z_order);
            protoWriter.writeBytes(c2228331CJj2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONTAINER = 0L;
    public static final Long DEFAULT_Z_ORDER = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long container;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutRect#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232561CZq frame;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long z_order;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.container.hashCode()) * 37) + this.frame.hashCode()) * 37) + this.z_order.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228351CJl newBuilder() {
        C2228351CJl c2228351CJl = new C2228351CJl();
        c2228351CJl.LIZLLL = this.container;
        c2228351CJl.LJ = this.frame;
        c2228351CJl.LJFF = this.z_order;
        c2228351CJl.addUnknownFields(unknownFields());
        return c2228351CJl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", container=");
        sb.append(this.container);
        sb.append(", frame=");
        sb.append(this.frame);
        sb.append(", z_order=");
        sb.append(this.z_order);
        sb.replace(0, 2, "FuncParamsX355f3ac1cf0a2f4a{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228331CJj)) {
            return false;
        }
        C2228331CJj c2228331CJj = (C2228331CJj) obj;
        if (unknownFields().equals(c2228331CJj.unknownFields()) && this.container.equals(c2228331CJj.container) && this.frame.equals(c2228331CJj.frame) && this.z_order.equals(c2228331CJj.z_order)) {
            return true;
        }
        return false;
    }

    public C2228331CJj(Long l, C2232561CZq c2232561CZq, Long l2) {
        this(l, c2232561CZq, l2, ByteString.EMPTY);
    }

    public C2228331CJj(Long l, C2232561CZq c2232561CZq, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.container = l;
        this.frame = c2232561CZq;
        this.z_order = l2;
    }
}
