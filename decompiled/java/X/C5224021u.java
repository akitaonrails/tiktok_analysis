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

/* JADX INFO: renamed from: X.021u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5224021u extends Message<C5224021u, C02Q0> {
    public static final ProtoAdapter<C5224021u> ADAPTER = new ProtoAdapter<C5224021u>() { // from class: X.021Q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5224021u decode(ProtoReader protoReader) {
            C5224021u c5224021u = new C5224021u();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 255) {
                        switch (iNextTag) {
                            case 1:
                                c5224021u.redeem_icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                c5224021u.redeem_title = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 3:
                                c5224021u.redeem_amount = C02GZ.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c5224021u.redeem_can_be_used = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                c5224021u.use_bonus_redeem = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                c5224021u.non_redeem_reason = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c5224021u.redeem_info = C023J.ADAPTER.decode(protoReader);
                                break;
                            case 8:
                                c5224021u.redeem_amount_value = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c5224021u.additional = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c5224021u.discount_brief.add(C02DO.ADAPTER.decode(protoReader));
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c5224021u.discount_brief_style = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c5224021u.animation_icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c5224021u.earn_bonus_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                c5224021u.popup_tip = C651402gS.ADAPTER.decode(protoReader);
                                break;
                            case 15:
                                c5224021u.popup_layer_detail_info = C591702Sl.ADAPTER.decode(protoReader);
                                break;
                            case 16:
                                c5224021u.bonus_title = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                c5224021u.additional_notice = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                c5224021u.bonus_ui_version = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 19:
                                c5224021u.redeem_title_rich_text = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                c5224021u.countdown_info = C741502uz.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c5224021u.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5224021u;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5224021u c5224021u) {
            C5224021u c5224021u2 = c5224021u;
            ProtoAdapter<C029C> protoAdapter = C029C.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5224021u2.redeem_icon);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5224021u2.redeem_title) + C02GZ.ADAPTER.encodedSizeWithTag(3, c5224021u2.redeem_amount);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c5224021u2.redeem_can_be_used) + protoAdapter3.encodedSizeWithTag(5, c5224021u2.use_bonus_redeem) + protoAdapter2.encodedSizeWithTag(6, c5224021u2.non_redeem_reason) + C023J.ADAPTER.encodedSizeWithTag(7, c5224021u2.redeem_info) + protoAdapter2.encodedSizeWithTag(8, c5224021u2.redeem_amount_value) + protoAdapter2.encodedSizeWithTag(9, c5224021u2.additional) + C02DO.ADAPTER.asRepeated().encodedSizeWithTag(10, c5224021u2.discount_brief) + ProtoAdapter.INT32.encodedSizeWithTag(11, c5224021u2.discount_brief_style) + protoAdapter.encodedSizeWithTag(12, c5224021u2.animation_icon) + protoAdapter2.encodedSizeWithTag(13, c5224021u2.earn_bonus_text) + C651402gS.ADAPTER.encodedSizeWithTag(14, c5224021u2.popup_tip) + C591702Sl.ADAPTER.encodedSizeWithTag(15, c5224021u2.popup_layer_detail_info);
            ProtoAdapter<C5431029t> protoAdapter4 = C5431029t.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(16, c5224021u2.bonus_title) + protoAdapter4.encodedSizeWithTag(17, c5224021u2.additional_notice) + ProtoAdapter.INT64.encodedSizeWithTag(18, c5224021u2.bonus_ui_version) + protoAdapter4.encodedSizeWithTag(19, c5224021u2.redeem_title_rich_text) + C741502uz.ADAPTER.encodedSizeWithTag(20, c5224021u2.countdown_info) + protoAdapter2.encodedSizeWithTag(255, c5224021u2.da_info) + c5224021u2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5224021u c5224021u) {
        }
    };
    public String additional;
    public C5431029t additional_notice;
    public C029C animation_icon;
    public C5431029t bonus_title;
    public Long bonus_ui_version;
    public C741502uz countdown_info;
    public String da_info;
    public List<C02DO> discount_brief;
    public Integer discount_brief_style;
    public String earn_bonus_text;
    public String non_redeem_reason;
    public C591702Sl popup_layer_detail_info;
    public C651402gS popup_tip;
    public C02GZ redeem_amount;
    public String redeem_amount_value;
    public Boolean redeem_can_be_used;
    public C029C redeem_icon;
    public C023J redeem_info;
    public String redeem_title;
    public C5431029t redeem_title_rich_text;
    public Boolean use_bonus_redeem;

    public C5224021u() {
        super(ADAPTER, ByteString.EMPTY);
        this.discount_brief = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02Q0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
