package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227751CHd extends Message<C2227751CHd, C2227761CHe> {
    public static final ProtoAdapter<C2227751CHd> ADAPTER = new ProtoAdapter<C2227751CHd>() { // from class: X.1CHc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227751CHd decode(ProtoReader protoReader) {
            C2227751CHd c2227751CHd = new C2227751CHd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2227751CHd.refer = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2227751CHd.web_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2227751CHd.template_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2227751CHd.open_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c2227751CHd.button_info = C2227721CHa.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2227751CHd.web_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227751CHd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227751CHd c2227751CHd) {
            C2227751CHd c2227751CHd2 = c2227751CHd;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2227751CHd2.refer) + protoAdapter.encodedSizeWithTag(2, c2227751CHd2.web_title) + ProtoAdapter.INT32.encodedSizeWithTag(3, c2227751CHd2.template_type) + protoAdapter.encodedSizeWithTag(4, c2227751CHd2.open_url) + C2227721CHa.ADAPTER.encodedSizeWithTag(5, c2227751CHd2.button_info) + protoAdapter.encodedSizeWithTag(6, c2227751CHd2.web_url) + c2227751CHd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227751CHd c2227751CHd) {
            C2227751CHd c2227751CHd2 = c2227751CHd;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2227751CHd2.refer);
            protoAdapter.encodeWithTag(protoWriter, 2, c2227751CHd2.web_title);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, c2227751CHd2.template_type);
            protoAdapter.encodeWithTag(protoWriter, 4, c2227751CHd2.open_url);
            C2227721CHa.ADAPTER.encodeWithTag(protoWriter, 5, c2227751CHd2.button_info);
            protoAdapter.encodeWithTag(protoWriter, 6, c2227751CHd2.web_url);
            protoWriter.writeBytes(c2227751CHd2.unknownFields());
        }
    };
    public C2227721CHa button_info;
    public String open_url;
    public String refer;
    public Integer template_type;
    public String web_title;
    public String web_url;

    public C2227751CHd() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2227761CHe newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
