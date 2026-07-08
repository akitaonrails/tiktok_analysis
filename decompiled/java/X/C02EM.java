package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EM extends Message<C02EM, C02JN> {
    public static final ProtoAdapter<C02EM> ADAPTER = new ProtoAdapter<C02EM>() { // from class: X.027k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EM decode(ProtoReader protoReader) {
            C02EM c02em = new C02EM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02em.position = C634502dj.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c02em.scale_x = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02em.scale_y = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02em.complex = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02em.morph = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02em.rotate = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02em;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EM c02em) {
            C02EM c02em2 = c02em;
            int iEncodedSizeWithTag = C634502dj.ADAPTER.encodedSizeWithTag(1, c02em2.position);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02em2.scale_x) + protoAdapter.encodedSizeWithTag(3, c02em2.scale_y) + protoAdapter.encodedSizeWithTag(4, c02em2.complex) + protoAdapter.encodedSizeWithTag(5, c02em2.morph) + protoAdapter.encodedSizeWithTag(6, c02em2.rotate) + c02em2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EM c02em) {
            C02EM c02em2 = c02em;
            C634502dj.ADAPTER.encodeWithTag(protoWriter, 1, c02em2.position);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02em2.scale_x);
            protoAdapter.encodeWithTag(protoWriter, 3, c02em2.scale_y);
            protoAdapter.encodeWithTag(protoWriter, 4, c02em2.complex);
            protoAdapter.encodeWithTag(protoWriter, 5, c02em2.morph);
            protoAdapter.encodeWithTag(protoWriter, 6, c02em2.rotate);
            protoWriter.writeBytes(c02em2.unknownFields());
        }
    };
    public String complex;
    public String morph;
    public C634502dj position;
    public String rotate;
    public String scale_x;
    public String scale_y;

    public C02EM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
