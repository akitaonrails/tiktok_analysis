package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02UV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02UV extends Message<C02UV, C02UW> {
    public static final ProtoAdapter<C02UV> ADAPTER = new ProtoAdapter<C02UV>() { // from class: X.02UU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02UV decode(ProtoReader protoReader) {
            C02UV c02uv = new C02UV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02uv.source_url = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02uv.name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02uv.id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02uv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02UV c02uv) {
            C02UV c02uv2 = c02uv;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c02uv2.id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02uv2.name) + C673002jw.ADAPTER.encodedSizeWithTag(3, c02uv2.source_url) + c02uv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02UV c02uv) {
            C02UV c02uv2 = c02uv;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c02uv2.id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c02uv2.name);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c02uv2.source_url);
            protoWriter.writeBytes(c02uv2.unknownFields());
        }
    };
    public Long id;
    public String name;
    public C673002jw source_url;

    public C02UV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02UW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
