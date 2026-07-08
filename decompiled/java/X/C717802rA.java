package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02rA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C717802rA extends Message<C717802rA, C717902rB> {
    public static final ProtoAdapter<C717802rA> ADAPTER = new ProtoAdapter<C717802rA>() { // from class: X.02r9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C717802rA decode(ProtoReader protoReader) {
            C717802rA c717802rA = new C717802rA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c717802rA.coupon_schema = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c717802rA.voucher_selected_info.add(AnonymousClass0248.ADAPTER.decode(protoReader));
                                break;
                            case 3:
                                c717802rA.bonus_info = C5224021u.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c717802rA.entrance_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 5:
                                c717802rA.entrance_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c717802rA.promotion_row_list.add(C717502r7.ADAPTER.decode(protoReader));
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c717802rA.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c717802rA;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C717802rA c717802rA) {
            C717802rA c717802rA2 = c717802rA;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c717802rA2.coupon_schema) + AnonymousClass0248.ADAPTER.asRepeated().encodedSizeWithTag(2, c717802rA2.voucher_selected_info) + C5224021u.ADAPTER.encodedSizeWithTag(3, c717802rA2.bonus_info) + ProtoAdapter.INT32.encodedSizeWithTag(4, c717802rA2.entrance_type) + protoAdapter.encodedSizeWithTag(5, c717802rA2.entrance_text) + C717502r7.ADAPTER.asRepeated().encodedSizeWithTag(6, c717802rA2.promotion_row_list) + protoAdapter.encodedSizeWithTag(200, c717802rA2.da_info) + c717802rA2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C717802rA c717802rA) {
        }
    };
    public C5224021u bonus_info;
    public String coupon_schema;
    public String da_info;
    public String entrance_text;
    public Integer entrance_type;
    public List<C717502r7> promotion_row_list;
    public List<AnonymousClass0248> voucher_selected_info;

    public C717802rA() {
        super(ADAPTER, ByteString.EMPTY);
        this.voucher_selected_info = C1516540pZE.LJIIIIZZ();
        this.promotion_row_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C717902rB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
