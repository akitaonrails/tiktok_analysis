package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229081CMg extends Message<C2229081CMg, C2229101CMi> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 4)
    public final ByteString body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public final String invoke_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRequestMethod#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final EnumC2229031CMb method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String url;
    public static final ProtoAdapter<C2229081CMg> ADAPTER = new ProtoAdapter<C2229081CMg>() { // from class: X.1CMh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229081CMg decode(ProtoReader protoReader) {
            C2229101CMi c2229101CMi = new C2229101CMi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2229101CMi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2229101CMi.LJI = ProtoAdapter.BYTES.decode(protoReader);
                                }
                            } else {
                                c2229101CMi.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            try {
                                c2229101CMi.LJ = EnumC2229031CMb.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2229101CMi.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c2229101CMi.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229101CMi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229081CMg c2229081CMg) {
            C2229081CMg c2229081CMg2 = c2229081CMg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2229081CMg2.url) + EnumC2229031CMb.ADAPTER.encodedSizeWithTag(2, c2229081CMg2.method) + protoAdapter.encodedSizeWithTag(3, c2229081CMg2.invoke_id) + ProtoAdapter.BYTES.encodedSizeWithTag(4, c2229081CMg2.body) + c2229081CMg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229081CMg redact(C2229081CMg c2229081CMg) {
            C2229101CMi c2229101CMiNewBuilder = c2229081CMg.newBuilder();
            c2229101CMiNewBuilder.clearUnknownFields();
            return c2229101CMiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229081CMg c2229081CMg) {
            C2229081CMg c2229081CMg2 = c2229081CMg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2229081CMg2.url);
            EnumC2229031CMb.ADAPTER.encodeWithTag(protoWriter, 2, c2229081CMg2.method);
            protoAdapter.encodeWithTag(protoWriter, 3, c2229081CMg2.invoke_id);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, c2229081CMg2.body);
            protoWriter.writeBytes(c2229081CMg2.unknownFields());
        }
    };
    public static final EnumC2229031CMb DEFAULT_METHOD = EnumC2229031CMb.VAR_LINK_MIC_REQUEST_METHOD_GET;
    public static final ByteString DEFAULT_BODY = ByteString.EMPTY;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37) + this.method.hashCode()) * 37) + this.invoke_id.hashCode()) * 37) + this.body.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2229101CMi newBuilder() {
        C2229101CMi c2229101CMi = new C2229101CMi();
        c2229101CMi.LIZLLL = this.url;
        c2229101CMi.LJ = this.method;
        c2229101CMi.LJFF = this.invoke_id;
        c2229101CMi.LJI = this.body;
        c2229101CMi.addUnknownFields(unknownFields());
        return c2229101CMi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", method=");
        sb.append(this.method);
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", body=");
        sb.append(this.body);
        sb.replace(0, 2, "LinkMicRequest{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229081CMg)) {
            return false;
        }
        C2229081CMg c2229081CMg = (C2229081CMg) obj;
        if (unknownFields().equals(c2229081CMg.unknownFields()) && this.url.equals(c2229081CMg.url) && this.method.equals(c2229081CMg.method) && this.invoke_id.equals(c2229081CMg.invoke_id) && this.body.equals(c2229081CMg.body)) {
            return true;
        }
        return false;
    }

    public C2229081CMg(String str, EnumC2229031CMb enumC2229031CMb, String str2, ByteString byteString) {
        this(str, enumC2229031CMb, str2, byteString, ByteString.EMPTY);
    }

    public C2229081CMg(String str, EnumC2229031CMb enumC2229031CMb, String str2, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.url = str;
        this.method = enumC2229031CMb;
        this.invoke_id = str2;
        this.body = byteString;
    }
}
