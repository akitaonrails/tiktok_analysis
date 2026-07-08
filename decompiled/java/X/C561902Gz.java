package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C561902Gz extends Message<C561902Gz, C584202Po> {
    public static final ProtoAdapter<C561902Gz> ADAPTER = new ProtoAdapter<C561902Gz>() { // from class: X.02Gy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C561902Gz decode(ProtoReader protoReader) {
            C561902Gz c561902Gz = new C561902Gz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c561902Gz.rsa_pub_key = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c561902Gz.elems.add(C561702Gx.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c561902Gz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C561902Gz c561902Gz) {
            C561902Gz c561902Gz2 = c561902Gz;
            return C561702Gx.ADAPTER.asRepeated().encodedSizeWithTag(1, c561902Gz2.elems) + ProtoAdapter.STRING.encodedSizeWithTag(2, c561902Gz2.rsa_pub_key) + c561902Gz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C561902Gz c561902Gz) {
        }
    };
    public List<C561702Gx> elems;
    public String rsa_pub_key;

    public C561902Gz() {
        super(ADAPTER, ByteString.EMPTY);
        this.elems = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C584202Po newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
