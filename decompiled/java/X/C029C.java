package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.029C, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C029C extends Message<C029C, C02NI> {
    public static final ProtoAdapter<C029C> ADAPTER = new ProtoAdapter<C029C>() { // from class: X.0259
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C029C decode(ProtoReader protoReader) {
            C029C c029c = new C029C();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c029c.icon = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c029c.icon_dark = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c029c.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c029c.view_width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c029c.view_height = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c029c.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c029c.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c029c.text_link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c029c.tux_token = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c029c.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c029c.prefix_element = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c029c.suffix_element = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c029c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C029C c029c) {
            C029C c029c2 = c029c;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c029c2.icon) + protoAdapter.encodedSizeWithTag(2, c029c2.icon_dark);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c029c2.link);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c029c2.view_width) + protoAdapter3.encodedSizeWithTag(5, c029c2.view_height) + protoAdapter3.encodedSizeWithTag(6, c029c2.type) + protoAdapter2.encodedSizeWithTag(7, c029c2.text) + protoAdapter2.encodedSizeWithTag(8, c029c2.text_link) + protoAdapter2.encodedSizeWithTag(9, c029c2.tux_token) + protoAdapter2.encodedSizeWithTag(10, c029c2.da_info) + protoAdapter3.encodedSizeWithTag(11, c029c2.prefix_element) + protoAdapter3.encodedSizeWithTag(12, c029c2.suffix_element) + c029c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C029C c029c) {
        }
    };
    public String da_info;
    public C02U1 icon;
    public C02U1 icon_dark;
    public String link;
    public Integer prefix_element;
    public Integer suffix_element;
    public String text;
    public String text_link;
    public String tux_token;
    public Integer type;
    public Integer view_height;
    public Integer view_width;

    public C029C() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
