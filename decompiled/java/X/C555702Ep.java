package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ep, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C555702Ep extends Message<C555702Ep, C02P9> {
    public static final ProtoAdapter<C555702Ep> ADAPTER = new ProtoAdapter<C555702Ep>() { // from class: X.028r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C555702Ep decode(ProtoReader protoReader) {
            C555702Ep c555702Ep = new C555702Ep();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c555702Ep.deposit_fee_desc = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c555702Ep.min_price = C022O.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c555702Ep.price_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c555702Ep;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C555702Ep c555702Ep) {
            C555702Ep c555702Ep2 = c555702Ep;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c555702Ep2.price_type) + C022O.ADAPTER.encodedSizeWithTag(2, c555702Ep2.min_price) + ProtoAdapter.STRING.encodedSizeWithTag(3, c555702Ep2.deposit_fee_desc) + c555702Ep2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C555702Ep c555702Ep) {
        }
    };
    public String deposit_fee_desc;
    public C022O min_price;
    public Integer price_type;

    public C555702Ep() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02P9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
