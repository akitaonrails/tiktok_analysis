package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C547602Bm extends Message<C547602Bm, C575202Mc> {
    public static final ProtoAdapter<C547602Bm> ADAPTER = new ProtoAdapter<C547602Bm>() { // from class: X.026Q
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C547602Bm decode(ProtoReader protoReader) {
            C547602Bm c547602Bm = new C547602Bm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 5) {
                                    if (iNextTag != 6) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c547602Bm.error_key_params.putAll(this.LIZ.decode(protoReader));
                                    }
                                } else {
                                    c547602Bm.error_msg = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c547602Bm.error_key = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c547602Bm.value = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c547602Bm.type = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c547602Bm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C547602Bm c547602Bm) {
            C547602Bm c547602Bm2 = c547602Bm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c547602Bm2.type) + protoAdapter.encodedSizeWithTag(2, c547602Bm2.value) + protoAdapter.encodedSizeWithTag(3, c547602Bm2.error_key) + protoAdapter.encodedSizeWithTag(5, c547602Bm2.error_msg) + this.LIZ.encodedSizeWithTag(6, c547602Bm2.error_key_params) + c547602Bm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C547602Bm c547602Bm) {
        }
    };
    public String error_key;
    public Map<String, String> error_key_params;
    public String error_msg;
    public String type;
    public String value;

    @Override // com.squareup.wire.Message
    public C575202Mc newBuilder() {
        return null;
    }

    public C547602Bm() {
        super(ADAPTER, ByteString.EMPTY);
        this.error_key_params = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
