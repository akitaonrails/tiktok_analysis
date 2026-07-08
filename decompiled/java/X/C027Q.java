package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027Q, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027Q extends Message<C027Q, C02QJ> {
    public static final ProtoAdapter<C027Q> ADAPTER = new ProtoAdapter<C027Q>() { // from class: X.023s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027Q decode(ProtoReader protoReader) {
            C027Q c027q = new C027Q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027q.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c027q.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c027q.avatar = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c027q.main_order_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            c027q.show_add_note = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c027q.about_this_shop_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c027q.seller_can_be_clicked = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c027q.store_label = C02ZZ.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027Q c027q) {
            C027Q c027q2 = c027q;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c027q2.seller_id) + protoAdapter.encodedSizeWithTag(2, c027q2.title) + C02U1.ADAPTER.encodedSizeWithTag(3, c027q2.avatar) + protoAdapter.asRepeated().encodedSizeWithTag(4, c027q2.main_order_ids);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c027q2.show_add_note) + protoAdapter.encodedSizeWithTag(6, c027q2.about_this_shop_schema) + protoAdapter2.encodedSizeWithTag(7, c027q2.seller_can_be_clicked) + C02ZZ.ADAPTER.encodedSizeWithTag(8, c027q2.store_label) + c027q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C027Q c027q) {
        }
    };
    public String about_this_shop_schema;
    public C02U1 avatar;
    public List<String> main_order_ids;
    public Boolean seller_can_be_clicked;
    public String seller_id;
    public Boolean show_add_note;
    public C02ZZ store_label;
    public String title;

    public C027Q() {
        super(ADAPTER, ByteString.EMPTY);
        this.main_order_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02QJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
