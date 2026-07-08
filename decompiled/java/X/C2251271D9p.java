package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251271D9p extends Message<C2251271D9p, C2251281D9q> {
    public static final ProtoAdapter<C2251271D9p> ADAPTER = new ProtoAdapter<C2251271D9p>() { // from class: X.1D9o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251271D9p decode(ProtoReader protoReader) {
            C2251271D9p c2251271D9p = new C2251271D9p();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251271D9p.sticker_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c2251271D9p.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2251271D9p.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2251271D9p.sticker_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2251271D9p.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2251271D9p.open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251271D9p;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251271D9p c2251271D9p) {
            C2251271D9p c2251271D9p2 = c2251271D9p;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c2251271D9p2.sticker_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2251271D9p2.link) + protoAdapter.encodedSizeWithTag(3, c2251271D9p2.title) + protoAdapter.encodedSizeWithTag(4, c2251271D9p2.sticker_id) + C673002jw.ADAPTER.encodedSizeWithTag(5, c2251271D9p2.icon_url) + protoAdapter.encodedSizeWithTag(6, c2251271D9p2.open_url) + c2251271D9p2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251271D9p c2251271D9p) {
            C2251271D9p c2251271D9p2 = c2251271D9p;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c2251271D9p2.sticker_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c2251271D9p2.link);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251271D9p2.title);
            protoAdapter.encodeWithTag(protoWriter, 4, c2251271D9p2.sticker_id);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 5, c2251271D9p2.icon_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c2251271D9p2.open_url);
            protoWriter.writeBytes(c2251271D9p2.unknownFields());
        }
    };
    public C673002jw icon_url;
    public String link;
    public String open_url;
    public String sticker_id;
    public Integer sticker_type;
    public String title;

    public C2251271D9p() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2251281D9q newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
