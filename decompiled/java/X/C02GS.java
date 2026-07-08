package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GS extends Message<C02GS, C568202Jk> {
    public static final ProtoAdapter<C02GS> ADAPTER = new ProtoAdapter<C02GS>() { // from class: X.028J
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GS decode(ProtoReader protoReader) {
            C02GS c02gs = new C02GS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02gs.collab_status = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02gs.user_info = C5189020l.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gs;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GS c02gs) {
            C02GS c02gs2 = c02gs;
            return C5189020l.ADAPTER.encodedSizeWithTag(1, c02gs2.user_info) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02gs2.collab_status) + c02gs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02GS c02gs) {
            C02GS c02gs2 = c02gs;
            C5189020l.ADAPTER.encodeWithTag(protoWriter, 1, c02gs2.user_info);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c02gs2.collab_status);
            protoWriter.writeBytes(c02gs2.unknownFields());
        }
    };
    public Integer collab_status;
    public C5189020l user_info;

    public C02GS() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C568202Jk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
