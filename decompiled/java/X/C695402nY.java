package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02nY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C695402nY extends Message<C695402nY, C695302nX> {
    public static final ProtoAdapter<C695402nY> ADAPTER = new ProtoAdapter<C695402nY>() { // from class: X.02nZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C695402nY decode(ProtoReader protoReader) {
            C695402nY c695402nY = new C695402nY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c695402nY.label_params = C2268901DrM.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c695402nY.value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c695402nY.label_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c695402nY;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C695402nY c695402nY) {
            C695402nY c695402nY2 = c695402nY;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c695402nY2.label_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c695402nY2.value) + C2268901DrM.ADAPTER.encodedSizeWithTag(3, c695402nY2.label_params) + c695402nY2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C695402nY c695402nY) {
        }
    };
    public C2268901DrM label_params;
    public Integer label_type;
    public String value;

    public C695402nY() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C695302nX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
