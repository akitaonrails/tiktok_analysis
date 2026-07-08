package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C625702cJ extends Message<C625702cJ, C625802cK> {
    public static final ProtoAdapter<C625702cJ> ADAPTER = new ProtoAdapter<C625702cJ>() { // from class: X.02cI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C625702cJ decode(ProtoReader protoReader) {
            C625702cJ c625702cJ = new C625702cJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c625702cJ.life_story_blocked = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c625702cJ.life_story_block = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c625702cJ;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C625702cJ c625702cJ) {
            C625702cJ c625702cJ2 = c625702cJ;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c625702cJ2.life_story_block) + protoAdapter.encodedSizeWithTag(2, c625702cJ2.life_story_blocked) + c625702cJ2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C625702cJ c625702cJ) {
            C625702cJ c625702cJ2 = c625702cJ;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c625702cJ2.life_story_block);
            protoAdapter.encodeWithTag(protoWriter, 2, c625702cJ2.life_story_blocked);
            protoWriter.writeBytes(c625702cJ2.unknownFields());
        }
    };
    public Boolean life_story_block;
    public Boolean life_story_blocked;

    public C625702cJ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C625802cK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
