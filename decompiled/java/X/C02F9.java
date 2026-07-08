package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02F9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02F9 extends Message<C02F9, C02O0> {
    public static final ProtoAdapter<C02F9> ADAPTER = new ProtoAdapter<C02F9>() { // from class: X.02AJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02F9 decode(ProtoReader protoReader) {
            C02F9 c02f9 = new C02F9();
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
                                    c02f9.enter_schema = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02f9.enter_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02f9.model_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02f9.is_recommend = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02f9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02F9 c02f9) {
            C02F9 c02f92 = c02f9;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c02f92.is_recommend);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02f92.model_title) + protoAdapter.encodedSizeWithTag(3, c02f92.enter_name) + protoAdapter.encodedSizeWithTag(4, c02f92.enter_schema) + c02f92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02F9 c02f9) {
        }
    };
    public String enter_name;
    public String enter_schema;
    public Boolean is_recommend;
    public String model_title;

    public C02F9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02O0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
