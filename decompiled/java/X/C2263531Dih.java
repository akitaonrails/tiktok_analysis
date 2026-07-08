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

/* JADX INFO: renamed from: X.1Dih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263531Dih extends Message<C2263531Dih, C763202yU> {
    public static final ProtoAdapter<C2263531Dih> ADAPTER = new ProtoAdapter<C2263531Dih>() { // from class: X.1Dig
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2263531Dih decode(ProtoReader protoReader) {
            C2263531Dih c2263531Dih = new C2263531Dih();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2263531Dih.key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2263531Dih.value = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2263531Dih.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2263531Dih.image_list.add(C02U1.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c2263531Dih.icon_list.add(C029C.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c2263531Dih.item_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2263531Dih.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c2263531Dih.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2263531Dih.is_from_tc_data = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2263531Dih.hidden = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2263531Dih.data_list.add(C2263531Dih.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2263531Dih.item_style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2263531Dih.formatted_text = C1DAG.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c2263531Dih.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c2263531Dih.id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c2263531Dih.description_tag = C2223341C0e.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2263531Dih;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2263531Dih c2263531Dih) {
            C2263531Dih c2263531Dih2 = c2263531Dih;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2263531Dih2.key) + protoAdapter.encodedSizeWithTag(2, c2263531Dih2.value);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2263531Dih2.type) + C02U1.ADAPTER.asRepeated().encodedSizeWithTag(4, c2263531Dih2.image_list) + C029C.ADAPTER.asRepeated().encodedSizeWithTag(5, c2263531Dih2.icon_list) + protoAdapter.encodedSizeWithTag(6, c2263531Dih2.item_key) + protoAdapter.encodedSizeWithTag(7, c2263531Dih2.link) + protoAdapter.encodedSizeWithTag(8, c2263531Dih2.description);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(9, c2263531Dih2.is_from_tc_data) + protoAdapter3.encodedSizeWithTag(10, c2263531Dih2.hidden) + C2263531Dih.ADAPTER.asRepeated().encodedSizeWithTag(11, c2263531Dih2.data_list) + protoAdapter2.encodedSizeWithTag(12, c2263531Dih2.item_style) + C1DAG.ADAPTER.encodedSizeWithTag(13, c2263531Dih2.formatted_text) + protoAdapter.encodedSizeWithTag(14, c2263531Dih2.title) + protoAdapter.encodedSizeWithTag(15, c2263531Dih2.id) + C2223341C0e.ADAPTER.encodedSizeWithTag(16, c2263531Dih2.description_tag) + c2263531Dih2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2263531Dih c2263531Dih) {
        }
    };
    public List<C2263531Dih> data_list;
    public String description;
    public C2223341C0e description_tag;
    public C1DAG formatted_text;
    public Boolean hidden;
    public List<C029C> icon_list;
    public String id;
    public List<C02U1> image_list;
    public Boolean is_from_tc_data;
    public String item_key;
    public Integer item_style;
    public String key;
    public String link;
    public String title;
    public Integer type;
    public String value;

    public C2263531Dih() {
        super(ADAPTER, ByteString.EMPTY);
        this.image_list = C1516540pZE.LJIIIIZZ();
        this.icon_list = C1516540pZE.LJIIIIZZ();
        this.data_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C763202yU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
