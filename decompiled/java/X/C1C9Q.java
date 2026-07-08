package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9Q extends Message<C1C9Q, C1C9R> {
    public static final ProtoAdapter<C1C9Q> ADAPTER = new ProtoAdapter<C1C9Q>() { // from class: X.1C9P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C9Q decode(ProtoReader protoReader) {
            C1C9Q c1c9q = new C1C9Q();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1c9q.uri = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1c9q.height_px = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1c9q.width_px = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1c9q.alternate_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1c9q.live_photo = C1C9N.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c1c9q.subscription_info = C1517610pax.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c1c9q.static_image_medium = C687802mK.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c1c9q.static_image_larger = C687802mK.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1c9q.image_thumb = C687802mK.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c9q;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C9Q c1c9q) {
            C1C9Q c1c9q2 = c1c9q;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1c9q2.uri);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1c9q2.height_px) + protoAdapter2.encodedSizeWithTag(3, c1c9q2.width_px) + protoAdapter.encodedSizeWithTag(4, c1c9q2.alternate_text) + C1C9N.ADAPTER.encodedSizeWithTag(5, c1c9q2.live_photo) + C1517610pax.ADAPTER.encodedSizeWithTag(6, c1c9q2.subscription_info);
            ProtoAdapter<C687802mK> protoAdapter3 = C687802mK.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, c1c9q2.static_image_medium) + protoAdapter3.encodedSizeWithTag(8, c1c9q2.static_image_larger) + protoAdapter3.encodedSizeWithTag(9, c1c9q2.image_thumb) + c1c9q2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C9Q c1c9q) {
            C1C9Q c1c9q2 = c1c9q;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c9q2.uri);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1c9q2.height_px);
            protoAdapter2.encodeWithTag(protoWriter, 3, c1c9q2.width_px);
            protoAdapter.encodeWithTag(protoWriter, 4, c1c9q2.alternate_text);
            C1C9N.ADAPTER.encodeWithTag(protoWriter, 5, c1c9q2.live_photo);
            C1517610pax.ADAPTER.encodeWithTag(protoWriter, 6, c1c9q2.subscription_info);
            ProtoAdapter<C687802mK> protoAdapter3 = C687802mK.ADAPTER;
            protoAdapter3.encodeWithTag(protoWriter, 7, c1c9q2.static_image_medium);
            protoAdapter3.encodeWithTag(protoWriter, 8, c1c9q2.static_image_larger);
            protoAdapter3.encodeWithTag(protoWriter, 9, c1c9q2.image_thumb);
            protoWriter.writeBytes(c1c9q2.unknownFields());
        }
    };
    public String alternate_text;
    public Integer height_px;
    public C687802mK image_thumb;
    public C1C9N live_photo;
    public C687802mK static_image_larger;
    public C687802mK static_image_medium;
    public C1517610pax subscription_info;
    public String uri;
    public Integer width_px;

    public C1C9Q() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C9R newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
