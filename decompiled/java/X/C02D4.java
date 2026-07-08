package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02D4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02D4 extends Message<C02D4, C564402Hy> {
    public static final ProtoAdapter<C02D4> ADAPTER = new ProtoAdapter<C02D4>() { // from class: X.026O
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02D4 decode(ProtoReader protoReader) {
            C02D4 c02d4 = new C02D4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02d4.translated_desc_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02d4.translated_desc_lang = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02d4.translated_desc_variant = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02d4.translated_desc_client_text = C02D8.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c02d4.translated_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02d4.translated_title_lang = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02d4.translated_title_variant = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02d4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02D4 c02d4) {
            C02D4 c02d42 = c02d4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02d42.translated_desc_content) + protoAdapter.encodedSizeWithTag(2, c02d42.translated_desc_lang) + protoAdapter.encodedSizeWithTag(3, c02d42.translated_desc_variant) + C02D8.ADAPTER.encodedSizeWithTag(4, c02d42.translated_desc_client_text) + protoAdapter.encodedSizeWithTag(5, c02d42.translated_title) + protoAdapter.encodedSizeWithTag(6, c02d42.translated_title_lang) + protoAdapter.encodedSizeWithTag(7, c02d42.translated_title_variant) + c02d42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02D4 c02d4) {
            C02D4 c02d42 = c02d4;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02d42.translated_desc_content);
            protoAdapter.encodeWithTag(protoWriter, 2, c02d42.translated_desc_lang);
            protoAdapter.encodeWithTag(protoWriter, 3, c02d42.translated_desc_variant);
            C02D8.ADAPTER.encodeWithTag(protoWriter, 4, c02d42.translated_desc_client_text);
            protoAdapter.encodeWithTag(protoWriter, 5, c02d42.translated_title);
            protoAdapter.encodeWithTag(protoWriter, 6, c02d42.translated_title_lang);
            protoAdapter.encodeWithTag(protoWriter, 7, c02d42.translated_title_variant);
            protoWriter.writeBytes(c02d42.unknownFields());
        }
    };
    public C02D8 translated_desc_client_text;
    public String translated_desc_content;
    public String translated_desc_lang;
    public String translated_desc_variant;
    public String translated_title;
    public String translated_title_lang;
    public String translated_title_variant;

    public C02D4() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C564402Hy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
