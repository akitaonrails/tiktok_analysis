package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C7C, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C7C extends Message<C1C7C, C1C7D> {
    public static final ProtoAdapter<C1C7C> ADAPTER = new ProtoAdapter<C1C7C>() { // from class: X.1C7B
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C7C decode(ProtoReader protoReader) {
            C1C7C c1c7c = new C1C7C();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1c7c.bought_size_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c7c.height_weight_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c7c.review_user = C1C79.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c7c;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C7C c1c7c) {
            C1C7C c1c7c2 = c1c7c;
            int iEncodedSizeWithTag = C1C79.ADAPTER.encodedSizeWithTag(1, c1c7c2.review_user);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1c7c2.height_weight_text) + protoAdapter.encodedSizeWithTag(3, c1c7c2.bought_size_text) + c1c7c2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C7C c1c7c) {
        }
    };
    public String bought_size_text;
    public String height_weight_text;
    public C1C79 review_user;

    public C1C7C() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C7D newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
