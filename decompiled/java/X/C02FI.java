package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FI extends Message<C02FI, C02PE> {
    public static final ProtoAdapter<C02FI> ADAPTER = new ProtoAdapter<C02FI>() { // from class: X.029a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FI decode(ProtoReader protoReader) {
            C02FI c02fi = new C02FI();
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
                                    c02fi.logistics_service_id = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02fi.warehouse_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fi.delivery_option = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02fi.main_order_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FI c02fi) {
            C02FI c02fi2 = c02fi;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02fi2.main_order_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02fi2.delivery_option) + protoAdapter.encodedSizeWithTag(3, c02fi2.warehouse_id) + protoAdapter.encodedSizeWithTag(4, c02fi2.logistics_service_id) + c02fi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FI c02fi) {
        }
    };
    public Integer delivery_option;
    public String logistics_service_id;
    public String main_order_id;
    public String warehouse_id;

    public C02FI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
