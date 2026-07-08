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

/* JADX INFO: renamed from: X.024m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5294024m extends Message<C5294024m, C583102Pd> {
    public static final ProtoAdapter<C5294024m> ADAPTER = new ProtoAdapter<C5294024m>() { // from class: X.022m
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5294024m decode(ProtoReader protoReader) {
            C5294024m c5294024m = new C5294024m();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5294024m.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5294024m.title_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5294024m.banner_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5294024m.tc_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5294024m.tc_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5294024m.button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5294024m.description_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5294024m.vap_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5294024m.promotion_coupon_module_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5294024m.sub_item.add(C549802Ci.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c5294024m.coupon_price = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c5294024m.selected_status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c5294024m.style_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5294024m;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5294024m c5294024m) {
            C5294024m c5294024m2 = c5294024m;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5294024m2.title) + C029C.ADAPTER.encodedSizeWithTag(2, c5294024m2.title_icon) + protoAdapter.encodedSizeWithTag(3, c5294024m2.banner_text) + protoAdapter.encodedSizeWithTag(4, c5294024m2.tc_title) + protoAdapter.encodedSizeWithTag(5, c5294024m2.tc_schema) + protoAdapter.encodedSizeWithTag(6, c5294024m2.button_text);
            ProtoAdapter<C5431029t> protoAdapter2 = C5431029t.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, c5294024m2.description_text) + protoAdapter.encodedSizeWithTag(8, c5294024m2.vap_schema);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(9, c5294024m2.promotion_coupon_module_type) + C549802Ci.ADAPTER.asRepeated().encodedSizeWithTag(10, c5294024m2.sub_item) + protoAdapter2.encodedSizeWithTag(11, c5294024m2.coupon_price) + protoAdapter3.encodedSizeWithTag(12, c5294024m2.selected_status) + protoAdapter3.encodedSizeWithTag(13, c5294024m2.style_type) + c5294024m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5294024m c5294024m) {
        }
    };
    public String banner_text;
    public String button_text;
    public C5431029t coupon_price;
    public C5431029t description_text;
    public Integer promotion_coupon_module_type;
    public Integer selected_status;
    public Integer style_type;
    public List<C549802Ci> sub_item;
    public String tc_schema;
    public String tc_title;
    public String title;
    public C029C title_icon;
    public String vap_schema;

    public C5294024m() {
        super(ADAPTER, ByteString.EMPTY);
        this.sub_item = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C583102Pd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
