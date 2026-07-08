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

/* JADX INFO: renamed from: X.02Rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C589102Rl extends Message<C589102Rl, C589202Rm> {
    public static final ProtoAdapter<C589102Rl> ADAPTER = new ProtoAdapter<C589102Rl>() { // from class: X.02Rk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C589102Rl decode(ProtoReader protoReader) {
            C589102Rl c589102Rl = new C589102Rl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c589102Rl.bg_image = C643802fE.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c589102Rl.left_image = C643802fE.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c589102Rl.equity_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c589102Rl.text_color = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c589102Rl.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c589102Rl.right_image = C643802fE.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c589102Rl.right_id_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            c589102Rl.bg_stroke_color = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c589102Rl.default_gradient_start = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c589102Rl.default_gradient_end = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c589102Rl.right_info_list.add(C693302nD.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c589102Rl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C589102Rl c589102Rl) {
            C589102Rl c589102Rl2 = c589102Rl;
            ProtoAdapter<C643802fE> protoAdapter = C643802fE.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c589102Rl2.bg_image) + protoAdapter.encodedSizeWithTag(2, c589102Rl2.left_image);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c589102Rl2.equity_text);
            ProtoAdapter<C658602hc> protoAdapter3 = C658602hc.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c589102Rl2.text_color) + protoAdapter2.encodedSizeWithTag(5, c589102Rl2.schema) + protoAdapter.encodedSizeWithTag(6, c589102Rl2.right_image) + protoAdapter2.asRepeated().encodedSizeWithTag(7, c589102Rl2.right_id_list) + protoAdapter3.encodedSizeWithTag(8, c589102Rl2.bg_stroke_color) + protoAdapter3.encodedSizeWithTag(9, c589102Rl2.default_gradient_start) + protoAdapter3.encodedSizeWithTag(10, c589102Rl2.default_gradient_end) + C693302nD.ADAPTER.asRepeated().encodedSizeWithTag(11, c589102Rl2.right_info_list) + c589102Rl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C589102Rl c589102Rl) {
        }
    };
    public C643802fE bg_image;
    public C658602hc bg_stroke_color;
    public C658602hc default_gradient_end;
    public C658602hc default_gradient_start;
    public String equity_text;
    public C643802fE left_image;
    public List<String> right_id_list;
    public C643802fE right_image;
    public List<C693302nD> right_info_list;
    public String schema;
    public C658602hc text_color;

    public C589102Rl() {
        super(ADAPTER, ByteString.EMPTY);
        this.right_id_list = C1516540pZE.LJIIIIZZ();
        this.right_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C589202Rm newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
