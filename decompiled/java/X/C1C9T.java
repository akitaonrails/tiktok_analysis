package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C9T, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C9T extends Message<C1C9T, C1C9U> {
    public static final ProtoAdapter<C1C9T> ADAPTER = new ProtoAdapter<C1C9T>() { // from class: X.1C9S
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C9T decode(ProtoReader protoReader) {
            C1C9T c1c9t = new C1C9T();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1c9t.task2_gt12s = ProtoAdapter.DOUBLE.decode(protoReader);
                            }
                        } else {
                            c1c9t.task1_gt8s = ProtoAdapter.DOUBLE.decode(protoReader);
                        }
                    } else {
                        c1c9t.task0_gt2s = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c9t;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C9T c1c9t) {
            C1C9T c1c9t2 = c1c9t;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            return protoAdapter.encodedSizeWithTag(1, c1c9t2.task0_gt2s) + protoAdapter.encodedSizeWithTag(2, c1c9t2.task1_gt8s) + protoAdapter.encodedSizeWithTag(3, c1c9t2.task2_gt12s) + c1c9t2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C9T c1c9t) {
            C1C9T c1c9t2 = c1c9t;
            ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c9t2.task0_gt2s);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c9t2.task1_gt8s);
            protoAdapter.encodeWithTag(protoWriter, 3, c1c9t2.task2_gt12s);
            protoWriter.writeBytes(c1c9t2.unknownFields());
        }
    };
    public Double task0_gt2s;
    public Double task1_gt8s;
    public Double task2_gt12s;

    public C1C9T() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C9U newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
