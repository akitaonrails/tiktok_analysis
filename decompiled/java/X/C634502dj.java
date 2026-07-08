package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C634502dj extends Message<C634502dj, C634602dk> {
    public static final ProtoAdapter<C634502dj> ADAPTER = new ProtoAdapter<C634502dj>() { // from class: X.02di
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C634502dj decode(ProtoReader protoReader) {
            C634502dj c634502dj = new C634502dj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c634502dj.y = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c634502dj.x = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c634502dj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C634502dj c634502dj) {
            C634502dj c634502dj2 = c634502dj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c634502dj2.x) + protoAdapter.encodedSizeWithTag(2, c634502dj2.y) + c634502dj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C634502dj c634502dj) {
            C634502dj c634502dj2 = c634502dj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c634502dj2.x);
            protoAdapter.encodeWithTag(protoWriter, 2, c634502dj2.y);
            protoWriter.writeBytes(c634502dj2.unknownFields());
        }
    };
    public String x;
    public String y;

    public C634502dj() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C634602dk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
