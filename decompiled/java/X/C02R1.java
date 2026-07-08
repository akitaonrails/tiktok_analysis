package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02R1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02R1 extends Message<C02R1, C02R2> {
    public static final ProtoAdapter<C02R1> ADAPTER = new ProtoAdapter<C02R1>() { // from class: X.02R0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02R1 decode(ProtoReader protoReader) {
            C02R1 c02r1 = new C02R1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02r1.need_show = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c02r1.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02r1.bg_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02r1.text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02r1.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02r1.click_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02r1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02R1 c02r1) {
            C02R1 c02r12 = c02r1;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c02r12.need_show);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02r12.text) + protoAdapter.encodedSizeWithTag(3, c02r12.bg_color) + protoAdapter.encodedSizeWithTag(4, c02r12.text_color) + protoAdapter.encodedSizeWithTag(5, c02r12.schema) + ProtoAdapter.INT32.encodedSizeWithTag(6, c02r12.click_type) + c02r12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02R1 c02r1) {
            C02R1 c02r12 = c02r1;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02r12.need_show);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02r12.text);
            protoAdapter.encodeWithTag(protoWriter, 3, c02r12.bg_color);
            protoAdapter.encodeWithTag(protoWriter, 4, c02r12.text_color);
            protoAdapter.encodeWithTag(protoWriter, 5, c02r12.schema);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, c02r12.click_type);
            protoWriter.writeBytes(c02r12.unknownFields());
        }
    };
    public String bg_color;
    public Integer click_type;
    public Boolean need_show;
    public String schema;
    public String text;
    public String text_color;

    public C02R1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02R2 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
