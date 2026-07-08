package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C594002Ti extends Message<C594002Ti, C594102Tj> {
    public static final ProtoAdapter<C594002Ti> ADAPTER = new ProtoAdapter<C594002Ti>() { // from class: X.02Th
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C594002Ti decode(ProtoReader protoReader) {
            C594002Ti c594002Ti = new C594002Ti();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c594002Ti.is_fully_selected = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c594002Ti.default_pre_select_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c594002Ti.selected_props.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c594002Ti;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C594002Ti c594002Ti) {
            C594002Ti c594002Ti2 = c594002Ti;
            return this.LIZ.encodedSizeWithTag(1, c594002Ti2.selected_props) + ProtoAdapter.INT32.encodedSizeWithTag(2, c594002Ti2.default_pre_select_type) + ProtoAdapter.BOOL.encodedSizeWithTag(3, c594002Ti2.is_fully_selected) + c594002Ti2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C594002Ti c594002Ti) {
        }
    };
    public Integer default_pre_select_type;
    public Boolean is_fully_selected;
    public Map<String, String> selected_props;

    @Override // com.squareup.wire.Message
    public C594102Tj newBuilder() {
        return null;
    }

    public C594002Ti() {
        super(ADAPTER, ByteString.EMPTY);
        this.selected_props = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
