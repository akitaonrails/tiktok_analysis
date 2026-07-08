package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251331D9v extends Message<C2251331D9v, C2251341D9w> {
    public static final ProtoAdapter<C2251331D9v> ADAPTER = new ProtoAdapter<C2251331D9v>() { // from class: X.1D9u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251331D9v decode(ProtoReader protoReader) {
            C2251331D9v c2251331D9v = new C2251331D9v();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251331D9v.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251331D9v.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2251331D9v.sub_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2251331D9v.avatar_icon = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2251331D9v.web_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2251331D9v.open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251331D9v;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251331D9v c2251331D9v) {
            C2251331D9v c2251331D9v2 = c2251331D9v;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2251331D9v2.id) + protoAdapter.encodedSizeWithTag(2, c2251331D9v2.title) + protoAdapter.encodedSizeWithTag(3, c2251331D9v2.sub_title) + C673002jw.ADAPTER.encodedSizeWithTag(4, c2251331D9v2.avatar_icon) + protoAdapter.encodedSizeWithTag(5, c2251331D9v2.web_url) + protoAdapter.encodedSizeWithTag(6, c2251331D9v2.open_url) + c2251331D9v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251331D9v c2251331D9v) {
            C2251331D9v c2251331D9v2 = c2251331D9v;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2251331D9v2.id);
            protoAdapter.encodeWithTag(protoWriter, 2, c2251331D9v2.title);
            protoAdapter.encodeWithTag(protoWriter, 3, c2251331D9v2.sub_title);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 4, c2251331D9v2.avatar_icon);
            protoAdapter.encodeWithTag(protoWriter, 5, c2251331D9v2.web_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c2251331D9v2.open_url);
            protoWriter.writeBytes(c2251331D9v2.unknownFields());
        }
    };
    public C673002jw avatar_icon;
    public String id;
    public String open_url;
    public String sub_title;
    public String title;
    public String web_url;

    public C2251331D9v() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2251341D9w newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
