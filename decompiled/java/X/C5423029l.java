package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.029l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5423029l extends Message<C5423029l, C579502Nt> {
    public static final ProtoAdapter<C5423029l> ADAPTER = new ProtoAdapter<C5423029l>() { // from class: X.024a
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5423029l decode(ProtoReader protoReader) {
            C5423029l c5423029l = new C5423029l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 255) {
                                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                        } else {
                                            c5423029l.da_info.putAll(this.LIZ.decode(protoReader));
                                        }
                                    } else {
                                        c5423029l.bar_scene = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c5423029l.payment_method_token = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c5423029l.payment_method_id = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c5423029l.destination = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c5423029l.content = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5423029l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5423029l c5423029l) {
            C5423029l c5423029l2 = c5423029l;
            int iEncodedSizeWithTag = C5431029t.ADAPTER.encodedSizeWithTag(1, c5423029l2.content);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c5423029l2.destination);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, c5423029l2.payment_method_id) + protoAdapter2.encodedSizeWithTag(4, c5423029l2.payment_method_token) + protoAdapter.encodedSizeWithTag(5, c5423029l2.bar_scene) + this.LIZ.encodedSizeWithTag(255, c5423029l2.da_info) + c5423029l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5423029l c5423029l) {
        }
    };
    public Integer bar_scene;
    public C5431029t content;
    public Map<String, String> da_info;
    public Integer destination;
    public String payment_method_id;
    public String payment_method_token;

    @Override // com.squareup.wire.Message
    public C579502Nt newBuilder() {
        return null;
    }

    public C5423029l() {
        super(ADAPTER, ByteString.EMPTY);
        this.da_info = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
