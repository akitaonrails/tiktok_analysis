package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AZ extends Message<C02AZ, C577102Mv> {
    public static final ProtoAdapter<C02AZ> ADAPTER = new ProtoAdapter<C02AZ>() { // from class: X.0258
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AZ decode(ProtoReader protoReader) {
            C02AZ c02az = new C02AZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02az.sns_period_info = C02EA.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c02az.sns_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02az.success_phase = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c02az.agreement_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02az.phase = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02az.retry_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c02az.is_subscribed = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c02az.period_info_cache = C02EA.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02az.sns_base_extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02az;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AZ c02az) {
            C02AZ c02az2 = c02az;
            ProtoAdapter<C02EA> protoAdapter = C02EA.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02az2.sns_period_info);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02az2.sns_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, c02az2.success_phase) + protoAdapter2.encodedSizeWithTag(4, c02az2.agreement_id) + protoAdapter3.encodedSizeWithTag(5, c02az2.phase) + protoAdapter3.encodedSizeWithTag(6, c02az2.retry_count) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c02az2.is_subscribed) + protoAdapter.encodedSizeWithTag(8, c02az2.period_info_cache) + protoAdapter2.encodedSizeWithTag(10, c02az2.sns_base_extra_info) + c02az2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02AZ c02az) {
        }
    };
    public String agreement_id;
    public Boolean is_subscribed;
    public C02EA period_info_cache;
    public Integer phase;
    public Integer retry_count;
    public String sns_base_extra_info;
    public String sns_id;
    public C02EA sns_period_info;
    public Integer success_phase;

    public C02AZ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C577102Mv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
