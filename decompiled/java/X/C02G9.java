package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02G9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02G9 extends Message<C02G9, C02OE> {
    public static final ProtoAdapter<C02G9> ADAPTER = new ProtoAdapter<C02G9>() { // from class: X.02AK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02G9 decode(ProtoReader protoReader) {
            C02G9 c02g9 = new C02G9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02g9.hint_message = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02g9.input_box_key = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02g9.input_box_hint_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02g9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02G9 c02g9) {
            C02G9 c02g92 = c02g9;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02g92.input_box_hint_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02g92.input_box_key) + protoAdapter.encodedSizeWithTag(3, c02g92.hint_message) + c02g92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02G9 c02g9) {
        }
    };
    public String hint_message;
    public Integer input_box_hint_type;
    public String input_box_key;

    public C02G9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
