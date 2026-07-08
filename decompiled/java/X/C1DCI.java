package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DCI, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCI extends Message<C1DCI, C1DCK> {
    public static final ProtoAdapter<C1DCI> ADAPTER = new ProtoAdapter<C1DCI>() { // from class: X.1DCE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DCI decode(ProtoReader protoReader) {
            C1DCK c1dck = new C1DCK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dck.LIZLLL = C1DB2.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c1dck.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1dck.LJFF = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 4:
                            c1dck.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1dck.LJII = C1DB5.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1dck.LJIIIIZZ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 7:
                            c1dck.LJIIIZ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 8:
                            c1dck.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1dck.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1dck.LJIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1dck.LJIILIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1dck.LJIILJJIL = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1dck.LJIILL = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 14:
                            c1dck.LJIILLIIL = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 15:
                            c1dck.LJIIZILJ = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case 16:
                            c1dck.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c1dck.LJIJI = C2251641DBa.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c1dck.LJIJJ = C1C9T.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c1dck.LJIJJLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c1dck.LJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c1dck.LJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c1dck.LJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c1dck.LJJIFFI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c1dck.LJJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 25:
                            c1dck.LJJIII = C2251781DBo.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            c1dck.LJJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 27:
                            c1dck.LJJIIJZLJL.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 28:
                            c1dck.LJJIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 29:
                            c1dck.LJJIIZI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dck.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dck.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DCI c1dci) {
            C1DCI c1dci2 = c1dci;
            int iEncodedSizeWithTag = C1DB2.ADAPTER.encodedSizeWithTag(1, c1dci2.brightness);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1dci2.dark_mode);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c1dci2.font_scale) + protoAdapter.encodedSizeWithTag(4, c1dci2.camera_status) + C1DB5.ADAPTER.encodedSizeWithTag(5, c1dci2.ohr_predict) + protoAdapter2.encodedSizeWithTag(6, c1dci2.stream_music_volume) + protoAdapter2.encodedSizeWithTag(7, c1dci2.battery_pct);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(8, c1dci2.is_charge) + protoAdapter3.encodedSizeWithTag(9, c1dci2.data_save_mode) + protoAdapter3.encodedSizeWithTag(10, c1dci2.low_power_mode) + protoAdapter.encodedSizeWithTag(11, c1dci2.net_connect_type) + protoAdapter2.encodedSizeWithTag(12, c1dci2.mem_avail) + protoAdapter2.encodedSizeWithTag(13, c1dci2.cpu_usage) + protoAdapter2.encodedSizeWithTag(14, c1dci2.gpu_usage) + protoAdapter2.encodedSizeWithTag(15, c1dci2.battery_temperature) + protoAdapter.encodedSizeWithTag(16, c1dci2.thermals_state) + C2251641DBa.ADAPTER.encodedSizeWithTag(17, c1dci2.har_predict) + C1C9T.ADAPTER.encodedSizeWithTag(18, c1dci2.play_time_predict);
            ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag4 + protoAdapter4.encodedSizeWithTag(19, c1dci2.screen_width) + protoAdapter4.encodedSizeWithTag(20, c1dci2.screen_height) + protoAdapter4.encodedSizeWithTag(21, c1dci2.screen_dpi) + protoAdapter4.encodedSizeWithTag(22, c1dci2.screen_dip) + protoAdapter4.encodedSizeWithTag(23, c1dci2.screen_resolution) + protoAdapter.encodedSizeWithTag(24, c1dci2.screen_rating) + C2251781DBo.ADAPTER.encodedSizeWithTag(25, c1dci2.app_ads_detect_rsp) + protoAdapter3.encodedSizeWithTag(26, c1dci2.lite_mode) + protoAdapter4.asRepeated().encodedSizeWithTag(27, c1dci2.keyboard_languages) + protoAdapter.encodedSizeWithTag(28, c1dci2.net_quality_level) + protoAdapter3.encodedSizeWithTag(29, c1dci2.is_rtl) + c1dci2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DCI c1dci) {
            C1DCI c1dci2 = c1dci;
            C1DB2.ADAPTER.encodeWithTag(protoWriter, 1, c1dci2.brightness);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c1dci2.dark_mode);
            ProtoAdapter<Double> protoAdapter2 = ProtoAdapter.DOUBLE;
            protoAdapter2.encodeWithTag(protoWriter, 3, c1dci2.font_scale);
            protoAdapter.encodeWithTag(protoWriter, 4, c1dci2.camera_status);
            C1DB5.ADAPTER.encodeWithTag(protoWriter, 5, c1dci2.ohr_predict);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1dci2.stream_music_volume);
            protoAdapter2.encodeWithTag(protoWriter, 7, c1dci2.battery_pct);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 8, c1dci2.is_charge);
            protoAdapter3.encodeWithTag(protoWriter, 9, c1dci2.data_save_mode);
            protoAdapter3.encodeWithTag(protoWriter, 10, c1dci2.low_power_mode);
            protoAdapter.encodeWithTag(protoWriter, 11, c1dci2.net_connect_type);
            protoAdapter2.encodeWithTag(protoWriter, 12, c1dci2.mem_avail);
            protoAdapter2.encodeWithTag(protoWriter, 13, c1dci2.cpu_usage);
            protoAdapter2.encodeWithTag(protoWriter, 14, c1dci2.gpu_usage);
            protoAdapter2.encodeWithTag(protoWriter, 15, c1dci2.battery_temperature);
            protoAdapter.encodeWithTag(protoWriter, 16, c1dci2.thermals_state);
            C2251641DBa.ADAPTER.encodeWithTag(protoWriter, 17, c1dci2.har_predict);
            C1C9T.ADAPTER.encodeWithTag(protoWriter, 18, c1dci2.play_time_predict);
            ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
            protoAdapter4.encodeWithTag(protoWriter, 19, c1dci2.screen_width);
            protoAdapter4.encodeWithTag(protoWriter, 20, c1dci2.screen_height);
            protoAdapter4.encodeWithTag(protoWriter, 21, c1dci2.screen_dpi);
            protoAdapter4.encodeWithTag(protoWriter, 22, c1dci2.screen_dip);
            protoAdapter4.encodeWithTag(protoWriter, 23, c1dci2.screen_resolution);
            protoAdapter.encodeWithTag(protoWriter, 24, c1dci2.screen_rating);
            C2251781DBo.ADAPTER.encodeWithTag(protoWriter, 25, c1dci2.app_ads_detect_rsp);
            protoAdapter3.encodeWithTag(protoWriter, 26, c1dci2.lite_mode);
            protoAdapter4.asRepeated().encodeWithTag(protoWriter, 27, c1dci2.keyboard_languages);
            protoAdapter.encodeWithTag(protoWriter, 28, c1dci2.net_quality_level);
            protoAdapter3.encodeWithTag(protoWriter, 29, c1dci2.is_rtl);
            protoWriter.writeBytes(c1dci2.unknownFields());
        }
    };
    public C2251781DBo app_ads_detect_rsp;
    public Double battery_pct;
    public Double battery_temperature;
    public C1DB2 brightness;
    public Integer camera_status;
    public Double cpu_usage;
    public Integer dark_mode;
    public Boolean data_save_mode;
    public Double font_scale;
    public Double gpu_usage;
    public C2251641DBa har_predict;
    public Boolean is_charge;
    public Boolean is_rtl;
    public List<String> keyboard_languages;
    public Boolean lite_mode;
    public Boolean low_power_mode;
    public Double mem_avail;
    public Integer net_connect_type;
    public Integer net_quality_level;
    public C1DB5 ohr_predict;
    public C1C9T play_time_predict;
    public String screen_dip;
    public String screen_dpi;
    public String screen_height;
    public Integer screen_rating;
    public String screen_resolution;
    public String screen_width;
    public Double stream_music_volume;
    public Integer thermals_state;

    @Override // com.squareup.wire.Message
    public C1DCK newBuilder() {
        return null;
    }

    public C1DCI(C1DB2 c1db2, Integer num, Double d, Integer num2, C1DB5 c1db5, Double d2, Double d3, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Double d4, Double d5, Double d6, Double d7, Integer num4, C2251641DBa c2251641DBa, C1C9T c1c9t, String str, String str2, String str3, String str4, String str5, Integer num5, C2251781DBo c2251781DBo, Boolean bool4, List<String> list, Integer num6, Boolean bool5) {
        this(c1db2, num, d, num2, c1db5, d2, d3, bool, bool2, bool3, num3, d4, d5, d6, d7, num4, c2251641DBa, c1c9t, str, str2, str3, str4, str5, num5, c2251781DBo, bool4, list, num6, bool5, ByteString.EMPTY);
    }

    public C1DCI(C1DB2 c1db2, Integer num, Double d, Integer num2, C1DB5 c1db5, Double d2, Double d3, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Double d4, Double d5, Double d6, Double d7, Integer num4, C2251641DBa c2251641DBa, C1C9T c1c9t, String str, String str2, String str3, String str4, String str5, Integer num5, C2251781DBo c2251781DBo, Boolean bool4, List<String> list, Integer num6, Boolean bool5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.brightness = c1db2;
        this.dark_mode = num;
        this.font_scale = d;
        this.camera_status = num2;
        this.ohr_predict = c1db5;
        this.stream_music_volume = d2;
        this.battery_pct = d3;
        this.is_charge = bool;
        this.data_save_mode = bool2;
        this.low_power_mode = bool3;
        this.net_connect_type = num3;
        this.mem_avail = d4;
        this.cpu_usage = d5;
        this.gpu_usage = d6;
        this.battery_temperature = d7;
        this.thermals_state = num4;
        this.har_predict = c2251641DBa;
        this.play_time_predict = c1c9t;
        this.screen_width = str;
        this.screen_height = str2;
        this.screen_dpi = str3;
        this.screen_dip = str4;
        this.screen_resolution = str5;
        this.screen_rating = num5;
        this.app_ads_detect_rsp = c2251781DBo;
        this.lite_mode = bool4;
        this.keyboard_languages = C1516540pZE.LJFF("keyboard_languages", list);
        this.net_quality_level = num6;
        this.is_rtl = bool5;
    }
}
