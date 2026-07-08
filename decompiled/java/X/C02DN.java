package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DN extends Message<C02DN, C02NX> {
    public static final ProtoAdapter<C02DN> ADAPTER = new ProtoAdapter<C02DN>() { // from class: X.029M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DN decode(ProtoReader protoReader) {
            C02DN c02dn = new C02DN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02dn.sub_payment_card_rules.add(C02BD.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02dn.payment_method_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DN c02dn) {
            C02DN c02dn2 = c02dn;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02dn2.payment_method_id) + C02BD.ADAPTER.asRepeated().encodedSizeWithTag(2, c02dn2.sub_payment_card_rules) + c02dn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02DN c02dn) {
        }
    };
    public String payment_method_id;
    public List<C02BD> sub_payment_card_rules;

    public C02DN() {
        super(ADAPTER, ByteString.EMPTY);
        this.sub_payment_card_rules = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02NX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
