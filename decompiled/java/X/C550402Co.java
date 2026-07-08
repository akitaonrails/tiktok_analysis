package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C550402Co extends Message<C550402Co, C567702Jf> {
    public static final ProtoAdapter<C550402Co> ADAPTER = new ProtoAdapter<C550402Co>() { // from class: X.025R
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C550402Co decode(ProtoReader protoReader) {
            C550402Co c550402Co = new C550402Co();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c550402Co.background_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c550402Co.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c550402Co.text_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c550402Co.image = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c550402Co.ref_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c550402Co.label_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c550402Co;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C550402Co c550402Co) {
            C550402Co c550402Co2 = c550402Co;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c550402Co2.background_color) + protoAdapter.encodedSizeWithTag(2, c550402Co2.text) + protoAdapter.encodedSizeWithTag(3, c550402Co2.text_color) + C673002jw.ADAPTER.encodedSizeWithTag(4, c550402Co2.image) + protoAdapter.encodedSizeWithTag(5, c550402Co2.ref_url) + ProtoAdapter.INT32.encodedSizeWithTag(6, c550402Co2.label_type) + c550402Co2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C550402Co c550402Co) {
            C550402Co c550402Co2 = c550402Co;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c550402Co2.background_color);
            protoAdapter.encodeWithTag(protoWriter, 2, c550402Co2.text);
            protoAdapter.encodeWithTag(protoWriter, 3, c550402Co2.text_color);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 4, c550402Co2.image);
            protoAdapter.encodeWithTag(protoWriter, 5, c550402Co2.ref_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, c550402Co2.label_type);
            protoWriter.writeBytes(c550402Co2.unknownFields());
        }
    };
    public String background_color;
    public C673002jw image;
    public Integer label_type;
    public String ref_url;
    public String text;
    public String text_color;

    public C550402Co() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C567702Jf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
