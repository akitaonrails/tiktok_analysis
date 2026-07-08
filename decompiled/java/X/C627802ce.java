package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C627802ce extends Message<C627802ce, C627902cf> {
    public static final ProtoAdapter<C627802ce> ADAPTER = new ProtoAdapter<C627802ce>() { // from class: X.02cd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C627802ce decode(ProtoReader protoReader) {
            C627802ce c627802ce = new C627802ce();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c627802ce.share_story_post_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c627802ce.is_visible = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c627802ce;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C627802ce c627802ce) {
            C627802ce c627802ce2 = c627802ce;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c627802ce2.is_visible) + protoAdapter.encodedSizeWithTag(2, c627802ce2.share_story_post_type) + c627802ce2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C627802ce c627802ce) {
            C627802ce c627802ce2 = c627802ce;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c627802ce2.is_visible);
            protoAdapter.encodeWithTag(protoWriter, 2, c627802ce2.share_story_post_type);
            protoWriter.writeBytes(c627802ce2.unknownFields());
        }
    };
    public Integer is_visible;
    public Integer share_story_post_type;

    public C627802ce() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C627902cf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
