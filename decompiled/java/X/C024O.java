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

/* JADX INFO: renamed from: X.024O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C024O extends Message<C024O, C567302Jb> {
    public static final ProtoAdapter<C024O> ADAPTER = new ProtoAdapter<C024O>() { // from class: X.022W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C024O decode(ProtoReader protoReader) {
            C024O c024o = new C024O();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c024o.topic_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c024o.from_item_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c024o.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c024o.user_avatars.add(C02FR.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c024o.videos_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c024o.from_question = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c024o.add_yours_invitees.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 8:
                            c024o.viewer_is_invited = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c024o.shark_status = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c024o.shoot_from = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c024o.topic_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c024o.eoy_campaign = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c024o.eoy_campaign_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c024o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C024O c024o) {
            C024O c024o2 = c024o;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c024o2.topic_id) + protoAdapter.encodedSizeWithTag(2, c024o2.from_item_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c024o2.text) + C02FR.ADAPTER.asRepeated().encodedSizeWithTag(4, c024o2.user_avatars) + protoAdapter.encodedSizeWithTag(5, c024o2.videos_count);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c024o2.from_question) + protoAdapter.asRepeated().encodedSizeWithTag(7, c024o2.add_yours_invitees) + protoAdapter3.encodedSizeWithTag(8, c024o2.viewer_is_invited) + protoAdapter.encodedSizeWithTag(9, c024o2.shark_status);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(10, c024o2.shoot_from) + protoAdapter4.encodedSizeWithTag(11, c024o2.topic_type) + protoAdapter3.encodedSizeWithTag(12, c024o2.eoy_campaign) + protoAdapter2.encodedSizeWithTag(13, c024o2.eoy_campaign_schema) + c024o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C024O c024o) {
            C024O c024o2 = c024o;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c024o2.topic_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c024o2.from_item_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c024o2.text);
            C02FR.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c024o2.user_avatars);
            protoAdapter.encodeWithTag(protoWriter, 5, c024o2.videos_count);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 6, c024o2.from_question);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 7, c024o2.add_yours_invitees);
            protoAdapter3.encodeWithTag(protoWriter, 8, c024o2.viewer_is_invited);
            protoAdapter.encodeWithTag(protoWriter, 9, c024o2.shark_status);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            protoAdapter4.encodeWithTag(protoWriter, 10, c024o2.shoot_from);
            protoAdapter4.encodeWithTag(protoWriter, 11, c024o2.topic_type);
            protoAdapter3.encodeWithTag(protoWriter, 12, c024o2.eoy_campaign);
            protoAdapter2.encodeWithTag(protoWriter, 13, c024o2.eoy_campaign_schema);
            protoWriter.writeBytes(c024o2.unknownFields());
        }
    };
    public List<Long> add_yours_invitees;
    public Boolean eoy_campaign;
    public String eoy_campaign_schema;
    public Long from_item_id;
    public Boolean from_question;
    public Long shark_status;
    public Integer shoot_from;
    public String text;
    public Long topic_id;
    public Integer topic_type;
    public List<C02FR> user_avatars;
    public Long videos_count;
    public Boolean viewer_is_invited;

    public C024O() {
        super(ADAPTER, ByteString.EMPTY);
        this.user_avatars = C1516540pZE.LJIIIIZZ();
        this.add_yours_invitees = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C567302Jb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
