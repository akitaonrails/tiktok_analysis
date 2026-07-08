package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C622002bi extends Message<C622002bi, C622102bj> {
    public static final ProtoAdapter<C622002bi> ADAPTER = new ProtoAdapter<C622002bi>() { // from class: X.02bh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C622002bi decode(ProtoReader protoReader) {
            C622002bi c622002bi = new C622002bi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c622002bi.preds = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c622002bi.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c622002bi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C622002bi c622002bi) {
            C622002bi c622002bi2 = c622002bi;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c622002bi2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c622002bi2.preds) + c622002bi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C622002bi c622002bi) {
            C622002bi c622002bi2 = c622002bi;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c622002bi2.type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c622002bi2.preds);
            protoWriter.writeBytes(c622002bi2.unknownFields());
        }
    };
    public String preds;
    public Integer type;

    public C622002bi() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C622102bj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
