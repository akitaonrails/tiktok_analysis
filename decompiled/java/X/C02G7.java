package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02G7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02G7 extends Message<C02G7, C576502Mp> {
    public static final ProtoAdapter<C02G7> ADAPTER = new ProtoAdapter<C02G7>() { // from class: X.02AI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02G7 decode(ProtoReader protoReader) {
            C02G7 c02g7 = new C02G7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02g7.discount_amount = C614702aX.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02g7.discount_source_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02g7.discount_type = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02g7;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02G7 c02g7) {
            C02G7 c02g72 = c02g7;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02g72.discount_type) + protoAdapter.encodedSizeWithTag(2, c02g72.discount_source_id) + C614702aX.ADAPTER.encodedSizeWithTag(3, c02g72.discount_amount) + c02g72.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02G7 c02g7) {
        }
    };
    public C614702aX discount_amount;
    public String discount_source_id;
    public String discount_type;

    public C02G7() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C576502Mp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
