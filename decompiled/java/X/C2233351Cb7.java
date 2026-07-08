package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233351Cb7 extends Message<C2233351Cb7, C2233361Cb8> {
    public static final ProtoAdapter<C2233351Cb7> ADAPTER = new ProtoAdapter<C2233351Cb7>() { // from class: X.1Cb6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233351Cb7 decode(ProtoReader protoReader) {
            C2233361Cb8 c2233361Cb8 = new C2233361Cb8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2233361Cb8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2233361Cb8.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2233361Cb8.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2233361Cb8.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2233361Cb8.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233361Cb8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233351Cb7 c2233351Cb7) {
            C2233351Cb7 c2233351Cb72 = c2233351Cb7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2233351Cb72.multi_guest_layout_extra) + protoAdapter.encodedSizeWithTag(2, c2233351Cb72.cohost_layout_extra) + protoAdapter.encodedSizeWithTag(3, c2233351Cb72.multi_guest_layout_non_sei_extra) + protoAdapter.encodedSizeWithTag(4, c2233351Cb72.cohost_layout_non_sei_extra) + c2233351Cb72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233351Cb7 redact(C2233351Cb7 c2233351Cb7) {
            C2233361Cb8 c2233361Cb8NewBuilder = c2233351Cb7.newBuilder();
            c2233361Cb8NewBuilder.clearUnknownFields();
            return c2233361Cb8NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233351Cb7 c2233351Cb7) {
            C2233351Cb7 c2233351Cb72 = c2233351Cb7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2233351Cb72.multi_guest_layout_extra);
            protoAdapter.encodeWithTag(protoWriter, 2, c2233351Cb72.cohost_layout_extra);
            protoAdapter.encodeWithTag(protoWriter, 3, c2233351Cb72.multi_guest_layout_non_sei_extra);
            protoAdapter.encodeWithTag(protoWriter, 4, c2233351Cb72.cohost_layout_non_sei_extra);
            protoWriter.writeBytes(c2233351Cb72.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String cohost_layout_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String cohost_layout_non_sei_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String multi_guest_layout_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String multi_guest_layout_non_sei_extra;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
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
    public C2233361Cb8 newBuilder() {
        C2233361Cb8 c2233361Cb8 = new C2233361Cb8();
        c2233361Cb8.LIZLLL = this.multi_guest_layout_extra;
        c2233361Cb8.LJ = this.cohost_layout_extra;
        c2233361Cb8.LJFF = this.multi_guest_layout_non_sei_extra;
        c2233361Cb8.LJI = this.cohost_layout_non_sei_extra;
        c2233361Cb8.addUnknownFields(unknownFields());
        return c2233361Cb8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
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
        sb.replace(0, 2, "LinkMicLayoutExtra{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233351Cb7)) {
            return false;
        }
        C2233351Cb7 c2233351Cb7 = (C2233351Cb7) obj;
        if (unknownFields().equals(c2233351Cb7.unknownFields()) && C1516540pZE.LJ(this.multi_guest_layout_extra, c2233351Cb7.multi_guest_layout_extra) && C1516540pZE.LJ(this.cohost_layout_extra, c2233351Cb7.cohost_layout_extra) && C1516540pZE.LJ(this.multi_guest_layout_non_sei_extra, c2233351Cb7.multi_guest_layout_non_sei_extra) && C1516540pZE.LJ(this.cohost_layout_non_sei_extra, c2233351Cb7.cohost_layout_non_sei_extra)) {
            return true;
        }
        return false;
    }

    public C2233351Cb7(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public C2233351Cb7(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.multi_guest_layout_extra = str;
        this.cohost_layout_extra = str2;
        this.multi_guest_layout_non_sei_extra = str3;
        this.cohost_layout_non_sei_extra = str4;
    }
}
