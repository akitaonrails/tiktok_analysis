package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CB4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CB4 extends Message<C1CB4, C1CB5> {
    public static final ProtoAdapter<C1CB4> ADAPTER = new ProtoAdapter<C1CB4>() { // from class: X.1CB3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CB4 decode(ProtoReader protoReader) {
            C1CB4 c1cb4 = new C1CB4();
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
                                    c1cb4.bottom = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c1cb4.top = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1cb4.end = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1cb4.start = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cb4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CB4 c1cb4) {
            C1CB4 c1cb42 = c1cb4;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1cb42.start) + protoAdapter.encodedSizeWithTag(2, c1cb42.end) + protoAdapter.encodedSizeWithTag(3, c1cb42.top) + protoAdapter.encodedSizeWithTag(4, c1cb42.bottom) + c1cb42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CB4 c1cb4) {
        }
    };
    public Integer bottom;
    public Integer end;
    public Integer start;
    public Integer top;

    public C1CB4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CB5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
