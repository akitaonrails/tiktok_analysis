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

/* JADX INFO: renamed from: X.1Dio, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263601Dio extends Message<C2263601Dio, C2263621Diq> {
    public static final ProtoAdapter<C2263601Dio> ADAPTER = new ProtoAdapter<C2263601Dio>() { // from class: X.1Dip
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2263601Dio decode(ProtoReader protoReader) {
            C2263621Diq c2263621Diq = new C2263621Diq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 2:
                            c2263621Diq.LIZLLL = C554202Ea.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c2263621Diq.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2263621Diq.LJFF.add(C2263631Dir.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c2263621Diq.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2263621Diq.LJII = C1C6D.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2263621Diq.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c2263621Diq.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2263621Diq.LJIIJ = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2263621Diq.LJIIJJI = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2263621Diq.LJIIL.add(C1COO.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2263621Diq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2263621Diq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2263601Dio c2263601Dio) {
            C2263601Dio c2263601Dio2 = c2263601Dio;
            int iEncodedSizeWithTag = C554202Ea.ADAPTER.encodedSizeWithTag(2, c2263601Dio2.phone_contact);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c2263601Dio2.text) + C2263631Dir.ADAPTER.asRepeated().encodedSizeWithTag(4, c2263601Dio2.buttons) + protoAdapter.encodedSizeWithTag(5, c2263601Dio2.title) + C1C6D.ADAPTER.encodedSizeWithTag(6, c2263601Dio2.hyper_link) + ProtoAdapter.INT32.encodedSizeWithTag(7, c2263601Dio2.type) + protoAdapter.encodedSizeWithTag(8, c2263601Dio2.name);
            ProtoAdapter<C02U1> protoAdapter2 = C02U1.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(9, c2263601Dio2.image) + protoAdapter2.encodedSizeWithTag(10, c2263601Dio2.image_dark) + C1COO.ADAPTER.asRepeated().encodedSizeWithTag(11, c2263601Dio2.data_list) + c2263601Dio2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2263601Dio c2263601Dio) {
        }
    };
    public List<C2263631Dir> buttons;
    public List<C1COO> data_list;
    public C1C6D hyper_link;
    public C02U1 image;
    public C02U1 image_dark;
    public String name;
    public C554202Ea phone_contact;
    public String text;
    public String title;
    public Integer type;

    @Override // com.squareup.wire.Message
    public C2263621Diq newBuilder() {
        return null;
    }

    public C2263601Dio(C554202Ea c554202Ea, String str, List<C2263631Dir> list, String str2, C1C6D c1c6d, Integer num, String str3, C02U1 c02u1, C02U1 c02u12, List<C1COO> list2) {
        this(c554202Ea, str, list, str2, c1c6d, num, str3, c02u1, c02u12, list2, ByteString.EMPTY);
    }

    public C2263601Dio(C554202Ea c554202Ea, String str, List<C2263631Dir> list, String str2, C1C6D c1c6d, Integer num, String str3, C02U1 c02u1, C02U1 c02u12, List<C1COO> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.phone_contact = c554202Ea;
        this.text = str;
        this.buttons = C1516540pZE.LJFF("buttons", list);
        this.title = str2;
        this.hyper_link = c1c6d;
        this.type = num;
        this.name = str3;
        this.image = c02u1;
        this.image_dark = c02u12;
        this.data_list = C1516540pZE.LJFF("data_list", list2);
    }
}
