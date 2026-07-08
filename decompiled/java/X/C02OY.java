package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02OY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02OY extends Message<C02OY, C585002Pw> {
    public static final ProtoAdapter<C02OY> ADAPTER = new ProtoAdapter<C02OY>() { // from class: X.02OZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02OY decode(ProtoReader protoReader) {
            C02OY c02oy = new C02OY();
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
                                        c02oy.discount = C02FG.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c02oy.sales_tax = C652802gg.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02oy.total_discount = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02oy.total = C02FG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02oy.product_total = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02oy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02OY c02oy) {
            C02OY c02oy2 = c02oy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02oy2.product_total);
            ProtoAdapter<C02FG> protoAdapter2 = C02FG.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02oy2.total) + protoAdapter.encodedSizeWithTag(3, c02oy2.total_discount) + C652802gg.ADAPTER.encodedSizeWithTag(4, c02oy2.sales_tax) + protoAdapter2.encodedSizeWithTag(5, c02oy2.discount) + c02oy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02OY c02oy) {
        }
    };
    public C02FG discount;
    public String product_total;
    public C652802gg sales_tax;
    public C02FG total;
    public String total_discount;

    public C02OY() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C585002Pw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
