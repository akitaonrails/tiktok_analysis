package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CAX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CAX extends Message<C1CAX, C1CAY> {
    public static final ProtoAdapter<C1CAX> ADAPTER = new ProtoAdapter<C1CAX>() { // from class: X.1CAW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CAX decode(ProtoReader protoReader) {
            C1CAX c1cax = new C1CAX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1cax.nature_classification_info = C2225901CAa.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cax;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CAX c1cax) {
            C1CAX c1cax2 = c1cax;
            return C2225901CAa.ADAPTER.encodedSizeWithTag(1, c1cax2.nature_classification_info) + c1cax2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CAX c1cax) {
            C1CAX c1cax2 = c1cax;
            C2225901CAa.ADAPTER.encodeWithTag(protoWriter, 1, c1cax2.nature_classification_info);
            protoWriter.writeBytes(c1cax2.unknownFields());
        }
    };
    public C2225901CAa nature_classification_info;

    public C1CAX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CAY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
