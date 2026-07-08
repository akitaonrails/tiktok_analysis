package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CG9, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CG9 extends Message<C1CG9, C1CGA> {
    public static final ProtoAdapter<C1CG9> ADAPTER = new ProtoAdapter<C1CG9>() { // from class: X.1CG8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CG9 decode(ProtoReader protoReader) {
            C1CG9 c1cg9 = new C1CG9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cg9.source = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1cg9.height = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1cg9.width = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1cg9.poster = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1cg9.default_pic_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1cg9.video_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cg9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CG9 c1cg9) {
            C1CG9 c1cg92 = c1cg9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1cg92.source);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1cg92.height) + protoAdapter2.encodedSizeWithTag(3, c1cg92.width) + protoAdapter.encodedSizeWithTag(4, c1cg92.poster) + protoAdapter.encodedSizeWithTag(5, c1cg92.default_pic_url) + protoAdapter.encodedSizeWithTag(6, c1cg92.video_id) + c1cg92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CG9 c1cg9) {
            C1CG9 c1cg92 = c1cg9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cg92.source);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1cg92.height);
            protoAdapter2.encodeWithTag(protoWriter, 3, c1cg92.width);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cg92.poster);
            protoAdapter.encodeWithTag(protoWriter, 5, c1cg92.default_pic_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c1cg92.video_id);
            protoWriter.writeBytes(c1cg92.unknownFields());
        }
    };
    public String default_pic_url;
    public Long height;
    public String poster;
    public String source;
    public String video_id;
    public Long width;

    public C1CG9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CGA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
