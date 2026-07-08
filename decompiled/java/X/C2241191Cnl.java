package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241191Cnl extends Message<C2241191Cnl, C2241251Cnr> {
    public static final ProtoAdapter<C2241191Cnl> ADAPTER = new ProtoAdapter<C2241191Cnl>() { // from class: X.1Cnm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241191Cnl decode(ProtoReader protoReader) {
            C2241251Cnr c2241251Cnr = new C2241251Cnr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2241251Cnr.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2241251Cnr.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2241251Cnr.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2241251Cnr.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2241251Cnr.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c2241251Cnr.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2241251Cnr.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2241251Cnr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241251Cnr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241191Cnl c2241191Cnl) {
            C2241191Cnl c2241191Cnl2 = c2241191Cnl;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2241191Cnl2.title) + protoAdapter.encodedSizeWithTag(2, c2241191Cnl2.subtitle) + protoAdapter.encodedSizeWithTag(3, c2241191Cnl2.button_title) + protoAdapter.encodedSizeWithTag(4, c2241191Cnl2.schema) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c2241191Cnl2.button_invisible) + protoAdapter.encodedSizeWithTag(6, c2241191Cnl2.clicked_title) + protoAdapter.encodedSizeWithTag(7, c2241191Cnl2.clicked_subtitle) + c2241191Cnl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241191Cnl redact(C2241191Cnl c2241191Cnl) {
            C2241251Cnr c2241251CnrNewBuilder = c2241191Cnl.newBuilder();
            c2241251CnrNewBuilder.clearUnknownFields();
            return c2241251CnrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241191Cnl c2241191Cnl) {
            C2241191Cnl c2241191Cnl2 = c2241191Cnl;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2241191Cnl2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c2241191Cnl2.subtitle);
            protoAdapter.encodeWithTag(protoWriter, 3, c2241191Cnl2.button_title);
            protoAdapter.encodeWithTag(protoWriter, 4, c2241191Cnl2.schema);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c2241191Cnl2.button_invisible);
            protoAdapter.encodeWithTag(protoWriter, 6, c2241191Cnl2.clicked_title);
            protoAdapter.encodeWithTag(protoWriter, 7, c2241191Cnl2.clicked_subtitle);
            protoWriter.writeBytes(c2241191Cnl2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_BUTTON_INVISIBLE = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean button_invisible;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String clicked_subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String clicked_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String schema;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String title;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.button_title;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.schema;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.button_invisible;
        int iHashCode6 = (iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 37;
        String str5 = this.clicked_title;
        int iHashCode7 = (iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.clicked_subtitle;
        int iHashCode8 = iHashCode7 + (str6 != null ? str6.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public C2241251Cnr newBuilder() {
        C2241251Cnr c2241251Cnr = new C2241251Cnr();
        c2241251Cnr.LIZLLL = this.title;
        c2241251Cnr.LJ = this.subtitle;
        c2241251Cnr.LJFF = this.button_title;
        c2241251Cnr.LJI = this.schema;
        c2241251Cnr.LJII = this.button_invisible;
        c2241251Cnr.LJIIIIZZ = this.clicked_title;
        c2241251Cnr.LJIIIZ = this.clicked_subtitle;
        c2241251Cnr.addUnknownFields(unknownFields());
        return c2241251Cnr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.title != null) {
            sb.append(", title=");
            sb.append(this.title);
        }
        if (this.subtitle != null) {
            sb.append(", subtitle=");
            sb.append(this.subtitle);
        }
        if (this.button_title != null) {
            sb.append(", button_title=");
            sb.append(this.button_title);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.button_invisible != null) {
            sb.append(", button_invisible=");
            sb.append(this.button_invisible);
        }
        if (this.clicked_title != null) {
            sb.append(", clicked_title=");
            sb.append(this.clicked_title);
        }
        if (this.clicked_subtitle != null) {
            sb.append(", clicked_subtitle=");
            sb.append(this.clicked_subtitle);
        }
        sb.replace(0, 2, "VisualPoetQuota{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241191Cnl)) {
            return false;
        }
        C2241191Cnl c2241191Cnl = (C2241191Cnl) obj;
        if (unknownFields().equals(c2241191Cnl.unknownFields()) && C1516540pZE.LJ(this.title, c2241191Cnl.title) && C1516540pZE.LJ(this.subtitle, c2241191Cnl.subtitle) && C1516540pZE.LJ(this.button_title, c2241191Cnl.button_title) && C1516540pZE.LJ(this.schema, c2241191Cnl.schema) && C1516540pZE.LJ(this.button_invisible, c2241191Cnl.button_invisible) && C1516540pZE.LJ(this.clicked_title, c2241191Cnl.clicked_title) && C1516540pZE.LJ(this.clicked_subtitle, c2241191Cnl.clicked_subtitle)) {
            return true;
        }
        return false;
    }

    public C2241191Cnl(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6) {
        this(str, str2, str3, str4, bool, str5, str6, ByteString.EMPTY);
    }

    public C2241191Cnl(String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.subtitle = str2;
        this.button_title = str3;
        this.schema = str4;
        this.button_invisible = bool;
        this.clicked_title = str5;
        this.clicked_subtitle = str6;
    }
}
