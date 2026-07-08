package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C631402dE extends Message<C631402dE, C631502dF> {
    public static final ProtoAdapter<C631402dE> ADAPTER = new ProtoAdapter<C631402dE>() { // from class: X.02dD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C631402dE decode(ProtoReader protoReader) {
            C631402dE c631402dE = new C631402dE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c631402dE.policy_statements.add(C631202dC.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c631402dE;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C631402dE c631402dE) {
            C631402dE c631402dE2 = c631402dE;
            return C631202dC.ADAPTER.asRepeated().encodedSizeWithTag(1, c631402dE2.policy_statements) + c631402dE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C631402dE c631402dE) {
        }
    };
    public List<C631202dC> policy_statements;

    public C631402dE() {
        super(ADAPTER, ByteString.EMPTY);
        this.policy_statements = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C631502dF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
