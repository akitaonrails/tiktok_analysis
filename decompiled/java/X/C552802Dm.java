package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C552802Dm extends Message<C552802Dm, C572402La> {
    public static final ProtoAdapter<C552802Dm> ADAPTER = new ProtoAdapter<C552802Dm>() { // from class: X.02DK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C552802Dm decode(ProtoReader protoReader) {
            C552802Dm c552802Dm = new C552802Dm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c552802Dm.tags.add(C02DI.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c552802Dm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C552802Dm c552802Dm) {
            C552802Dm c552802Dm2 = c552802Dm;
            return C02DI.ADAPTER.asRepeated().encodedSizeWithTag(1, c552802Dm2.tags) + c552802Dm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C552802Dm c552802Dm) {
            C552802Dm c552802Dm2 = c552802Dm;
            C02DI.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c552802Dm2.tags);
            protoWriter.writeBytes(c552802Dm2.unknownFields());
        }
    };
    public List<C02DI> tags;

    public C552802Dm() {
        super(ADAPTER, ByteString.EMPTY);
        this.tags = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C572402La newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
