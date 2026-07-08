package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243191Cqz extends Message<C2243191Cqz, C2243241Cr4> {
    public static final ProtoAdapter<C2243191Cqz> ADAPTER = new ProtoAdapter<C2243191Cqz>() { // from class: X.1Cr0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243191Cqz decode(ProtoReader protoReader) {
            C2243241Cr4 c2243241Cr4 = new C2243241Cr4();
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
                                        c2243241Cr4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2243241Cr4.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    try {
                                        c2243241Cr4.LJI = C0IBH.ADAPTER.decode(protoReader);
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        c2243241Cr4.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    }
                                }
                            } else {
                                c2243241Cr4.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2243241Cr4.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2243241Cr4.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243241Cr4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243191Cqz c2243191Cqz) {
            C2243191Cqz c2243191Cqz2 = c2243191Cqz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2243191Cqz2.card_content) + protoAdapter.encodedSizeWithTag(2, c2243191Cqz2.card_header) + protoAdapter.encodedSizeWithTag(3, c2243191Cqz2.card_footer) + C0IBH.ADAPTER.encodedSizeWithTag(4, c2243191Cqz2.status) + protoAdapter.encodedSizeWithTag(5, c2243191Cqz2.card_style_id) + c2243191Cqz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243191Cqz redact(C2243191Cqz c2243191Cqz) {
            C2243241Cr4 c2243241Cr4NewBuilder = c2243191Cqz.newBuilder();
            c2243241Cr4NewBuilder.clearUnknownFields();
            return c2243241Cr4NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243191Cqz c2243191Cqz) {
            C2243191Cqz c2243191Cqz2 = c2243191Cqz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2243191Cqz2.card_content);
            protoAdapter.encodeWithTag(protoWriter, 2, c2243191Cqz2.card_header);
            protoAdapter.encodeWithTag(protoWriter, 3, c2243191Cqz2.card_footer);
            C0IBH.ADAPTER.encodeWithTag(protoWriter, 4, c2243191Cqz2.status);
            protoAdapter.encodeWithTag(protoWriter, 5, c2243191Cqz2.card_style_id);
            protoWriter.writeBytes(c2243191Cqz2.unknownFields());
        }
    };
    public static final C0IBH DEFAULT_STATUS = C0IBH.GREETING_CARD_STATUS_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String card_content;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String card_footer;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String card_header;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String card_style_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.GreetingCardStatus#ADAPTER", tag = 4)
    public final C0IBH status;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.card_content;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.card_header;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.card_footer;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        C0IBH c0ibh = this.status;
        int iHashCode5 = (iHashCode4 + (c0ibh != null ? c0ibh.hashCode() : 0)) * 37;
        String str4 = this.card_style_id;
        int iHashCode6 = iHashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2243241Cr4 newBuilder() {
        C2243241Cr4 c2243241Cr4 = new C2243241Cr4();
        c2243241Cr4.LIZLLL = this.card_content;
        c2243241Cr4.LJ = this.card_header;
        c2243241Cr4.LJFF = this.card_footer;
        c2243241Cr4.LJI = this.status;
        c2243241Cr4.LJII = this.card_style_id;
        c2243241Cr4.addUnknownFields(unknownFields());
        return c2243241Cr4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.card_content != null) {
            sb.append(", card_content=");
            sb.append(this.card_content);
        }
        if (this.card_header != null) {
            sb.append(", card_header=");
            sb.append(this.card_header);
        }
        if (this.card_footer != null) {
            sb.append(", card_footer=");
            sb.append(this.card_footer);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.card_style_id != null) {
            sb.append(", card_style_id=");
            sb.append(this.card_style_id);
        }
        sb.replace(0, 2, "GreetingCardInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243191Cqz)) {
            return false;
        }
        C2243191Cqz c2243191Cqz = (C2243191Cqz) obj;
        if (unknownFields().equals(c2243191Cqz.unknownFields()) && C1516540pZE.LJ(this.card_content, c2243191Cqz.card_content) && C1516540pZE.LJ(this.card_header, c2243191Cqz.card_header) && C1516540pZE.LJ(this.card_footer, c2243191Cqz.card_footer) && C1516540pZE.LJ(this.status, c2243191Cqz.status) && C1516540pZE.LJ(this.card_style_id, c2243191Cqz.card_style_id)) {
            return true;
        }
        return false;
    }

    public C2243191Cqz(String str, String str2, String str3, C0IBH c0ibh, String str4) {
        this(str, str2, str3, c0ibh, str4, ByteString.EMPTY);
    }

    public C2243191Cqz(String str, String str2, String str3, C0IBH c0ibh, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.card_content = str;
        this.card_header = str2;
        this.card_footer = str3;
        this.status = c0ibh;
        this.card_style_id = str4;
    }
}
