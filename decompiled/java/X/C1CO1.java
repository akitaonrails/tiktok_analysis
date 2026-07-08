package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CO1, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CO1 extends Message<C1CO1, C1CO3> {
    public static final ProtoAdapter<C1CO1> ADAPTER = new ProtoAdapter<C1CO1>() { // from class: X.1CO2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CO1 decode(ProtoReader protoReader) {
            C1CO3 c1co3 = new C1CO3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1co3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1co3.LJ = C1D0T.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1co3.LIZLLL.add(C1CM2.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1co3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CO1 c1co1) {
            C1CO1 c1co12 = c1co1;
            return C1CM2.ADAPTER.asRepeated().encodedSizeWithTag(1, c1co12.sessions) + C1D0T.ADAPTER.encodedSizeWithTag(2, c1co12.biz_sei_config) + c1co12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CO1 redact(C1CO1 c1co1) {
            C1CO3 c1co3NewBuilder = c1co1.newBuilder();
            C1516540pZE.LJIIIZ(c1co3NewBuilder.LIZLLL, C1CM2.ADAPTER);
            c1co3NewBuilder.LJ = C1D0T.ADAPTER.redact(c1co3NewBuilder.LJ);
            c1co3NewBuilder.clearUnknownFields();
            return c1co3NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CO1 c1co1) {
            C1CO1 c1co12 = c1co1;
            C1CM2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c1co12.sessions);
            C1D0T.ADAPTER.encodeWithTag(protoWriter, 2, c1co12.biz_sei_config);
            protoWriter.writeBytes(c1co12.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicBizRtcSeiConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1D0T biz_sei_config;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicInteractSession#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<C1CM2> sessions;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.sessions.hashCode()) * 37) + this.biz_sei_config.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CO3 newBuilder() {
        C1CO3 c1co3 = new C1CO3();
        c1co3.LIZLLL = C1516540pZE.LIZJ("sessions", this.sessions);
        c1co3.LJ = this.biz_sei_config;
        c1co3.addUnknownFields(unknownFields());
        return c1co3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.sessions.isEmpty()) {
            sb.append(", sessions=");
            sb.append(this.sessions);
        }
        sb.append(", biz_sei_config=");
        sb.append(this.biz_sei_config);
        sb.replace(0, 2, "FuncParamsX4cdd12354a16fce8{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CO1)) {
            return false;
        }
        C1CO1 c1co1 = (C1CO1) obj;
        if (unknownFields().equals(c1co1.unknownFields()) && this.sessions.equals(c1co1.sessions) && this.biz_sei_config.equals(c1co1.biz_sei_config)) {
            return true;
        }
        return false;
    }

    public C1CO1(List<C1CM2> list, C1D0T c1d0t) {
        this(list, c1d0t, ByteString.EMPTY);
    }

    public C1CO1(List<C1CM2> list, C1D0T c1d0t, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sessions = C1516540pZE.LJFF("sessions", list);
        this.biz_sei_config = c1d0t;
    }
}
