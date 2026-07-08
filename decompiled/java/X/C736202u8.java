package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02u8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C736202u8 extends Message<C736202u8, C736302u9> {
    public static final ProtoAdapter<C736202u8> ADAPTER = new ProtoAdapter<C736202u8>() { // from class: X.02u7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C736202u8 decode(ProtoReader protoReader) {
            C736202u8 c736202u8 = new C736202u8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c736202u8.style = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c736202u8.description = C1COL.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c736202u8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C736202u8 c736202u8) {
            C736202u8 c736202u82 = c736202u8;
            return C1COL.ADAPTER.encodedSizeWithTag(1, c736202u82.description) + ProtoAdapter.INT32.encodedSizeWithTag(2, c736202u82.style) + c736202u82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C736202u8 c736202u8) {
        }
    };
    public C1COL description;
    public Integer style;

    public C736202u8() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C736302u9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
