package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02uX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C738702uX extends Message<C738702uX, C738802uY> {
    public static final ProtoAdapter<C738702uX> ADAPTER = new ProtoAdapter<C738702uX>() { // from class: X.02uW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C738702uX decode(ProtoReader protoReader) {
            C738702uX c738702uX = new C738702uX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c738702uX.source = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c738702uX.task_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c738702uX;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C738702uX c738702uX) {
            C738702uX c738702uX2 = c738702uX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c738702uX2.task_id) + protoAdapter.encodedSizeWithTag(2, c738702uX2.source) + c738702uX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C738702uX c738702uX) {
            C738702uX c738702uX2 = c738702uX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c738702uX2.task_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c738702uX2.source);
            protoWriter.writeBytes(c738702uX2.unknownFields());
        }
    };
    public String source;
    public String task_id;

    public C738702uX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C738802uY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
