package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02S6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02S6 extends Message<C02S6, C02S9> {
    public static final ProtoAdapter<C02S6> ADAPTER = new ProtoAdapter<C02S6>() { // from class: X.02S5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02S6 decode(ProtoReader protoReader) {
            C02S6 c02s6 = new C02S6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02s6.biz_status = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02s6.biz_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02s6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02S6 c02s6) {
            C02S6 c02s62 = c02s6;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02s62.biz_type) + protoAdapter.encodedSizeWithTag(2, c02s62.biz_status) + c02s62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02S6 c02s6) {
            C02S6 c02s62 = c02s6;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02s62.biz_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c02s62.biz_status);
            protoWriter.writeBytes(c02s62.unknownFields());
        }
    };
    public Integer biz_status;
    public Integer biz_type;

    public C02S6() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02S9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
