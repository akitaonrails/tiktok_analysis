package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C588702Rh extends Message<C588702Rh, C588902Rj> {
    public static final ProtoAdapter<C588702Rh> ADAPTER = new ProtoAdapter<C588702Rh>() { // from class: X.02Rg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C588702Rh decode(ProtoReader protoReader) {
            C588702Rh c588702Rh = new C588702Rh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c588702Rh.conversation_info = C588502Rf.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c588702Rh.rec_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c588702Rh.from = C5189020l.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c588702Rh.display_quick_reply_box = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c588702Rh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C588702Rh c588702Rh) {
            C588702Rh c588702Rh2 = c588702Rh;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c588702Rh2.display_quick_reply_box) + C5189020l.ADAPTER.encodedSizeWithTag(2, c588702Rh2.from) + ProtoAdapter.INT32.encodedSizeWithTag(3, c588702Rh2.rec_type) + C588502Rf.ADAPTER.encodedSizeWithTag(4, c588702Rh2.conversation_info) + c588702Rh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C588702Rh c588702Rh) {
            C588702Rh c588702Rh2 = c588702Rh;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c588702Rh2.display_quick_reply_box);
            C5189020l.ADAPTER.encodeWithTag(protoWriter, 2, c588702Rh2.from);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c588702Rh2.rec_type);
            C588502Rf.ADAPTER.encodeWithTag(protoWriter, 4, c588702Rh2.conversation_info);
            protoWriter.writeBytes(c588702Rh2.unknownFields());
        }
    };
    public C588502Rf conversation_info;
    public Boolean display_quick_reply_box;
    public C5189020l from;
    public Integer rec_type;

    public C588702Rh() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C588902Rj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
