package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAV, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAV extends Message<C1DAV, C1DAW> {
    public static final ProtoAdapter<C1DAV> ADAPTER = new ProtoAdapter<C1DAV>() { // from class: X.1DAU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DAV decode(ProtoReader protoReader) {
            C1DAV c1dav = new C1DAV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dav.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1dav.text_color = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c1dav.background_color = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c1dav.overlay_text_color = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1dav.overlay_background_color = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1dav.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1dav.is_only_top_rated = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dav;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DAV c1dav) {
            C1DAV c1dav2 = c1dav;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1dav2.text);
            ProtoAdapter<C658602hc> protoAdapter2 = C658602hc.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1dav2.text_color) + protoAdapter2.encodedSizeWithTag(3, c1dav2.background_color) + protoAdapter2.encodedSizeWithTag(4, c1dav2.overlay_text_color) + protoAdapter2.encodedSizeWithTag(5, c1dav2.overlay_background_color) + protoAdapter.encodedSizeWithTag(6, c1dav2.schema) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c1dav2.is_only_top_rated) + c1dav2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1DAV c1dav) {
        }
    };
    public C658602hc background_color;
    public Boolean is_only_top_rated;
    public C658602hc overlay_background_color;
    public C658602hc overlay_text_color;
    public String schema;
    public String text;
    public C658602hc text_color;

    public C1DAV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1DAW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
