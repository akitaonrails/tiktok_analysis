package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CUu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2231301CUu extends Message<C2231301CUu, C2231321CUw> {
    public static final ProtoAdapter<C2231301CUu> ADAPTER = new ProtoAdapter<C2231301CUu>() { // from class: X.1CUv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231301CUu decode(ProtoReader protoReader) {
            C2231321CUw c2231321CUw = new C2231321CUw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2231321CUw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2231321CUw.LJFF = C1CZU.ADAPTER.decode(protoReader);
                            }
                        } else {
                            try {
                                c2231321CUw.LJ = EnumC2183371Ach.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2231321CUw.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2231321CUw.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2231321CUw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2231301CUu c2231301CUu) {
            C2231301CUu c2231301CUu2 = c2231301CUu;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2231301CUu2.link_mic_id) + EnumC2183371Ach.ADAPTER.encodedSizeWithTag(2, c2231301CUu2.link_arch_type) + C1CZU.ADAPTER.encodedSizeWithTag(3, c2231301CUu2.user_link_rtc_state_change_context) + c2231301CUu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2231301CUu redact(C2231301CUu c2231301CUu) {
            C2231321CUw c2231321CUwNewBuilder = c2231301CUu.newBuilder();
            c2231321CUwNewBuilder.LJFF = C1CZU.ADAPTER.redact(c2231321CUwNewBuilder.LJFF);
            c2231321CUwNewBuilder.clearUnknownFields();
            return c2231321CUwNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2231301CUu c2231301CUu) {
            C2231301CUu c2231301CUu2 = c2231301CUu;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2231301CUu2.link_mic_id);
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 2, c2231301CUu2.link_arch_type);
            C1CZU.ADAPTER.encodeWithTag(protoWriter, 3, c2231301CUu2.user_link_rtc_state_change_context);
            protoWriter.writeBytes(c2231301CUu2.unknownFields());
        }
    };
    public static final EnumC2183371Ach DEFAULT_LINK_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2183371Ach link_arch_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    @WireField(adapter = "link_mic_sdk.proto.UserLinkRtcStateChangeContext#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C1CZU user_link_rtc_state_change_context;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.link_mic_id.hashCode()) * 37) + this.link_arch_type.hashCode()) * 37) + this.user_link_rtc_state_change_context.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2231321CUw newBuilder() {
        C2231321CUw c2231321CUw = new C2231321CUw();
        c2231321CUw.LIZLLL = this.link_mic_id;
        c2231321CUw.LJ = this.link_arch_type;
        c2231321CUw.LJFF = this.user_link_rtc_state_change_context;
        c2231321CUw.addUnknownFields(unknownFields());
        return c2231321CUw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", link_arch_type=");
        sb.append(this.link_arch_type);
        sb.append(", user_link_rtc_state_change_context=");
        sb.append(this.user_link_rtc_state_change_context);
        sb.replace(0, 2, "FuncParamsXe85a3ea5489c414e{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2231301CUu)) {
            return false;
        }
        C2231301CUu c2231301CUu = (C2231301CUu) obj;
        if (unknownFields().equals(c2231301CUu.unknownFields()) && this.link_mic_id.equals(c2231301CUu.link_mic_id) && this.link_arch_type.equals(c2231301CUu.link_arch_type) && this.user_link_rtc_state_change_context.equals(c2231301CUu.user_link_rtc_state_change_context)) {
            return true;
        }
        return false;
    }

    public C2231301CUu(String str, EnumC2183371Ach enumC2183371Ach, C1CZU c1czu) {
        this(str, enumC2183371Ach, c1czu, ByteString.EMPTY);
    }

    public C2231301CUu(String str, EnumC2183371Ach enumC2183371Ach, C1CZU c1czu, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.link_arch_type = enumC2183371Ach;
        this.user_link_rtc_state_change_context = c1czu;
    }
}
