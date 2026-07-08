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

/* JADX INFO: renamed from: X.023Z, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C023Z extends Message<C023Z, C02PM> {
    public static final ProtoAdapter<C023Z> ADAPTER = new ProtoAdapter<C023Z>() { // from class: X.022K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C023Z decode(ProtoReader protoReader) {
            C023Z c023z = new C023Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c023z.title = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c023z.logistics_descriptions.add(C5431029t.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c023z.logistic_price = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c023z.extra_info = C551402Cy.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c023z.descriptions_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c023z.pudo_service_list = C02ZU.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c023z.selected_status = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c023z.title_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c023z.logistics_expression_sub_area.add(AnonymousClass0261.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c023z.logistics_unavailable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c023z.shipping_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c023z.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c023z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C023Z c023z) {
            C023Z c023z2 = c023z;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c023z2.title) + protoAdapter.asRepeated().encodedSizeWithTag(2, c023z2.logistics_descriptions) + protoAdapter.encodedSizeWithTag(3, c023z2.logistic_price) + C551402Cy.ADAPTER.encodedSizeWithTag(4, c023z2.extra_info);
            ProtoAdapter<C029C> protoAdapter2 = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c023z2.descriptions_icon) + C02ZU.ADAPTER.encodedSizeWithTag(6, c023z2.pudo_service_list);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c023z2.selected_status) + protoAdapter2.encodedSizeWithTag(8, c023z2.title_icon) + AnonymousClass0261.ADAPTER.asRepeated().encodedSizeWithTag(9, c023z2.logistics_expression_sub_area) + protoAdapter3.encodedSizeWithTag(10, c023z2.logistics_unavailable) + ProtoAdapter.INT32.encodedSizeWithTag(11, c023z2.shipping_type) + ProtoAdapter.STRING.encodedSizeWithTag(12, c023z2.link) + c023z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C023Z c023z) {
        }
    };
    public C029C descriptions_icon;
    public C551402Cy extra_info;
    public String link;
    public C5431029t logistic_price;
    public List<C5431029t> logistics_descriptions;
    public List<AnonymousClass0261> logistics_expression_sub_area;
    public Boolean logistics_unavailable;
    public C02ZU pudo_service_list;
    public Boolean selected_status;
    public Integer shipping_type;
    public C5431029t title;
    public C029C title_icon;

    public C023Z() {
        super(ADAPTER, ByteString.EMPTY);
        this.logistics_descriptions = C1516540pZE.LJIIIIZZ();
        this.logistics_expression_sub_area = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02PM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
