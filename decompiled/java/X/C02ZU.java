package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ZU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02ZU extends Message<C02ZU, C02ZW> {
    public static final ProtoAdapter<C02ZU> ADAPTER = new ProtoAdapter<C02ZU>() { // from class: X.02ZV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02ZU decode(ProtoReader protoReader) {
            C02ZU c02zu = new C02ZU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02zu.view_all_location = C650202gG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02zu.pudo_address.add(C710902q3.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02zu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02ZU c02zu) {
            C02ZU c02zu2 = c02zu;
            return C710902q3.ADAPTER.asRepeated().encodedSizeWithTag(1, c02zu2.pudo_address) + C650202gG.ADAPTER.encodedSizeWithTag(2, c02zu2.view_all_location) + c02zu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02ZU c02zu) {
        }
    };
    public List<C710902q3> pudo_address;
    public C650202gG view_all_location;

    public C02ZU() {
        super(ADAPTER, ByteString.EMPTY);
        this.pudo_address = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02ZW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
