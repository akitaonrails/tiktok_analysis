package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C588502Rf extends Message<C588502Rf, C588802Ri> {
    public static final ProtoAdapter<C588502Rf> ADAPTER = new ProtoAdapter<C588502Rf>() { // from class: X.02Re
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C588502Rf decode(ProtoReader protoReader) {
            C588502Rf c588502Rf = new C588502Rf();
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
                                    c588502Rf.group_avatar_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c588502Rf.group_name = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c588502Rf.conversation_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c588502Rf.conversation_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c588502Rf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C588502Rf c588502Rf) {
            C588502Rf c588502Rf2 = c588502Rf;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c588502Rf2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, c588502Rf2.conversation_type) + protoAdapter.encodedSizeWithTag(3, c588502Rf2.group_name) + protoAdapter.encodedSizeWithTag(4, c588502Rf2.group_avatar_url) + c588502Rf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C588502Rf c588502Rf) {
            C588502Rf c588502Rf2 = c588502Rf;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c588502Rf2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c588502Rf2.conversation_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c588502Rf2.group_name);
            protoAdapter.encodeWithTag(protoWriter, 4, c588502Rf2.group_avatar_url);
            protoWriter.writeBytes(c588502Rf2.unknownFields());
        }
    };
    public String conversation_id;
    public Integer conversation_type;
    public String group_avatar_url;
    public String group_name;

    public C588502Rf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C588802Ri newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
