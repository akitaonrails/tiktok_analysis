package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1D9U, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9U extends Message<C1D9U, C1D9V> {
    public static final ProtoAdapter<C1D9U> ADAPTER = new ProtoAdapter<C1D9U>() { // from class: X.1D9T
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1D9U decode(ProtoReader protoReader) {
            C1D9V c1d9v = new C1D9V();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1d9v.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1d9v.LJFF = C1D9R.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c1d9v.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1d9v.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d9v.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1D9U c1d9u) {
            C1D9U c1d9u2 = c1d9u;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1d9u2.avg_init_fetch_cost) + protoAdapter.encodedSizeWithTag(2, c1d9u2.avg_loadmore_cost) + C1D9R.ADAPTER.encodedSizeWithTag(3, c1d9u2.client_cache_detail) + c1d9u2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1D9U c1d9u) {
            C1D9U c1d9u2 = c1d9u;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1d9u2.avg_init_fetch_cost);
            protoAdapter.encodeWithTag(protoWriter, 2, c1d9u2.avg_loadmore_cost);
            C1D9R.ADAPTER.encodeWithTag(protoWriter, 3, c1d9u2.client_cache_detail);
            protoWriter.writeBytes(c1d9u2.unknownFields());
        }
    };
    public Integer avg_init_fetch_cost;
    public Integer avg_loadmore_cost;
    public C1D9R client_cache_detail;

    @Override // com.squareup.wire.Message
    public C1D9V newBuilder() {
        return null;
    }

    public C1D9U(Integer num, Integer num2, C1D9R c1d9r) {
        this(num, num2, c1d9r, ByteString.EMPTY);
    }

    public C1D9U(Integer num, Integer num2, C1D9R c1d9r, ByteString byteString) {
        super(ADAPTER, byteString);
        this.avg_init_fetch_cost = num;
        this.avg_loadmore_cost = num2;
        this.client_cache_detail = c1d9r;
    }
}
