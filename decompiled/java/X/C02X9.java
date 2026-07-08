package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02X9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02X9 extends Message<C02X9, C02XA> {
    public static final ProtoAdapter<C02X9> ADAPTER = new ProtoAdapter<C02X9>() { // from class: X.02X8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02X9 decode(ProtoReader protoReader) {
            C02X9 c02x9 = new C02X9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02x9.icon_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02x9.bank_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02x9.bank_code = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02x9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02X9 c02x9) {
            C02X9 c02x92 = c02x9;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02x92.bank_code) + protoAdapter.encodedSizeWithTag(2, c02x92.bank_name) + protoAdapter.encodedSizeWithTag(3, c02x92.icon_url) + c02x92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02X9 c02x9) {
        }
    };
    public String bank_code;
    public String bank_name;
    public String icon_url;

    public C02X9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02XA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
