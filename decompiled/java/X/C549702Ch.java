package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549702Ch extends Message<C549702Ch, C580902Oh> {
    public static final ProtoAdapter<C549702Ch> ADAPTER = new ProtoAdapter<C549702Ch>() { // from class: X.026V
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549702Ch decode(ProtoReader protoReader) {
            C549702Ch c549702Ch = new C549702Ch();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c549702Ch.label_image_light = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c549702Ch.label_image_dark = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c549702Ch.label_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c549702Ch.label_type_str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c549702Ch.position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c549702Ch.see_more = C647802fs.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549702Ch;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549702Ch c549702Ch) {
            C549702Ch c549702Ch2 = c549702Ch;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c549702Ch2.label_image_light) + protoAdapter.encodedSizeWithTag(2, c549702Ch2.label_image_dark);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c549702Ch2.label_type) + ProtoAdapter.STRING.encodedSizeWithTag(4, c549702Ch2.label_type_str) + protoAdapter2.encodedSizeWithTag(5, c549702Ch2.position) + C647802fs.ADAPTER.encodedSizeWithTag(6, c549702Ch2.see_more) + c549702Ch2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C549702Ch c549702Ch) {
        }
    };
    public C02U1 label_image_dark;
    public C02U1 label_image_light;
    public Integer label_type;
    public String label_type_str;
    public Integer position;
    public C647802fs see_more;

    public C549702Ch() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C580902Oh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
