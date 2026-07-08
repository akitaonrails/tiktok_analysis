package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.029p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5427029p extends Message<C5427029p, C575402Me> {
    public static final ProtoAdapter<C5427029p> ADAPTER = new ProtoAdapter<C5427029p>() { // from class: X.0253
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5427029p decode(ProtoReader protoReader) {
            C5427029p c5427029p = new C5427029p();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5427029p.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5427029p.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5427029p.supported_methods_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5427029p.icon = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5427029p.dark_icon = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c5427029p.icon_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c5427029p.button_direction = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c5427029p.dialog_button.add(C02HK.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5427029p;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5427029p c5427029p) {
            C5427029p c5427029p2 = c5427029p;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c5427029p2.title) + protoAdapter.encodedSizeWithTag(2, c5427029p2.description) + protoAdapter.encodedSizeWithTag(3, c5427029p2.supported_methods_title) + protoAdapter.encodedSizeWithTag(4, c5427029p2.icon) + protoAdapter.encodedSizeWithTag(5, c5427029p2.dark_icon) + protoAdapter.encodedSizeWithTag(6, c5427029p2.icon_description) + ProtoAdapter.INT32.encodedSizeWithTag(7, c5427029p2.button_direction) + C02HK.ADAPTER.asRepeated().encodedSizeWithTag(8, c5427029p2.dialog_button) + c5427029p2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5427029p c5427029p) {
        }
    };
    public Integer button_direction;
    public String dark_icon;
    public String description;
    public List<C02HK> dialog_button;
    public String icon;
    public String icon_description;
    public String supported_methods_title;
    public String title;

    public C5427029p() {
        super(ADAPTER, ByteString.EMPTY);
        this.dialog_button = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C575402Me newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
