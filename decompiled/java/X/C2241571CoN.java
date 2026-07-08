package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2241571CoN extends Message<C2241571CoN, C2241551CoL> {
    public static final ProtoAdapter<C2241571CoN> ADAPTER = new ProtoAdapter<C2241571CoN>() { // from class: X.1CoM
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241571CoN decode(ProtoReader protoReader) {
            C2241551CoL c2241551CoL = new C2241551CoL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2241551CoL.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2241551CoL.LJI.putAll(this.LIZ.decode(protoReader));
                                }
                            } else {
                                c2241551CoL.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2241551CoL.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c2241551CoL.LIZLLL = C2241591CoP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2241551CoL.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2241571CoN c2241571CoN) {
            C2241571CoN c2241571CoN2 = c2241571CoN;
            return C2241591CoP.ADAPTER.encodedSizeWithTag(1, c2241571CoN2.ttl) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, c2241571CoN2.context_menu) + ProtoAdapter.INT64.encodedSizeWithTag(3, c2241571CoN2.min_version) + this.LIZ.encodedSizeWithTag(4, c2241571CoN2.extra) + c2241571CoN2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2241571CoN redact(C2241571CoN c2241571CoN) {
            C2241551CoL c2241551CoLNewBuilder = c2241571CoN.newBuilder();
            C2241591CoP c2241591CoP = c2241551CoLNewBuilder.LIZLLL;
            if (c2241591CoP != null) {
                c2241551CoLNewBuilder.LIZLLL = C2241591CoP.ADAPTER.redact(c2241591CoP);
            }
            c2241551CoLNewBuilder.clearUnknownFields();
            return c2241551CoLNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2241571CoN c2241571CoN) {
            C2241571CoN c2241571CoN2 = c2241571CoN;
            C2241591CoP.ADAPTER.encodeWithTag(protoWriter, 1, c2241571CoN2.ttl);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, c2241571CoN2.context_menu);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c2241571CoN2.min_version);
            this.LIZ.encodeWithTag(protoWriter, 4, c2241571CoN2.extra);
            protoWriter.writeBytes(c2241571CoN2.unknownFields());
        }
    };
    public static final Long DEFAULT_MIN_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public final List<String> context_menu;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final Map<String, String> extra;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long min_version;

    @WireField(adapter = "com.bytedance.im.message.template.proto.TTL#ADAPTER", tag = 1)
    public final C2241591CoP ttl;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        C2241591CoP c2241591CoP = this.ttl;
        int iHashCode2 = (((iHashCode + (c2241591CoP != null ? c2241591CoP.hashCode() : 0)) * 37) + this.context_menu.hashCode()) * 37;
        Long l = this.min_version;
        int iHashCode3 = ((iHashCode2 + (l != null ? l.hashCode() : 0)) * 37) + this.extra.hashCode();
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C2241551CoL newBuilder() {
        C2241551CoL c2241551CoL = new C2241551CoL();
        c2241551CoL.LIZLLL = this.ttl;
        c2241551CoL.LJ = C1516540pZE.LIZJ("context_menu", this.context_menu);
        c2241551CoL.LJFF = this.min_version;
        c2241551CoL.LJI = C1516540pZE.LIZLLL("extra", this.extra);
        c2241551CoL.addUnknownFields(unknownFields());
        return c2241551CoL;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ttl != null) {
            sb.append(", ttl=");
            sb.append(this.ttl);
        }
        if (!this.context_menu.isEmpty()) {
            sb.append(", context_menu=");
            sb.append(this.context_menu);
        }
        if (this.min_version != null) {
            sb.append(", min_version=");
            sb.append(this.min_version);
        }
        if (!this.extra.isEmpty()) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        sb.replace(0, 2, "BaseResp{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2241571CoN)) {
            return false;
        }
        C2241571CoN c2241571CoN = (C2241571CoN) obj;
        if (unknownFields().equals(c2241571CoN.unknownFields()) && C1516540pZE.LJ(this.ttl, c2241571CoN.ttl) && this.context_menu.equals(c2241571CoN.context_menu) && C1516540pZE.LJ(this.min_version, c2241571CoN.min_version) && this.extra.equals(c2241571CoN.extra)) {
            return true;
        }
        return false;
    }

    public C2241571CoN(C2241591CoP c2241591CoP, List<String> list, Long l, Map<String, String> map) {
        this(c2241591CoP, list, l, map, ByteString.EMPTY);
    }

    public C2241571CoN(C2241591CoP c2241591CoP, List<String> list, Long l, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ttl = c2241591CoP;
        this.context_menu = C1516540pZE.LJFF("context_menu", list);
        this.min_version = l;
        this.extra = C1516540pZE.LJI("extra", map);
    }
}
