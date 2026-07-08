package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02rD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C718102rD extends Message<C718102rD, C718202rE> {
    public static final ProtoAdapter<C718102rD> ADAPTER = new ProtoAdapter<C718102rD>() { // from class: X.02rC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C718102rD decode(ProtoReader protoReader) {
            C718102rD c718102rD = new C718102rD();
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
                                        c718102rD.title = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c718102rD.coupon_schema = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c718102rD.voucher_selected_info.add(AnonymousClass0248.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c718102rD.platform_discount = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c718102rD.order_promotion_cache_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c718102rD;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C718102rD c718102rD) {
            C718102rD c718102rD2 = c718102rD;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c718102rD2.order_promotion_cache_key) + protoAdapter.encodedSizeWithTag(2, c718102rD2.platform_discount) + AnonymousClass0248.ADAPTER.asRepeated().encodedSizeWithTag(3, c718102rD2.voucher_selected_info) + protoAdapter.encodedSizeWithTag(4, c718102rD2.coupon_schema) + protoAdapter.encodedSizeWithTag(5, c718102rD2.title) + c718102rD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C718102rD c718102rD) {
        }
    };
    public String coupon_schema;
    public String order_promotion_cache_key;
    public String platform_discount;
    public String title;
    public List<AnonymousClass0248> voucher_selected_info;

    public C718102rD() {
        super(ADAPTER, ByteString.EMPTY);
        this.voucher_selected_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C718202rE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
