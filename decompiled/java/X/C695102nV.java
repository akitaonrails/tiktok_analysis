package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C695102nV extends Message<C695102nV, C695002nU> {
    public static final ProtoAdapter<C695102nV> ADAPTER = new ProtoAdapter<C695102nV>() { // from class: X.02nW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C695102nV decode(ProtoReader protoReader) {
            C695102nV c695102nV = new C695102nV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c695102nV.distance_unit = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c695102nV.distance_value = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c695102nV;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C695102nV c695102nV) {
            C695102nV c695102nV2 = c695102nV;
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, c695102nV2.distance_value) + ProtoAdapter.INT32.encodedSizeWithTag(2, c695102nV2.distance_unit) + c695102nV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C695102nV c695102nV) {
        }
    };
    public Integer distance_unit;
    public Double distance_value;

    public C695102nV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C695002nU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
