package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CO extends Message<C02CO, C02K9> {
    public static final ProtoAdapter<C02CO> ADAPTER = new ProtoAdapter<C02CO>() { // from class: X.025r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CO decode(ProtoReader protoReader) {
            C02CO c02co = new C02CO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02co.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c02co.display = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02co.button_icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02co.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02co.event_keyword_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c02co.event_keyword = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02co.event_tracking_param = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02co;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CO c02co) {
            C02CO c02co2 = c02co;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02co2.icon_url);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02co2.display) + protoAdapter.encodedSizeWithTag(3, c02co2.button_icon_url) + protoAdapter2.encodedSizeWithTag(4, c02co2.schema) + ProtoAdapter.INT64.encodedSizeWithTag(5, c02co2.event_keyword_id) + protoAdapter2.encodedSizeWithTag(6, c02co2.event_keyword) + protoAdapter2.encodedSizeWithTag(7, c02co2.event_tracking_param) + c02co2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CO c02co) {
            C02CO c02co2 = c02co;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c02co2.icon_url);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02co2.display);
            protoAdapter.encodeWithTag(protoWriter, 3, c02co2.button_icon_url);
            protoAdapter2.encodeWithTag(protoWriter, 4, c02co2.schema);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, c02co2.event_keyword_id);
            protoAdapter2.encodeWithTag(protoWriter, 6, c02co2.event_keyword);
            protoAdapter2.encodeWithTag(protoWriter, 7, c02co2.event_tracking_param);
            protoWriter.writeBytes(c02co2.unknownFields());
        }
    };
    public C673002jw button_icon_url;
    public String display;
    public String event_keyword;
    public Long event_keyword_id;
    public String event_tracking_param;
    public C673002jw icon_url;
    public String schema;

    public C02CO() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02K9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
