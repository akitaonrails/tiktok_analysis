package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.023M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C023M extends Message<C023M, C02MX> {
    public static final ProtoAdapter<C023M> ADAPTER = new ProtoAdapter<C023M>() { // from class: X.0228
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C023M decode(ProtoReader protoReader) {
            C023M c023m = new C023M();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c023m.position = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c023m.scene = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c023m.type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c023m.pmid_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            c023m.priority = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c023m.frequency_limit_list.add(C02FY.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c023m.experiment_list.add(C02H8.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            c023m.payload_template = C02GN.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c023m.effective_time_list.add(C560802Go.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c023m.params.putAll(this.LIZ.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c023m.group = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c023m;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C023M c023m) {
            C023M c023m2 = c023m;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c023m2.position) + protoAdapter.encodedSizeWithTag(2, c023m2.scene) + protoAdapter.encodedSizeWithTag(3, c023m2.type) + protoAdapter.asRepeated().encodedSizeWithTag(4, c023m2.pmid_list) + ProtoAdapter.INT32.encodedSizeWithTag(5, c023m2.priority) + C02FY.ADAPTER.asRepeated().encodedSizeWithTag(6, c023m2.frequency_limit_list) + C02H8.ADAPTER.asRepeated().encodedSizeWithTag(7, c023m2.experiment_list) + C02GN.ADAPTER.encodedSizeWithTag(8, c023m2.payload_template) + C560802Go.ADAPTER.asRepeated().encodedSizeWithTag(9, c023m2.effective_time_list) + this.LIZ.encodedSizeWithTag(10, c023m2.params) + protoAdapter.encodedSizeWithTag(11, c023m2.group) + c023m2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C023M c023m) {
        }
    };
    public List<C560802Go> effective_time_list;
    public List<C02H8> experiment_list;
    public List<C02FY> frequency_limit_list;
    public String group;
    public Map<String, String> params;
    public C02GN payload_template;
    public List<String> pmid_list;
    public String position;
    public Integer priority;
    public String scene;
    public String type;

    @Override // com.squareup.wire.Message
    public C02MX newBuilder() {
        return null;
    }

    public C023M() {
        super(ADAPTER, ByteString.EMPTY);
        this.pmid_list = C1516540pZE.LJIIIIZZ();
        this.frequency_limit_list = C1516540pZE.LJIIIIZZ();
        this.experiment_list = C1516540pZE.LJIIIIZZ();
        this.effective_time_list = C1516540pZE.LJIIIIZZ();
        this.params = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
