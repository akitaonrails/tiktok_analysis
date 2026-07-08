package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C694802nS extends Message<C694802nS, C694702nR> {
    public static final ProtoAdapter<C694802nS> ADAPTER = new ProtoAdapter<C694802nS>() { // from class: X.02nT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C694802nS decode(ProtoReader protoReader) {
            C694802nS c694802nS = new C694802nS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c694802nS.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c694802nS.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c694802nS.background_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c694802nS.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c694802nS.button_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c694802nS.label_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c694802nS.position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c694802nS.selling_point_data = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c694802nS.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c694802nS.selling_point_countdown = C5409028x.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c694802nS.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c694802nS.tag_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c694802nS.product_badge_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c694802nS.lockup_badge_ui = C1CB1.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c694802nS;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C694802nS c694802nS) {
            C694802nS c694802nS2 = c694802nS;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, c694802nS2.icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c694802nS2.title);
            ProtoAdapter<C618602bA> protoAdapter2 = C618602bA.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c694802nS2.background_color) + protoAdapter.encodedSizeWithTag(4, c694802nS2.description) + protoAdapter.encodedSizeWithTag(5, c694802nS2.button_type) + protoAdapter2.encodedSizeWithTag(6, c694802nS2.label_color);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(7, c694802nS2.position) + C5431029t.ADAPTER.encodedSizeWithTag(8, c694802nS2.selling_point_data) + protoAdapter.encodedSizeWithTag(9, c694802nS2.da_info) + C5409028x.ADAPTER.encodedSizeWithTag(10, c694802nS2.selling_point_countdown) + protoAdapter3.encodedSizeWithTag(11, c694802nS2.style) + protoAdapter3.encodedSizeWithTag(12, c694802nS2.tag_type) + protoAdapter3.encodedSizeWithTag(13, c694802nS2.product_badge_type) + C1CB1.ADAPTER.encodedSizeWithTag(14, c694802nS2.lockup_badge_ui) + c694802nS2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C694802nS c694802nS) {
        }
    };
    public C618602bA background_color;
    public String button_type;
    public String da_info;
    public String description;
    public C029C icon;
    public C618602bA label_color;
    public C1CB1 lockup_badge_ui;
    public Integer position;
    public Integer product_badge_type;
    public C5409028x selling_point_countdown;
    public C5431029t selling_point_data;
    public Integer style;
    public Integer tag_type;
    public String title;

    public C694802nS() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C694702nR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
