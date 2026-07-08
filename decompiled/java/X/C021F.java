package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.021F, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C021F extends Message<C021F, C564202Hw> {
    public static final ProtoAdapter<C021F> ADAPTER = new ProtoAdapter<C021F>() { // from class: X.0214
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C021F decode(ProtoReader protoReader) {
            C021F c021f = new C021F();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c021f.cid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c021f.cha_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c021f.desc = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c021f.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c021f.author = C5189020l.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c021f.user_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c021f.share_info = C5271023p.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c021f.connect_music.add(C5199020v.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c021f.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        case 30:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c021f.sub_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c021f.background_image_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c021f.sticker_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c021f.link_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c021f.link_action = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c021f.is_pgcshow = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c021f.collect_stat = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c021f.cover_item = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c021f.is_challenge = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c021f.view_count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 21:
                            c021f.disclaimer = C633302dX.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c021f.allow_upload_cover = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 23:
                            c021f.is_commerce = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c021f.category_cover_info = C747702vz.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                            c021f.hashtag_profile = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 26:
                            c021f.cover_photo = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 27:
                            c021f.is_hot_search = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 28:
                            c021f.link_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 29:
                            c021f.announcement_info = C633002dU.ADAPTER.decode(protoReader);
                            break;
                        case 31:
                            c021f.module_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 32:
                            c021f.profile_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                            c021f.cha_attrs.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                            c021f.button = C02V9.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c021f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C021F c021f) {
            C021F c021f2 = c021f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c021f2.cid) + protoAdapter.encodedSizeWithTag(2, c021f2.cha_name) + protoAdapter.encodedSizeWithTag(3, c021f2.desc) + protoAdapter.encodedSizeWithTag(4, c021f2.schema) + C5189020l.ADAPTER.encodedSizeWithTag(5, c021f2.author);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, c021f2.user_count) + C5271023p.ADAPTER.encodedSizeWithTag(7, c021f2.share_info) + C5199020v.ADAPTER.asRepeated().encodedSizeWithTag(8, c021f2.connect_music) + protoAdapter2.encodedSizeWithTag(9, c021f2.type) + protoAdapter2.encodedSizeWithTag(11, c021f2.sub_type);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(12, c021f2.background_image_url) + protoAdapter.encodedSizeWithTag(13, c021f2.sticker_id) + protoAdapter.encodedSizeWithTag(14, c021f2.link_text) + protoAdapter.encodedSizeWithTag(15, c021f2.link_action);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(16, c021f2.is_pgcshow) + protoAdapter2.encodedSizeWithTag(17, c021f2.collect_stat) + protoAdapter3.encodedSizeWithTag(18, c021f2.cover_item) + protoAdapter2.encodedSizeWithTag(19, c021f2.is_challenge) + ProtoAdapter.INT64.encodedSizeWithTag(20, c021f2.view_count) + C633302dX.ADAPTER.encodedSizeWithTag(21, c021f2.disclaimer) + protoAdapter4.encodedSizeWithTag(22, c021f2.allow_upload_cover) + protoAdapter4.encodedSizeWithTag(23, c021f2.is_commerce) + C747702vz.ADAPTER.encodedSizeWithTag(24, c021f2.category_cover_info) + protoAdapter.encodedSizeWithTag(25, c021f2.hashtag_profile) + protoAdapter.encodedSizeWithTag(26, c021f2.cover_photo) + protoAdapter2.encodedSizeWithTag(27, c021f2.is_hot_search) + protoAdapter2.encodedSizeWithTag(28, c021f2.link_type) + C633002dU.ADAPTER.encodedSizeWithTag(29, c021f2.announcement_info) + protoAdapter2.encodedSizeWithTag(31, c021f2.module_type) + protoAdapter.encodedSizeWithTag(32, c021f2.profile_tag) + protoAdapter.asRepeated().encodedSizeWithTag(33, c021f2.cha_attrs) + C02V9.ADAPTER.encodedSizeWithTag(34, c021f2.button) + c021f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C021F c021f) {
            C021F c021f2 = c021f;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c021f2.cid);
            protoAdapter.encodeWithTag(protoWriter, 2, c021f2.cha_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c021f2.desc);
            protoAdapter.encodeWithTag(protoWriter, 4, c021f2.schema);
            C5189020l.ADAPTER.encodeWithTag(protoWriter, 5, c021f2.author);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 6, c021f2.user_count);
            C5271023p.ADAPTER.encodeWithTag(protoWriter, 7, c021f2.share_info);
            C5199020v.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c021f2.connect_music);
            protoAdapter2.encodeWithTag(protoWriter, 9, c021f2.type);
            protoAdapter2.encodeWithTag(protoWriter, 11, c021f2.sub_type);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 12, c021f2.background_image_url);
            protoAdapter.encodeWithTag(protoWriter, 13, c021f2.sticker_id);
            protoAdapter.encodeWithTag(protoWriter, 14, c021f2.link_text);
            protoAdapter.encodeWithTag(protoWriter, 15, c021f2.link_action);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            protoAdapter4.encodeWithTag(protoWriter, 16, c021f2.is_pgcshow);
            protoAdapter2.encodeWithTag(protoWriter, 17, c021f2.collect_stat);
            protoAdapter3.encodeWithTag(protoWriter, 18, c021f2.cover_item);
            protoAdapter2.encodeWithTag(protoWriter, 19, c021f2.is_challenge);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 20, c021f2.view_count);
            C633302dX.ADAPTER.encodeWithTag(protoWriter, 21, c021f2.disclaimer);
            protoAdapter4.encodeWithTag(protoWriter, 22, c021f2.allow_upload_cover);
            protoAdapter4.encodeWithTag(protoWriter, 23, c021f2.is_commerce);
            C747702vz.ADAPTER.encodeWithTag(protoWriter, 24, c021f2.category_cover_info);
            protoAdapter.encodeWithTag(protoWriter, 25, c021f2.hashtag_profile);
            protoAdapter.encodeWithTag(protoWriter, 26, c021f2.cover_photo);
            protoAdapter2.encodeWithTag(protoWriter, 27, c021f2.is_hot_search);
            protoAdapter2.encodeWithTag(protoWriter, 28, c021f2.link_type);
            C633002dU.ADAPTER.encodeWithTag(protoWriter, 29, c021f2.announcement_info);
            protoAdapter2.encodeWithTag(protoWriter, 31, c021f2.module_type);
            protoAdapter.encodeWithTag(protoWriter, 32, c021f2.profile_tag);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 33, c021f2.cha_attrs);
            C02V9.ADAPTER.encodeWithTag(protoWriter, 34, c021f2.button);
            protoWriter.writeBytes(c021f2.unknownFields());
        }
    };
    public Boolean allow_upload_cover;
    public C633002dU announcement_info;
    public C5189020l author;
    public C673002jw background_image_url;
    public C02V9 button;
    public C747702vz category_cover_info;
    public List<String> cha_attrs;
    public String cha_name;
    public String cid;
    public Integer collect_stat;
    public List<C5199020v> connect_music;
    public C673002jw cover_item;
    public String cover_photo;
    public String desc;
    public C633302dX disclaimer;
    public String hashtag_profile;
    public Integer is_challenge;
    public Boolean is_commerce;
    public Integer is_hot_search;
    public Boolean is_pgcshow;
    public String link_action;
    public String link_text;
    public Integer link_type;
    public Integer module_type;
    public String profile_tag;
    public String schema;
    public C5271023p share_info;
    public String sticker_id;
    public Integer sub_type;
    public Integer type;
    public Integer user_count;
    public Long view_count;

    public C021F() {
        super(ADAPTER, ByteString.EMPTY);
        this.connect_music = C1516540pZE.LJIIIIZZ();
        this.cha_attrs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C564202Hw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
