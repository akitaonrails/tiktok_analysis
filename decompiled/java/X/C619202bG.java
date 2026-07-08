package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C619202bG extends Message<C619202bG, C619302bH> {
    public static final ProtoAdapter<C619202bG> ADAPTER = new ProtoAdapter<C619202bG>() { // from class: X.02bF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C619202bG decode(ProtoReader protoReader) {
            C619202bG c619202bG = new C619202bG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c619202bG.GroupdIdList1.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c619202bG.GroupdIdList0.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c619202bG;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C619202bG c619202bG) {
            C619202bG c619202bG2 = c619202bG;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c619202bG2.GroupdIdList0) + protoAdapter.asRepeated().encodedSizeWithTag(2, c619202bG2.GroupdIdList1) + c619202bG2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C619202bG c619202bG) {
            C619202bG c619202bG2 = c619202bG;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c619202bG2.GroupdIdList0);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c619202bG2.GroupdIdList1);
            protoWriter.writeBytes(c619202bG2.unknownFields());
        }
    };
    public List<Long> GroupdIdList0;
    public List<Long> GroupdIdList1;

    public C619202bG() {
        super(ADAPTER, ByteString.EMPTY);
        this.GroupdIdList0 = C1516540pZE.LJIIIIZZ();
        this.GroupdIdList1 = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C619302bH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
