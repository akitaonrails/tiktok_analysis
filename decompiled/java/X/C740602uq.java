package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C740602uq extends Message<C740602uq, C740702ur> {
    public static final ProtoAdapter<C740602uq> ADAPTER = new ProtoAdapter<C740602uq>() { // from class: X.02up
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C740602uq decode(ProtoReader protoReader) {
            C740602uq c740602uq = new C740602uq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c740602uq.gift_label = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c740602uq.gift_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c740602uq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C740602uq c740602uq) {
            C740602uq c740602uq2 = c740602uq;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c740602uq2.gift_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c740602uq2.gift_label) + c740602uq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C740602uq c740602uq) {
        }
    };
    public String gift_label;
    public Integer gift_type;

    public C740602uq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C740702ur newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
