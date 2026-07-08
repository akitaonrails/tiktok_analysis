package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02V3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02V3 extends Message<C02V3, C02V4> {
    public static final ProtoAdapter<C02V3> ADAPTER = new ProtoAdapter<C02V3>() { // from class: X.02V2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02V3 decode(ProtoReader protoReader) {
            C02V3 c02v3 = new C02V3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02v3.icon = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02v3.link = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02v3.keyword = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02v3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02V3 c02v3) {
            C02V3 c02v32 = c02v3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02v32.keyword) + protoAdapter.encodedSizeWithTag(2, c02v32.link) + C673002jw.ADAPTER.encodedSizeWithTag(3, c02v32.icon) + c02v32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02V3 c02v3) {
            C02V3 c02v32 = c02v3;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02v32.keyword);
            protoAdapter.encodeWithTag(protoWriter, 2, c02v32.link);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c02v32.icon);
            protoWriter.writeBytes(c02v32.unknownFields());
        }
    };
    public C673002jw icon;
    public String keyword;
    public String link;

    public C02V3() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02V4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
