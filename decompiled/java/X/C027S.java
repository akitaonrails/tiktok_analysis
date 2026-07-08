package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027S, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027S extends Message<C027S, C02IK> {
    public static final ProtoAdapter<C027S> ADAPTER = new ProtoAdapter<C027S>() { // from class: X.023d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027S decode(ProtoReader protoReader) {
            C027S c027s = new C027S();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027s.global_show_limit = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c027s.disable_components.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            c027s.reranked_components.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            c027s.show_info_reset_components.add(C02S0.ADAPTER.decode(protoReader));
                            break;
                        case 5:
                            c027s.final_filter_components.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c027s.server_event_tracking_extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c027s.component_preload_configs.add(C560002Gg.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            c027s.container_strategy = C549402Ce.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027s;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027S c027s) {
            C027S c027s2 = c027s;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c027s2.global_show_limit);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(2, c027s2.disable_components) + protoAdapter.asRepeated().encodedSizeWithTag(3, c027s2.reranked_components) + C02S0.ADAPTER.asRepeated().encodedSizeWithTag(4, c027s2.show_info_reset_components) + protoAdapter.asRepeated().encodedSizeWithTag(5, c027s2.final_filter_components) + protoAdapter.encodedSizeWithTag(6, c027s2.server_event_tracking_extra) + C560002Gg.ADAPTER.asRepeated().encodedSizeWithTag(7, c027s2.component_preload_configs) + C549402Ce.ADAPTER.encodedSizeWithTag(8, c027s2.container_strategy) + c027s2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C027S c027s) {
            C027S c027s2 = c027s;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c027s2.global_show_limit);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c027s2.disable_components);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c027s2.reranked_components);
            C02S0.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, c027s2.show_info_reset_components);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, c027s2.final_filter_components);
            protoAdapter.encodeWithTag(protoWriter, 6, c027s2.server_event_tracking_extra);
            C560002Gg.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, c027s2.component_preload_configs);
            C549402Ce.ADAPTER.encodeWithTag(protoWriter, 8, c027s2.container_strategy);
            protoWriter.writeBytes(c027s2.unknownFields());
        }
    };
    public List<C560002Gg> component_preload_configs;
    public C549402Ce container_strategy;
    public List<String> disable_components;
    public List<String> final_filter_components;
    public Integer global_show_limit;
    public List<String> reranked_components;
    public String server_event_tracking_extra;
    public List<C02S0> show_info_reset_components;

    public C027S() {
        super(ADAPTER, ByteString.EMPTY);
        this.disable_components = C1516540pZE.LJIIIIZZ();
        this.reranked_components = C1516540pZE.LJIIIIZZ();
        this.show_info_reset_components = C1516540pZE.LJIIIIZZ();
        this.final_filter_components = C1516540pZE.LJIIIIZZ();
        this.component_preload_configs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
