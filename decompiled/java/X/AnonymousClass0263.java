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

/* JADX INFO: renamed from: X.0263, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0263 extends Message<AnonymousClass0263, C02IQ> {
    public static final ProtoAdapter<AnonymousClass0263> ADAPTER = new ProtoAdapter<AnonymousClass0263>() { // from class: X.022o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0263 decode(ProtoReader protoReader) {
            AnonymousClass0263 anonymousClass0263 = new AnonymousClass0263();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0263.act_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0263.image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0263.jump_web_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0263.jump_open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0263.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0263.start_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0263.end_time = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0263.time_range.add(C598802Ve.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0263.track_url_list = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0263.click_track_url_list = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0263;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0263 anonymousClass0263) {
            AnonymousClass0263 anonymousClass02632 = anonymousClass0263;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, anonymousClass02632.act_type);
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, anonymousClass02632.image);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, anonymousClass02632.jump_web_url) + protoAdapter2.encodedSizeWithTag(4, anonymousClass02632.jump_open_url) + protoAdapter2.encodedSizeWithTag(5, anonymousClass02632.title);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(6, anonymousClass02632.start_time) + protoAdapter3.encodedSizeWithTag(7, anonymousClass02632.end_time) + C598802Ve.ADAPTER.asRepeated().encodedSizeWithTag(8, anonymousClass02632.time_range) + protoAdapter.encodedSizeWithTag(9, anonymousClass02632.track_url_list) + protoAdapter.encodedSizeWithTag(10, anonymousClass02632.click_track_url_list) + anonymousClass02632.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0263 anonymousClass0263) {
            AnonymousClass0263 anonymousClass02632 = anonymousClass0263;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, anonymousClass02632.act_type);
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02632.image);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, anonymousClass02632.jump_web_url);
            protoAdapter2.encodeWithTag(protoWriter, 4, anonymousClass02632.jump_open_url);
            protoAdapter2.encodeWithTag(protoWriter, 5, anonymousClass02632.title);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 6, anonymousClass02632.start_time);
            protoAdapter3.encodeWithTag(protoWriter, 7, anonymousClass02632.end_time);
            C598802Ve.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, anonymousClass02632.time_range);
            protoAdapter.encodeWithTag(protoWriter, 9, anonymousClass02632.track_url_list);
            protoAdapter.encodeWithTag(protoWriter, 10, anonymousClass02632.click_track_url_list);
            protoWriter.writeBytes(anonymousClass02632.unknownFields());
        }
    };
    public Integer act_type;
    public C673002jw click_track_url_list;
    public Long end_time;
    public C673002jw image;
    public String jump_open_url;
    public String jump_web_url;
    public Long start_time;
    public List<C598802Ve> time_range;
    public String title;
    public C673002jw track_url_list;

    public AnonymousClass0263() {
        super(ADAPTER, ByteString.EMPTY);
        this.time_range = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
