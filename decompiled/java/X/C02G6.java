package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02G6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02G6 extends Message<C02G6, C579802Nw> {
    public static final ProtoAdapter<C02G6> ADAPTER = new ProtoAdapter<C02G6>() { // from class: X.02G5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02G6 decode(ProtoReader protoReader) {
            C02G6 c02g6 = new C02G6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02g6.detail_page_url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02g6.performance_metrics.add(C02G4.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02g6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02G6 c02g6) {
            C02G6 c02g62 = c02g6;
            return C02G4.ADAPTER.asRepeated().encodedSizeWithTag(1, c02g62.performance_metrics) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02g62.detail_page_url) + c02g62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02G6 c02g6) {
        }
    };
    public String detail_page_url;
    public List<C02G4> performance_metrics;

    public C02G6() {
        super(ADAPTER, ByteString.EMPTY);
        this.performance_metrics = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C579802Nw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
