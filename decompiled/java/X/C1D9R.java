package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9R, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9R extends Message<C1D9R, C1D9S> {
    public static final ProtoAdapter<C1D9R> ADAPTER = new ProtoAdapter<C1D9R>() { // from class: X.1D9Q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D9R decode(ProtoReader protoReader) {
            C1D9S c1d9s = new C1D9S();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1d9s.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1d9s.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1d9s.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d9s.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1D9R c1d9r) {
            C1D9R c1d9r2 = c1d9r;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1d9r2.trigger_status) + protoAdapter.encodedSizeWithTag(2, c1d9r2.request_num) + c1d9r2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1D9R c1d9r) {
            C1D9R c1d9r2 = c1d9r;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1d9r2.trigger_status);
            protoAdapter.encodeWithTag(protoWriter, 2, c1d9r2.request_num);
            protoWriter.writeBytes(c1d9r2.unknownFields());
        }
    };
    public Integer request_num;
    public Integer trigger_status;

    @Override // com.squareup.wire.Message
    public C1D9S newBuilder() {
        return null;
    }

    public C1D9R(Integer num, Integer num2) {
        this(num, num2, ByteString.EMPTY);
    }

    public C1D9R(Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.trigger_status = num;
        this.request_num = num2;
    }
}
