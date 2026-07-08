package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251631DAz extends Message<C2251631DAz, C1DB0> {
    public static final ProtoAdapter<C2251631DAz> ADAPTER = new ProtoAdapter<C2251631DAz>() { // from class: X.1DAy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251631DAz decode(ProtoReader protoReader) {
            C2251631DAz c2251631DAz = new C2251631DAz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251631DAz.amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251631DAz.currency = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2251631DAz.category = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2251631DAz.category_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                        case 6:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 7:
                            c2251631DAz.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2251631DAz.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2251631DAz.quantity = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2251631DAz.seller_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2251631DAz.unit_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251631DAz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251631DAz c2251631DAz) {
            C2251631DAz c2251631DAz2 = c2251631DAz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2251631DAz2.amount) + protoAdapter.encodedSizeWithTag(2, c2251631DAz2.currency) + protoAdapter.encodedSizeWithTag(3, c2251631DAz2.category) + protoAdapter.encodedSizeWithTag(4, c2251631DAz2.category_id) + protoAdapter.encodedSizeWithTag(7, c2251631DAz2.description) + protoAdapter.encodedSizeWithTag(8, c2251631DAz2.id) + ProtoAdapter.INT64.encodedSizeWithTag(9, c2251631DAz2.quantity) + protoAdapter.encodedSizeWithTag(10, c2251631DAz2.seller_id) + protoAdapter.encodedSizeWithTag(11, c2251631DAz2.unit_price) + c2251631DAz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2251631DAz c2251631DAz) {
        }
    };
    public String amount;
    public String category;
    public String category_id;
    public String currency;
    public String description;
    public String id;
    public Long quantity;
    public String seller_id;
    public String unit_price;

    public C2251631DAz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1DB0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
