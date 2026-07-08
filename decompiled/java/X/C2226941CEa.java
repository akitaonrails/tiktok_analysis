package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226941CEa extends Message<C2226941CEa, C2226951CEb> {
    public static final ProtoAdapter<C2226941CEa> ADAPTER = new ProtoAdapter<C2226941CEa>() { // from class: X.1CEZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226941CEa decode(ProtoReader protoReader) {
            C2226941CEa c2226941CEa = new C2226941CEa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c2226941CEa.aweme_list.add(C5186020i.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c2226941CEa.has_more = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2226941CEa.max_cursor = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2226941CEa.min_cursor = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226941CEa;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226941CEa c2226941CEa) {
            C2226941CEa c2226941CEa2 = c2226941CEa;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2226941CEa2.min_cursor) + protoAdapter.encodedSizeWithTag(2, c2226941CEa2.max_cursor) + ProtoAdapter.INT32.encodedSizeWithTag(3, c2226941CEa2.has_more) + C5186020i.ADAPTER.asRepeated().encodedSizeWithTag(4, c2226941CEa2.aweme_list) + c2226941CEa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2226941CEa c2226941CEa) {
            C2226941CEa c2226941CEa2 = c2226941CEa;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2226941CEa2.min_cursor);
            protoAdapter.encodeWithTag(protoWriter, 2, c2226941CEa2.max_cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c2226941CEa2.has_more);
            C5186020i.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c2226941CEa2.aweme_list);
            protoWriter.writeBytes(c2226941CEa2.unknownFields());
        }
    };
    public List<C5186020i> aweme_list;
    public Integer has_more;
    public Long max_cursor;
    public Long min_cursor;

    public C2226941CEa() {
        super(ADAPTER, ByteString.EMPTY);
        this.aweme_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2226951CEb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
