package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02G3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02G3 extends Message<C02G3, C02MU> {
    public static final ProtoAdapter<C02G3> ADAPTER = new ProtoAdapter<C02G3>() { // from class: X.02AH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02G3 decode(ProtoReader protoReader) {
            C02G3 c02g3 = new C02G3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02g3.value = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02g3.description = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02g3.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02g3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02G3 c02g3) {
            C02G3 c02g32 = c02g3;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02g32.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02g32.description) + protoAdapter.encodedSizeWithTag(3, c02g32.value) + c02g32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02G3 c02g3) {
        }
    };
    public String description;
    public Integer type;
    public Integer value;

    public C02G3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
