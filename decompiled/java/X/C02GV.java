package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GV extends Message<C02GV, C583402Pg> {
    public static final ProtoAdapter<C02GV> ADAPTER = new ProtoAdapter<C02GV>() { // from class: X.02AD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GV decode(ProtoReader protoReader) {
            C02GV c02gv = new C02GV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02gv.discount_end_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c02gv.discount_text = C02GZ.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GV c02gv) {
            C02GV c02gv2 = c02gv;
            return C02GZ.ADAPTER.encodedSizeWithTag(1, c02gv2.discount_text) + ProtoAdapter.INT64.encodedSizeWithTag(2, c02gv2.discount_end_time) + c02gv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GV c02gv) {
        }
    };
    public Long discount_end_time;
    public C02GZ discount_text;

    public C02GV() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C583402Pg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
