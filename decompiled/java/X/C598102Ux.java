package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C598102Ux extends Message<C598102Ux, C598202Uy> {
    public static final ProtoAdapter<C598102Ux> ADAPTER = new ProtoAdapter<C598102Ux>() { // from class: X.02Uw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C598102Ux decode(ProtoReader protoReader) {
            C598102Ux c598102Ux = new C598102Ux();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c598102Ux.type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c598102Ux.style = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c598102Ux.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c598102Ux;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C598102Ux c598102Ux) {
            C598102Ux c598102Ux2 = c598102Ux;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c598102Ux2.title);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c598102Ux2.style) + protoAdapter.encodedSizeWithTag(3, c598102Ux2.type) + c598102Ux2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C598102Ux c598102Ux) {
            C598102Ux c598102Ux2 = c598102Ux;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c598102Ux2.title);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c598102Ux2.style);
            protoAdapter.encodeWithTag(protoWriter, 3, c598102Ux2.type);
            protoWriter.writeBytes(c598102Ux2.unknownFields());
        }
    };
    public Integer style;
    public String title;
    public Integer type;

    public C598102Ux() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C598202Uy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
