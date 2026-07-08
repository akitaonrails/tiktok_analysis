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

/* JADX INFO: renamed from: X.023N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C023N extends Message<C023N, C02N6> {
    public static final ProtoAdapter<C023N> ADAPTER = new ProtoAdapter<C023N>() { // from class: X.022q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C023N decode(ProtoReader protoReader) {
            C023N c023n = new C023N();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c023n.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c023n.items.add(C02HA.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c023n.region = C02D6.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c023n.districts.add(C02D6.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c023n.address_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c023n.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c023n.rich_info_list.add(C02AP.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            c023n.delivery_instruction_info = C02AX.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c023n.address_base = C026T.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c023n.pudo_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c023n.address_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c023n.longitude = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c023n.latitude = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c023n.tokopro_address_source = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c023n;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C023N c023n) {
            C023N c023n2 = c023n;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c023n2.id) + C02HA.ADAPTER.asRepeated().encodedSizeWithTag(2, c023n2.items);
            ProtoAdapter<C02D6> protoAdapter2 = C02D6.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c023n2.region) + protoAdapter2.asRepeated().encodedSizeWithTag(4, c023n2.districts) + protoAdapter.encodedSizeWithTag(5, c023n2.address_id) + protoAdapter.encodedSizeWithTag(6, c023n2.title) + C02AP.ADAPTER.asRepeated().encodedSizeWithTag(7, c023n2.rich_info_list) + C02AX.ADAPTER.encodedSizeWithTag(8, c023n2.delivery_instruction_info) + C026T.ADAPTER.encodedSizeWithTag(9, c023n2.address_base) + protoAdapter.encodedSizeWithTag(10, c023n2.pudo_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(11, c023n2.address_type) + protoAdapter.encodedSizeWithTag(12, c023n2.longitude) + protoAdapter.encodedSizeWithTag(13, c023n2.latitude) + protoAdapter3.encodedSizeWithTag(14, c023n2.tokopro_address_source) + c023n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C023N c023n) {
        }
    };
    public C026T address_base;
    public String address_id;
    public Integer address_type;
    public C02AX delivery_instruction_info;
    public List<C02D6> districts;
    public String id;
    public List<C02HA> items;
    public String latitude;
    public String longitude;
    public String pudo_id;
    public C02D6 region;
    public List<C02AP> rich_info_list;
    public String title;
    public Integer tokopro_address_source;

    public C023N() {
        super(ADAPTER, ByteString.EMPTY);
        this.items = C1516540pZE.LJIIIIZZ();
        this.districts = C1516540pZE.LJIIIIZZ();
        this.rich_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02N6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
