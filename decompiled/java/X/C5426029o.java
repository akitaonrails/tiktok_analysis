package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5426029o extends Message<C5426029o, C02ML> {
    public static final ProtoAdapter<C5426029o> ADAPTER = new ProtoAdapter<C5426029o>() { // from class: X.025L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5426029o decode(ProtoReader protoReader) {
            C5426029o c5426029o = new C5426029o();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5426029o.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5426029o.schema_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5426029o.icons.add(C673002jw.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c5426029o.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5426029o.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5426029o.button_desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5426029o.button_bg = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5426029o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5426029o c5426029o) {
            C5426029o c5426029o2 = c5426029o;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5426029o2.schema) + protoAdapter.encodedSizeWithTag(2, c5426029o2.schema_desc);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(3, c5426029o2.icons) + protoAdapter.encodedSizeWithTag(4, c5426029o2.title) + protoAdapter.encodedSizeWithTag(5, c5426029o2.description) + protoAdapter.encodedSizeWithTag(6, c5426029o2.button_desc) + protoAdapter2.encodedSizeWithTag(7, c5426029o2.button_bg) + c5426029o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5426029o c5426029o) {
            C5426029o c5426029o2 = c5426029o;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5426029o2.schema);
            protoAdapter.encodeWithTag(protoWriter, 2, c5426029o2.schema_desc);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, c5426029o2.icons);
            protoAdapter.encodeWithTag(protoWriter, 4, c5426029o2.title);
            protoAdapter.encodeWithTag(protoWriter, 5, c5426029o2.description);
            protoAdapter.encodeWithTag(protoWriter, 6, c5426029o2.button_desc);
            protoAdapter2.encodeWithTag(protoWriter, 7, c5426029o2.button_bg);
            protoWriter.writeBytes(c5426029o2.unknownFields());
        }
    };
    public C673002jw button_bg;
    public String button_desc;
    public String description;
    public List<C673002jw> icons;
    public String schema;
    public String schema_desc;
    public String title;

    public C5426029o() {
        super(ADAPTER, ByteString.EMPTY);
        this.icons = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02ML newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
