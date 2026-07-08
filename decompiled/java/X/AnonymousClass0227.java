package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
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

/* JADX INFO: renamed from: X.0227, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0227 extends Message<AnonymousClass0227, C577302Mx> {
    public static final ProtoAdapter<AnonymousClass0227> ADAPTER = new ProtoAdapter<AnonymousClass0227>() { // from class: X.021e
        public final ProtoAdapter<Map<String, C02RJ>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C02RJ.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0227 decode(ProtoReader protoReader) {
            AnonymousClass0227 anonymousClass0227 = new AnonymousClass0227();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                anonymousClass0227.addon_promotion_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                anonymousClass0227.top_banner_desc = C712102qF.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                anonymousClass0227.addon_banner_info = C595902Ub.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                anonymousClass0227.addon_promotion_info = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                anonymousClass0227.addon_for_recommendation = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                anonymousClass0227.da_info = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                anonymousClass0227.amount_to_threshold = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                anonymousClass0227.addon_banner_infos.add(C595902Ub.ADAPTER.decode(protoReader));
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                anonymousClass0227.addon_panel_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                anonymousClass0227.content_stringify = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                anonymousClass0227.addon_panel_scene = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        anonymousClass0227.claim_voucher_type_ids.add(ProtoAdapter.STRING.decode(protoReader));
                                        break;
                                    case 21:
                                        anonymousClass0227.promotion_recommend_param = C7891036j.ADAPTER.decode(protoReader);
                                        break;
                                    case 22:
                                        anonymousClass0227.product_info_list.add(C589702Rr.ADAPTER.decode(protoReader));
                                        break;
                                    case 23:
                                        anonymousClass0227.in_addon_progress = ProtoAdapter.BOOL.decode(protoReader);
                                        break;
                                    default:
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        break;
                                }
                                break;
                        }
                    } else {
                        anonymousClass0227.bcm_standard_events.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0227;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0227 anonymousClass0227) {
            AnonymousClass0227 anonymousClass02272 = anonymousClass0227;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02272.addon_promotion_type) + C712102qF.ADAPTER.encodedSizeWithTag(2, anonymousClass02272.top_banner_desc);
            ProtoAdapter<C595902Ub> protoAdapter2 = C595902Ub.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02272.addon_banner_info);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, anonymousClass02272.addon_promotion_info) + protoAdapter3.encodedSizeWithTag(5, anonymousClass02272.addon_for_recommendation) + protoAdapter3.encodedSizeWithTag(6, anonymousClass02272.da_info) + protoAdapter3.encodedSizeWithTag(7, anonymousClass02272.amount_to_threshold) + protoAdapter2.asRepeated().encodedSizeWithTag(8, anonymousClass02272.addon_banner_infos) + protoAdapter.encodedSizeWithTag(9, anonymousClass02272.addon_panel_type) + protoAdapter3.encodedSizeWithTag(10, anonymousClass02272.content_stringify) + protoAdapter.encodedSizeWithTag(11, anonymousClass02272.addon_panel_scene) + protoAdapter3.asRepeated().encodedSizeWithTag(20, anonymousClass02272.claim_voucher_type_ids) + C7891036j.ADAPTER.encodedSizeWithTag(21, anonymousClass02272.promotion_recommend_param) + C589702Rr.ADAPTER.asRepeated().encodedSizeWithTag(22, anonymousClass02272.product_info_list) + ProtoAdapter.BOOL.encodedSizeWithTag(23, anonymousClass02272.in_addon_progress) + this.LIZ.encodedSizeWithTag(255, anonymousClass02272.bcm_standard_events) + anonymousClass02272.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0227 anonymousClass0227) {
        }
    };
    public C595902Ub addon_banner_info;
    public List<C595902Ub> addon_banner_infos;
    public String addon_for_recommendation;
    public Integer addon_panel_scene;
    public Integer addon_panel_type;
    public String addon_promotion_info;
    public Integer addon_promotion_type;
    public String amount_to_threshold;
    public Map<String, C02RJ> bcm_standard_events;
    public List<String> claim_voucher_type_ids;
    public String content_stringify;
    public String da_info;
    public Boolean in_addon_progress;
    public List<C589702Rr> product_info_list;
    public C7891036j promotion_recommend_param;
    public C712102qF top_banner_desc;

    @Override // com.squareup.wire.Message
    public C577302Mx newBuilder() {
        return null;
    }

    public AnonymousClass0227() {
        super(ADAPTER, ByteString.EMPTY);
        this.addon_banner_infos = C1516540pZE.LJIIIIZZ();
        this.claim_voucher_type_ids = C1516540pZE.LJIIIIZZ();
        this.product_info_list = C1516540pZE.LJIIIIZZ();
        this.bcm_standard_events = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
