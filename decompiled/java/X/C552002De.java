package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02De, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C552002De extends Message<C552002De, C02PH> {
    public static final ProtoAdapter<C552002De> ADAPTER = new ProtoAdapter<C552002De>() { // from class: X.02Dd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C552002De decode(ProtoReader protoReader) {
            C552002De c552002De = new C552002De();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c552002De.installment_button.add(C551802Dc.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c552002De.payment_price_version_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c552002De;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C552002De c552002De) {
            C552002De c552002De2 = c552002De;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c552002De2.payment_price_version_id) + C551802Dc.ADAPTER.asRepeated().encodedSizeWithTag(2, c552002De2.installment_button) + c552002De2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C552002De c552002De) {
        }
    };
    public List<C551802Dc> installment_button;
    public String payment_price_version_id;

    public C552002De() {
        super(ADAPTER, ByteString.EMPTY);
        this.installment_button = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02PH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
