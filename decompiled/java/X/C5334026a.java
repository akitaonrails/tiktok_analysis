package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.026a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5334026a extends Message<C5334026a, C02IH> {
    public static final ProtoAdapter<C5334026a> ADAPTER = new ProtoAdapter<C5334026a>() { // from class: X.022y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5334026a decode(ProtoReader protoReader) {
            C5334026a c5334026a = new C5334026a();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5334026a.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c5334026a.dramas.add(C027L.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c5334026a.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5334026a.subtitle = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5334026a.bg_img = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5334026a.card_type = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5334026a.right_button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c5334026a.left_button_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5334026a.bgm_video = AnonymousClass0213.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5334026a;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5334026a c5334026a) {
            C5334026a c5334026a2 = c5334026a;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c5334026a2.style) + C027L.ADAPTER.asRepeated().encodedSizeWithTag(2, c5334026a2.dramas);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c5334026a2.title) + protoAdapter.encodedSizeWithTag(4, c5334026a2.subtitle) + C673002jw.ADAPTER.encodedSizeWithTag(5, c5334026a2.bg_img) + protoAdapter.encodedSizeWithTag(6, c5334026a2.card_type) + protoAdapter.encodedSizeWithTag(7, c5334026a2.right_button_text) + protoAdapter.encodedSizeWithTag(8, c5334026a2.left_button_text) + AnonymousClass0213.ADAPTER.encodedSizeWithTag(9, c5334026a2.bgm_video) + c5334026a2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C5334026a c5334026a) {
            C5334026a c5334026a2 = c5334026a;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c5334026a2.style);
            C027L.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c5334026a2.dramas);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, c5334026a2.title);
            protoAdapter.encodeWithTag(protoWriter, 4, c5334026a2.subtitle);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 5, c5334026a2.bg_img);
            protoAdapter.encodeWithTag(protoWriter, 6, c5334026a2.card_type);
            protoAdapter.encodeWithTag(protoWriter, 7, c5334026a2.right_button_text);
            protoAdapter.encodeWithTag(protoWriter, 8, c5334026a2.left_button_text);
            AnonymousClass0213.ADAPTER.encodeWithTag(protoWriter, 9, c5334026a2.bgm_video);
            protoWriter.writeBytes(c5334026a2.unknownFields());
        }
    };
    public C673002jw bg_img;
    public AnonymousClass0213 bgm_video;
    public String card_type;
    public List<C027L> dramas;
    public String left_button_text;
    public String right_button_text;
    public Integer style;
    public String subtitle;
    public String title;

    public C5334026a() {
        super(ADAPTER, ByteString.EMPTY);
        this.dramas = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
