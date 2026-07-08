package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02BZ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02BZ extends Message<C02BZ, C573402Lk> {
    public static final ProtoAdapter<C02BZ> ADAPTER = new ProtoAdapter<C02BZ>() { // from class: X.025i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02BZ decode(ProtoReader protoReader) {
            C02BZ c02bz = new C02BZ();
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
                                        c02bz.timing_keys.add(ProtoAdapter.STRING.decode(protoReader));
                                    }
                                } else {
                                    c02bz.delay_ms = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c02bz.blacklist_component_keys.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c02bz.whitelist_component_keys.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c02bz.container_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02bz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02BZ c02bz) {
            C02BZ c02bz2 = c02bz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02bz2.container_key) + protoAdapter.asRepeated().encodedSizeWithTag(2, c02bz2.whitelist_component_keys) + protoAdapter.asRepeated().encodedSizeWithTag(3, c02bz2.blacklist_component_keys) + ProtoAdapter.INT64.encodedSizeWithTag(4, c02bz2.delay_ms) + protoAdapter.asRepeated().encodedSizeWithTag(5, c02bz2.timing_keys) + c02bz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02BZ c02bz) {
            C02BZ c02bz2 = c02bz;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02bz2.container_key);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c02bz2.whitelist_component_keys);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c02bz2.blacklist_component_keys);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c02bz2.delay_ms);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, c02bz2.timing_keys);
            protoWriter.writeBytes(c02bz2.unknownFields());
        }
    };
    public List<String> blacklist_component_keys;
    public String container_key;
    public Long delay_ms;
    public List<String> timing_keys;
    public List<String> whitelist_component_keys;

    public C02BZ() {
        super(ADAPTER, ByteString.EMPTY);
        this.whitelist_component_keys = C1516540pZE.LJIIIIZZ();
        this.blacklist_component_keys = C1516540pZE.LJIIIIZZ();
        this.timing_keys = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C573402Lk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
