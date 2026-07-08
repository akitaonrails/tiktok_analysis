package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226971CEd extends Message<C2226971CEd, C2226981CEe> {
    public static final ProtoAdapter<C2226971CEd> ADAPTER = new ProtoAdapter<C2226971CEd>() { // from class: X.1CEc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226971CEd decode(ProtoReader protoReader) {
            C2226971CEd c2226971CEd = new C2226971CEd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2226971CEd.story_list.add(C1CEX.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c2226971CEd.offset = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2226971CEd.total = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2226971CEd.min_cursor = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2226971CEd.max_cursor = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2226971CEd.folder_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2226971CEd.head_cursor = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2226971CEd.tail_cursor = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2226971CEd.need_normal = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2226971CEd.has_insert_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2226971CEd.is_ttl_story = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2226971CEd.has_insert_create_time = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226971CEd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226971CEd c2226971CEd) {
            C2226971CEd c2226971CEd2 = c2226971CEd;
            int iEncodedSizeWithTag = C1CEX.ADAPTER.asRepeated().encodedSizeWithTag(1, c2226971CEd2.story_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2226971CEd2.offset) + protoAdapter.encodedSizeWithTag(3, c2226971CEd2.total);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, c2226971CEd2.min_cursor) + protoAdapter2.encodedSizeWithTag(5, c2226971CEd2.max_cursor);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(6, c2226971CEd2.folder_id) + protoAdapter2.encodedSizeWithTag(7, c2226971CEd2.head_cursor) + protoAdapter2.encodedSizeWithTag(8, c2226971CEd2.tail_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(9, c2226971CEd2.need_normal) + protoAdapter3.encodedSizeWithTag(10, c2226971CEd2.has_insert_id) + protoAdapter.encodedSizeWithTag(11, c2226971CEd2.is_ttl_story) + protoAdapter3.encodedSizeWithTag(12, c2226971CEd2.has_insert_create_time) + c2226971CEd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226971CEd c2226971CEd) {
            C2226971CEd c2226971CEd2 = c2226971CEd;
            C1CEX.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2226971CEd2.story_list);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c2226971CEd2.offset);
            protoAdapter.encodeWithTag(protoWriter, 3, c2226971CEd2.total);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 4, c2226971CEd2.min_cursor);
            protoAdapter2.encodeWithTag(protoWriter, 5, c2226971CEd2.max_cursor);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 6, c2226971CEd2.folder_id);
            protoAdapter2.encodeWithTag(protoWriter, 7, c2226971CEd2.head_cursor);
            protoAdapter2.encodeWithTag(protoWriter, 8, c2226971CEd2.tail_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 9, c2226971CEd2.need_normal);
            protoAdapter3.encodeWithTag(protoWriter, 10, c2226971CEd2.has_insert_id);
            protoAdapter.encodeWithTag(protoWriter, 11, c2226971CEd2.is_ttl_story);
            protoAdapter3.encodeWithTag(protoWriter, 12, c2226971CEd2.has_insert_create_time);
            protoWriter.writeBytes(c2226971CEd2.unknownFields());
        }
    };
    public String folder_id;
    public String has_insert_create_time;
    public String has_insert_id;
    public Long head_cursor;
    public Integer is_ttl_story;
    public Long max_cursor;
    public Long min_cursor;
    public Boolean need_normal;
    public Integer offset;
    public List<C1CEX> story_list;
    public Long tail_cursor;
    public Integer total;

    public C2226971CEd() {
        super(ADAPTER, ByteString.EMPTY);
        this.story_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2226981CEe newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
