package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C647102fl extends Message<C647102fl, C647202fm> {
    public static final ProtoAdapter<C647102fl> ADAPTER = new ProtoAdapter<C647102fl>() { // from class: X.02fk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C647102fl decode(ProtoReader protoReader) {
            C647102fl c647102fl = new C647102fl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                switch (iNextTag) {
                                    case 101:
                                        c647102fl.bcm_coupon_id = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 102:
                                        c647102fl.btm = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 103:
                                        c647102fl.claim_type = ProtoAdapter.INT32.decode(protoReader);
                                        break;
                                    default:
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        break;
                                }
                            } else {
                                c647102fl.instance_key = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c647102fl.voucher_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c647102fl.voucher_type_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c647102fl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C647102fl c647102fl) {
            C647102fl c647102fl2 = c647102fl;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c647102fl2.voucher_type_id) + protoAdapter.encodedSizeWithTag(2, c647102fl2.voucher_id) + protoAdapter.encodedSizeWithTag(3, c647102fl2.instance_key) + protoAdapter.encodedSizeWithTag(101, c647102fl2.bcm_coupon_id) + protoAdapter.encodedSizeWithTag(102, c647102fl2.btm) + ProtoAdapter.INT32.encodedSizeWithTag(103, c647102fl2.claim_type) + c647102fl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C647102fl c647102fl) {
        }
    };
    public String bcm_coupon_id;
    public String btm;
    public Integer claim_type;
    public String instance_key;
    public String voucher_id;
    public String voucher_type_id;

    public C647102fl() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C647202fm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
