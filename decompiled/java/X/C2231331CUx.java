package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231331CUx extends Message<C2231331CUx, C2231351CUz> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2183371Ach link_arch_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long uid;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkStateChangeContext#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CZO user_link_state_change_context;
    public static final ProtoAdapter<C2231331CUx> ADAPTER = new ProtoAdapter<C2231331CUx>() { // from class: X.1CUy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231331CUx decode(ProtoReader protoReader) {
            C2231351CUz c2231351CUz = new C2231351CUz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2231351CUz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2231351CUz.LJFF = C1CZO.ADAPTER.decode(protoReader);
                            }
                        } else {
                            try {
                                c2231351CUz.LJ = EnumC2183371Ach.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2231351CUz.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2231351CUz.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231351CUz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231331CUx c2231331CUx) {
            C2231331CUx c2231331CUx2 = c2231331CUx;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2231331CUx2.uid) + EnumC2183371Ach.ADAPTER.encodedSizeWithTag(2, c2231331CUx2.link_arch_type) + C1CZO.ADAPTER.encodedSizeWithTag(3, c2231331CUx2.user_link_state_change_context) + c2231331CUx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231331CUx redact(C2231331CUx c2231331CUx) {
            C2231351CUz c2231351CUzNewBuilder = c2231331CUx.newBuilder();
            c2231351CUzNewBuilder.LJFF = C1CZO.ADAPTER.redact(c2231351CUzNewBuilder.LJFF);
            c2231351CUzNewBuilder.clearUnknownFields();
            return c2231351CUzNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231331CUx c2231331CUx) {
            C2231331CUx c2231331CUx2 = c2231331CUx;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2231331CUx2.uid);
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 2, c2231331CUx2.link_arch_type);
            C1CZO.ADAPTER.encodeWithTag(protoWriter, 3, c2231331CUx2.user_link_state_change_context);
            protoWriter.writeBytes(c2231331CUx2.unknownFields());
        }
    };
    public static final Long DEFAULT_UID = 0L;
    public static final EnumC2183371Ach DEFAULT_LINK_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.uid.hashCode()) * 37) + this.link_arch_type.hashCode()) * 37) + this.user_link_state_change_context.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2231351CUz newBuilder() {
        C2231351CUz c2231351CUz = new C2231351CUz();
        c2231351CUz.LIZLLL = this.uid;
        c2231351CUz.LJ = this.link_arch_type;
        c2231351CUz.LJFF = this.user_link_state_change_context;
        c2231351CUz.addUnknownFields(unknownFields());
        return c2231351CUz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", link_arch_type=");
        sb.append(this.link_arch_type);
        sb.append(", user_link_state_change_context=");
        sb.append(this.user_link_state_change_context);
        sb.replace(0, 2, "FuncParamsXabb9991e4b048056{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231331CUx)) {
            return false;
        }
        C2231331CUx c2231331CUx = (C2231331CUx) obj;
        if (unknownFields().equals(c2231331CUx.unknownFields()) && this.uid.equals(c2231331CUx.uid) && this.link_arch_type.equals(c2231331CUx.link_arch_type) && this.user_link_state_change_context.equals(c2231331CUx.user_link_state_change_context)) {
            return true;
        }
        return false;
    }

    public C2231331CUx(Long l, EnumC2183371Ach enumC2183371Ach, C1CZO c1czo) {
        this(l, enumC2183371Ach, c1czo, ByteString.EMPTY);
    }

    public C2231331CUx(Long l, EnumC2183371Ach enumC2183371Ach, C1CZO c1czo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.link_arch_type = enumC2183371Ach;
        this.user_link_state_change_context = c1czo;
    }
}
