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

/* JADX INFO: renamed from: X.026h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5341026h extends Message<C5341026h, C02ON> {
    public static final ProtoAdapter<C5341026h> ADAPTER = new ProtoAdapter<C5341026h>() { // from class: X.026i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5341026h decode(ProtoReader protoReader) {
            C5341026h c5341026h = new C5341026h();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5341026h.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5341026h.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                        case 5:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 4:
                            c5341026h.expose_user_rights.add(C630802d8.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c5341026h.title_en = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5341026h.background_image = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5341026h.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5341026h.background_color = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5341026h.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5341026h.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5341026h.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5341026h.bg_start_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c5341026h.bg_end_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c5341026h.has_secure_payment = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            c5341026h.secure_payment_module = C1C76.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c5341026h.suffix_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c5341026h.separate_banner = C754302x3.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5341026h;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5341026h c5341026h) {
            C5341026h c5341026h2 = c5341026h;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5341026h2.title);
            ProtoAdapter<C029C> protoAdapter2 = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5341026h2.icon) + C630802d8.ADAPTER.asRepeated().encodedSizeWithTag(4, c5341026h2.expose_user_rights) + protoAdapter.encodedSizeWithTag(6, c5341026h2.title_en) + protoAdapter2.encodedSizeWithTag(7, c5341026h2.background_image);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, c5341026h2.style) + protoAdapter3.encodedSizeWithTag(9, c5341026h2.background_color) + protoAdapter.encodedSizeWithTag(10, c5341026h2.description) + protoAdapter.encodedSizeWithTag(11, c5341026h2.schema) + protoAdapter.encodedSizeWithTag(12, c5341026h2.da_info);
            ProtoAdapter<C618602bA> protoAdapter4 = C618602bA.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(13, c5341026h2.bg_start_color) + protoAdapter4.encodedSizeWithTag(14, c5341026h2.bg_end_color) + ProtoAdapter.BOOL.encodedSizeWithTag(15, c5341026h2.has_secure_payment) + C1C76.ADAPTER.encodedSizeWithTag(16, c5341026h2.secure_payment_module) + protoAdapter2.encodedSizeWithTag(17, c5341026h2.suffix_icon) + C754302x3.ADAPTER.encodedSizeWithTag(18, c5341026h2.separate_banner) + c5341026h2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5341026h c5341026h) {
        }
    };
    public Integer background_color;
    public C029C background_image;
    public C618602bA bg_end_color;
    public C618602bA bg_start_color;
    public String da_info;
    public String description;
    public List<C630802d8> expose_user_rights;
    public Boolean has_secure_payment;
    public C029C icon;
    public String schema;
    public C1C76 secure_payment_module;
    public C754302x3 separate_banner;
    public Integer style;
    public C029C suffix_icon;
    public String title;
    public String title_en;

    public C5341026h() {
        super(ADAPTER, ByteString.EMPTY);
        this.expose_user_rights = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02ON newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
