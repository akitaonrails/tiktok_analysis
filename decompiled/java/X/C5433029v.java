package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.029v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5433029v extends Message<C5433029v, C02PS> {
    public static final ProtoAdapter<C5433029v> ADAPTER = new ProtoAdapter<C5433029v>() { // from class: X.024g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5433029v decode(ProtoReader protoReader) {
            C5433029v c5433029v = new C5433029v();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 20) {
                        if (iNextTag != 100) {
                            switch (iNextTag) {
                                case 1:
                                    c5433029v.price_type = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 2:
                                    c5433029v.min_price = C022O.ADAPTER.decode(protoReader);
                                    break;
                                case 3:
                                    c5433029v.range_price = C5307024z.ADAPTER.decode(protoReader);
                                    break;
                                case 4:
                                    c5433029v.tax_include_desc = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 5:
                                    c5433029v.tax_include_desc_position = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 6:
                                    c5433029v.deposit_fee_desc = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 7:
                                    c5433029v.min_after_coupon_price = C022O.ADAPTER.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                        } else {
                            c5433029v.da_info = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c5433029v.need_icon = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5433029v;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5433029v c5433029v) {
            C5433029v c5433029v2 = c5433029v;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5433029v2.price_type);
            ProtoAdapter<C022O> protoAdapter2 = C022O.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5433029v2.min_price) + C5307024z.ADAPTER.encodedSizeWithTag(3, c5433029v2.range_price);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c5433029v2.tax_include_desc) + protoAdapter.encodedSizeWithTag(5, c5433029v2.tax_include_desc_position) + protoAdapter3.encodedSizeWithTag(6, c5433029v2.deposit_fee_desc) + protoAdapter2.encodedSizeWithTag(7, c5433029v2.min_after_coupon_price) + ProtoAdapter.BOOL.encodedSizeWithTag(20, c5433029v2.need_icon) + protoAdapter3.encodedSizeWithTag(100, c5433029v2.da_info) + c5433029v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5433029v c5433029v) {
        }
    };
    public String da_info;
    public String deposit_fee_desc;
    public C022O min_after_coupon_price;
    public C022O min_price;
    public Boolean need_icon;
    public Integer price_type;
    public C5307024z range_price;
    public String tax_include_desc;
    public Integer tax_include_desc_position;

    public C5433029v() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
