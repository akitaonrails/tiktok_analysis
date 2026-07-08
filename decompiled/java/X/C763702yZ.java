package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C763702yZ extends Message<C763702yZ, C763802ya> {
    public static final ProtoAdapter<C763702yZ> ADAPTER = new ProtoAdapter<C763702yZ>() { // from class: X.02yY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C763702yZ decode(ProtoReader protoReader) {
            C763702yZ c763702yZ = new C763702yZ();
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
                                        c763702yZ.voucher_claim_info.add(C764002yc.ADAPTER.decode(protoReader));
                                    }
                                } else {
                                    c763702yZ.coupon_schema = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c763702yZ.best_voucher_type_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c763702yZ.vouchers.add(C761602yE.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c763702yZ.lowest_price = C02FG.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c763702yZ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C763702yZ c763702yZ) {
            C763702yZ c763702yZ2 = c763702yZ;
            int iEncodedSizeWithTag = C02FG.ADAPTER.encodedSizeWithTag(1, c763702yZ2.lowest_price) + C761602yE.ADAPTER.asRepeated().encodedSizeWithTag(2, c763702yZ2.vouchers);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(3, c763702yZ2.best_voucher_type_ids) + protoAdapter.encodedSizeWithTag(4, c763702yZ2.coupon_schema) + C764002yc.ADAPTER.asRepeated().encodedSizeWithTag(5, c763702yZ2.voucher_claim_info) + c763702yZ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C763702yZ c763702yZ) {
        }
    };
    public List<String> best_voucher_type_ids;
    public String coupon_schema;
    public C02FG lowest_price;
    public List<C764002yc> voucher_claim_info;
    public List<C761602yE> vouchers;

    public C763702yZ() {
        super(ADAPTER, ByteString.EMPTY);
        this.vouchers = C1516540pZE.LJIIIIZZ();
        this.best_voucher_type_ids = C1516540pZE.LJIIIIZZ();
        this.voucher_claim_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C763802ya newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
