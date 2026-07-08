package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0281, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0281 extends Message<AnonymousClass0281, C02NR> {
    public static final ProtoAdapter<AnonymousClass0281> ADAPTER = new ProtoAdapter<AnonymousClass0281>() { // from class: X.024Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0281 decode(ProtoReader protoReader) {
            AnonymousClass0281 anonymousClass0281 = new AnonymousClass0281();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0281.payment_method_code = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0281.bill_summary = C02YH.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0281.combination_payment_methods_codes.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            anonymousClass0281.payment_bill_summary_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0281.installment_plan = AnonymousClass0215.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0281.payment_unit_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0281.payment_price_version_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0281;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0281 anonymousClass0281) {
            AnonymousClass0281 anonymousClass02812 = anonymousClass0281;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, anonymousClass02812.payment_method_code) + C02YH.ADAPTER.encodedSizeWithTag(2, anonymousClass02812.bill_summary) + protoAdapter.asRepeated().encodedSizeWithTag(3, anonymousClass02812.combination_payment_methods_codes) + ProtoAdapter.INT32.encodedSizeWithTag(4, anonymousClass02812.payment_bill_summary_type) + AnonymousClass0215.ADAPTER.encodedSizeWithTag(5, anonymousClass02812.installment_plan) + protoAdapter.encodedSizeWithTag(7, anonymousClass02812.payment_unit_id) + protoAdapter.encodedSizeWithTag(8, anonymousClass02812.payment_price_version_id) + anonymousClass02812.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0281 anonymousClass0281) {
        }
    };
    public C02YH bill_summary;
    public List<String> combination_payment_methods_codes;
    public AnonymousClass0215 installment_plan;
    public Integer payment_bill_summary_type;
    public String payment_method_code;
    public String payment_price_version_id;
    public String payment_unit_id;

    public AnonymousClass0281() {
        super(ADAPTER, ByteString.EMPTY);
        this.combination_payment_methods_codes = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02NR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
