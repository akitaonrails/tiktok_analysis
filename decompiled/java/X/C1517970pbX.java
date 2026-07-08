package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517970pbX extends Message<C1517970pbX, C1517980pbY> {
    public static final ProtoAdapter<C1517970pbX> ADAPTER = new ProtoAdapter<C1517970pbX>() { // from class: X.0pbW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517970pbX decode(ProtoReader protoReader) {
            C1517970pbX c1517970pbX = new C1517970pbX();
            long jBeginMessage = protoReader.beginMessage();
            while (protoReader.nextTag() != -1) {
                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
            }
            protoReader.endMessage(jBeginMessage);
            return c1517970pbX;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517970pbX c1517970pbX) {
            return c1517970pbX.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517970pbX c1517970pbX) {
            protoWriter.writeBytes(c1517970pbX.unknownFields());
        }
    };

    public C1517970pbX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517980pbY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
