package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BJ extends Message<C02BJ, C576302Mn> {
    public static final ProtoAdapter<C02BJ> ADAPTER = new ProtoAdapter<C02BJ>() { // from class: X.025z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BJ decode(ProtoReader protoReader) {
            C02BJ c02bj = new C02BJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02bj.style_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02bj.text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02bj.text_background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02bj.count_down_background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02bj.count_down_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02bj.text_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02bj.text_background_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02bj.count_down_background_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02bj.count_down_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02bj.count_down_precision_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BJ c02bj) {
            C02BJ c02bj2 = c02bj;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02bj2.style_type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02bj2.text_color) + protoAdapter2.encodedSizeWithTag(3, c02bj2.text_background_color) + protoAdapter2.encodedSizeWithTag(4, c02bj2.count_down_background_color) + protoAdapter2.encodedSizeWithTag(5, c02bj2.count_down_color) + protoAdapter2.encodedSizeWithTag(6, c02bj2.text_dark_color) + protoAdapter2.encodedSizeWithTag(7, c02bj2.text_background_dark_color) + protoAdapter2.encodedSizeWithTag(8, c02bj2.count_down_background_dark_color) + protoAdapter2.encodedSizeWithTag(9, c02bj2.count_down_dark_color) + protoAdapter.encodedSizeWithTag(10, c02bj2.count_down_precision_type) + c02bj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02BJ c02bj) {
        }
    };
    public String count_down_background_color;
    public String count_down_background_dark_color;
    public String count_down_color;
    public String count_down_dark_color;
    public Integer count_down_precision_type;
    public Integer style_type;
    public String text_background_color;
    public String text_background_dark_color;
    public String text_color;
    public String text_dark_color;

    public C02BJ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C576302Mn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
