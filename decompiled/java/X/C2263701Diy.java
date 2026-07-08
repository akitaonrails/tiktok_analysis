package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Diy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263701Diy extends Message<C2263701Diy, C2263711Diz> {
    public static final ProtoAdapter<C2263701Diy> ADAPTER = new ProtoAdapter<C2263701Diy>() { // from class: X.1Dix
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2263701Diy decode(ProtoReader protoReader) {
            C2263711Diz c2263711Diz = new C2263711Diz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2263711Diz.LIZLLL = C1COL.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c2263711Diz.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2263711Diz.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c2263711Diz.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2263711Diz.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2263711Diz.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c2263711Diz.LJIIIZ = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c2263711Diz.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2263711Diz.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2263711Diz.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2263711Diz.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2263711Diz.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2263711Diz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2263711Diz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2263701Diy c2263701Diy) {
            C2263701Diy c2263701Diy2 = c2263701Diy;
            int iEncodedSizeWithTag = C1COL.ADAPTER.encodedSizeWithTag(1, c2263701Diy2.text);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c2263701Diy2.formatted_text) + protoAdapter.encodedSizeWithTag(3, c2263701Diy2.text_highlight_color_light) + protoAdapter.encodedSizeWithTag(4, c2263701Diy2.text_highlight_color_dark) + protoAdapter.encodedSizeWithTag(5, c2263701Diy2.background_color_light) + protoAdapter.encodedSizeWithTag(6, c2263701Diy2.background_color_dark) + C029C.ADAPTER.encodedSizeWithTag(7, c2263701Diy2.icon) + ProtoAdapter.INT64.encodedSizeWithTag(8, c2263701Diy2.countdown_expiration_time) + ProtoAdapter.BOOL.encodedSizeWithTag(9, c2263701Diy2.show_close_icon) + ProtoAdapter.INT32.encodedSizeWithTag(10, c2263701Diy2.tooltip_type) + protoAdapter.encodedSizeWithTag(11, c2263701Diy2.starling_key) + protoAdapter.encodedSizeWithTag(12, c2263701Diy2.starling_key_placeholder) + c2263701Diy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2263701Diy c2263701Diy) {
        }
    };
    public String background_color_dark;
    public String background_color_light;
    public Long countdown_expiration_time;
    public String formatted_text;
    public C029C icon;
    public Boolean show_close_icon;
    public String starling_key;
    public String starling_key_placeholder;
    public C1COL text;
    public String text_highlight_color_dark;
    public String text_highlight_color_light;
    public Integer tooltip_type;

    @Override // com.squareup.wire.Message
    public C2263711Diz newBuilder() {
        return null;
    }

    public C2263701Diy(C1COL c1col, String str, String str2, String str3, String str4, String str5, C029C c029c, Long l, Boolean bool, Integer num, String str6, String str7) {
        this(c1col, str, str2, str3, str4, str5, c029c, l, bool, num, str6, str7, ByteString.EMPTY);
    }

    public C2263701Diy(C1COL c1col, String str, String str2, String str3, String str4, String str5, C029C c029c, Long l, Boolean bool, Integer num, String str6, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.text = c1col;
        this.formatted_text = str;
        this.text_highlight_color_light = str2;
        this.text_highlight_color_dark = str3;
        this.background_color_light = str4;
        this.background_color_dark = str5;
        this.icon = c029c;
        this.countdown_expiration_time = l;
        this.show_close_icon = bool;
        this.tooltip_type = num;
        this.starling_key = str6;
        this.starling_key_placeholder = str7;
    }
}
