package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C547502Bl extends Message<C547502Bl, C02M9> {
    public static final ProtoAdapter<C547502Bl> ADAPTER = new ProtoAdapter<C547502Bl>() { // from class: X.024X
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C547502Bl decode(ProtoReader protoReader) {
            C547502Bl c547502Bl = new C547502Bl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c547502Bl.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c547502Bl.artist_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c547502Bl.cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c547502Bl.is_pgc = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c547502Bl.music_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c547502Bl.sticker_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c547502Bl.music_sticker_from = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c547502Bl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C547502Bl c547502Bl) {
            C547502Bl c547502Bl2 = c547502Bl;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c547502Bl2.title) + protoAdapter.encodedSizeWithTag(2, c547502Bl2.artist_name) + C673002jw.ADAPTER.encodedSizeWithTag(3, c547502Bl2.cover) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c547502Bl2.is_pgc) + protoAdapter.encodedSizeWithTag(5, c547502Bl2.music_id) + ProtoAdapter.INT32.encodedSizeWithTag(6, c547502Bl2.sticker_style) + protoAdapter.encodedSizeWithTag(7, c547502Bl2.music_sticker_from) + c547502Bl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C547502Bl c547502Bl) {
            C547502Bl c547502Bl2 = c547502Bl;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c547502Bl2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c547502Bl2.artist_name);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c547502Bl2.cover);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c547502Bl2.is_pgc);
            protoAdapter.encodeWithTag(protoWriter, 5, c547502Bl2.music_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, c547502Bl2.sticker_style);
            protoAdapter.encodeWithTag(protoWriter, 7, c547502Bl2.music_sticker_from);
            protoWriter.writeBytes(c547502Bl2.unknownFields());
        }
    };
    public String artist_name;
    public C673002jw cover;
    public Boolean is_pgc;
    public String music_id;
    public String music_sticker_from;
    public Integer sticker_style;
    public String title;

    public C547502Bl() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02M9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
