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

/* JADX INFO: renamed from: X.1Diu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263661Diu extends Message<C2263661Diu, C2263681Diw> {
    public static final ProtoAdapter<C2263661Diu> ADAPTER = new ProtoAdapter<C2263661Diu>() { // from class: X.1Div
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2263661Diu decode(ProtoReader protoReader) {
            C2263681Diw c2263681Diw = new C2263681Diw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2263681Diw.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2263681Diw.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2263681Diw.LJFF = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2263681Diw.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2263681Diw.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2263681Diw.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2263681Diw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 8:
                            c2263681Diw.LJIIIZ = C2263601Dio.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2263681Diw.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2263681Diw.LJIIJJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2263681Diw.LJIIL = C1COL.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2263681Diw.LJIILIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2263681Diw.LJIILJJIL = C2223731C1r.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c2263681Diw.LJIILL.add(C029C.ADAPTER.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2263681Diw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2263661Diu c2263661Diu) {
            C2263661Diu c2263661Diu2 = c2263661Diu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2263661Diu2.title) + protoAdapter.encodedSizeWithTag(2, c2263661Diu2.link);
            ProtoAdapter<C029C> protoAdapter2 = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c2263661Diu2.icon) + protoAdapter.encodedSizeWithTag(4, c2263661Diu2.description) + protoAdapter.encodedSizeWithTag(5, c2263661Diu2.name) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c2263661Diu2.new_message) + C2263601Dio.ADAPTER.encodedSizeWithTag(8, c2263661Diu2.popup);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(9, c2263661Diu2.type) + protoAdapter3.encodedSizeWithTag(10, c2263661Diu2.sheet_type) + C1COL.ADAPTER.encodedSizeWithTag(11, c2263661Diu2.subtitle) + protoAdapter.encodedSizeWithTag(12, c2263661Diu2.right_title) + C2223731C1r.ADAPTER.encodedSizeWithTag(13, c2263661Diu2.redDot) + protoAdapter2.asRepeated().encodedSizeWithTag(14, c2263661Diu2.sub_icons) + c2263661Diu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2263661Diu c2263661Diu) {
        }
    };
    public String description;
    public C029C icon;
    public String link;
    public String name;
    public Boolean new_message;
    public C2263601Dio popup;
    public C2223731C1r redDot;
    public String right_title;
    public Integer sheet_type;
    public List<C029C> sub_icons;
    public C1COL subtitle;
    public String title;
    public Integer type;

    @Override // com.squareup.wire.Message
    public C2263681Diw newBuilder() {
        return null;
    }

    public C2263661Diu(String str, String str2, C029C c029c, String str3, String str4, Boolean bool, C2263601Dio c2263601Dio, Integer num, Integer num2, C1COL c1col, String str5, C2223731C1r c2223731C1r, List<C029C> list) {
        this(str, str2, c029c, str3, str4, bool, c2263601Dio, num, num2, c1col, str5, c2223731C1r, list, ByteString.EMPTY);
    }

    public C2263661Diu(String str, String str2, C029C c029c, String str3, String str4, Boolean bool, C2263601Dio c2263601Dio, Integer num, Integer num2, C1COL c1col, String str5, C2223731C1r c2223731C1r, List<C029C> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.link = str2;
        this.icon = c029c;
        this.description = str3;
        this.name = str4;
        this.new_message = bool;
        this.popup = c2263601Dio;
        this.type = num;
        this.sheet_type = num2;
        this.subtitle = c1col;
        this.right_title = str5;
        this.redDot = c2223731C1r;
        this.sub_icons = C1516540pZE.LJFF("sub_icons", list);
    }
}
