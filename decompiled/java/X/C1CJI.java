package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJI extends Message<C1CJI, C1CJJ> {
    public static final ProtoAdapter<C1CJI> ADAPTER = new ProtoAdapter<C1CJI>() { // from class: X.1CJH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJI decode(ProtoReader protoReader) {
            C1CJI c1cji = new C1CJI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cji.management_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1cji.token_notification_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1cji.payment_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1cji.billing_agreement = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1cji.amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1cji.deferred_date = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1cji.deferred_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1cji.apple_pay_params = C1CJF.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cji;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJI c1cji) {
            C1CJI c1cji2 = c1cji;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cji2.management_url) + protoAdapter.encodedSizeWithTag(2, c1cji2.token_notification_url) + protoAdapter.encodedSizeWithTag(3, c1cji2.payment_description) + protoAdapter.encodedSizeWithTag(4, c1cji2.billing_agreement) + protoAdapter.encodedSizeWithTag(5, c1cji2.amount) + ProtoAdapter.INT64.encodedSizeWithTag(6, c1cji2.deferred_date) + protoAdapter.encodedSizeWithTag(7, c1cji2.deferred_description) + C1CJF.ADAPTER.encodedSizeWithTag(8, c1cji2.apple_pay_params) + c1cji2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CJI c1cji) {
        }
    };
    public String amount;
    public C1CJF apple_pay_params;
    public String billing_agreement;
    public Long deferred_date;
    public String deferred_description;
    public String management_url;
    public String payment_description;
    public String token_notification_url;

    public C1CJI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CJJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
