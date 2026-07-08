package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02D5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02D5 extends Message<C02D5, C02I5> {
    public static final ProtoAdapter<C02D5> ADAPTER = new ProtoAdapter<C02D5>() { // from class: X.026P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02D5 decode(ProtoReader protoReader) {
            C02D5 c02d5 = new C02D5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02d5.max_row = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02d5.font_size = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c02d5.font_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02d5.bold = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02d5.ellipsis = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c02d5.tux_font = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02d5.max_width = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02d5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02D5 c02d5) {
            C02D5 c02d52 = c02d5;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02d52.max_row) + protoAdapter.encodedSizeWithTag(2, c02d52.font_size);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c02d52.font_color) + protoAdapter.encodedSizeWithTag(4, c02d52.bold) + protoAdapter.encodedSizeWithTag(5, c02d52.ellipsis) + protoAdapter2.encodedSizeWithTag(6, c02d52.tux_font) + protoAdapter.encodedSizeWithTag(7, c02d52.max_width) + c02d52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02D5 c02d5) {
            C02D5 c02d52 = c02d5;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c02d52.max_row);
            protoAdapter.encodeWithTag(protoWriter, 2, c02d52.font_size);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, c02d52.font_color);
            protoAdapter.encodeWithTag(protoWriter, 4, c02d52.bold);
            protoAdapter.encodeWithTag(protoWriter, 5, c02d52.ellipsis);
            protoAdapter2.encodeWithTag(protoWriter, 6, c02d52.tux_font);
            protoAdapter.encodeWithTag(protoWriter, 7, c02d52.max_width);
            protoWriter.writeBytes(c02d52.unknownFields());
        }
    };
    public Integer bold;
    public Integer ellipsis;
    public String font_color;
    public Integer font_size;
    public Integer max_row;
    public Integer max_width;
    public String tux_font;

    public C02D5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02I5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
