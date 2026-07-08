package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.028F, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C028F extends Message<C028F, C02KU> {
    public static final ProtoAdapter<C028F> ADAPTER = new ProtoAdapter<C028F>() { // from class: X.022v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C028F decode(ProtoReader protoReader) {
            C028F c028f = new C028F();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c028f.uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c028f.unique_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c028f.nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c028f.avatar_168x168 = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c028f.avatar_thumb = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c028f.follow_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c028f.follower_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c028f.is_private_account = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c028f.custom_verify = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c028f.enterprise_verify_reason = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c028f.interest_level = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c028f.is_business_account = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 15:
                            c028f.invitation_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c028f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C028F c028f) {
            C028F c028f2 = c028f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c028f2.uid) + protoAdapter.encodedSizeWithTag(2, c028f2.unique_id) + protoAdapter.encodedSizeWithTag(3, c028f2.nickname);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c028f2.avatar_168x168) + protoAdapter2.encodedSizeWithTag(5, c028f2.avatar_thumb);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, c028f2.follow_status) + protoAdapter3.encodedSizeWithTag(7, c028f2.follower_status) + protoAdapter3.encodedSizeWithTag(8, c028f2.is_private_account) + protoAdapter.encodedSizeWithTag(9, c028f2.custom_verify) + protoAdapter.encodedSizeWithTag(10, c028f2.enterprise_verify_reason) + protoAdapter3.encodedSizeWithTag(13, c028f2.interest_level) + ProtoAdapter.BOOL.encodedSizeWithTag(14, c028f2.is_business_account) + protoAdapter3.encodedSizeWithTag(15, c028f2.invitation_status) + c028f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C028F c028f) {
            C028F c028f2 = c028f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c028f2.uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c028f2.unique_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c028f2.nickname);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 4, c028f2.avatar_168x168);
            protoAdapter2.encodeWithTag(protoWriter, 5, c028f2.avatar_thumb);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 6, c028f2.follow_status);
            protoAdapter3.encodeWithTag(protoWriter, 7, c028f2.follower_status);
            protoAdapter3.encodeWithTag(protoWriter, 8, c028f2.is_private_account);
            protoAdapter.encodeWithTag(protoWriter, 9, c028f2.custom_verify);
            protoAdapter.encodeWithTag(protoWriter, 10, c028f2.enterprise_verify_reason);
            protoAdapter3.encodeWithTag(protoWriter, 13, c028f2.interest_level);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 14, c028f2.is_business_account);
            protoAdapter3.encodeWithTag(protoWriter, 15, c028f2.invitation_status);
            protoWriter.writeBytes(c028f2.unknownFields());
        }
    };
    public C673002jw avatar_168x168;
    public C673002jw avatar_thumb;
    public String custom_verify;
    public String enterprise_verify_reason;
    public Integer follow_status;
    public Integer follower_status;
    public Integer interest_level;
    public Integer invitation_status;
    public Boolean is_business_account;
    public Integer is_private_account;
    public String nickname;
    public String uid;
    public String unique_id;

    public C028F() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
