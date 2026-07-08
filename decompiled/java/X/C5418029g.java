package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5418029g extends Message<C5418029g, C567202Ja> {
    public static final ProtoAdapter<C5418029g> ADAPTER = new ProtoAdapter<C5418029g>() { // from class: X.0245
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5418029g decode(ProtoReader protoReader) {
            C5418029g c5418029g = new C5418029g();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5418029g.status_code = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c5418029g.status_msg = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5418029g.source = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c5418029g.page_token = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5418029g.has_more = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c5418029g.feed_data.add(C549202Cc.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c5418029g.last_view_item_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5418029g;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5418029g c5418029g) {
            C5418029g c5418029g2 = c5418029g;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5418029g2.status_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5418029g2.status_msg) + protoAdapter.encodedSizeWithTag(3, c5418029g2.source) + protoAdapter2.encodedSizeWithTag(4, c5418029g2.page_token) + ProtoAdapter.BOOL.encodedSizeWithTag(5, c5418029g2.has_more) + C549202Cc.ADAPTER.asRepeated().encodedSizeWithTag(6, c5418029g2.feed_data) + protoAdapter2.encodedSizeWithTag(7, c5418029g2.last_view_item_id) + c5418029g2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5418029g c5418029g) {
            C5418029g c5418029g2 = c5418029g;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c5418029g2.status_code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c5418029g2.status_msg);
            protoAdapter.encodeWithTag(protoWriter, 3, c5418029g2.source);
            protoAdapter2.encodeWithTag(protoWriter, 4, c5418029g2.page_token);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, c5418029g2.has_more);
            C549202Cc.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, c5418029g2.feed_data);
            protoAdapter2.encodeWithTag(protoWriter, 7, c5418029g2.last_view_item_id);
            protoWriter.writeBytes(c5418029g2.unknownFields());
        }
    };
    public List<C549202Cc> feed_data;
    public Boolean has_more;
    public String last_view_item_id;
    public String page_token;
    public Integer source;
    public Integer status_code;
    public String status_msg;

    public C5418029g() {
        super(ADAPTER, ByteString.EMPTY);
        this.feed_data = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C567202Ja newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
