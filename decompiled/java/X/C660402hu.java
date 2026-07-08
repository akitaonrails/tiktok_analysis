package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C660402hu extends Message<C660402hu, C660502hv> {
    public static final ProtoAdapter<C660402hu> ADAPTER = new ProtoAdapter<C660402hu>() { // from class: X.02ht
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C660402hu decode(ProtoReader protoReader) {
            C660402hu c660402hu = new C660402hu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c660402hu.payment_unit_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c660402hu.fund_source = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c660402hu.balance_tips = C02B0.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c660402hu.payment_price_version_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c660402hu.icon_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c660402hu.icon_url_dark = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c660402hu.display_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c660402hu.single_payment_infos.add(C660102hr.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c660402hu.fund_token = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        case BdTuring.TYPE_EMAIL /* 11 */:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c660402hu.original_quantity = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c660402hu.conversion_ratio = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c660402hu.balance_amount = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c660402hu.availability = C554402Ec.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c660402hu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C660402hu c660402hu) {
            C660402hu c660402hu2 = c660402hu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c660402hu2.payment_unit_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, c660402hu2.fund_source) + C02B0.ADAPTER.encodedSizeWithTag(3, c660402hu2.balance_tips) + protoAdapter.encodedSizeWithTag(4, c660402hu2.payment_price_version_id) + protoAdapter.encodedSizeWithTag(5, c660402hu2.icon_url) + protoAdapter.encodedSizeWithTag(6, c660402hu2.icon_url_dark) + protoAdapter.encodedSizeWithTag(7, c660402hu2.display_name) + C660102hr.ADAPTER.asRepeated().encodedSizeWithTag(8, c660402hu2.single_payment_infos) + protoAdapter.encodedSizeWithTag(9, c660402hu2.fund_token) + protoAdapter.encodedSizeWithTag(12, c660402hu2.original_quantity) + protoAdapter.encodedSizeWithTag(13, c660402hu2.conversion_ratio) + C614702aX.ADAPTER.encodedSizeWithTag(14, c660402hu2.balance_amount) + C554402Ec.ADAPTER.encodedSizeWithTag(15, c660402hu2.availability) + c660402hu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C660402hu c660402hu) {
        }
    };
    public C554402Ec availability;
    public C614702aX balance_amount;
    public C02B0 balance_tips;
    public String conversion_ratio;
    public String display_name;
    public Long fund_source;
    public String fund_token;
    public String icon_url;
    public String icon_url_dark;
    public String original_quantity;
    public String payment_price_version_id;
    public String payment_unit_id;
    public List<C660102hr> single_payment_infos;

    public C660402hu() {
        super(ADAPTER, ByteString.EMPTY);
        this.single_payment_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C660502hv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
