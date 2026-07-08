package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C553402Ds extends Message<C553402Ds, C578102Nf> {
    public static final ProtoAdapter<C553402Ds> ADAPTER = new ProtoAdapter<C553402Ds>() { // from class: X.02Dr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C553402Ds decode(ProtoReader protoReader) {
            C553402Ds c553402Ds = new C553402Ds();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c553402Ds.payment_guarantees.add(C553202Dq.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c553402Ds.save_display_popup_text = C02YV.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c553402Ds;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C553402Ds c553402Ds) {
            C553402Ds c553402Ds2 = c553402Ds;
            return C02YV.ADAPTER.encodedSizeWithTag(1, c553402Ds2.save_display_popup_text) + C553202Dq.ADAPTER.asRepeated().encodedSizeWithTag(2, c553402Ds2.payment_guarantees) + c553402Ds2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C553402Ds c553402Ds) {
        }
    };
    public List<C553202Dq> payment_guarantees;
    public C02YV save_display_popup_text;

    public C553402Ds() {
        super(ADAPTER, ByteString.EMPTY);
        this.payment_guarantees = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C578102Nf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
