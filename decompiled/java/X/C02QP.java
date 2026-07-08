package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02QP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02QP extends Message<C02QP, C02QQ> {
    public static final ProtoAdapter<C02QP> ADAPTER = new ProtoAdapter<C02QP>() { // from class: X.02QO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02QP decode(ProtoReader protoReader) {
            C02QP c02qp = new C02QP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 44) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02qp.settings = C5252022w.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02qp.authorization_statement = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02qp.global_button_style = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02qp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02QP c02qp) {
            C02QP c02qp2 = c02qp;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02qp2.global_button_style) + C5431029t.ADAPTER.encodedSizeWithTag(2, c02qp2.authorization_statement) + C5252022w.ADAPTER.encodedSizeWithTag(44, c02qp2.settings) + c02qp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02QP c02qp) {
        }
    };
    public C5431029t authorization_statement;
    public Integer global_button_style;
    public C5252022w settings;

    public C02QP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
