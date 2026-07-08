package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAR, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CAR extends Message<C1CAR, C1CAS> {
    public static final ProtoAdapter<C1CAR> ADAPTER = new ProtoAdapter<C1CAR>() { // from class: X.1CAQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CAR decode(ProtoReader protoReader) {
            C1CAR c1car = new C1CAR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1car.order_status = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1car.product_info.add(C1CAU.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1car;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CAR c1car) {
            C1CAR c1car2 = c1car;
            return C1CAU.ADAPTER.asRepeated().encodedSizeWithTag(1, c1car2.product_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, c1car2.order_status) + c1car2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CAR c1car) {
        }
    };
    public Integer order_status;
    public List<C1CAU> product_info;

    public C1CAR() {
        super(ADAPTER, ByteString.EMPTY);
        this.product_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1CAS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
