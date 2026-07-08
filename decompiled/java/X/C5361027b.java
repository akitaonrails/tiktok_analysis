package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.027b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5361027b extends Message<C5361027b, C582902Pb> {
    public static final ProtoAdapter<C5361027b> ADAPTER = new ProtoAdapter<C5361027b>() { // from class: X.023w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5361027b decode(ProtoReader protoReader) {
            C5361027b c5361027b = new C5361027b();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        switch (iNextTag) {
                            case 4:
                                c5361027b.is_bold = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 5:
                                c5361027b.has_underscore = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 6:
                                c5361027b.color = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 7:
                                c5361027b.dark_color = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 8:
                                c5361027b.replace_with_icon = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c5361027b.icon_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c5361027b.text_color_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c5361027b.text_font_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c5361027b.end_time = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c5361027b.format = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 14:
                                c5361027b.link = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 15:
                                c5361027b.suffix_icon = C029C.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c5361027b.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5361027b;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5361027b c5361027b) {
            C5361027b c5361027b2 = c5361027b;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5361027b2.text);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c5361027b2.is_bold) + protoAdapter2.encodedSizeWithTag(5, c5361027b2.has_underscore) + protoAdapter.encodedSizeWithTag(6, c5361027b2.color) + protoAdapter.encodedSizeWithTag(7, c5361027b2.dark_color) + protoAdapter2.encodedSizeWithTag(8, c5361027b2.replace_with_icon);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(9, c5361027b2.icon_type) + protoAdapter3.encodedSizeWithTag(10, c5361027b2.text_color_type) + protoAdapter3.encodedSizeWithTag(11, c5361027b2.text_font_type) + protoAdapter.encodedSizeWithTag(12, c5361027b2.end_time) + protoAdapter.encodedSizeWithTag(13, c5361027b2.format) + protoAdapter.encodedSizeWithTag(14, c5361027b2.link) + C029C.ADAPTER.encodedSizeWithTag(15, c5361027b2.suffix_icon) + c5361027b2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5361027b c5361027b) {
        }
    };
    public String color;
    public String dark_color;
    public String end_time;
    public String format;
    public Boolean has_underscore;
    public Integer icon_type;
    public Boolean is_bold;
    public String link;
    public Boolean replace_with_icon;
    public C029C suffix_icon;
    public String text;
    public Integer text_color_type;
    public Integer text_font_type;

    public C5361027b() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C582902Pb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
