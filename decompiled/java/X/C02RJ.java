package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02RJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02RJ extends Message<C02RJ, C02RK> {
    public static final ProtoAdapter<C02RJ> ADAPTER = new ProtoAdapter<C02RJ>() { // from class: X.02RI
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, String>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02RJ decode(ProtoReader protoReader) {
            C02RJ c02rj = new C02RJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02rj.chain_param.putAll(this.LIZIZ.decode(protoReader));
                        }
                    } else {
                        c02rj.track_param.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02rj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02RJ c02rj) {
            C02RJ c02rj2 = c02rj;
            return this.LIZ.encodedSizeWithTag(1, c02rj2.track_param) + this.LIZIZ.encodedSizeWithTag(2, c02rj2.chain_param) + c02rj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02RJ c02rj) {
        }
    };
    public Map<String, String> chain_param;
    public Map<String, String> track_param;

    @Override // com.squareup.wire.Message
    public C02RK newBuilder() {
        return null;
    }

    public C02RJ() {
        super(ADAPTER, ByteString.EMPTY);
        this.track_param = new LinkedHashMap();
        this.chain_param = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
