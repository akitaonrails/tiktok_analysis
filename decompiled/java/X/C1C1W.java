package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1W, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C1W extends Message<C1C1W, C1C1X> {
    public static final ProtoAdapter<C1C1W> ADAPTER = new ProtoAdapter<C1C1W>() { // from class: X.1C1V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C1W decode(ProtoReader protoReader) {
            C1C1W c1c1w = new C1C1W();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c1w.story_note_reply_panel_tag = C1C5K.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c1w.story_detail_tag = C1C5K.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c1w;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C1W c1c1w) {
            C1C1W c1c1w2 = c1c1w;
            ProtoAdapter<C1C5K> protoAdapter = C1C5K.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c1c1w2.story_detail_tag) + protoAdapter.encodedSizeWithTag(2, c1c1w2.story_note_reply_panel_tag) + c1c1w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C1W c1c1w) {
            C1C1W c1c1w2 = c1c1w;
            ProtoAdapter<C1C5K> protoAdapter = C1C5K.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c1w2.story_detail_tag);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c1w2.story_note_reply_panel_tag);
            protoWriter.writeBytes(c1c1w2.unknownFields());
        }
    };
    public C1C5K story_detail_tag;
    public C1C5K story_note_reply_panel_tag;

    public C1C1W() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C1X newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
