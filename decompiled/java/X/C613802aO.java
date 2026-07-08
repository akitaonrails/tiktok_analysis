package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02aO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C613802aO extends Message<C613802aO, C613902aP> {
    public static final ProtoAdapter<C613802aO> ADAPTER = new ProtoAdapter<C613802aO>() { // from class: X.02aN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C613802aO decode(ProtoReader protoReader) {
            C613802aO c613802aO = new C613802aO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c613802aO.uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c613802aO.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            c613802aO.height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c613802aO.width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c613802aO.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c613802aO.text_logo_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c613802aO;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C613802aO c613802aO) {
            C613802aO c613802aO2 = c613802aO;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c613802aO2.uri) + protoAdapter.asRepeated().encodedSizeWithTag(2, c613802aO2.url_list);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c613802aO2.height) + protoAdapter2.encodedSizeWithTag(4, c613802aO2.width) + protoAdapter.encodedSizeWithTag(5, c613802aO2.text) + protoAdapter2.encodedSizeWithTag(6, c613802aO2.text_logo_type) + c613802aO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C613802aO c613802aO) {
        }
    };
    public Integer height;
    public String text;
    public Integer text_logo_type;
    public String uri;
    public List<String> url_list;
    public Integer width;

    public C613802aO() {
        super(ADAPTER, ByteString.EMPTY);
        this.url_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C613902aP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
