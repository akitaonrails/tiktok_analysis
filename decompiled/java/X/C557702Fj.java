package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557702Fj extends Message<C557702Fj, C564902Id> {
    public static final ProtoAdapter<C557702Fj> ADAPTER = new ProtoAdapter<C557702Fj>() { // from class: X.028U
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557702Fj decode(ProtoReader protoReader) {
            C557702Fj c557702Fj = new C557702Fj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c557702Fj.url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c557702Fj.desc = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c557702Fj.rec_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557702Fj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557702Fj c557702Fj) {
            C557702Fj c557702Fj2 = c557702Fj;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c557702Fj2.rec_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c557702Fj2.desc) + protoAdapter.encodedSizeWithTag(3, c557702Fj2.url) + c557702Fj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C557702Fj c557702Fj) {
            C557702Fj c557702Fj2 = c557702Fj;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c557702Fj2.rec_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c557702Fj2.desc);
            protoAdapter.encodeWithTag(protoWriter, 3, c557702Fj2.url);
            protoWriter.writeBytes(c557702Fj2.unknownFields());
        }
    };
    public String desc;
    public Integer rec_type;
    public String url;

    public C557702Fj() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C564902Id newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
