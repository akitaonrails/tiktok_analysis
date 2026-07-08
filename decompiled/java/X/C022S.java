package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.022S, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022S extends Message<C022S, C02JU> {
    public static final ProtoAdapter<C022S> ADAPTER = new ProtoAdapter<C022S>() { // from class: X.021f
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022S decode(ProtoReader protoReader) {
            C022S c022s = new C022S();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c022s.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c022s.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c022s.children.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            c022s.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c022s.owner_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c022s.owner_nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c022s.user_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c022s.desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c022s.effect_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c022s.share_info = C5271023p.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c022s.is_favorite = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c022s.commerce_sticker = C5266023k.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c022s.tags.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            c022s.avatar_thumb = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c022s.avatar_medium = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c022s.avatar_large = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c022s.vv_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c022s.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c022s.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022s;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022S c022s) {
            C022S c022s2 = c022s;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c022s2.id) + protoAdapter.encodedSizeWithTag(2, c022s2.name) + protoAdapter.asRepeated().encodedSizeWithTag(3, c022s2.children);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c022s2.icon_url) + protoAdapter.encodedSizeWithTag(5, c022s2.owner_id) + protoAdapter.encodedSizeWithTag(6, c022s2.owner_nickname) + ProtoAdapter.INT32.encodedSizeWithTag(7, c022s2.user_count) + protoAdapter.encodedSizeWithTag(8, c022s2.desc) + protoAdapter.encodedSizeWithTag(9, c022s2.effect_id) + C5271023p.ADAPTER.encodedSizeWithTag(10, c022s2.share_info) + ProtoAdapter.BOOL.encodedSizeWithTag(11, c022s2.is_favorite) + C5266023k.ADAPTER.encodedSizeWithTag(12, c022s2.commerce_sticker) + protoAdapter.asRepeated().encodedSizeWithTag(13, c022s2.tags) + protoAdapter2.encodedSizeWithTag(14, c022s2.avatar_thumb) + protoAdapter2.encodedSizeWithTag(15, c022s2.avatar_medium) + protoAdapter2.encodedSizeWithTag(16, c022s2.avatar_large) + ProtoAdapter.INT64.encodedSizeWithTag(17, c022s2.vv_count) + protoAdapter.encodedSizeWithTag(18, c022s2.extra) + protoAdapter.encodedSizeWithTag(19, c022s2.sec_uid) + c022s2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C022S c022s) {
            C022S c022s2 = c022s;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c022s2.id);
            protoAdapter.encodeWithTag(protoWriter, 2, c022s2.name);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c022s2.children);
            ProtoAdapter<C673002jw> protoAdapter2 = C673002jw.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 4, c022s2.icon_url);
            protoAdapter.encodeWithTag(protoWriter, 5, c022s2.owner_id);
            protoAdapter.encodeWithTag(protoWriter, 6, c022s2.owner_nickname);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, c022s2.user_count);
            protoAdapter.encodeWithTag(protoWriter, 8, c022s2.desc);
            protoAdapter.encodeWithTag(protoWriter, 9, c022s2.effect_id);
            C5271023p.ADAPTER.encodeWithTag(protoWriter, 10, c022s2.share_info);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 11, c022s2.is_favorite);
            C5266023k.ADAPTER.encodeWithTag(protoWriter, 12, c022s2.commerce_sticker);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 13, c022s2.tags);
            protoAdapter2.encodeWithTag(protoWriter, 14, c022s2.avatar_thumb);
            protoAdapter2.encodeWithTag(protoWriter, 15, c022s2.avatar_medium);
            protoAdapter2.encodeWithTag(protoWriter, 16, c022s2.avatar_large);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 17, c022s2.vv_count);
            protoAdapter.encodeWithTag(protoWriter, 18, c022s2.extra);
            protoAdapter.encodeWithTag(protoWriter, 19, c022s2.sec_uid);
            protoWriter.writeBytes(c022s2.unknownFields());
        }
    };
    public C673002jw avatar_large;
    public C673002jw avatar_medium;
    public C673002jw avatar_thumb;
    public List<String> children;
    public C5266023k commerce_sticker;
    public String desc;
    public String effect_id;
    public String extra;
    public C673002jw icon_url;
    public String id;
    public Boolean is_favorite;
    public String name;
    public String owner_id;
    public String owner_nickname;
    public String sec_uid;
    public C5271023p share_info;
    public List<String> tags;
    public Integer user_count;
    public Long vv_count;

    public C022S() {
        super(ADAPTER, ByteString.EMPTY);
        this.children = C1516540pZE.LJIIIIZZ();
        this.tags = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02JU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
