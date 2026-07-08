package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.022w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5252022w extends Message<C5252022w, C02QN> {
    public static final ProtoAdapter<C5252022w> ADAPTER = new ProtoAdapter<C5252022w>() { // from class: X.022H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5252022w decode(ProtoReader protoReader) {
            C5252022w c5252022w = new C5252022w();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5252022w.address_setting = C681302lH.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c5252022w.main_order_setting = C02A5.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5252022w.retain_popup_setting = C724602sG.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5252022w.should_modify_policy_link = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c5252022w.button_area_setting = C624502c7.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5252022w.page_biz_list.add(C02FJ.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c5252022w.client_template = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c5252022w.order_summary_setting = C681602lK.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5252022w.page_header_setting = C681902lN.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5252022w.right_setting = C630202d2.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5252022w.poll_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5252022w.total_price_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5252022w.bonus_cell_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5252022w;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5252022w c5252022w) {
            C5252022w c5252022w2 = c5252022w;
            int iEncodedSizeWithTag = C681302lH.ADAPTER.encodedSizeWithTag(1, c5252022w2.address_setting) + C02A5.ADAPTER.encodedSizeWithTag(2, c5252022w2.main_order_setting) + C724602sG.ADAPTER.encodedSizeWithTag(3, c5252022w2.retain_popup_setting) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c5252022w2.should_modify_policy_link) + C624502c7.ADAPTER.encodedSizeWithTag(5, c5252022w2.button_area_setting) + C02FJ.ADAPTER.asRepeated().encodedSizeWithTag(6, c5252022w2.page_biz_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(7, c5252022w2.client_template) + C681602lK.ADAPTER.encodedSizeWithTag(8, c5252022w2.order_summary_setting) + C681902lN.ADAPTER.encodedSizeWithTag(9, c5252022w2.page_header_setting) + C630202d2.ADAPTER.encodedSizeWithTag(10, c5252022w2.right_setting) + protoAdapter.encodedSizeWithTag(11, c5252022w2.poll_type) + protoAdapter.encodedSizeWithTag(12, c5252022w2.total_price_style) + protoAdapter.encodedSizeWithTag(13, c5252022w2.bonus_cell_style) + c5252022w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5252022w c5252022w) {
        }
    };
    public C681302lH address_setting;
    public Integer bonus_cell_style;
    public C624502c7 button_area_setting;
    public Integer client_template;
    public C02A5 main_order_setting;
    public C681602lK order_summary_setting;
    public List<C02FJ> page_biz_list;
    public C681902lN page_header_setting;
    public Integer poll_type;
    public C724602sG retain_popup_setting;
    public C630202d2 right_setting;
    public Boolean should_modify_policy_link;
    public Integer total_price_style;

    public C5252022w() {
        super(ADAPTER, ByteString.EMPTY);
        this.page_biz_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02QN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
