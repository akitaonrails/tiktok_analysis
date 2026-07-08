package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FE extends Message<C02FE, C580502Od> {
    public static final ProtoAdapter<C02FE> ADAPTER = new ProtoAdapter<C02FE>() { // from class: X.028w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FE decode(ProtoReader protoReader) {
            C02FE c02fe = new C02FE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02fe.sponsor = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c02fe.reduction_type = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c02fe.amount = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fe.currency = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02fe.promotion_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fe;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FE c02fe) {
            C02FE c02fe2 = c02fe;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02fe2.promotion_id) + protoAdapter.encodedSizeWithTag(2, c02fe2.currency) + protoAdapter.encodedSizeWithTag(3, c02fe2.amount);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02fe2.reduction_type) + protoAdapter2.encodedSizeWithTag(5, c02fe2.sponsor) + c02fe2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FE c02fe) {
        }
    };
    public String amount;
    public String currency;
    public String promotion_id;
    public Integer reduction_type;
    public Integer sponsor;

    public C02FE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C580502Od newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
