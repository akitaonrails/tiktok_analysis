package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251301D9s extends Message<C2251301D9s, C2251311D9t> {
    public static final ProtoAdapter<C2251301D9s> ADAPTER = new ProtoAdapter<C2251301D9s>() { // from class: X.1D9r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251301D9s decode(ProtoReader protoReader) {
            C2251301D9s c2251301D9s = new C2251301D9s();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251301D9s.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251301D9s.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2251301D9s.sub_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2251301D9s.avatar_icon = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2251301D9s.web_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2251301D9s.open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251301D9s;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251301D9s c2251301D9s) {
            C2251301D9s c2251301D9s2 = c2251301D9s;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2251301D9s2.id) + protoAdapter.encodedSizeWithTag(2, c2251301D9s2.title) + protoAdapter.encodedSizeWithTag(3, c2251301D9s2.sub_title) + C673002jw.ADAPTER.encodedSizeWithTag(4, c2251301D9s2.avatar_icon) + protoAdapter.encodedSizeWithTag(5, c2251301D9s2.web_url) + protoAdapter.encodedSizeWithTag(6, c2251301D9s2.open_url) + c2251301D9s2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251301D9s c2251301D9s) {
            C2251301D9s c2251301D9s2 = c2251301D9s;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251301D9s2.id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251301D9s2.title);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251301D9s2.sub_title);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 4, c2251301D9s2.avatar_icon);
            protoAdapter.encodeWithTag(protoWriter, 5, c2251301D9s2.web_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c2251301D9s2.open_url);
            protoWriter.writeBytes(c2251301D9s2.unknownFields());
        }
    };
    public C673002jw avatar_icon;
    public String id;
    public String open_url;
    public String sub_title;
    public String title;
    public String web_url;

    public C2251301D9s() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2251311D9t newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
