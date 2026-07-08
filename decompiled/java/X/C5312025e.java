package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.025e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5312025e extends Message<C5312025e, C565102If> {
    public static final ProtoAdapter<C5312025e> ADAPTER = new ProtoAdapter<C5312025e>() { // from class: X.022b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5312025e decode(ProtoReader protoReader) {
            C5312025e c5312025e = new C5312025e();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5312025e.start = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c5312025e.end = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c5312025e.user_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5312025e.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c5312025e.hashtag_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5312025e.hashtag_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5312025e.is_commerce = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c5312025e.hashTagName = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5312025e.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5312025e.aweme_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5312025e.sub_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5312025e.question_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5312025e.line_idx = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            switch (iNextTag) {
                                case 23:
                                    c5312025e.tag_id = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    c5312025e.comment_id = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 25:
                                    c5312025e.is_third_party_highlight = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5312025e;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5312025e c5312025e) {
            C5312025e c5312025e2 = c5312025e;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5312025e2.start) + protoAdapter.encodedSizeWithTag(2, c5312025e2.end);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c5312025e2.user_id) + protoAdapter.encodedSizeWithTag(4, c5312025e2.type) + protoAdapter2.encodedSizeWithTag(5, c5312025e2.hashtag_name) + protoAdapter2.encodedSizeWithTag(6, c5312025e2.hashtag_id);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c5312025e2.is_commerce) + protoAdapter2.encodedSizeWithTag(8, c5312025e2.hashTagName) + protoAdapter2.encodedSizeWithTag(9, c5312025e2.sec_uid) + protoAdapter2.encodedSizeWithTag(10, c5312025e2.aweme_id) + protoAdapter.encodedSizeWithTag(11, c5312025e2.sub_type);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(12, c5312025e2.question_id) + protoAdapter.encodedSizeWithTag(13, c5312025e2.line_idx) + protoAdapter2.encodedSizeWithTag(23, c5312025e2.tag_id) + protoAdapter4.encodedSizeWithTag(24, c5312025e2.comment_id) + protoAdapter3.encodedSizeWithTag(25, c5312025e2.is_third_party_highlight) + c5312025e2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5312025e c5312025e) {
            C5312025e c5312025e2 = c5312025e;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c5312025e2.start);
            protoAdapter.encodeWithTag(protoWriter, 2, c5312025e2.end);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c5312025e2.user_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c5312025e2.type);
            protoAdapter2.encodeWithTag(protoWriter, 5, c5312025e2.hashtag_name);
            protoAdapter2.encodeWithTag(protoWriter, 6, c5312025e2.hashtag_id);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 7, c5312025e2.is_commerce);
            protoAdapter2.encodeWithTag(protoWriter, 8, c5312025e2.hashTagName);
            protoAdapter2.encodeWithTag(protoWriter, 9, c5312025e2.sec_uid);
            protoAdapter2.encodeWithTag(protoWriter, 10, c5312025e2.aweme_id);
            protoAdapter.encodeWithTag(protoWriter, 11, c5312025e2.sub_type);
            ProtoAdapter<Long> protoAdapter4 = ProtoAdapter.INT64;
            protoAdapter4.encodeWithTag(protoWriter, 12, c5312025e2.question_id);
            protoAdapter.encodeWithTag(protoWriter, 13, c5312025e2.line_idx);
            protoAdapter2.encodeWithTag(protoWriter, 23, c5312025e2.tag_id);
            protoAdapter4.encodeWithTag(protoWriter, 24, c5312025e2.comment_id);
            protoAdapter3.encodeWithTag(protoWriter, 25, c5312025e2.is_third_party_highlight);
            protoWriter.writeBytes(c5312025e2.unknownFields());
        }
    };
    public String aweme_id;
    public Long comment_id;
    public Integer end;
    public String hashTagName;
    public String hashtag_id;
    public String hashtag_name;
    public Boolean is_commerce;
    public Boolean is_third_party_highlight;
    public Integer line_idx;
    public Long question_id;
    public String sec_uid;
    public Integer start;
    public Integer sub_type;
    public String tag_id;
    public Integer type;
    public String user_id;

    public C5312025e() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C565102If newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
