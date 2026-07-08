package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cbp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233791Cbp extends Message<C2233791Cbp, C2233811Cbr> {
    public static final ProtoAdapter<C2233791Cbp> ADAPTER = new ProtoAdapter<C2233791Cbp>() { // from class: X.1Cbq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233791Cbp decode(ProtoReader protoReader) {
            C2233811Cbr c2233811Cbr = new C2233811Cbr();
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
                                        c2233811Cbr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c2233811Cbr.LJII = C2233611CbX.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c2233811Cbr.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                try {
                                    c2233811Cbr.LJFF = EnumC2182351Ab3.ADAPTER.decode(protoReader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c2233811Cbr.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        } else {
                            c2233811Cbr.LJ = C2230371CRf.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2233811Cbr.LIZLLL = C1CSP.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233811Cbr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233791Cbp c2233791Cbp) {
            C2233791Cbp c2233791Cbp2 = c2233791Cbp;
            return C1CSP.ADAPTER.encodedSizeWithTag(1, c2233791Cbp2.parent_container_info) + C2230371CRf.ADAPTER.encodedSizeWithTag(2, c2233791Cbp2.container_rect_config) + EnumC2182351Ab3.ADAPTER.encodedSizeWithTag(3, c2233791Cbp2.layout_scene) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c2233791Cbp2.refresh_layout) + C2233611CbX.ADAPTER.encodedSizeWithTag(5, c2233791Cbp2.biz_source) + c2233791Cbp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233791Cbp redact(C2233791Cbp c2233791Cbp) {
            C2233811Cbr c2233811CbrNewBuilder = c2233791Cbp.newBuilder();
            c2233811CbrNewBuilder.LIZLLL = C1CSP.ADAPTER.redact(c2233811CbrNewBuilder.LIZLLL);
            c2233811CbrNewBuilder.LJ = C2230371CRf.ADAPTER.redact(c2233811CbrNewBuilder.LJ);
            c2233811CbrNewBuilder.LJII = C2233611CbX.ADAPTER.redact(c2233811CbrNewBuilder.LJII);
            c2233811CbrNewBuilder.clearUnknownFields();
            return c2233811CbrNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233791Cbp c2233791Cbp) {
            C2233791Cbp c2233791Cbp2 = c2233791Cbp;
            C1CSP.ADAPTER.encodeWithTag(protoWriter, 1, c2233791Cbp2.parent_container_info);
            C2230371CRf.ADAPTER.encodeWithTag(protoWriter, 2, c2233791Cbp2.container_rect_config);
            EnumC2182351Ab3.ADAPTER.encodeWithTag(protoWriter, 3, c2233791Cbp2.layout_scene);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c2233791Cbp2.refresh_layout);
            C2233611CbX.ADAPTER.encodeWithTag(protoWriter, 5, c2233791Cbp2.biz_source);
            protoWriter.writeBytes(c2233791Cbp2.unknownFields());
        }
    };
    public static final EnumC2182351Ab3 DEFAULT_LAYOUT_SCENE = EnumC2182351Ab3.VAR_LINK_MIC_LAYOUT_SCENE_IN_ROOM;
    public static final Boolean DEFAULT_REFRESH_LAYOUT = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.BizPipelineSource#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final C2233611CbX biz_source;

    @WireField(adapter = "link_mic_sdk.proto.LayoutTypeContainerRectConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public final C2230371CRf container_rect_config;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutScene#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public final EnumC2182351Ab3 layout_scene;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutParentContainerInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public final C1CSP parent_container_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 4)
    public final Boolean refresh_layout;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.parent_container_info.hashCode()) * 37) + this.container_rect_config.hashCode()) * 37) + this.layout_scene.hashCode()) * 37) + this.refresh_layout.hashCode()) * 37) + this.biz_source.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2233811Cbr newBuilder() {
        C2233811Cbr c2233811Cbr = new C2233811Cbr();
        c2233811Cbr.LIZLLL = this.parent_container_info;
        c2233811Cbr.LJ = this.container_rect_config;
        c2233811Cbr.LJFF = this.layout_scene;
        c2233811Cbr.LJI = this.refresh_layout;
        c2233811Cbr.LJII = this.biz_source;
        c2233811Cbr.addUnknownFields(unknownFields());
        return c2233811Cbr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", parent_container_info=");
        sb.append(this.parent_container_info);
        sb.append(", container_rect_config=");
        sb.append(this.container_rect_config);
        sb.append(", layout_scene=");
        sb.append(this.layout_scene);
        sb.append(", refresh_layout=");
        sb.append(this.refresh_layout);
        sb.append(", biz_source=");
        sb.append(this.biz_source);
        sb.replace(0, 2, "FuncParamsXa01b37f3dee27e65{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233791Cbp)) {
            return false;
        }
        C2233791Cbp c2233791Cbp = (C2233791Cbp) obj;
        if (unknownFields().equals(c2233791Cbp.unknownFields()) && this.parent_container_info.equals(c2233791Cbp.parent_container_info) && this.container_rect_config.equals(c2233791Cbp.container_rect_config) && this.layout_scene.equals(c2233791Cbp.layout_scene) && this.refresh_layout.equals(c2233791Cbp.refresh_layout) && this.biz_source.equals(c2233791Cbp.biz_source)) {
            return true;
        }
        return false;
    }

    public C2233791Cbp(C1CSP c1csp, C2230371CRf c2230371CRf, EnumC2182351Ab3 enumC2182351Ab3, Boolean bool, C2233611CbX c2233611CbX) {
        this(c1csp, c2230371CRf, enumC2182351Ab3, bool, c2233611CbX, ByteString.EMPTY);
    }

    public C2233791Cbp(C1CSP c1csp, C2230371CRf c2230371CRf, EnumC2182351Ab3 enumC2182351Ab3, Boolean bool, C2233611CbX c2233611CbX, ByteString byteString) {
        super(ADAPTER, byteString);
        this.parent_container_info = c1csp;
        this.container_rect_config = c2230371CRf;
        this.layout_scene = enumC2182351Ab3;
        this.refresh_layout = bool;
        this.biz_source = c2233611CbX;
    }
}
