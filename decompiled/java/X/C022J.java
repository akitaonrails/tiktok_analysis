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

/* JADX INFO: renamed from: X.022J, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C022J extends Message<C022J, C581002Oi> {
    public static final ProtoAdapter<C022J> ADAPTER = new ProtoAdapter<C022J>() { // from class: X.021j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C022J decode(ProtoReader protoReader) {
            C022J c022j = new C022J();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c022j.credit_payment_method = C5193020p.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c022j.credit_payment_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c022j.credit_payment_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c022j.credit_balance_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c022j.credit_freeze_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c022j.remained_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c022j.recommend_payment_method = C5193020p.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c022j.payment_methods.add(C5193020p.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c022j.stored_methods.add(C5193020p.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c022j.recommend_payment_methods.add(C5193020p.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c022j.methods_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c022j.methods_photos = C639002eS.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c022j.recommend_method_show_count = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c022j.non_time_limited_balance_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c022j.time_limited_balance_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c022j.recent_will_expire_balance_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c022j.popup_info = C552102Df.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c022j.method_photos_with_pm_code.add(C02H3.ADAPTER.decode(protoReader));
                            break;
                        case 19:
                            c022j.first_payment_method_amount_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c022j.second_payment_method_amount_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c022j;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C022J c022j) {
            C022J c022j2 = c022j;
            ProtoAdapter<C5193020p> protoAdapter = C5193020p.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c022j2.credit_payment_method);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c022j2.credit_payment_type);
            ProtoAdapter<C614702aX> protoAdapter3 = C614702aX.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, c022j2.credit_payment_amount) + protoAdapter3.encodedSizeWithTag(4, c022j2.credit_balance_amount) + protoAdapter3.encodedSizeWithTag(5, c022j2.credit_freeze_amount) + protoAdapter3.encodedSizeWithTag(6, c022j2.remained_amount) + protoAdapter.encodedSizeWithTag(7, c022j2.recommend_payment_method) + protoAdapter.asRepeated().encodedSizeWithTag(8, c022j2.payment_methods) + protoAdapter.asRepeated().encodedSizeWithTag(9, c022j2.stored_methods) + protoAdapter.asRepeated().encodedSizeWithTag(10, c022j2.recommend_payment_methods) + protoAdapter2.encodedSizeWithTag(11, c022j2.methods_text) + C639002eS.ADAPTER.encodedSizeWithTag(12, c022j2.methods_photos) + ProtoAdapter.INT32.encodedSizeWithTag(13, c022j2.recommend_method_show_count) + protoAdapter3.encodedSizeWithTag(14, c022j2.non_time_limited_balance_amount) + protoAdapter3.encodedSizeWithTag(15, c022j2.time_limited_balance_amount) + protoAdapter3.encodedSizeWithTag(16, c022j2.recent_will_expire_balance_amount) + C552102Df.ADAPTER.encodedSizeWithTag(17, c022j2.popup_info) + C02H3.ADAPTER.asRepeated().encodedSizeWithTag(18, c022j2.method_photos_with_pm_code) + protoAdapter2.encodedSizeWithTag(19, c022j2.first_payment_method_amount_title) + protoAdapter2.encodedSizeWithTag(20, c022j2.second_payment_method_amount_title) + c022j2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C022J c022j) {
        }
    };
    public C614702aX credit_balance_amount;
    public C614702aX credit_freeze_amount;
    public C614702aX credit_payment_amount;
    public C5193020p credit_payment_method;
    public String credit_payment_type;
    public String first_payment_method_amount_title;
    public List<C02H3> method_photos_with_pm_code;
    public C639002eS methods_photos;
    public String methods_text;
    public C614702aX non_time_limited_balance_amount;
    public List<C5193020p> payment_methods;
    public C552102Df popup_info;
    public C614702aX recent_will_expire_balance_amount;
    public Integer recommend_method_show_count;
    public C5193020p recommend_payment_method;
    public List<C5193020p> recommend_payment_methods;
    public C614702aX remained_amount;
    public String second_payment_method_amount_title;
    public List<C5193020p> stored_methods;
    public C614702aX time_limited_balance_amount;

    public C022J() {
        super(ADAPTER, ByteString.EMPTY);
        this.payment_methods = C1516540pZE.LJIIIIZZ();
        this.stored_methods = C1516540pZE.LJIIIIZZ();
        this.recommend_payment_methods = C1516540pZE.LJIIIIZZ();
        this.method_photos_with_pm_code = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C581002Oi newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
