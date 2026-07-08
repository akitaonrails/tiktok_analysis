package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AS, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AS extends Message<C02AS, C584702Pt> {
    public static final ProtoAdapter<C02AS> ADAPTER = new ProtoAdapter<C02AS>() { // from class: X.02AR
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AS decode(ProtoReader protoReader) {
            C02AS c02as = new C02AS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        switch (iNextTag) {
                            case 1:
                                c02as.logistic_area = C026Y.ADAPTER.decode(protoReader);
                                break;
                            case 2:
                                c02as.appendix_area = C683202la.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c02as.show_selection_bar = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case 4:
                                c02as.selection_bars.add(C02AQ.ADAPTER.decode(protoReader));
                                break;
                            case 5:
                                c02as.logistics_service_module = C697202nq.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c02as.logistics_provider_module = C697202nq.ADAPTER.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c02as.da_info.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02as;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AS c02as) {
            C02AS c02as2 = c02as;
            int iEncodedSizeWithTag = C026Y.ADAPTER.encodedSizeWithTag(1, c02as2.logistic_area) + C683202la.ADAPTER.encodedSizeWithTag(2, c02as2.appendix_area) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c02as2.show_selection_bar) + C02AQ.ADAPTER.asRepeated().encodedSizeWithTag(4, c02as2.selection_bars);
            ProtoAdapter<C697202nq> protoAdapter = C697202nq.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, c02as2.logistics_service_module) + protoAdapter.encodedSizeWithTag(6, c02as2.logistics_provider_module) + this.LIZ.encodedSizeWithTag(100, c02as2.da_info) + c02as2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02AS c02as) {
        }
    };
    public C683202la appendix_area;
    public Map<String, String> da_info;
    public C026Y logistic_area;
    public C697202nq logistics_provider_module;
    public C697202nq logistics_service_module;
    public List<C02AQ> selection_bars;
    public Boolean show_selection_bar;

    @Override // com.squareup.wire.Message
    public C584702Pt newBuilder() {
        return null;
    }

    public C02AS() {
        super(ADAPTER, ByteString.EMPTY);
        this.selection_bars = C1516540pZE.LJIIIIZZ();
        this.da_info = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
