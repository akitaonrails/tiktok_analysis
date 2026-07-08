package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAG, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DAG extends Message<C1DAG, C1DAH> {
    public static final ProtoAdapter<C1DAG> ADAPTER = new ProtoAdapter<C1DAG>() { // from class: X.1DAF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DAG decode(ProtoReader protoReader) {
            C1DAG c1dag = new C1DAG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dag.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1dag.extras.add(C1DAD.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c1dag.images.add(C1DA7.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c1dag.color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1dag.color_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1dag.prefix_element = C2223401C0k.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1dag.suffix_element = C2223401C0k.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dag;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DAG c1dag) {
            C1DAG c1dag2 = c1dag;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1dag2.text) + C1DAD.ADAPTER.asRepeated().encodedSizeWithTag(2, c1dag2.extras) + C1DA7.ADAPTER.asRepeated().encodedSizeWithTag(3, c1dag2.images) + protoAdapter.encodedSizeWithTag(4, c1dag2.color) + protoAdapter.encodedSizeWithTag(5, c1dag2.color_dark);
            ProtoAdapter<C2223401C0k> protoAdapter2 = C2223401C0k.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, c1dag2.prefix_element) + protoAdapter2.encodedSizeWithTag(7, c1dag2.suffix_element) + c1dag2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1DAG c1dag) {
        }
    };
    public String color;
    public String color_dark;
    public List<C1DAD> extras;
    public List<C1DA7> images;
    public C2223401C0k prefix_element;
    public C2223401C0k suffix_element;
    public String text;

    public C1DAG() {
        super(ADAPTER, ByteString.EMPTY);
        this.extras = C1516540pZE.LJIIIIZZ();
        this.images = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1DAH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
