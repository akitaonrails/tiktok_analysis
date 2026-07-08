package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C646702fh extends Message<C646702fh, C646902fj> {
    public static final ProtoAdapter<C646702fh> ADAPTER = new ProtoAdapter<C646702fh>() { // from class: X.02fi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C646702fh decode(ProtoReader protoReader) {
            C646702fh c646702fh = new C646702fh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c646702fh.best_voucher_metas.add(C647102fl.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c646702fh.best_voucher_type_ids.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c646702fh;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C646702fh c646702fh) {
            C646702fh c646702fh2 = c646702fh;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c646702fh2.best_voucher_type_ids) + C647102fl.ADAPTER.asRepeated().encodedSizeWithTag(2, c646702fh2.best_voucher_metas) + c646702fh2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C646702fh c646702fh) {
        }
    };
    public List<C647102fl> best_voucher_metas;
    public List<String> best_voucher_type_ids;

    public C646702fh() {
        super(ADAPTER, ByteString.EMPTY);
        this.best_voucher_type_ids = C1516540pZE.LJIIIIZZ();
        this.best_voucher_metas = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C646902fj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
