package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CQS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CQS extends Message<C1CQS, C1CQU> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String comment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String conditions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public final Long min_app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String parameter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String state_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 3)
    public final Long version;
    public static final ProtoAdapter<C1CQS> ADAPTER = new ProtoAdapter<C1CQS>() { // from class: X.1CQT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQS decode(ProtoReader protoReader) {
            C1CQU c1cqu = new C1CQU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cqu.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1cqu.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1cqu.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1cqu.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1cqu.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1cqu.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cqu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cqu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CQS c1cqs) {
            C1CQS c1cqs2 = c1cqs;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cqs2.state_name) + protoAdapter.encodedSizeWithTag(2, c1cqs2.comment);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1cqs2.version) + protoAdapter2.encodedSizeWithTag(4, c1cqs2.min_app_version) + protoAdapter.encodedSizeWithTag(5, c1cqs2.parameter) + protoAdapter.encodedSizeWithTag(6, c1cqs2.conditions) + c1cqs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CQS redact(C1CQS c1cqs) {
            C1CQU c1cquNewBuilder = c1cqs.newBuilder();
            c1cquNewBuilder.clearUnknownFields();
            return c1cquNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CQS c1cqs) {
            C1CQS c1cqs2 = c1cqs;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cqs2.state_name);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cqs2.comment);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, c1cqs2.version);
            protoAdapter2.encodeWithTag(protoWriter, 4, c1cqs2.min_app_version);
            protoAdapter.encodeWithTag(protoWriter, 5, c1cqs2.parameter);
            protoAdapter.encodeWithTag(protoWriter, 6, c1cqs2.conditions);
            protoWriter.writeBytes(c1cqs2.unknownFields());
        }
    };
    public static final Long DEFAULT_VERSION = 0L;
    public static final Long DEFAULT_MIN_APP_VERSION = 0L;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.state_name.hashCode()) * 37;
        String str = this.comment;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.version.hashCode()) * 37) + this.min_app_version.hashCode()) * 37;
        String str2 = this.parameter;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.conditions;
        int iHashCode4 = iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C1CQU newBuilder() {
        C1CQU c1cqu = new C1CQU();
        c1cqu.LIZLLL = this.state_name;
        c1cqu.LJ = this.comment;
        c1cqu.LJFF = this.version;
        c1cqu.LJI = this.min_app_version;
        c1cqu.LJII = this.parameter;
        c1cqu.LJIIIIZZ = this.conditions;
        c1cqu.addUnknownFields(unknownFields());
        return c1cqu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", state_name=");
        sb.append(this.state_name);
        if (this.comment != null) {
            sb.append(", comment=");
            sb.append(this.comment);
        }
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", min_app_version=");
        sb.append(this.min_app_version);
        if (this.parameter != null) {
            sb.append(", parameter=");
            sb.append(this.parameter);
        }
        if (this.conditions != null) {
            sb.append(", conditions=");
            sb.append(this.conditions);
        }
        sb.replace(0, 2, "FuncParamsX249aba8d8b16581c{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1CQS)) {
            return false;
        }
        C1CQS c1cqs = (C1CQS) obj;
        if (unknownFields().equals(c1cqs.unknownFields()) && this.state_name.equals(c1cqs.state_name) && C1516540pZE.LJ(this.comment, c1cqs.comment) && this.version.equals(c1cqs.version) && this.min_app_version.equals(c1cqs.min_app_version) && C1516540pZE.LJ(this.parameter, c1cqs.parameter) && C1516540pZE.LJ(this.conditions, c1cqs.conditions)) {
            return true;
        }
        return false;
    }

    public C1CQS(String str, String str2, Long l, Long l2, String str3, String str4) {
        this(str, str2, l, l2, str3, str4, ByteString.EMPTY);
    }

    public C1CQS(String str, String str2, Long l, Long l2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.state_name = str;
        this.comment = str2;
        this.version = l;
        this.min_app_version = l2;
        this.parameter = str3;
        this.conditions = str4;
    }
}
