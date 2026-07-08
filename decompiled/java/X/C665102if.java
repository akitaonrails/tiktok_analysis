package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02if, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C665102if extends Message<C665102if, C665202ig> {
    public static final ProtoAdapter<C665102if> ADAPTER = new ProtoAdapter<C665102if>() { // from class: X.02ie
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C665102if decode(ProtoReader protoReader) {
            C665102if c665102if = new C665102if();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c665102if.head_model_score = ProtoAdapter.DOUBLE.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c665102if;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C665102if c665102if) {
            C665102if c665102if2 = c665102if;
            return ProtoAdapter.DOUBLE.encodedSizeWithTag(1, c665102if2.head_model_score) + c665102if2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C665102if c665102if) {
            C665102if c665102if2 = c665102if;
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 1, c665102if2.head_model_score);
            protoWriter.writeBytes(c665102if2.unknownFields());
        }
    };
    public Double head_model_score;

    public C665102if() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C665202ig newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
