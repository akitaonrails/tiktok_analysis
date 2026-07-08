package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229861CPg extends Message<C2229861CPg, C2229871CPh> {
    public static final ProtoAdapter<C2229861CPg> ADAPTER = new ProtoAdapter<C2229861CPg>() { // from class: X.1CPf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229861CPg decode(ProtoReader protoReader) {
            C2229871CPh c2229871CPh = new C2229871CPh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2229871CPh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2229871CPh.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2229871CPh.LJ = C2233531CbP.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c2229871CPh.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2229871CPh.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229871CPh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229861CPg c2229861CPg) {
            C2229861CPg c2229861CPg2 = c2229861CPg;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2229861CPg2.arch_type) + C2233531CbP.ADAPTER.encodedSizeWithTag(2, c2229861CPg2.layout_data) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2229861CPg2.parse_layout_cost_ms) + c2229861CPg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229861CPg redact(C2229861CPg c2229861CPg) {
            C2229871CPh c2229871CPhNewBuilder = c2229861CPg.newBuilder();
            c2229871CPhNewBuilder.LJ = C2233531CbP.ADAPTER.redact(c2229871CPhNewBuilder.LJ);
            c2229871CPhNewBuilder.clearUnknownFields();
            return c2229871CPhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229861CPg c2229861CPg) {
            C2229861CPg c2229861CPg2 = c2229861CPg;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2229861CPg2.arch_type);
            C2233531CbP.ADAPTER.encodeWithTag(protoWriter, 2, c2229861CPg2.layout_data);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2229861CPg2.parse_layout_cost_ms);
            protoWriter.writeBytes(c2229861CPg2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final Long DEFAULT_PARSE_LAYOUT_COST_MS = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutData#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2233531CbP layout_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long parse_layout_cost_ms;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.layout_data.hashCode()) * 37) + this.parse_layout_cost_ms.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229871CPh newBuilder() {
        C2229871CPh c2229871CPh = new C2229871CPh();
        c2229871CPh.LIZLLL = this.arch_type;
        c2229871CPh.LJ = this.layout_data;
        c2229871CPh.LJFF = this.parse_layout_cost_ms;
        c2229871CPh.addUnknownFields(unknownFields());
        return c2229871CPh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", layout_data=");
        sb.append(this.layout_data);
        sb.append(", parse_layout_cost_ms=");
        sb.append(this.parse_layout_cost_ms);
        sb.replace(0, 2, "FuncParamsX3ca3f8f9ba559e55{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229861CPg)) {
            return false;
        }
        C2229861CPg c2229861CPg = (C2229861CPg) obj;
        if (unknownFields().equals(c2229861CPg.unknownFields()) && this.arch_type.equals(c2229861CPg.arch_type) && this.layout_data.equals(c2229861CPg.layout_data) && this.parse_layout_cost_ms.equals(c2229861CPg.parse_layout_cost_ms)) {
            return true;
        }
        return false;
    }

    public C2229861CPg(EnumC2183371Ach enumC2183371Ach, C2233531CbP c2233531CbP, Long l) {
        this(enumC2183371Ach, c2233531CbP, l, ByteString.EMPTY);
    }

    public C2229861CPg(EnumC2183371Ach enumC2183371Ach, C2233531CbP c2233531CbP, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.layout_data = c2233531CbP;
        this.parse_layout_cost_ms = l;
    }
}
