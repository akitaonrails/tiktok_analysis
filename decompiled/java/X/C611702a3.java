package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02a3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C611702a3 extends Message<C611702a3, C611802a4> {
    public static final ProtoAdapter<C611702a3> ADAPTER = new ProtoAdapter<C611702a3>() { // from class: X.02a2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C611702a3 decode(ProtoReader protoReader) {
            C611702a3 c611702a3 = new C611702a3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c611702a3.sid = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c611702a3.rtmp_pull_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c611702a3.rtmp_push_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c611702a3.provider = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c611702a3.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c611702a3.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c611702a3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C611702a3 c611702a3) {
            C611702a3 c611702a32 = c611702a3;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c611702a32.sid);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c611702a32.rtmp_pull_url) + protoAdapter.encodedSizeWithTag(3, c611702a32.rtmp_push_url) + ProtoAdapter.INT32.encodedSizeWithTag(4, c611702a32.provider) + protoAdapter.encodedSizeWithTag(5, c611702a32.extra) + protoAdapter.encodedSizeWithTag(6, c611702a32.id) + c611702a32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C611702a3 c611702a3) {
            C611702a3 c611702a32 = c611702a3;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c611702a32.sid);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c611702a32.rtmp_pull_url);
            protoAdapter.encodeWithTag(protoWriter, 3, c611702a32.rtmp_push_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c611702a32.provider);
            protoAdapter.encodeWithTag(protoWriter, 5, c611702a32.extra);
            protoAdapter.encodeWithTag(protoWriter, 6, c611702a32.id);
            protoWriter.writeBytes(c611702a32.unknownFields());
        }
    };
    public String extra;
    public String id;
    public Integer provider;
    public String rtmp_pull_url;
    public String rtmp_push_url;
    public Long sid;

    public C611702a3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C611802a4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
