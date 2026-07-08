package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.025E, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C025E extends Message<C025E, C02P6> {
    public static final ProtoAdapter<C025E> ADAPTER = new ProtoAdapter<C025E>() { // from class: X.022P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C025E decode(ProtoReader protoReader) {
            C025E c025e = new C025E();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c025e.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c025e.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c025e.is_third_party_link = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c025e.is_bold = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c025e.has_underscore = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c025e.color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c025e.dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c025e.has_strike = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c025e.link_text_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c025e.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c025e.text_raw_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c025e.is_italic = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c025e.name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c025e.end_time = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c025e.format = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c025e.text_font_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c025e;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C025E c025e) {
            C025E c025e2 = c025e;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c025e2.text) + protoAdapter.encodedSizeWithTag(2, c025e2.link);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c025e2.is_third_party_link) + protoAdapter2.encodedSizeWithTag(4, c025e2.is_bold) + protoAdapter2.encodedSizeWithTag(5, c025e2.has_underscore) + protoAdapter.encodedSizeWithTag(6, c025e2.color) + protoAdapter.encodedSizeWithTag(7, c025e2.dark_color) + protoAdapter2.encodedSizeWithTag(8, c025e2.has_strike);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(9, c025e2.link_text_type) + C029C.ADAPTER.encodedSizeWithTag(10, c025e2.icon) + C618602bA.ADAPTER.encodedSizeWithTag(11, c025e2.text_raw_color) + protoAdapter2.encodedSizeWithTag(12, c025e2.is_italic) + protoAdapter.encodedSizeWithTag(13, c025e2.name) + protoAdapter.encodedSizeWithTag(14, c025e2.end_time) + protoAdapter.encodedSizeWithTag(15, c025e2.format) + protoAdapter3.encodedSizeWithTag(16, c025e2.text_font_type) + c025e2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C025E c025e) {
        }
    };
    public String color;
    public String dark_color;
    public String end_time;
    public String format;
    public Boolean has_strike;
    public Boolean has_underscore;
    public C029C icon;
    public Boolean is_bold;
    public Boolean is_italic;
    public Boolean is_third_party_link;
    public String link;
    public Integer link_text_type;
    public String name;
    public String text;
    public Integer text_font_type;
    public C618602bA text_raw_color;

    public C025E() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02P6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
