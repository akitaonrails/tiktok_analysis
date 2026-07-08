package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0s8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1615400s8g extends Message<C1615400s8g, C1615410s8h> {
    public static final ProtoAdapter<C1615400s8g> ADAPTER = new ProtoAdapter<C1615400s8g>() { // from class: X.0s8f
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1615400s8g decode(ProtoReader protoReader) {
            C1615400s8g c1615400s8g = new C1615400s8g();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1615400s8g.curr_page = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1615400s8g.has_next = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1615400s8g.has_before = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1615400s8g;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1615400s8g c1615400s8g) {
            C1615400s8g c1615400s8g2 = c1615400s8g;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return protoAdapter.encodedSizeWithTag(1, c1615400s8g2.has_before) + protoAdapter.encodedSizeWithTag(2, c1615400s8g2.has_next) + ProtoAdapter.INT64.encodedSizeWithTag(3, c1615400s8g2.curr_page) + c1615400s8g2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1615400s8g c1615400s8g) {
            C1615400s8g c1615400s8g2 = c1615400s8g;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c1615400s8g2.has_before);
            protoAdapter.encodeWithTag(protoWriter, 2, c1615400s8g2.has_next);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, c1615400s8g2.curr_page);
            protoWriter.writeBytes(c1615400s8g2.unknownFields());
        }
    };
    public Long curr_page;
    public Boolean has_before;
    public Boolean has_next;

    public C1615400s8g() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1615410s8h newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
