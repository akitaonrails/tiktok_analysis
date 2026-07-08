package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227781CHg extends Message<C2227781CHg, C2227791CHh> {
    public static final ProtoAdapter<C2227781CHg> ADAPTER = new ProtoAdapter<C2227781CHg>() { // from class: X.1CHf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227781CHg decode(ProtoReader protoReader) {
            C2227781CHg c2227781CHg = new C2227781CHg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2227781CHg.web_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2227781CHg.type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2227781CHg.lynx_raw_data = C2227751CHd.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c2227781CHg.template_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2227781CHg.show_button_seconds = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c2227781CHg.position = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c2227781CHg.button_style = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227781CHg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227781CHg c2227781CHg) {
            C2227781CHg c2227781CHg2 = c2227781CHg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2227781CHg2.web_url) + protoAdapter.encodedSizeWithTag(2, c2227781CHg2.type) + C2227751CHd.ADAPTER.encodedSizeWithTag(3, c2227781CHg2.lynx_raw_data) + protoAdapter.encodedSizeWithTag(4, c2227781CHg2.template_url);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, c2227781CHg2.show_button_seconds) + protoAdapter2.encodedSizeWithTag(6, c2227781CHg2.position) + ProtoAdapter.INT64.encodedSizeWithTag(7, c2227781CHg2.button_style) + c2227781CHg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227781CHg c2227781CHg) {
            C2227781CHg c2227781CHg2 = c2227781CHg;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2227781CHg2.web_url);
            protoAdapter.encodeWithTag(protoWriter, 2, c2227781CHg2.type);
            C2227751CHd.ADAPTER.encodeWithTag(protoWriter, 3, c2227781CHg2.lynx_raw_data);
            protoAdapter.encodeWithTag(protoWriter, 4, c2227781CHg2.template_url);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 5, c2227781CHg2.show_button_seconds);
            protoAdapter2.encodeWithTag(protoWriter, 6, c2227781CHg2.position);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, c2227781CHg2.button_style);
            protoWriter.writeBytes(c2227781CHg2.unknownFields());
        }
    };
    public Long button_style;
    public C2227751CHd lynx_raw_data;
    public Integer position;
    public Integer show_button_seconds;
    public String template_url;
    public String type;
    public String web_url;

    public C2227781CHg() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2227791CHh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
