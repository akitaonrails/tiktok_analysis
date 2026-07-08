package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1COO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1COO extends Message<C1COO, C1COP> {
    public static final ProtoAdapter<C1COO> ADAPTER = new ProtoAdapter<C1COO>() { // from class: X.1CON
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1COO decode(ProtoReader protoReader) {
            C1COO c1coo = new C1COO();
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
                                    c1coo.time_format = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1coo.type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1coo.dataItem.add(C1COI.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1coo.data = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1coo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1COO c1coo) {
            C1COO c1coo2 = c1coo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1coo2.data) + C1COI.ADAPTER.asRepeated().encodedSizeWithTag(2, c1coo2.dataItem) + ProtoAdapter.INT32.encodedSizeWithTag(3, c1coo2.type) + protoAdapter.encodedSizeWithTag(4, c1coo2.time_format) + c1coo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1COO c1coo) {
        }
    };
    public String data;
    public List<C1COI> dataItem;
    public String time_format;
    public Integer type;

    public C1COO() {
        super(ADAPTER, ByteString.EMPTY);
        this.dataItem = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1COP newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
