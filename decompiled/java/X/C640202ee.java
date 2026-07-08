package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C640202ee extends Message<C640202ee, C640302ef> {
    public static final ProtoAdapter<C640202ee> ADAPTER = new ProtoAdapter<C640202ee>() { // from class: X.02ed
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C640202ee decode(ProtoReader protoReader) {
            C640202ee c640202ee = new C640202ee();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c640202ee.fmt_review_count = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c640202ee.review_count = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c640202ee;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C640202ee c640202ee) {
            C640202ee c640202ee2 = c640202ee;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c640202ee2.review_count) + ProtoAdapter.STRING.encodedSizeWithTag(2, c640202ee2.fmt_review_count) + c640202ee2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C640202ee c640202ee) {
        }
    };
    public String fmt_review_count;
    public Integer review_count;

    public C640202ee() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C640302ef newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
