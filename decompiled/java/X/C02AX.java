package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AX extends Message<C02AX, C582402Ow> {
    public static final ProtoAdapter<C02AX> ADAPTER = new ProtoAdapter<C02AX>() { // from class: X.026N
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AX decode(ProtoReader protoReader) {
            C02AX c02ax = new C02AX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02ax.instruction_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02ax.instruction = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02ax.order_detail_show_txt = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02ax.display_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c02ax.items.add(C02HA.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c02ax.extra_params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ax;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AX c02ax) {
            C02AX c02ax2 = c02ax;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02ax2.instruction_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02ax2.instruction) + protoAdapter.encodedSizeWithTag(3, c02ax2.order_detail_show_txt) + protoAdapter.encodedSizeWithTag(4, c02ax2.display_content) + C02HA.ADAPTER.asRepeated().encodedSizeWithTag(5, c02ax2.items) + protoAdapter.encodedSizeWithTag(6, c02ax2.extra_params) + c02ax2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02AX c02ax) {
        }
    };
    public String display_content;
    public String extra_params;
    public String instruction;
    public Integer instruction_type;
    public List<C02HA> items;
    public String order_detail_show_txt;

    public C02AX() {
        super(ADAPTER, ByteString.EMPTY);
        this.items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C582402Ow newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
