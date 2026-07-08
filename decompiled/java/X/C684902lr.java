package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C684902lr extends Message<C684902lr, C685002ls> {
    public static final ProtoAdapter<C684902lr> ADAPTER = new ProtoAdapter<C684902lr>() { // from class: X.02lq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C684902lr decode(ProtoReader protoReader) {
            C684902lr c684902lr = new C684902lr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c684902lr.now = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c684902lr.logid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c684902lr.fatal_item_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            c684902lr.search_request_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c684902lr.server_stream_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c684902lr.api_debug_info.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c684902lr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C684902lr c684902lr) {
            C684902lr c684902lr2 = c684902lr;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c684902lr2.now);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c684902lr2.logid) + protoAdapter2.asRepeated().encodedSizeWithTag(3, c684902lr2.fatal_item_ids) + protoAdapter2.encodedSizeWithTag(4, c684902lr2.search_request_id) + protoAdapter.encodedSizeWithTag(5, c684902lr2.server_stream_time) + protoAdapter2.asRepeated().encodedSizeWithTag(6, c684902lr2.api_debug_info) + c684902lr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C684902lr c684902lr) {
            C684902lr c684902lr2 = c684902lr;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c684902lr2.now);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c684902lr2.logid);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, c684902lr2.fatal_item_ids);
            protoAdapter2.encodeWithTag(protoWriter, 4, c684902lr2.search_request_id);
            protoAdapter.encodeWithTag(protoWriter, 5, c684902lr2.server_stream_time);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, c684902lr2.api_debug_info);
            protoWriter.writeBytes(c684902lr2.unknownFields());
        }
    };
    public List<String> api_debug_info;
    public List<String> fatal_item_ids;
    public String logid;
    public Long now;
    public String search_request_id;
    public Long server_stream_time;

    public C684902lr() {
        super(ADAPTER, ByteString.EMPTY);
        this.fatal_item_ids = C1516540pZE.LJIIIIZZ();
        this.api_debug_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C685002ls newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
