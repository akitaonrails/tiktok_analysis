package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5436029y extends Message<C5436029y, C566202Iq> {
    public static final ProtoAdapter<C5436029y> ADAPTER = new ProtoAdapter<C5436029y>() { // from class: X.024u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5436029y decode(ProtoReader protoReader) {
            C5436029y c5436029y = new C5436029y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5436029y.rec_reasons.add(C557702Fj.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c5436029y.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5436029y.body = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5436029y.sub_body = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5436029y.url_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5436029y.url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5436029y.button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5436029y.biz_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5436029y;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5436029y c5436029y) {
            C5436029y c5436029y2 = c5436029y;
            int iEncodedSizeWithTag = C557702Fj.ADAPTER.asRepeated().encodedSizeWithTag(1, c5436029y2.rec_reasons);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c5436029y2.title) + protoAdapter.encodedSizeWithTag(3, c5436029y2.body) + protoAdapter.encodedSizeWithTag(4, c5436029y2.sub_body) + protoAdapter.encodedSizeWithTag(5, c5436029y2.url_text) + protoAdapter.encodedSizeWithTag(6, c5436029y2.url) + protoAdapter.encodedSizeWithTag(7, c5436029y2.button_text) + protoAdapter.encodedSizeWithTag(8, c5436029y2.biz_type) + c5436029y2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5436029y c5436029y) {
            C5436029y c5436029y2 = c5436029y;
            C557702Fj.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c5436029y2.rec_reasons);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c5436029y2.title);
            protoAdapter.encodeWithTag(protoWriter, 3, c5436029y2.body);
            protoAdapter.encodeWithTag(protoWriter, 4, c5436029y2.sub_body);
            protoAdapter.encodeWithTag(protoWriter, 5, c5436029y2.url_text);
            protoAdapter.encodeWithTag(protoWriter, 6, c5436029y2.url);
            protoAdapter.encodeWithTag(protoWriter, 7, c5436029y2.button_text);
            protoAdapter.encodeWithTag(protoWriter, 8, c5436029y2.biz_type);
            protoWriter.writeBytes(c5436029y2.unknownFields());
        }
    };
    public String biz_type;
    public String body;
    public String button_text;
    public List<C557702Fj> rec_reasons;
    public String sub_body;
    public String title;
    public String url;
    public String url_text;

    public C5436029y() {
        super(ADAPTER, ByteString.EMPTY);
        this.rec_reasons = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C566202Iq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
