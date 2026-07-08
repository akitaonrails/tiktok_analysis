package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C627202cY extends Message<C627202cY, C627302cZ> {
    public static final ProtoAdapter<C627202cY> ADAPTER = new ProtoAdapter<C627202cY>() { // from class: X.02cX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C627202cY decode(ProtoReader protoReader) {
            C627202cY c627202cY = new C627202cY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c627202cY.is_collected = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c627202cY.status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c627202cY;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C627202cY c627202cY) {
            C627202cY c627202cY2 = c627202cY;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c627202cY2.status) + protoAdapter.encodedSizeWithTag(2, c627202cY2.is_collected) + c627202cY2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C627202cY c627202cY) {
            C627202cY c627202cY2 = c627202cY;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c627202cY2.status);
            protoAdapter.encodeWithTag(protoWriter, 2, c627202cY2.is_collected);
            protoWriter.writeBytes(c627202cY2.unknownFields());
        }
    };
    public Integer is_collected;
    public Integer status;

    public C627202cY() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C627302cZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
