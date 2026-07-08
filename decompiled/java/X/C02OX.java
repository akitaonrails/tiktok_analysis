package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02OX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02OX extends Message<C02OX, C02PR> {
    public static final ProtoAdapter<C02OX> ADAPTER = new ProtoAdapter<C02OX>() { // from class: X.02OW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02OX decode(ProtoReader protoReader) {
            C02OX c02ox = new C02OX();
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
                                    c02ox.sample_num = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02ox.hint = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02ox.phone_number = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02ox.country_code = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ox;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02OX c02ox) {
            C02OX c02ox2 = c02ox;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02ox2.country_code) + protoAdapter.encodedSizeWithTag(2, c02ox2.phone_number) + protoAdapter.encodedSizeWithTag(3, c02ox2.hint) + protoAdapter.encodedSizeWithTag(4, c02ox2.sample_num) + c02ox2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02OX c02ox) {
        }
    };
    public String country_code;
    public String hint;
    public String phone_number;
    public String sample_num;

    public C02OX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
