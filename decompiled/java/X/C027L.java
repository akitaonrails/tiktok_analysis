package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027L, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027L extends Message<C027L, C565602Ik> {
    public static final ProtoAdapter<C027L> ADAPTER = new ProtoAdapter<C027L>() { // from class: X.023C
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027L decode(ProtoReader protoReader) {
            C027L c027l = new C027L();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027l.collection_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c027l.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c027l.cover = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c027l.num_watched = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c027l.theme_tag_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c027l.start_time_in_ms = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c027l.end_time_in_ms = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c027l.video_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027L c027l) {
            C027L c027l2 = c027l;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c027l2.collection_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c027l2.title) + C673002jw.ADAPTER.encodedSizeWithTag(3, c027l2.cover) + ProtoAdapter.INT32.encodedSizeWithTag(4, c027l2.num_watched) + protoAdapter2.asRepeated().encodedSizeWithTag(5, c027l2.theme_tag_list) + protoAdapter.encodedSizeWithTag(6, c027l2.start_time_in_ms) + protoAdapter.encodedSizeWithTag(7, c027l2.end_time_in_ms) + protoAdapter.encodedSizeWithTag(8, c027l2.video_id) + c027l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C027L c027l) {
            C027L c027l2 = c027l;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c027l2.collection_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c027l2.title);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c027l2.cover);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c027l2.num_watched);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, c027l2.theme_tag_list);
            protoAdapter.encodeWithTag(protoWriter, 6, c027l2.start_time_in_ms);
            protoAdapter.encodeWithTag(protoWriter, 7, c027l2.end_time_in_ms);
            protoAdapter.encodeWithTag(protoWriter, 8, c027l2.video_id);
            protoWriter.writeBytes(c027l2.unknownFields());
        }
    };
    public Long collection_id;
    public C673002jw cover;
    public Long end_time_in_ms;
    public Integer num_watched;
    public Long start_time_in_ms;
    public List<String> theme_tag_list;
    public String title;
    public Long video_id;

    public C027L() {
        super(ADAPTER, ByteString.EMPTY);
        this.theme_tag_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C565602Ik newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
