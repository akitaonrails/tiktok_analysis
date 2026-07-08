package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Co8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241421Co8 extends Message<C2241421Co8, C2241511CoH> {
    public static final ProtoAdapter<C2241421Co8> ADAPTER = new ProtoAdapter<C2241421Co8>() { // from class: X.1Co9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241421Co8 decode(ProtoReader protoReader) {
            C2241511CoH c2241511CoH = new C2241511CoH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c2241511CoH.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2241511CoH.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2241511CoH.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2241511CoH.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2241511CoH.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2241511CoH.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241511CoH.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241421Co8 c2241421Co8) {
            C2241421Co8 c2241421Co82 = c2241421Co8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2241421Co82.template_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c2241421Co82.participant_count) + protoAdapter.encodedSizeWithTag(3, c2241421Co82.template_name) + protoAdapter.encodedSizeWithTag(4, c2241421Co82.template_thumbnail_url) + protoAdapter.encodedSizeWithTag(5, c2241421Co82.template_resource_id) + c2241421Co82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241421Co8 redact(C2241421Co8 c2241421Co8) {
            C2241511CoH c2241511CoHNewBuilder = c2241421Co8.newBuilder();
            c2241511CoHNewBuilder.clearUnknownFields();
            return c2241511CoHNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241421Co8 c2241421Co8) {
            C2241421Co8 c2241421Co82 = c2241421Co8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241421Co82.template_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c2241421Co82.participant_count);
            protoAdapter.encodeWithTag(protoWriter, 3, c2241421Co82.template_name);
            protoAdapter.encodeWithTag(protoWriter, 4, c2241421Co82.template_thumbnail_url);
            protoAdapter.encodeWithTag(protoWriter, 5, c2241421Co82.template_resource_id);
            protoWriter.writeBytes(c2241421Co82.unknownFields());
        }
    };
    public static final Integer DEFAULT_PARTICIPANT_COUNT = 0;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer participant_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String template_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String template_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String template_resource_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String template_thumbnail_url;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.template_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.participant_count;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        String str2 = this.template_name;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.template_thumbnail_url;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.template_resource_id;
        int iHashCode6 = iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2241511CoH newBuilder() {
        C2241511CoH c2241511CoH = new C2241511CoH();
        c2241511CoH.LIZLLL = this.template_id;
        c2241511CoH.LJ = this.participant_count;
        c2241511CoH.LJFF = this.template_name;
        c2241511CoH.LJI = this.template_thumbnail_url;
        c2241511CoH.LJII = this.template_resource_id;
        c2241511CoH.addUnknownFields(unknownFields());
        return c2241511CoH;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.template_id != null) {
            sb.append(", template_id=");
            sb.append(this.template_id);
        }
        if (this.participant_count != null) {
            sb.append(", participant_count=");
            sb.append(this.participant_count);
        }
        if (this.template_name != null) {
            sb.append(", template_name=");
            sb.append(this.template_name);
        }
        if (this.template_thumbnail_url != null) {
            sb.append(", template_thumbnail_url=");
            sb.append(this.template_thumbnail_url);
        }
        if (this.template_resource_id != null) {
            sb.append(", template_resource_id=");
            sb.append(this.template_resource_id);
        }
        sb.replace(0, 2, "AIGroupShotTemplateInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241421Co8)) {
            return false;
        }
        C2241421Co8 c2241421Co8 = (C2241421Co8) obj;
        if (unknownFields().equals(c2241421Co8.unknownFields()) && C1516540pZE.LJ(this.template_id, c2241421Co8.template_id) && C1516540pZE.LJ(this.participant_count, c2241421Co8.participant_count) && C1516540pZE.LJ(this.template_name, c2241421Co8.template_name) && C1516540pZE.LJ(this.template_thumbnail_url, c2241421Co8.template_thumbnail_url) && C1516540pZE.LJ(this.template_resource_id, c2241421Co8.template_resource_id)) {
            return true;
        }
        return false;
    }

    public C2241421Co8(String str, Integer num, String str2, String str3, String str4) {
        this(str, num, str2, str3, str4, ByteString.EMPTY);
    }

    public C2241421Co8(String str, Integer num, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.template_id = str;
        this.participant_count = num;
        this.template_name = str2;
        this.template_thumbnail_url = str3;
        this.template_resource_id = str4;
    }
}
