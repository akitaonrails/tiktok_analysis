package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Wq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C602602Wq extends Message<C602602Wq, C602802Ws> {
    public static final ProtoAdapter<C602602Wq> ADAPTER = new ProtoAdapter<C602602Wq>() { // from class: X.02Wr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C602602Wq decode(ProtoReader protoReader) {
            C602602Wq c602602Wq = new C602602Wq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c602602Wq.resolution_button = C636002dy.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c602602Wq.explain = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c602602Wq.reason = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c602602Wq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C602602Wq c602602Wq) {
            C602602Wq c602602Wq2 = c602602Wq;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c602602Wq2.reason) + ProtoAdapter.STRING.encodedSizeWithTag(2, c602602Wq2.explain) + C636002dy.ADAPTER.encodedSizeWithTag(3, c602602Wq2.resolution_button) + c602602Wq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C602602Wq c602602Wq) {
            C602602Wq c602602Wq2 = c602602Wq;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c602602Wq2.reason);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c602602Wq2.explain);
            C636002dy.ADAPTER.encodeWithTag(protoWriter, 3, c602602Wq2.resolution_button);
            protoWriter.writeBytes(c602602Wq2.unknownFields());
        }
    };
    public String explain;
    public Integer reason;
    public C636002dy resolution_button;

    public C602602Wq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C602802Ws newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
