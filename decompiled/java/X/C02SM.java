package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02SM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02SM extends Message<C02SM, C02SN> {
    public static final ProtoAdapter<C02SM> ADAPTER = new ProtoAdapter<C02SM>() { // from class: X.02SL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02SM decode(ProtoReader protoReader) {
            C02SM c02sm = new C02SM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c02sm.stats_tag_for_client_func.add(C02SK.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02sm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02SM c02sm) {
            C02SM c02sm2 = c02sm;
            return C02SK.ADAPTER.asRepeated().encodedSizeWithTag(1, c02sm2.stats_tag_for_client_func) + c02sm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02SM c02sm) {
            C02SM c02sm2 = c02sm;
            C02SK.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c02sm2.stats_tag_for_client_func);
            protoWriter.writeBytes(c02sm2.unknownFields());
        }
    };
    public List<C02SK> stats_tag_for_client_func;

    public C02SM() {
        super(ADAPTER, ByteString.EMPTY);
        this.stats_tag_for_client_func = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02SN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
