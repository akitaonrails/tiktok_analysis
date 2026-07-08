package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Cbs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2233821Cbs extends Message<C2233821Cbs, C2233841Cbu> {
    public static final long serialVersionUID = 0;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = BdTuring.TYPE_SMS_VOICE)
    public final C1CIG canvas;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String container_mode_config;

    @WireField(adapter = "link_mic_sdk.proto.LayoutTypeContainerRectConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C2230371CRf container_rect_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.REQUIRED, tag = 3)
    public final Double device_screen_scale;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = 15)
    public final C1CIG event_monitor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 1)
    public final Boolean is_room_owner;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutScene#ADAPTER", label = WireField.Label.REQUIRED, tag = 4)
    public final EnumC2182351Ab3 layer_scene;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final C1CIG link_mic_layout_thread_handler;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 8)
    public final C1CIG link_mic_static_data_channel_provider;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final C1CIG listener;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 14)
    public final C1CIG log_handler;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicLayoutParentContainerInfo#ADAPTER", label = WireField.Label.REQUIRED, tag = 5)
    public final C1CSP parent_container_info;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final C1CIG player;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 2)
    public final Long self_uid;

    @WireField(adapter = "link_mic_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_EMAIL)
    public final C1CIG view_provider;
    public static final ProtoAdapter<C2233821Cbs> ADAPTER = new ProtoAdapter<C2233821Cbs>() { // from class: X.1Cbt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233821Cbs decode(ProtoReader protoReader) {
            C2233841Cbu c2233841Cbu = new C2233841Cbu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2233841Cbu.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c2233841Cbu.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2233841Cbu.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2233841Cbu.LJI = EnumC2182351Ab3.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2233841Cbu.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c2233841Cbu.LJII = C1CSP.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2233841Cbu.LJIIIIZZ = C2230371CRf.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2233841Cbu.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2233841Cbu.LJIIJ = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2233841Cbu.LJIIJJI = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2233841Cbu.LJIIL = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2233841Cbu.LJIILIIL = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2233841Cbu.LJIILJJIL = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2233841Cbu.LJIILL = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c2233841Cbu.LJIILLIIL = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c2233841Cbu.LJIIZILJ = C1CIG.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2233841Cbu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2233841Cbu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2233821Cbs c2233821Cbs) {
            C2233821Cbs c2233821Cbs2 = c2233821Cbs;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c2233821Cbs2.is_room_owner) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2233821Cbs2.self_uid) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, c2233821Cbs2.device_screen_scale) + EnumC2182351Ab3.ADAPTER.encodedSizeWithTag(4, c2233821Cbs2.layer_scene) + C1CSP.ADAPTER.encodedSizeWithTag(5, c2233821Cbs2.parent_container_info) + C2230371CRf.ADAPTER.encodedSizeWithTag(6, c2233821Cbs2.container_rect_config) + ProtoAdapter.STRING.encodedSizeWithTag(7, c2233821Cbs2.container_mode_config);
            ProtoAdapter<C1CIG> protoAdapter = C1CIG.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(8, c2233821Cbs2.link_mic_static_data_channel_provider) + protoAdapter.encodedSizeWithTag(9, c2233821Cbs2.link_mic_layout_thread_handler) + protoAdapter.encodedSizeWithTag(10, c2233821Cbs2.listener) + protoAdapter.encodedSizeWithTag(11, c2233821Cbs2.view_provider) + protoAdapter.encodedSizeWithTag(12, c2233821Cbs2.player) + protoAdapter.encodedSizeWithTag(13, c2233821Cbs2.canvas) + protoAdapter.encodedSizeWithTag(14, c2233821Cbs2.log_handler) + protoAdapter.encodedSizeWithTag(15, c2233821Cbs2.event_monitor) + c2233821Cbs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2233821Cbs redact(C2233821Cbs c2233821Cbs) {
            C2233841Cbu c2233841CbuNewBuilder = c2233821Cbs.newBuilder();
            c2233841CbuNewBuilder.LJII = C1CSP.ADAPTER.redact(c2233841CbuNewBuilder.LJII);
            c2233841CbuNewBuilder.LJIIIIZZ = C2230371CRf.ADAPTER.redact(c2233841CbuNewBuilder.LJIIIIZZ);
            ProtoAdapter<C1CIG> protoAdapter = C1CIG.ADAPTER;
            c2233841CbuNewBuilder.LJIIJ = protoAdapter.redact(c2233841CbuNewBuilder.LJIIJ);
            c2233841CbuNewBuilder.LJIIJJI = protoAdapter.redact(c2233841CbuNewBuilder.LJIIJJI);
            c2233841CbuNewBuilder.LJIIL = protoAdapter.redact(c2233841CbuNewBuilder.LJIIL);
            c2233841CbuNewBuilder.LJIILIIL = protoAdapter.redact(c2233841CbuNewBuilder.LJIILIIL);
            C1CIG c1cig = c2233841CbuNewBuilder.LJIILJJIL;
            if (c1cig != null) {
                c2233841CbuNewBuilder.LJIILJJIL = protoAdapter.redact(c1cig);
            }
            C1CIG c1cig2 = c2233841CbuNewBuilder.LJIILL;
            if (c1cig2 != null) {
                c2233841CbuNewBuilder.LJIILL = protoAdapter.redact(c1cig2);
            }
            c2233841CbuNewBuilder.LJIILLIIL = protoAdapter.redact(c2233841CbuNewBuilder.LJIILLIIL);
            C1CIG c1cig3 = c2233841CbuNewBuilder.LJIIZILJ;
            if (c1cig3 != null) {
                c2233841CbuNewBuilder.LJIIZILJ = protoAdapter.redact(c1cig3);
            }
            c2233841CbuNewBuilder.clearUnknownFields();
            return c2233841CbuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2233821Cbs c2233821Cbs) {
            C2233821Cbs c2233821Cbs2 = c2233821Cbs;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c2233821Cbs2.is_room_owner);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2233821Cbs2.self_uid);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, c2233821Cbs2.device_screen_scale);
            EnumC2182351Ab3.ADAPTER.encodeWithTag(protoWriter, 4, c2233821Cbs2.layer_scene);
            C1CSP.ADAPTER.encodeWithTag(protoWriter, 5, c2233821Cbs2.parent_container_info);
            C2230371CRf.ADAPTER.encodeWithTag(protoWriter, 6, c2233821Cbs2.container_rect_config);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, c2233821Cbs2.container_mode_config);
            ProtoAdapter<C1CIG> protoAdapter = C1CIG.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 8, c2233821Cbs2.link_mic_static_data_channel_provider);
            protoAdapter.encodeWithTag(protoWriter, 9, c2233821Cbs2.link_mic_layout_thread_handler);
            protoAdapter.encodeWithTag(protoWriter, 10, c2233821Cbs2.listener);
            protoAdapter.encodeWithTag(protoWriter, 11, c2233821Cbs2.view_provider);
            protoAdapter.encodeWithTag(protoWriter, 12, c2233821Cbs2.player);
            protoAdapter.encodeWithTag(protoWriter, 13, c2233821Cbs2.canvas);
            protoAdapter.encodeWithTag(protoWriter, 14, c2233821Cbs2.log_handler);
            protoAdapter.encodeWithTag(protoWriter, 15, c2233821Cbs2.event_monitor);
            protoWriter.writeBytes(c2233821Cbs2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_IS_ROOM_OWNER = Boolean.FALSE;
    public static final Long DEFAULT_SELF_UID = 0L;
    public static final Double DEFAULT_DEVICE_SCREEN_SCALE = Double.valueOf(0.0d);
    public static final EnumC2182351Ab3 DEFAULT_LAYER_SCENE = EnumC2182351Ab3.VAR_LINK_MIC_LAYOUT_SCENE_IN_ROOM;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((((((unknownFields().hashCode() * 37) + this.is_room_owner.hashCode()) * 37) + this.self_uid.hashCode()) * 37) + this.device_screen_scale.hashCode()) * 37) + this.layer_scene.hashCode()) * 37) + this.parent_container_info.hashCode()) * 37) + this.container_rect_config.hashCode()) * 37;
        String str = this.container_mode_config;
        int iHashCode2 = (((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.link_mic_static_data_channel_provider.hashCode()) * 37) + this.link_mic_layout_thread_handler.hashCode()) * 37) + this.listener.hashCode()) * 37) + this.view_provider.hashCode()) * 37;
        C1CIG c1cig = this.player;
        int iHashCode3 = (iHashCode2 + (c1cig != null ? c1cig.hashCode() : 0)) * 37;
        C1CIG c1cig2 = this.canvas;
        int iHashCode4 = (((iHashCode3 + (c1cig2 != null ? c1cig2.hashCode() : 0)) * 37) + this.log_handler.hashCode()) * 37;
        C1CIG c1cig3 = this.event_monitor;
        int iHashCode5 = iHashCode4 + (c1cig3 != null ? c1cig3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C2233841Cbu newBuilder() {
        C2233841Cbu c2233841Cbu = new C2233841Cbu();
        c2233841Cbu.LIZLLL = this.is_room_owner;
        c2233841Cbu.LJ = this.self_uid;
        c2233841Cbu.LJFF = this.device_screen_scale;
        c2233841Cbu.LJI = this.layer_scene;
        c2233841Cbu.LJII = this.parent_container_info;
        c2233841Cbu.LJIIIIZZ = this.container_rect_config;
        c2233841Cbu.LJIIIZ = this.container_mode_config;
        c2233841Cbu.LJIIJ = this.link_mic_static_data_channel_provider;
        c2233841Cbu.LJIIJJI = this.link_mic_layout_thread_handler;
        c2233841Cbu.LJIIL = this.listener;
        c2233841Cbu.LJIILIIL = this.view_provider;
        c2233841Cbu.LJIILJJIL = this.player;
        c2233841Cbu.LJIILL = this.canvas;
        c2233841Cbu.LJIILLIIL = this.log_handler;
        c2233841Cbu.LJIIZILJ = this.event_monitor;
        c2233841Cbu.addUnknownFields(unknownFields());
        return c2233841Cbu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", is_room_owner=");
        sb.append(this.is_room_owner);
        sb.append(", self_uid=");
        sb.append(this.self_uid);
        sb.append(", device_screen_scale=");
        sb.append(this.device_screen_scale);
        sb.append(", layer_scene=");
        sb.append(this.layer_scene);
        sb.append(", parent_container_info=");
        sb.append(this.parent_container_info);
        sb.append(", container_rect_config=");
        sb.append(this.container_rect_config);
        if (this.container_mode_config != null) {
            sb.append(", container_mode_config=");
            sb.append(this.container_mode_config);
        }
        sb.append(", link_mic_static_data_channel_provider=");
        sb.append(this.link_mic_static_data_channel_provider);
        sb.append(", link_mic_layout_thread_handler=");
        sb.append(this.link_mic_layout_thread_handler);
        sb.append(", listener=");
        sb.append(this.listener);
        sb.append(", view_provider=");
        sb.append(this.view_provider);
        if (this.player != null) {
            sb.append(", player=");
            sb.append(this.player);
        }
        if (this.canvas != null) {
            sb.append(", canvas=");
            sb.append(this.canvas);
        }
        sb.append(", log_handler=");
        sb.append(this.log_handler);
        if (this.event_monitor != null) {
            sb.append(", event_monitor=");
            sb.append(this.event_monitor);
        }
        sb.replace(0, 2, "FuncParamsX063fe3ab538db442{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2233821Cbs)) {
            return false;
        }
        C2233821Cbs c2233821Cbs = (C2233821Cbs) obj;
        if (unknownFields().equals(c2233821Cbs.unknownFields()) && this.is_room_owner.equals(c2233821Cbs.is_room_owner) && this.self_uid.equals(c2233821Cbs.self_uid) && this.device_screen_scale.equals(c2233821Cbs.device_screen_scale) && this.layer_scene.equals(c2233821Cbs.layer_scene) && this.parent_container_info.equals(c2233821Cbs.parent_container_info) && this.container_rect_config.equals(c2233821Cbs.container_rect_config) && C1516540pZE.LJ(this.container_mode_config, c2233821Cbs.container_mode_config) && this.link_mic_static_data_channel_provider.equals(c2233821Cbs.link_mic_static_data_channel_provider) && this.link_mic_layout_thread_handler.equals(c2233821Cbs.link_mic_layout_thread_handler) && this.listener.equals(c2233821Cbs.listener) && this.view_provider.equals(c2233821Cbs.view_provider) && C1516540pZE.LJ(this.player, c2233821Cbs.player) && C1516540pZE.LJ(this.canvas, c2233821Cbs.canvas) && this.log_handler.equals(c2233821Cbs.log_handler) && C1516540pZE.LJ(this.event_monitor, c2233821Cbs.event_monitor)) {
            return true;
        }
        return false;
    }

    public C2233821Cbs(Boolean bool, Long l, Double d, EnumC2182351Ab3 enumC2182351Ab3, C1CSP c1csp, C2230371CRf c2230371CRf, String str, C1CIG c1cig, C1CIG c1cig2, C1CIG c1cig3, C1CIG c1cig4, C1CIG c1cig5, C1CIG c1cig6, C1CIG c1cig7, C1CIG c1cig8) {
        this(bool, l, d, enumC2182351Ab3, c1csp, c2230371CRf, str, c1cig, c1cig2, c1cig3, c1cig4, c1cig5, c1cig6, c1cig7, c1cig8, ByteString.EMPTY);
    }

    public C2233821Cbs(Boolean bool, Long l, Double d, EnumC2182351Ab3 enumC2182351Ab3, C1CSP c1csp, C2230371CRf c2230371CRf, String str, C1CIG c1cig, C1CIG c1cig2, C1CIG c1cig3, C1CIG c1cig4, C1CIG c1cig5, C1CIG c1cig6, C1CIG c1cig7, C1CIG c1cig8, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_room_owner = bool;
        this.self_uid = l;
        this.device_screen_scale = d;
        this.layer_scene = enumC2182351Ab3;
        this.parent_container_info = c1csp;
        this.container_rect_config = c2230371CRf;
        this.container_mode_config = str;
        this.link_mic_static_data_channel_provider = c1cig;
        this.link_mic_layout_thread_handler = c1cig2;
        this.listener = c1cig3;
        this.view_provider = c1cig4;
        this.player = c1cig5;
        this.canvas = c1cig6;
        this.log_handler = c1cig7;
        this.event_monitor = c1cig8;
    }
}
