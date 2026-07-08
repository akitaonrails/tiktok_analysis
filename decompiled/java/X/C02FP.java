package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FP extends Message<C02FP, C02PW> {
    public static final ProtoAdapter<C02FP> ADAPTER = new ProtoAdapter<C02FP>() { // from class: X.02Ar
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FP decode(ProtoReader protoReader) {
            C02FP c02fp = new C02FP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02fp.pudo_edit_schema = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02fp.popup_schema = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02fp.address_edit_schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fp.address_list_schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02fp.buy_now_schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FP c02fp) {
            C02FP c02fp2 = c02fp;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02fp2.buy_now_schema) + protoAdapter.encodedSizeWithTag(2, c02fp2.address_list_schema) + protoAdapter.encodedSizeWithTag(3, c02fp2.address_edit_schema) + protoAdapter.encodedSizeWithTag(4, c02fp2.popup_schema) + protoAdapter.encodedSizeWithTag(5, c02fp2.pudo_edit_schema) + c02fp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FP c02fp) {
        }
    };
    public String address_edit_schema;
    public String address_list_schema;
    public String buy_now_schema;
    public String popup_schema;
    public String pudo_edit_schema;

    public C02FP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
