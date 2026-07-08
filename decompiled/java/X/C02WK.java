package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02WK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02WK extends Message<C02WK, C02WL> {
    public static final ProtoAdapter<C02WK> ADAPTER = new ProtoAdapter<C02WK>() { // from class: X.02WJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02WK decode(ProtoReader protoReader) {
            C02WK c02wk = new C02WK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02wk.external_username = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02wk.hashed_phone_number = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02wk.reason = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02wk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02WK c02wk) {
            C02WK c02wk2 = c02wk;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02wk2.reason) + protoAdapter.encodedSizeWithTag(2, c02wk2.hashed_phone_number) + protoAdapter.encodedSizeWithTag(3, c02wk2.external_username) + c02wk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02WK c02wk) {
            C02WK c02wk2 = c02wk;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02wk2.reason);
            protoAdapter.encodeWithTag(protoWriter, 2, c02wk2.hashed_phone_number);
            protoAdapter.encodeWithTag(protoWriter, 3, c02wk2.external_username);
            protoWriter.writeBytes(c02wk2.unknownFields());
        }
    };
    public String external_username;
    public String hashed_phone_number;
    public String reason;

    public C02WK() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02WL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
