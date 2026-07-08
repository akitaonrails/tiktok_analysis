package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C671702jj extends Message<C671702jj, C671802jk> {
    public static final ProtoAdapter<C671702jj> ADAPTER = new ProtoAdapter<C671702jj>() { // from class: X.02ji
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C671702jj decode(ProtoReader protoReader) {
            C671702jj c671702jj = new C671702jj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c671702jj.content = AnonymousClass0241.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c671702jj.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c671702jj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C671702jj c671702jj) {
            C671702jj c671702jj2 = c671702jj;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c671702jj2.title) + AnonymousClass0241.ADAPTER.encodedSizeWithTag(2, c671702jj2.content) + c671702jj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C671702jj c671702jj) {
        }
    };
    public AnonymousClass0241 content;
    public String title;

    public C671702jj() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C671802jk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
