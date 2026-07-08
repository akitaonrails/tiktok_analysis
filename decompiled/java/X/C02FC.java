package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FC extends Message<C02FC, C02O6> {
    public static final ProtoAdapter<C02FC> ADAPTER = new ProtoAdapter<C02FC>() { // from class: X.02FB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FC decode(ProtoReader protoReader) {
            C02FC c02fc = new C02FC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c02fc.card_bin_promos.add(C02FA.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FC c02fc) {
            C02FC c02fc2 = c02fc;
            return C02FA.ADAPTER.asRepeated().encodedSizeWithTag(1, c02fc2.card_bin_promos) + c02fc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FC c02fc) {
        }
    };
    public List<C02FA> card_bin_promos;

    public C02FC() {
        super(ADAPTER, ByteString.EMPTY);
        this.card_bin_promos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02O6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
