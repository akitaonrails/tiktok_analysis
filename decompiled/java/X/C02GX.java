package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GX extends Message<C02GX, C583002Pc> {
    public static final ProtoAdapter<C02GX> ADAPTER = new ProtoAdapter<C02GX>() { // from class: X.02GW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GX decode(ProtoReader protoReader) {
            C02GX c02gx = new C02GX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02gx.platform_discount_list.add(C02GV.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02gx.not_available_discount_desc = C02GZ.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GX c02gx) {
            C02GX c02gx2 = c02gx;
            return C02GZ.ADAPTER.encodedSizeWithTag(1, c02gx2.not_available_discount_desc) + C02GV.ADAPTER.asRepeated().encodedSizeWithTag(2, c02gx2.platform_discount_list) + c02gx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GX c02gx) {
        }
    };
    public C02GZ not_available_discount_desc;
    public List<C02GV> platform_discount_list;

    public C02GX() {
        super(ADAPTER, ByteString.EMPTY);
        this.platform_discount_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C583002Pc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
