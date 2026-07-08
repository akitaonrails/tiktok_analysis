package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233581CbU extends Message<C2233581CbU, C2233601CbW> {
    public static final ProtoAdapter<C2233581CbU> ADAPTER = new ProtoAdapter<C2233581CbU>() { // from class: X.1CbV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233581CbU decode(ProtoReader protoReader) {
            C2233601CbW c2233601CbW = new C2233601CbW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2233601CbW.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2233601CbW.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2233601CbW.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2233601CbW.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2233601CbW.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2233601CbW.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233601CbW.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233601CbW.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233581CbU c2233581CbU) {
            C2233581CbU c2233581CbU2 = c2233581CbU;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2233581CbU2.layout_id) + protoAdapter.encodedSizeWithTag(2, c2233581CbU2.layout_key) + protoAdapter.encodedSizeWithTag(3, c2233581CbU2.multi_guest_layout_extra) + protoAdapter.encodedSizeWithTag(4, c2233581CbU2.cohost_layout_extra) + protoAdapter.encodedSizeWithTag(5, c2233581CbU2.multi_guest_layout_non_sei_extra) + protoAdapter.encodedSizeWithTag(6, c2233581CbU2.cohost_layout_non_sei_extra) + c2233581CbU2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233581CbU redact(C2233581CbU c2233581CbU) {
            C2233601CbW c2233601CbWNewBuilder = c2233581CbU.newBuilder();
            c2233601CbWNewBuilder.clearUnknownFields();
            return c2233601CbWNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233581CbU c2233581CbU) {
            C2233581CbU c2233581CbU2 = c2233581CbU;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2233581CbU2.layout_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2233581CbU2.layout_key);
            protoAdapter.encodeWithTag(protoWriter, 3, c2233581CbU2.multi_guest_layout_extra);
            protoAdapter.encodeWithTag(protoWriter, 4, c2233581CbU2.cohost_layout_extra);
            protoAdapter.encodeWithTag(protoWriter, 5, c2233581CbU2.multi_guest_layout_non_sei_extra);
            protoAdapter.encodeWithTag(protoWriter, 6, c2233581CbU2.cohost_layout_non_sei_extra);
            protoWriter.writeBytes(c2233581CbU2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String cohost_layout_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String cohost_layout_non_sei_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String layout_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String layout_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String multi_guest_layout_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String multi_guest_layout_non_sei_extra;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.layout_id.hashCode()) * 37) + this.layout_key.hashCode()) * 37;
        String str = this.multi_guest_layout_extra;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cohost_layout_extra;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.multi_guest_layout_non_sei_extra;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cohost_layout_non_sei_extra;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2233601CbW newBuilder() {
        C2233601CbW c2233601CbW = new C2233601CbW();
        c2233601CbW.LIZLLL = this.layout_id;
        c2233601CbW.LJ = this.layout_key;
        c2233601CbW.LJFF = this.multi_guest_layout_extra;
        c2233601CbW.LJI = this.cohost_layout_extra;
        c2233601CbW.LJII = this.multi_guest_layout_non_sei_extra;
        c2233601CbW.LJIIIIZZ = this.cohost_layout_non_sei_extra;
        c2233601CbW.addUnknownFields(unknownFields());
        return c2233601CbW;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", layout_id=");
        sb.append(this.layout_id);
        sb.append(", layout_key=");
        sb.append(this.layout_key);
        if (this.multi_guest_layout_extra != null) {
            sb.append(", multi_guest_layout_extra=");
            sb.append(this.multi_guest_layout_extra);
        }
        if (this.cohost_layout_extra != null) {
            sb.append(", cohost_layout_extra=");
            sb.append(this.cohost_layout_extra);
        }
        if (this.multi_guest_layout_non_sei_extra != null) {
            sb.append(", multi_guest_layout_non_sei_extra=");
            sb.append(this.multi_guest_layout_non_sei_extra);
        }
        if (this.cohost_layout_non_sei_extra != null) {
            sb.append(", cohost_layout_non_sei_extra=");
            sb.append(this.cohost_layout_non_sei_extra);
        }
        sb.replace(0, 2, "LinkMicLayoutState{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233581CbU)) {
            return false;
        }
        C2233581CbU c2233581CbU = (C2233581CbU) obj;
        if (unknownFields().equals(c2233581CbU.unknownFields()) && this.layout_id.equals(c2233581CbU.layout_id) && this.layout_key.equals(c2233581CbU.layout_key) && C1516540pZE.LJ(this.multi_guest_layout_extra, c2233581CbU.multi_guest_layout_extra) && C1516540pZE.LJ(this.cohost_layout_extra, c2233581CbU.cohost_layout_extra) && C1516540pZE.LJ(this.multi_guest_layout_non_sei_extra, c2233581CbU.multi_guest_layout_non_sei_extra) && C1516540pZE.LJ(this.cohost_layout_non_sei_extra, c2233581CbU.cohost_layout_non_sei_extra)) {
            return true;
        }
        return false;
    }

    public C2233581CbU(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public C2233581CbU(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.layout_id = str;
        this.layout_key = str2;
        this.multi_guest_layout_extra = str3;
        this.cohost_layout_extra = str4;
        this.multi_guest_layout_non_sei_extra = str5;
        this.cohost_layout_non_sei_extra = str6;
    }
}
