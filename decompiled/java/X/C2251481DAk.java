package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2251481DAk extends Message<C2251481DAk, C2251491DAl> {
    public static final ProtoAdapter<C2251481DAk> ADAPTER = new ProtoAdapter<C2251481DAk>() { // from class: X.1DAj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2251481DAk decode(ProtoReader protoReader) {
            C2251491DAl c2251491DAl = new C2251491DAl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2251491DAl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2251491DAl.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2251491DAl.LIZLLL.add(C1DCT.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251491DAl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2251481DAk c2251481DAk) {
            C2251481DAk c2251481DAk2 = c2251481DAk;
            return C1DCT.ADAPTER.asRepeated().encodedSizeWithTag(1, c2251481DAk2.items) + ProtoAdapter.INT64.encodedSizeWithTag(2, c2251481DAk2.timestamp) + c2251481DAk2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2251481DAk c2251481DAk) {
            C2251481DAk c2251481DAk2 = c2251481DAk;
            C1DCT.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2251481DAk2.items);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c2251481DAk2.timestamp);
            protoWriter.writeBytes(c2251481DAk2.unknownFields());
        }
    };
    public List<C1DCT> items;
    public Long timestamp;

    @Override // com.squareup.wire.Message
    public C2251491DAl newBuilder() {
        return null;
    }

    public C2251481DAk(List<C1DCT> list, Long l) {
        this(list, l, ByteString.EMPTY);
    }

    public C2251481DAk(List<C1DCT> list, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.items = C1516540pZE.LJFF("items", list);
        this.timestamp = l;
    }
}
