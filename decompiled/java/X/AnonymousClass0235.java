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

/* JADX INFO: renamed from: X.0235, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0235 extends Message<AnonymousClass0235, C02PA> {
    public static final ProtoAdapter<AnonymousClass0235> ADAPTER = new ProtoAdapter<AnonymousClass0235>() { // from class: X.021w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0235 decode(ProtoReader protoReader) {
            AnonymousClass0235 anonymousClass0235 = new AnonymousClass0235();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0235.sale_props.add(AnonymousClass0240.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            anonymousClass0235.skus.add(C5201020x.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            anonymousClass0235.skc_info = C548202Bs.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0235.product_base = AnonymousClass0219.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0235.local_size_sale_prop = C549502Cf.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0235.biz_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0235.product_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0235.is_with_default_sku = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0235.default_sku_selection = C594002Ti.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0235.is_single_row = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0235.promotion_label_info = C5424029m.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0235.sku_panel_waist_banner = C027P.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0235;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0235 anonymousClass0235) {
            AnonymousClass0235 anonymousClass02352 = anonymousClass0235;
            int iEncodedSizeWithTag = AnonymousClass0240.ADAPTER.asRepeated().encodedSizeWithTag(1, anonymousClass02352.sale_props) + C5201020x.ADAPTER.asRepeated().encodedSizeWithTag(2, anonymousClass02352.skus) + C548202Bs.ADAPTER.encodedSizeWithTag(3, anonymousClass02352.skc_info) + AnonymousClass0219.ADAPTER.encodedSizeWithTag(4, anonymousClass02352.product_base) + C549502Cf.ADAPTER.encodedSizeWithTag(5, anonymousClass02352.local_size_sale_prop) + ProtoAdapter.INT32.encodedSizeWithTag(6, anonymousClass02352.biz_type) + ProtoAdapter.STRING.encodedSizeWithTag(7, anonymousClass02352.product_id);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(8, anonymousClass02352.is_with_default_sku) + C594002Ti.ADAPTER.encodedSizeWithTag(9, anonymousClass02352.default_sku_selection) + protoAdapter.encodedSizeWithTag(10, anonymousClass02352.is_single_row) + C5424029m.ADAPTER.encodedSizeWithTag(11, anonymousClass02352.promotion_label_info) + C027P.ADAPTER.encodedSizeWithTag(12, anonymousClass02352.sku_panel_waist_banner) + anonymousClass02352.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0235 anonymousClass0235) {
        }
    };
    public Integer biz_type;
    public C594002Ti default_sku_selection;
    public Boolean is_single_row;
    public Boolean is_with_default_sku;
    public C549502Cf local_size_sale_prop;
    public AnonymousClass0219 product_base;
    public String product_id;
    public C5424029m promotion_label_info;
    public List<AnonymousClass0240> sale_props;
    public C548202Bs skc_info;
    public C027P sku_panel_waist_banner;
    public List<C5201020x> skus;

    public AnonymousClass0235() {
        super(ADAPTER, ByteString.EMPTY);
        this.sale_props = C1516540pZE.LJIIIIZZ();
        this.skus = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02PA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
