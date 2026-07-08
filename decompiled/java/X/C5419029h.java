package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5419029h extends Message<C5419029h, C02K8> {
    public static final ProtoAdapter<C5419029h> ADAPTER = new ProtoAdapter<C5419029h>() { // from class: X.023i
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5419029h decode(ProtoReader protoReader) {
            C5419029h c5419029h = new C5419029h();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5419029h.words.add(C556402Ew.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c5419029h.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5419029h.scene = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5419029h.hint_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5419029h.extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5419029h.qrec_virtual_enable = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5419029h.redirect_page = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5419029h;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5419029h c5419029h) {
            C5419029h c5419029h2 = c5419029h;
            int iEncodedSizeWithTag = C556402Ew.ADAPTER.asRepeated().encodedSizeWithTag(1, c5419029h2.words) + C673002jw.ADAPTER.encodedSizeWithTag(2, c5419029h2.icon_url);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c5419029h2.scene) + protoAdapter.encodedSizeWithTag(4, c5419029h2.hint_text) + protoAdapter.encodedSizeWithTag(5, c5419029h2.extra_info) + protoAdapter.encodedSizeWithTag(6, c5419029h2.qrec_virtual_enable) + ProtoAdapter.INT32.encodedSizeWithTag(7, c5419029h2.redirect_page) + c5419029h2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5419029h c5419029h) {
            C5419029h c5419029h2 = c5419029h;
            C556402Ew.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c5419029h2.words);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 2, c5419029h2.icon_url);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, c5419029h2.scene);
            protoAdapter.encodeWithTag(protoWriter, 4, c5419029h2.hint_text);
            protoAdapter.encodeWithTag(protoWriter, 5, c5419029h2.extra_info);
            protoAdapter.encodeWithTag(protoWriter, 6, c5419029h2.qrec_virtual_enable);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 7, c5419029h2.redirect_page);
            protoWriter.writeBytes(c5419029h2.unknownFields());
        }
    };
    public String extra_info;
    public String hint_text;
    public C673002jw icon_url;
    public String qrec_virtual_enable;
    public Integer redirect_page;
    public String scene;
    public List<C556402Ew> words;

    public C5419029h() {
        super(ADAPTER, ByteString.EMPTY);
        this.words = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02K8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
