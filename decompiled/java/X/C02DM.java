package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DM extends Message<C02DM, C02MR> {
    public static final ProtoAdapter<C02DM> ADAPTER = new ProtoAdapter<C02DM>() { // from class: X.029K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DM decode(ProtoReader protoReader) {
            C02DM c02dm = new C02DM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02dm.payment_tips.add(C02B0.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02dm.abnormal_card_bin = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DM c02dm) {
            C02DM c02dm2 = c02dm;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02dm2.abnormal_card_bin) + C02B0.ADAPTER.asRepeated().encodedSizeWithTag(2, c02dm2.payment_tips) + c02dm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02DM c02dm) {
        }
    };
    public String abnormal_card_bin;
    public List<C02B0> payment_tips;

    public C02DM() {
        super(ADAPTER, ByteString.EMPTY);
        this.payment_tips = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02MR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
