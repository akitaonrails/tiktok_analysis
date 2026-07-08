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

/* JADX INFO: renamed from: X.1CCQ, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CCQ extends Message<C1CCQ, C1CCR> {
    public static final ProtoAdapter<C1CCQ> ADAPTER = new ProtoAdapter<C1CCQ>() { // from class: X.1CCP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CCQ decode(ProtoReader protoReader) {
            C1CCQ c1ccq = new C1CCQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1ccq.has_ai_topic = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c1ccq.topic_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1ccq.category_list.add(C1CCN.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c1ccq.eligible_video = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c1ccq.topic_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1ccq.topic_sub_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1ccq.copyright = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1ccq.learn_more_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1ccq.learn_more_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1ccq.not_eligible_reason = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1ccq.topic_sub_description_header = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ccq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CCQ c1ccq) {
            C1CCQ c1ccq2 = c1ccq;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1ccq2.has_ai_topic);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1ccq2.topic_name) + C1CCN.ADAPTER.asRepeated().encodedSizeWithTag(3, c1ccq2.category_list) + protoAdapter.encodedSizeWithTag(4, c1ccq2.eligible_video) + protoAdapter2.encodedSizeWithTag(5, c1ccq2.topic_description) + protoAdapter2.encodedSizeWithTag(6, c1ccq2.topic_sub_description) + protoAdapter2.encodedSizeWithTag(7, c1ccq2.copyright) + protoAdapter2.encodedSizeWithTag(8, c1ccq2.learn_more_text) + protoAdapter2.encodedSizeWithTag(9, c1ccq2.learn_more_link) + ProtoAdapter.INT32.encodedSizeWithTag(10, c1ccq2.not_eligible_reason) + protoAdapter2.encodedSizeWithTag(11, c1ccq2.topic_sub_description_header) + c1ccq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CCQ c1ccq) {
            C1CCQ c1ccq2 = c1ccq;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c1ccq2.has_ai_topic);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1ccq2.topic_name);
            C1CCN.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c1ccq2.category_list);
            protoAdapter.encodeWithTag(protoWriter, 4, c1ccq2.eligible_video);
            protoAdapter2.encodeWithTag(protoWriter, 5, c1ccq2.topic_description);
            protoAdapter2.encodeWithTag(protoWriter, 6, c1ccq2.topic_sub_description);
            protoAdapter2.encodeWithTag(protoWriter, 7, c1ccq2.copyright);
            protoAdapter2.encodeWithTag(protoWriter, 8, c1ccq2.learn_more_text);
            protoAdapter2.encodeWithTag(protoWriter, 9, c1ccq2.learn_more_link);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 10, c1ccq2.not_eligible_reason);
            protoAdapter2.encodeWithTag(protoWriter, 11, c1ccq2.topic_sub_description_header);
            protoWriter.writeBytes(c1ccq2.unknownFields());
        }
    };
    public List<C1CCN> category_list;
    public String copyright;
    public Boolean eligible_video;
    public Boolean has_ai_topic;
    public String learn_more_link;
    public String learn_more_text;
    public Integer not_eligible_reason;
    public String topic_description;
    public String topic_name;
    public String topic_sub_description;
    public String topic_sub_description_header;

    public C1CCQ() {
        super(ADAPTER, ByteString.EMPTY);
        this.category_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1CCR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
