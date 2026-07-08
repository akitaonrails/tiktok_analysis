package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C628102ch extends Message<C628102ch, C628202ci> {
    public static final ProtoAdapter<C628102ch> ADAPTER = new ProtoAdapter<C628102ch>() { // from class: X.02cg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C628102ch decode(ProtoReader protoReader) {
            C628102ch c628102ch = new C628102ch();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c628102ch.game_score = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c628102ch.game_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c628102ch;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C628102ch c628102ch) {
            C628102ch c628102ch2 = c628102ch;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c628102ch2.game_type) + protoAdapter.encodedSizeWithTag(2, c628102ch2.game_score) + c628102ch2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C628102ch c628102ch) {
            C628102ch c628102ch2 = c628102ch;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c628102ch2.game_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c628102ch2.game_score);
            protoWriter.writeBytes(c628102ch2.unknownFields());
        }
    };
    public Integer game_score;
    public Integer game_type;

    public C628102ch() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C628202ci newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
