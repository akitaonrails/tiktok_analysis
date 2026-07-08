package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231191CUj extends Message<C2231191CUj, C2231211CUl> {
    public static final ProtoAdapter<C2231191CUj> ADAPTER = new ProtoAdapter<C2231191CUj>() { // from class: X.1CUk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231191CUj decode(ProtoReader protoReader) {
            C2231211CUl c2231211CUl = new C2231211CUl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2231211CUl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2231211CUl.LJ = ProtoAdapter.BYTES.decode(protoReader);
                        }
                    } else {
                        try {
                            c2231211CUl.LIZLLL = EnumC2231221CUm.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2231211CUl.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231211CUl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231191CUj c2231191CUj) {
            C2231191CUj c2231191CUj2 = c2231191CUj;
            return EnumC2231221CUm.ADAPTER.encodedSizeWithTag(1, c2231191CUj2.compensate_type) + ProtoAdapter.BYTES.encodedSizeWithTag(2, c2231191CUj2.message) + c2231191CUj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231191CUj redact(C2231191CUj c2231191CUj) {
            C2231211CUl c2231211CUlNewBuilder = c2231191CUj.newBuilder();
            c2231211CUlNewBuilder.clearUnknownFields();
            return c2231211CUlNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231191CUj c2231191CUj) {
            C2231191CUj c2231191CUj2 = c2231191CUj;
            EnumC2231221CUm.ADAPTER.encodeWithTag(protoWriter, 1, c2231191CUj2.compensate_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, c2231191CUj2.message);
            protoWriter.writeBytes(c2231191CUj2.unknownFields());
        }
    };
    public static final EnumC2231221CUm DEFAULT_COMPENSATE_TYPE = EnumC2231221CUm.VAR_LINK_MIC_COMPENSATE_IM_TYPE_INVITE;
    public static final ByteString DEFAULT_MESSAGE = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicCompensateImType#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final EnumC2231221CUm compensate_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 2)
    public final ByteString message;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.compensate_type.hashCode()) * 37) + this.message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2231211CUl newBuilder() {
        C2231211CUl c2231211CUl = new C2231211CUl();
        c2231211CUl.LIZLLL = this.compensate_type;
        c2231211CUl.LJ = this.message;
        c2231211CUl.addUnknownFields(unknownFields());
        return c2231211CUl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", compensate_type=");
        sb.append(this.compensate_type);
        sb.append(", message=");
        sb.append(this.message);
        sb.replace(0, 2, "FuncParamsX2b35f3242aaa4d03{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231191CUj)) {
            return false;
        }
        C2231191CUj c2231191CUj = (C2231191CUj) obj;
        if (unknownFields().equals(c2231191CUj.unknownFields()) && this.compensate_type.equals(c2231191CUj.compensate_type) && this.message.equals(c2231191CUj.message)) {
            return true;
        }
        return false;
    }

    public C2231191CUj(EnumC2231221CUm enumC2231221CUm, ByteString byteString) {
        this(enumC2231221CUm, byteString, ByteString.EMPTY);
    }

    public C2231191CUj(EnumC2231221CUm enumC2231221CUm, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.compensate_type = enumC2231221CUm;
        this.message = byteString;
    }
}
