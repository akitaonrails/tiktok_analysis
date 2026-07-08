package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGC extends Message<C1CGC, C1CGD> {
    public static final ProtoAdapter<C1CGC> ADAPTER = new ProtoAdapter<C1CGC>() { // from class: X.1CGB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGC decode(ProtoReader protoReader) {
            C1CGC c1cgc = new C1CGC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cgc.width = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1cgc.height = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1cgc.size = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1cgc.bitrate = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1cgc.definition = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1cgc.quality = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cgc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CGC c1cgc) {
            C1CGC c1cgc2 = c1cgc;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1cgc2.width) + protoAdapter.encodedSizeWithTag(2, c1cgc2.height) + protoAdapter.encodedSizeWithTag(3, c1cgc2.size) + protoAdapter.encodedSizeWithTag(4, c1cgc2.bitrate) + ProtoAdapter.STRING.encodedSizeWithTag(5, c1cgc2.definition) + protoAdapter.encodedSizeWithTag(6, c1cgc2.quality) + c1cgc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CGC c1cgc) {
            C1CGC c1cgc2 = c1cgc;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1cgc2.width);
            protoAdapter.encodeWithTag(protoWriter, 2, c1cgc2.height);
            protoAdapter.encodeWithTag(protoWriter, 3, c1cgc2.size);
            protoAdapter.encodeWithTag(protoWriter, 4, c1cgc2.bitrate);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c1cgc2.definition);
            protoAdapter.encodeWithTag(protoWriter, 6, c1cgc2.quality);
            protoWriter.writeBytes(c1cgc2.unknownFields());
        }
    };
    public Long bitrate;
    public String definition;
    public Long height;
    public Long quality;
    public Long size;
    public Long width;

    public C1CGC() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CGD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
