package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DC1, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DC1 extends Message<C1DC1, C693902nJ> {
    public static final ProtoAdapter<C1DC1> ADAPTER = new ProtoAdapter<C1DC1>() { // from class: X.1DC0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DC1 decode(ProtoReader protoReader) {
            C1DC1 c1dc1 = new C1DC1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dc1.payment_unit_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1dc1.payment_price_version_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1dc1.payment_method_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1dc1.payment_method_token = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1dc1.installment_plan_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1dc1.installment_option_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1dc1.tenure = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c1dc1.tenure_cycle = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1dc1.extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1dc1.destination = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1dc1.button_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1dc1.button_subtext = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c1dc1.button_subtext_str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c1dc1.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dc1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DC1 c1dc1) {
            C1DC1 c1dc12 = c1dc1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1dc12.payment_unit_id) + protoAdapter.encodedSizeWithTag(2, c1dc12.payment_price_version_id) + protoAdapter.encodedSizeWithTag(3, c1dc12.payment_method_code) + protoAdapter.encodedSizeWithTag(4, c1dc12.payment_method_token) + protoAdapter.encodedSizeWithTag(5, c1dc12.installment_plan_id) + protoAdapter.encodedSizeWithTag(6, c1dc12.installment_option_id) + ProtoAdapter.INT64.encodedSizeWithTag(7, c1dc12.tenure) + protoAdapter.encodedSizeWithTag(8, c1dc12.tenure_cycle) + protoAdapter.encodedSizeWithTag(9, c1dc12.extra_info) + ProtoAdapter.INT32.encodedSizeWithTag(10, c1dc12.destination);
            ProtoAdapter<C5431029t> protoAdapter2 = C5431029t.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(11, c1dc12.button_text) + protoAdapter2.encodedSizeWithTag(12, c1dc12.button_subtext) + protoAdapter.encodedSizeWithTag(13, c1dc12.button_subtext_str) + protoAdapter.encodedSizeWithTag(14, c1dc12.da_info) + c1dc12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1DC1 c1dc1) {
        }
    };
    public C5431029t button_subtext;
    public String button_subtext_str;
    public C5431029t button_text;
    public String da_info;
    public Integer destination;
    public String extra_info;
    public String installment_option_id;
    public String installment_plan_id;
    public String payment_method_code;
    public String payment_method_token;
    public String payment_price_version_id;
    public String payment_unit_id;
    public Long tenure;
    public String tenure_cycle;

    public C1DC1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C693902nJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
