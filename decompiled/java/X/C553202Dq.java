package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C553202Dq extends Message<C553202Dq, C02NU> {
    public static final ProtoAdapter<C553202Dq> ADAPTER = new ProtoAdapter<C553202Dq>() { // from class: X.029L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C553202Dq decode(ProtoReader protoReader) {
            C553202Dq c553202Dq = new C553202Dq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c553202Dq.block_list.add(C5417029f.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c553202Dq.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c553202Dq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C553202Dq c553202Dq) {
            C553202Dq c553202Dq2 = c553202Dq;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c553202Dq2.title) + C5417029f.ADAPTER.asRepeated().encodedSizeWithTag(2, c553202Dq2.block_list) + c553202Dq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C553202Dq c553202Dq) {
        }
    };
    public List<C5417029f> block_list;
    public String title;

    public C553202Dq() {
        super(ADAPTER, ByteString.EMPTY);
        this.block_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02NU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
