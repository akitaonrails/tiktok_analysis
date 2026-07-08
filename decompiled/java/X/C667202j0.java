package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02j0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C667202j0 extends Message<C667202j0, C667302j1> {
    public static final ProtoAdapter<C667202j0> ADAPTER = new ProtoAdapter<C667202j0>() { // from class: X.02iz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C667202j0 decode(ProtoReader protoReader) {
            C667202j0 c667202j0 = new C667202j0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c667202j0.streaks_level = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c667202j0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C667202j0 c667202j0) {
            C667202j0 c667202j02 = c667202j0;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c667202j02.streaks_level) + c667202j02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C667202j0 c667202j0) {
            C667202j0 c667202j02 = c667202j0;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c667202j02.streaks_level);
            protoWriter.writeBytes(c667202j02.unknownFields());
        }
    };
    public Integer streaks_level;

    public C667202j0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C667302j1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
