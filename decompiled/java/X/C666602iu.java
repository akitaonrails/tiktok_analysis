package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02iu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C666602iu extends Message<C666602iu, C666702iv> {
    public static final ProtoAdapter<C666602iu> ADAPTER = new ProtoAdapter<C666602iu>() { // from class: X.02it
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C666602iu decode(ProtoReader protoReader) {
            C666602iu c666602iu = new C666602iu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c666602iu.is_mentioned = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c666602iu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C666602iu c666602iu) {
            C666602iu c666602iu2 = c666602iu;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c666602iu2.is_mentioned) + c666602iu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C666602iu c666602iu) {
            C666602iu c666602iu2 = c666602iu;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c666602iu2.is_mentioned);
            protoWriter.writeBytes(c666602iu2.unknownFields());
        }
    };
    public Boolean is_mentioned;

    public C666602iu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C666702iv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
