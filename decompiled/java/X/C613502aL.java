package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02aL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C613502aL extends Message<C613502aL, C613602aM> {
    public static final ProtoAdapter<C613502aL> ADAPTER = new ProtoAdapter<C613502aL>() { // from class: X.02aK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C613502aL decode(ProtoReader protoReader) {
            C613502aL c613502aL = new C613502aL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c613502aL.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c613502aL.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c613502aL.popup = C613202aI.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c613502aL.link = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c613502aL.is_third_party_link = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c613502aL.is_bold = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c613502aL.has_underscore = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c613502aL.color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c613502aL.dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c613502aL.has_strike = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c613502aL.link_text_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c613502aL.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c613502aL;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C613502aL c613502aL) {
            C613502aL c613502aL2 = c613502aL;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c613502aL2.type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c613502aL2.text) + C613202aI.ADAPTER.encodedSizeWithTag(3, c613502aL2.popup) + protoAdapter2.encodedSizeWithTag(4, c613502aL2.link);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c613502aL2.is_third_party_link) + protoAdapter3.encodedSizeWithTag(6, c613502aL2.is_bold) + protoAdapter3.encodedSizeWithTag(7, c613502aL2.has_underscore) + protoAdapter2.encodedSizeWithTag(8, c613502aL2.color) + protoAdapter2.encodedSizeWithTag(9, c613502aL2.dark_color) + protoAdapter3.encodedSizeWithTag(10, c613502aL2.has_strike) + protoAdapter.encodedSizeWithTag(11, c613502aL2.link_text_type) + C029C.ADAPTER.encodedSizeWithTag(12, c613502aL2.icon) + c613502aL2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C613502aL c613502aL) {
        }
    };
    public String color;
    public String dark_color;
    public Boolean has_strike;
    public Boolean has_underscore;
    public C029C icon;
    public Boolean is_bold;
    public Boolean is_third_party_link;
    public String link;
    public Integer link_text_type;
    public C613202aI popup;
    public String text;
    public Integer type;

    public C613502aL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C613602aM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
