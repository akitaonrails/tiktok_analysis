package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DA7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DA7 extends Message<C1DA7, C1DA8> {
    public static final ProtoAdapter<C1DA7> ADAPTER = new ProtoAdapter<C1DA7>() { // from class: X.1DA6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DA7 decode(ProtoReader protoReader) {
            C1DA7 c1da7 = new C1DA7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1da7.light_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1da7.dark_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1da7.width = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1da7.height = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1da7.margin_top = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1da7.margin_bottom = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c1da7.margin_right = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1da7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DA7 c1da7) {
            C1DA7 c1da72 = c1da7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1da72.light_url) + protoAdapter.encodedSizeWithTag(2, c1da72.dark_url);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c1da72.width) + protoAdapter2.encodedSizeWithTag(4, c1da72.height) + protoAdapter2.encodedSizeWithTag(5, c1da72.margin_top) + protoAdapter2.encodedSizeWithTag(6, c1da72.margin_bottom) + protoAdapter2.encodedSizeWithTag(7, c1da72.margin_right) + c1da72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1DA7 c1da7) {
        }
    };
    public String dark_url;
    public Long height;
    public String light_url;
    public Long margin_bottom;
    public Long margin_right;
    public Long margin_top;
    public Long width;

    public C1DA7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1DA8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
