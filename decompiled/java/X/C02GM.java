package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GM extends Message<C02GM, C575002Ma> {
    public static final ProtoAdapter<C02GM> ADAPTER = new ProtoAdapter<C02GM>() { // from class: X.02GK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GM decode(ProtoReader protoReader) {
            C02GM c02gm = new C02GM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02gm.cashier_bottom_sheet = C02GJ.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02gm.scene = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GM c02gm) {
            C02GM c02gm2 = c02gm;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02gm2.scene) + C02GJ.ADAPTER.encodedSizeWithTag(2, c02gm2.cashier_bottom_sheet) + c02gm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GM c02gm) {
        }
    };
    public C02GJ cashier_bottom_sheet;
    public Integer scene;

    public C02GM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C575002Ma newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
