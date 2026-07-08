package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C28, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C28 extends Message<C1C28, C1C29> {
    public static final ProtoAdapter<C1C28> ADAPTER = new ProtoAdapter<C1C28>() { // from class: X.1C27
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C28 decode(ProtoReader protoReader) {
            C1C28 c1c28 = new C1C28();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c28.deduction_range = C1C25.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c28.minimum_purchase_range = C1C25.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c28;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C28 c1c28) {
            C1C28 c1c282 = c1c28;
            ProtoAdapter<C1C25> protoAdapter = C1C25.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c1c282.minimum_purchase_range) + protoAdapter.encodedSizeWithTag(2, c1c282.deduction_range) + c1c282.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C28 c1c28) {
        }
    };
    public C1C25 deduction_range;
    public C1C25 minimum_purchase_range;

    public C1C28() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C29 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
