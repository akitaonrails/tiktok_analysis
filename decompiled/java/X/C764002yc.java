package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C764002yc extends Message<C764002yc, C763902yb> {
    public static final ProtoAdapter<C764002yc> ADAPTER = new ProtoAdapter<C764002yc>() { // from class: X.02yd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C764002yc decode(ProtoReader protoReader) {
            C764002yc c764002yc = new C764002yc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c764002yc.best_voucher_type_ids.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c764002yc.claim_voucher_scene = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c764002yc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C764002yc c764002yc) {
            C764002yc c764002yc2 = c764002yc;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c764002yc2.claim_voucher_scene) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, c764002yc2.best_voucher_type_ids) + c764002yc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C764002yc c764002yc) {
        }
    };
    public List<String> best_voucher_type_ids;
    public Integer claim_voucher_scene;

    public C764002yc() {
        super(ADAPTER, ByteString.EMPTY);
        this.best_voucher_type_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C763902yb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
