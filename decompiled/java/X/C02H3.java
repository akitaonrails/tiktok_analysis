package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02H3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02H3 extends Message<C02H3, C576802Ms> {
    public static final ProtoAdapter<C02H3> ADAPTER = new ProtoAdapter<C02H3>() { // from class: X.02BT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02H3 decode(ProtoReader protoReader) {
            C02H3 c02h3 = new C02H3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02h3.dark_photo = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02h3.photo = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02h3.payment_method_code = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02h3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02H3 c02h3) {
            C02H3 c02h32 = c02h3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02h32.payment_method_code) + protoAdapter.encodedSizeWithTag(2, c02h32.photo) + protoAdapter.encodedSizeWithTag(3, c02h32.dark_photo) + c02h32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02H3 c02h3) {
        }
    };
    public String dark_photo;
    public String payment_method_code;
    public String photo;

    public C02H3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C576802Ms newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
