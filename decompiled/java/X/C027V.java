package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027V, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027V extends Message<C027V, C02MC> {
    public static final ProtoAdapter<C027V> ADAPTER = new ProtoAdapter<C027V>() { // from class: X.023P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027V decode(ProtoReader protoReader) {
            C027V c027v = new C027V();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027v.story_lite_metadata.add(C02CE.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c027v.latest_story_view_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c027v.user_story_change_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c027v.story_celebration_list.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            c027v.story_badge_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c027v.post_type_to_counts.add(C02FT.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c027v.disable_story_circle_scenes.add(ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027v;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027V c027v) {
            C027V c027v2 = c027v;
            int iEncodedSizeWithTag = C02CE.ADAPTER.asRepeated().encodedSizeWithTag(1, c027v2.story_lite_metadata);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c027v2.latest_story_view_time) + protoAdapter.encodedSizeWithTag(3, c027v2.user_story_change_time);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.asRepeated().encodedSizeWithTag(4, c027v2.story_celebration_list) + C673002jw.ADAPTER.encodedSizeWithTag(5, c027v2.story_badge_url) + C02FT.ADAPTER.asRepeated().encodedSizeWithTag(6, c027v2.post_type_to_counts) + protoAdapter2.asRepeated().encodedSizeWithTag(7, c027v2.disable_story_circle_scenes) + c027v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C027V c027v) {
            C027V c027v2 = c027v;
            C02CE.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c027v2.story_lite_metadata);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c027v2.latest_story_view_time);
            protoAdapter.encodeWithTag(protoWriter, 3, c027v2.user_story_change_time);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 4, c027v2.story_celebration_list);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 5, c027v2.story_badge_url);
            C02FT.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, c027v2.post_type_to_counts);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 7, c027v2.disable_story_circle_scenes);
            protoWriter.writeBytes(c027v2.unknownFields());
        }
    };
    public List<Integer> disable_story_circle_scenes;
    public Long latest_story_view_time;
    public List<C02FT> post_type_to_counts;
    public C673002jw story_badge_url;
    public List<Integer> story_celebration_list;
    public List<C02CE> story_lite_metadata;
    public Long user_story_change_time;

    public C027V() {
        super(ADAPTER, ByteString.EMPTY);
        this.story_lite_metadata = C1516540pZE.LJIIIIZZ();
        this.story_celebration_list = C1516540pZE.LJIIIIZZ();
        this.post_type_to_counts = C1516540pZE.LJIIIIZZ();
        this.disable_story_circle_scenes = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02MC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
