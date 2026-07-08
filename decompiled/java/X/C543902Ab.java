package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C543902Ab extends Message<C543902Ab, C579302Nr> {
    public static final ProtoAdapter<C543902Ab> ADAPTER = new ProtoAdapter<C543902Ab>() { // from class: X.024i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C543902Ab decode(ProtoReader protoReader) {
            C543902Ab c543902Ab = new C543902Ab();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c543902Ab.text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c543902Ab.background_color = C618602bA.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c543902Ab.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c543902Ab.description_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c543902Ab.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c543902Ab.tag_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c543902Ab.tag_value = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c543902Ab.description_text_plain = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c543902Ab.description_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c543902Ab;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C543902Ab c543902Ab) {
            C543902Ab c543902Ab2 = c543902Ab;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c543902Ab2.text) + C618602bA.ADAPTER.encodedSizeWithTag(2, c543902Ab2.background_color);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c543902Ab2.da_info) + protoAdapter.encodedSizeWithTag(4, c543902Ab2.description_text) + ProtoAdapter.INT32.encodedSizeWithTag(5, c543902Ab2.style) + protoAdapter2.encodedSizeWithTag(6, c543902Ab2.tag_name) + protoAdapter2.encodedSizeWithTag(7, c543902Ab2.tag_value) + protoAdapter2.encodedSizeWithTag(8, c543902Ab2.description_text_plain) + protoAdapter2.encodedSizeWithTag(9, c543902Ab2.description_schema) + c543902Ab2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C543902Ab c543902Ab) {
        }
    };
    public C618602bA background_color;
    public String da_info;
    public String description_schema;
    public C5431029t description_text;
    public String description_text_plain;
    public Integer style;
    public String tag_name;
    public String tag_value;
    public C5431029t text;

    public C543902Ab() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C579302Nr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
