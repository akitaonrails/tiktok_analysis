package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Ceb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235511Ceb extends Message<C2235511Ceb, C2235531Ced> {
    public static final ProtoAdapter<C2235511Ceb> ADAPTER = new ProtoAdapter<C2235511Ceb>() { // from class: X.1Cec
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235511Ceb decode(ProtoReader protoReader) {
            C2235531Ced c2235531Ced = new C2235531Ced();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2235531Ced.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    c2235531Ced.LJFF = EnumC2183371Ach.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2235531Ced.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            try {
                                c2235531Ced.LJ = EnumC1282070jT3.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2235531Ced.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                        }
                    } else {
                        c2235531Ced.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2235531Ced.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2235511Ceb c2235511Ceb) {
            C2235511Ceb c2235511Ceb2 = c2235511Ceb;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2235511Ceb2.invoke_id) + EnumC1282070jT3.ADAPTER.encodedSizeWithTag(2, c2235511Ceb2.finish_reason) + EnumC2183371Ach.ADAPTER.encodedSizeWithTag(3, c2235511Ceb2.link_arch_type) + c2235511Ceb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2235511Ceb redact(C2235511Ceb c2235511Ceb) {
            C2235531Ced c2235531CedNewBuilder = c2235511Ceb.newBuilder();
            c2235531CedNewBuilder.clearUnknownFields();
            return c2235531CedNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2235511Ceb c2235511Ceb) {
            C2235511Ceb c2235511Ceb2 = c2235511Ceb;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2235511Ceb2.invoke_id);
            EnumC1282070jT3.ADAPTER.encodeWithTag(protoWriter, 2, c2235511Ceb2.finish_reason);
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 3, c2235511Ceb2.link_arch_type);
            protoWriter.writeBytes(c2235511Ceb2.unknownFields());
        }
    };
    public static final EnumC1282070jT3 DEFAULT_FINISH_REASON = EnumC1282070jT3.VAR_LINK_MIC_FINISH_CHANNEL_REASON_UNKNOWN;
    public static final EnumC2183371Ach DEFAULT_LINK_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicFinishChannelReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC1282070jT3 finish_reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC2183371Ach link_arch_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.finish_reason.hashCode()) * 37) + this.link_arch_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2235531Ced newBuilder() {
        C2235531Ced c2235531Ced = new C2235531Ced();
        c2235531Ced.LIZLLL = this.invoke_id;
        c2235531Ced.LJ = this.finish_reason;
        c2235531Ced.LJFF = this.link_arch_type;
        c2235531Ced.addUnknownFields(unknownFields());
        return c2235531Ced;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", finish_reason=");
        sb.append(this.finish_reason);
        sb.append(", link_arch_type=");
        sb.append(this.link_arch_type);
        sb.replace(0, 2, "LinkMicFinishChannelParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2235511Ceb)) {
            return false;
        }
        C2235511Ceb c2235511Ceb = (C2235511Ceb) obj;
        if (unknownFields().equals(c2235511Ceb.unknownFields()) && this.invoke_id.equals(c2235511Ceb.invoke_id) && this.finish_reason.equals(c2235511Ceb.finish_reason) && this.link_arch_type.equals(c2235511Ceb.link_arch_type)) {
            return true;
        }
        return false;
    }

    public C2235511Ceb(String str, EnumC1282070jT3 enumC1282070jT3, EnumC2183371Ach enumC2183371Ach) {
        this(str, enumC1282070jT3, enumC2183371Ach, ByteString.EMPTY);
    }

    public C2235511Ceb(String str, EnumC1282070jT3 enumC1282070jT3, EnumC2183371Ach enumC2183371Ach, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.finish_reason = enumC1282070jT3;
        this.link_arch_type = enumC2183371Ach;
    }
}
