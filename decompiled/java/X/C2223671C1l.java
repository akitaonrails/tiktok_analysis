package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223671C1l extends Message<C2223671C1l, C2223681C1m> {
    public static final ProtoAdapter<C2223671C1l> ADAPTER = new ProtoAdapter<C2223671C1l>() { // from class: X.1C1k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223671C1l decode(ProtoReader protoReader) {
            C2223671C1l c2223671C1l = new C2223671C1l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223671C1l.product_category.add(C2223641C1i.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2223671C1l.virtual_unboxing_info = C1C5N.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223671C1l;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223671C1l c2223671C1l) {
            C2223671C1l c2223671C1l2 = c2223671C1l;
            return C1C5N.ADAPTER.encodedSizeWithTag(1, c2223671C1l2.virtual_unboxing_info) + C2223641C1i.ADAPTER.asRepeated().encodedSizeWithTag(2, c2223671C1l2.product_category) + c2223671C1l2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223671C1l c2223671C1l) {
        }
    };
    public List<C2223641C1i> product_category;
    public C1C5N virtual_unboxing_info;

    public C2223671C1l() {
        super(ADAPTER, ByteString.EMPTY);
        this.product_category = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2223681C1m newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
