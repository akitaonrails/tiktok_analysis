package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C594402Tm extends Message<C594402Tm, C594502Tn> {
    public static final ProtoAdapter<C594402Tm> ADAPTER = new ProtoAdapter<C594402Tm>() { // from class: X.02Tl
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C594402Tm decode(ProtoReader protoReader) {
            C594402Tm c594402Tm = new C594402Tm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c594402Tm.additional_info.putAll(this.LIZ.decode(protoReader));
                                    }
                                } else {
                                    c594402Tm.action_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c594402Tm.action_type = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c594402Tm.bnpl_upgrade_rich_text = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c594402Tm.bnpl_upgrade_entrance_schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c594402Tm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C594402Tm c594402Tm) {
            C594402Tm c594402Tm2 = c594402Tm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c594402Tm2.bnpl_upgrade_entrance_schema) + C5431029t.ADAPTER.encodedSizeWithTag(2, c594402Tm2.bnpl_upgrade_rich_text) + protoAdapter.encodedSizeWithTag(3, c594402Tm2.action_type) + protoAdapter.encodedSizeWithTag(4, c594402Tm2.action_url) + this.LIZ.encodedSizeWithTag(5, c594402Tm2.additional_info) + c594402Tm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C594402Tm c594402Tm) {
        }
    };
    public String action_type;
    public String action_url;
    public Map<String, String> additional_info;
    public String bnpl_upgrade_entrance_schema;
    public C5431029t bnpl_upgrade_rich_text;

    @Override // com.squareup.wire.Message
    public C594502Tn newBuilder() {
        return null;
    }

    public C594402Tm() {
        super(ADAPTER, ByteString.EMPTY);
        this.additional_info = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
