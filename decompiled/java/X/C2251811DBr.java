package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251811DBr extends Message<C2251811DBr, C694602nQ> {
    public static final ProtoAdapter<C2251811DBr> ADAPTER = new ProtoAdapter<C2251811DBr>() { // from class: X.1DBq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251811DBr decode(ProtoReader protoReader) {
            C2251811DBr c2251811DBr = new C2251811DBr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251811DBr.key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251811DBr.val = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2251811DBr.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2251811DBr.icon_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2251811DBr.notification_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2251811DBr.dark_icon_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2251811DBr.min_limited_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2251811DBr.max_limited_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2251811DBr.availability = C554402Ec.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2251811DBr.balance = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2251811DBr.currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2251811DBr.is_choose_recommend = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251811DBr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251811DBr c2251811DBr) {
            C2251811DBr c2251811DBr2 = c2251811DBr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2251811DBr2.key) + protoAdapter.encodedSizeWithTag(2, c2251811DBr2.val) + protoAdapter.encodedSizeWithTag(3, c2251811DBr2.name) + protoAdapter.encodedSizeWithTag(4, c2251811DBr2.icon_url) + protoAdapter.encodedSizeWithTag(5, c2251811DBr2.notification_url) + protoAdapter.encodedSizeWithTag(6, c2251811DBr2.dark_icon_url) + protoAdapter.encodedSizeWithTag(7, c2251811DBr2.min_limited_amount) + protoAdapter.encodedSizeWithTag(8, c2251811DBr2.max_limited_amount) + C554402Ec.ADAPTER.encodedSizeWithTag(9, c2251811DBr2.availability) + protoAdapter.encodedSizeWithTag(10, c2251811DBr2.balance) + protoAdapter.encodedSizeWithTag(11, c2251811DBr2.currency) + ProtoAdapter.BOOL.encodedSizeWithTag(12, c2251811DBr2.is_choose_recommend) + c2251811DBr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2251811DBr c2251811DBr) {
        }
    };
    public C554402Ec availability;
    public String balance;
    public String currency;
    public String dark_icon_url;
    public String icon_url;
    public Boolean is_choose_recommend;
    public String key;
    public String max_limited_amount;
    public String min_limited_amount;
    public String name;
    public String notification_url;
    public String val;

    public C2251811DBr() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C694602nQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
