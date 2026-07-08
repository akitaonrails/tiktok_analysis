package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248861D0i extends Message<C2248861D0i, C2248881D0k> {
    public static final ProtoAdapter<C2248861D0i> ADAPTER = new ProtoAdapter<C2248861D0i>() { // from class: X.1D0j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248861D0i decode(ProtoReader protoReader) {
            C2248881D0k c2248881D0k = new C2248881D0k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2248881D0k.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2248881D0k.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2248881D0k.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2248881D0k.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2248861D0i c2248861D0i) {
            C2248861D0i c2248861D0i2 = c2248861D0i;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2248861D0i2.region) + protoAdapter.encodedSizeWithTag(2, c2248861D0i2.registration_country) + c2248861D0i2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2248861D0i redact(C2248861D0i c2248861D0i) {
            C2248881D0k c2248881D0kNewBuilder = c2248861D0i.newBuilder();
            c2248881D0kNewBuilder.clearUnknownFields();
            return c2248881D0kNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2248861D0i c2248861D0i) {
            C2248861D0i c2248861D0i2 = c2248861D0i;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2248861D0i2.region);
            protoAdapter.encodeWithTag(protoWriter, 2, c2248861D0i2.registration_country);
            protoWriter.writeBytes(c2248861D0i2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String region;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String registration_country;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.region;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.registration_country;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2248881D0k newBuilder() {
        C2248881D0k c2248881D0k = new C2248881D0k();
        c2248881D0k.LIZLLL = this.region;
        c2248881D0k.LJ = this.registration_country;
        c2248881D0k.addUnknownFields(unknownFields());
        return c2248881D0k;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.region != null) {
            sb.append(", region=");
            sb.append(this.region);
        }
        if (this.registration_country != null) {
            sb.append(", registration_country=");
            sb.append(this.registration_country);
        }
        sb.replace(0, 2, "RegionStruct{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2248861D0i)) {
            return false;
        }
        C2248861D0i c2248861D0i = (C2248861D0i) obj;
        if (unknownFields().equals(c2248861D0i.unknownFields()) && C1516540pZE.LJ(this.region, c2248861D0i.region) && C1516540pZE.LJ(this.registration_country, c2248861D0i.registration_country)) {
            return true;
        }
        return false;
    }

    public C2248861D0i(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public C2248861D0i(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.region = str;
        this.registration_country = str2;
    }
}
