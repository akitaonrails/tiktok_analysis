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

/* JADX INFO: renamed from: X.1CsS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2244101CsS extends Message<C2244101CsS, C2244181Csa> {
    public static final ProtoAdapter<C2244101CsS> ADAPTER = new ProtoAdapter<C2244101CsS>() { // from class: X.1CsT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244101CsS decode(ProtoReader protoReader) {
            C2244181Csa c2244181Csa = new C2244181Csa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2244181Csa.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            try {
                                c2244181Csa.LJ = EnumC2244241Csg.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2244181Csa.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 3:
                            c2244181Csa.LJFF = C2244091CsR.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2244181Csa.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2244181Csa.LJII = C2244321Cso.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2244181Csa.LJIIIIZZ = C2244161CsY.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2244181Csa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 8:
                            c2244181Csa.LJIIIZ.add(C2244141CsW.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2244181Csa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2244101CsS c2244101CsS) {
            C2244101CsS c2244101CsS2 = c2244101CsS;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2244101CsS2.video_id) + EnumC2244241Csg.ADAPTER.encodedSizeWithTag(2, c2244101CsS2.video_type) + C2244091CsR.ADAPTER.encodedSizeWithTag(3, c2244101CsS2.cover) + protoAdapter.encodedSizeWithTag(4, c2244101CsS2.video_model) + C2244321Cso.ADAPTER.encodedSizeWithTag(5, c2244101CsS2.linkInfo) + C2244161CsY.ADAPTER.encodedSizeWithTag(6, c2244101CsS2.resolution) + C2244141CsW.ADAPTER.asRepeated().encodedSizeWithTag(8, c2244101CsS2.anchors) + c2244101CsS2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2244101CsS redact(C2244101CsS c2244101CsS) {
            C2244181Csa c2244181CsaNewBuilder = c2244101CsS.newBuilder();
            C2244091CsR c2244091CsR = c2244181CsaNewBuilder.LJFF;
            if (c2244091CsR != null) {
                c2244181CsaNewBuilder.LJFF = C2244091CsR.ADAPTER.redact(c2244091CsR);
            }
            C2244321Cso c2244321Cso = c2244181CsaNewBuilder.LJII;
            if (c2244321Cso != null) {
                c2244181CsaNewBuilder.LJII = C2244321Cso.ADAPTER.redact(c2244321Cso);
            }
            C2244161CsY c2244161CsY = c2244181CsaNewBuilder.LJIIIIZZ;
            if (c2244161CsY != null) {
                c2244181CsaNewBuilder.LJIIIIZZ = C2244161CsY.ADAPTER.redact(c2244161CsY);
            }
            C1516540pZE.LJIIIZ(c2244181CsaNewBuilder.LJIIIZ, C2244141CsW.ADAPTER);
            c2244181CsaNewBuilder.clearUnknownFields();
            return c2244181CsaNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2244101CsS c2244101CsS) {
            C2244101CsS c2244101CsS2 = c2244101CsS;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2244101CsS2.video_id);
            EnumC2244241Csg.ADAPTER.encodeWithTag(protoWriter, 2, c2244101CsS2.video_type);
            C2244091CsR.ADAPTER.encodeWithTag(protoWriter, 3, c2244101CsS2.cover);
            protoAdapter.encodeWithTag(protoWriter, 4, c2244101CsS2.video_model);
            C2244321Cso.ADAPTER.encodeWithTag(protoWriter, 5, c2244101CsS2.linkInfo);
            C2244161CsY.ADAPTER.encodeWithTag(protoWriter, 6, c2244101CsS2.resolution);
            C2244141CsW.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c2244101CsS2.anchors);
            protoWriter.writeBytes(c2244101CsS2.unknownFields());
        }
    };
    public static final EnumC2244241Csg DEFAULT_VIDEO_TYPE = EnumC2244241Csg.Video;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.AnchorInfoV2#ADAPTER", label = WireField.Label.REPEATED, tag = 8)
    public final List<C2244141CsW> anchors;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", tag = 3)
    public final C2244091CsR cover;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", tag = 5)
    public final C2244321Cso linkInfo;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Resolution#ADAPTER", tag = 6)
    public final C2244161CsY resolution;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String video_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String video_model;

    @WireField(adapter = "com.bytedance.im.message.template.proto.VideoType#ADAPTER", tag = 2)
    public final EnumC2244241Csg video_type;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.video_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        EnumC2244241Csg enumC2244241Csg = this.video_type;
        int iHashCode3 = (iHashCode2 + (enumC2244241Csg != null ? enumC2244241Csg.hashCode() : 0)) * 37;
        C2244091CsR c2244091CsR = this.cover;
        int iHashCode4 = (iHashCode3 + (c2244091CsR != null ? c2244091CsR.hashCode() : 0)) * 37;
        String str2 = this.video_model;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        C2244321Cso c2244321Cso = this.linkInfo;
        int iHashCode6 = (iHashCode5 + (c2244321Cso != null ? c2244321Cso.hashCode() : 0)) * 37;
        C2244161CsY c2244161CsY = this.resolution;
        int iHashCode7 = ((iHashCode6 + (c2244161CsY != null ? c2244161CsY.hashCode() : 0)) * 37) + this.anchors.hashCode();
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.squareup.wire.Message
    public C2244181Csa newBuilder() {
        C2244181Csa c2244181Csa = new C2244181Csa();
        c2244181Csa.LIZLLL = this.video_id;
        c2244181Csa.LJ = this.video_type;
        c2244181Csa.LJFF = this.cover;
        c2244181Csa.LJI = this.video_model;
        c2244181Csa.LJII = this.linkInfo;
        c2244181Csa.LJIIIIZZ = this.resolution;
        c2244181Csa.LJIIIZ = C1516540pZE.LIZJ("anchors", this.anchors);
        c2244181Csa.addUnknownFields(unknownFields());
        return c2244181Csa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.video_id != null) {
            sb.append(", video_id=");
            sb.append(this.video_id);
        }
        if (this.video_type != null) {
            sb.append(", video_type=");
            sb.append(this.video_type);
        }
        if (this.cover != null) {
            sb.append(", cover=");
            sb.append(this.cover);
        }
        if (this.video_model != null) {
            sb.append(", video_model=");
            sb.append(this.video_model);
        }
        if (this.linkInfo != null) {
            sb.append(", linkInfo=");
            sb.append(this.linkInfo);
        }
        if (this.resolution != null) {
            sb.append(", resolution=");
            sb.append(this.resolution);
        }
        if (!this.anchors.isEmpty()) {
            sb.append(", anchors=");
            sb.append(this.anchors);
        }
        sb.replace(0, 2, "BaseVideo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2244101CsS)) {
            return false;
        }
        C2244101CsS c2244101CsS = (C2244101CsS) obj;
        if (unknownFields().equals(c2244101CsS.unknownFields()) && C1516540pZE.LJ(this.video_id, c2244101CsS.video_id) && C1516540pZE.LJ(this.video_type, c2244101CsS.video_type) && C1516540pZE.LJ(this.cover, c2244101CsS.cover) && C1516540pZE.LJ(this.video_model, c2244101CsS.video_model) && C1516540pZE.LJ(this.linkInfo, c2244101CsS.linkInfo) && C1516540pZE.LJ(this.resolution, c2244101CsS.resolution) && this.anchors.equals(c2244101CsS.anchors)) {
            return true;
        }
        return false;
    }

    public C2244101CsS(String str, EnumC2244241Csg enumC2244241Csg, C2244091CsR c2244091CsR, String str2, C2244321Cso c2244321Cso, C2244161CsY c2244161CsY, List<C2244141CsW> list) {
        this(str, enumC2244241Csg, c2244091CsR, str2, c2244321Cso, c2244161CsY, list, ByteString.EMPTY);
    }

    public C2244101CsS(String str, EnumC2244241Csg enumC2244241Csg, C2244091CsR c2244091CsR, String str2, C2244321Cso c2244321Cso, C2244161CsY c2244161CsY, List<C2244141CsW> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.video_id = str;
        this.video_type = enumC2244241Csg;
        this.cover = c2244091CsR;
        this.video_model = str2;
        this.linkInfo = c2244321Cso;
        this.resolution = c2244161CsY;
        this.anchors = C1516540pZE.LJFF("anchors", list);
    }
}
