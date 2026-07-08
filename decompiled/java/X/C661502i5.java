package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02i5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C661502i5 extends Message<C661502i5, C661602i6> {
    public static final ProtoAdapter<C661502i5> ADAPTER = new ProtoAdapter<C661502i5>() { // from class: X.02i4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C661502i5 decode(ProtoReader protoReader) {
            C661502i5 c661502i5 = new C661502i5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c661502i5.download_comment_enable = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c661502i5.ug_review_passed = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c661502i5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C661502i5 c661502i5) {
            C661502i5 c661502i52 = c661502i5;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c661502i52.ug_review_passed) + protoAdapter.encodedSizeWithTag(2, c661502i52.download_comment_enable) + c661502i52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C661502i5 c661502i5) {
            C661502i5 c661502i52 = c661502i5;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c661502i52.ug_review_passed);
            protoAdapter.encodeWithTag(protoWriter, 2, c661502i52.download_comment_enable);
            protoWriter.writeBytes(c661502i52.unknownFields());
        }
    };
    public Boolean download_comment_enable;
    public Boolean ug_review_passed;

    public C661502i5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C661602i6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
