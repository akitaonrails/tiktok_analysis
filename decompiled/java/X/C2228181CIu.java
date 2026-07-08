package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228181CIu extends Message<C2228181CIu, C2228191CIv> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2183371Ach link_arch_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long uid;
    public static final ProtoAdapter<C2228181CIu> ADAPTER = new ProtoAdapter<C2228181CIu>() { // from class: X.1CIt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228181CIu decode(ProtoReader protoReader) {
            C2228191CIv c2228191CIv = new C2228191CIv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228191CIv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c2228191CIv.LJ = EnumC2183371Ach.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2228191CIv.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2228191CIv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228191CIv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228181CIu c2228181CIu) {
            C2228181CIu c2228181CIu2 = c2228181CIu;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2228181CIu2.uid) + EnumC2183371Ach.ADAPTER.encodedSizeWithTag(2, c2228181CIu2.link_arch_type) + c2228181CIu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228181CIu redact(C2228181CIu c2228181CIu) {
            C2228191CIv c2228191CIvNewBuilder = c2228181CIu.newBuilder();
            c2228191CIvNewBuilder.clearUnknownFields();
            return c2228191CIvNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228181CIu c2228181CIu) {
            C2228181CIu c2228181CIu2 = c2228181CIu;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2228181CIu2.uid);
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 2, c2228181CIu2.link_arch_type);
            protoWriter.writeBytes(c2228181CIu2.unknownFields());
        }
    };
    public static final Long DEFAULT_UID = 0L;
    public static final EnumC2183371Ach DEFAULT_LINK_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.uid.hashCode()) * 37) + this.link_arch_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228191CIv newBuilder() {
        C2228191CIv c2228191CIv = new C2228191CIv();
        c2228191CIv.LIZLLL = this.uid;
        c2228191CIv.LJ = this.link_arch_type;
        c2228191CIv.addUnknownFields(unknownFields());
        return c2228191CIv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", uid=");
        sb.append(this.uid);
        sb.append(", link_arch_type=");
        sb.append(this.link_arch_type);
        sb.replace(0, 2, "FuncParamsX426cd4c8561673c8{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228181CIu)) {
            return false;
        }
        C2228181CIu c2228181CIu = (C2228181CIu) obj;
        if (unknownFields().equals(c2228181CIu.unknownFields()) && this.uid.equals(c2228181CIu.uid) && this.link_arch_type.equals(c2228181CIu.link_arch_type)) {
            return true;
        }
        return false;
    }

    public C2228181CIu(Long l, EnumC2183371Ach enumC2183371Ach) {
        this(l, enumC2183371Ach, ByteString.EMPTY);
    }

    public C2228181CIu(Long l, EnumC2183371Ach enumC2183371Ach, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uid = l;
        this.link_arch_type = enumC2183371Ach;
    }
}
