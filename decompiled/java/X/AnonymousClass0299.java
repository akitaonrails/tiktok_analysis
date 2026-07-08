package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0299, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0299 extends Message<AnonymousClass0299, C02I6> {
    public static final ProtoAdapter<AnonymousClass0299> ADAPTER = new ProtoAdapter<AnonymousClass0299>() { // from class: X.023t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0299 decode(ProtoReader protoReader) {
            AnonymousClass0299 anonymousClass0299 = new AnonymousClass0299();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0299.app_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0299.app_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0299.icon = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0299.orientation = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0299.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0299.state = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0299.summary = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0299.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0299.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0299.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0299.card = C597502Ur.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            anonymousClass0299.web_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0299;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0299 anonymousClass0299) {
            AnonymousClass0299 anonymousClass02992 = anonymousClass0299;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02992.app_id) + protoAdapter.encodedSizeWithTag(2, anonymousClass02992.app_name) + protoAdapter.encodedSizeWithTag(3, anonymousClass02992.icon);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, anonymousClass02992.orientation) + protoAdapter.encodedSizeWithTag(5, anonymousClass02992.schema) + protoAdapter2.encodedSizeWithTag(6, anonymousClass02992.state) + protoAdapter.encodedSizeWithTag(7, anonymousClass02992.summary) + protoAdapter2.encodedSizeWithTag(8, anonymousClass02992.type) + protoAdapter.encodedSizeWithTag(9, anonymousClass02992.description) + protoAdapter.encodedSizeWithTag(10, anonymousClass02992.title) + C597502Ur.ADAPTER.encodedSizeWithTag(11, anonymousClass02992.card) + protoAdapter.encodedSizeWithTag(12, anonymousClass02992.web_url) + anonymousClass02992.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0299 anonymousClass0299) {
            AnonymousClass0299 anonymousClass02992 = anonymousClass0299;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, anonymousClass02992.app_id);
            protoAdapter.encodeWithTag(protoWriter, 2, anonymousClass02992.app_name);
            protoAdapter.encodeWithTag(protoWriter, 3, anonymousClass02992.icon);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, anonymousClass02992.orientation);
            protoAdapter.encodeWithTag(protoWriter, 5, anonymousClass02992.schema);
            protoAdapter2.encodeWithTag(protoWriter, 6, anonymousClass02992.state);
            protoAdapter.encodeWithTag(protoWriter, 7, anonymousClass02992.summary);
            protoAdapter2.encodeWithTag(protoWriter, 8, anonymousClass02992.type);
            protoAdapter.encodeWithTag(protoWriter, 9, anonymousClass02992.description);
            protoAdapter.encodeWithTag(protoWriter, 10, anonymousClass02992.title);
            C597502Ur.ADAPTER.encodeWithTag(protoWriter, 11, anonymousClass02992.card);
            protoAdapter.encodeWithTag(protoWriter, 12, anonymousClass02992.web_url);
            protoWriter.writeBytes(anonymousClass02992.unknownFields());
        }
    };
    public String app_id;
    public String app_name;
    public C597502Ur card;
    public String description;
    public String icon;
    public Integer orientation;
    public String schema;
    public Integer state;
    public String summary;
    public String title;
    public Integer type;
    public String web_url;

    public AnonymousClass0299() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02I6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
