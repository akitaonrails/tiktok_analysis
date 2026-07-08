package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CFG, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CFG extends Message<C1CFG, C1CFH> {
    public static final ProtoAdapter<C1CFG> ADAPTER = new ProtoAdapter<C1CFG>() { // from class: X.1CFF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFG decode(ProtoReader protoReader) {
            C1CFH c1cfh = new C1CFH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cfh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c1cfh.LJ = EnumC1282210jTH.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cfh.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1cfh.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cfh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CFG c1cfg) {
            C1CFG c1cfg2 = c1cfg;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1cfg2.link_mic_id) + EnumC1282210jTH.ADAPTER.encodedSizeWithTag(2, c1cfg2.reason) + c1cfg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CFG redact(C1CFG c1cfg) {
            C1CFH c1cfhNewBuilder = c1cfg.newBuilder();
            c1cfhNewBuilder.clearUnknownFields();
            return c1cfhNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CFG c1cfg) {
            C1CFG c1cfg2 = c1cfg;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1cfg2.link_mic_id);
            EnumC1282210jTH.ADAPTER.encodeWithTag(protoWriter, 2, c1cfg2.reason);
            protoWriter.writeBytes(c1cfg2.unknownFields());
        }
    };
    public static final EnumC1282210jTH DEFAULT_REASON = EnumC1282210jTH.VAR_LINK_MIC_RTC_USER_OFFLINE_REASON_QUIT;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String link_mic_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcUserOfflineReason#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC1282210jTH reason;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.link_mic_id.hashCode()) * 37) + this.reason.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CFH newBuilder() {
        C1CFH c1cfh = new C1CFH();
        c1cfh.LIZLLL = this.link_mic_id;
        c1cfh.LJ = this.reason;
        c1cfh.addUnknownFields(unknownFields());
        return c1cfh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", link_mic_id=");
        sb.append(this.link_mic_id);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.replace(0, 2, "FuncParamsXdf337a05a16c5a13{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CFG)) {
            return false;
        }
        C1CFG c1cfg = (C1CFG) obj;
        if (unknownFields().equals(c1cfg.unknownFields()) && this.link_mic_id.equals(c1cfg.link_mic_id) && this.reason.equals(c1cfg.reason)) {
            return true;
        }
        return false;
    }

    public C1CFG(String str, EnumC1282210jTH enumC1282210jTH) {
        this(str, enumC1282210jTH, ByteString.EMPTY);
    }

    public C1CFG(String str, EnumC1282210jTH enumC1282210jTH, ByteString byteString) {
        super(ADAPTER, byteString);
        this.link_mic_id = str;
        this.reason = enumC1282210jTH;
    }
}
