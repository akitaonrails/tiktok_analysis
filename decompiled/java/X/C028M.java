package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.028M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C028M extends Message<C028M, C02O4> {
    public static final ProtoAdapter<C028M> ADAPTER = new ProtoAdapter<C028M>() { // from class: X.023x
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C028M decode(ProtoReader protoReader) {
            C028M c028m = new C028M();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c028m.min = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c028m.max = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c028m.hit_min_toast = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c028m.hit_max_toast = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c028m.notice = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c028m.quantity_editable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c028m.notice_color = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 101:
                                    c028m.hit_min_da_info = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 102:
                                    c028m.hit_max_da_info = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 103:
                                    c028m.purchase_limit_data_info = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                default:
                                    switch (iNextTag) {
                                        case 201:
                                            c028m.min_quantity_type = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case 202:
                                            c028m.max_quantity_type = ProtoAdapter.INT32.decode(protoReader);
                                            break;
                                        case 203:
                                            c028m.quantity_available = ProtoAdapter.BOOL.decode(protoReader);
                                            break;
                                        default:
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c028m;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C028M c028m) {
            C028M c028m2 = c028m;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c028m2.min) + protoAdapter.encodedSizeWithTag(2, c028m2.max);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c028m2.hit_min_toast) + protoAdapter2.encodedSizeWithTag(4, c028m2.hit_max_toast) + protoAdapter2.encodedSizeWithTag(5, c028m2.notice);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c028m2.quantity_editable) + protoAdapter.encodedSizeWithTag(7, c028m2.notice_color) + protoAdapter2.encodedSizeWithTag(101, c028m2.hit_min_da_info) + protoAdapter2.encodedSizeWithTag(102, c028m2.hit_max_da_info) + protoAdapter2.encodedSizeWithTag(103, c028m2.purchase_limit_data_info) + protoAdapter.encodedSizeWithTag(201, c028m2.min_quantity_type) + protoAdapter.encodedSizeWithTag(202, c028m2.max_quantity_type) + protoAdapter3.encodedSizeWithTag(203, c028m2.quantity_available) + c028m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C028M c028m) {
        }
    };
    public String hit_max_da_info;
    public String hit_max_toast;
    public String hit_min_da_info;
    public String hit_min_toast;
    public Integer max;
    public Integer max_quantity_type;
    public Integer min;
    public Integer min_quantity_type;
    public String notice;
    public Integer notice_color;
    public String purchase_limit_data_info;
    public Boolean quantity_available;
    public Boolean quantity_editable;

    public C028M() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02O4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
