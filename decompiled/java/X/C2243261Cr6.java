package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2243261Cr6 extends Message<C2243261Cr6, C2243281Cr8> {
    public static final ProtoAdapter<C2243261Cr6> ADAPTER = new ProtoAdapter<C2243261Cr6>() { // from class: X.1Cr7
        public final ProtoAdapter<Map<String, C2243521CrW>> LIZ;
        public final ProtoAdapter<Map<String, C2244091CsR>> LIZIZ;
        public final ProtoAdapter<Map<String, C2244321Cso>> LIZJ;
        public final ProtoAdapter<Map<String, C2243081Cqo>> LIZLLL;
        public final ProtoAdapter<Map<String, C2244101CsS>> LJ;
        public final ProtoAdapter<Map<String, C2242541Cpw>> LJFF;
        public final ProtoAdapter<Map<String, C2244091CsR>> LJI;
        public final ProtoAdapter<Map<String, C2244101CsS>> LJII;
        public final ProtoAdapter<Map<String, C2242541Cpw>> LJIIIIZZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, C2243521CrW.ADAPTER);
            ProtoAdapter<C2244091CsR> protoAdapter2 = C2244091CsR.ADAPTER;
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter2);
            this.LIZJ = ProtoAdapter.newMapAdapter(protoAdapter, C2244321Cso.ADAPTER);
            this.LIZLLL = ProtoAdapter.newMapAdapter(protoAdapter, C2243081Cqo.ADAPTER);
            ProtoAdapter<C2244101CsS> protoAdapter3 = C2244101CsS.ADAPTER;
            this.LJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter3);
            ProtoAdapter<C2242541Cpw> protoAdapter4 = C2242541Cpw.ADAPTER;
            this.LJFF = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter4);
            this.LJI = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter2);
            this.LJII = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter3);
            this.LJIIIIZZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter4);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243261Cr6 decode(ProtoReader protoReader) {
            C2243281Cr8 c2243281Cr8 = new C2243281Cr8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2243281Cr8.LIZLLL.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 2:
                            c2243281Cr8.LJ.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        case 3:
                            c2243281Cr8.LJFF.putAll(this.LIZJ.decode(protoReader));
                            break;
                        case 4:
                            c2243281Cr8.LJI.putAll(this.LIZLLL.decode(protoReader));
                            break;
                        case 5:
                            c2243281Cr8.LJII.putAll(this.LJ.decode(protoReader));
                            break;
                        case 6:
                            c2243281Cr8.LJIIIIZZ.putAll(this.LJFF.decode(protoReader));
                            break;
                        case 7:
                            c2243281Cr8.LJIIIZ = C2242211CpP.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c2243281Cr8.LJIIJ = C2243941CsC.ADAPTER.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 100:
                                    c2243281Cr8.LJIIJJI.putAll(this.LJI.decode(protoReader));
                                    break;
                                case 101:
                                    c2243281Cr8.LJIIL.putAll(this.LJII.decode(protoReader));
                                    break;
                                case 102:
                                    c2243281Cr8.LJIILIIL.putAll(this.LJIIIIZZ.decode(protoReader));
                                    break;
                                default:
                                    switch (iNextTag) {
                                        case 200:
                                            c2243281Cr8.LJIILJJIL = ProtoAdapter.BYTES.decode(protoReader);
                                            break;
                                        case 201:
                                            c2243281Cr8.LJIILL = C1CH0.ADAPTER.decode(protoReader);
                                            break;
                                        case 202:
                                            c2243281Cr8.LJIILLIIL = C2241571CoN.ADAPTER.decode(protoReader);
                                            break;
                                        default:
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c2243281Cr8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2243281Cr8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2243261Cr6 c2243261Cr6) {
            C2243261Cr6 c2243261Cr62 = c2243261Cr6;
            return this.LIZ.encodedSizeWithTag(1, c2243261Cr62.text_map) + this.LIZIZ.encodedSizeWithTag(2, c2243261Cr62.image_map) + this.LIZJ.encodedSizeWithTag(3, c2243261Cr62.link_map) + this.LIZLLL.encodedSizeWithTag(4, c2243261Cr62.button_map) + this.LJ.encodedSizeWithTag(5, c2243261Cr62.video_map) + this.LJFF.encodedSizeWithTag(6, c2243261Cr62.user_map) + C2242211CpP.ADAPTER.encodedSizeWithTag(7, c2243261Cr62.fallback_info) + C2243941CsC.ADAPTER.encodedSizeWithTag(8, c2243261Cr62.preview_hint) + this.LJI.encodedSizeWithTag(100, c2243261Cr62.business_image_map) + this.LJII.encodedSizeWithTag(101, c2243261Cr62.business_video_map) + this.LJIIIIZZ.encodedSizeWithTag(102, c2243261Cr62.business_user_map) + ProtoAdapter.BYTES.encodedSizeWithTag(200, c2243261Cr62.extra_content) + C1CH0.ADAPTER.encodedSizeWithTag(201, c2243261Cr62.req_base) + C2241571CoN.ADAPTER.encodedSizeWithTag(202, c2243261Cr62.resp_base) + c2243261Cr62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2243261Cr6 redact(C2243261Cr6 c2243261Cr6) {
            C2243281Cr8 c2243281Cr8NewBuilder = c2243261Cr6.newBuilder();
            C1516540pZE.LJIIJ(c2243281Cr8NewBuilder.LIZLLL, C2243521CrW.ADAPTER);
            Map<String, C2244091CsR> map = c2243281Cr8NewBuilder.LJ;
            ProtoAdapter<C2244091CsR> protoAdapter = C2244091CsR.ADAPTER;
            C1516540pZE.LJIIJ(map, protoAdapter);
            C1516540pZE.LJIIJ(c2243281Cr8NewBuilder.LJFF, C2244321Cso.ADAPTER);
            C1516540pZE.LJIIJ(c2243281Cr8NewBuilder.LJI, C2243081Cqo.ADAPTER);
            Map<String, C2244101CsS> map2 = c2243281Cr8NewBuilder.LJII;
            ProtoAdapter<C2244101CsS> protoAdapter2 = C2244101CsS.ADAPTER;
            C1516540pZE.LJIIJ(map2, protoAdapter2);
            Map<String, C2242541Cpw> map3 = c2243281Cr8NewBuilder.LJIIIIZZ;
            ProtoAdapter<C2242541Cpw> protoAdapter3 = C2242541Cpw.ADAPTER;
            C1516540pZE.LJIIJ(map3, protoAdapter3);
            C2242211CpP c2242211CpP = c2243281Cr8NewBuilder.LJIIIZ;
            if (c2242211CpP != null) {
                c2243281Cr8NewBuilder.LJIIIZ = C2242211CpP.ADAPTER.redact(c2242211CpP);
            }
            C2243941CsC c2243941CsC = c2243281Cr8NewBuilder.LJIIJ;
            if (c2243941CsC != null) {
                c2243281Cr8NewBuilder.LJIIJ = C2243941CsC.ADAPTER.redact(c2243941CsC);
            }
            C1516540pZE.LJIIJ(c2243281Cr8NewBuilder.LJIIJJI, protoAdapter);
            C1516540pZE.LJIIJ(c2243281Cr8NewBuilder.LJIIL, protoAdapter2);
            C1516540pZE.LJIIJ(c2243281Cr8NewBuilder.LJIILIIL, protoAdapter3);
            C1CH0 c1ch0 = c2243281Cr8NewBuilder.LJIILL;
            if (c1ch0 != null) {
                c2243281Cr8NewBuilder.LJIILL = C1CH0.ADAPTER.redact(c1ch0);
            }
            C2241571CoN c2241571CoN = c2243281Cr8NewBuilder.LJIILLIIL;
            if (c2241571CoN != null) {
                c2243281Cr8NewBuilder.LJIILLIIL = C2241571CoN.ADAPTER.redact(c2241571CoN);
            }
            c2243281Cr8NewBuilder.clearUnknownFields();
            return c2243281Cr8NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2243261Cr6 c2243261Cr6) {
            C2243261Cr6 c2243261Cr62 = c2243261Cr6;
            this.LIZ.encodeWithTag(protoWriter, 1, c2243261Cr62.text_map);
            this.LIZIZ.encodeWithTag(protoWriter, 2, c2243261Cr62.image_map);
            this.LIZJ.encodeWithTag(protoWriter, 3, c2243261Cr62.link_map);
            this.LIZLLL.encodeWithTag(protoWriter, 4, c2243261Cr62.button_map);
            this.LJ.encodeWithTag(protoWriter, 5, c2243261Cr62.video_map);
            this.LJFF.encodeWithTag(protoWriter, 6, c2243261Cr62.user_map);
            C2242211CpP.ADAPTER.encodeWithTag(protoWriter, 7, c2243261Cr62.fallback_info);
            C2243941CsC.ADAPTER.encodeWithTag(protoWriter, 8, c2243261Cr62.preview_hint);
            this.LJI.encodeWithTag(protoWriter, 100, c2243261Cr62.business_image_map);
            this.LJII.encodeWithTag(protoWriter, 101, c2243261Cr62.business_video_map);
            this.LJIIIIZZ.encodeWithTag(protoWriter, 102, c2243261Cr62.business_user_map);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 200, c2243261Cr62.extra_content);
            C1CH0.ADAPTER.encodeWithTag(protoWriter, 201, c2243261Cr62.req_base);
            C2241571CoN.ADAPTER.encodeWithTag(protoWriter, 202, c2243261Cr62.resp_base);
            protoWriter.writeBytes(c2243261Cr62.unknownFields());
        }
    };
    public static final ByteString DEFAULT_EXTRA_CONTENT = ByteString.EMPTY;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 100)
    public final Map<String, C2244091CsR> business_image_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 102)
    public final Map<String, C2242541Cpw> business_user_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 101)
    public final Map<String, C2244101CsS> business_video_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.Button#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final Map<String, C2243081Cqo> button_map;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", tag = 200)
    public final ByteString extra_content;

    @WireField(adapter = "com.bytedance.im.message.template.proto.FallbackInfo#ADAPTER", tag = 7)
    public final C2242211CpP fallback_info;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseImage#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final Map<String, C2244091CsR> image_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.LinkInfo#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, C2244321Cso> link_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.PreviewHint#ADAPTER", tag = 8)
    public final C2243941CsC preview_hint;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseReq#ADAPTER", tag = 201)
    public final C1CH0 req_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseResp#ADAPTER", tag = 202)
    public final C2241571CoN resp_base;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseText#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final Map<String, C2243521CrW> text_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseUser#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final Map<String, C2242541Cpw> user_map;

    @WireField(adapter = "com.bytedance.im.message.template.proto.BaseVideo#ADAPTER", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final Map<String, C2244101CsS> video_map;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.text_map.hashCode()) * 37) + this.image_map.hashCode()) * 37) + this.link_map.hashCode()) * 37) + this.button_map.hashCode()) * 37) + this.video_map.hashCode()) * 37) + this.user_map.hashCode()) * 37;
        C2242211CpP c2242211CpP = this.fallback_info;
        int iHashCode2 = (iHashCode + (c2242211CpP != null ? c2242211CpP.hashCode() : 0)) * 37;
        C2243941CsC c2243941CsC = this.preview_hint;
        int iHashCode3 = (((((((iHashCode2 + (c2243941CsC != null ? c2243941CsC.hashCode() : 0)) * 37) + this.business_image_map.hashCode()) * 37) + this.business_video_map.hashCode()) * 37) + this.business_user_map.hashCode()) * 37;
        ByteString byteString = this.extra_content;
        int iHashCode4 = (iHashCode3 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        C1CH0 c1ch0 = this.req_base;
        int iHashCode5 = (iHashCode4 + (c1ch0 != null ? c1ch0.hashCode() : 0)) * 37;
        C2241571CoN c2241571CoN = this.resp_base;
        int iHashCode6 = iHashCode5 + (c2241571CoN != null ? c2241571CoN.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C2243281Cr8 newBuilder() {
        C2243281Cr8 c2243281Cr8 = new C2243281Cr8();
        c2243281Cr8.LIZLLL = C1516540pZE.LIZLLL("text_map", this.text_map);
        c2243281Cr8.LJ = C1516540pZE.LIZLLL("image_map", this.image_map);
        c2243281Cr8.LJFF = C1516540pZE.LIZLLL("link_map", this.link_map);
        c2243281Cr8.LJI = C1516540pZE.LIZLLL("button_map", this.button_map);
        c2243281Cr8.LJII = C1516540pZE.LIZLLL("video_map", this.video_map);
        c2243281Cr8.LJIIIIZZ = C1516540pZE.LIZLLL("user_map", this.user_map);
        c2243281Cr8.LJIIIZ = this.fallback_info;
        c2243281Cr8.LJIIJ = this.preview_hint;
        c2243281Cr8.LJIIJJI = C1516540pZE.LIZLLL("business_image_map", this.business_image_map);
        c2243281Cr8.LJIIL = C1516540pZE.LIZLLL("business_video_map", this.business_video_map);
        c2243281Cr8.LJIILIIL = C1516540pZE.LIZLLL("business_user_map", this.business_user_map);
        c2243281Cr8.LJIILJJIL = this.extra_content;
        c2243281Cr8.LJIILL = this.req_base;
        c2243281Cr8.LJIILLIIL = this.resp_base;
        c2243281Cr8.addUnknownFields(unknownFields());
        return c2243281Cr8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.text_map.isEmpty()) {
            sb.append(", text_map=");
            sb.append(this.text_map);
        }
        if (!this.image_map.isEmpty()) {
            sb.append(", image_map=");
            sb.append(this.image_map);
        }
        if (!this.link_map.isEmpty()) {
            sb.append(", link_map=");
            sb.append(this.link_map);
        }
        if (!this.button_map.isEmpty()) {
            sb.append(", button_map=");
            sb.append(this.button_map);
        }
        if (!this.video_map.isEmpty()) {
            sb.append(", video_map=");
            sb.append(this.video_map);
        }
        if (!this.user_map.isEmpty()) {
            sb.append(", user_map=");
            sb.append(this.user_map);
        }
        if (this.fallback_info != null) {
            sb.append(", fallback_info=");
            sb.append(this.fallback_info);
        }
        if (this.preview_hint != null) {
            sb.append(", preview_hint=");
            sb.append(this.preview_hint);
        }
        if (!this.business_image_map.isEmpty()) {
            sb.append(", business_image_map=");
            sb.append(this.business_image_map);
        }
        if (!this.business_video_map.isEmpty()) {
            sb.append(", business_video_map=");
            sb.append(this.business_video_map);
        }
        if (!this.business_user_map.isEmpty()) {
            sb.append(", business_user_map=");
            sb.append(this.business_user_map);
        }
        if (this.extra_content != null) {
            sb.append(", extra_content=");
            sb.append(this.extra_content);
        }
        if (this.req_base != null) {
            sb.append(", req_base=");
            sb.append(this.req_base);
        }
        if (this.resp_base != null) {
            sb.append(", resp_base=");
            sb.append(this.resp_base);
        }
        sb.replace(0, 2, "CommonMsgCard{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2243261Cr6)) {
            return false;
        }
        C2243261Cr6 c2243261Cr6 = (C2243261Cr6) obj;
        if (unknownFields().equals(c2243261Cr6.unknownFields()) && this.text_map.equals(c2243261Cr6.text_map) && this.image_map.equals(c2243261Cr6.image_map) && this.link_map.equals(c2243261Cr6.link_map) && this.button_map.equals(c2243261Cr6.button_map) && this.video_map.equals(c2243261Cr6.video_map) && this.user_map.equals(c2243261Cr6.user_map) && C1516540pZE.LJ(this.fallback_info, c2243261Cr6.fallback_info) && C1516540pZE.LJ(this.preview_hint, c2243261Cr6.preview_hint) && this.business_image_map.equals(c2243261Cr6.business_image_map) && this.business_video_map.equals(c2243261Cr6.business_video_map) && this.business_user_map.equals(c2243261Cr6.business_user_map) && C1516540pZE.LJ(this.extra_content, c2243261Cr6.extra_content) && C1516540pZE.LJ(this.req_base, c2243261Cr6.req_base) && C1516540pZE.LJ(this.resp_base, c2243261Cr6.resp_base)) {
            return true;
        }
        return false;
    }

    public C2243261Cr6(Map<String, C2243521CrW> map, Map<String, C2244091CsR> map2, Map<String, C2244321Cso> map3, Map<String, C2243081Cqo> map4, Map<String, C2244101CsS> map5, Map<String, C2242541Cpw> map6, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, Map<String, C2244091CsR> map7, Map<String, C2244101CsS> map8, Map<String, C2242541Cpw> map9, ByteString byteString, C1CH0 c1ch0, C2241571CoN c2241571CoN) {
        this(map, map2, map3, map4, map5, map6, c2242211CpP, c2243941CsC, map7, map8, map9, byteString, c1ch0, c2241571CoN, ByteString.EMPTY);
    }

    public C2243261Cr6(Map<String, C2243521CrW> map, Map<String, C2244091CsR> map2, Map<String, C2244321Cso> map3, Map<String, C2243081Cqo> map4, Map<String, C2244101CsS> map5, Map<String, C2242541Cpw> map6, C2242211CpP c2242211CpP, C2243941CsC c2243941CsC, Map<String, C2244091CsR> map7, Map<String, C2244101CsS> map8, Map<String, C2242541Cpw> map9, ByteString byteString, C1CH0 c1ch0, C2241571CoN c2241571CoN, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.text_map = C1516540pZE.LJI("text_map", map);
        this.image_map = C1516540pZE.LJI("image_map", map2);
        this.link_map = C1516540pZE.LJI("link_map", map3);
        this.button_map = C1516540pZE.LJI("button_map", map4);
        this.video_map = C1516540pZE.LJI("video_map", map5);
        this.user_map = C1516540pZE.LJI("user_map", map6);
        this.fallback_info = c2242211CpP;
        this.preview_hint = c2243941CsC;
        this.business_image_map = C1516540pZE.LJI("business_image_map", map7);
        this.business_video_map = C1516540pZE.LJI("business_video_map", map8);
        this.business_user_map = C1516540pZE.LJI("business_user_map", map9);
        this.extra_content = byteString;
        this.req_base = c1ch0;
        this.resp_base = c2241571CoN;
    }
}
