package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02px, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C710302px extends Message<C710302px, C710402py> {
    public static final ProtoAdapter<C710302px> ADAPTER = new ProtoAdapter<C710302px>() { // from class: X.02pw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C710302px decode(ProtoReader protoReader) {
            C710302px c710302px = new C710302px();
            long jBeginMessage = protoReader.beginMessage();
            while (protoReader.nextTag() != -1) {
                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
            }
            protoReader.endMessage(jBeginMessage);
            return c710302px;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C710302px c710302px) {
            return c710302px.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C710302px c710302px) {
            protoWriter.writeBytes(c710302px.unknownFields());
        }
    };

    public C710302px() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C710402py newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
