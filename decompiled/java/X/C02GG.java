package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GG extends Message<C02GG, C577702Nb> {
    public static final ProtoAdapter<C02GG> ADAPTER = new ProtoAdapter<C02GG>() { // from class: X.02GH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GG decode(ProtoReader protoReader) {
            C02GG c02gg = new C02GG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02gg.dialog_button.add(C02HK.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c02gg.button_direction = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02gg.content.add(C560902Gp.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02gg.header = C02WN.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GG c02gg) {
            C02GG c02gg2 = c02gg;
            return C02WN.ADAPTER.encodedSizeWithTag(1, c02gg2.header) + C560902Gp.ADAPTER.asRepeated().encodedSizeWithTag(2, c02gg2.content) + ProtoAdapter.INT32.encodedSizeWithTag(3, c02gg2.button_direction) + C02HK.ADAPTER.asRepeated().encodedSizeWithTag(4, c02gg2.dialog_button) + c02gg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GG c02gg) {
        }
    };
    public Integer button_direction;
    public List<C560902Gp> content;
    public List<C02HK> dialog_button;
    public C02WN header;

    public C02GG() {
        super(ADAPTER, ByteString.EMPTY);
        this.content = C1516540pZE.LJIIIIZZ();
        this.dialog_button = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C577702Nb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
