package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C629002cq extends Message<C629002cq, C629102cr> {
    public static final ProtoAdapter<C629002cq> ADAPTER = new ProtoAdapter<C629002cq>() { // from class: X.02cp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C629002cq decode(ProtoReader protoReader) {
            C629002cq c629002cq = new C629002cq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c629002cq.authorization_statement = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c629002cq.global_button_style = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c629002cq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C629002cq c629002cq) {
            C629002cq c629002cq2 = c629002cq;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c629002cq2.global_button_style) + C5431029t.ADAPTER.encodedSizeWithTag(2, c629002cq2.authorization_statement) + c629002cq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C629002cq c629002cq) {
        }
    };
    public C5431029t authorization_statement;
    public Integer global_button_style;

    public C629002cq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C629102cr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
