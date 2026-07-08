package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02fQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C645002fQ extends Message<C645002fQ, C645102fR> {
    public static final ProtoAdapter<C645002fQ> ADAPTER = new ProtoAdapter<C645002fQ>() { // from class: X.02fP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C645002fQ decode(ProtoReader protoReader) {
            C645002fQ c645002fQ = new C645002fQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c645002fQ.content = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c645002fQ.title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c645002fQ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C645002fQ c645002fQ) {
            C645002fQ c645002fQ2 = c645002fQ;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c645002fQ2.title) + protoAdapter.encodedSizeWithTag(2, c645002fQ2.content) + c645002fQ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C645002fQ c645002fQ) {
        }
    };
    public C5431029t content;
    public C5431029t title;

    public C645002fQ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C645102fR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
