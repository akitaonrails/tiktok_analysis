package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Bzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223181Bzo extends Message<C2223181Bzo, C2223191Bzp> {
    public static final ProtoAdapter<C2223181Bzo> ADAPTER = new ProtoAdapter<C2223181Bzo>() { // from class: X.1Bzn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223181Bzo decode(ProtoReader protoReader) {
            C2223181Bzo c2223181Bzo = new C2223181Bzo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223181Bzo.index = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2223181Bzo.media_info_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223181Bzo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223181Bzo c2223181Bzo) {
            C2223181Bzo c2223181Bzo2 = c2223181Bzo;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c2223181Bzo2.media_info_type) + protoAdapter.encodedSizeWithTag(2, c2223181Bzo2.index) + c2223181Bzo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223181Bzo c2223181Bzo) {
            C2223181Bzo c2223181Bzo2 = c2223181Bzo;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223181Bzo2.media_info_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223181Bzo2.index);
            protoWriter.writeBytes(c2223181Bzo2.unknownFields());
        }
    };
    public Integer index;
    public Integer media_info_type;

    public C2223181Bzo() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223191Bzp newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
