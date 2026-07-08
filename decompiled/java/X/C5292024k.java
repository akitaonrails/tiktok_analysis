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

/* JADX INFO: renamed from: X.024k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5292024k extends Message<C5292024k, C02N2> {
    public static final ProtoAdapter<C5292024k> ADAPTER = new ProtoAdapter<C5292024k>() { // from class: X.022V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5292024k decode(ProtoReader protoReader) {
            C5292024k c5292024k = new C5292024k();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5292024k.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5292024k.user_right_details.add(C5220021q.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c5292024k.contact_detail = C02WQ.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5292024k.track_params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5292024k.expose_panel = C5341026h.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5292024k.privacy_policy.add(C02FD.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c5292024k.bottom_tip = C02DV.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c5292024k.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5292024k.prefix_name = C544002Ac.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c5292024k.price_right_details.add(C5220021q.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5292024k;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5292024k c5292024k) {
            C5292024k c5292024k2 = c5292024k;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5292024k2.name);
            ProtoAdapter<C5220021q> protoAdapter2 = C5220021q.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(2, c5292024k2.user_right_details) + C02WQ.ADAPTER.encodedSizeWithTag(3, c5292024k2.contact_detail) + protoAdapter.encodedSizeWithTag(4, c5292024k2.track_params) + C5341026h.ADAPTER.encodedSizeWithTag(5, c5292024k2.expose_panel) + C02FD.ADAPTER.asRepeated().encodedSizeWithTag(6, c5292024k2.privacy_policy) + C02DV.ADAPTER.encodedSizeWithTag(7, c5292024k2.bottom_tip) + C029C.ADAPTER.encodedSizeWithTag(8, c5292024k2.icon) + C544002Ac.ADAPTER.encodedSizeWithTag(9, c5292024k2.prefix_name) + protoAdapter2.asRepeated().encodedSizeWithTag(10, c5292024k2.price_right_details) + c5292024k2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5292024k c5292024k) {
        }
    };
    public C02DV bottom_tip;
    public C02WQ contact_detail;
    public C5341026h expose_panel;
    public C029C icon;
    public String name;
    public C544002Ac prefix_name;
    public List<C5220021q> price_right_details;
    public List<C02FD> privacy_policy;
    public String track_params;
    public List<C5220021q> user_right_details;

    public C5292024k() {
        super(ADAPTER, ByteString.EMPTY);
        this.user_right_details = C1516540pZE.LJIIIIZZ();
        this.privacy_policy = C1516540pZE.LJIIIIZZ();
        this.price_right_details = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02N2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
