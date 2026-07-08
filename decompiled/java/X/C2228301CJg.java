package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228301CJg extends Message<C2228301CJg, C2228321CJi> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long child;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long parent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long z_order;
    public static final ProtoAdapter<C2228301CJg> ADAPTER = new ProtoAdapter<C2228301CJg>() { // from class: X.1CJh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228301CJg decode(ProtoReader protoReader) {
            C2228321CJi c2228321CJi = new C2228321CJi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2228321CJi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2228321CJi.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2228321CJi.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2228321CJi.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228321CJi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228301CJg c2228301CJg) {
            C2228301CJg c2228301CJg2 = c2228301CJg;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2228301CJg2.parent) + protoAdapter.encodedSizeWithTag(2, c2228301CJg2.child) + protoAdapter.encodedSizeWithTag(3, c2228301CJg2.z_order) + c2228301CJg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228301CJg redact(C2228301CJg c2228301CJg) {
            C2228321CJi c2228321CJiNewBuilder = c2228301CJg.newBuilder();
            c2228321CJiNewBuilder.clearUnknownFields();
            return c2228321CJiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228301CJg c2228301CJg) {
            C2228301CJg c2228301CJg2 = c2228301CJg;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2228301CJg2.parent);
            protoAdapter.encodeWithTag(protoWriter, 2, c2228301CJg2.child);
            protoAdapter.encodeWithTag(protoWriter, 3, c2228301CJg2.z_order);
            protoWriter.writeBytes(c2228301CJg2.unknownFields());
        }
    };
    public static final Long DEFAULT_PARENT = 0L;
    public static final Long DEFAULT_CHILD = 0L;
    public static final Long DEFAULT_Z_ORDER = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.parent.hashCode()) * 37) + this.child.hashCode()) * 37) + this.z_order.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228321CJi newBuilder() {
        C2228321CJi c2228321CJi = new C2228321CJi();
        c2228321CJi.LIZLLL = this.parent;
        c2228321CJi.LJ = this.child;
        c2228321CJi.LJFF = this.z_order;
        c2228321CJi.addUnknownFields(unknownFields());
        return c2228321CJi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", parent=");
        sb.append(this.parent);
        sb.append(", child=");
        sb.append(this.child);
        sb.append(", z_order=");
        sb.append(this.z_order);
        sb.replace(0, 2, "FuncParamsX0026ed8aee0a39b6{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228301CJg)) {
            return false;
        }
        C2228301CJg c2228301CJg = (C2228301CJg) obj;
        if (unknownFields().equals(c2228301CJg.unknownFields()) && this.parent.equals(c2228301CJg.parent) && this.child.equals(c2228301CJg.child) && this.z_order.equals(c2228301CJg.z_order)) {
            return true;
        }
        return false;
    }

    public C2228301CJg(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public C2228301CJg(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parent = l;
        this.child = l2;
        this.z_order = l3;
    }
}
