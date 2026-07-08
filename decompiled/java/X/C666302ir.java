package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C666302ir extends Message<C666302ir, C666402is> {
    public static final ProtoAdapter<C666302ir> ADAPTER = new ProtoAdapter<C666302ir>() { // from class: X.02iq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C666302ir decode(ProtoReader protoReader) {
            C666302ir c666302ir = new C666302ir();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c666302ir.video_source = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c666302ir;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C666302ir c666302ir) {
            C666302ir c666302ir2 = c666302ir;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c666302ir2.video_source) + c666302ir2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C666302ir c666302ir) {
            C666302ir c666302ir2 = c666302ir;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c666302ir2.video_source);
            protoWriter.writeBytes(c666302ir2.unknownFields());
        }
    };
    public Integer video_source;

    public C666302ir() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C666402is newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
