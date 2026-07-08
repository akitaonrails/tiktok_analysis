package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.022G, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022G extends Message<C022G, C02Q2> {
    public static final ProtoAdapter<C022G> ADAPTER = new ProtoAdapter<C022G>() { // from class: X.021b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022G decode(ProtoReader protoReader) {
            C022G c022g = new C022G();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c022g.seller = AnonymousClass0210.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c022g.shop_bill = C02OY.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c022g.banner_promotion_activity = C737102uH.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c022g.shop_promotion_cache_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c022g.main_order_infos.add(C5204021a.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c022g.voucher_selected_info.add(AnonymousClass0248.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c022g.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c022g.product_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c022g.phone_credit = C02OX.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c022g.coupon_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c022g.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c022g.subtitle = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c022g.seller_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c022g.item_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c022g.expand_all_items_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c022g.starling_texts = C02D7.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c022g.seller_info_clickable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c022g.shop_tab_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022g;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022G c022g) {
            C022G c022g2 = c022g;
            int iEncodedSizeWithTag = AnonymousClass0210.ADAPTER.encodedSizeWithTag(1, c022g2.seller) + C02OY.ADAPTER.encodedSizeWithTag(2, c022g2.shop_bill) + C737102uH.ADAPTER.encodedSizeWithTag(3, c022g2.banner_promotion_activity);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c022g2.shop_promotion_cache_key) + C5204021a.ADAPTER.asRepeated().encodedSizeWithTag(5, c022g2.main_order_infos) + AnonymousClass0248.ADAPTER.asRepeated().encodedSizeWithTag(6, c022g2.voucher_selected_info) + protoAdapter.encodedSizeWithTag(7, c022g2.seller_id) + ProtoAdapter.INT32.encodedSizeWithTag(8, c022g2.product_type) + C02OX.ADAPTER.encodedSizeWithTag(9, c022g2.phone_credit) + protoAdapter.encodedSizeWithTag(10, c022g2.coupon_schema) + protoAdapter.encodedSizeWithTag(11, c022g2.title) + protoAdapter.encodedSizeWithTag(12, c022g2.subtitle) + protoAdapter.encodedSizeWithTag(13, c022g2.seller_text) + protoAdapter.encodedSizeWithTag(14, c022g2.item_text) + protoAdapter.encodedSizeWithTag(15, c022g2.expand_all_items_text) + C02D7.ADAPTER.encodedSizeWithTag(16, c022g2.starling_texts) + ProtoAdapter.BOOL.encodedSizeWithTag(17, c022g2.seller_info_clickable) + protoAdapter.encodedSizeWithTag(18, c022g2.shop_tab_schema) + c022g2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C022G c022g) {
        }
    };
    public C737102uH banner_promotion_activity;
    public String coupon_schema;
    public String expand_all_items_text;
    public String item_text;
    public List<C5204021a> main_order_infos;
    public C02OX phone_credit;
    public Integer product_type;
    public AnonymousClass0210 seller;
    public String seller_id;
    public Boolean seller_info_clickable;
    public String seller_text;
    public C02OY shop_bill;
    public String shop_promotion_cache_key;
    public String shop_tab_schema;
    public C02D7 starling_texts;
    public String subtitle;
    public String title;
    public List<AnonymousClass0248> voucher_selected_info;

    public C022G() {
        super(ADAPTER, ByteString.EMPTY);
        this.main_order_infos = C1516540pZE.LJIIIIZZ();
        this.voucher_selected_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02Q2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
