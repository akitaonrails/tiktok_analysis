package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C626302cP extends Message<C626302cP, C626402cQ> {
    public static final ProtoAdapter<C626302cP> ADAPTER = new ProtoAdapter<C626302cP>() { // from class: X.02cO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C626302cP decode(ProtoReader protoReader) {
            C626302cP c626302cP = new C626302cP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c626302cP.effect = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c626302cP.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c626302cP;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C626302cP c626302cP) {
            C626302cP c626302cP2 = c626302cP;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c626302cP2.type) + protoAdapter.encodedSizeWithTag(2, c626302cP2.effect) + c626302cP2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C626302cP c626302cP) {
            C626302cP c626302cP2 = c626302cP;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c626302cP2.type);
            protoAdapter.encodeWithTag(protoWriter, 2, c626302cP2.effect);
            protoWriter.writeBytes(c626302cP2.unknownFields());
        }
    };
    public Integer effect;
    public Integer type;

    public C626302cP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C626402cQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
