package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02jo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C672202jo extends Message<C672202jo, C672302jp> {
    public static final ProtoAdapter<C672202jo> ADAPTER = new ProtoAdapter<C672202jo>() { // from class: X.02jn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C672202jo decode(ProtoReader protoReader) {
            C672202jo c672202jo = new C672202jo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c672202jo.meta_key = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c672202jo.preview_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c672202jo.data = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c672202jo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C672202jo c672202jo) {
            C672202jo c672202jo2 = c672202jo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c672202jo2.data) + ProtoAdapter.INT32.encodedSizeWithTag(2, c672202jo2.preview_type) + protoAdapter.encodedSizeWithTag(3, c672202jo2.meta_key) + c672202jo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C672202jo c672202jo) {
            C672202jo c672202jo2 = c672202jo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c672202jo2.data);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c672202jo2.preview_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c672202jo2.meta_key);
            protoWriter.writeBytes(c672202jo2.unknownFields());
        }
    };
    public String data;
    public String meta_key;
    public Integer preview_type;

    public C672202jo() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C672302jp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
