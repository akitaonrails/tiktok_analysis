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

/* JADX INFO: renamed from: X.0291, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0291 extends Message<AnonymousClass0291, C579902Nx> {
    public static final ProtoAdapter<AnonymousClass0291> ADAPTER = new ProtoAdapter<AnonymousClass0291>() { // from class: X.0292
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0291 decode(ProtoReader protoReader) {
            AnonymousClass0291 anonymousClass0291 = new AnonymousClass0291();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0291.bg_image = C643802fE.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0291.left_image = C643802fE.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0291.equity_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0291.text_color = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0291.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0291.right_id_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            anonymousClass0291.store_brand_info.add(C02Z5.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            anonymousClass0291.default_authorized_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0291.brand_authorized_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0291.store_brand_size = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0291.best_store_brand = C02Z5.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0291;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0291 anonymousClass0291) {
            AnonymousClass0291 anonymousClass02912 = anonymousClass0291;
            ProtoAdapter<C643802fE> protoAdapter = C643802fE.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02912.bg_image) + protoAdapter.encodedSizeWithTag(2, anonymousClass02912.left_image);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, anonymousClass02912.equity_text) + C658602hc.ADAPTER.encodedSizeWithTag(4, anonymousClass02912.text_color) + protoAdapter2.encodedSizeWithTag(5, anonymousClass02912.schema) + protoAdapter2.asRepeated().encodedSizeWithTag(6, anonymousClass02912.right_id_list);
            ProtoAdapter<C02Z5> protoAdapter3 = C02Z5.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.asRepeated().encodedSizeWithTag(7, anonymousClass02912.store_brand_info) + protoAdapter2.encodedSizeWithTag(8, anonymousClass02912.default_authorized_text) + protoAdapter2.encodedSizeWithTag(9, anonymousClass02912.brand_authorized_text) + ProtoAdapter.INT64.encodedSizeWithTag(10, anonymousClass02912.store_brand_size) + protoAdapter3.encodedSizeWithTag(11, anonymousClass02912.best_store_brand) + anonymousClass02912.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0291 anonymousClass0291) {
        }
    };
    public C02Z5 best_store_brand;
    public C643802fE bg_image;
    public String brand_authorized_text;
    public String default_authorized_text;
    public String equity_text;
    public C643802fE left_image;
    public List<String> right_id_list;
    public String schema;
    public List<C02Z5> store_brand_info;
    public Long store_brand_size;
    public C658602hc text_color;

    public AnonymousClass0291() {
        super(ADAPTER, ByteString.EMPTY);
        this.right_id_list = C1516540pZE.LJIIIIZZ();
        this.store_brand_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C579902Nx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
