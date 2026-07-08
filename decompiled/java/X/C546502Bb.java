package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C546502Bb extends Message<C546502Bb, C574602Lw> {
    public static final ProtoAdapter<C546502Bb> ADAPTER = new ProtoAdapter<C546502Bb>() { // from class: X.025j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C546502Bb decode(ProtoReader protoReader) {
            C546502Bb c546502Bb = new C546502Bb();
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
                                        c546502Bb.timing_keys.add(ProtoAdapter.STRING.decode(protoReader));
                                    }
                                } else {
                                    c546502Bb.delay_ms = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c546502Bb.blacklist_component_keys.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c546502Bb.whitelist_component_keys.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c546502Bb.container_key = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c546502Bb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C546502Bb c546502Bb) {
            C546502Bb c546502Bb2 = c546502Bb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c546502Bb2.container_key) + protoAdapter.asRepeated().encodedSizeWithTag(2, c546502Bb2.whitelist_component_keys) + protoAdapter.asRepeated().encodedSizeWithTag(3, c546502Bb2.blacklist_component_keys) + ProtoAdapter.INT64.encodedSizeWithTag(4, c546502Bb2.delay_ms) + protoAdapter.asRepeated().encodedSizeWithTag(5, c546502Bb2.timing_keys) + c546502Bb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C546502Bb c546502Bb) {
            C546502Bb c546502Bb2 = c546502Bb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c546502Bb2.container_key);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c546502Bb2.whitelist_component_keys);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, c546502Bb2.blacklist_component_keys);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, c546502Bb2.delay_ms);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, c546502Bb2.timing_keys);
            protoWriter.writeBytes(c546502Bb2.unknownFields());
        }
    };
    public List<String> blacklist_component_keys;
    public String container_key;
    public Long delay_ms;
    public List<String> timing_keys;
    public List<String> whitelist_component_keys;

    public C546502Bb() {
        super(ADAPTER, ByteString.EMPTY);
        this.whitelist_component_keys = C1516540pZE.LJIIIIZZ();
        this.blacklist_component_keys = C1516540pZE.LJIIIIZZ();
        this.timing_keys = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C574602Lw newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
