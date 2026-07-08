package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C735002tw extends Message<C735002tw, C735102tx> {
    public static final ProtoAdapter<C735002tw> ADAPTER = new ProtoAdapter<C735002tw>() { // from class: X.02tv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C735002tw decode(ProtoReader protoReader) {
            C735002tw c735002tw = new C735002tw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c735002tw.total_task_cnt = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c735002tw.compeleted_task_cnt = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c735002tw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C735002tw c735002tw) {
            C735002tw c735002tw2 = c735002tw;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c735002tw2.compeleted_task_cnt) + protoAdapter.encodedSizeWithTag(2, c735002tw2.total_task_cnt) + c735002tw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C735002tw c735002tw) {
            C735002tw c735002tw2 = c735002tw;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c735002tw2.compeleted_task_cnt);
            protoAdapter.encodeWithTag(protoWriter, 2, c735002tw2.total_task_cnt);
            protoWriter.writeBytes(c735002tw2.unknownFields());
        }
    };
    public Integer compeleted_task_cnt;
    public Integer total_task_cnt;

    public C735002tw() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C735102tx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
