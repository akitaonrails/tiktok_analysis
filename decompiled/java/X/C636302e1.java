package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02e1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C636302e1 extends Message<C636302e1, C636402e2> {
    public static final ProtoAdapter<C636302e1> ADAPTER = new ProtoAdapter<C636302e1>() { // from class: X.02e0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C636302e1 decode(ProtoReader protoReader) {
            C636302e1 c636302e1 = new C636302e1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c636302e1.original_comment_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c636302e1.original_item_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c636302e1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C636302e1 c636302e1) {
            C636302e1 c636302e12 = c636302e1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c636302e12.original_item_id) + protoAdapter.encodedSizeWithTag(2, c636302e12.original_comment_id) + c636302e12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C636302e1 c636302e1) {
            C636302e1 c636302e12 = c636302e1;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c636302e12.original_item_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c636302e12.original_comment_id);
            protoWriter.writeBytes(c636302e12.unknownFields());
        }
    };
    public String original_comment_id;
    public String original_item_id;

    public C636302e1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C636402e2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
