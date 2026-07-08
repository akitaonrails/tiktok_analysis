package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02R8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02R8 extends Message<C02R8, C02R9> {
    public static final ProtoAdapter<C02R8> ADAPTER = new ProtoAdapter<C02R8>() { // from class: X.02R7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02R8 decode(ProtoReader protoReader) {
            C02R8 c02r8 = new C02R8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02r8.slot_info_list.add(C02R6.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02r8.key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02r8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02R8 c02r8) {
            C02R8 c02r82 = c02r8;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02r82.key) + C02R6.ADAPTER.asRepeated().encodedSizeWithTag(2, c02r82.slot_info_list) + c02r82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02R8 c02r8) {
            C02R8 c02r82 = c02r8;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02r82.key);
            C02R6.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02r82.slot_info_list);
            protoWriter.writeBytes(c02r82.unknownFields());
        }
    };
    public String key;
    public List<C02R6> slot_info_list;

    public C02R8() {
        super(ADAPTER, ByteString.EMPTY);
        this.slot_info_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02R9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
