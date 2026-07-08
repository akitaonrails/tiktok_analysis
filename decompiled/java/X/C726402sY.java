package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02sY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C726402sY extends Message<C726402sY, C726502sZ> {
    public static final ProtoAdapter<C726402sY> ADAPTER = new ProtoAdapter<C726402sY>() { // from class: X.02sX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C726402sY decode(ProtoReader protoReader) {
            C726402sY c726402sY = new C726402sY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c726402sY.pre_music_id = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c726402sY.music_edit_scene = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c726402sY;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C726402sY c726402sY) {
            C726402sY c726402sY2 = c726402sY;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c726402sY2.music_edit_scene) + ProtoAdapter.INT64.encodedSizeWithTag(2, c726402sY2.pre_music_id) + c726402sY2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C726402sY c726402sY) {
            C726402sY c726402sY2 = c726402sY;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c726402sY2.music_edit_scene);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c726402sY2.pre_music_id);
            protoWriter.writeBytes(c726402sY2.unknownFields());
        }
    };
    public Integer music_edit_scene;
    public Long pre_music_id;

    public C726402sY() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C726502sZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
