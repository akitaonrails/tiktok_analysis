package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557802Fk extends Message<C557802Fk, C569102Jt> {
    public static final ProtoAdapter<C557802Fk> ADAPTER = new ProtoAdapter<C557802Fk>() { // from class: X.028X
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557802Fk decode(ProtoReader protoReader) {
            C557802Fk c557802Fk = new C557802Fk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c557802Fk.priority = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c557802Fk.type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c557802Fk.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557802Fk;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557802Fk c557802Fk) {
            C557802Fk c557802Fk2 = c557802Fk;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c557802Fk2.name);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c557802Fk2.type) + protoAdapter.encodedSizeWithTag(3, c557802Fk2.priority) + c557802Fk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C557802Fk c557802Fk) {
            C557802Fk c557802Fk2 = c557802Fk;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c557802Fk2.name);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c557802Fk2.type);
            protoAdapter.encodeWithTag(protoWriter, 3, c557802Fk2.priority);
            protoWriter.writeBytes(c557802Fk2.unknownFields());
        }
    };
    public String name;
    public Integer priority;
    public Integer type;

    public C557802Fk() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C569102Jt newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
