package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C5Q extends Message<C1C5Q, C1C5P> {
    public static final ProtoAdapter<C1C5Q> ADAPTER = new ProtoAdapter<C1C5Q>() { // from class: X.1C5R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C5Q decode(ProtoReader protoReader) {
            C1C5Q c1c5q = new C1C5Q();
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
                                        c1c5q.product_type = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c1c5q.sku_image = C02U1.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1c5q.sku_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c5q.sku_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1c5q.product_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c5q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C5Q c1c5q) {
            C1C5Q c1c5q2 = c1c5q;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1c5q2.product_id) + protoAdapter.encodedSizeWithTag(2, c1c5q2.sku_id) + ProtoAdapter.STRING.encodedSizeWithTag(3, c1c5q2.sku_name) + C02U1.ADAPTER.encodedSizeWithTag(4, c1c5q2.sku_image) + ProtoAdapter.INT32.encodedSizeWithTag(5, c1c5q2.product_type) + c1c5q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C5Q c1c5q) {
        }
    };
    public Long product_id;
    public Integer product_type;
    public Long sku_id;
    public C02U1 sku_image;
    public String sku_name;

    public C1C5Q() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C5P newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
