package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C555402Em extends Message<C555402Em, C581702Op> {
    public static final ProtoAdapter<C555402Em> ADAPTER = new ProtoAdapter<C555402Em>() { // from class: X.028q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C555402Em decode(ProtoReader protoReader) {
            C555402Em c555402Em = new C555402Em();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 100) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c555402Em.user_virtual_info = C649002g4.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c555402Em.schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c555402Em.content = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c555402Em.header = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c555402Em;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C555402Em c555402Em) {
            C555402Em c555402Em2 = c555402Em;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c555402Em2.header) + protoAdapter.encodedSizeWithTag(2, c555402Em2.content) + ProtoAdapter.STRING.encodedSizeWithTag(3, c555402Em2.schema) + C649002g4.ADAPTER.encodedSizeWithTag(100, c555402Em2.user_virtual_info) + c555402Em2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C555402Em c555402Em) {
        }
    };
    public C5431029t content;
    public C5431029t header;
    public String schema;
    public C649002g4 user_virtual_info;

    public C555402Em() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C581702Op newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
