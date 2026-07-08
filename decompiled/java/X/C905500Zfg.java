package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Zfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C905500Zfg extends Message<C905500Zfg, C905570Zfn> {
    public static final ProtoAdapter<C905500Zfg> ADAPTER = new ProtoAdapter<C905500Zfg>() { // from class: X.0Zfh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905500Zfg decode(ProtoReader protoReader) {
            C905570Zfn c905570Zfn = new C905570Zfn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c905570Zfn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c905570Zfn.LJI = C905520Zfi.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c905570Zfn.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c905570Zfn.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c905570Zfn.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c905570Zfn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C905500Zfg c905500Zfg) {
            C905500Zfg c905500Zfg2 = c905500Zfg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c905500Zfg2.business_source) + protoAdapter.encodedSizeWithTag(2, c905500Zfg2.business_scenario) + protoAdapter.encodedSizeWithTag(3, c905500Zfg2.business_function) + C905520Zfi.ADAPTER.encodedSizeWithTag(4, c905500Zfg2.auto_reply_payload) + c905500Zfg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C905500Zfg redact(C905500Zfg c905500Zfg) {
            C905570Zfn c905570ZfnNewBuilder = c905500Zfg.newBuilder();
            C905520Zfi c905520Zfi = c905570ZfnNewBuilder.LJI;
            if (c905520Zfi != null) {
                c905570ZfnNewBuilder.LJI = C905520Zfi.ADAPTER.redact(c905520Zfi);
            }
            c905570ZfnNewBuilder.clearUnknownFields();
            return c905570ZfnNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C905500Zfg c905500Zfg) {
            C905500Zfg c905500Zfg2 = c905500Zfg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c905500Zfg2.business_source);
            protoAdapter.encodeWithTag(protoWriter, 2, c905500Zfg2.business_scenario);
            protoAdapter.encodeWithTag(protoWriter, 3, c905500Zfg2.business_function);
            C905520Zfi.ADAPTER.encodeWithTag(protoWriter, 4, c905500Zfg2.auto_reply_payload);
            protoWriter.writeBytes(c905500Zfg2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.extension.proto.ReplyPayload#ADAPTER", tag = 4)
    public final C905520Zfi auto_reply_payload;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String business_function;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String business_scenario;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String business_source;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.business_source;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.business_scenario;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.business_function;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        C905520Zfi c905520Zfi = this.auto_reply_payload;
        int iHashCode5 = iHashCode4 + (c905520Zfi != null ? c905520Zfi.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C905570Zfn newBuilder() {
        C905570Zfn c905570Zfn = new C905570Zfn();
        c905570Zfn.LIZLLL = this.business_source;
        c905570Zfn.LJ = this.business_scenario;
        c905570Zfn.LJFF = this.business_function;
        c905570Zfn.LJI = this.auto_reply_payload;
        c905570Zfn.addUnknownFields(unknownFields());
        return c905570Zfn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.business_source != null) {
            sb.append(", business_source=");
            sb.append(this.business_source);
        }
        if (this.business_scenario != null) {
            sb.append(", business_scenario=");
            sb.append(this.business_scenario);
        }
        if (this.business_function != null) {
            sb.append(", business_function=");
            sb.append(this.business_function);
        }
        if (this.auto_reply_payload != null) {
            sb.append(", auto_reply_payload=");
            sb.append(this.auto_reply_payload);
        }
        sb.replace(0, 2, "B2CPersistentInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C905500Zfg)) {
            return false;
        }
        C905500Zfg c905500Zfg = (C905500Zfg) obj;
        if (unknownFields().equals(c905500Zfg.unknownFields()) && C1516540pZE.LJ(this.business_source, c905500Zfg.business_source) && C1516540pZE.LJ(this.business_scenario, c905500Zfg.business_scenario) && C1516540pZE.LJ(this.business_function, c905500Zfg.business_function) && C1516540pZE.LJ(this.auto_reply_payload, c905500Zfg.auto_reply_payload)) {
            return true;
        }
        return false;
    }

    public C905500Zfg(String str, String str2, String str3, C905520Zfi c905520Zfi) {
        this(str, str2, str3, c905520Zfi, ByteString.EMPTY);
    }

    public C905500Zfg(String str, String str2, String str3, C905520Zfi c905520Zfi, ByteString byteString) {
        super(ADAPTER, byteString);
        this.business_source = str;
        this.business_scenario = str2;
        this.business_function = str3;
        this.auto_reply_payload = c905520Zfi;
    }
}
