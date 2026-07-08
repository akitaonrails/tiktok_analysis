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

/* JADX INFO: renamed from: X.021q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5220021q extends Message<C5220021q, C02NN> {
    public static final ProtoAdapter<C5220021q> ADAPTER = new ProtoAdapter<C5220021q>() { // from class: X.021g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5220021q decode(ProtoReader protoReader) {
            C5220021q c5220021q = new C5220021q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5220021q.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5220021q.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5220021q.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5220021q.user_right_desc.add(C5338026e.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c5220021q.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5220021q.desc_expand = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c5220021q.expose = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c5220021q.name_en = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5220021q.background_image = C029C.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5220021q.show_chevron = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5220021q.header_background_image = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c5220021q.theme_color = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            c5220021q.popup_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c5220021q.show_popup = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5220021q.header_font_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5220021q.header_font_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c5220021q.event_tracking_param = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5220021q.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c5220021q.schema_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            c5220021q.schema_text_color_light = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 23:
                            c5220021q.schema_text_color_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c5220021q.type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 25:
                            c5220021q.name_font = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 26:
                            c5220021q.expand_desc_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 27:
                            c5220021q.right_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 28:
                            c5220021q.popup_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 29:
                            c5220021q.detail_page_expand = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 30:
                            c5220021q.detail_page_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 31:
                            c5220021q.text_color = C648702g1.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5220021q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5220021q c5220021q) {
            C5220021q c5220021q2 = c5220021q;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5220021q2.id) + protoAdapter.encodedSizeWithTag(2, c5220021q2.name) + protoAdapter.encodedSizeWithTag(3, c5220021q2.description) + C5338026e.ADAPTER.asRepeated().encodedSizeWithTag(4, c5220021q2.user_right_desc);
            ProtoAdapter<C029C> protoAdapter2 = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c5220021q2.icon);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c5220021q2.desc_expand) + protoAdapter3.encodedSizeWithTag(7, c5220021q2.expose) + protoAdapter.encodedSizeWithTag(8, c5220021q2.name_en) + protoAdapter2.encodedSizeWithTag(11, c5220021q2.background_image) + protoAdapter3.encodedSizeWithTag(12, c5220021q2.show_chevron) + protoAdapter2.encodedSizeWithTag(13, c5220021q2.header_background_image);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(14, c5220021q2.theme_color) + protoAdapter4.encodedSizeWithTag(15, c5220021q2.popup_style) + protoAdapter3.encodedSizeWithTag(16, c5220021q2.show_popup) + protoAdapter.encodedSizeWithTag(17, c5220021q2.header_font_color) + protoAdapter.encodedSizeWithTag(18, c5220021q2.header_font_dark_color) + protoAdapter.encodedSizeWithTag(19, c5220021q2.event_tracking_param) + protoAdapter.encodedSizeWithTag(20, c5220021q2.schema) + protoAdapter.encodedSizeWithTag(21, c5220021q2.schema_text) + protoAdapter.encodedSizeWithTag(22, c5220021q2.schema_text_color_light) + protoAdapter.encodedSizeWithTag(23, c5220021q2.schema_text_color_dark) + protoAdapter.encodedSizeWithTag(24, c5220021q2.type) + protoAdapter4.encodedSizeWithTag(25, c5220021q2.name_font) + protoAdapter4.encodedSizeWithTag(26, c5220021q2.expand_desc_count) + protoAdapter4.encodedSizeWithTag(27, c5220021q2.right_style) + protoAdapter.encodedSizeWithTag(28, c5220021q2.popup_title) + protoAdapter3.encodedSizeWithTag(29, c5220021q2.detail_page_expand) + protoAdapter.encodedSizeWithTag(30, c5220021q2.detail_page_schema) + C648702g1.ADAPTER.encodedSizeWithTag(31, c5220021q2.text_color) + c5220021q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5220021q c5220021q) {
        }
    };
    public C029C background_image;
    public Boolean desc_expand;
    public String description;
    public Boolean detail_page_expand;
    public String detail_page_schema;
    public String event_tracking_param;
    public Integer expand_desc_count;
    public Boolean expose;
    public C029C header_background_image;
    public String header_font_color;
    public String header_font_dark_color;
    public C029C icon;
    public String id;
    public String name;
    public String name_en;
    public Integer name_font;
    public Integer popup_style;
    public String popup_title;
    public Integer right_style;
    public String schema;
    public String schema_text;
    public String schema_text_color_dark;
    public String schema_text_color_light;
    public Boolean show_chevron;
    public Boolean show_popup;
    public C648702g1 text_color;
    public Integer theme_color;
    public String type;
    public List<C5338026e> user_right_desc;

    public C5220021q() {
        super(ADAPTER, ByteString.EMPTY);
        this.user_right_desc = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02NN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
