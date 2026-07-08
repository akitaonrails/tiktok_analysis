package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CAU extends Message<C1CAU, C1CAT> {
    public static final ProtoAdapter<C1CAU> ADAPTER = new ProtoAdapter<C1CAU>() { // from class: X.1CAV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CAU decode(ProtoReader protoReader) {
            C1CAU c1cau = new C1CAU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1cau.price_formatted = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cau.image_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cau.product_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cau.product_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cau;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CAU c1cau) {
            C1CAU c1cau2 = c1cau;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cau2.product_id) + protoAdapter.encodedSizeWithTag(2, c1cau2.product_name) + protoAdapter.encodedSizeWithTag(3, c1cau2.image_url) + protoAdapter.encodedSizeWithTag(4, c1cau2.price_formatted) + c1cau2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CAU c1cau) {
        }
    };
    public String image_url;
    public String price_formatted;
    public String product_id;
    public String product_name;

    public C1CAU() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CAT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
