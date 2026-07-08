package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1BzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223001BzW extends Message<C2223001BzW, C2223011BzX> {
    public static final ProtoAdapter<C2223001BzW> ADAPTER = new ProtoAdapter<C2223001BzW>() { // from class: X.1BzV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223001BzW decode(ProtoReader protoReader) {
            C2223001BzW c2223001BzW = new C2223001BzW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223001BzW.original_item_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223001BzW.quoted_comment_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223001BzW;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223001BzW c2223001BzW) {
            C2223001BzW c2223001BzW2 = c2223001BzW;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2223001BzW2.quoted_comment_id) + protoAdapter.encodedSizeWithTag(2, c2223001BzW2.original_item_id) + c2223001BzW2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223001BzW c2223001BzW) {
            C2223001BzW c2223001BzW2 = c2223001BzW;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223001BzW2.quoted_comment_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223001BzW2.original_item_id);
            protoWriter.writeBytes(c2223001BzW2.unknownFields());
        }
    };
    public String original_item_id;
    public String quoted_comment_id;

    public C2223001BzW() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223011BzX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
