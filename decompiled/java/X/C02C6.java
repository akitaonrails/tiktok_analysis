package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02C6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02C6 extends Message<C02C6, C02MN> {
    public static final ProtoAdapter<C02C6> ADAPTER = new ProtoAdapter<C02C6>() { // from class: X.026g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02C6 decode(ProtoReader protoReader) {
            C02C6 c02c6 = new C02C6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02c6.total = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02c6.user_list.add(C557402Fg.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02c6.mutual_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02c6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02C6 c02c6) {
            C02C6 c02c62 = c02c6;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c02c62.mutual_type) + C557402Fg.ADAPTER.asRepeated().encodedSizeWithTag(2, c02c62.user_list) + protoAdapter.encodedSizeWithTag(3, c02c62.total) + c02c62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02C6 c02c6) {
            C02C6 c02c62 = c02c6;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02c62.mutual_type);
            C557402Fg.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02c62.user_list);
            protoAdapter.encodeWithTag(protoWriter, 3, c02c62.total);
            protoWriter.writeBytes(c02c62.unknownFields());
        }
    };
    public Integer mutual_type;
    public Integer total;
    public List<C557402Fg> user_list;

    public C02C6() {
        super(ADAPTER, ByteString.EMPTY);
        this.user_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02MN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
