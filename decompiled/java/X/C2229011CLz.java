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

/* JADX INFO: renamed from: X.1CLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229011CLz extends Message<C2229011CLz, C1CM1> {
    public static final ProtoAdapter<C2229011CLz> ADAPTER = new ProtoAdapter<C2229011CLz>() { // from class: X.1CM0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229011CLz decode(ProtoReader protoReader) {
            C1CM1 c1cm1 = new C1CM1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cm1.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1cm1.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1cm1.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c1cm1.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1cm1.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1cm1.LJIIIIZZ = C2229171CMp.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1cm1.LJIIIZ = C1CZR.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            try {
                                c1cm1.LJIIJ = EnumC1286780jae.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1cm1.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1cm1.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1cm1.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cm1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cm1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2229011CLz c2229011CLz) {
            C2229011CLz c2229011CLz2 = c2229011CLz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2229011CLz2.app_channel_type) + protoAdapter.encodedSizeWithTag(2, c2229011CLz2.project_key);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2229011CLz2.force_global_api_server) + protoAdapter.encodedSizeWithTag(4, c2229011CLz2.str_uid) + protoAdapter.encodedSizeWithTag(5, c2229011CLz2.rtc_ext_info) + C2229171CMp.ADAPTER.encodedSizeWithTag(6, c2229011CLz2.mix_stream_config) + C1CZR.ADAPTER.encodedSizeWithTag(7, c2229011CLz2.media_param) + EnumC1286780jae.ADAPTER.encodedSizeWithTag(8, c2229011CLz2.render_view_mode) + protoAdapter2.encodedSizeWithTag(9, c2229011CLz2.enable_subscript_optimization) + protoAdapter.encodedSizeWithTag(10, c2229011CLz2.link_mic_layout_config) + c2229011CLz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2229011CLz redact(C2229011CLz c2229011CLz) {
            C1CM1 c1cm1NewBuilder = c2229011CLz.newBuilder();
            c1cm1NewBuilder.LJIIIIZZ = C2229171CMp.ADAPTER.redact(c1cm1NewBuilder.LJIIIIZZ);
            c1cm1NewBuilder.LJIIIZ = C1CZR.ADAPTER.redact(c1cm1NewBuilder.LJIIIZ);
            c1cm1NewBuilder.clearUnknownFields();
            return c1cm1NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2229011CLz c2229011CLz) {
            C2229011CLz c2229011CLz2 = c2229011CLz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2229011CLz2.app_channel_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c2229011CLz2.project_key);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 3, c2229011CLz2.force_global_api_server);
            protoAdapter.encodeWithTag(protoWriter, 4, c2229011CLz2.str_uid);
            protoAdapter.encodeWithTag(protoWriter, 5, c2229011CLz2.rtc_ext_info);
            C2229171CMp.ADAPTER.encodeWithTag(protoWriter, 6, c2229011CLz2.mix_stream_config);
            C1CZR.ADAPTER.encodeWithTag(protoWriter, 7, c2229011CLz2.media_param);
            EnumC1286780jae.ADAPTER.encodeWithTag(protoWriter, 8, c2229011CLz2.render_view_mode);
            protoAdapter2.encodeWithTag(protoWriter, 9, c2229011CLz2.enable_subscript_optimization);
            protoAdapter.encodeWithTag(protoWriter, 10, c2229011CLz2.link_mic_layout_config);
            protoWriter.writeBytes(c2229011CLz2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_ENABLE_SUBSCRIPT_OPTIMIZATION;
    public static final Boolean DEFAULT_FORCE_GLOBAL_API_SERVER;
    public static final EnumC1286780jae DEFAULT_RENDER_VIEW_MODE;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public final String app_channel_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = BdTuring.TYPE_ECAF)
    public final Boolean enable_subscript_optimization;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 3)
    public final Boolean force_global_api_server;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final String link_mic_layout_config;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicMediaParam#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public final C1CZR media_param;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRtcMixStreamConfig#ADAPTER", label = WireField.Label.REQUIRED, tag = 6)
    public final C2229171CMp mix_stream_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public final String project_key;

    @WireField(adapter = "link_mic_sdk.proto.LinkMicRenderMode#ADAPTER", label = WireField.Label.REQUIRED, tag = 8)
    public final EnumC1286780jae render_view_mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 5)
    public final String rtc_ext_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public final String str_uid;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_FORCE_GLOBAL_API_SERVER = bool;
        DEFAULT_RENDER_VIEW_MODE = EnumC1286780jae.VAR_LINK_MIC_RENDER_MODE_RENDER_MODE_DEFAULT;
        DEFAULT_ENABLE_SUBSCRIPT_OPTIMIZATION = bool;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((unknownFields().hashCode() * 37) + this.app_channel_type.hashCode()) * 37) + this.project_key.hashCode()) * 37) + this.force_global_api_server.hashCode()) * 37) + this.str_uid.hashCode()) * 37) + this.rtc_ext_info.hashCode()) * 37) + this.mix_stream_config.hashCode()) * 37) + this.media_param.hashCode()) * 37) + this.render_view_mode.hashCode()) * 37) + this.enable_subscript_optimization.hashCode()) * 37) + this.link_mic_layout_config.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CM1 newBuilder() {
        C1CM1 c1cm1 = new C1CM1();
        c1cm1.LIZLLL = this.app_channel_type;
        c1cm1.LJ = this.project_key;
        c1cm1.LJFF = this.force_global_api_server;
        c1cm1.LJI = this.str_uid;
        c1cm1.LJII = this.rtc_ext_info;
        c1cm1.LJIIIIZZ = this.mix_stream_config;
        c1cm1.LJIIIZ = this.media_param;
        c1cm1.LJIIJ = this.render_view_mode;
        c1cm1.LJIIJJI = this.enable_subscript_optimization;
        c1cm1.LJIIL = this.link_mic_layout_config;
        c1cm1.addUnknownFields(unknownFields());
        return c1cm1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", app_channel_type=");
        sb.append(this.app_channel_type);
        sb.append(", project_key=");
        sb.append(this.project_key);
        sb.append(", force_global_api_server=");
        sb.append(this.force_global_api_server);
        sb.append(", str_uid=");
        sb.append(this.str_uid);
        sb.append(", rtc_ext_info=");
        sb.append(this.rtc_ext_info);
        sb.append(", mix_stream_config=");
        sb.append(this.mix_stream_config);
        sb.append(", media_param=");
        sb.append(this.media_param);
        sb.append(", render_view_mode=");
        sb.append(this.render_view_mode);
        sb.append(", enable_subscript_optimization=");
        sb.append(this.enable_subscript_optimization);
        sb.append(", link_mic_layout_config=");
        sb.append(this.link_mic_layout_config);
        sb.replace(0, 2, "LinkMicRtcInteractStreamConfig{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2229011CLz)) {
            return false;
        }
        C2229011CLz c2229011CLz = (C2229011CLz) obj;
        if (unknownFields().equals(c2229011CLz.unknownFields()) && this.app_channel_type.equals(c2229011CLz.app_channel_type) && this.project_key.equals(c2229011CLz.project_key) && this.force_global_api_server.equals(c2229011CLz.force_global_api_server) && this.str_uid.equals(c2229011CLz.str_uid) && this.rtc_ext_info.equals(c2229011CLz.rtc_ext_info) && this.mix_stream_config.equals(c2229011CLz.mix_stream_config) && this.media_param.equals(c2229011CLz.media_param) && this.render_view_mode.equals(c2229011CLz.render_view_mode) && this.enable_subscript_optimization.equals(c2229011CLz.enable_subscript_optimization) && this.link_mic_layout_config.equals(c2229011CLz.link_mic_layout_config)) {
            return true;
        }
        return false;
    }

    public C2229011CLz(String str, String str2, Boolean bool, String str3, String str4, C2229171CMp c2229171CMp, C1CZR c1czr, EnumC1286780jae enumC1286780jae, Boolean bool2, String str5) {
        this(str, str2, bool, str3, str4, c2229171CMp, c1czr, enumC1286780jae, bool2, str5, ByteString.EMPTY);
    }

    public C2229011CLz(String str, String str2, Boolean bool, String str3, String str4, C2229171CMp c2229171CMp, C1CZR c1czr, EnumC1286780jae enumC1286780jae, Boolean bool2, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_channel_type = str;
        this.project_key = str2;
        this.force_global_api_server = bool;
        this.str_uid = str3;
        this.rtc_ext_info = str4;
        this.mix_stream_config = c2229171CMp;
        this.media_param = c1czr;
        this.render_view_mode = enumC1286780jae;
        this.enable_subscript_optimization = bool2;
        this.link_mic_layout_config = str5;
    }
}
