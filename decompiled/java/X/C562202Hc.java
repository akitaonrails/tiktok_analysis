package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C562202Hc extends Message<C562202Hc, C02JA> {
    public static final ProtoAdapter<C562202Hc> ADAPTER = new ProtoAdapter<C562202Hc>() { // from class: X.02Ha
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C562202Hc decode(ProtoReader protoReader) {
            C562202Hc c562202Hc = new C562202Hc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c562202Hc.timing_keys.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c562202Hc.events.add(C562502Hf.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c562202Hc.key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c562202Hc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C562202Hc c562202Hc) {
            C562202Hc c562202Hc2 = c562202Hc;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c562202Hc2.key) + C562502Hf.ADAPTER.asRepeated().encodedSizeWithTag(2, c562202Hc2.events) + protoAdapter.asRepeated().encodedSizeWithTag(3, c562202Hc2.timing_keys) + c562202Hc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C562202Hc c562202Hc) {
            C562202Hc c562202Hc2 = c562202Hc;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c562202Hc2.key);
            C562502Hf.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c562202Hc2.events);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c562202Hc2.timing_keys);
            protoWriter.writeBytes(c562202Hc2.unknownFields());
        }
    };
    public List<C562502Hf> events;
    public String key;
    public List<String> timing_keys;

    public C562202Hc() {
        super(ADAPTER, ByteString.EMPTY);
        this.events = C1516540pZE.LJIIIIZZ();
        this.timing_keys = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02JA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
