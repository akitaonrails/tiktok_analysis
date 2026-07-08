package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02D3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02D3 extends Message<C02D3, C586402Qk> {
    public static final ProtoAdapter<C02D3> ADAPTER = new ProtoAdapter<C02D3>() { // from class: X.027F
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02D3 decode(ProtoReader protoReader) {
            C02D3 c02d3 = new C02D3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02d3.title = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c02d3.content = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02d3.background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02d3.background_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02d3.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02d3.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02d3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02D3 c02d3) {
            C02D3 c02d32 = c02d3;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02d32.title) + protoAdapter.encodedSizeWithTag(2, c02d32.content);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02d32.background_color) + protoAdapter2.encodedSizeWithTag(4, c02d32.background_dark_color) + protoAdapter2.encodedSizeWithTag(5, c02d32.schema) + ProtoAdapter.INT32.encodedSizeWithTag(6, c02d32.type) + c02d32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02D3 c02d3) {
        }
    };
    public String background_color;
    public String background_dark_color;
    public C5431029t content;
    public String schema;
    public C5431029t title;
    public Integer type;

    public C02D3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C586402Qk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
