package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233641Cba extends Message<C2233641Cba, C2233661Cbc> {
    public static final ProtoAdapter<C2233641Cba> ADAPTER = new ProtoAdapter<C2233641Cba>() { // from class: X.1Cbb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233641Cba decode(ProtoReader protoReader) {
            C2233661Cbc c2233661Cbc = new C2233661Cbc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2233661Cbc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2233661Cbc.LJI = C2233611CbX.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2233661Cbc.LJFF.add(ProtoAdapter.INT64.decode(protoReader));
                            }
                        } else {
                            c2233661Cbc.LJ = ProtoAdapter.BYTES.decode(protoReader);
                        }
                    } else {
                        try {
                            c2233661Cbc.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2233661Cbc.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233661Cbc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233641Cba c2233641Cba) {
            C2233641Cba c2233641Cba2 = c2233641Cba;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2233641Cba2.arch_type) + ProtoAdapter.BYTES.encodedSizeWithTag(2, c2233641Cba2.layout_data_bytes) + ProtoAdapter.INT64.asPacked().encodedSizeWithTag(3, c2233641Cba2.consumer_list) + C2233611CbX.ADAPTER.encodedSizeWithTag(4, c2233641Cba2.biz_source) + c2233641Cba2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233641Cba redact(C2233641Cba c2233641Cba) {
            C2233661Cbc c2233661CbcNewBuilder = c2233641Cba.newBuilder();
            c2233661CbcNewBuilder.LJI = C2233611CbX.ADAPTER.redact(c2233661CbcNewBuilder.LJI);
            c2233661CbcNewBuilder.clearUnknownFields();
            return c2233661CbcNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233641Cba c2233641Cba) {
            C2233641Cba c2233641Cba2 = c2233641Cba;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2233641Cba2.arch_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, c2233641Cba2.layout_data_bytes);
            ProtoAdapter.INT64.asPacked().encodeWithTag(protoWriter, 3, c2233641Cba2.consumer_list);
            C2233611CbX.ADAPTER.encodeWithTag(protoWriter, 4, c2233641Cba2.biz_source);
            protoWriter.writeBytes(c2233641Cba2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final ByteString DEFAULT_LAYOUT_DATA_BYTES = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.BizPipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final C2233611CbX biz_source;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.PACKED, tag = 3)
    public final List<Long> consumer_list;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 2)
    public final ByteString layout_data_bytes;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.layout_data_bytes.hashCode()) * 37) + this.consumer_list.hashCode()) * 37) + this.biz_source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233661Cbc newBuilder() {
        C2233661Cbc c2233661Cbc = new C2233661Cbc();
        c2233661Cbc.LIZLLL = this.arch_type;
        c2233661Cbc.LJ = this.layout_data_bytes;
        c2233661Cbc.LJFF = C1516540pZE.LIZJ("consumer_list", this.consumer_list);
        c2233661Cbc.LJI = this.biz_source;
        c2233661Cbc.addUnknownFields(unknownFields());
        return c2233661Cbc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", layout_data_bytes=");
        sb.append(this.layout_data_bytes);
        if (!this.consumer_list.isEmpty()) {
            sb.append(", consumer_list=");
            sb.append(this.consumer_list);
        }
        sb.append(", biz_source=");
        sb.append(this.biz_source);
        sb.replace(0, 2, "FuncParamsX81b1127fd7e87329{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233641Cba)) {
            return false;
        }
        C2233641Cba c2233641Cba = (C2233641Cba) obj;
        if (unknownFields().equals(c2233641Cba.unknownFields()) && this.arch_type.equals(c2233641Cba.arch_type) && this.layout_data_bytes.equals(c2233641Cba.layout_data_bytes) && this.consumer_list.equals(c2233641Cba.consumer_list) && this.biz_source.equals(c2233641Cba.biz_source)) {
            return true;
        }
        return false;
    }

    public C2233641Cba(EnumC2183371Ach enumC2183371Ach, ByteString byteString, List<Long> list, C2233611CbX c2233611CbX) {
        this(enumC2183371Ach, byteString, list, c2233611CbX, ByteString.EMPTY);
    }

    public C2233641Cba(EnumC2183371Ach enumC2183371Ach, ByteString byteString, List<Long> list, C2233611CbX c2233611CbX, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.arch_type = enumC2183371Ach;
        this.layout_data_bytes = byteString;
        this.consumer_list = C1516540pZE.LJFF("consumer_list", list);
        this.biz_source = c2233611CbX;
    }
}
