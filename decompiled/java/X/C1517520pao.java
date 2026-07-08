package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517520pao extends Message<C1517520pao, C1517530pap> {
    public static final ProtoAdapter<C1517520pao> ADAPTER = new ProtoAdapter<C1517520pao>() { // from class: X.0pan
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517520pao decode(ProtoReader protoReader) {
            C1517520pao c1517520pao = new C1517520pao();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1517520pao.index = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517520pao;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517520pao c1517520pao) {
            C1517520pao c1517520pao2 = c1517520pao;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1517520pao2.index) + c1517520pao2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517520pao c1517520pao) {
            C1517520pao c1517520pao2 = c1517520pao;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1517520pao2.index);
            protoWriter.writeBytes(c1517520pao2.unknownFields());
        }
    };
    public Integer index;

    public C1517520pao() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517530pap newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
