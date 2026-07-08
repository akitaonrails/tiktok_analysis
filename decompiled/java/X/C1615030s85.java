package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0s85, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615030s85 extends Message<C1615030s85, C1615230s8P> {
    public static final ProtoAdapter<C1615030s85> ADAPTER = new ProtoAdapter<C1615030s85>() { // from class: X.0s84
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1615030s85 decode(ProtoReader protoReader) {
            C1615030s85 c1615030s85 = new C1615030s85();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1615030s85.num_videos = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c1615030s85.price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c1615030s85.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1615030s85.purchase_category = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c1615030s85.discounted_price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1615030s85.discount_string = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1615030s85.discount_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c1615030s85.is_hot = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1615030s85.discount_percentage = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1615030s85.is_best = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1615030s85;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1615030s85 c1615030s85) {
            C1615030s85 c1615030s852 = c1615030s85;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1615030s852.num_videos);
            ProtoAdapter<C1615780s9I> protoAdapter2 = C1615780s9I.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1615030s852.price);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, c1615030s852.title);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(4, c1615030s852.purchase_category) + protoAdapter2.encodedSizeWithTag(5, c1615030s852.discounted_price) + protoAdapter3.encodedSizeWithTag(6, c1615030s852.discount_string) + protoAdapter.encodedSizeWithTag(7, c1615030s852.discount_id);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(8, c1615030s852.is_hot) + protoAdapter4.encodedSizeWithTag(9, c1615030s852.discount_percentage) + protoAdapter5.encodedSizeWithTag(10, c1615030s852.is_best) + c1615030s852.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1615030s85 c1615030s85) {
            C1615030s85 c1615030s852 = c1615030s85;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c1615030s852.num_videos);
            ProtoAdapter<C1615780s9I> protoAdapter2 = C1615780s9I.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1615030s852.price);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 3, c1615030s852.title);
            ProtoAdapter<Integer> protoAdapter4 = ProtoAdapter.INT32;
            protoAdapter4.encodeWithTag(protoWriter, 4, c1615030s852.purchase_category);
            protoAdapter2.encodeWithTag(protoWriter, 5, c1615030s852.discounted_price);
            protoAdapter3.encodeWithTag(protoWriter, 6, c1615030s852.discount_string);
            protoAdapter.encodeWithTag(protoWriter, 7, c1615030s852.discount_id);
            ProtoAdapter<Boolean> protoAdapter5 = ProtoAdapter.BOOL;
            protoAdapter5.encodeWithTag(protoWriter, 8, c1615030s852.is_hot);
            protoAdapter4.encodeWithTag(protoWriter, 9, c1615030s852.discount_percentage);
            protoAdapter5.encodeWithTag(protoWriter, 10, c1615030s852.is_best);
            protoWriter.writeBytes(c1615030s852.unknownFields());
        }
    };
    public Long discount_id;
    public Integer discount_percentage;
    public String discount_string;
    public C1615780s9I discounted_price;
    public Boolean is_best;
    public Boolean is_hot;
    public Long num_videos;
    public C1615780s9I price;
    public Integer purchase_category;
    public String title;

    public C1615030s85() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1615230s8P newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
