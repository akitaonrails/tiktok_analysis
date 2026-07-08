package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.036N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C036N extends Message<C036N, C036O> {
    public static final ProtoAdapter<C036N> ADAPTER = new ProtoAdapter<C036N>() { // from class: X.036M
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C036N decode(ProtoReader protoReader) {
            C036O c036o = new C036O();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c036o.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c036o.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c036o.LIZLLL.add(C036K.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c036o.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C036N c036n) {
            C036N c036n2 = c036n;
            return C036K.ADAPTER.asRepeated().encodedSizeWithTag(1, c036n2.market_type_info_list) + ProtoAdapter.INT64.encodedSizeWithTag(2, c036n2.request_count) + c036n2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C036N c036n) {
            C036N c036n2 = c036n;
            C036K.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c036n2.market_type_info_list);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c036n2.request_count);
            protoWriter.writeBytes(c036n2.unknownFields());
        }
    };
    public List<C036K> market_type_info_list;
    public Long request_count;

    @Override // com.squareup.wire.Message
    public C036O newBuilder() {
        return null;
    }

    public C036N(List<C036K> list, Long l) {
        this(list, l, ByteString.EMPTY);
    }

    public C036N(List<C036K> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.market_type_info_list = C1516540pZE.LJFF("market_type_info_list", list);
        this.request_count = l;
    }
}
