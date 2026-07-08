package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227561CGk extends Message<C2227561CGk, C2227581CGm> {
    public static final ProtoAdapter<C2227561CGk> ADAPTER = new ProtoAdapter<C2227561CGk>() { // from class: X.1CGl
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227561CGk decode(ProtoReader protoReader) {
            C2227581CGm c2227581CGm = new C2227581CGm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2227581CGm.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2227581CGm.LJFF.putAll(this.LIZ.decode(protoReader));
                            }
                        } else {
                            c2227581CGm.LJ = C2232021CXo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227581CGm.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227581CGm.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227561CGk c2227561CGk) {
            C2227561CGk c2227561CGk2 = c2227561CGk;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2227561CGk2.invoke_id) + C2232021CXo.ADAPTER.encodedSizeWithTag(2, c2227561CGk2.invitee) + this.LIZ.encodedSizeWithTag(3, c2227561CGk2.extra) + c2227561CGk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227561CGk redact(C2227561CGk c2227561CGk) {
            C2227581CGm c2227581CGmNewBuilder = c2227561CGk.newBuilder();
            c2227581CGmNewBuilder.LJ = C2232021CXo.ADAPTER.redact(c2227581CGmNewBuilder.LJ);
            c2227581CGmNewBuilder.clearUnknownFields();
            return c2227581CGmNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227561CGk c2227561CGk) {
            C2227561CGk c2227561CGk2 = c2227561CGk;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c2227561CGk2.invoke_id);
            C2232021CXo.ADAPTER.encodeWithTag(protoWriter, 2, c2227561CGk2.invitee);
            this.LIZ.encodeWithTag(protoWriter, 3, c2227561CGk2.extra);
            protoWriter.writeBytes(c2227561CGk2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, String> extra;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLinkUser#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2232021CXo invitee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String invoke_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.invoke_id.hashCode()) * 37) + this.invitee.hashCode()) * 37) + this.extra.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227581CGm newBuilder() {
        C2227581CGm c2227581CGm = new C2227581CGm();
        c2227581CGm.LIZLLL = this.invoke_id;
        c2227581CGm.LJ = this.invitee;
        c2227581CGm.LJFF = C1516540pZE.LIZLLL("extra", this.extra);
        c2227581CGm.addUnknownFields(unknownFields());
        return c2227581CGm;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", invoke_id=");
        sb.append(this.invoke_id);
        sb.append(", invitee=");
        sb.append(this.invitee);
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "LinkMicCancelInviteParam{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2227561CGk)) {
            return false;
        }
        C2227561CGk c2227561CGk = (C2227561CGk) obj;
        if (unknownFields().equals(c2227561CGk.unknownFields()) && this.invoke_id.equals(c2227561CGk.invoke_id) && this.invitee.equals(c2227561CGk.invitee) && this.extra.equals(c2227561CGk.extra)) {
            return true;
        }
        return false;
    }

    public C2227561CGk(String str, C2232021CXo c2232021CXo, Map<String, String> map) {
        this(str, c2232021CXo, map, ByteString.EMPTY);
    }

    public C2227561CGk(String str, C2232021CXo c2232021CXo, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.invoke_id = str;
        this.invitee = c2232021CXo;
        this.extra = C1516540pZE.LJI("extra", map);
    }
}
