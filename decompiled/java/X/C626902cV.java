package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C626902cV extends Message<C626902cV, C627002cW> {
    public static final ProtoAdapter<C626902cV> ADAPTER = new ProtoAdapter<C626902cV>() { // from class: X.02cU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C626902cV decode(ProtoReader protoReader) {
            C626902cV c626902cV = new C626902cV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c626902cV.y = ProtoAdapter.FLOAT.decode(protoReader);
                        }
                    } else {
                        c626902cV.x = ProtoAdapter.FLOAT.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c626902cV;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C626902cV c626902cV) {
            C626902cV c626902cV2 = c626902cV;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return protoAdapter.encodedSizeWithTag(1, c626902cV2.x) + protoAdapter.encodedSizeWithTag(2, c626902cV2.y) + c626902cV2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C626902cV c626902cV) {
            C626902cV c626902cV2 = c626902cV;
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(protoWriter, 1, c626902cV2.x);
            protoAdapter.encodeWithTag(protoWriter, 2, c626902cV2.y);
            protoWriter.writeBytes(c626902cV2.unknownFields());
        }
    };
    public Float x;
    public Float y;

    public C626902cV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C627002cW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
