package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C76, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C76 extends Message<C1C76, C1C77> {
    public static final ProtoAdapter<C1C76> ADAPTER = new ProtoAdapter<C1C76>() { // from class: X.1C75
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C76 decode(ProtoReader protoReader) {
            C1C76 c1c76 = new C1C76();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1c76.title = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c1c76.icon_list.add(C029C.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c1c76.desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1c76.popup_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1c76.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1c76.placement = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c1c76.arrow = C029C.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c76;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C76 c1c76) {
            C1C76 c1c762 = c1c76;
            int iEncodedSizeWithTag = C5431029t.ADAPTER.encodedSizeWithTag(1, c1c762.title);
            ProtoAdapter<C029C> protoAdapter = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(2, c1c762.icon_list);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c1c762.desc) + protoAdapter2.encodedSizeWithTag(4, c1c762.popup_schema) + protoAdapter2.encodedSizeWithTag(5, c1c762.da_info) + ProtoAdapter.INT32.encodedSizeWithTag(6, c1c762.placement) + protoAdapter.encodedSizeWithTag(7, c1c762.arrow) + c1c762.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C76 c1c76) {
        }
    };
    public C029C arrow;
    public String da_info;
    public String desc;
    public List<C029C> icon_list;
    public Integer placement;
    public String popup_schema;
    public C5431029t title;

    public C1C76() {
        super(ADAPTER, ByteString.EMPTY);
        this.icon_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C77 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
