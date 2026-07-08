package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C608102Yt extends Message<C608102Yt, C608202Yu> {
    public static final ProtoAdapter<C608102Yt> ADAPTER = new ProtoAdapter<C608102Yt>() { // from class: X.02Ys
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C608102Yt decode(ProtoReader protoReader) {
            C608102Yt c608102Yt = new C608102Yt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c608102Yt.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c608102Yt.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c608102Yt.image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c608102Yt.label_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c608102Yt.label_style_config = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c608102Yt.label_type_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c608102Yt.dark_image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c608102Yt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C608102Yt c608102Yt) {
            C608102Yt c608102Yt2 = c608102Yt;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c608102Yt2.style);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c608102Yt2.text);
            ProtoAdapter<C02U1> protoAdapter3 = C02U1.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, c608102Yt2.image) + protoAdapter.encodedSizeWithTag(4, c608102Yt2.label_type) + protoAdapter2.encodedSizeWithTag(5, c608102Yt2.label_style_config) + protoAdapter2.encodedSizeWithTag(6, c608102Yt2.label_type_text) + protoAdapter3.encodedSizeWithTag(7, c608102Yt2.dark_image) + c608102Yt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C608102Yt c608102Yt) {
        }
    };
    public C02U1 dark_image;
    public C02U1 image;
    public String label_style_config;
    public Integer label_type;
    public String label_type_text;
    public Integer style;
    public String text;

    public C608102Yt() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C608202Yu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
