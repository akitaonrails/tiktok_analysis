package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BN extends Message<C02BN, C581202Ok> {
    public static final ProtoAdapter<C02BN> ADAPTER = new ProtoAdapter<C02BN>() { // from class: X.027J
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BN decode(ProtoReader protoReader) {
            C02BN c02bn = new C02BN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bn.marketing_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02bn.marketing_batch_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02bn.reduction_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02bn.marketing_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02bn.marketing_currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02bn.marketing_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02bn.country_or_region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02bn.marketing_batch_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02bn.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02bn.marketing_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c02bn.text_selected = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BN c02bn) {
            C02BN c02bn2 = c02bn;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02bn2.marketing_id) + protoAdapter.encodedSizeWithTag(2, c02bn2.marketing_batch_id) + protoAdapter.encodedSizeWithTag(3, c02bn2.reduction_type) + protoAdapter.encodedSizeWithTag(4, c02bn2.marketing_name) + protoAdapter.encodedSizeWithTag(5, c02bn2.marketing_currency) + protoAdapter.encodedSizeWithTag(6, c02bn2.marketing_amount) + protoAdapter.encodedSizeWithTag(7, c02bn2.country_or_region) + protoAdapter.encodedSizeWithTag(8, c02bn2.marketing_batch_type) + protoAdapter.encodedSizeWithTag(9, c02bn2.text) + protoAdapter.encodedSizeWithTag(10, c02bn2.marketing_link) + protoAdapter.encodedSizeWithTag(11, c02bn2.text_selected) + c02bn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02BN c02bn) {
        }
    };
    public String country_or_region;
    public String marketing_amount;
    public String marketing_batch_id;
    public String marketing_batch_type;
    public String marketing_currency;
    public String marketing_id;
    public String marketing_link;
    public String marketing_name;
    public String reduction_type;
    public String text;
    public String text_selected;

    public C02BN() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C581202Ok newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
