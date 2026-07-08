package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C6Q extends Message<C1C6Q, C1C6R> {
    public static final ProtoAdapter<C1C6Q> ADAPTER = new ProtoAdapter<C1C6Q>() { // from class: X.1C6P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C6Q decode(ProtoReader protoReader) {
            C1C6Q c1c6q = new C1C6Q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1c6q.payment_method_announcements.add(C1C6T.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c6q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C6Q c1c6q) {
            C1C6Q c1c6q2 = c1c6q;
            return C1C6T.ADAPTER.asRepeated().encodedSizeWithTag(1, c1c6q2.payment_method_announcements) + c1c6q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C6Q c1c6q) {
        }
    };
    public List<C1C6T> payment_method_announcements;

    public C1C6Q() {
        super(ADAPTER, ByteString.EMPTY);
        this.payment_method_announcements = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C6R newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
