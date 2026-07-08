package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02LL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02LL extends Message<C02LL, C02LM> {
    public static final ProtoAdapter<C02LL> ADAPTER = new ProtoAdapter<C02LL>() { // from class: X.02LK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02LL decode(ProtoReader protoReader) {
            C02LL c02ll = new C02LL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c02ll.footnote = C02EW.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ll;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02LL c02ll) {
            C02LL c02ll2 = c02ll;
            return C02EW.ADAPTER.encodedSizeWithTag(1, c02ll2.footnote) + c02ll2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02LL c02ll) {
            C02LL c02ll2 = c02ll;
            C02EW.ADAPTER.encodeWithTag(protoWriter, 1, c02ll2.footnote);
            protoWriter.writeBytes(c02ll2.unknownFields());
        }
    };
    public C02EW footnote;

    public C02LL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
