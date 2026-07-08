package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C603002Wu extends Message<C603002Wu, C603402Wy> {
    public static final ProtoAdapter<C603002Wu> ADAPTER = new ProtoAdapter<C603002Wu>() { // from class: X.02Wt
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C603002Wu decode(ProtoReader protoReader) {
            C603002Wu c603002Wu = new C603002Wu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c603002Wu.value_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c603002Wu.is_current_selection = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c603002Wu.pdp_jump_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c603002Wu.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c603002Wu.module_da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c603002Wu.product_da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c603002Wu.event_tracking_trigger_keys.putAll(this.LIZ.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c603002Wu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C603002Wu c603002Wu) {
            C603002Wu c603002Wu2 = c603002Wu;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c603002Wu2.value_name) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c603002Wu2.is_current_selection) + protoAdapter.encodedSizeWithTag(3, c603002Wu2.pdp_jump_schema) + protoAdapter.encodedSizeWithTag(4, c603002Wu2.da_info) + protoAdapter.encodedSizeWithTag(5, c603002Wu2.module_da_info) + protoAdapter.encodedSizeWithTag(6, c603002Wu2.product_da_info) + this.LIZ.encodedSizeWithTag(7, c603002Wu2.event_tracking_trigger_keys) + c603002Wu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C603002Wu c603002Wu) {
        }
    };
    public String da_info;
    public Map<String, String> event_tracking_trigger_keys;
    public Boolean is_current_selection;
    public String module_da_info;
    public String pdp_jump_schema;
    public String product_da_info;
    public String value_name;

    @Override // com.squareup.wire.Message
    public C603402Wy newBuilder() {
        return null;
    }

    public C603002Wu() {
        super(ADAPTER, ByteString.EMPTY);
        this.event_tracking_trigger_keys = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
