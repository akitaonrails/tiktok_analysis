package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2232401CZa extends Message<C2232401CZa, C2232451CZf> {
    public static final ProtoAdapter<C2232401CZa> ADAPTER = new ProtoAdapter<C2232401CZa>() { // from class: X.1CZb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232401CZa decode(ProtoReader protoReader) {
            C2232451CZf c2232451CZf = new C2232451CZf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2232451CZf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2232451CZf.LJ = C2232861CaK.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c2232451CZf.LIZLLL = C1CXS.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2232451CZf.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2232451CZf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2232401CZa c2232401CZa) {
            C2232401CZa c2232401CZa2 = c2232401CZa;
            return C1CXS.ADAPTER.encodedSizeWithTag(1, c2232401CZa2.state) + C2232861CaK.ADAPTER.encodedSizeWithTag(2, c2232401CZa2.rtc_state) + c2232401CZa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2232401CZa redact(C2232401CZa c2232401CZa) {
            C2232451CZf c2232451CZfNewBuilder = c2232401CZa.newBuilder();
            c2232451CZfNewBuilder.LJ = C2232861CaK.ADAPTER.redact(c2232451CZfNewBuilder.LJ);
            c2232451CZfNewBuilder.clearUnknownFields();
            return c2232451CZfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2232401CZa c2232401CZa) {
            C2232401CZa c2232401CZa2 = c2232401CZa;
            C1CXS.ADAPTER.encodeWithTag(protoWriter, 1, c2232401CZa2.state);
            C2232861CaK.ADAPTER.encodeWithTag(protoWriter, 2, c2232401CZa2.rtc_state);
            protoWriter.writeBytes(c2232401CZa2.unknownFields());
        }
    };
    public static final C1CXS DEFAULT_STATE = C1CXS.VAR_LINK_STATE_CLOSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkRtcState#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232861CaK rtc_state;

    @WireField(adapter = "link_mic_sdk.proto.LinkState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CXS state;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.state.hashCode()) * 37) + this.rtc_state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2232451CZf newBuilder() {
        C2232451CZf c2232451CZf = new C2232451CZf();
        c2232451CZf.LIZLLL = this.state;
        c2232451CZf.LJ = this.rtc_state;
        c2232451CZf.addUnknownFields(unknownFields());
        return c2232451CZf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", state=");
        sb.append(this.state);
        sb.append(", rtc_state=");
        sb.append(this.rtc_state);
        sb.replace(0, 2, "LinkStateModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2232401CZa)) {
            return false;
        }
        C2232401CZa c2232401CZa = (C2232401CZa) obj;
        if (unknownFields().equals(c2232401CZa.unknownFields()) && this.state.equals(c2232401CZa.state) && this.rtc_state.equals(c2232401CZa.rtc_state)) {
            return true;
        }
        return false;
    }

    public C2232401CZa(C1CXS c1cxs, C2232861CaK c2232861CaK) {
        this(c1cxs, c2232861CaK, ByteString.EMPTY);
    }

    public C2232401CZa(C1CXS c1cxs, C2232861CaK c2232861CaK, ByteString byteString) {
        super(ADAPTER, byteString);
        this.state = c1cxs;
        this.rtc_state = c2232861CaK;
    }
}
