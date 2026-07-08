package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.029w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5434029w extends Message<C5434029w, C02PX> {
    public static final ProtoAdapter<C5434029w> ADAPTER = new ProtoAdapter<C5434029w>() { // from class: X.023r
        public final ProtoAdapter<Map<String, C5361027b>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C5361027b.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5434029w decode(ProtoReader protoReader) {
            C5434029w c5434029w = new C5434029w();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5434029w.template = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5434029w.arguments.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 3:
                            c5434029w.text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5434029w.text_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5434029w.text_color_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c5434029w.text_font_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5434029w;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5434029w c5434029w) {
            C5434029w c5434029w2 = c5434029w;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5434029w2.template) + this.LIZ.encodedSizeWithTag(2, c5434029w2.arguments) + protoAdapter.encodedSizeWithTag(3, c5434029w2.text_color) + protoAdapter.encodedSizeWithTag(4, c5434029w2.text_dark_color);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c5434029w2.text_color_type) + protoAdapter2.encodedSizeWithTag(6, c5434029w2.text_font_type) + c5434029w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5434029w c5434029w) {
        }
    };
    public Map<String, C5361027b> arguments;
    public String template;
    public String text_color;
    public Integer text_color_type;
    public String text_dark_color;
    public Integer text_font_type;

    @Override // com.squareup.wire.Message
    public C02PX newBuilder() {
        return null;
    }

    public C5434029w() {
        super(ADAPTER, ByteString.EMPTY);
        this.arguments = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
