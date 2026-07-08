package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02R4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02R4 extends Message<C02R4, C02RA> {
    public static final ProtoAdapter<C02R4> ADAPTER = new ProtoAdapter<C02R4>() { // from class: X.02R3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02R4 decode(ProtoReader protoReader) {
            C02R4 c02r4 = new C02R4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02r4.extra_data = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02r4.frequency_config = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02r4.key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02r4.priority = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02r4.render_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02r4.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02r4.track_params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c02r4.ui_config = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02r4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02R4 c02r4) {
            C02R4 c02r42 = c02r4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02r42.extra_data) + protoAdapter.encodedSizeWithTag(2, c02r42.frequency_config) + protoAdapter.encodedSizeWithTag(3, c02r42.key);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c02r42.priority) + protoAdapter2.encodedSizeWithTag(5, c02r42.render_type) + protoAdapter.encodedSizeWithTag(6, c02r42.schema) + protoAdapter.encodedSizeWithTag(7, c02r42.track_params) + protoAdapter.encodedSizeWithTag(8, c02r42.ui_config) + c02r42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02R4 c02r4) {
            C02R4 c02r42 = c02r4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02r42.extra_data);
            protoAdapter.encodeWithTag(protoWriter, 2, c02r42.frequency_config);
            protoAdapter.encodeWithTag(protoWriter, 3, c02r42.key);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 4, c02r42.priority);
            protoAdapter2.encodeWithTag(protoWriter, 5, c02r42.render_type);
            protoAdapter.encodeWithTag(protoWriter, 6, c02r42.schema);
            protoAdapter.encodeWithTag(protoWriter, 7, c02r42.track_params);
            protoAdapter.encodeWithTag(protoWriter, 8, c02r42.ui_config);
            protoWriter.writeBytes(c02r42.unknownFields());
        }
    };
    public String extra_data;
    public String frequency_config;
    public String key;
    public Integer priority;
    public Integer render_type;
    public String schema;
    public String track_params;
    public String ui_config;

    public C02R4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02RA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
