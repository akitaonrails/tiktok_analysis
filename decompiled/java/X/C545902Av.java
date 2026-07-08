package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C545902Av extends Message<C545902Av, C02IL> {
    public static final ProtoAdapter<C545902Av> ADAPTER = new ProtoAdapter<C545902Av>() { // from class: X.024p
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C545902Av decode(ProtoReader protoReader) {
            C545902Av c545902Av = new C545902Av();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c545902Av.words.add(C02B4.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c545902Av.icon_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c545902Av.scene = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c545902Av.hint_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c545902Av.extra_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c545902Av.qrec_virtual_enable = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c545902Av;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C545902Av c545902Av) {
            C545902Av c545902Av2 = c545902Av;
            int iEncodedSizeWithTag = C02B4.ADAPTER.asRepeated().encodedSizeWithTag(1, c545902Av2.words) + C673002jw.ADAPTER.encodedSizeWithTag(2, c545902Av2.icon_url);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c545902Av2.scene) + protoAdapter.encodedSizeWithTag(4, c545902Av2.hint_text) + protoAdapter.encodedSizeWithTag(5, c545902Av2.extra_info) + protoAdapter.encodedSizeWithTag(6, c545902Av2.qrec_virtual_enable) + c545902Av2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C545902Av c545902Av) {
            C545902Av c545902Av2 = c545902Av;
            C02B4.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c545902Av2.words);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 2, c545902Av2.icon_url);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 3, c545902Av2.scene);
            protoAdapter.encodeWithTag(protoWriter, 4, c545902Av2.hint_text);
            protoAdapter.encodeWithTag(protoWriter, 5, c545902Av2.extra_info);
            protoAdapter.encodeWithTag(protoWriter, 6, c545902Av2.qrec_virtual_enable);
            protoWriter.writeBytes(c545902Av2.unknownFields());
        }
    };
    public String extra_info;
    public String hint_text;
    public C673002jw icon_url;
    public String qrec_virtual_enable;
    public String scene;
    public List<C02B4> words;

    public C545902Av() {
        super(ADAPTER, ByteString.EMPTY);
        this.words = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
