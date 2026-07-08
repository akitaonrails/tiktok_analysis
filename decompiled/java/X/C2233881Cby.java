package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233881Cby extends Message<C2233881Cby, C2233901Cc0> {
    public static final ProtoAdapter<C2233881Cby> ADAPTER = new ProtoAdapter<C2233881Cby>() { // from class: X.1Cbz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233881Cby decode(ProtoReader protoReader) {
            C2233901Cc0 c2233901Cc0 = new C2233901Cc0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2233901Cc0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2233901Cc0.LJFF = C2233611CbX.ADAPTER.decode(protoReader);
                            }
                        } else {
                            try {
                                c2233901Cc0.LJ = EnumC2182321Ab0.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2233901Cc0.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        try {
                            c2233901Cc0.LIZLLL = EnumC2183371Ach.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c2233901Cc0.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233901Cc0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233881Cby c2233881Cby) {
            C2233881Cby c2233881Cby2 = c2233881Cby;
            return EnumC2183371Ach.ADAPTER.encodedSizeWithTag(1, c2233881Cby2.arch_type) + EnumC2182321Ab0.ADAPTER.encodedSizeWithTag(2, c2233881Cby2.source) + C2233611CbX.ADAPTER.encodedSizeWithTag(3, c2233881Cby2.biz_source) + c2233881Cby2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233881Cby redact(C2233881Cby c2233881Cby) {
            C2233901Cc0 c2233901Cc0NewBuilder = c2233881Cby.newBuilder();
            c2233901Cc0NewBuilder.LJFF = C2233611CbX.ADAPTER.redact(c2233901Cc0NewBuilder.LJFF);
            c2233901Cc0NewBuilder.clearUnknownFields();
            return c2233901Cc0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233881Cby c2233881Cby) {
            C2233881Cby c2233881Cby2 = c2233881Cby;
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 1, c2233881Cby2.arch_type);
            EnumC2182321Ab0.ADAPTER.encodeWithTag(protoWriter, 2, c2233881Cby2.source);
            C2233611CbX.ADAPTER.encodeWithTag(protoWriter, 3, c2233881Cby2.biz_source);
            protoWriter.writeBytes(c2233881Cby2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final EnumC2182321Ab0 DEFAULT_SOURCE = EnumC2182321Ab0.VAR_LINK_LAYOUT_END_SOURCE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "link_mic_sdk.proto.BizPipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2233611CbX biz_source;

    @WireField(adapter = "link_mic_sdk.proto.LinkLayoutEndSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2182321Ab0 source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.arch_type.hashCode()) * 37) + this.source.hashCode()) * 37) + this.biz_source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233901Cc0 newBuilder() {
        C2233901Cc0 c2233901Cc0 = new C2233901Cc0();
        c2233901Cc0.LIZLLL = this.arch_type;
        c2233901Cc0.LJ = this.source;
        c2233901Cc0.LJFF = this.biz_source;
        c2233901Cc0.addUnknownFields(unknownFields());
        return c2233901Cc0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", biz_source=");
        sb.append(this.biz_source);
        sb.replace(0, 2, "FuncParamsX3ae531d833ef2aa2{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233881Cby)) {
            return false;
        }
        C2233881Cby c2233881Cby = (C2233881Cby) obj;
        if (unknownFields().equals(c2233881Cby.unknownFields()) && this.arch_type.equals(c2233881Cby.arch_type) && this.source.equals(c2233881Cby.source) && this.biz_source.equals(c2233881Cby.biz_source)) {
            return true;
        }
        return false;
    }

    public C2233881Cby(EnumC2183371Ach enumC2183371Ach, EnumC2182321Ab0 enumC2182321Ab0, C2233611CbX c2233611CbX) {
        this(enumC2183371Ach, enumC2182321Ab0, c2233611CbX, ByteString.EMPTY);
    }

    public C2233881Cby(EnumC2183371Ach enumC2183371Ach, EnumC2182321Ab0 enumC2182321Ab0, C2233611CbX c2233611CbX, ByteString byteString) {
        super(ADAPTER, byteString);
        this.arch_type = enumC2183371Ach;
        this.source = enumC2182321Ab0;
        this.biz_source = c2233611CbX;
    }
}
