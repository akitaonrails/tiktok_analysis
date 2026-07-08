package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CX extends Message<C02CX, C02JB> {
    public static final ProtoAdapter<C02CX> ADAPTER = new ProtoAdapter<C02CX>() { // from class: X.02A2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CX decode(ProtoReader protoReader) {
            C02CX c02cx = new C02CX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02cx.followers.add(C02A1.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02cx.sprint = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CX c02cx) {
            C02CX c02cx2 = c02cx;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02cx2.sprint) + C02A1.ADAPTER.asRepeated().encodedSizeWithTag(2, c02cx2.followers) + c02cx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CX c02cx) {
            C02CX c02cx2 = c02cx;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02cx2.sprint);
            C02A1.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02cx2.followers);
            protoWriter.writeBytes(c02cx2.unknownFields());
        }
    };
    public List<C02A1> followers;
    public Integer sprint;

    public C02CX() {
        super(ADAPTER, ByteString.EMPTY);
        this.followers = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02JB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
