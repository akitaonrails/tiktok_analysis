package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02iE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C662402iE extends Message<C662402iE, C662502iF> {
    public static final ProtoAdapter<C662402iE> ADAPTER = new ProtoAdapter<C662402iE>() { // from class: X.02iD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C662402iE decode(ProtoReader protoReader) {
            C662402iE c662402iE = new C662402iE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c662402iE.total_price_str = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c662402iE.insert_before_item_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c662402iE.installment_interest_fee_item = C652802gg.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c662402iE.tenure = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c662402iE;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C662402iE c662402iE) {
            C662402iE c662402iE2 = c662402iE;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c662402iE2.tenure) + C652802gg.ADAPTER.encodedSizeWithTag(2, c662402iE2.installment_interest_fee_item) + ProtoAdapter.INT32.encodedSizeWithTag(3, c662402iE2.insert_before_item_type) + protoAdapter.encodedSizeWithTag(4, c662402iE2.total_price_str) + c662402iE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C662402iE c662402iE) {
        }
    };
    public Integer insert_before_item_type;
    public C652802gg installment_interest_fee_item;
    public String tenure;
    public String total_price_str;

    public C662402iE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C662502iF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
