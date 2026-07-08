package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C608402Yw extends Message<C608402Yw, C608502Yx> {
    public static final ProtoAdapter<C608402Yw> ADAPTER = new ProtoAdapter<C608402Yw>() { // from class: X.02Yv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C608402Yw decode(ProtoReader protoReader) {
            C608402Yw c608402Yw = new C608402Yw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c608402Yw.voucher_label_list.add(C608102Yt.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c608402Yw.position = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c608402Yw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C608402Yw c608402Yw) {
            C608402Yw c608402Yw2 = c608402Yw;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c608402Yw2.position) + C608102Yt.ADAPTER.asRepeated().encodedSizeWithTag(2, c608402Yw2.voucher_label_list) + c608402Yw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C608402Yw c608402Yw) {
        }
    };
    public Integer position;
    public List<C608102Yt> voucher_label_list;

    public C608402Yw() {
        super(ADAPTER, ByteString.EMPTY);
        this.voucher_label_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C608502Yx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
