package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1N, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1N extends Message<C1C1N, C1C1O> {
    public static final ProtoAdapter<C1C1N> ADAPTER = new ProtoAdapter<C1C1N>() { // from class: X.1C1M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1N decode(ProtoReader protoReader) {
            C1C1N c1c1n = new C1C1N();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1c1n.item_id = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1c1n.reply_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c1n.prompt_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c1n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C1N c1c1n) {
            C1C1N c1c1n2 = c1c1n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c1n2.prompt_text) + protoAdapter.encodedSizeWithTag(2, c1c1n2.reply_text) + ProtoAdapter.INT64.encodedSizeWithTag(3, c1c1n2.item_id) + c1c1n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C1N c1c1n) {
            C1C1N c1c1n2 = c1c1n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c1n2.prompt_text);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c1n2.reply_text);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c1c1n2.item_id);
            protoWriter.writeBytes(c1c1n2.unknownFields());
        }
    };
    public Long item_id;
    public String prompt_text;
    public String reply_text;

    public C1C1N() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C1O newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
