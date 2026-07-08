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

/* JADX INFO: renamed from: X.0241, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0241 extends Message<AnonymousClass0241, C02P1> {
    public static final ProtoAdapter<AnonymousClass0241> ADAPTER = new ProtoAdapter<AnonymousClass0241>() { // from class: X.0224
        public final ProtoAdapter<Map<String, C025E>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, C025E.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0241 decode(ProtoReader protoReader) {
            AnonymousClass0241 anonymousClass0241 = new AnonymousClass0241();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0241.template = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0241.arguments.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 3:
                            anonymousClass0241.text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0241.text_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0241.prefix_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0241.suffix_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0241.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0241.extra_info = C686402m6.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0241.text_color_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0241.text_font_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0241.action_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0241.num_of_lines = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            anonymousClass0241.line_height_multiple = ProtoAdapter.FLOAT.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0241;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0241 anonymousClass0241) {
            AnonymousClass0241 anonymousClass02412 = anonymousClass0241;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02412.template) + this.LIZ.encodedSizeWithTag(2, anonymousClass02412.arguments) + protoAdapter.encodedSizeWithTag(3, anonymousClass02412.text_color) + protoAdapter.encodedSizeWithTag(4, anonymousClass02412.text_dark_color);
            ProtoAdapter<C029C> protoAdapter2 = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, anonymousClass02412.prefix_icon) + protoAdapter2.encodedSizeWithTag(6, anonymousClass02412.suffix_icon) + protoAdapter.encodedSizeWithTag(7, anonymousClass02412.link) + C686402m6.ADAPTER.encodedSizeWithTag(8, anonymousClass02412.extra_info);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(9, anonymousClass02412.text_color_type) + protoAdapter3.encodedSizeWithTag(10, anonymousClass02412.text_font_type) + protoAdapter2.encodedSizeWithTag(11, anonymousClass02412.action_icon) + protoAdapter3.encodedSizeWithTag(12, anonymousClass02412.num_of_lines) + ProtoAdapter.FLOAT.encodedSizeWithTag(13, anonymousClass02412.line_height_multiple) + anonymousClass02412.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0241 anonymousClass0241) {
        }
    };
    public C029C action_icon;
    public Map<String, C025E> arguments;
    public C686402m6 extra_info;
    public Float line_height_multiple;
    public String link;
    public Integer num_of_lines;
    public C029C prefix_icon;
    public C029C suffix_icon;
    public String template;
    public String text_color;
    public Integer text_color_type;
    public String text_dark_color;
    public Integer text_font_type;

    @Override // com.squareup.wire.Message
    public C02P1 newBuilder() {
        return null;
    }

    public AnonymousClass0241() {
        super(ADAPTER, ByteString.EMPTY);
        this.arguments = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
