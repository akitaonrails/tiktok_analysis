package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C551802Dc extends Message<C551802Dc, C02Q4> {
    public static final ProtoAdapter<C551802Dc> ADAPTER = new ProtoAdapter<C551802Dc>() { // from class: X.027H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C551802Dc decode(ProtoReader protoReader) {
            C551802Dc c551802Dc = new C551802Dc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c551802Dc.button = C5308025a.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                c551802Dc.tenure = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c551802Dc.token = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c551802Dc.installment_plan_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c551802Dc.installment_option_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 6:
                                c551802Dc.payment_method_code = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c551802Dc.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c551802Dc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C551802Dc c551802Dc) {
            C551802Dc c551802Dc2 = c551802Dc;
            int iEncodedSizeWithTag = C5308025a.ADAPTER.encodedSizeWithTag(1, c551802Dc2.button);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c551802Dc2.tenure) + protoAdapter.encodedSizeWithTag(3, c551802Dc2.token) + protoAdapter.encodedSizeWithTag(4, c551802Dc2.installment_plan_id) + protoAdapter.encodedSizeWithTag(5, c551802Dc2.installment_option_id) + protoAdapter.encodedSizeWithTag(6, c551802Dc2.payment_method_code) + protoAdapter.encodedSizeWithTag(200, c551802Dc2.da_info) + c551802Dc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C551802Dc c551802Dc) {
        }
    };
    public C5308025a button;
    public String da_info;
    public String installment_option_id;
    public String installment_plan_id;
    public String payment_method_code;
    public String tenure;
    public String token;

    public C551802Dc() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Q4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
