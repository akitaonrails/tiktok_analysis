package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C599402Vk extends Message<C599402Vk, C599502Vl> {
    public static final ProtoAdapter<C599402Vk> ADAPTER = new ProtoAdapter<C599402Vk>() { // from class: X.02Vj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C599402Vk decode(ProtoReader protoReader) {
            C599402Vk c599402Vk = new C599402Vk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c599402Vk.play_addr = C673002jw.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c599402Vk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C599402Vk c599402Vk) {
            C599402Vk c599402Vk2 = c599402Vk;
            return C673002jw.ADAPTER.encodedSizeWithTag(1, c599402Vk2.play_addr) + c599402Vk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C599402Vk c599402Vk) {
            C599402Vk c599402Vk2 = c599402Vk;
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 1, c599402Vk2.play_addr);
            protoWriter.writeBytes(c599402Vk2.unknownFields());
        }
    };
    public C673002jw play_addr;

    public C599402Vk() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C599502Vl newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
