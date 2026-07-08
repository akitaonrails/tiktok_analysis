package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C595302Tv extends Message<C595302Tv, C595402Tw> {
    public static final ProtoAdapter<C595302Tv> ADAPTER = new ProtoAdapter<C595302Tv>() { // from class: X.02Tu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C595302Tv decode(ProtoReader protoReader) {
            C595302Tv c595302Tv = new C595302Tv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                switch (iNextTag) {
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        c595302Tv.is_official = ProtoAdapter.BOOL.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        c595302Tv.viewer_count = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        c595302Tv.chat_disabled = ProtoAdapter.BOOL.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                        c595302Tv.story_style_version = ProtoAdapter.INT64.decode(protoReader);
                                        break;
                                    case 14:
                                        c595302Tv.emoji_disabled = ProtoAdapter.BOOL.decode(protoReader);
                                        break;
                                    case 15:
                                        c595302Tv.birthday_celebration_disabled = ProtoAdapter.BOOL.decode(protoReader);
                                        break;
                                    default:
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        break;
                                }
                            } else {
                                c595302Tv.total_comments = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c595302Tv.viewed = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c595302Tv.expired_at = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c595302Tv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C595302Tv c595302Tv) {
            C595302Tv c595302Tv2 = c595302Tv;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c595302Tv2.expired_at);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c595302Tv2.viewed) + protoAdapter.encodedSizeWithTag(3, c595302Tv2.total_comments) + protoAdapter2.encodedSizeWithTag(10, c595302Tv2.is_official) + protoAdapter.encodedSizeWithTag(11, c595302Tv2.viewer_count) + protoAdapter2.encodedSizeWithTag(12, c595302Tv2.chat_disabled) + protoAdapter.encodedSizeWithTag(13, c595302Tv2.story_style_version) + protoAdapter2.encodedSizeWithTag(14, c595302Tv2.emoji_disabled) + protoAdapter2.encodedSizeWithTag(15, c595302Tv2.birthday_celebration_disabled) + c595302Tv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C595302Tv c595302Tv) {
            C595302Tv c595302Tv2 = c595302Tv;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c595302Tv2.expired_at);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 2, c595302Tv2.viewed);
            protoAdapter.encodeWithTag(protoWriter, 3, c595302Tv2.total_comments);
            protoAdapter2.encodeWithTag(protoWriter, 10, c595302Tv2.is_official);
            protoAdapter.encodeWithTag(protoWriter, 11, c595302Tv2.viewer_count);
            protoAdapter2.encodeWithTag(protoWriter, 12, c595302Tv2.chat_disabled);
            protoAdapter.encodeWithTag(protoWriter, 13, c595302Tv2.story_style_version);
            protoAdapter2.encodeWithTag(protoWriter, 14, c595302Tv2.emoji_disabled);
            protoAdapter2.encodeWithTag(protoWriter, 15, c595302Tv2.birthday_celebration_disabled);
            protoWriter.writeBytes(c595302Tv2.unknownFields());
        }
    };
    public Boolean birthday_celebration_disabled;
    public Boolean chat_disabled;
    public Boolean emoji_disabled;
    public Long expired_at;
    public Boolean is_official;
    public Long story_style_version;
    public Long total_comments;
    public Boolean viewed;
    public Long viewer_count;

    public C595302Tv() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C595402Tw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
