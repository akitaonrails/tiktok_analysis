package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CV9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CV9 extends Message<C1CV9, C1CVA> {
    public static final ProtoAdapter<C1CV9> ADAPTER = new ProtoAdapter<C1CV9>() { // from class: X.1CV8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CV9 decode(ProtoReader protoReader) {
            C1CVA c1cva = new C1CVA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cva.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cva.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cva.LIZLLL = C1CWY.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cva.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cva.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CV9 c1cv9) {
            C1CV9 c1cv92 = c1cv9;
            return C1CWY.ADAPTER.encodedSizeWithTag(1, c1cv92.rtc_connection_state) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1cv92.link_mic_id) + c1cv92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CV9 redact(C1CV9 c1cv9) {
            C1CVA c1cvaNewBuilder = c1cv9.newBuilder();
            c1cvaNewBuilder.clearUnknownFields();
            return c1cvaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CV9 c1cv9) {
            C1CV9 c1cv92 = c1cv9;
            C1CWY.ADAPTER.encodeWithTag(protoWriter, 1, c1cv92.rtc_connection_state);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1cv92.link_mic_id);
            protoWriter.writeBytes(c1cv92.unknownFields());
        }
    };
    public static final C1CWY DEFAULT_RTC_CONNECTION_STATE = C1CWY.VAR_LINK_MIC_RTC_CONNECTION_STATE_UNDEFINED;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcConnectionState#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CWY rtc_connection_state;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.rtc_connection_state.hashCode()) * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CVA newBuilder() {
        C1CVA c1cva = new C1CVA();
        c1cva.LIZLLL = this.rtc_connection_state;
        c1cva.LJ = this.link_mic_id;
        c1cva.addUnknownFields(unknownFields());
        return c1cva;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", rtc_connection_state=");
        sb.append(this.rtc_connection_state);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsX55a4ef6a2c474ce5{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CV9)) {
            return false;
        }
        C1CV9 c1cv9 = (C1CV9) obj;
        if (unknownFields().equals(c1cv9.unknownFields()) && this.rtc_connection_state.equals(c1cv9.rtc_connection_state) && this.link_mic_id.equals(c1cv9.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C1CV9(C1CWY c1cwy, String str) {
        this(c1cwy, str, ByteString.EMPTY);
    }

    public C1CV9(C1CWY c1cwy, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rtc_connection_state = c1cwy;
        this.link_mic_id = str;
    }
}
