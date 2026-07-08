package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02YF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02YF extends Message<C02YF, C02YG> {
    public static final ProtoAdapter<C02YF> ADAPTER = new ProtoAdapter<C02YF>() { // from class: X.02YE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02YF decode(ProtoReader protoReader) {
            C02YF c02yf = new C02YF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 255) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02yf.da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02yf.earn_amount = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02yf.earn_title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02yf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02YF c02yf) {
            C02YF c02yf2 = c02yf;
            int iEncodedSizeWithTag = C5431029t.ADAPTER.encodedSizeWithTag(1, c02yf2.earn_title);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02yf2.earn_amount) + protoAdapter.encodedSizeWithTag(255, c02yf2.da_info) + c02yf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02YF c02yf) {
        }
    };
    public String da_info;
    public String earn_amount;
    public C5431029t earn_title;

    public C02YF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02YG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
