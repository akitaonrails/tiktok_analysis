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

/* JADX INFO: renamed from: X.1Dil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263571Dil extends Message<C2263571Dil, C2263591Din> {
    public static final ProtoAdapter<C2263571Dil> ADAPTER = new ProtoAdapter<C2263571Dil>() { // from class: X.1Dim
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2263571Dil decode(ProtoReader protoReader) {
            C2263591Din c2263591Din = new C2263591Din();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2263591Din.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2263591Din.LJ.add(C2263631Dir.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c2263591Din.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2263591Din.LJI = C1C6D.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2263591Din.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c2263591Din.LJIIIIZZ.add(C1COO.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c2263591Din.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2263591Din.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2263591Din.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2263591Din.LJIIL = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2263591Din.LJIILIIL = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2263591Din.LJIILJJIL = C1DAG.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2263591Din.LJIILL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 14:
                            c2263591Din.LJIILLIIL.add(C2263551Dij.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2263591Din.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2263591Din.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2263571Dil c2263571Dil) {
            C2263571Dil c2263571Dil2 = c2263571Dil;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2263571Dil2.text) + C2263631Dir.ADAPTER.asRepeated().encodedSizeWithTag(2, c2263571Dil2.buttons) + protoAdapter.encodedSizeWithTag(3, c2263571Dil2.title) + C1C6D.ADAPTER.encodedSizeWithTag(4, c2263571Dil2.hyper_link);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c2263571Dil2.type) + C1COO.ADAPTER.asRepeated().encodedSizeWithTag(6, c2263571Dil2.data_list) + protoAdapter.encodedSizeWithTag(7, c2263571Dil2.name) + protoAdapter2.encodedSizeWithTag(8, c2263571Dil2.button_layout) + protoAdapter2.encodedSizeWithTag(9, c2263571Dil2.interaction_type);
            ProtoAdapter<C02U1> protoAdapter3 = C02U1.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(10, c2263571Dil2.image) + protoAdapter3.encodedSizeWithTag(11, c2263571Dil2.image_dark) + C1DAG.ADAPTER.encodedSizeWithTag(12, c2263571Dil2.description) + ProtoAdapter.BOOL.encodedSizeWithTag(13, c2263571Dil2.non_dismissable) + C2263551Dij.ADAPTER.asRepeated().encodedSizeWithTag(14, c2263571Dil2.lists) + c2263571Dil2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2263571Dil c2263571Dil) {
        }
    };
    public Integer button_layout;
    public List<C2263631Dir> buttons;
    public List<C1COO> data_list;
    public C1DAG description;
    public C1C6D hyper_link;
    public C02U1 image;
    public C02U1 image_dark;
    public Integer interaction_type;
    public List<C2263551Dij> lists;
    public String name;
    public Boolean non_dismissable;
    public String text;
    public String title;
    public Integer type;

    @Override // com.squareup.wire.Message
    public C2263591Din newBuilder() {
        return null;
    }

    public C2263571Dil(String str, List<C2263631Dir> list, String str2, C1C6D c1c6d, Integer num, List<C1COO> list2, String str3, Integer num2, Integer num3, C02U1 c02u1, C02U1 c02u12, C1DAG c1dag, Boolean bool, List<C2263551Dij> list3) {
        this(str, list, str2, c1c6d, num, list2, str3, num2, num3, c02u1, c02u12, c1dag, bool, list3, ByteString.EMPTY);
    }

    public C2263571Dil(String str, List<C2263631Dir> list, String str2, C1C6D c1c6d, Integer num, List<C1COO> list2, String str3, Integer num2, Integer num3, C02U1 c02u1, C02U1 c02u12, C1DAG c1dag, Boolean bool, List<C2263551Dij> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = str;
        this.buttons = C1516540pZE.LJFF("buttons", list);
        this.title = str2;
        this.hyper_link = c1c6d;
        this.type = num;
        this.data_list = C1516540pZE.LJFF("data_list", list2);
        this.name = str3;
        this.button_layout = num2;
        this.interaction_type = num3;
        this.image = c02u1;
        this.image_dark = c02u12;
        this.description = c1dag;
        this.non_dismissable = bool;
        this.lists = C1516540pZE.LJFF("lists", list3);
    }
}
