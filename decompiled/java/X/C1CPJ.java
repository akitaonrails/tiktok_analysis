package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CPJ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CPJ extends Message<C1CPJ, C1CPL> {
    public static final ProtoAdapter<C1CPJ> ADAPTER = new ProtoAdapter<C1CPJ>() { // from class: X.1CPK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPJ decode(ProtoReader protoReader) {
            C1CPL c1cpl = new C1CPL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cpl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cpl.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c1cpl.LJ = EnumC2183431Acn.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cpl.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1cpl.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cpl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CPJ c1cpj) {
            C1CPJ c1cpj2 = c1cpj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cpj2.switch_id) + EnumC2183431Acn.ADAPTER.encodedSizeWithTag(2, c1cpj2.key) + protoAdapter.encodedSizeWithTag(3, c1cpj2.value) + c1cpj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CPJ redact(C1CPJ c1cpj) {
            C1CPL c1cplNewBuilder = c1cpj.newBuilder();
            c1cplNewBuilder.clearUnknownFields();
            return c1cplNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CPJ c1cpj) {
            C1CPJ c1cpj2 = c1cpj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cpj2.switch_id);
            EnumC2183431Acn.ADAPTER.encodeWithTag(protoWriter, 2, c1cpj2.key);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cpj2.value);
            protoWriter.writeBytes(c1cpj2.unknownFields());
        }
    };
    public static final EnumC2183431Acn DEFAULT_KEY = EnumC2183431Acn.VAR_LINK_MIC_LAYOUT_QOS_MONITOR_KEY_PULL_STREAM;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutQosMonitorKey#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2183431Acn key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String switch_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String value;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.switch_id.hashCode()) * 37) + this.key.hashCode()) * 37;
        String str = this.value;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CPL newBuilder() {
        C1CPL c1cpl = new C1CPL();
        c1cpl.LIZLLL = this.switch_id;
        c1cpl.LJ = this.key;
        c1cpl.LJFF = this.value;
        c1cpl.addUnknownFields(unknownFields());
        return c1cpl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", switch_id=");
        sb.append(this.switch_id);
        sb.append(", key=");
        sb.append(this.key);
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        sb.replace(0, 2, "FuncParamsX4ff13370ffd19504{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CPJ)) {
            return false;
        }
        C1CPJ c1cpj = (C1CPJ) obj;
        if (unknownFields().equals(c1cpj.unknownFields()) && this.switch_id.equals(c1cpj.switch_id) && this.key.equals(c1cpj.key) && C1516540pZE.LJ(this.value, c1cpj.value)) {
            return true;
        }
        return false;
    }

    public C1CPJ(String str, EnumC2183431Acn enumC2183431Acn, String str2) {
        this(str, enumC2183431Acn, str2, ByteString.EMPTY);
    }

    public C1CPJ(String str, EnumC2183431Acn enumC2183431Acn, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.switch_id = str;
        this.key = enumC2183431Acn;
        this.value = str2;
    }
}
