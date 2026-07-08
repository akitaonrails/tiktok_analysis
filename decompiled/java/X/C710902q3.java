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

/* JADX INFO: renamed from: X.02q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C710902q3 extends Message<C710902q3, C693502nF> {
    public static final ProtoAdapter<C710902q3> ADAPTER = new ProtoAdapter<C710902q3>() { // from class: X.02q4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C710902q3 decode(ProtoReader protoReader) {
            C710902q3 c710902q3 = new C710902q3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        switch (iNextTag) {
                            case 1:
                                c710902q3.pudo_card.add(C02AP.ADAPTER.decode(protoReader));
                                break;
                            case 2:
                                c710902q3.shipping_address = C023N.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c710902q3.pudo_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 4:
                                c710902q3.icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c710902q3.selected_icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c710902q3.pudo_card_button_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c710902q3.distance = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            default:
                                switch (iNextTag) {
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        c710902q3.sub_title = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        c710902q3.working_times.add(C711802qC.ADAPTER.decode(protoReader));
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        c710902q3.address_icon = C029C.ADAPTER.decode(protoReader);
                                        break;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                        c710902q3.working_time_unfold_icon = C029C.ADAPTER.decode(protoReader);
                                        break;
                                    case 14:
                                        c710902q3.time_icon = C029C.ADAPTER.decode(protoReader);
                                        break;
                                    case 15:
                                        c710902q3.suspension_periods.add(C711502q9.ADAPTER.decode(protoReader));
                                        break;
                                    case 16:
                                        c710902q3.tags.add(C711202q6.ADAPTER.decode(protoReader));
                                        break;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        c710902q3.unvailable = ProtoAdapter.BOOL.decode(protoReader);
                                        break;
                                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                        c710902q3.unvailable_hint = ProtoAdapter.STRING.decode(protoReader);
                                        break;
                                    case 19:
                                        c710902q3.selected = ProtoAdapter.BOOL.decode(protoReader);
                                        break;
                                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                        c710902q3.is_latest_selected = ProtoAdapter.BOOL.decode(protoReader);
                                        break;
                                    default:
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        break;
                                }
                                break;
                        }
                    } else {
                        c710902q3.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c710902q3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C710902q3 c710902q3) {
            C710902q3 c710902q32 = c710902q3;
            int iEncodedSizeWithTag = C02AP.ADAPTER.asRepeated().encodedSizeWithTag(1, c710902q32.pudo_card) + C023N.ADAPTER.encodedSizeWithTag(2, c710902q32.shipping_address) + ProtoAdapter.INT32.encodedSizeWithTag(3, c710902q32.pudo_type);
            ProtoAdapter<C029C> protoAdapter = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c710902q32.icon) + protoAdapter.encodedSizeWithTag(5, c710902q32.selected_icon);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(6, c710902q32.pudo_card_button_text) + protoAdapter2.encodedSizeWithTag(7, c710902q32.distance) + protoAdapter2.encodedSizeWithTag(10, c710902q32.sub_title) + C711802qC.ADAPTER.asRepeated().encodedSizeWithTag(11, c710902q32.working_times) + protoAdapter.encodedSizeWithTag(12, c710902q32.address_icon) + protoAdapter.encodedSizeWithTag(13, c710902q32.working_time_unfold_icon) + protoAdapter.encodedSizeWithTag(14, c710902q32.time_icon) + C711502q9.ADAPTER.asRepeated().encodedSizeWithTag(15, c710902q32.suspension_periods) + C711202q6.ADAPTER.asRepeated().encodedSizeWithTag(16, c710902q32.tags);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(17, c710902q32.unvailable) + protoAdapter2.encodedSizeWithTag(18, c710902q32.unvailable_hint) + protoAdapter3.encodedSizeWithTag(19, c710902q32.selected) + protoAdapter3.encodedSizeWithTag(20, c710902q32.is_latest_selected) + protoAdapter2.encodedSizeWithTag(100, c710902q32.da_info) + c710902q32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C710902q3 c710902q3) {
        }
    };
    public C029C address_icon;
    public String da_info;
    public String distance;
    public C029C icon;
    public Boolean is_latest_selected;
    public List<C02AP> pudo_card;
    public String pudo_card_button_text;
    public Integer pudo_type;
    public Boolean selected;
    public C029C selected_icon;
    public C023N shipping_address;
    public String sub_title;
    public List<C711502q9> suspension_periods;
    public List<C711202q6> tags;
    public C029C time_icon;
    public Boolean unvailable;
    public String unvailable_hint;
    public C029C working_time_unfold_icon;
    public List<C711802qC> working_times;

    public C710902q3() {
        super(ADAPTER, ByteString.EMPTY);
        this.pudo_card = C1516540pZE.LJIIIIZZ();
        this.working_times = C1516540pZE.LJIIIIZZ();
        this.suspension_periods = C1516540pZE.LJIIIIZZ();
        this.tags = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C693502nF newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
