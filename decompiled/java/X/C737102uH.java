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

/* JADX INFO: renamed from: X.02uH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C737102uH extends Message<C737102uH, C737202uI> {
    public static final ProtoAdapter<C737102uH> ADAPTER = new ProtoAdapter<C737102uH>() { // from class: X.02uG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C737102uH decode(ProtoReader protoReader) {
            C737102uH c737102uH = new C737102uH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                c737102uH.desc = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c737102uH.left_icon = C02U1.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c737102uH.bg_img = C02U1.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c737102uH.schema = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c737102uH.seller_gifts.add(C737402uK.ADAPTER.decode(protoReader));
                                break;
                            case 6:
                                c737102uH.master_item_ids.add(ProtoAdapter.STRING.decode(protoReader));
                                break;
                            case 7:
                                c737102uH.type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                c737102uH.dark_icon = C02U1.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c737102uH.log_extra = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c737102uH.text_color = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c737102uH.position_type = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c737102uH.gift_discount_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c737102uH.discount_main_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                c737102uH.discount_sub_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 15:
                                c737102uH.discount_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 16:
                                c737102uH.discount_img = C02U1.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c737102uH.can_upsell = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                c737102uH.gift_detail_schema = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c737102uH.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c737102uH;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C737102uH c737102uH) {
            C737102uH c737102uH2 = c737102uH;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c737102uH2.desc);
            ProtoAdapter<C02U1> protoAdapter2 = C02U1.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c737102uH2.left_icon) + protoAdapter2.encodedSizeWithTag(3, c737102uH2.bg_img) + protoAdapter.encodedSizeWithTag(4, c737102uH2.schema) + C737402uK.ADAPTER.asRepeated().encodedSizeWithTag(5, c737102uH2.seller_gifts) + protoAdapter.asRepeated().encodedSizeWithTag(6, c737102uH2.master_item_ids) + ProtoAdapter.INT32.encodedSizeWithTag(7, c737102uH2.type) + protoAdapter2.encodedSizeWithTag(8, c737102uH2.dark_icon) + protoAdapter.encodedSizeWithTag(9, c737102uH2.log_extra);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(10, c737102uH2.text_color) + protoAdapter3.encodedSizeWithTag(11, c737102uH2.position_type) + protoAdapter.encodedSizeWithTag(12, c737102uH2.gift_discount_text) + protoAdapter.encodedSizeWithTag(13, c737102uH2.discount_main_title) + protoAdapter.encodedSizeWithTag(14, c737102uH2.discount_sub_title) + protoAdapter.encodedSizeWithTag(15, c737102uH2.discount_text) + protoAdapter2.encodedSizeWithTag(16, c737102uH2.discount_img) + ProtoAdapter.BOOL.encodedSizeWithTag(17, c737102uH2.can_upsell) + protoAdapter.encodedSizeWithTag(18, c737102uH2.gift_detail_schema) + protoAdapter.encodedSizeWithTag(255, c737102uH2.da_info) + c737102uH2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C737102uH c737102uH) {
        }
    };
    public C02U1 bg_img;
    public Boolean can_upsell;
    public String da_info;
    public C02U1 dark_icon;
    public String desc;
    public C02U1 discount_img;
    public String discount_main_title;
    public String discount_sub_title;
    public String discount_text;
    public String gift_detail_schema;
    public String gift_discount_text;
    public C02U1 left_icon;
    public String log_extra;
    public List<String> master_item_ids;
    public Long position_type;
    public String schema;
    public List<C737402uK> seller_gifts;
    public Long text_color;
    public Integer type;

    public C737102uH() {
        super(ADAPTER, ByteString.EMPTY);
        this.seller_gifts = C1516540pZE.LJIIIIZZ();
        this.master_item_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C737202uI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
