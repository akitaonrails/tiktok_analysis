package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ZE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02ZE extends Message<C02ZE, C02ZF> {
    public static final ProtoAdapter<C02ZE> ADAPTER = new ProtoAdapter<C02ZE>() { // from class: X.02ZD
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02ZE decode(ProtoReader protoReader) {
            C02ZE c02ze = new C02ZE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02ze.rec_metrics.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c02ze.enabled = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ze;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02ZE c02ze) {
            C02ZE c02ze2 = c02ze;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c02ze2.enabled) + this.LIZ.encodedSizeWithTag(2, c02ze2.rec_metrics) + c02ze2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02ZE c02ze) {
            C02ZE c02ze2 = c02ze;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02ze2.enabled);
            this.LIZ.encodeWithTag(protoWriter, 2, c02ze2.rec_metrics);
            protoWriter.writeBytes(c02ze2.unknownFields());
        }
    };
    public Boolean enabled;
    public Map<String, String> rec_metrics;

    @Override // com.squareup.wire.Message
    public C02ZF newBuilder() {
        return null;
    }

    public C02ZE() {
        super(ADAPTER, ByteString.EMPTY);
        this.rec_metrics = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
