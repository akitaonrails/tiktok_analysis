package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0r8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577130r8x extends Message<C1577130r8x, C1577140r8y> {
    public static final ProtoAdapter<C1577130r8x> ADAPTER = new ProtoAdapter<C1577130r8x>() { // from class: X.0r8t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1577130r8x decode(ProtoReader protoReader) {
            C1577140r8y c1577140r8y = new C1577140r8y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1577140r8y.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1577140r8y.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c1577140r8y.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1577140r8y.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1577140r8y.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1577140r8y.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1577140r8y.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1577140r8y.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1577130r8x c1577130r8x) {
            C1577130r8x c1577130r8x2 = c1577130r8x;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1577130r8x2.title) + protoAdapter.encodedSizeWithTag(2, c1577130r8x2.sub_title) + protoAdapter.encodedSizeWithTag(3, c1577130r8x2.button_text) + protoAdapter.encodedSizeWithTag(4, c1577130r8x2.highlight_text) + protoAdapter.encodedSizeWithTag(5, c1577130r8x2.highlight_color) + protoAdapter.encodedSizeWithTag(6, c1577130r8x2.pop_up_image_url) + c1577130r8x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1577130r8x c1577130r8x) {
            C1577130r8x c1577130r8x2 = c1577130r8x;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1577130r8x2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c1577130r8x2.sub_title);
            protoAdapter.encodeWithTag(protoWriter, 3, c1577130r8x2.button_text);
            protoAdapter.encodeWithTag(protoWriter, 4, c1577130r8x2.highlight_text);
            protoAdapter.encodeWithTag(protoWriter, 5, c1577130r8x2.highlight_color);
            protoAdapter.encodeWithTag(protoWriter, 6, c1577130r8x2.pop_up_image_url);
            protoWriter.writeBytes(c1577130r8x2.unknownFields());
        }
    };
    public String button_text;
    public String highlight_color;
    public String highlight_text;
    public String pop_up_image_url;
    public String sub_title;
    public String title;

    @Override // com.squareup.wire.Message
    public C1577140r8y newBuilder() {
        return null;
    }

    public C1577130r8x(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, ByteString.EMPTY);
    }

    public C1577130r8x(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString) {
        super(ADAPTER, byteString);
        this.title = str;
        this.sub_title = str2;
        this.button_text = str3;
        this.highlight_text = str4;
        this.highlight_color = str5;
        this.pop_up_image_url = str6;
    }
}
