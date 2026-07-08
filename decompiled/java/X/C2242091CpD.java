package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2242091CpD extends Message<C2242091CpD, C2242121CpG> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public final Boolean hide_card;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String resource_cover_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String resource_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer resource_type;
    public static final ProtoAdapter<C2242091CpD> ADAPTER = new ProtoAdapter<C2242091CpD>() { // from class: X.1CpE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242091CpD decode(ProtoReader protoReader) {
            C2242121CpG c2242121CpG = new C2242121CpG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2242121CpG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2242121CpG.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c2242121CpG.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2242121CpG.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2242121CpG.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2242121CpG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2242091CpD c2242091CpD) {
            C2242091CpD c2242091CpD2 = c2242091CpD;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c2242091CpD2.resource_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2242091CpD2.resource_id) + protoAdapter.encodedSizeWithTag(3, c2242091CpD2.resource_cover_url) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c2242091CpD2.hide_card) + c2242091CpD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2242091CpD redact(C2242091CpD c2242091CpD) {
            C2242121CpG c2242121CpGNewBuilder = c2242091CpD.newBuilder();
            c2242121CpGNewBuilder.clearUnknownFields();
            return c2242121CpGNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2242091CpD c2242091CpD) {
            C2242091CpD c2242091CpD2 = c2242091CpD;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c2242091CpD2.resource_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c2242091CpD2.resource_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c2242091CpD2.resource_cover_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c2242091CpD2.hide_card);
            protoWriter.writeBytes(c2242091CpD2.unknownFields());
        }
    };
    public static final Integer DEFAULT_RESOURCE_TYPE = 0;
    public static final Boolean DEFAULT_HIDE_CARD = Boolean.FALSE;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.resource_type;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        String str = this.resource_id;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.resource_cover_url;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.hide_card;
        int iHashCode5 = iHashCode4 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2242121CpG newBuilder() {
        C2242121CpG c2242121CpG = new C2242121CpG();
        c2242121CpG.LIZLLL = this.resource_type;
        c2242121CpG.LJ = this.resource_id;
        c2242121CpG.LJFF = this.resource_cover_url;
        c2242121CpG.LJI = this.hide_card;
        c2242121CpG.addUnknownFields(unknownFields());
        return c2242121CpG;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.resource_type != null) {
            sb.append(", resource_type=");
            sb.append(this.resource_type);
        }
        if (this.resource_id != null) {
            sb.append(", resource_id=");
            sb.append(this.resource_id);
        }
        if (this.resource_cover_url != null) {
            sb.append(", resource_cover_url=");
            sb.append(this.resource_cover_url);
        }
        if (this.hide_card != null) {
            sb.append(", hide_card=");
            sb.append(this.hide_card);
        }
        sb.replace(0, 2, "DynamicCardClientInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2242091CpD)) {
            return false;
        }
        C2242091CpD c2242091CpD = (C2242091CpD) obj;
        if (unknownFields().equals(c2242091CpD.unknownFields()) && C1516540pZE.LJ(this.resource_type, c2242091CpD.resource_type) && C1516540pZE.LJ(this.resource_id, c2242091CpD.resource_id) && C1516540pZE.LJ(this.resource_cover_url, c2242091CpD.resource_cover_url) && C1516540pZE.LJ(this.hide_card, c2242091CpD.hide_card)) {
            return true;
        }
        return false;
    }

    public C2242091CpD(Integer num, String str, String str2, Boolean bool) {
        this(num, str, str2, bool, ByteString.EMPTY);
    }

    public C2242091CpD(Integer num, String str, String str2, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.resource_type = num;
        this.resource_id = str;
        this.resource_cover_url = str2;
        this.hide_card = bool;
    }
}
