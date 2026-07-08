package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02j3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C667502j3 extends Message<C667502j3, C667602j4> {
    public static final ProtoAdapter<C667502j3> ADAPTER = new ProtoAdapter<C667502j3>() { // from class: X.02j2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C667502j3 decode(ProtoReader protoReader) {
            C667502j3 c667502j3 = new C667502j3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c667502j3.is_visible = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c667502j3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C667502j3 c667502j3) {
            C667502j3 c667502j32 = c667502j3;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c667502j32.is_visible) + c667502j32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C667502j3 c667502j3) {
            C667502j3 c667502j32 = c667502j3;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c667502j32.is_visible);
            protoWriter.writeBytes(c667502j32.unknownFields());
        }
    };
    public Integer is_visible;

    public C667502j3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C667602j4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
