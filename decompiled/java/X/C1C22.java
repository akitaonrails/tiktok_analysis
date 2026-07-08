package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C22, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C22 extends Message<C1C22, C1C23> {
    public static final ProtoAdapter<C1C22> ADAPTER = new ProtoAdapter<C1C22>() { // from class: X.1C21
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C22 decode(ProtoReader protoReader) {
            C1C22 c1c22 = new C1C22();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c22.promotion_usable_end_timestamp = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c22.content = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c22;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C22 c1c22) {
            C1C22 c1c222 = c1c22;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c222.content) + protoAdapter.encodedSizeWithTag(2, c1c222.promotion_usable_end_timestamp) + c1c222.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C22 c1c22) {
        }
    };
    public String content;
    public String promotion_usable_end_timestamp;

    public C1C22() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C23 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
