package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C553502Dt extends Message<C553502Dt, C02QT> {
    public static final ProtoAdapter<C553502Dt> ADAPTER = new ProtoAdapter<C553502Dt>() { // from class: X.02Ak
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C553502Dt decode(ProtoReader protoReader) {
            C553502Dt c553502Dt = new C553502Dt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c553502Dt.payment_bill_summary.add(AnonymousClass0281.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c553502Dt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C553502Dt c553502Dt) {
            C553502Dt c553502Dt2 = c553502Dt;
            return AnonymousClass0281.ADAPTER.asRepeated().encodedSizeWithTag(1, c553502Dt2.payment_bill_summary) + c553502Dt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C553502Dt c553502Dt) {
        }
    };
    public List<AnonymousClass0281> payment_bill_summary;

    public C553502Dt() {
        super(ADAPTER, ByteString.EMPTY);
        this.payment_bill_summary = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02QT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
