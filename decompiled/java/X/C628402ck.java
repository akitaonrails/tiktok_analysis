package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C628402ck extends Message<C628402ck, C628502cl> {
    public static final ProtoAdapter<C628402ck> ADAPTER = new ProtoAdapter<C628402ck>() { // from class: X.02cj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C628402ck decode(ProtoReader protoReader) {
            C628402ck c628402ck = new C628402ck();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c628402ck.radius = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c628402ck.size = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c628402ck;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C628402ck c628402ck) {
            C628402ck c628402ck2 = c628402ck;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c628402ck2.size) + protoAdapter.encodedSizeWithTag(2, c628402ck2.radius) + c628402ck2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C628402ck c628402ck) {
            C628402ck c628402ck2 = c628402ck;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c628402ck2.size);
            protoAdapter.encodeWithTag(protoWriter, 2, c628402ck2.radius);
            protoWriter.writeBytes(c628402ck2.unknownFields());
        }
    };
    public Integer radius;
    public Integer size;

    public C628402ck() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C628502cl newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
