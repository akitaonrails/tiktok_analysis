package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5425029n extends Message<C5425029n, C02J4> {
    public static final ProtoAdapter<C5425029n> ADAPTER = new ProtoAdapter<C5425029n>() { // from class: X.025H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5425029n decode(ProtoReader protoReader) {
            C5425029n c5425029n = new C5425029n();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5425029n.survey_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5425029n.conent_scope = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5425029n.biz_params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5425029n.content_scope = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5425029n.replace = C568502Jn.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5425029n.triggers.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 7:
                            c5425029n.cover_image_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5425029n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5425029n c5425029n) {
            C5425029n c5425029n2 = c5425029n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c5425029n2.survey_key) + protoAdapter.encodedSizeWithTag(2, c5425029n2.conent_scope) + protoAdapter.encodedSizeWithTag(3, c5425029n2.biz_params) + protoAdapter.encodedSizeWithTag(4, c5425029n2.content_scope) + C568502Jn.ADAPTER.encodedSizeWithTag(5, c5425029n2.replace) + ProtoAdapter.INT32.asRepeated().encodedSizeWithTag(6, c5425029n2.triggers) + protoAdapter.encodedSizeWithTag(7, c5425029n2.cover_image_color) + c5425029n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5425029n c5425029n) {
            C5425029n c5425029n2 = c5425029n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5425029n2.survey_key);
            protoAdapter.encodeWithTag(protoWriter, 2, c5425029n2.conent_scope);
            protoAdapter.encodeWithTag(protoWriter, 3, c5425029n2.biz_params);
            protoAdapter.encodeWithTag(protoWriter, 4, c5425029n2.content_scope);
            C568502Jn.ADAPTER.encodeWithTag(protoWriter, 5, c5425029n2.replace);
            ProtoAdapter.INT32.asRepeated().encodeWithTag(protoWriter, 6, c5425029n2.triggers);
            protoAdapter.encodeWithTag(protoWriter, 7, c5425029n2.cover_image_color);
            protoWriter.writeBytes(c5425029n2.unknownFields());
        }
    };
    public String biz_params;
    public String conent_scope;
    public String content_scope;
    public String cover_image_color;
    public C568502Jn replace;
    public String survey_key;
    public List<Integer> triggers;

    public C5425029n() {
        super(ADAPTER, ByteString.EMPTY);
        this.triggers = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02J4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
