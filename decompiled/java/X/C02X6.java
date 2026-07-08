package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02X6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02X6 extends Message<C02X6, C02X7> {
    public static final ProtoAdapter<C02X6> ADAPTER = new ProtoAdapter<C02X6>() { // from class: X.02X5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02X6 decode(ProtoReader protoReader) {
            C02X6 c02x6 = new C02X6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02x6.fail_detailed_message = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02x6.fail_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02x6.error_code = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02x6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02X6 c02x6) {
            C02X6 c02x62 = c02x6;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02x62.error_code) + protoAdapter.encodedSizeWithTag(2, c02x62.fail_title) + protoAdapter.encodedSizeWithTag(3, c02x62.fail_detailed_message) + c02x62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02X6 c02x6) {
        }
    };
    public String error_code;
    public String fail_detailed_message;
    public String fail_title;

    public C02X6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02X7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
