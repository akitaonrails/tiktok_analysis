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

/* JADX INFO: renamed from: X.02ZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02ZZ extends Message<C02ZZ, C608802Za> {
    public static final ProtoAdapter<C02ZZ> ADAPTER = new ProtoAdapter<C02ZZ>() { // from class: X.02ZY
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02ZZ decode(ProtoReader protoReader) {
            C02ZZ c02zz = new C02ZZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02zz.official_label = C549702Ch.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 3:
                            c02zz.is_verified = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c02zz.visitor_tag = C640802ek.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02zz.review_tag = C640202ee.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02zz.bought_tag = C639902eb.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c02zz.brand_label_list.add(C693702nH.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            c02zz.top_brand_label = C741202uw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02zz.store_identity_label = AnonymousClass0298.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02zz.store_toko_label.add(C692102n1.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02zz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02ZZ c02zz) {
            C02ZZ c02zz2 = c02zz;
            return C549702Ch.ADAPTER.encodedSizeWithTag(1, c02zz2.official_label) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02zz2.is_verified) + C640802ek.ADAPTER.encodedSizeWithTag(4, c02zz2.visitor_tag) + C640202ee.ADAPTER.encodedSizeWithTag(5, c02zz2.review_tag) + C639902eb.ADAPTER.encodedSizeWithTag(6, c02zz2.bought_tag) + C693702nH.ADAPTER.asRepeated().encodedSizeWithTag(7, c02zz2.brand_label_list) + C741202uw.ADAPTER.encodedSizeWithTag(8, c02zz2.top_brand_label) + AnonymousClass0298.ADAPTER.encodedSizeWithTag(9, c02zz2.store_identity_label) + C692102n1.ADAPTER.asRepeated().encodedSizeWithTag(10, c02zz2.store_toko_label) + c02zz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02ZZ c02zz) {
        }
    };
    public C639902eb bought_tag;
    public List<C693702nH> brand_label_list;
    public Boolean is_verified;
    public C549702Ch official_label;
    public C640202ee review_tag;
    public AnonymousClass0298 store_identity_label;
    public List<C692102n1> store_toko_label;
    public C741202uw top_brand_label;
    public C640802ek visitor_tag;

    public C02ZZ() {
        super(ADAPTER, ByteString.EMPTY);
        this.brand_label_list = C1516540pZE.LJIIIIZZ();
        this.store_toko_label = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C608802Za newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
