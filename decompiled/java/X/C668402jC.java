package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C668402jC extends Message<C668402jC, C668502jD> {
    public static final ProtoAdapter<C668402jC> ADAPTER = new ProtoAdapter<C668402jC>() { // from class: X.02jB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C668402jC decode(ProtoReader protoReader) {
            C668402jC c668402jC = new C668402jC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c668402jC.need_pull_upvote_info = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c668402jC;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C668402jC c668402jC) {
            C668402jC c668402jC2 = c668402jC;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c668402jC2.need_pull_upvote_info) + c668402jC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C668402jC c668402jC) {
            C668402jC c668402jC2 = c668402jC;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c668402jC2.need_pull_upvote_info);
            protoWriter.writeBytes(c668402jC2.unknownFields());
        }
    };
    public Boolean need_pull_upvote_info;

    public C668402jC() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C668502jD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
