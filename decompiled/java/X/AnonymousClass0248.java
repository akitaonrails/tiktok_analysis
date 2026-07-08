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

/* JADX INFO: renamed from: X.0248, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0248 extends Message<AnonymousClass0248, C02Q8> {
    public static final ProtoAdapter<AnonymousClass0248> ADAPTER = new ProtoAdapter<AnonymousClass0248>() { // from class: X.022N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0248 decode(ProtoReader protoReader) {
            AnonymousClass0248 anonymousClass0248 = new AnonymousClass0248();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                anonymousClass0248.voucher_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                anonymousClass0248.voucher_type_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                anonymousClass0248.selected = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                anonymousClass0248.promotion_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                anonymousClass0248.voucher_business_type = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                anonymousClass0248.discount_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                anonymousClass0248.cost_role = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                anonymousClass0248.cost_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                anonymousClass0248.threshold_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                anonymousClass0248.valid_time_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                anonymousClass0248.button_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                anonymousClass0248.promotion_reduction_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                anonymousClass0248.claim_user_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 14:
                                anonymousClass0248.discount_level = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 15:
                                anonymousClass0248.instance_info_list.add(C695702nb.ADAPTER.decode(protoReader));
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        anonymousClass0248.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0248;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0248 anonymousClass0248) {
            AnonymousClass0248 anonymousClass02482 = anonymousClass0248;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02482.voucher_id) + protoAdapter.encodedSizeWithTag(2, anonymousClass02482.voucher_type_id) + ProtoAdapter.BOOL.encodedSizeWithTag(3, anonymousClass02482.selected) + protoAdapter.encodedSizeWithTag(4, anonymousClass02482.promotion_id) + protoAdapter.encodedSizeWithTag(5, anonymousClass02482.voucher_business_type) + protoAdapter.encodedSizeWithTag(6, anonymousClass02482.discount_text);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, anonymousClass02482.cost_role) + protoAdapter2.encodedSizeWithTag(8, anonymousClass02482.cost_type) + protoAdapter.encodedSizeWithTag(9, anonymousClass02482.threshold_text) + protoAdapter.encodedSizeWithTag(10, anonymousClass02482.valid_time_text) + protoAdapter.encodedSizeWithTag(11, anonymousClass02482.button_text) + protoAdapter2.encodedSizeWithTag(12, anonymousClass02482.promotion_reduction_type) + protoAdapter2.encodedSizeWithTag(13, anonymousClass02482.claim_user_type) + protoAdapter2.encodedSizeWithTag(14, anonymousClass02482.discount_level) + C695702nb.ADAPTER.asRepeated().encodedSizeWithTag(15, anonymousClass02482.instance_info_list) + protoAdapter.encodedSizeWithTag(200, anonymousClass02482.da_info) + anonymousClass02482.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0248 anonymousClass0248) {
        }
    };
    public String button_text;
    public Integer claim_user_type;
    public Integer cost_role;
    public Integer cost_type;
    public String da_info;
    public Integer discount_level;
    public String discount_text;
    public List<C695702nb> instance_info_list;
    public String promotion_id;
    public Integer promotion_reduction_type;
    public Boolean selected;
    public String threshold_text;
    public String valid_time_text;
    public String voucher_business_type;
    public String voucher_id;
    public String voucher_type_id;

    public AnonymousClass0248() {
        super(ADAPTER, ByteString.EMPTY);
        this.instance_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02Q8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
