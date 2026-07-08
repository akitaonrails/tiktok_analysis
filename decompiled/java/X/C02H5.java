package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02H5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02H5 extends Message<C02H5, C567902Jh> {
    public static final ProtoAdapter<C02H5> ADAPTER = new ProtoAdapter<C02H5>() { // from class: X.02A9
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02H5 decode(ProtoReader protoReader) {
            C02H5 c02h5 = new C02H5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02h5.text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02h5.detail = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02h5.recommend_reason = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02h5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02H5 c02h5) {
            C02H5 c02h52 = c02h5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02h52.recommend_reason) + protoAdapter.encodedSizeWithTag(2, c02h52.detail) + protoAdapter.encodedSizeWithTag(3, c02h52.text) + c02h52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02H5 c02h5) {
            C02H5 c02h52 = c02h5;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02h52.recommend_reason);
            protoAdapter.encodeWithTag(protoWriter, 2, c02h52.detail);
            protoAdapter.encodeWithTag(protoWriter, 3, c02h52.text);
            protoWriter.writeBytes(c02h52.unknownFields());
        }
    };
    public String detail;
    public String recommend_reason;
    public String text;

    public C02H5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C567902Jh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
