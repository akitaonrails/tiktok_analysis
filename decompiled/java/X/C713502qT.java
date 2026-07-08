package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02qT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C713502qT extends Message<C713502qT, C713602qU> {
    public static final ProtoAdapter<C713502qT> ADAPTER = new ProtoAdapter<C713502qT>() { // from class: X.02qS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C713502qT decode(ProtoReader protoReader) {
            C713502qT c713502qT = new C713502qT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c713502qT.is_moments = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c713502qT;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C713502qT c713502qT) {
            C713502qT c713502qT2 = c713502qT;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c713502qT2.is_moments) + c713502qT2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C713502qT c713502qT) {
            C713502qT c713502qT2 = c713502qT;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c713502qT2.is_moments);
            protoWriter.writeBytes(c713502qT2.unknownFields());
        }
    };
    public Integer is_moments;

    public C713502qT() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C713602qU newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
