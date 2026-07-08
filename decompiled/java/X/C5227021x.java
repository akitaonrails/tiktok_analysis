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

/* JADX INFO: renamed from: X.021x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5227021x extends Message<C5227021x, C573002Lg> {
    public static final ProtoAdapter<C5227021x> ADAPTER = new ProtoAdapter<C5227021x>() { // from class: X.021S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5227021x decode(ProtoReader protoReader) {
            C5227021x c5227021x = new C5227021x();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5227021x.keyword = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5227021x.url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5227021x.language = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5227021x.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5227021x.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5227021x.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c5227021x.icon = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5227021x.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5227021x.deep_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5227021x.universal_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5227021x.general_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5227021x.log_extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5227021x.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c5227021x.thumbnail = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c5227021x.actions.add(C555302El.ADAPTER.decode(protoReader));
                            break;
                        case 16:
                            c5227021x.is_shooting_allow = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5227021x.most_relevant_product_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5227021x.component_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 19:
                            c5227021x.caption = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c5227021x.biz_group = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            c5227021x.animate_info = C616802as.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c5227021x.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 23:
                            c5227021x.view_object = C710302px.ADAPTER.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c5227021x.standard_info = C02FS.ADAPTER.decode(protoReader);
                            break;
                        case 25:
                            c5227021x.view_object_str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5227021x;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5227021x c5227021x) {
            C5227021x c5227021x2 = c5227021x;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5227021x2.keyword) + protoAdapter.encodedSizeWithTag(2, c5227021x2.url) + protoAdapter.encodedSizeWithTag(3, c5227021x2.language) + protoAdapter.encodedSizeWithTag(4, c5227021x2.schema) + protoAdapter.encodedSizeWithTag(5, c5227021x2.id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, c5227021x2.type);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c5227021x2.icon) + protoAdapter.encodedSizeWithTag(8, c5227021x2.extra) + protoAdapter.encodedSizeWithTag(9, c5227021x2.deep_link) + protoAdapter.encodedSizeWithTag(10, c5227021x2.universal_link) + protoAdapter2.encodedSizeWithTag(11, c5227021x2.general_type) + protoAdapter.encodedSizeWithTag(12, c5227021x2.log_extra) + protoAdapter.encodedSizeWithTag(13, c5227021x2.description) + protoAdapter3.encodedSizeWithTag(14, c5227021x2.thumbnail) + C555302El.ADAPTER.asRepeated().encodedSizeWithTag(15, c5227021x2.actions) + ProtoAdapter.BOOL.encodedSizeWithTag(16, c5227021x2.is_shooting_allow) + protoAdapter.encodedSizeWithTag(17, c5227021x2.most_relevant_product_id) + protoAdapter.encodedSizeWithTag(18, c5227021x2.component_key) + protoAdapter.encodedSizeWithTag(19, c5227021x2.caption) + protoAdapter2.encodedSizeWithTag(20, c5227021x2.biz_group) + C616802as.ADAPTER.encodedSizeWithTag(21, c5227021x2.animate_info) + protoAdapter2.encodedSizeWithTag(22, c5227021x2.style) + C710302px.ADAPTER.encodedSizeWithTag(23, c5227021x2.view_object) + C02FS.ADAPTER.encodedSizeWithTag(24, c5227021x2.standard_info) + protoAdapter.encodedSizeWithTag(25, c5227021x2.view_object_str) + c5227021x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5227021x c5227021x) {
            C5227021x c5227021x2 = c5227021x;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c5227021x2.keyword);
            protoAdapter.encodeWithTag(protoWriter, 2, c5227021x2.url);
            protoAdapter.encodeWithTag(protoWriter, 3, c5227021x2.language);
            protoAdapter.encodeWithTag(protoWriter, 4, c5227021x2.schema);
            protoAdapter.encodeWithTag(protoWriter, 5, c5227021x2.id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 6, c5227021x2.type);
            ProtoAdapter<C673002jw> protoAdapter3 = C673002jw.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 7, c5227021x2.icon);
            protoAdapter.encodeWithTag(protoWriter, 8, c5227021x2.extra);
            protoAdapter.encodeWithTag(protoWriter, 9, c5227021x2.deep_link);
            protoAdapter.encodeWithTag(protoWriter, 10, c5227021x2.universal_link);
            protoAdapter2.encodeWithTag(protoWriter, 11, c5227021x2.general_type);
            protoAdapter.encodeWithTag(protoWriter, 12, c5227021x2.log_extra);
            protoAdapter.encodeWithTag(protoWriter, 13, c5227021x2.description);
            protoAdapter3.encodeWithTag(protoWriter, 14, c5227021x2.thumbnail);
            C555302El.ADAPTER.asRepeated().encodeWithTag(protoWriter, 15, c5227021x2.actions);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 16, c5227021x2.is_shooting_allow);
            protoAdapter.encodeWithTag(protoWriter, 17, c5227021x2.most_relevant_product_id);
            protoAdapter.encodeWithTag(protoWriter, 18, c5227021x2.component_key);
            protoAdapter.encodeWithTag(protoWriter, 19, c5227021x2.caption);
            protoAdapter2.encodeWithTag(protoWriter, 20, c5227021x2.biz_group);
            C616802as.ADAPTER.encodeWithTag(protoWriter, 21, c5227021x2.animate_info);
            protoAdapter2.encodeWithTag(protoWriter, 22, c5227021x2.style);
            C710302px.ADAPTER.encodeWithTag(protoWriter, 23, c5227021x2.view_object);
            C02FS.ADAPTER.encodeWithTag(protoWriter, 24, c5227021x2.standard_info);
            protoAdapter.encodeWithTag(protoWriter, 25, c5227021x2.view_object_str);
            protoWriter.writeBytes(c5227021x2.unknownFields());
        }
    };
    public List<C555302El> actions;
    public C616802as animate_info;
    public Integer biz_group;
    public String caption;
    public String component_key;
    public String deep_link;
    public String description;
    public String extra;
    public Integer general_type;
    public C673002jw icon;
    public String id;
    public Boolean is_shooting_allow;
    public String keyword;
    public String language;
    public String log_extra;
    public String most_relevant_product_id;
    public String schema;
    public C02FS standard_info;
    public Integer style;
    public C673002jw thumbnail;
    public Integer type;
    public String universal_link;
    public String url;
    public C710302px view_object;
    public String view_object_str;

    public C5227021x() {
        super(ADAPTER, ByteString.EMPTY);
        this.actions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C573002Lg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
