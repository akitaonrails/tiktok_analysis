package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C561302Gt extends Message<C561302Gt, C02P3> {
    public static final ProtoAdapter<C561302Gt> ADAPTER = new ProtoAdapter<C561302Gt>() { // from class: X.02Gs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C561302Gt decode(ProtoReader protoReader) {
            C561302Gt c561302Gt = new C561302Gt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c561302Gt.da_info = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c561302Gt.price_desc_detail_items.add(C561102Gr.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c561302Gt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C561302Gt c561302Gt) {
            C561302Gt c561302Gt2 = c561302Gt;
            return C561102Gr.ADAPTER.asRepeated().encodedSizeWithTag(1, c561302Gt2.price_desc_detail_items) + ProtoAdapter.STRING.encodedSizeWithTag(2, c561302Gt2.da_info) + c561302Gt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C561302Gt c561302Gt) {
        }
    };
    public String da_info;
    public List<C561102Gr> price_desc_detail_items;

    public C561302Gt() {
        super(ADAPTER, ByteString.EMPTY);
        this.price_desc_detail_items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02P3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
