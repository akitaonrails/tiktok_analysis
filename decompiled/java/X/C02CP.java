package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CP extends Message<C02CP, C02KN> {
    public static final ProtoAdapter<C02CP> ADAPTER = new ProtoAdapter<C02CP>() { // from class: X.025s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CP decode(ProtoReader protoReader) {
            C02CP c02cp = new C02CP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cp.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c02cp.display = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02cp.button_icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02cp.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02cp.event_keyword_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c02cp.event_keyword = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02cp.event_tracking_param = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CP c02cp) {
            C02CP c02cp2 = c02cp;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02cp2.icon_url);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02cp2.display) + protoAdapter.encodedSizeWithTag(3, c02cp2.button_icon_url) + protoAdapter2.encodedSizeWithTag(4, c02cp2.schema) + ProtoAdapter.INT64.encodedSizeWithTag(5, c02cp2.event_keyword_id) + protoAdapter2.encodedSizeWithTag(6, c02cp2.event_keyword) + protoAdapter2.encodedSizeWithTag(7, c02cp2.event_tracking_param) + c02cp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CP c02cp) {
            C02CP c02cp2 = c02cp;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c02cp2.icon_url);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02cp2.display);
            protoAdapter.encodeWithTag(protoWriter, 3, c02cp2.button_icon_url);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02cp2.schema);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c02cp2.event_keyword_id);
            protoAdapter2.encodeWithTag(protoWriter, 6, c02cp2.event_keyword);
            protoAdapter2.encodeWithTag(protoWriter, 7, c02cp2.event_tracking_param);
            protoWriter.writeBytes(c02cp2.unknownFields());
        }
    };
    public C673002jw button_icon_url;
    public String display;
    public String event_keyword;
    public Long event_keyword_id;
    public String event_tracking_param;
    public C673002jw icon_url;
    public String schema;

    public C02CP() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02KN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
