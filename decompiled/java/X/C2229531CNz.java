package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229531CNz extends Message<C2229531CNz, C1CO0> {
    public static final ProtoAdapter<C2229531CNz> ADAPTER = new ProtoAdapter<C2229531CNz>() { // from class: X.1CNy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229531CNz decode(ProtoReader protoReader) {
            C1CO0 c1co0 = new C1CO0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1co0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1co0.LJ = C1D0V.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1co0.LIZLLL.add(C1CM2.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1co0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229531CNz c2229531CNz) {
            C2229531CNz c2229531CNz2 = c2229531CNz;
            return C1CM2.ADAPTER.asRepeated().encodedSizeWithTag(1, c2229531CNz2.sessions) + C1D0V.ADAPTER.encodedSizeWithTag(2, c2229531CNz2.biz_sei_config) + c2229531CNz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229531CNz redact(C2229531CNz c2229531CNz) {
            C1CO0 c1co0NewBuilder = c2229531CNz.newBuilder();
            C1516540pZE.LJIIIZ(c1co0NewBuilder.LIZLLL, C1CM2.ADAPTER);
            c1co0NewBuilder.LJ = C1D0V.ADAPTER.redact(c1co0NewBuilder.LJ);
            c1co0NewBuilder.clearUnknownFields();
            return c1co0NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229531CNz c2229531CNz) {
            C2229531CNz c2229531CNz2 = c2229531CNz;
            C1CM2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2229531CNz2.sessions);
            C1D0V.ADAPTER.encodeWithTag(protoWriter, 2, c2229531CNz2.biz_sei_config);
            protoWriter.writeBytes(c2229531CNz2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRustLayoutBizSeiConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C1D0V biz_sei_config;

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
    public C1CO0 newBuilder() {
        C1CO0 c1co0 = new C1CO0();
        c1co0.LIZLLL = C1516540pZE.LIZJ("sessions", this.sessions);
        c1co0.LJ = this.biz_sei_config;
        c1co0.addUnknownFields(unknownFields());
        return c1co0;
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
        sb.replace(0, 2, "FuncParamsX5da35f743f303b84{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229531CNz)) {
            return false;
        }
        C2229531CNz c2229531CNz = (C2229531CNz) obj;
        if (unknownFields().equals(c2229531CNz.unknownFields()) && this.sessions.equals(c2229531CNz.sessions) && this.biz_sei_config.equals(c2229531CNz.biz_sei_config)) {
            return true;
        }
        return false;
    }

    public C2229531CNz(List<C1CM2> list, C1D0V c1d0v) {
        this(list, c1d0v, ByteString.EMPTY);
    }

    public C2229531CNz(List<C1CM2> list, C1D0V c1d0v, ByteString byteString) {
        super(ADAPTER, byteString);
        this.sessions = C1516540pZE.LJFF("sessions", list);
        this.biz_sei_config = c1d0v;
    }
}
