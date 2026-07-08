package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233171Cap extends Message<C2233171Cap, C2233201Cas> {
    public static final ProtoAdapter<C2233171Cap> ADAPTER = new ProtoAdapter<C2233171Cap>() { // from class: X.1Cao
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233171Cap decode(ProtoReader protoReader) {
            C2233201Cas c2233201Cas = new C2233201Cas();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2233201Cas.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2233201Cas.LJ = C1CW4.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2233201Cas.LJFF = C1CO9.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2233201Cas.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2233201Cas.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2233201Cas.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2233201Cas.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233201Cas.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233201Cas.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233171Cap c2233171Cap) {
            C2233171Cap c2233171Cap2 = c2233171Cap;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c2233171Cap2.spot_id) + C1CW4.ADAPTER.encodedSizeWithTag(2, c2233171Cap2.pos_identity) + C1CO9.ADAPTER.encodedSizeWithTag(3, c2233171Cap2.pos_identity_extra);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c2233171Cap2.multi_guest_spot_extra) + protoAdapter.encodedSizeWithTag(5, c2233171Cap2.cohost_spot_extra) + protoAdapter.encodedSizeWithTag(6, c2233171Cap2.multi_guest_spot_non_sei_extra) + protoAdapter.encodedSizeWithTag(7, c2233171Cap2.cohost_spot_non_sei_extra) + c2233171Cap2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233171Cap redact(C2233171Cap c2233171Cap) {
            C2233201Cas c2233201CasNewBuilder = c2233171Cap.newBuilder();
            C1CW4 c1cw4 = c2233201CasNewBuilder.LJ;
            if (c1cw4 != null) {
                c2233201CasNewBuilder.LJ = C1CW4.ADAPTER.redact(c1cw4);
            }
            C1CO9 c1co9 = c2233201CasNewBuilder.LJFF;
            if (c1co9 != null) {
                c2233201CasNewBuilder.LJFF = C1CO9.ADAPTER.redact(c1co9);
            }
            c2233201CasNewBuilder.clearUnknownFields();
            return c2233201CasNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233171Cap c2233171Cap) {
            C2233171Cap c2233171Cap2 = c2233171Cap;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c2233171Cap2.spot_id);
            C1CW4.ADAPTER.encodeWithTag(protoWriter, 2, c2233171Cap2.pos_identity);
            C1CO9.ADAPTER.encodeWithTag(protoWriter, 3, c2233171Cap2.pos_identity_extra);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c2233171Cap2.multi_guest_spot_extra);
            protoAdapter.encodeWithTag(protoWriter, 5, c2233171Cap2.cohost_spot_extra);
            protoAdapter.encodeWithTag(protoWriter, 6, c2233171Cap2.multi_guest_spot_non_sei_extra);
            protoAdapter.encodeWithTag(protoWriter, 7, c2233171Cap2.cohost_spot_non_sei_extra);
            protoWriter.writeBytes(c2233171Cap2.unknownFields());
        }
    };
    public static final Long DEFAULT_SPOT_ID = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String cohost_spot_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String cohost_spot_non_sei_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String multi_guest_spot_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String multi_guest_spot_non_sei_extra;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentity#ADAPTER", tag = 2)
    public final C1CW4 pos_identity;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicPosIdentityExtra#ADAPTER", tag = 3)
    public final C1CO9 pos_identity_extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public final Long spot_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.spot_id.hashCode()) * 37;
        C1CW4 c1cw4 = this.pos_identity;
        int iHashCode2 = (iHashCode + (c1cw4 != null ? c1cw4.hashCode() : 0)) * 37;
        C1CO9 c1co9 = this.pos_identity_extra;
        int iHashCode3 = (iHashCode2 + (c1co9 != null ? c1co9.hashCode() : 0)) * 37;
        String str = this.multi_guest_spot_extra;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cohost_spot_extra;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.multi_guest_spot_non_sei_extra;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.cohost_spot_non_sei_extra;
        int iHashCode7 = iHashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2233201Cas newBuilder() {
        C2233201Cas c2233201Cas = new C2233201Cas();
        c2233201Cas.LIZLLL = this.spot_id;
        c2233201Cas.LJ = this.pos_identity;
        c2233201Cas.LJFF = this.pos_identity_extra;
        c2233201Cas.LJI = this.multi_guest_spot_extra;
        c2233201Cas.LJII = this.cohost_spot_extra;
        c2233201Cas.LJIIIIZZ = this.multi_guest_spot_non_sei_extra;
        c2233201Cas.LJIIIZ = this.cohost_spot_non_sei_extra;
        c2233201Cas.addUnknownFields(unknownFields());
        return c2233201Cas;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", spot_id=");
        sb.append(this.spot_id);
        if (this.pos_identity != null) {
            sb.append(", pos_identity=");
            sb.append(this.pos_identity);
        }
        if (this.pos_identity_extra != null) {
            sb.append(", pos_identity_extra=");
            sb.append(this.pos_identity_extra);
        }
        if (this.multi_guest_spot_extra != null) {
            sb.append(", multi_guest_spot_extra=");
            sb.append(this.multi_guest_spot_extra);
        }
        if (this.cohost_spot_extra != null) {
            sb.append(", cohost_spot_extra=");
            sb.append(this.cohost_spot_extra);
        }
        if (this.multi_guest_spot_non_sei_extra != null) {
            sb.append(", multi_guest_spot_non_sei_extra=");
            sb.append(this.multi_guest_spot_non_sei_extra);
        }
        if (this.cohost_spot_non_sei_extra != null) {
            sb.append(", cohost_spot_non_sei_extra=");
            sb.append(this.cohost_spot_non_sei_extra);
        }
        sb.replace(0, 2, "LinkMicSpotInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233171Cap)) {
            return false;
        }
        C2233171Cap c2233171Cap = (C2233171Cap) obj;
        if (unknownFields().equals(c2233171Cap.unknownFields()) && this.spot_id.equals(c2233171Cap.spot_id) && C1516540pZE.LJ(this.pos_identity, c2233171Cap.pos_identity) && C1516540pZE.LJ(this.pos_identity_extra, c2233171Cap.pos_identity_extra) && C1516540pZE.LJ(this.multi_guest_spot_extra, c2233171Cap.multi_guest_spot_extra) && C1516540pZE.LJ(this.cohost_spot_extra, c2233171Cap.cohost_spot_extra) && C1516540pZE.LJ(this.multi_guest_spot_non_sei_extra, c2233171Cap.multi_guest_spot_non_sei_extra) && C1516540pZE.LJ(this.cohost_spot_non_sei_extra, c2233171Cap.cohost_spot_non_sei_extra)) {
            return true;
        }
        return false;
    }

    public C2233171Cap(Long l, C1CW4 c1cw4, C1CO9 c1co9, String str, String str2, String str3, String str4) {
        this(l, c1cw4, c1co9, str, str2, str3, str4, ByteString.EMPTY);
    }

    public C2233171Cap(Long l, C1CW4 c1cw4, C1CO9 c1co9, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.spot_id = l;
        this.pos_identity = c1cw4;
        this.pos_identity_extra = c1co9;
        this.multi_guest_spot_extra = str;
        this.cohost_spot_extra = str2;
        this.multi_guest_spot_non_sei_extra = str3;
        this.cohost_spot_non_sei_extra = str4;
    }
}
