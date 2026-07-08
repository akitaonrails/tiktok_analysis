package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C550202Cm extends Message<C550202Cm, C02IA> {
    public static final ProtoAdapter<C550202Cm> ADAPTER = new ProtoAdapter<C550202Cm>() { // from class: X.025n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C550202Cm decode(ProtoReader protoReader) {
            C550202Cm c550202Cm = new C550202Cm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c550202Cm.button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c550202Cm.show_button_seconds = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c550202Cm.show_button_color_seconds = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c550202Cm.learn_more_bg_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c550202Cm.schema_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c550202Cm.show_button_right_arrow = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c550202Cm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C550202Cm c550202Cm) {
            C550202Cm c550202Cm2 = c550202Cm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c550202Cm2.button_text);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c550202Cm2.show_button_seconds) + protoAdapter2.encodedSizeWithTag(3, c550202Cm2.show_button_color_seconds) + protoAdapter.encodedSizeWithTag(4, c550202Cm2.learn_more_bg_color) + protoAdapter.encodedSizeWithTag(5, c550202Cm2.schema_url) + ProtoAdapter.BOOL.encodedSizeWithTag(6, c550202Cm2.show_button_right_arrow) + c550202Cm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C550202Cm c550202Cm) {
            C550202Cm c550202Cm2 = c550202Cm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c550202Cm2.button_text);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c550202Cm2.show_button_seconds);
            protoAdapter2.encodeWithTag(protoWriter, 3, c550202Cm2.show_button_color_seconds);
            protoAdapter.encodeWithTag(protoWriter, 4, c550202Cm2.learn_more_bg_color);
            protoAdapter.encodeWithTag(protoWriter, 5, c550202Cm2.schema_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, c550202Cm2.show_button_right_arrow);
            protoWriter.writeBytes(c550202Cm2.unknownFields());
        }
    };
    public String button_text;
    public String learn_more_bg_color;
    public String schema_url;
    public Integer show_button_color_seconds;
    public Boolean show_button_right_arrow;
    public Integer show_button_seconds;

    public C550202Cm() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02IA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
