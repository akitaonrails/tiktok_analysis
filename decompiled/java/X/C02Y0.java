package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Y0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02Y0 extends Message<C02Y0, C02Y1> {
    public static final ProtoAdapter<C02Y0> ADAPTER = new ProtoAdapter<C02Y0>() { // from class: X.02Xz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02Y0 decode(ProtoReader protoReader) {
            C02Y0 c02y0 = new C02Y0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02y0.url = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02y0.uri = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02y0.language = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02y0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02Y0 c02y0) {
            C02Y0 c02y02 = c02y0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02y02.language) + protoAdapter.encodedSizeWithTag(2, c02y02.uri) + C673002jw.ADAPTER.encodedSizeWithTag(3, c02y02.url) + c02y02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02Y0 c02y0) {
            C02Y0 c02y02 = c02y0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02y02.language);
            protoAdapter.encodeWithTag(protoWriter, 2, c02y02.uri);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c02y02.url);
            protoWriter.writeBytes(c02y02.unknownFields());
        }
    };
    public String language;
    public String uri;
    public C673002jw url;

    public C02Y0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Y1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
