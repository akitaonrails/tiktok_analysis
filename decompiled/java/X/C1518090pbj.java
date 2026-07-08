package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518090pbj extends Message<C1518090pbj, C1518100pbk> {
    public static final ProtoAdapter<C1518090pbj> ADAPTER = new ProtoAdapter<C1518090pbj>() { // from class: X.0pbi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1518090pbj decode(ProtoReader protoReader) {
            C1518090pbj c1518090pbj = new C1518090pbj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1518090pbj.pre_music_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1518090pbj.edit_music_scene = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518090pbj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1518090pbj c1518090pbj) {
            C1518090pbj c1518090pbj2 = c1518090pbj;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1518090pbj2.edit_music_scene) + ProtoAdapter.STRING.encodedSizeWithTag(2, c1518090pbj2.pre_music_id) + c1518090pbj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1518090pbj c1518090pbj) {
            C1518090pbj c1518090pbj2 = c1518090pbj;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1518090pbj2.edit_music_scene);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c1518090pbj2.pre_music_id);
            protoWriter.writeBytes(c1518090pbj2.unknownFields());
        }
    };
    public Integer edit_music_scene;
    public String pre_music_id;

    public C1518090pbj() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1518100pbk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
