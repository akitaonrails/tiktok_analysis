package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02XO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02XO extends Message<C02XO, C02XP> {
    public static final ProtoAdapter<C02XO> ADAPTER = new ProtoAdapter<C02XO>() { // from class: X.02XN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02XO decode(ProtoReader protoReader) {
            C02XO c02xo = new C02XO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02xo.currency = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02xo.donation_fee = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02xo.donation_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02xo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02XO c02xo) {
            C02XO c02xo2 = c02xo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02xo2.donation_id) + protoAdapter.encodedSizeWithTag(2, c02xo2.donation_fee) + protoAdapter.encodedSizeWithTag(3, c02xo2.currency) + c02xo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02XO c02xo) {
        }
    };
    public String currency;
    public String donation_fee;
    public String donation_id;

    public C02XO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02XP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
