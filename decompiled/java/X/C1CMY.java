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

/* JADX INFO: renamed from: X.1CMY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMY extends Message<C1CMY, C2229021CMa> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 6)
    public final ByteString body;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicError#ADAPTER", tag = 5)
    public final C1CMV error;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final Map<String, String> headers;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRequestMethod#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2229031CMb method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String request_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String url;
    public static final ProtoAdapter<C1CMY> ADAPTER = new ProtoAdapter<C1CMY>() { // from class: X.1CMZ
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMY decode(ProtoReader protoReader) {
            C2229021CMa c2229021CMa = new C2229021CMa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2229021CMa.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                c2229021CMa.LJ = EnumC2229031CMb.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2229021CMa.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 3:
                            c2229021CMa.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2229021CMa.LJI.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 5:
                            c2229021CMa.LJII = C1CMV.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2229021CMa.LJIIIIZZ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229021CMa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229021CMa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CMY c1cmy) {
            C1CMY c1cmy2 = c1cmy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cmy2.url) + EnumC2229031CMb.ADAPTER.encodedSizeWithTag(2, c1cmy2.method) + protoAdapter.encodedSizeWithTag(3, c1cmy2.request_id) + this.LIZ.encodedSizeWithTag(4, c1cmy2.headers) + C1CMV.ADAPTER.encodedSizeWithTag(5, c1cmy2.error) + ProtoAdapter.BYTES.encodedSizeWithTag(6, c1cmy2.body) + c1cmy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMY redact(C1CMY c1cmy) {
            C2229021CMa c2229021CMaNewBuilder = c1cmy.newBuilder();
            C1CMV c1cmv = c2229021CMaNewBuilder.LJII;
            if (c1cmv != null) {
                c2229021CMaNewBuilder.LJII = C1CMV.ADAPTER.redact(c1cmv);
            }
            c2229021CMaNewBuilder.clearUnknownFields();
            return c2229021CMaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CMY c1cmy) {
            C1CMY c1cmy2 = c1cmy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cmy2.url);
            EnumC2229031CMb.ADAPTER.encodeWithTag(protoWriter, 2, c1cmy2.method);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cmy2.request_id);
            this.LIZ.encodeWithTag(protoWriter, 4, c1cmy2.headers);
            C1CMV.ADAPTER.encodeWithTag(protoWriter, 5, c1cmy2.error);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 6, c1cmy2.body);
            protoWriter.writeBytes(c1cmy2.unknownFields());
        }
    };
    public static final EnumC2229031CMb DEFAULT_METHOD = EnumC2229031CMb.VAR_LINK_MIC_REQUEST_METHOD_GET;
    public static final ByteString DEFAULT_BODY = ByteString.EMPTY;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37) + this.method.hashCode()) * 37) + this.request_id.hashCode()) * 37) + this.headers.hashCode()) * 37;
        C1CMV c1cmv = this.error;
        int iHashCode2 = ((iHashCode + (c1cmv != null ? c1cmv.hashCode() : 0)) * 37) + this.body.hashCode();
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2229021CMa newBuilder() {
        C2229021CMa c2229021CMa = new C2229021CMa();
        c2229021CMa.LIZLLL = this.url;
        c2229021CMa.LJ = this.method;
        c2229021CMa.LJFF = this.request_id;
        c2229021CMa.LJI = C1516540pZE.LIZLLL("headers", this.headers);
        c2229021CMa.LJII = this.error;
        c2229021CMa.LJIIIIZZ = this.body;
        c2229021CMa.addUnknownFields(unknownFields());
        return c2229021CMa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", request_id=");
        sb.append(this.request_id);
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        if (this.error != null) {
            sb.append(", error=");
            sb.append(this.error);
        }
        sb.append(", body=");
        sb.append(this.body);
        sb.replace(0, 2, "LinkMicResponse{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CMY)) {
            return false;
        }
        C1CMY c1cmy = (C1CMY) obj;
        if (unknownFields().equals(c1cmy.unknownFields()) && this.url.equals(c1cmy.url) && this.method.equals(c1cmy.method) && this.request_id.equals(c1cmy.request_id) && this.headers.equals(c1cmy.headers) && C1516540pZE.LJ(this.error, c1cmy.error) && this.body.equals(c1cmy.body)) {
            return true;
        }
        return false;
    }

    public C1CMY(String str, EnumC2229031CMb enumC2229031CMb, String str2, Map<String, String> map, C1CMV c1cmv, ByteString byteString) {
        this(str, enumC2229031CMb, str2, map, c1cmv, byteString, ByteString.EMPTY);
    }

    public C1CMY(String str, EnumC2229031CMb enumC2229031CMb, String str2, Map<String, String> map, C1CMV c1cmv, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.url = str;
        this.method = enumC2229031CMb;
        this.request_id = str2;
        this.headers = C1516540pZE.LJI("headers", map);
        this.error = c1cmv;
        this.body = byteString;
    }
}
