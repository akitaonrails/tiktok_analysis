package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6G, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6G extends Message<C1C6G, C1C6H> {
    public static final ProtoAdapter<C1C6G> ADAPTER = new ProtoAdapter<C1C6G>() { // from class: X.1C6F
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C6G decode(ProtoReader protoReader) {
            C1C6H c1c6h = new C1C6H();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c6h.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        try {
                            c1c6h.LIZLLL = EnumC1282190jTF.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1c6h.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c6h.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C6G c1c6g) {
            C1C6G c1c6g2 = c1c6g;
            return EnumC1282190jTF.ADAPTER.encodedSizeWithTag(1, c1c6g2.rtc_link_mic_type) + c1c6g2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C6G redact(C1C6G c1c6g) {
            C1C6H c1c6hNewBuilder = c1c6g.newBuilder();
            c1c6hNewBuilder.clearUnknownFields();
            return c1c6hNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C6G c1c6g) {
            C1C6G c1c6g2 = c1c6g;
            EnumC1282190jTF.ADAPTER.encodeWithTag(protoWriter, 1, c1c6g2.rtc_link_mic_type);
            protoWriter.writeBytes(c1c6g2.unknownFields());
        }
    };
    public static final EnumC1282190jTF DEFAULT_RTC_LINK_MIC_TYPE = EnumC1282190jTF.VAR_RTC_LINK_MIC_TYPE_NONE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.RtcLinkMicType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC1282190jTF rtc_link_mic_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.rtc_link_mic_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C6H newBuilder() {
        C1C6H c1c6h = new C1C6H();
        c1c6h.LIZLLL = this.rtc_link_mic_type;
        c1c6h.addUnknownFields(unknownFields());
        return c1c6h;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", rtc_link_mic_type=");
        sb.append(this.rtc_link_mic_type);
        sb.replace(0, 2, "FuncParamsXf38ede0b2b4c9457{");
        sb.append('}');
        return sb.toString();
    }

    public C1C6G(EnumC1282190jTF enumC1282190jTF) {
        this(enumC1282190jTF, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1C6G)) {
            return false;
        }
        C1C6G c1c6g = (C1C6G) obj;
        if (unknownFields().equals(c1c6g.unknownFields()) && this.rtc_link_mic_type.equals(c1c6g.rtc_link_mic_type)) {
            return true;
        }
        return false;
    }

    public C1C6G(EnumC1282190jTF enumC1282190jTF, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rtc_link_mic_type = enumC1282190jTF;
    }
}
