package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C669602jO extends Message<C669602jO, C669702jP> {
    public static final ProtoAdapter<C669602jO> ADAPTER = new ProtoAdapter<C669602jO>() { // from class: X.02jN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C669602jO decode(ProtoReader protoReader) {
            C669602jO c669602jO = new C669602jO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c669602jO.is_preview = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c669602jO;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C669602jO c669602jO) {
            C669602jO c669602jO2 = c669602jO;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c669602jO2.is_preview) + c669602jO2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C669602jO c669602jO) {
            C669602jO c669602jO2 = c669602jO;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c669602jO2.is_preview);
            protoWriter.writeBytes(c669602jO2.unknownFields());
        }
    };
    public Boolean is_preview;

    public C669602jO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C669702jP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
