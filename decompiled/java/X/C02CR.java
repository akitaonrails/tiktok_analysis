package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02CR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02CR extends Message<C02CR, C02NK> {
    public static final ProtoAdapter<C02CR> ADAPTER = new ProtoAdapter<C02CR>() { // from class: X.0276
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02CR decode(ProtoReader protoReader) {
            C02CR c02cr = new C02CR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02cr.label_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02cr.background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02cr.font_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02cr.font_size = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02cr.dark_background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02cr.dark_font_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02cr.redirect_info = C650802gM.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02cr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02CR c02cr) {
            C02CR c02cr2 = c02cr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02cr2.label_name) + protoAdapter.encodedSizeWithTag(2, c02cr2.background_color) + protoAdapter.encodedSizeWithTag(3, c02cr2.font_color) + ProtoAdapter.INT32.encodedSizeWithTag(4, c02cr2.font_size) + protoAdapter.encodedSizeWithTag(5, c02cr2.dark_background_color) + protoAdapter.encodedSizeWithTag(6, c02cr2.dark_font_color) + C650802gM.ADAPTER.encodedSizeWithTag(7, c02cr2.redirect_info) + c02cr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02CR c02cr) {
        }
    };
    public String background_color;
    public String dark_background_color;
    public String dark_font_color;
    public String font_color;
    public Integer font_size;
    public String label_name;
    public C650802gM redirect_info;

    public C02CR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
