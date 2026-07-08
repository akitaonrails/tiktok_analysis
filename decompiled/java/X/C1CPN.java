package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPN extends Message<C1CPN, C1CPO> {
    public static final ProtoAdapter<C1CPN> ADAPTER = new ProtoAdapter<C1CPN>() { // from class: X.1CPM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPN decode(ProtoReader protoReader) {
            C1CPO c1cpo = new C1CPO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cpo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c1cpo.LJ = EnumC972740bQ8.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cpo.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1cpo.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cpo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CPN c1cpn) {
            C1CPN c1cpn2 = c1cpn;
            return C2232021CXo.ADAPTER.encodedSizeWithTag(1, c1cpn2.offline_user) + EnumC972740bQ8.ADAPTER.encodedSizeWithTag(2, c1cpn2.kickout_reason) + c1cpn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPN redact(C1CPN c1cpn) {
            C1CPO c1cpoNewBuilder = c1cpn.newBuilder();
            c1cpoNewBuilder.LIZLLL = C2232021CXo.ADAPTER.redact(c1cpoNewBuilder.LIZLLL);
            c1cpoNewBuilder.clearUnknownFields();
            return c1cpoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CPN c1cpn) {
            C1CPN c1cpn2 = c1cpn;
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 1, c1cpn2.offline_user);
            EnumC972740bQ8.ADAPTER.encodeWithTag(protoWriter, 2, c1cpn2.kickout_reason);
            protoWriter.writeBytes(c1cpn2.unknownFields());
        }
    };
    public static final EnumC972740bQ8 DEFAULT_KICKOUT_REASON = EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicKickoutReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC972740bQ8 kickout_reason;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo offline_user;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.offline_user.hashCode()) * 37) + this.kickout_reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CPO newBuilder() {
        C1CPO c1cpo = new C1CPO();
        c1cpo.LIZLLL = this.offline_user;
        c1cpo.LJ = this.kickout_reason;
        c1cpo.addUnknownFields(unknownFields());
        return c1cpo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", offline_user=");
        sb.append(this.offline_user);
        sb.append(", kickout_reason=");
        sb.append(this.kickout_reason);
        sb.replace(0, 2, "LinkMicImKickoutModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CPN)) {
            return false;
        }
        C1CPN c1cpn = (C1CPN) obj;
        if (unknownFields().equals(c1cpn.unknownFields()) && this.offline_user.equals(c1cpn.offline_user) && this.kickout_reason.equals(c1cpn.kickout_reason)) {
            return true;
        }
        return false;
    }

    public C1CPN(C2232021CXo c2232021CXo, EnumC972740bQ8 enumC972740bQ8) {
        this(c2232021CXo, enumC972740bQ8, ByteString.EMPTY);
    }

    public C1CPN(C2232021CXo c2232021CXo, EnumC972740bQ8 enumC972740bQ8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.offline_user = c2232021CXo;
        this.kickout_reason = enumC972740bQ8;
    }
}
