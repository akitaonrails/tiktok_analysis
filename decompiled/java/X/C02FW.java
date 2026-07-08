package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FW extends Message<C02FW, C570602Ki> {
    public static final ProtoAdapter<C02FW> ADAPTER = new ProtoAdapter<C02FW>() { // from class: X.02FV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FW decode(ProtoReader protoReader) {
            C02FW c02fw = new C02FW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02fw.triggers.add(C02FU.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02fw.disable_client_frequency_control = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FW c02fw) {
            C02FW c02fw2 = c02fw;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c02fw2.disable_client_frequency_control) + C02FU.ADAPTER.asRepeated().encodedSizeWithTag(2, c02fw2.triggers) + c02fw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02FW c02fw) {
            C02FW c02fw2 = c02fw;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02fw2.disable_client_frequency_control);
            C02FU.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02fw2.triggers);
            protoWriter.writeBytes(c02fw2.unknownFields());
        }
    };
    public Boolean disable_client_frequency_control;
    public List<C02FU> triggers;

    public C02FW() {
        super(ADAPTER, ByteString.EMPTY);
        this.triggers = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C570602Ki newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
