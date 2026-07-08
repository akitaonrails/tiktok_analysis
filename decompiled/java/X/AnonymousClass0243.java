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

/* JADX INFO: renamed from: X.0243, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0243 extends Message<AnonymousClass0243, C02L6> {
    public static final ProtoAdapter<AnonymousClass0243> ADAPTER = new ProtoAdapter<AnonymousClass0243>() { // from class: X.022X
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0243 decode(ProtoReader protoReader) {
            AnonymousClass0243 anonymousClass0243 = new AnonymousClass0243();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0243.vtag_enable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0243.long_press_entrance_enable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0243.fallback_vtag_enable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0243.visual_search_intent_level = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0243.screenshot_entrance_enable = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0243.vtag_enable_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0243.fallback_vtag_enable_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0243.long_press_entrance_enable_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0243.disable_ecom_content_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0243.api_control_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0243.fallback_vtag_info = C617402ay.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0243.vtag_info.add(C5336026c.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0243.ecom_nocart_entrance_enable_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            anonymousClass0243.intent = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            anonymousClass0243.author_visual_search_enable = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0243;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0243 anonymousClass0243) {
            AnonymousClass0243 anonymousClass02432 = anonymousClass0243;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02432.vtag_enable) + protoAdapter.encodedSizeWithTag(2, anonymousClass02432.long_press_entrance_enable) + protoAdapter.encodedSizeWithTag(3, anonymousClass02432.fallback_vtag_enable);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, anonymousClass02432.visual_search_intent_level) + protoAdapter2.encodedSizeWithTag(5, anonymousClass02432.screenshot_entrance_enable) + protoAdapter2.encodedSizeWithTag(6, anonymousClass02432.vtag_enable_type) + protoAdapter2.encodedSizeWithTag(7, anonymousClass02432.fallback_vtag_enable_type) + protoAdapter2.encodedSizeWithTag(8, anonymousClass02432.long_press_entrance_enable_type) + protoAdapter2.encodedSizeWithTag(9, anonymousClass02432.disable_ecom_content_type) + ProtoAdapter.STRING.encodedSizeWithTag(10, anonymousClass02432.api_control_info) + C617402ay.ADAPTER.encodedSizeWithTag(11, anonymousClass02432.fallback_vtag_info) + C5336026c.ADAPTER.asRepeated().encodedSizeWithTag(12, anonymousClass02432.vtag_info) + protoAdapter2.encodedSizeWithTag(13, anonymousClass02432.ecom_nocart_entrance_enable_type) + protoAdapter2.encodedSizeWithTag(14, anonymousClass02432.intent) + protoAdapter2.encodedSizeWithTag(15, anonymousClass02432.author_visual_search_enable) + anonymousClass02432.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0243 anonymousClass0243) {
            AnonymousClass0243 anonymousClass02432 = anonymousClass0243;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, anonymousClass02432.vtag_enable);
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02432.long_press_entrance_enable);
            protoAdapter.encodeWithTag(protoWriter, 3, anonymousClass02432.fallback_vtag_enable);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, anonymousClass02432.visual_search_intent_level);
            protoAdapter2.encodeWithTag(protoWriter, 5, anonymousClass02432.screenshot_entrance_enable);
            protoAdapter2.encodeWithTag(protoWriter, 6, anonymousClass02432.vtag_enable_type);
            protoAdapter2.encodeWithTag(protoWriter, 7, anonymousClass02432.fallback_vtag_enable_type);
            protoAdapter2.encodeWithTag(protoWriter, 8, anonymousClass02432.long_press_entrance_enable_type);
            protoAdapter2.encodeWithTag(protoWriter, 9, anonymousClass02432.disable_ecom_content_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, anonymousClass02432.api_control_info);
            C617402ay.ADAPTER.encodeWithTag(protoWriter, 11, anonymousClass02432.fallback_vtag_info);
            C5336026c.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, anonymousClass02432.vtag_info);
            protoAdapter2.encodeWithTag(protoWriter, 13, anonymousClass02432.ecom_nocart_entrance_enable_type);
            protoAdapter2.encodeWithTag(protoWriter, 14, anonymousClass02432.intent);
            protoAdapter2.encodeWithTag(protoWriter, 15, anonymousClass02432.author_visual_search_enable);
            protoWriter.writeBytes(anonymousClass02432.unknownFields());
        }
    };
    public String api_control_info;
    public Integer author_visual_search_enable;
    public Integer disable_ecom_content_type;
    public Integer ecom_nocart_entrance_enable_type;
    public Boolean fallback_vtag_enable;
    public Integer fallback_vtag_enable_type;
    public C617402ay fallback_vtag_info;
    public Integer intent;
    public Boolean long_press_entrance_enable;
    public Integer long_press_entrance_enable_type;
    public Integer screenshot_entrance_enable;
    public Integer visual_search_intent_level;
    public Boolean vtag_enable;
    public Integer vtag_enable_type;
    public List<C5336026c> vtag_info;

    public AnonymousClass0243() {
        super(ADAPTER, ByteString.EMPTY);
        this.vtag_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02L6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
