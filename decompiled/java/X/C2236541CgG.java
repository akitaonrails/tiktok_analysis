package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CgG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236541CgG extends Message<C2236541CgG, C2236561CgI> {
    public static final ProtoAdapter<C2236541CgG> ADAPTER = new ProtoAdapter<C2236541CgG>() { // from class: X.1CgH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236541CgG decode(ProtoReader protoReader) {
            C2236561CgI c2236561CgI = new C2236561CgI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2236561CgI.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    c2236561CgI.LJFF = EnumC2231991CXl.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2236561CgI.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c2236561CgI.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2236561CgI.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236561CgI.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236541CgG c2236541CgG) {
            C2236541CgG c2236541CgG2 = c2236541CgG;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c2236541CgG2.effective_seconds) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c2236541CgG2.notice_confirmed) + EnumC2231991CXl.ADAPTER.encodedSizeWithTag(3, c2236541CgG2.permit_type) + c2236541CgG2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236541CgG redact(C2236541CgG c2236541CgG) {
            C2236561CgI c2236561CgINewBuilder = c2236541CgG.newBuilder();
            c2236561CgINewBuilder.clearUnknownFields();
            return c2236561CgINewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236541CgG c2236541CgG) {
            C2236541CgG c2236541CgG2 = c2236541CgG;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2236541CgG2.effective_seconds);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c2236541CgG2.notice_confirmed);
            EnumC2231991CXl.ADAPTER.encodeWithTag(protoWriter, 3, c2236541CgG2.permit_type);
            protoWriter.writeBytes(c2236541CgG2.unknownFields());
        }
    };
    public static final Long DEFAULT_EFFECTIVE_SECONDS = 0L;
    public static final Boolean DEFAULT_NOTICE_CONFIRMED = Boolean.FALSE;
    public static final EnumC2231991CXl DEFAULT_PERMIT_TYPE = EnumC2231991CXl.VAR_MULTI_GUEST_PERMIT_TYPE_PERMIT_TYPE_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long effective_seconds;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 2)
    public final Boolean notice_confirmed;

    @WireField(adapter = "link_mic_sdk.proto.MultiGuestPermitType#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC2231991CXl permit_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.effective_seconds.hashCode()) * 37) + this.notice_confirmed.hashCode()) * 37) + this.permit_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236561CgI newBuilder() {
        C2236561CgI c2236561CgI = new C2236561CgI();
        c2236561CgI.LIZLLL = this.effective_seconds;
        c2236561CgI.LJ = this.notice_confirmed;
        c2236561CgI.LJFF = this.permit_type;
        c2236561CgI.addUnknownFields(unknownFields());
        return c2236561CgI;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", effective_seconds=");
        sb.append(this.effective_seconds);
        sb.append(", notice_confirmed=");
        sb.append(this.notice_confirmed);
        sb.append(", permit_type=");
        sb.append(this.permit_type);
        sb.replace(0, 2, "LinkMicMultiLiveBizPermitParams{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236541CgG)) {
            return false;
        }
        C2236541CgG c2236541CgG = (C2236541CgG) obj;
        if (unknownFields().equals(c2236541CgG.unknownFields()) && this.effective_seconds.equals(c2236541CgG.effective_seconds) && this.notice_confirmed.equals(c2236541CgG.notice_confirmed) && this.permit_type.equals(c2236541CgG.permit_type)) {
            return true;
        }
        return false;
    }

    public C2236541CgG(Long l, Boolean bool, EnumC2231991CXl enumC2231991CXl) {
        this(l, bool, enumC2231991CXl, ByteString.EMPTY);
    }

    public C2236541CgG(Long l, Boolean bool, EnumC2231991CXl enumC2231991CXl, ByteString byteString) {
        super(ADAPTER, byteString);
        this.effective_seconds = l;
        this.notice_confirmed = bool;
        this.permit_type = enumC2231991CXl;
    }
}
