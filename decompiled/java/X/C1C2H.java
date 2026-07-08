package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C2H, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C2H extends Message<C1C2H, C1C2I> {
    public static final ProtoAdapter<C1C2H> ADAPTER = new ProtoAdapter<C1C2H>() { // from class: X.1C2G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C2H decode(ProtoReader protoReader) {
            C1C2H c1c2h = new C1C2H();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1c2h.popup_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1c2h.title = C1C1K.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c1c2h.subtitle.add(C1C1K.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c1c2h.icon = C741902v3.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c1c2h.button = C1C2E.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1c2h.show_close_icon = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c1c2h.jump_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c2h;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C2H c1c2h) {
            C1C2H c1c2h2 = c1c2h;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c1c2h2.popup_type);
            ProtoAdapter<C1C1K> protoAdapter = C1C1K.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1c2h2.title) + protoAdapter.asRepeated().encodedSizeWithTag(3, c1c2h2.subtitle) + C741902v3.ADAPTER.encodedSizeWithTag(4, c1c2h2.icon) + C1C2E.ADAPTER.encodedSizeWithTag(5, c1c2h2.button) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c1c2h2.show_close_icon) + ProtoAdapter.STRING.encodedSizeWithTag(7, c1c2h2.jump_schema) + c1c2h2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C2H c1c2h) {
        }
    };
    public C1C2E button;
    public C741902v3 icon;
    public String jump_schema;
    public Integer popup_type;
    public Boolean show_close_icon;
    public List<C1C1K> subtitle;
    public C1C1K title;

    public C1C2H() {
        super(ADAPTER, ByteString.EMPTY);
        this.subtitle = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C2I newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
