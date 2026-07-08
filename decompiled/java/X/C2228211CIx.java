package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2228211CIx extends Message<C2228211CIx, C2228221CIy> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkArchType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2183371Ach arch_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean interrupted_by_co_host;
    public static final ProtoAdapter<C2228211CIx> ADAPTER = new ProtoAdapter<C2228211CIx>() { // from class: X.1CIw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228211CIx decode(ProtoReader protoReader) {
            C2228221CIy c2228221CIy = new C2228221CIy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2228221CIy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c2228221CIy.LJ = EnumC2183371Ach.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2228221CIy.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2228221CIy.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2228221CIy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2228211CIx c2228211CIx) {
            C2228211CIx c2228211CIx2 = c2228211CIx;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c2228211CIx2.interrupted_by_co_host) + EnumC2183371Ach.ADAPTER.encodedSizeWithTag(2, c2228211CIx2.arch_type) + c2228211CIx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2228211CIx redact(C2228211CIx c2228211CIx) {
            C2228221CIy c2228221CIyNewBuilder = c2228211CIx.newBuilder();
            c2228221CIyNewBuilder.clearUnknownFields();
            return c2228221CIyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2228211CIx c2228211CIx) {
            C2228211CIx c2228211CIx2 = c2228211CIx;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2228211CIx2.interrupted_by_co_host);
            EnumC2183371Ach.ADAPTER.encodeWithTag(protoWriter, 2, c2228211CIx2.arch_type);
            protoWriter.writeBytes(c2228211CIx2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_INTERRUPTED_BY_CO_HOST = Boolean.FALSE;
    public static final EnumC2183371Ach DEFAULT_ARCH_TYPE = EnumC2183371Ach.VAR_LINK_ARCH_TYPE_UNKNOWN;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.interrupted_by_co_host.hashCode()) * 37) + this.arch_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2228221CIy newBuilder() {
        C2228221CIy c2228221CIy = new C2228221CIy();
        c2228221CIy.LIZLLL = this.interrupted_by_co_host;
        c2228221CIy.LJ = this.arch_type;
        c2228221CIy.addUnknownFields(unknownFields());
        return c2228221CIy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", interrupted_by_co_host=");
        sb.append(this.interrupted_by_co_host);
        sb.append(", arch_type=");
        sb.append(this.arch_type);
        sb.replace(0, 2, "LinkMicImFinishChannelModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2228211CIx)) {
            return false;
        }
        C2228211CIx c2228211CIx = (C2228211CIx) obj;
        if (unknownFields().equals(c2228211CIx.unknownFields()) && this.interrupted_by_co_host.equals(c2228211CIx.interrupted_by_co_host) && this.arch_type.equals(c2228211CIx.arch_type)) {
            return true;
        }
        return false;
    }

    public C2228211CIx(Boolean bool, EnumC2183371Ach enumC2183371Ach) {
        this(bool, enumC2183371Ach, ByteString.EMPTY);
    }

    public C2228211CIx(Boolean bool, EnumC2183371Ach enumC2183371Ach, ByteString byteString) {
        super(ADAPTER, byteString);
        this.interrupted_by_co_host = bool;
        this.arch_type = enumC2183371Ach;
    }
}
