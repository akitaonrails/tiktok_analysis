package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COL extends Message<C1COL, C1COM> {
    public static final ProtoAdapter<C1COL> ADAPTER = new ProtoAdapter<C1COL>() { // from class: X.1COK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1COL decode(ProtoReader protoReader) {
            C1COL c1col = new C1COL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1col.template = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1col.data_list.add(C1COI.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c1col.text_style = C1COF.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c1col.scene = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1col.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1col.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1col;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1COL c1col) {
            C1COL c1col2 = c1col;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1col2.template) + C1COI.ADAPTER.asRepeated().encodedSizeWithTag(2, c1col2.data_list) + C1COF.ADAPTER.encodedSizeWithTag(3, c1col2.text_style) + protoAdapter.encodedSizeWithTag(4, c1col2.scene) + protoAdapter.encodedSizeWithTag(5, c1col2.name) + protoAdapter.encodedSizeWithTag(6, c1col2.link) + c1col2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1COL c1col) {
        }
    };
    public List<C1COI> data_list;
    public String link;
    public String name;
    public String scene;
    public String template;
    public C1COF text_style;

    public C1COL() {
        super(ADAPTER, ByteString.EMPTY);
        this.data_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1COM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
