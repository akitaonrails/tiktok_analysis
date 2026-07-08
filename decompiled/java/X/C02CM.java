package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CM extends Message<C02CM, C02IE> {
    public static final ProtoAdapter<C02CM> ADAPTER = new ProtoAdapter<C02CM>() { // from class: X.025o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CM decode(ProtoReader protoReader) {
            C02CM c02cm = new C02CM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cm.vote = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c02cm.warn = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c02cm.risk_sink = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c02cm.type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02cm.content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02cm.notice = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c02cm.url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CM c02cm) {
            C02CM c02cm2 = c02cm;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02cm2.vote) + protoAdapter.encodedSizeWithTag(2, c02cm2.warn) + protoAdapter.encodedSizeWithTag(3, c02cm2.risk_sink) + ProtoAdapter.INT32.encodedSizeWithTag(4, c02cm2.type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c02cm2.content) + protoAdapter.encodedSizeWithTag(6, c02cm2.notice) + protoAdapter2.encodedSizeWithTag(7, c02cm2.url) + c02cm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CM c02cm) {
            C02CM c02cm2 = c02cm;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, c02cm2.vote);
            protoAdapter.encodeWithTag(protoWriter, 2, c02cm2.warn);
            protoAdapter.encodeWithTag(protoWriter, 3, c02cm2.risk_sink);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c02cm2.type);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 5, c02cm2.content);
            protoAdapter.encodeWithTag(protoWriter, 6, c02cm2.notice);
            protoAdapter2.encodeWithTag(protoWriter, 7, c02cm2.url);
            protoWriter.writeBytes(c02cm2.unknownFields());
        }
    };
    public String content;
    public Boolean notice;
    public Boolean risk_sink;
    public Integer type;
    public String url;
    public Boolean vote;
    public Boolean warn;

    public C02CM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
