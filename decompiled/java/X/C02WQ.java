package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02WQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02WQ extends Message<C02WQ, C02WR> {
    public static final ProtoAdapter<C02WQ> ADAPTER = new ProtoAdapter<C02WQ>() { // from class: X.02WP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02WQ decode(ProtoReader protoReader) {
            C02WQ c02wq = new C02WQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02wq.text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02wq.icon = C029C.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02wq.link = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02wq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02WQ c02wq) {
            C02WQ c02wq2 = c02wq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02wq2.link) + C029C.ADAPTER.encodedSizeWithTag(2, c02wq2.icon) + protoAdapter.encodedSizeWithTag(3, c02wq2.text) + c02wq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02WQ c02wq) {
        }
    };
    public C029C icon;
    public String link;
    public String text;

    public C02WQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02WR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
