package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cgw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2236961Cgw extends Message<C2236961Cgw, C2236981Cgy> {
    public static final ProtoAdapter<C2236961Cgw> ADAPTER = new ProtoAdapter<C2236961Cgw>() { // from class: X.1Cgx
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236961Cgw decode(ProtoReader protoReader) {
            C2236981Cgy c2236981Cgy = new C2236981Cgy();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2236981Cgy.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2236981Cgy.LJI.putAll(this.LIZ.decode(protoReader));
                                }
                            } else {
                                c2236981Cgy.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c2236981Cgy.LJ = EnumC2183061AcC.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2236981Cgy.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2236981Cgy.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2236981Cgy.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2236961Cgw c2236961Cgw) {
            C2236961Cgw c2236961Cgw2 = c2236961Cgw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2236961Cgw2.tag) + EnumC2183061AcC.ADAPTER.encodedSizeWithTag(2, c2236961Cgw2.level) + protoAdapter.encodedSizeWithTag(3, c2236961Cgw2.message) + this.LIZ.encodedSizeWithTag(4, c2236961Cgw2.monitor_params) + c2236961Cgw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2236961Cgw redact(C2236961Cgw c2236961Cgw) {
            C2236981Cgy c2236981CgyNewBuilder = c2236961Cgw.newBuilder();
            c2236981CgyNewBuilder.clearUnknownFields();
            return c2236981CgyNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2236961Cgw c2236961Cgw) {
            C2236961Cgw c2236961Cgw2 = c2236961Cgw;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2236961Cgw2.tag);
            EnumC2183061AcC.ADAPTER.encodeWithTag(protoWriter, 2, c2236961Cgw2.level);
            protoAdapter.encodeWithTag(protoWriter, 3, c2236961Cgw2.message);
            this.LIZ.encodeWithTag(protoWriter, 4, c2236961Cgw2.monitor_params);
            protoWriter.writeBytes(c2236961Cgw2.unknownFields());
        }
    };
    public static final EnumC2183061AcC DEFAULT_LEVEL = EnumC2183061AcC.VAR_LINK_MIC_LOG_LEVEL_VERBOSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLogLevel#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2183061AcC level;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final Map<String, String> monitor_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String tag;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.tag.hashCode()) * 37) + this.level.hashCode()) * 37) + this.message.hashCode()) * 37) + this.monitor_params.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2236981Cgy newBuilder() {
        C2236981Cgy c2236981Cgy = new C2236981Cgy();
        c2236981Cgy.LIZLLL = this.tag;
        c2236981Cgy.LJ = this.level;
        c2236981Cgy.LJFF = this.message;
        c2236981Cgy.LJI = C1516540pZE.LIZLLL("monitor_params", this.monitor_params);
        c2236981Cgy.addUnknownFields(unknownFields());
        return c2236981Cgy;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", tag=");
        sb.append(this.tag);
        sb.append(", level=");
        sb.append(this.level);
        sb.append(", message=");
        sb.append(this.message);
        if (!this.monitor_params.isEmpty()) {
            sb.append(", monitor_params=");
            sb.append(this.monitor_params);
        }
        sb.replace(0, 2, "LinkMicLogInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2236961Cgw)) {
            return false;
        }
        C2236961Cgw c2236961Cgw = (C2236961Cgw) obj;
        if (unknownFields().equals(c2236961Cgw.unknownFields()) && this.tag.equals(c2236961Cgw.tag) && this.level.equals(c2236961Cgw.level) && this.message.equals(c2236961Cgw.message) && this.monitor_params.equals(c2236961Cgw.monitor_params)) {
            return true;
        }
        return false;
    }

    public C2236961Cgw(String str, EnumC2183061AcC enumC2183061AcC, String str2, Map<String, String> map) {
        this(str, enumC2183061AcC, str2, map, ByteString.EMPTY);
    }

    public C2236961Cgw(String str, EnumC2183061AcC enumC2183061AcC, String str2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.tag = str;
        this.level = enumC2183061AcC;
        this.message = str2;
        this.monitor_params = C1516540pZE.LJI("monitor_params", map);
    }
}
