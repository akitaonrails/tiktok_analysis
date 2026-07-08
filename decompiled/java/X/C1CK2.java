package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CK2, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CK2 extends Message<C1CK2, C1CK3> {
    public static final ProtoAdapter<C1CK2> ADAPTER = new ProtoAdapter<C1CK2>() { // from class: X.1CK1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CK2 decode(ProtoReader protoReader) {
            C1CK2 c1ck2 = new C1CK2();
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
                                        c1ck2.item_unit_price = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1ck2.item_quantity = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1ck2.item_product_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1ck2.item_product_code = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1ck2.item_product_sku = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ck2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CK2 c1ck2) {
            C1CK2 c1ck22 = c1ck2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1ck22.item_product_sku) + protoAdapter.encodedSizeWithTag(2, c1ck22.item_product_code) + protoAdapter.encodedSizeWithTag(3, c1ck22.item_product_name) + ProtoAdapter.INT64.encodedSizeWithTag(4, c1ck22.item_quantity) + protoAdapter.encodedSizeWithTag(5, c1ck22.item_unit_price) + c1ck22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CK2 c1ck2) {
        }
    };
    public String item_product_code;
    public String item_product_name;
    public String item_product_sku;
    public Long item_quantity;
    public String item_unit_price;

    public C1CK2() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CK3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
