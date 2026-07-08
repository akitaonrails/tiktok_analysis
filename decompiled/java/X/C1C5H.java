package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C5H extends Message<C1C5H, C1C5I> {
    public static final ProtoAdapter<C1C5H> ADAPTER = new ProtoAdapter<C1C5H>() { // from class: X.1C5G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C5H decode(ProtoReader protoReader) {
            C1C5H c1c5h = new C1C5H();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1c5h.width = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1c5h.height = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c1c5h.size = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1c5h.bitrate = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1c5h.definition = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1c5h.quality = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c5h;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C5H c1c5h) {
            C1C5H c1c5h2 = c1c5h;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c1c5h2.width) + protoAdapter.encodedSizeWithTag(2, c1c5h2.height) + protoAdapter.encodedSizeWithTag(3, c1c5h2.size) + protoAdapter.encodedSizeWithTag(4, c1c5h2.bitrate) + ProtoAdapter.STRING.encodedSizeWithTag(5, c1c5h2.definition) + protoAdapter.encodedSizeWithTag(6, c1c5h2.quality) + c1c5h2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C5H c1c5h) {
            C1C5H c1c5h2 = c1c5h;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c5h2.width);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c5h2.height);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c5h2.size);
            protoAdapter.encodeWithTag(protoWriter, 4, c1c5h2.bitrate);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, c1c5h2.definition);
            protoAdapter.encodeWithTag(protoWriter, 6, c1c5h2.quality);
            protoWriter.writeBytes(c1c5h2.unknownFields());
        }
    };
    public Long bitrate;
    public String definition;
    public Long height;
    public Long quality;
    public Long size;
    public Long width;

    public C1C5H() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C5I newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
