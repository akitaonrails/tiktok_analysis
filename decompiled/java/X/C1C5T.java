package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C5T extends Message<C1C5T, C1C5U> {
    public static final ProtoAdapter<C1C5T> ADAPTER = new ProtoAdapter<C1C5T>() { // from class: X.1C5S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C5T decode(ProtoReader protoReader) {
            C1C5T c1c5t = new C1C5T();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c5t.image = C02U1.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c5t.cart_item_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c5t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C5T c1c5t) {
            C1C5T c1c5t2 = c1c5t;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1c5t2.cart_item_id) + C02U1.ADAPTER.encodedSizeWithTag(2, c1c5t2.image) + c1c5t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C5T c1c5t) {
        }
    };
    public String cart_item_id;
    public C02U1 image;

    public C1C5T() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C5U newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
