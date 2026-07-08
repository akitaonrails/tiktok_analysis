package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGY extends Message<C1CGY, C1CGZ> {
    public static final ProtoAdapter<C1CGY> ADAPTER = new ProtoAdapter<C1CGY>() { // from class: X.1CGX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGY decode(ProtoReader protoReader) {
            C1CGY c1cgy = new C1CGY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cgy.threshold_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1cgy.require_amount = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1cgy.require_quantity = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1cgy.amount_to_threshold = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1cgy.progress = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1cgy.amount_to_threshold_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cgy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CGY c1cgy) {
            C1CGY c1cgy2 = c1cgy;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c1cgy2.threshold_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1cgy2.require_amount);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c1cgy2.require_quantity) + protoAdapter.encodedSizeWithTag(4, c1cgy2.amount_to_threshold) + protoAdapter2.encodedSizeWithTag(5, c1cgy2.progress) + protoAdapter.encodedSizeWithTag(6, c1cgy2.amount_to_threshold_text) + c1cgy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CGY c1cgy) {
        }
    };
    public String amount_to_threshold;
    public String amount_to_threshold_text;
    public Long progress;
    public String require_amount;
    public Long require_quantity;
    public Integer threshold_type;

    public C1CGY() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CGZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
