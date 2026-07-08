package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.026k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5344026k extends Message<C5344026k, C02KH> {
    public static final ProtoAdapter<C5344026k> ADAPTER = new ProtoAdapter<C5344026k>() { // from class: X.022c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5344026k decode(ProtoReader protoReader) {
            C5344026k c5344026k = new C5344026k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5344026k.uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5344026k.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5344026k.nick_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5344026k.handle = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5344026k.avatar = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5344026k.is_verified = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c5344026k.enter_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c5344026k.follow_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5344026k.is_visible = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5344026k.follower_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5344026k.is_private_account = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5344026k.is_block = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5344026k.is_blocked = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            c5344026k.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5344026k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5344026k c5344026k) {
            C5344026k c5344026k2 = c5344026k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5344026k2.uid) + protoAdapter.encodedSizeWithTag(2, c5344026k2.sec_uid) + protoAdapter.encodedSizeWithTag(3, c5344026k2.nick_name) + protoAdapter.encodedSizeWithTag(4, c5344026k2.handle) + C673002jw.ADAPTER.encodedSizeWithTag(5, c5344026k2.avatar);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, c5344026k2.is_verified);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c5344026k2.enter_type) + protoAdapter3.encodedSizeWithTag(8, c5344026k2.follow_status) + protoAdapter2.encodedSizeWithTag(9, c5344026k2.is_visible) + protoAdapter3.encodedSizeWithTag(10, c5344026k2.follower_status) + protoAdapter2.encodedSizeWithTag(11, c5344026k2.is_private_account) + protoAdapter2.encodedSizeWithTag(12, c5344026k2.is_block) + protoAdapter2.encodedSizeWithTag(13, c5344026k2.is_blocked) + protoAdapter3.encodedSizeWithTag(14, c5344026k2.status) + c5344026k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5344026k c5344026k) {
            C5344026k c5344026k2 = c5344026k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5344026k2.uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c5344026k2.sec_uid);
            protoAdapter.encodeWithTag(protoWriter, 3, c5344026k2.nick_name);
            protoAdapter.encodeWithTag(protoWriter, 4, c5344026k2.handle);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 5, c5344026k2.avatar);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 6, c5344026k2.is_verified);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 7, c5344026k2.enter_type);
            protoAdapter3.encodeWithTag(protoWriter, 8, c5344026k2.follow_status);
            protoAdapter2.encodeWithTag(protoWriter, 9, c5344026k2.is_visible);
            protoAdapter3.encodeWithTag(protoWriter, 10, c5344026k2.follower_status);
            protoAdapter2.encodeWithTag(protoWriter, 11, c5344026k2.is_private_account);
            protoAdapter2.encodeWithTag(protoWriter, 12, c5344026k2.is_block);
            protoAdapter2.encodeWithTag(protoWriter, 13, c5344026k2.is_blocked);
            protoAdapter3.encodeWithTag(protoWriter, 14, c5344026k2.status);
            protoWriter.writeBytes(c5344026k2.unknownFields());
        }
    };
    public C673002jw avatar;
    public Integer enter_type;
    public Integer follow_status;
    public Integer follower_status;
    public String handle;
    public Boolean is_block;
    public Boolean is_blocked;
    public Boolean is_private_account;
    public Boolean is_verified;
    public Boolean is_visible;
    public String nick_name;
    public String sec_uid;
    public Integer status;
    public String uid;

    public C5344026k() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
