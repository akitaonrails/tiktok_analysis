package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CJ extends Message<C02CJ, C02MQ> {
    public static final ProtoAdapter<C02CJ> ADAPTER = new ProtoAdapter<C02CJ>() { // from class: X.024x
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CJ decode(ProtoReader protoReader) {
            C02CJ c02cj = new C02CJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cj.background_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c02cj.zero_comment_button_main_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02cj.zero_comment_button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02cj.zero_comment_button_enable = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c02cj.image_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02cj.background_url_for_black = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CJ c02cj) {
            C02CJ c02cj2 = c02cj;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02cj2.background_url);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02cj2.zero_comment_button_main_text) + protoAdapter2.encodedSizeWithTag(3, c02cj2.zero_comment_button_text) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c02cj2.zero_comment_button_enable) + ProtoAdapter.INT32.encodedSizeWithTag(5, c02cj2.image_type) + protoAdapter.encodedSizeWithTag(6, c02cj2.background_url_for_black) + c02cj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02CJ c02cj) {
            C02CJ c02cj2 = c02cj;
            ProtoAdapter<C673002jw> protoAdapter = C673002jw.ADAPTER;
            protoAdapter.encodeWithTag(protoWriter, 1, c02cj2.background_url);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, c02cj2.zero_comment_button_main_text);
            protoAdapter2.encodeWithTag(protoWriter, 3, c02cj2.zero_comment_button_text);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, c02cj2.zero_comment_button_enable);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, c02cj2.image_type);
            protoAdapter.encodeWithTag(protoWriter, 6, c02cj2.background_url_for_black);
            protoWriter.writeBytes(c02cj2.unknownFields());
        }
    };
    public C673002jw background_url;
    public C673002jw background_url_for_black;
    public Integer image_type;
    public Boolean zero_comment_button_enable;
    public String zero_comment_button_main_text;
    public String zero_comment_button_text;

    public C02CJ() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
