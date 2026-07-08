package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.03uk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C994803uk extends Message<C994803uk, C994903ul> {
    public static final ProtoAdapter<C994803uk> ADAPTER = new ProtoAdapter<C994803uk>() { // from class: X.03uh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C994803uk decode(ProtoReader protoReader) {
            C994803uk c994803uk = new C994803uk();
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
                                    c994803uk.chunk_index = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c994803uk.data = C5190020m.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c994803uk.message = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c994803uk.code = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c994803uk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C994803uk c994803uk) {
            C994803uk c994803uk2 = c994803uk;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c994803uk2.code) + ProtoAdapter.STRING.encodedSizeWithTag(2, c994803uk2.message) + C5190020m.ADAPTER.encodedSizeWithTag(3, c994803uk2.data) + protoAdapter.encodedSizeWithTag(4, c994803uk2.chunk_index) + c994803uk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C994803uk c994803uk) {
        }
    };
    public Integer chunk_index;
    public Integer code;
    public C5190020m data;
    public String message;

    public C994803uk() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C994903ul newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
