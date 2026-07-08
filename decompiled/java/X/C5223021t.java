package X;

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

/* JADX INFO: renamed from: X.021t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5223021t extends Message<C5223021t, C02P7> {
    public static final ProtoAdapter<C5223021t> ADAPTER = new ProtoAdapter<C5223021t>() { // from class: X.021X
        public final ProtoAdapter<Map<String, C5308025a>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C5308025a.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5223021t decode(ProtoReader protoReader) {
            C5223021t c5223021t = new C5223021t();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c5223021t.disable = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 2:
                                c5223021t.disable_toast = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c5223021t.benefit_emphasis_style = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                c5223021t.subtext_area = C02DP.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c5223021t.tooltips = C02CL.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c5223021t.button_style = C644702fN.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c5223021t.button_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                c5223021t.hide_total_price = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c5223021t.place_order_button_by_scene.putAll(this.LIZ.decode(protoReader));
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c5223021t.button_text_list.add(C561602Gw.ADAPTER.decode(protoReader));
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c5223021t.final_reason = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c5223021t.reasons.add(ProtoAdapter.INT32.decode(protoReader));
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c5223021t.hide_price_sub_text_savings = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 14:
                                c5223021t.payment_place_order_button = C02BY.ADAPTER.decode(protoReader);
                                break;
                            case 15:
                                c5223021t.intercept_toast = C023J.ADAPTER.decode(protoReader);
                                break;
                            case 16:
                                c5223021t.click_action = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c5223021t.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5223021t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5223021t c5223021t) {
            C5223021t c5223021t2 = c5223021t;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5223021t2.disable);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5223021t2.disable_toast);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, c5223021t2.benefit_emphasis_style) + C02DP.ADAPTER.encodedSizeWithTag(4, c5223021t2.subtext_area) + C02CL.ADAPTER.encodedSizeWithTag(5, c5223021t2.tooltips) + C644702fN.ADAPTER.encodedSizeWithTag(6, c5223021t2.button_style) + protoAdapter2.encodedSizeWithTag(7, c5223021t2.button_text) + protoAdapter.encodedSizeWithTag(8, c5223021t2.hide_total_price) + this.LIZ.encodedSizeWithTag(9, c5223021t2.place_order_button_by_scene) + C561602Gw.ADAPTER.asRepeated().encodedSizeWithTag(10, c5223021t2.button_text_list) + protoAdapter3.encodedSizeWithTag(11, c5223021t2.final_reason) + protoAdapter3.asRepeated().encodedSizeWithTag(12, c5223021t2.reasons) + protoAdapter.encodedSizeWithTag(13, c5223021t2.hide_price_sub_text_savings) + C02BY.ADAPTER.encodedSizeWithTag(14, c5223021t2.payment_place_order_button) + C023J.ADAPTER.encodedSizeWithTag(15, c5223021t2.intercept_toast) + protoAdapter3.encodedSizeWithTag(16, c5223021t2.click_action) + protoAdapter2.encodedSizeWithTag(200, c5223021t2.da_info) + c5223021t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5223021t c5223021t) {
        }
    };
    public Integer benefit_emphasis_style;
    public C644702fN button_style;
    public String button_text;
    public List<C561602Gw> button_text_list;
    public Integer click_action;
    public String da_info;
    public Boolean disable;
    public String disable_toast;
    public Integer final_reason;
    public Boolean hide_price_sub_text_savings;
    public Boolean hide_total_price;
    public C023J intercept_toast;
    public C02BY payment_place_order_button;
    public Map<String, C5308025a> place_order_button_by_scene;
    public List<Integer> reasons;
    public C02DP subtext_area;
    public C02CL tooltips;

    @Override // com.squareup.wire.Message
    public C02P7 newBuilder() {
        return null;
    }

    public C5223021t() {
        super(ADAPTER, ByteString.EMPTY);
        this.place_order_button_by_scene = new LinkedHashMap();
        this.button_text_list = C1516540pZE.LJIIIIZZ();
        this.reasons = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
