package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C572702Ld extends Message<C572702Ld, C572802Le> {
    public static final ProtoAdapter<C572702Ld> ADAPTER = new ProtoAdapter<C572702Ld>() { // from class: X.02Lc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C572702Ld decode(ProtoReader protoReader) {
            C572702Ld c572702Ld = new C572702Ld();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c572702Ld.track = C02E8.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c572702Ld;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C572702Ld c572702Ld) {
            C572702Ld c572702Ld2 = c572702Ld;
            return C02E8.ADAPTER.encodedSizeWithTag(1, c572702Ld2.track) + c572702Ld2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C572702Ld c572702Ld) {
            C572702Ld c572702Ld2 = c572702Ld;
            C02E8.ADAPTER.encodeWithTag(protoWriter, 1, c572702Ld2.track);
            protoWriter.writeBytes(c572702Ld2.unknownFields());
        }
    };
    public C02E8 track;

    public C572702Ld() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C572802Le newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
