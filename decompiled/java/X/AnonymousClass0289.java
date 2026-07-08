package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0289, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0289 extends Message<AnonymousClass0289, C02NT> {
    public static final ProtoAdapter<AnonymousClass0289> ADAPTER = new ProtoAdapter<AnonymousClass0289>() { // from class: X.023q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0289 decode(ProtoReader protoReader) {
            AnonymousClass0289 anonymousClass0289 = new AnonymousClass0289();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0289.priority = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0289.banner_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0289.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0289.title = C5428029q.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0289.title_en = C5428029q.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0289.sub_title = C5428029q.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0289.sub_title_en = C5428029q.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0289.background_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0289.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0289.info_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0289;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0289 anonymousClass0289) {
            AnonymousClass0289 anonymousClass02892 = anonymousClass0289;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, anonymousClass02892.priority) + ProtoAdapter.INT32.encodedSizeWithTag(2, anonymousClass02892.banner_type);
            ProtoAdapter<C029C> protoAdapter = C029C.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, anonymousClass02892.icon);
            ProtoAdapter<C5428029q> protoAdapter2 = C5428029q.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, anonymousClass02892.title) + protoAdapter2.encodedSizeWithTag(5, anonymousClass02892.title_en) + protoAdapter2.encodedSizeWithTag(6, anonymousClass02892.sub_title) + protoAdapter2.encodedSizeWithTag(7, anonymousClass02892.sub_title_en) + C618602bA.ADAPTER.encodedSizeWithTag(8, anonymousClass02892.background_color) + ProtoAdapter.STRING.encodedSizeWithTag(9, anonymousClass02892.schema) + protoAdapter.encodedSizeWithTag(10, anonymousClass02892.info_icon) + anonymousClass02892.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0289 anonymousClass0289) {
        }
    };
    public C618602bA background_color;
    public Integer banner_type;
    public C029C icon;
    public C029C info_icon;
    public Long priority;
    public String schema;
    public C5428029q sub_title;
    public C5428029q sub_title_en;
    public C5428029q title;
    public C5428029q title_en;

    public AnonymousClass0289() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
