package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BY extends Message<C02BY, C02PB> {
    public static final ProtoAdapter<C02BY> ADAPTER = new ProtoAdapter<C02BY>() { // from class: X.029D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BY decode(ProtoReader protoReader) {
            C02BY c02by = new C02BY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02by.payment_place_order_button_list.add(C552002De.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c02by.place_order_button = C5308025a.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02by.recommend_installment_button = C552002De.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02by;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BY c02by) {
            C02BY c02by2 = c02by;
            ProtoAdapter<C552002De> protoAdapter = C552002De.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c02by2.recommend_installment_button) + C5308025a.ADAPTER.encodedSizeWithTag(2, c02by2.place_order_button) + protoAdapter.asRepeated().encodedSizeWithTag(3, c02by2.payment_place_order_button_list) + c02by2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02BY c02by) {
        }
    };
    public List<C552002De> payment_place_order_button_list;
    public C5308025a place_order_button;
    public C552002De recommend_installment_button;

    public C02BY() {
        super(ADAPTER, ByteString.EMPTY);
        this.payment_place_order_button_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02PB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
