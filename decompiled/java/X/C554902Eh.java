package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Eh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C554902Eh extends Message<C554902Eh, C578402Ni> {
    public static final ProtoAdapter<C554902Eh> ADAPTER = new ProtoAdapter<C554902Eh>() { // from class: X.028j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C554902Eh decode(ProtoReader protoReader) {
            C554902Eh c554902Eh = new C554902Eh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c554902Eh.text_with_image = C623802c0.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c554902Eh.text_with_link = C547802Bo.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c554902Eh.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c554902Eh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C554902Eh c554902Eh) {
            C554902Eh c554902Eh2 = c554902Eh;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c554902Eh2.type) + C547802Bo.ADAPTER.encodedSizeWithTag(2, c554902Eh2.text_with_link) + C623802c0.ADAPTER.encodedSizeWithTag(3, c554902Eh2.text_with_image) + c554902Eh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C554902Eh c554902Eh) {
        }
    };
    public C623802c0 text_with_image;
    public C547802Bo text_with_link;
    public Integer type;

    public C554902Eh() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C578402Ni newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
