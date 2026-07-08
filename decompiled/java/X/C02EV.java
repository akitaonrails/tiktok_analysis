package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EV extends Message<C02EV, C02M6> {
    public static final ProtoAdapter<C02EV> ADAPTER = new ProtoAdapter<C02EV>() { // from class: X.026z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EV decode(ProtoReader protoReader) {
            C02EV c02ev = new C02EV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ev.footnote_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02ev.footnote_author_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02ev.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02ev.rate_result = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02ev.source_display = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02ev.source_redirect = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ev;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EV c02ev) {
            C02EV c02ev2 = c02ev;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02ev2.footnote_id) + protoAdapter.encodedSizeWithTag(2, c02ev2.footnote_author_id) + protoAdapter.encodedSizeWithTag(3, c02ev2.title) + ProtoAdapter.INT32.encodedSizeWithTag(4, c02ev2.rate_result) + protoAdapter.encodedSizeWithTag(5, c02ev2.source_display) + protoAdapter.encodedSizeWithTag(6, c02ev2.source_redirect) + c02ev2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02EV c02ev) {
            C02EV c02ev2 = c02ev;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02ev2.footnote_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c02ev2.footnote_author_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c02ev2.title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, c02ev2.rate_result);
            protoAdapter.encodeWithTag(protoWriter, 5, c02ev2.source_display);
            protoAdapter.encodeWithTag(protoWriter, 6, c02ev2.source_redirect);
            protoWriter.writeBytes(c02ev2.unknownFields());
        }
    };
    public String footnote_author_id;
    public String footnote_id;
    public Integer rate_result;
    public String source_display;
    public String source_redirect;
    public String title;

    public C02EV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02M6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
