package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C544202Ae extends Message<C544202Ae, C582102Ot> {
    public static final ProtoAdapter<C544202Ae> ADAPTER = new ProtoAdapter<C544202Ae>() { // from class: X.0272
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C544202Ae decode(ProtoReader protoReader) {
            C544202Ae c544202Ae = new C544202Ae();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c544202Ae.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c544202Ae.safety_icons.add(C029C.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c544202Ae.sub_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c544202Ae.safety_texts.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            c544202Ae.disclaimer_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c544202Ae.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c544202Ae;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C544202Ae c544202Ae) {
            C544202Ae c544202Ae2 = c544202Ae;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c544202Ae2.title) + C029C.ADAPTER.asRepeated().encodedSizeWithTag(2, c544202Ae2.safety_icons) + protoAdapter.encodedSizeWithTag(3, c544202Ae2.sub_title) + protoAdapter.asRepeated().encodedSizeWithTag(4, c544202Ae2.safety_texts) + protoAdapter.encodedSizeWithTag(5, c544202Ae2.disclaimer_text) + protoAdapter.encodedSizeWithTag(6, c544202Ae2.schema) + c544202Ae2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C544202Ae c544202Ae) {
        }
    };
    public String disclaimer_text;
    public List<C029C> safety_icons;
    public List<String> safety_texts;
    public String schema;
    public String sub_title;
    public String title;

    public C544202Ae() {
        super(ADAPTER, ByteString.EMPTY);
        this.safety_icons = C1516540pZE.LJIIIIZZ();
        this.safety_texts = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C582102Ot newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
