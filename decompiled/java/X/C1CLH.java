package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CLH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CLH extends Message<C1CLH, C1CLI> {
    public static final ProtoAdapter<C1CLH> ADAPTER = new ProtoAdapter<C1CLH>() { // from class: X.1CLG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLH decode(ProtoReader protoReader) {
            C1CLI c1cli = new C1CLI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cli.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c1cli.LJ = EnumC1282300jTQ.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cli.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1cli.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cli.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CLH c1clh) {
            C1CLH c1clh2 = c1clh;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1clh2.stream_id) + EnumC1282300jTQ.ADAPTER.encodedSizeWithTag(2, c1clh2.stream_type) + c1clh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CLH redact(C1CLH c1clh) {
            C1CLI c1cliNewBuilder = c1clh.newBuilder();
            c1cliNewBuilder.clearUnknownFields();
            return c1cliNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CLH c1clh) {
            C1CLH c1clh2 = c1clh;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1clh2.stream_id);
            EnumC1282300jTQ.ADAPTER.encodeWithTag(protoWriter, 2, c1clh2.stream_type);
            protoWriter.writeBytes(c1clh2.unknownFields());
        }
    };
    public static final EnumC1282300jTQ DEFAULT_STREAM_TYPE = EnumC1282300jTQ.VAR_LINK_MIC_AUX_STREAM_SUBSCRIBE_TYPE_ALL;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String stream_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicAuxStreamSubscribeType#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC1282300jTQ stream_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.stream_id.hashCode()) * 37) + this.stream_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CLI newBuilder() {
        C1CLI c1cli = new C1CLI();
        c1cli.LIZLLL = this.stream_id;
        c1cli.LJ = this.stream_type;
        c1cli.addUnknownFields(unknownFields());
        return c1cli;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", stream_id=");
        sb.append(this.stream_id);
        sb.append(", stream_type=");
        sb.append(this.stream_type);
        sb.replace(0, 2, "FuncParamsXe2a135542c337c65{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CLH)) {
            return false;
        }
        C1CLH c1clh = (C1CLH) obj;
        if (unknownFields().equals(c1clh.unknownFields()) && this.stream_id.equals(c1clh.stream_id) && this.stream_type.equals(c1clh.stream_type)) {
            return true;
        }
        return false;
    }

    public C1CLH(String str, EnumC1282300jTQ enumC1282300jTQ) {
        this(str, enumC1282300jTQ, ByteString.EMPTY);
    }

    public C1CLH(String str, EnumC1282300jTQ enumC1282300jTQ, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stream_id = str;
        this.stream_type = enumC1282300jTQ;
    }
}
