package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C558602Fs extends Message<C558602Fs, C02LW> {
    public static final ProtoAdapter<C558602Fs> ADAPTER = new ProtoAdapter<C558602Fs>() { // from class: X.027r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C558602Fs decode(ProtoReader protoReader) {
            C558602Fs c558602Fs = new C558602Fs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c558602Fs.source_entity_id = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c558602Fs.platform = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c558602Fs.dsp_entity_id = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c558602Fs.identifier = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c558602Fs;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C558602Fs c558602Fs) {
            C558602Fs c558602Fs2 = c558602Fs;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c558602Fs2.identifier) + protoAdapter.encodedSizeWithTag(2, c558602Fs2.dsp_entity_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, c558602Fs2.platform) + protoAdapter.encodedSizeWithTag(4, c558602Fs2.source_entity_id) + c558602Fs2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C558602Fs c558602Fs) {
            C558602Fs c558602Fs2 = c558602Fs;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c558602Fs2.identifier);
            protoAdapter.encodeWithTag(protoWriter, 2, c558602Fs2.dsp_entity_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c558602Fs2.platform);
            protoAdapter.encodeWithTag(protoWriter, 4, c558602Fs2.source_entity_id);
            protoWriter.writeBytes(c558602Fs2.unknownFields());
        }
    };
    public String dsp_entity_id;
    public String identifier;
    public Integer platform;
    public String source_entity_id;

    public C558602Fs() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
