package X;

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

/* JADX INFO: renamed from: X.0230, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0230 extends Message<AnonymousClass0230, C579102Np> {
    public static final ProtoAdapter<AnonymousClass0230> ADAPTER = new ProtoAdapter<AnonymousClass0230>() { // from class: X.022l
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0230 decode(ProtoReader protoReader) {
            AnonymousClass0230 anonymousClass0230 = new AnonymousClass0230();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0230.element = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0230.icon_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0230.icon_url_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0230.starling_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0230.style_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0230.frontend_rule_list.add(C547602Bm.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            anonymousClass0230.display_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0230.param_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0230.option_list.add(C2251811DBr.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0230.placeholder_starling_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0230.sub_element_list.add(AnonymousClass0230.ADAPTER.decode(protoReader));
                            break;
                        default:
                            switch (iNextTag) {
                                case 21:
                                    anonymousClass0230.display_name = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 22:
                                    anonymousClass0230.placeholder_display_name = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 23:
                                    anonymousClass0230.need_encryption = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                    anonymousClass0230.notification_url = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 25:
                                    anonymousClass0230.configuration = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 26:
                                    anonymousClass0230.description = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 27:
                                    anonymousClass0230.inner_style_type = ProtoAdapter.INT64.decode(protoReader);
                                    break;
                                case 28:
                                    anonymousClass0230.inner_configuration = C02EB.ADAPTER.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0230;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0230 anonymousClass0230) {
            AnonymousClass0230 anonymousClass02302 = anonymousClass0230;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, anonymousClass02302.element) + protoAdapter.encodedSizeWithTag(2, anonymousClass02302.icon_url) + protoAdapter.encodedSizeWithTag(3, anonymousClass02302.icon_url_dark) + protoAdapter.encodedSizeWithTag(4, anonymousClass02302.starling_key) + protoAdapter.encodedSizeWithTag(5, anonymousClass02302.style_type) + C547602Bm.ADAPTER.asRepeated().encodedSizeWithTag(6, anonymousClass02302.frontend_rule_list) + protoAdapter.encodedSizeWithTag(7, anonymousClass02302.display_tag) + protoAdapter.encodedSizeWithTag(8, anonymousClass02302.param_name) + C2251811DBr.ADAPTER.asRepeated().encodedSizeWithTag(9, anonymousClass02302.option_list) + protoAdapter.encodedSizeWithTag(10, anonymousClass02302.placeholder_starling_key) + AnonymousClass0230.ADAPTER.asRepeated().encodedSizeWithTag(11, anonymousClass02302.sub_element_list) + protoAdapter.encodedSizeWithTag(21, anonymousClass02302.display_name) + protoAdapter.encodedSizeWithTag(22, anonymousClass02302.placeholder_display_name) + ProtoAdapter.BOOL.encodedSizeWithTag(23, anonymousClass02302.need_encryption) + protoAdapter.encodedSizeWithTag(24, anonymousClass02302.notification_url) + protoAdapter.encodedSizeWithTag(25, anonymousClass02302.configuration) + protoAdapter.encodedSizeWithTag(26, anonymousClass02302.description) + ProtoAdapter.INT64.encodedSizeWithTag(27, anonymousClass02302.inner_style_type) + C02EB.ADAPTER.encodedSizeWithTag(28, anonymousClass02302.inner_configuration) + anonymousClass02302.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0230 anonymousClass0230) {
        }
    };
    public String configuration;
    public String description;
    public String display_name;
    public String display_tag;
    public String element;
    public List<C547602Bm> frontend_rule_list;
    public String icon_url;
    public String icon_url_dark;
    public C02EB inner_configuration;
    public Long inner_style_type;
    public Boolean need_encryption;
    public String notification_url;
    public List<C2251811DBr> option_list;
    public String param_name;
    public String placeholder_display_name;
    public String placeholder_starling_key;
    public String starling_key;
    public String style_type;
    public List<AnonymousClass0230> sub_element_list;

    public AnonymousClass0230() {
        super(ADAPTER, ByteString.EMPTY);
        this.frontend_rule_list = C1516540pZE.LJIIIIZZ();
        this.option_list = C1516540pZE.LJIIIIZZ();
        this.sub_element_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C579102Np newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
