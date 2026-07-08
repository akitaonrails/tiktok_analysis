package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0M, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C0M extends Message<C1C0M, C1C0L> {
    public static final ProtoAdapter<C1C0M> ADAPTER = new ProtoAdapter<C1C0M>() { // from class: X.1C0N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C0M decode(ProtoReader protoReader) {
            C1C0M c1c0m = new C1C0M();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c0m.unit_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c0m.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c0m;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C0M c1c0m) {
            C1C0M c1c0m2 = c1c0m;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c0m2.title) + protoAdapter.encodedSizeWithTag(2, c1c0m2.unit_text) + c1c0m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C0M c1c0m) {
        }
    };
    public String title;
    public String unit_text;

    public C1C0M() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C0L newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
