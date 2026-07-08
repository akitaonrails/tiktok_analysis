package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CsR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244091CsR extends Message<C2244091CsR, C2244191Csb> {
    public static final ProtoAdapter<C2244091CsR> ADAPTER = new ProtoAdapter<C2244091CsR>() { // from class: X.1CsU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244091CsR decode(ProtoReader protoReader) {
            C2244191Csb c2244191Csb = new C2244191Csb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 4) {
                                if (iNextTag != 5) {
                                    if (iNextTag != 6) {
                                        if (iNextTag != 7) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2244191Csb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            try {
                                                c2244191Csb.LJIIIIZZ = EnumC2244051CsN.ADAPTER.decode(protoReader);
                                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                c2244191Csb.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                            }
                                        }
                                    } else {
                                        c2244191Csb.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2244191Csb.LJI = C2244161CsY.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2244191Csb.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2244191Csb.LJ.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c2244191Csb.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244191Csb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244091CsR c2244091CsR) {
            C2244091CsR c2244091CsR2 = c2244091CsR;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2244091CsR2.image_id) + protoAdapter.asRepeated().encodedSizeWithTag(2, c2244091CsR2.url_list) + protoAdapter.encodedSizeWithTag(4, c2244091CsR2.display_name) + C2244161CsY.ADAPTER.encodedSizeWithTag(5, c2244091CsR2.resolution) + protoAdapter.encodedSizeWithTag(6, c2244091CsR2.decrypt_key) + EnumC2244051CsN.ADAPTER.encodedSizeWithTag(7, c2244091CsR2.fallback_icon_type) + c2244091CsR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244091CsR redact(C2244091CsR c2244091CsR) {
            C2244191Csb c2244191CsbNewBuilder = c2244091CsR.newBuilder();
            C2244161CsY c2244161CsY = c2244191CsbNewBuilder.LJI;
            if (c2244161CsY != null) {
                c2244191CsbNewBuilder.LJI = C2244161CsY.ADAPTER.redact(c2244161CsY);
            }
            c2244191CsbNewBuilder.clearUnknownFields();
            return c2244191CsbNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244091CsR c2244091CsR) {
            C2244091CsR c2244091CsR2 = c2244091CsR;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2244091CsR2.image_id);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c2244091CsR2.url_list);
            protoAdapter.encodeWithTag(protoWriter, 4, c2244091CsR2.display_name);
            C2244161CsY.ADAPTER.encodeWithTag(protoWriter, 5, c2244091CsR2.resolution);
            protoAdapter.encodeWithTag(protoWriter, 6, c2244091CsR2.decrypt_key);
            EnumC2244051CsN.ADAPTER.encodeWithTag(protoWriter, 7, c2244091CsR2.fallback_icon_type);
            protoWriter.writeBytes(c2244091CsR2.unknownFields());
        }
    };
    public static final EnumC2244051CsN DEFAULT_FALLBACK_ICON_TYPE = EnumC2244051CsN.Default;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String decrypt_key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String display_name;

    @WireField(adapter = "com.bytedance.im.message.template.proto.IconType#ADAPTER", tag = 7)
    public final EnumC2244051CsN fallback_icon_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String image_id;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Resolution#ADAPTER", tag = 5)
    public final C2244161CsY resolution;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public final List<String> url_list;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.image_id;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.url_list.hashCode()) * 37;
        String str2 = this.display_name;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        C2244161CsY c2244161CsY = this.resolution;
        int iHashCode4 = (iHashCode3 + (c2244161CsY != null ? c2244161CsY.hashCode() : 0)) * 37;
        String str3 = this.decrypt_key;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        EnumC2244051CsN enumC2244051CsN = this.fallback_icon_type;
        int iHashCode6 = iHashCode5 + (enumC2244051CsN != null ? enumC2244051CsN.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2244191Csb newBuilder() {
        C2244191Csb c2244191Csb = new C2244191Csb();
        c2244191Csb.LIZLLL = this.image_id;
        c2244191Csb.LJ = C1516540pZE.LIZJ("url_list", this.url_list);
        c2244191Csb.LJFF = this.display_name;
        c2244191Csb.LJI = this.resolution;
        c2244191Csb.LJII = this.decrypt_key;
        c2244191Csb.LJIIIIZZ = this.fallback_icon_type;
        c2244191Csb.addUnknownFields(unknownFields());
        return c2244191Csb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.image_id != null) {
            sb.append(", image_id=");
            sb.append(this.image_id);
        }
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.display_name != null) {
            sb.append(", display_name=");
            sb.append(this.display_name);
        }
        if (this.resolution != null) {
            sb.append(", resolution=");
            sb.append(this.resolution);
        }
        if (this.decrypt_key != null) {
            sb.append(", decrypt_key=");
            sb.append(this.decrypt_key);
        }
        if (this.fallback_icon_type != null) {
            sb.append(", fallback_icon_type=");
            sb.append(this.fallback_icon_type);
        }
        sb.replace(0, 2, "BaseImage{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244091CsR)) {
            return false;
        }
        C2244091CsR c2244091CsR = (C2244091CsR) obj;
        if (unknownFields().equals(c2244091CsR.unknownFields()) && C1516540pZE.LJ(this.image_id, c2244091CsR.image_id) && this.url_list.equals(c2244091CsR.url_list) && C1516540pZE.LJ(this.display_name, c2244091CsR.display_name) && C1516540pZE.LJ(this.resolution, c2244091CsR.resolution) && C1516540pZE.LJ(this.decrypt_key, c2244091CsR.decrypt_key) && C1516540pZE.LJ(this.fallback_icon_type, c2244091CsR.fallback_icon_type)) {
            return true;
        }
        return false;
    }

    public C2244091CsR(String str, List<String> list, String str2, C2244161CsY c2244161CsY, String str3, EnumC2244051CsN enumC2244051CsN) {
        this(str, list, str2, c2244161CsY, str3, enumC2244051CsN, ByteString.EMPTY);
    }

    public C2244091CsR(String str, List<String> list, String str2, C2244161CsY c2244161CsY, String str3, EnumC2244051CsN enumC2244051CsN, ByteString byteString) {
        super(ADAPTER, byteString);
        this.image_id = str;
        this.url_list = C1516540pZE.LJFF("url_list", list);
        this.display_name = str2;
        this.resolution = c2244161CsY;
        this.decrypt_key = str3;
        this.fallback_icon_type = enumC2244051CsN;
    }
}
