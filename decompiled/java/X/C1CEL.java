package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEL, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CEL extends Message<C1CEL, C1CEM> {
    public static final ProtoAdapter<C1CEL> ADAPTER = new ProtoAdapter<C1CEL>() { // from class: X.1CEK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CEL decode(ProtoReader protoReader) {
            C1CEL c1cel = new C1CEL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1cel.bottom = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c1cel.top = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1cel.right = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1cel.left = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cel;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CEL c1cel) {
            C1CEL c1cel2 = c1cel;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1cel2.left) + protoAdapter.encodedSizeWithTag(2, c1cel2.right) + protoAdapter.encodedSizeWithTag(3, c1cel2.top) + protoAdapter.encodedSizeWithTag(4, c1cel2.bottom) + c1cel2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CEL c1cel) {
        }
    };
    public Integer bottom;
    public Integer left;
    public Integer right;
    public Integer top;

    public C1CEL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CEM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
