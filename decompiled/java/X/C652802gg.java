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

/* JADX INFO: renamed from: X.02gg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C652802gg extends Message<C652802gg, C653002gi> {
    public static final ProtoAdapter<C652802gg> ADAPTER = new ProtoAdapter<C652802gg>() { // from class: X.02gh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C652802gg decode(ProtoReader protoReader) {
            C652802gg c652802gg = new C652802gg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 101) {
                        if (iNextTag != 102) {
                            switch (iNextTag) {
                                case 1:
                                    c652802gg.item_type = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 2:
                                    c652802gg.item_name = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 3:
                                    c652802gg.item_price = C02FG.ADAPTER.decode(protoReader);
                                    break;
                                case 4:
                                    c652802gg.logo = C029C.ADAPTER.decode(protoReader);
                                    break;
                                case 5:
                                    c652802gg.item_text_color = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 6:
                                    c652802gg.item_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 7:
                                    c652802gg.sub_items.add(C652802gg.ADAPTER.decode(protoReader));
                                    break;
                                case 8:
                                    c652802gg.item_text_font = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    c652802gg.item_explain = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    c652802gg.popup_explain = C5431029t.ADAPTER.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    c652802gg.popup_button = C653202gk.ADAPTER.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    c652802gg.rich_text_item_name = C5431029t.ADAPTER.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    c652802gg.group_name = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 14:
                                    c652802gg.sku_ids.add(ProtoAdapter.STRING.decode(protoReader));
                                    break;
                                case 15:
                                    c652802gg.has_popup = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 16:
                                    c652802gg.has_divider = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    c652802gg.popup_banner.add(C029C.ADAPTER.decode(protoReader));
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                    c652802gg.item_original_price = C02FG.ADAPTER.decode(protoReader);
                                    break;
                                case 19:
                                    c652802gg.has_pullup_sheet = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                    c652802gg.pullup_sheet_icon = C029C.ADAPTER.decode(protoReader);
                                    break;
                                case 21:
                                    c652802gg.vertical_divider_style = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 22:
                                    c652802gg.popup_style = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 23:
                                    c652802gg.da_info = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    c652802gg.item_name_en = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 25:
                                    c652802gg.item_suffix = C740302un.ADAPTER.decode(protoReader);
                                    break;
                                case 26:
                                    c652802gg.item_name_rich_text = C5431029t.ADAPTER.decode(protoReader);
                                    break;
                                case 27:
                                    c652802gg.tc_explanation = C2223901C2i.ADAPTER.decode(protoReader);
                                    break;
                                case 28:
                                    c652802gg.remarks = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 29:
                                    c652802gg.popup_title = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 30:
                                    c652802gg.display_promotion_pages_entrance = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 31:
                                    c652802gg.click_to_jump_to_promotion_pages = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case 32:
                                    c652802gg.before_icon = C029C.ADAPTER.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                    c652802gg.with_plus = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                    c652802gg.is_toko_plus_custom_style = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                        } else {
                            c652802gg.pullup_sheet = C735602u2.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c652802gg.pop_up = C706602pM.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c652802gg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C652802gg c652802gg) {
            C652802gg c652802gg2 = c652802gg;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c652802gg2.item_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c652802gg2.item_name);
            ProtoAdapter<C02FG> protoAdapter3 = C02FG.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, c652802gg2.item_price);
            ProtoAdapter<C029C> protoAdapter4 = C029C.ADAPTER;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(4, c652802gg2.logo) + protoAdapter.encodedSizeWithTag(5, c652802gg2.item_text_color) + protoAdapter2.encodedSizeWithTag(6, c652802gg2.item_text) + C652802gg.ADAPTER.asRepeated().encodedSizeWithTag(7, c652802gg2.sub_items) + protoAdapter.encodedSizeWithTag(8, c652802gg2.item_text_font) + protoAdapter2.encodedSizeWithTag(9, c652802gg2.item_explain);
            ProtoAdapter<C5431029t> protoAdapter5 = C5431029t.ADAPTER;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(10, c652802gg2.popup_explain) + C653202gk.ADAPTER.encodedSizeWithTag(11, c652802gg2.popup_button) + protoAdapter5.encodedSizeWithTag(12, c652802gg2.rich_text_item_name) + protoAdapter2.encodedSizeWithTag(13, c652802gg2.group_name) + protoAdapter2.asRepeated().encodedSizeWithTag(14, c652802gg2.sku_ids);
            ProtoAdapter<Boolean> protoAdapter6 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag5 + protoAdapter6.encodedSizeWithTag(15, c652802gg2.has_popup) + protoAdapter6.encodedSizeWithTag(16, c652802gg2.has_divider) + protoAdapter4.asRepeated().encodedSizeWithTag(17, c652802gg2.popup_banner) + protoAdapter3.encodedSizeWithTag(18, c652802gg2.item_original_price) + protoAdapter6.encodedSizeWithTag(19, c652802gg2.has_pullup_sheet) + protoAdapter4.encodedSizeWithTag(20, c652802gg2.pullup_sheet_icon) + protoAdapter.encodedSizeWithTag(21, c652802gg2.vertical_divider_style) + protoAdapter.encodedSizeWithTag(22, c652802gg2.popup_style) + protoAdapter2.encodedSizeWithTag(23, c652802gg2.da_info) + protoAdapter2.encodedSizeWithTag(24, c652802gg2.item_name_en) + C740302un.ADAPTER.encodedSizeWithTag(25, c652802gg2.item_suffix) + protoAdapter5.encodedSizeWithTag(26, c652802gg2.item_name_rich_text) + C2223901C2i.ADAPTER.encodedSizeWithTag(27, c652802gg2.tc_explanation) + protoAdapter2.encodedSizeWithTag(28, c652802gg2.remarks) + protoAdapter2.encodedSizeWithTag(29, c652802gg2.popup_title) + protoAdapter6.encodedSizeWithTag(30, c652802gg2.display_promotion_pages_entrance) + protoAdapter6.encodedSizeWithTag(31, c652802gg2.click_to_jump_to_promotion_pages) + protoAdapter4.encodedSizeWithTag(32, c652802gg2.before_icon) + protoAdapter6.encodedSizeWithTag(33, c652802gg2.with_plus) + protoAdapter6.encodedSizeWithTag(34, c652802gg2.is_toko_plus_custom_style) + C706602pM.ADAPTER.encodedSizeWithTag(101, c652802gg2.pop_up) + C735602u2.ADAPTER.encodedSizeWithTag(102, c652802gg2.pullup_sheet) + c652802gg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C652802gg c652802gg) {
        }
    };
    public C029C before_icon;
    public Boolean click_to_jump_to_promotion_pages;
    public String da_info;
    public Boolean display_promotion_pages_entrance;
    public String group_name;
    public Boolean has_divider;
    public Boolean has_popup;
    public Boolean has_pullup_sheet;
    public Boolean is_toko_plus_custom_style;
    public String item_explain;
    public String item_name;
    public String item_name_en;
    public C5431029t item_name_rich_text;
    public C02FG item_original_price;
    public C02FG item_price;
    public C740302un item_suffix;
    public String item_text;
    public Integer item_text_color;
    public Integer item_text_font;
    public Integer item_type;
    public C029C logo;
    public C706602pM pop_up;
    public List<C029C> popup_banner;
    public C653202gk popup_button;
    public C5431029t popup_explain;
    public Integer popup_style;
    public String popup_title;
    public C735602u2 pullup_sheet;
    public C029C pullup_sheet_icon;
    public String remarks;
    public C5431029t rich_text_item_name;
    public List<String> sku_ids;
    public List<C652802gg> sub_items;
    public C2223901C2i tc_explanation;
    public Integer vertical_divider_style;
    public Boolean with_plus;

    public C652802gg() {
        super(ADAPTER, ByteString.EMPTY);
        this.sub_items = C1516540pZE.LJIIIIZZ();
        this.sku_ids = C1516540pZE.LJIIIIZZ();
        this.popup_banner = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C653002gi newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
