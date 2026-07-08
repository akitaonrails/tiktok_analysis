package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02F8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02F8 extends Message<C02F8, C02NV> {
    public static final ProtoAdapter<C02F8> ADAPTER = new ProtoAdapter<C02F8>() { // from class: X.02F7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02F8 decode(ProtoReader protoReader) {
            C02F8 c02f8 = new C02F8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02f8.combo_sku_infos.add(C02F6.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c02f8.combo_panel_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02f8.combo_title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02f8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02F8 c02f8) {
            C02F8 c02f82 = c02f8;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02f82.combo_title) + protoAdapter.encodedSizeWithTag(2, c02f82.combo_panel_title) + C02F6.ADAPTER.asRepeated().encodedSizeWithTag(3, c02f82.combo_sku_infos) + c02f82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02F8 c02f8) {
        }
    };
    public String combo_panel_title;
    public List<C02F6> combo_sku_infos;
    public String combo_title;

    public C02F8() {
        super(ADAPTER, ByteString.EMPTY);
        this.combo_sku_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02NV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
