package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GJ extends Message<C02GJ, C582302Ov> {
    public static final ProtoAdapter<C02GJ> ADAPTER = new ProtoAdapter<C02GJ>() { // from class: X.02GI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GJ decode(ProtoReader protoReader) {
            C02GJ c02gj = new C02GJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02gj.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02gj.sub_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02gj.content.add(C560902Gp.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            c02gj.button_direction = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02gj.dialog_button.add(C02HK.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c02gj.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GJ c02gj) {
            C02GJ c02gj2 = c02gj;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02gj2.title) + protoAdapter.encodedSizeWithTag(2, c02gj2.sub_title) + C560902Gp.ADAPTER.asRepeated().encodedSizeWithTag(3, c02gj2.content) + ProtoAdapter.INT32.encodedSizeWithTag(4, c02gj2.button_direction) + C02HK.ADAPTER.asRepeated().encodedSizeWithTag(5, c02gj2.dialog_button) + protoAdapter.encodedSizeWithTag(6, c02gj2.da_info) + c02gj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GJ c02gj) {
        }
    };
    public Integer button_direction;
    public List<C560902Gp> content;
    public String da_info;
    public List<C02HK> dialog_button;
    public String sub_title;
    public String title;

    public C02GJ() {
        super(ADAPTER, ByteString.EMPTY);
        this.content = C1516540pZE.LJIIIIZZ();
        this.dialog_button = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C582302Ov newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
