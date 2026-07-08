package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02gq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C653802gq extends Message<C653802gq, C653902gr> {
    public static final ProtoAdapter<C653802gq> ADAPTER = new ProtoAdapter<C653802gq>() { // from class: X.02gp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C653802gq decode(ProtoReader protoReader) {
            C653802gq c653802gq = new C653802gq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c653802gq.meme_video_reg = C653502gn.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c653802gq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C653802gq c653802gq) {
            C653802gq c653802gq2 = c653802gq;
            return C653502gn.ADAPTER.encodedSizeWithTag(1, c653802gq2.meme_video_reg) + c653802gq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C653802gq c653802gq) {
            C653802gq c653802gq2 = c653802gq;
            C653502gn.ADAPTER.encodeWithTag(protoWriter, 1, c653802gq2.meme_video_reg);
            protoWriter.writeBytes(c653802gq2.unknownFields());
        }
    };
    public C653502gn meme_video_reg;

    public C653802gq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C653902gr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
