package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C633302dX extends Message<C633302dX, C633402dY> {
    public static final ProtoAdapter<C633302dX> ADAPTER = new ProtoAdapter<C633302dX>() { // from class: X.02dW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C633302dX decode(ProtoReader protoReader) {
            C633302dX c633302dX = new C633302dX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c633302dX.content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c633302dX.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c633302dX;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C633302dX c633302dX) {
            C633302dX c633302dX2 = c633302dX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c633302dX2.title) + protoAdapter.encodedSizeWithTag(2, c633302dX2.content) + c633302dX2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C633302dX c633302dX) {
            C633302dX c633302dX2 = c633302dX;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c633302dX2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c633302dX2.content);
            protoWriter.writeBytes(c633302dX2.unknownFields());
        }
    };
    public String content;
    public String title;

    public C633302dX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C633402dY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
