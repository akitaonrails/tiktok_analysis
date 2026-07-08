package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549402Ce extends Message<C549402Ce, C02M5> {
    public static final ProtoAdapter<C549402Ce> ADAPTER = new ProtoAdapter<C549402Ce>() { // from class: X.02Ba
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549402Ce decode(ProtoReader protoReader) {
            C549402Ce c549402Ce = new C549402Ce();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c549402Ce.container_entrance_configs.add(C02BZ.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c549402Ce.container_exit_configs.add(C546502Bb.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549402Ce;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549402Ce c549402Ce) {
            C549402Ce c549402Ce2 = c549402Ce;
            return C546502Bb.ADAPTER.asRepeated().encodedSizeWithTag(1, c549402Ce2.container_exit_configs) + C02BZ.ADAPTER.asRepeated().encodedSizeWithTag(2, c549402Ce2.container_entrance_configs) + c549402Ce2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C549402Ce c549402Ce) {
            C549402Ce c549402Ce2 = c549402Ce;
            C546502Bb.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c549402Ce2.container_exit_configs);
            C02BZ.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c549402Ce2.container_entrance_configs);
            protoWriter.writeBytes(c549402Ce2.unknownFields());
        }
    };
    public List<C02BZ> container_entrance_configs;
    public List<C546502Bb> container_exit_configs;

    public C549402Ce() {
        super(ADAPTER, ByteString.EMPTY);
        this.container_exit_configs = C1516540pZE.LJIIIIZZ();
        this.container_entrance_configs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02M5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
