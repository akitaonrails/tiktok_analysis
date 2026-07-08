package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CVC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CVC extends Message<C1CVC, C1CVD> {
    public static final ProtoAdapter<C1CVC> ADAPTER = new ProtoAdapter<C1CVC>() { // from class: X.1CVB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVC decode(ProtoReader protoReader) {
            C1CVD c1cvd = new C1CVD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cvd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cvd.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c1cvd.LIZLLL = C1CXN.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1cvd.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cvd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CVC c1cvc) {
            C1CVC c1cvc2 = c1cvc;
            return C1CXN.ADAPTER.encodedSizeWithTag(1, c1cvc2.network_quality) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1cvc2.link_mic_id) + c1cvc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CVC redact(C1CVC c1cvc) {
            C1CVD c1cvdNewBuilder = c1cvc.newBuilder();
            c1cvdNewBuilder.clearUnknownFields();
            return c1cvdNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CVC c1cvc) {
            C1CVC c1cvc2 = c1cvc;
            C1CXN.ADAPTER.encodeWithTag(protoWriter, 1, c1cvc2.network_quality);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1cvc2.link_mic_id);
            protoWriter.writeBytes(c1cvc2.unknownFields());
        }
    };
    public static final C1CXN DEFAULT_NETWORK_QUALITY = C1CXN.VAR_LINK_MIC_RTC_NETWORK_QUALITY_UNDEFINED;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String link_mic_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcNetworkQuality#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CXN network_quality;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.network_quality.hashCode()) * 37) + this.link_mic_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CVD newBuilder() {
        C1CVD c1cvd = new C1CVD();
        c1cvd.LIZLLL = this.network_quality;
        c1cvd.LJ = this.link_mic_id;
        c1cvd.addUnknownFields(unknownFields());
        return c1cvd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", network_quality=");
        sb.append(this.network_quality);
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.replace(0, 2, "FuncParamsX56f305204fa822a9{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CVC)) {
            return false;
        }
        C1CVC c1cvc = (C1CVC) obj;
        if (unknownFields().equals(c1cvc.unknownFields()) && this.network_quality.equals(c1cvc.network_quality) && this.link_mic_id.equals(c1cvc.link_mic_id)) {
            return true;
        }
        return false;
    }

    public C1CVC(C1CXN c1cxn, String str) {
        this(c1cxn, str, ByteString.EMPTY);
    }

    public C1CVC(C1CXN c1cxn, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.network_quality = c1cxn;
        this.link_mic_id = str;
    }
}
