package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02S2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02S2 extends Message<C02S2, C02S3> {
    public static final ProtoAdapter<C02S2> ADAPTER = new ProtoAdapter<C02S2>() { // from class: X.02S1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02S2 decode(ProtoReader protoReader) {
            C02S2 c02s2 = new C02S2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02s2.global_ranked_components.add(C02S0.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02s2.server_base_component_config_hash = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02s2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02S2 c02s2) {
            C02S2 c02s22 = c02s2;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02s22.server_base_component_config_hash) + C02S0.ADAPTER.asRepeated().encodedSizeWithTag(2, c02s22.global_ranked_components) + c02s22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02S2 c02s2) {
            C02S2 c02s22 = c02s2;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02s22.server_base_component_config_hash);
            C02S0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02s22.global_ranked_components);
            protoWriter.writeBytes(c02s22.unknownFields());
        }
    };
    public List<C02S0> global_ranked_components;
    public String server_base_component_config_hash;

    public C02S2() {
        super(ADAPTER, ByteString.EMPTY);
        this.global_ranked_components = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02S3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
