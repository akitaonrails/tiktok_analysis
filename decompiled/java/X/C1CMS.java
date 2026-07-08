package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CMS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CMS extends Message<C1CMS, C1CMU> {
    public static final ProtoAdapter<C1CMS> ADAPTER = new ProtoAdapter<C1CMS>() { // from class: X.1CMT
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMS decode(ProtoReader protoReader) {
            C1CMU c1cmu = new C1CMU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cmu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cmu.LJFF.putAll(this.LIZ.decode(protoReader));
                            }
                        } else {
                            c1cmu.LJ = ProtoAdapter.BYTES.decode(protoReader);
                        }
                    } else {
                        c1cmu.LIZLLL = ProtoAdapter.BYTES.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cmu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CMS c1cms) {
            C1CMS c1cms2 = c1cms;
            ProtoAdapter<ByteString> protoAdapter = ProtoAdapter.BYTES;
            return protoAdapter.encodedSizeWithTag(1, c1cms2.rsp_data) + protoAdapter.encodedSizeWithTag(2, c1cms2.biz_data) + this.LIZ.encodedSizeWithTag(3, c1cms2.custom_data) + c1cms2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CMS redact(C1CMS c1cms) {
            C1CMU c1cmuNewBuilder = c1cms.newBuilder();
            c1cmuNewBuilder.clearUnknownFields();
            return c1cmuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CMS c1cms) {
            C1CMS c1cms2 = c1cms;
            ProtoAdapter<ByteString> protoAdapter = ProtoAdapter.BYTES;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cms2.rsp_data);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cms2.biz_data);
            this.LIZ.encodeWithTag(protoWriter, 3, c1cms2.custom_data);
            protoWriter.writeBytes(c1cms2.unknownFields());
        }
    };
    public static final ByteString DEFAULT_BIZ_DATA;
    public static final ByteString DEFAULT_RSP_DATA;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 2)
    public final ByteString biz_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, String> custom_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 1)
    public final ByteString rsp_data;

    static {
        ByteString byteString = ByteString.EMPTY;
        DEFAULT_RSP_DATA = byteString;
        DEFAULT_BIZ_DATA = byteString;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.rsp_data.hashCode()) * 37) + this.biz_data.hashCode()) * 37) + this.custom_data.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CMU newBuilder() {
        C1CMU c1cmu = new C1CMU();
        c1cmu.LIZLLL = this.rsp_data;
        c1cmu.LJ = this.biz_data;
        c1cmu.LJFF = C1516540pZE.LIZLLL("custom_data", this.custom_data);
        c1cmu.addUnknownFields(unknownFields());
        return c1cmu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", rsp_data=");
        sb.append(this.rsp_data);
        sb.append(", biz_data=");
        sb.append(this.biz_data);
        if (!this.custom_data.isEmpty()) {
            sb.append(", custom_data=");
            sb.append(this.custom_data);
        }
        sb.replace(0, 2, "LinkMicRespModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CMS)) {
            return false;
        }
        C1CMS c1cms = (C1CMS) obj;
        if (unknownFields().equals(c1cms.unknownFields()) && this.rsp_data.equals(c1cms.rsp_data) && this.biz_data.equals(c1cms.biz_data) && this.custom_data.equals(c1cms.custom_data)) {
            return true;
        }
        return false;
    }

    public C1CMS(ByteString byteString, ByteString byteString2, Map<String, String> map) {
        this(byteString, byteString2, map, ByteString.EMPTY);
    }

    public C1CMS(ByteString byteString, ByteString byteString2, Map<String, String> map, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.rsp_data = byteString;
        this.biz_data = byteString2;
        this.custom_data = C1516540pZE.LJI("custom_data", map);
    }
}
