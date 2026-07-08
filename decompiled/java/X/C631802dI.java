package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C631802dI extends Message<C631802dI, C631902dJ> {
    public static final ProtoAdapter<C631802dI> ADAPTER = new ProtoAdapter<C631802dI>() { // from class: X.02dH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C631802dI decode(ProtoReader protoReader) {
            C631802dI c631802dI = new C631802dI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c631802dI.payment_method_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c631802dI.currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c631802dI.tenure = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c631802dI.promotion_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c631802dI.is_not_meet_promotion_threshold = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c631802dI.reduction_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c631802dI.percentage_rate = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c631802dI.promotion_desc_temp = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c631802dI;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C631802dI c631802dI) {
            C631802dI c631802dI2 = c631802dI;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c631802dI2.payment_method_id) + protoAdapter.encodedSizeWithTag(2, c631802dI2.currency) + protoAdapter.encodedSizeWithTag(3, c631802dI2.tenure) + protoAdapter.encodedSizeWithTag(4, c631802dI2.promotion_id) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c631802dI2.is_not_meet_promotion_threshold) + ProtoAdapter.INT32.encodedSizeWithTag(6, c631802dI2.reduction_type) + protoAdapter.encodedSizeWithTag(7, c631802dI2.percentage_rate) + protoAdapter.encodedSizeWithTag(8, c631802dI2.promotion_desc_temp) + c631802dI2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C631802dI c631802dI) {
        }
    };
    public String currency;
    public Boolean is_not_meet_promotion_threshold;
    public String payment_method_id;
    public String percentage_rate;
    public String promotion_desc_temp;
    public String promotion_id;
    public Integer reduction_type;
    public String tenure;

    public C631802dI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C631902dJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
