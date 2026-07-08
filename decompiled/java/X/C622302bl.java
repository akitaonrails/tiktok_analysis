package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C622302bl extends Message<C622302bl, C622402bm> {
    public static final ProtoAdapter<C622302bl> ADAPTER = new ProtoAdapter<C622302bl>() { // from class: X.02bk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C622302bl decode(ProtoReader protoReader) {
            C622302bl c622302bl = new C622302bl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c622302bl.meme_song_style = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c622302bl.is_meme_song = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c622302bl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C622302bl c622302bl) {
            C622302bl c622302bl2 = c622302bl;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c622302bl2.is_meme_song) + ProtoAdapter.STRING.encodedSizeWithTag(2, c622302bl2.meme_song_style) + c622302bl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C622302bl c622302bl) {
            C622302bl c622302bl2 = c622302bl;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c622302bl2.is_meme_song);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c622302bl2.meme_song_style);
            protoWriter.writeBytes(c622302bl2.unknownFields());
        }
    };
    public Boolean is_meme_song;
    public String meme_song_style;

    public C622302bl() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C622402bm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
