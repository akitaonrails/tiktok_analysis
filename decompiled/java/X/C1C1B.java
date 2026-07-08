package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1B, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1B extends Message<C1C1B, C1C1C> {
    public static final ProtoAdapter<C1C1B> ADAPTER = new ProtoAdapter<C1C1B>() { // from class: X.1C1A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1B decode(ProtoReader protoReader) {
            C1C1B c1c1b = new C1C1B();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1c1b.psm_logs.add(C1C18.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c1b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C1B c1c1b) {
            C1C1B c1c1b2 = c1c1b;
            return C1C18.ADAPTER.asRepeated().encodedSizeWithTag(1, c1c1b2.psm_logs) + c1c1b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C1B c1c1b) {
        }
    };
    public List<C1C18> psm_logs;

    public C1C1B() {
        super(ADAPTER, ByteString.EMPTY);
        this.psm_logs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C1C newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
