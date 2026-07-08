package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DA1, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DA1 extends Message<C1DA1, C1DA2> {
    public static final ProtoAdapter<C1DA1> ADAPTER = new ProtoAdapter<C1DA1>() { // from class: X.1DA0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DA1 decode(ProtoReader protoReader) {
            C1DA1 c1da1 = new C1DA1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1da1.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1da1.desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1da1.price = C2251581DAu.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c1da1.discount_percentage = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1da1.is_best = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c1da1.is_auto_renew = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c1da1.cycle_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c1da1.next_billing_date = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1da1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DA1 c1da1) {
            C1DA1 c1da12 = c1da1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1da12.title) + protoAdapter.encodedSizeWithTag(2, c1da12.desc) + C2251581DAu.ADAPTER.encodedSizeWithTag(3, c1da12.price);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c1da12.discount_percentage);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c1da12.is_best) + protoAdapter3.encodedSizeWithTag(6, c1da12.is_auto_renew) + protoAdapter2.encodedSizeWithTag(7, c1da12.cycle_type) + ProtoAdapter.INT64.encodedSizeWithTag(8, c1da12.next_billing_date) + c1da12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DA1 c1da1) {
            C1DA1 c1da12 = c1da1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1da12.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c1da12.desc);
            C2251581DAu.ADAPTER.encodeWithTag(protoWriter, 3, c1da12.price);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, c1da12.discount_percentage);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 5, c1da12.is_best);
            protoAdapter3.encodeWithTag(protoWriter, 6, c1da12.is_auto_renew);
            protoAdapter2.encodeWithTag(protoWriter, 7, c1da12.cycle_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 8, c1da12.next_billing_date);
            protoWriter.writeBytes(c1da12.unknownFields());
        }
    };
    public Integer cycle_type;
    public String desc;
    public Integer discount_percentage;
    public Boolean is_auto_renew;
    public Boolean is_best;
    public Long next_billing_date;
    public C2251581DAu price;
    public String title;

    public C1DA1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1DA2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
