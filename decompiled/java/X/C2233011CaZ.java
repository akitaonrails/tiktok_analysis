package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233011CaZ extends Message<C2233011CaZ, C2233031Cab> {
    public static final ProtoAdapter<C2233011CaZ> ADAPTER = new ProtoAdapter<C2233011CaZ>() { // from class: X.1Caa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233011CaZ decode(ProtoReader protoReader) {
            C2233031Cab c2233031Cab = new C2233031Cab();
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
                                        c2233031Cab.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2233031Cab.LJII = ProtoAdapter.INT64.decode(protoReader);
                                    }
                                } else {
                                    c2233031Cab.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2233031Cab.LJFF = C2232021CXo.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2233031Cab.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2233031Cab.LIZLLL = C2232021CXo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233031Cab.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233011CaZ c2233011CaZ) {
            C2233011CaZ c2233011CaZ2 = c2233011CaZ;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2233011CaZ2.invitor) + protoAdapter.encodedSizeWithTag(2, c2233011CaZ2.invitee) + protoAdapter.encodedSizeWithTag(3, c2233011CaZ2.operator_p) + ProtoAdapter.STRING.encodedSizeWithTag(4, c2233011CaZ2.layout_id) + ProtoAdapter.INT64.encodedSizeWithTag(5, c2233011CaZ2.scene_version) + c2233011CaZ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233011CaZ redact(C2233011CaZ c2233011CaZ) {
            C2233031Cab c2233031CabNewBuilder = c2233011CaZ.newBuilder();
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            c2233031CabNewBuilder.LIZLLL = protoAdapter.redact(c2233031CabNewBuilder.LIZLLL);
            c2233031CabNewBuilder.LJ = protoAdapter.redact(c2233031CabNewBuilder.LJ);
            c2233031CabNewBuilder.LJFF = protoAdapter.redact(c2233031CabNewBuilder.LJFF);
            c2233031CabNewBuilder.clearUnknownFields();
            return c2233031CabNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233011CaZ c2233011CaZ) {
            C2233011CaZ c2233011CaZ2 = c2233011CaZ;
            ProtoAdapter<C2232021CXo> protoAdapter = C2232021CXo.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c2233011CaZ2.invitor);
            protoAdapter.encodeWithTag(protoWriter, 2, c2233011CaZ2.invitee);
            protoAdapter.encodeWithTag(protoWriter, 3, c2233011CaZ2.operator_p);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, c2233011CaZ2.layout_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c2233011CaZ2.scene_version);
            protoWriter.writeBytes(c2233011CaZ2.unknownFields());
        }
    };
    public static final Long DEFAULT_SCENE_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo invitee;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C2232021CXo invitor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String layout_id;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final C2232021CXo operator_p;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public final Long scene_version;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.invitor.hashCode()) * 37) + this.invitee.hashCode()) * 37) + this.operator_p.hashCode()) * 37) + this.layout_id.hashCode()) * 37) + this.scene_version.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233031Cab newBuilder() {
        C2233031Cab c2233031Cab = new C2233031Cab();
        c2233031Cab.LIZLLL = this.invitor;
        c2233031Cab.LJ = this.invitee;
        c2233031Cab.LJFF = this.operator_p;
        c2233031Cab.LJI = this.layout_id;
        c2233031Cab.LJII = this.scene_version;
        c2233031Cab.addUnknownFields(unknownFields());
        return c2233031Cab;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invitor=");
        sb.append(this.invitor);
        sb.append(", invitee=");
        sb.append(this.invitee);
        sb.append(", operator_p=");
        sb.append(this.operator_p);
        sb.append(", layout_id=");
        sb.append(this.layout_id);
        sb.append(", scene_version=");
        sb.append(this.scene_version);
        sb.replace(0, 2, "LinkMicImInviteModel{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233011CaZ)) {
            return false;
        }
        C2233011CaZ c2233011CaZ = (C2233011CaZ) obj;
        if (unknownFields().equals(c2233011CaZ.unknownFields()) && this.invitor.equals(c2233011CaZ.invitor) && this.invitee.equals(c2233011CaZ.invitee) && this.operator_p.equals(c2233011CaZ.operator_p) && this.layout_id.equals(c2233011CaZ.layout_id) && this.scene_version.equals(c2233011CaZ.scene_version)) {
            return true;
        }
        return false;
    }

    public C2233011CaZ(C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2, C2232021CXo c2232021CXo3, String str, Long l) {
        this(c2232021CXo, c2232021CXo2, c2232021CXo3, str, l, ByteString.EMPTY);
    }

    public C2233011CaZ(C2232021CXo c2232021CXo, C2232021CXo c2232021CXo2, C2232021CXo c2232021CXo3, String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invitor = c2232021CXo;
        this.invitee = c2232021CXo2;
        this.operator_p = c2232021CXo3;
        this.layout_id = str;
        this.scene_version = l;
    }
}
