package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.025k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5318025k extends Message<C5318025k, C577602Na> {
    public static final ProtoAdapter<C5318025k> ADAPTER = new ProtoAdapter<C5318025k>() { // from class: X.0236
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5318025k decode(ProtoReader protoReader) {
            C5318025k c5318025k = new C5318025k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5318025k.uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5318025k.short_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5318025k.nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5318025k.gender = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c5318025k.signature = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5318025k.avatar_larger = C593402Tc.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5318025k.avatar_thumb = C593402Tc.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5318025k.avatar_medium = C593402Tc.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5318025k.birthday = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5318025k.follow_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5318025k.aweme_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c5318025k.following_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 15:
                            c5318025k.follower_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 16:
                            c5318025k.room_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5318025k.region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5318025k.account_region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5318025k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5318025k c5318025k) {
            C5318025k c5318025k2 = c5318025k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5318025k2.uid) + protoAdapter.encodedSizeWithTag(2, c5318025k2.short_id) + protoAdapter.encodedSizeWithTag(3, c5318025k2.nickname);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5318025k2.gender) + protoAdapter.encodedSizeWithTag(5, c5318025k2.signature);
            ProtoAdapter<C593402Tc> protoAdapter3 = C593402Tc.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c5318025k2.avatar_larger) + protoAdapter3.encodedSizeWithTag(7, c5318025k2.avatar_thumb) + protoAdapter3.encodedSizeWithTag(8, c5318025k2.avatar_medium) + protoAdapter.encodedSizeWithTag(9, c5318025k2.birthday) + protoAdapter2.encodedSizeWithTag(12, c5318025k2.follow_status) + protoAdapter2.encodedSizeWithTag(13, c5318025k2.aweme_count) + protoAdapter2.encodedSizeWithTag(14, c5318025k2.following_count) + protoAdapter2.encodedSizeWithTag(15, c5318025k2.follower_count) + ProtoAdapter.INT64.encodedSizeWithTag(16, c5318025k2.room_id) + protoAdapter.encodedSizeWithTag(17, c5318025k2.region) + protoAdapter.encodedSizeWithTag(18, c5318025k2.account_region) + c5318025k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5318025k c5318025k) {
        }
    };
    public String account_region;
    public C593402Tc avatar_larger;
    public C593402Tc avatar_medium;
    public C593402Tc avatar_thumb;
    public Integer aweme_count;
    public String birthday;
    public Integer follow_status;
    public Integer follower_count;
    public Integer following_count;
    public Integer gender;
    public String nickname;
    public String region;
    public Long room_id;
    public String short_id;
    public String signature;
    public String uid;

    public C5318025k() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C577602Na newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
