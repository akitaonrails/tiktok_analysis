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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.021N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C021N extends Message<C021N, C02PV> {
    public static final ProtoAdapter<C021N> ADAPTER = new ProtoAdapter<C021N>() { // from class: X.021D
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C021N decode(ProtoReader protoReader) {
            C021N c021n = new C021N();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c021n.shipping_address = C023N.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c021n.address_reachable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c021n.sku_reachables.add(C557102Fd.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c021n.invalid_hint_message = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c021n.address_valid = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c021n.available_for_change = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c021n.unavailable_change_hint = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c021n.available_for_incentive = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c021n.unavailable_incentive_hint = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c021n.address_default_selection = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c021n.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c021n.starling_texts = C612902aF.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c021n.address_invalid_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c021n.shipping_address_switch = C629902cz.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c021n.hint_message_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c021n.da_info.putAll(this.LIZ.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c021n.is_selected = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c021n.sub_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c021n.enable_edit = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c021n.jump_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c021n.hint_invalid_dynamic_message = C551502Cz.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c021n.benefit_items.add(C557202Fe.ADAPTER.decode(protoReader));
                            break;
                        case 23:
                            c021n.shipping_price_benefit_item = C557202Fe.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c021n.address_module_style_version = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 25:
                            c021n.pudo_hint_invalid_dynamic_message = C551502Cz.ADAPTER.decode(protoReader);
                            break;
                        case 26:
                            c021n.invalid_hint_message_rich_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c021n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C021N c021n) {
            C021N c021n2 = c021n;
            int iEncodedSizeWithTag = C023N.ADAPTER.encodedSizeWithTag(1, c021n2.shipping_address);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c021n2.address_reachable) + C557102Fd.ADAPTER.asRepeated().encodedSizeWithTag(3, c021n2.sku_reachables);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c021n2.invalid_hint_message) + protoAdapter.encodedSizeWithTag(5, c021n2.address_valid) + protoAdapter.encodedSizeWithTag(6, c021n2.available_for_change) + protoAdapter2.encodedSizeWithTag(7, c021n2.unavailable_change_hint) + protoAdapter.encodedSizeWithTag(8, c021n2.available_for_incentive) + protoAdapter2.encodedSizeWithTag(9, c021n2.unavailable_incentive_hint) + protoAdapter.encodedSizeWithTag(10, c021n2.address_default_selection) + protoAdapter2.encodedSizeWithTag(11, c021n2.title) + C612902aF.ADAPTER.encodedSizeWithTag(12, c021n2.starling_texts);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(13, c021n2.address_invalid_type) + C629902cz.ADAPTER.encodedSizeWithTag(14, c021n2.shipping_address_switch) + protoAdapter3.encodedSizeWithTag(15, c021n2.hint_message_style) + this.LIZ.encodedSizeWithTag(16, c021n2.da_info) + protoAdapter.encodedSizeWithTag(17, c021n2.is_selected) + protoAdapter2.encodedSizeWithTag(18, c021n2.sub_title) + protoAdapter.encodedSizeWithTag(19, c021n2.enable_edit) + protoAdapter2.encodedSizeWithTag(20, c021n2.jump_schema);
            ProtoAdapter<C551502Cz> protoAdapter4 = C551502Cz.ADAPTER;
            int iEncodedSizeWithTag5 = iEncodedSizeWithTag4 + protoAdapter4.encodedSizeWithTag(21, c021n2.hint_invalid_dynamic_message);
            ProtoAdapter<C557202Fe> protoAdapter5 = C557202Fe.ADAPTER;
            return iEncodedSizeWithTag5 + protoAdapter5.asRepeated().encodedSizeWithTag(22, c021n2.benefit_items) + protoAdapter5.encodedSizeWithTag(23, c021n2.shipping_price_benefit_item) + protoAdapter3.encodedSizeWithTag(24, c021n2.address_module_style_version) + protoAdapter4.encodedSizeWithTag(25, c021n2.pudo_hint_invalid_dynamic_message) + C5431029t.ADAPTER.encodedSizeWithTag(26, c021n2.invalid_hint_message_rich_text) + c021n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C021N c021n) {
        }
    };
    public Boolean address_default_selection;
    public Integer address_invalid_type;
    public Integer address_module_style_version;
    public Boolean address_reachable;
    public Boolean address_valid;
    public Boolean available_for_change;
    public Boolean available_for_incentive;
    public List<C557202Fe> benefit_items;
    public Map<String, String> da_info;
    public Boolean enable_edit;
    public C551502Cz hint_invalid_dynamic_message;
    public Integer hint_message_style;
    public String invalid_hint_message;
    public C5431029t invalid_hint_message_rich_text;
    public Boolean is_selected;
    public String jump_schema;
    public C551502Cz pudo_hint_invalid_dynamic_message;
    public C023N shipping_address;
    public C629902cz shipping_address_switch;
    public C557202Fe shipping_price_benefit_item;
    public List<C557102Fd> sku_reachables;
    public C612902aF starling_texts;
    public String sub_title;
    public String title;
    public String unavailable_change_hint;
    public String unavailable_incentive_hint;

    @Override // com.squareup.wire.Message
    public C02PV newBuilder() {
        return null;
    }

    public C021N() {
        super(ADAPTER, ByteString.EMPTY);
        this.sku_reachables = C1516540pZE.LJIIIIZZ();
        this.da_info = new LinkedHashMap();
        this.benefit_items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
