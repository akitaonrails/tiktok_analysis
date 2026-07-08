package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C668702jF extends Message<C668702jF, C668802jG> {
    public static final ProtoAdapter<C668702jF> ADAPTER = new ProtoAdapter<C668702jF>() { // from class: X.02jE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C668702jF decode(ProtoReader protoReader) {
            C668702jF c668702jF = new C668702jF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c668702jF.total = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c668702jF;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C668702jF c668702jF) {
            C668702jF c668702jF2 = c668702jF;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c668702jF2.total) + c668702jF2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C668702jF c668702jF) {
            C668702jF c668702jF2 = c668702jF;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c668702jF2.total);
            protoWriter.writeBytes(c668702jF2.unknownFields());
        }
    };
    public Integer total;

    public C668702jF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C668802jG newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
