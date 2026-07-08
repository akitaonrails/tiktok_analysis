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

/* JADX INFO: renamed from: X.1CAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2226141CAy extends Message<C2226141CAy, C2226151CAz> {
    public static final ProtoAdapter<C2226141CAy> ADAPTER = new ProtoAdapter<C2226141CAy>() { // from class: X.1CAx
        public final ProtoAdapter<Map<Integer, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.STRING);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2226141CAy decode(ProtoReader protoReader) {
            C2226141CAy c2226141CAy = new C2226141CAy();
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
                                            c2226141CAy.da_info = ProtoAdapter.STRING.decode(protoReader);
                                        }
                                    } else {
                                        c2226141CAy.request_passthrough_map = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c2226141CAy.transparent_fields.putAll(this.LIZ.decode(protoReader));
                                }
                            } else {
                                c2226141CAy.next_request_scene.add(C590802Sc.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c2226141CAy.next_pop_up = C2226051CAp.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2226141CAy.voucher_info = C1CB7.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226141CAy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2226141CAy c2226141CAy) {
            C2226141CAy c2226141CAy2 = c2226141CAy;
            int iEncodedSizeWithTag = C1CB7.ADAPTER.encodedSizeWithTag(1, c2226141CAy2.voucher_info) + C2226051CAp.ADAPTER.encodedSizeWithTag(2, c2226141CAy2.next_pop_up) + C590802Sc.ADAPTER.asRepeated().encodedSizeWithTag(3, c2226141CAy2.next_request_scene) + this.LIZ.encodedSizeWithTag(4, c2226141CAy2.transparent_fields);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, c2226141CAy2.request_passthrough_map) + protoAdapter.encodedSizeWithTag(255, c2226141CAy2.da_info) + c2226141CAy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2226141CAy c2226141CAy) {
        }
    };
    public String da_info;
    public C2226051CAp next_pop_up;
    public List<C590802Sc> next_request_scene;
    public String request_passthrough_map;
    public Map<Integer, String> transparent_fields;
    public C1CB7 voucher_info;

    @Override // com.squareup.wire.Message
    public C2226151CAz newBuilder() {
        return null;
    }

    public C2226141CAy() {
        super(ADAPTER, ByteString.EMPTY);
        this.next_request_scene = C1516540pZE.LJIIIIZZ();
        this.transparent_fields = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
