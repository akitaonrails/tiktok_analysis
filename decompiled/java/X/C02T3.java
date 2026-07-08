package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02T3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02T3 extends Message<C02T3, C02T5> {
    public static final ProtoAdapter<C02T3> ADAPTER = new ProtoAdapter<C02T3>() { // from class: X.02T2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02T3 decode(ProtoReader protoReader) {
            C02T3 c02t3 = new C02T3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c02t3.meta_components.add(C02T1.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02t3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02T3 c02t3) {
            C02T3 c02t32 = c02t3;
            return C02T1.ADAPTER.asRepeated().encodedSizeWithTag(1, c02t32.meta_components) + c02t32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02T3 c02t3) {
            C02T3 c02t32 = c02t3;
            C02T1.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c02t32.meta_components);
            protoWriter.writeBytes(c02t32.unknownFields());
        }
    };
    public List<C02T1> meta_components;

    public C02T3() {
        super(ADAPTER, ByteString.EMPTY);
        this.meta_components = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02T5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
