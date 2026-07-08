package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C626602cS extends Message<C626602cS, C626702cT> {
    public static final ProtoAdapter<C626602cS> ADAPTER = new ProtoAdapter<C626602cS>() { // from class: X.02cR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C626602cS decode(ProtoReader protoReader) {
            C626602cS c626602cS = new C626602cS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c626602cS.auth_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c626602cS.auth_status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c626602cS;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C626602cS c626602cS) {
            C626602cS c626602cS2 = c626602cS;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c626602cS2.auth_status) + protoAdapter.encodedSizeWithTag(2, c626602cS2.auth_type) + c626602cS2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C626602cS c626602cS) {
            C626602cS c626602cS2 = c626602cS;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c626602cS2.auth_status);
            protoAdapter.encodeWithTag(protoWriter, 2, c626602cS2.auth_type);
            protoWriter.writeBytes(c626602cS2.unknownFields());
        }
    };
    public Integer auth_status;
    public Integer auth_type;

    public C626602cS() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C626702cT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
