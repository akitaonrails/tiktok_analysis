package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CsW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244141CsW extends Message<C2244141CsW, C2244211Csd> {
    public static final ProtoAdapter<C2244141CsW> ADAPTER = new ProtoAdapter<C2244141CsW>() { // from class: X.1CsX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244141CsW decode(ProtoReader protoReader) {
            C2244211Csd c2244211Csd = new C2244211Csd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2244211Csd.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2244211Csd.LJ = C2244321Cso.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2244211Csd.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2244211Csd.LJI = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2244211Csd.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c2244211Csd.LJIIIIZZ = EnumC2244221Cse.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2244211Csd.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2244211Csd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244211Csd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244141CsW c2244141CsW) {
            C2244141CsW c2244141CsW2 = c2244141CsW;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2244141CsW2.keyword) + C2244321Cso.ADAPTER.encodedSizeWithTag(2, c2244141CsW2.schema) + protoAdapter.encodedSizeWithTag(3, c2244141CsW2.id) + C2244091CsR.ADAPTER.encodedSizeWithTag(4, c2244141CsW2.icon) + protoAdapter.encodedSizeWithTag(5, c2244141CsW2.extra) + EnumC2244221Cse.ADAPTER.encodedSizeWithTag(6, c2244141CsW2.type) + c2244141CsW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244141CsW redact(C2244141CsW c2244141CsW) {
            C2244211Csd c2244211CsdNewBuilder = c2244141CsW.newBuilder();
            C2244321Cso c2244321Cso = c2244211CsdNewBuilder.LJ;
            if (c2244321Cso != null) {
                c2244211CsdNewBuilder.LJ = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            C2244091CsR c2244091CsR = c2244211CsdNewBuilder.LJI;
            if (c2244091CsR != null) {
                c2244211CsdNewBuilder.LJI = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            c2244211CsdNewBuilder.clearUnknownFields();
            return c2244211CsdNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244141CsW c2244141CsW) {
            C2244141CsW c2244141CsW2 = c2244141CsW;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2244141CsW2.keyword);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 2, c2244141CsW2.schema);
            protoAdapter.encodeWithTag(protoWriter, 3, c2244141CsW2.id);
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 4, c2244141CsW2.icon);
            protoAdapter.encodeWithTag(protoWriter, 5, c2244141CsW2.extra);
            EnumC2244221Cse.ADAPTER.encodeWithTag(protoWriter, 6, c2244141CsW2.type);
            protoWriter.writeBytes(c2244141CsW2.unknownFields());
        }
    };
    public static final EnumC2244221Cse DEFAULT_TYPE = EnumC2244221Cse.ANCHOR_UNKNOWN;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String extra;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 4)
    public final C2244091CsR icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String keyword;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 2)
    public final C2244321Cso schema;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AnchorBusinessType#ADAPTER", tag = 6)
    public final EnumC2244221Cse type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.keyword;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.schema;
        int iHashCode3 = (iHashCode2 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        String str2 = this.id;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.icon;
        int iHashCode5 = (iHashCode4 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        String str3 = this.extra;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        EnumC2244221Cse enumC2244221Cse = this.type;
        int iHashCode7 = iHashCode6 + (enumC2244221Cse != null ? enumC2244221Cse.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2244211Csd newBuilder() {
        C2244211Csd c2244211Csd = new C2244211Csd();
        c2244211Csd.LIZLLL = this.keyword;
        c2244211Csd.LJ = this.schema;
        c2244211Csd.LJFF = this.id;
        c2244211Csd.LJI = this.icon;
        c2244211Csd.LJII = this.extra;
        c2244211Csd.LJIIIIZZ = this.type;
        c2244211Csd.addUnknownFields(unknownFields());
        return c2244211Csd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.keyword != null) {
            sb.append(", keyword=");
            sb.append(this.keyword);
        }
        if (this.schema != null) {
            sb.append(", schema=");
            sb.append(this.schema);
        }
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.extra != null) {
            sb.append(", extra=");
            sb.append(this.extra);
        }
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        sb.replace(0, 2, "AnchorInfoV2{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244141CsW)) {
            return false;
        }
        C2244141CsW c2244141CsW = (C2244141CsW) obj;
        if (unknownFields().equals(c2244141CsW.unknownFields()) && C1516540pZE.LJ(this.keyword, c2244141CsW.keyword) && C1516540pZE.LJ(this.schema, c2244141CsW.schema) && C1516540pZE.LJ(this.id, c2244141CsW.id) && C1516540pZE.LJ(this.icon, c2244141CsW.icon) && C1516540pZE.LJ(this.extra, c2244141CsW.extra) && C1516540pZE.LJ(this.type, c2244141CsW.type)) {
            return true;
        }
        return false;
    }

    public C2244141CsW(String str, C2244321Cso c2244321Cso, String str2, C2244091CsR c2244091CsR, String str3, EnumC2244221Cse enumC2244221Cse) {
        this(str, c2244321Cso, str2, c2244091CsR, str3, enumC2244221Cse, ByteString.EMPTY);
    }

    public C2244141CsW(String str, C2244321Cso c2244321Cso, String str2, C2244091CsR c2244091CsR, String str3, EnumC2244221Cse enumC2244221Cse, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keyword = str;
        this.schema = c2244321Cso;
        this.id = str2;
        this.icon = c2244091CsR;
        this.extra = str3;
        this.type = enumC2244221Cse;
    }
}
