package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C710002pu extends Message<C710002pu, C710102pv> {
    public static final ProtoAdapter<C710002pu> ADAPTER = new ProtoAdapter<C710002pu>() { // from class: X.02pt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C710002pu decode(ProtoReader protoReader) {
            C710002pu c710002pu = new C710002pu();
            long jBeginMessage = protoReader.beginMessage();
            while (protoReader.nextTag() != -1) {
                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
            }
            protoReader.endMessage(jBeginMessage);
            return c710002pu;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C710002pu c710002pu) {
            return c710002pu.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C710002pu c710002pu) {
            protoWriter.writeBytes(c710002pu.unknownFields());
        }
    };

    public C710002pu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C710102pv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
