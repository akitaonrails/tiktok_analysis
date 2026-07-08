package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Wc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C601202Wc extends Message<C601202Wc, C601302Wd> {
    public static final ProtoAdapter<C601202Wc> ADAPTER = new ProtoAdapter<C601202Wc>() { // from class: X.02Wb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C601202Wc decode(ProtoReader protoReader) {
            C601202Wc c601202Wc = new C601202Wc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c601202Wc.apple_pay_express_button_area_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c601202Wc.pdp_button_area_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c601202Wc.product_purchase_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c601202Wc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C601202Wc c601202Wc) {
            C601202Wc c601202Wc2 = c601202Wc;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c601202Wc2.product_purchase_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c601202Wc2.pdp_button_area_id) + protoAdapter.encodedSizeWithTag(3, c601202Wc2.apple_pay_express_button_area_id) + c601202Wc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C601202Wc c601202Wc) {
        }
    };
    public String apple_pay_express_button_area_id;
    public String pdp_button_area_id;
    public Integer product_purchase_type;

    public C601202Wc() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C601302Wd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
