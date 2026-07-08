package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPQ extends Message<C1CPQ, C1CPR> {
    public static final ProtoAdapter<C1CPQ> ADAPTER = new ProtoAdapter<C1CPQ>() { // from class: X.1CPP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPQ decode(ProtoReader protoReader) {
            C1CPR c1cpr = new C1CPR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cpr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                try {
                                    c1cpr.LJFF = EnumC972740bQ8.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c1cpr.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c1cpr.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cpr.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cpr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CPQ c1cpq) {
            C1CPQ c1cpq2 = c1cpq;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cpq2.invoke_id) + C2232021CXo.ADAPTER.encodedSizeWithTag(2, c1cpq2.kickouter) + EnumC972740bQ8.ADAPTER.encodedSizeWithTag(3, c1cpq2.kickout_reason) + c1cpq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPQ redact(C1CPQ c1cpq) {
            C1CPR c1cprNewBuilder = c1cpq.newBuilder();
            c1cprNewBuilder.LJ = C2232021CXo.ADAPTER.redact(c1cprNewBuilder.LJ);
            c1cprNewBuilder.clearUnknownFields();
            return c1cprNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CPQ c1cpq) {
            C1CPQ c1cpq2 = c1cpq;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cpq2.invoke_id);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 2, c1cpq2.kickouter);
            EnumC972740bQ8.ADAPTER.encodeWithTag(protoWriter, 3, c1cpq2.kickout_reason);
            protoWriter.writeBytes(c1cpq2.unknownFields());
        }
    };
    public static final EnumC972740bQ8 DEFAULT_KICKOUT_REASON = EnumC972740bQ8.VAR_LINK_MIC_KICKOUT_REASON_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicKickoutReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC972740bQ8 kickout_reason;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo kickouter;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.kickouter.hashCode()) * 37) + this.kickout_reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CPR newBuilder() {
        C1CPR c1cpr = new C1CPR();
        c1cpr.LIZLLL = this.invoke_id;
        c1cpr.LJ = this.kickouter;
        c1cpr.LJFF = this.kickout_reason;
        c1cpr.addUnknownFields(unknownFields());
        return c1cpr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", kickouter=");
        sb.append(this.kickouter);
        sb.append(", kickout_reason=");
        sb.append(this.kickout_reason);
        sb.replace(0, 2, "LinkMicKickoutParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CPQ)) {
            return false;
        }
        C1CPQ c1cpq = (C1CPQ) obj;
        if (unknownFields().equals(c1cpq.unknownFields()) && this.invoke_id.equals(c1cpq.invoke_id) && this.kickouter.equals(c1cpq.kickouter) && this.kickout_reason.equals(c1cpq.kickout_reason)) {
            return true;
        }
        return false;
    }

    public C1CPQ(String str, C2232021CXo c2232021CXo, EnumC972740bQ8 enumC972740bQ8) {
        this(str, c2232021CXo, enumC972740bQ8, ByteString.EMPTY);
    }

    public C1CPQ(String str, C2232021CXo c2232021CXo, EnumC972740bQ8 enumC972740bQ8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.kickouter = c2232021CXo;
        this.kickout_reason = enumC972740bQ8;
    }
}
