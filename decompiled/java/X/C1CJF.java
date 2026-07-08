package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CJF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CJF extends Message<C1CJF, C1CJG> {
    public static final ProtoAdapter<C1CJF> ADAPTER = new ProtoAdapter<C1CJF>() { // from class: X.1CJE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CJF decode(ProtoReader protoReader) {
            C1CJF c1cjf = new C1CJF();
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
                                    c1cjf.price_val = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cjf.merchant_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cjf.currency = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cjf.country_code = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cjf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CJF c1cjf) {
            C1CJF c1cjf2 = c1cjf;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cjf2.country_code) + protoAdapter.encodedSizeWithTag(2, c1cjf2.currency) + protoAdapter.encodedSizeWithTag(3, c1cjf2.merchant_name) + protoAdapter.encodedSizeWithTag(4, c1cjf2.price_val) + c1cjf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CJF c1cjf) {
        }
    };
    public String country_code;
    public String currency;
    public String merchant_name;
    public String price_val;

    public C1CJF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CJG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
