package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C4P, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C4P extends Message<C1C4P, C1C4Q> {
    public static final ProtoAdapter<C1C4P> ADAPTER = new ProtoAdapter<C1C4P>() { // from class: X.1C4O
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C4P decode(ProtoReader protoReader) {
            C1C4P c1c4p = new C1C4P();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1c4p.index = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c4p.property_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c4p.product_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c4p;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C4P c1c4p) {
            C1C4P c1c4p2 = c1c4p;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c4p2.product_id) + protoAdapter.encodedSizeWithTag(2, c1c4p2.property_id) + protoAdapter.encodedSizeWithTag(3, c1c4p2.index) + c1c4p2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C4P c1c4p) {
        }
    };
    public String index;
    public String product_id;
    public String property_id;

    public C1C4P() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C4Q newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
