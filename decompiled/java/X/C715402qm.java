package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C715402qm extends Message<C715402qm, C715502qn> {
    public static final ProtoAdapter<C715402qm> ADAPTER = new ProtoAdapter<C715402qm>() { // from class: X.02ql
        public final ProtoAdapter<Map<String, C613502aL>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C613502aL.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C715402qm decode(ProtoReader protoReader) {
            C715402qm c715402qm = new C715402qm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c715402qm.template = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c715402qm.arguments.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 3:
                            c715402qm.text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c715402qm.text_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c715402qm.prefix_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c715402qm.suffix_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c715402qm.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c715402qm.extra_info = C728802sw.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c715402qm.text_color_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c715402qm.text_font_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c715402qm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C715402qm c715402qm) {
            C715402qm c715402qm2 = c715402qm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c715402qm2.template) + this.LIZ.encodedSizeWithTag(2, c715402qm2.arguments) + protoAdapter.encodedSizeWithTag(3, c715402qm2.text_color) + protoAdapter.encodedSizeWithTag(4, c715402qm2.text_dark_color);
            ProtoAdapter<C029C> protoAdapter2 = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c715402qm2.prefix_icon) + protoAdapter2.encodedSizeWithTag(6, c715402qm2.suffix_icon) + protoAdapter.encodedSizeWithTag(7, c715402qm2.link) + C728802sw.ADAPTER.encodedSizeWithTag(8, c715402qm2.extra_info);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(9, c715402qm2.text_color_type) + protoAdapter3.encodedSizeWithTag(10, c715402qm2.text_font_type) + c715402qm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C715402qm c715402qm) {
        }
    };
    public Map<String, C613502aL> arguments;
    public C728802sw extra_info;
    public String link;
    public C029C prefix_icon;
    public C029C suffix_icon;
    public String template;
    public String text_color;
    public Integer text_color_type;
    public String text_dark_color;
    public Integer text_font_type;

    @Override // com.squareup.wire.Message
    public C715502qn newBuilder() {
        return null;
    }

    public C715402qm() {
        super(ADAPTER, ByteString.EMPTY);
        this.arguments = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
