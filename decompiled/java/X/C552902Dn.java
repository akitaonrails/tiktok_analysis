package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C552902Dn extends Message<C552902Dn, C02MV> {
    public static final ProtoAdapter<C552902Dn> ADAPTER = new ProtoAdapter<C552902Dn>() { // from class: X.02Aj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C552902Dn decode(ProtoReader protoReader) {
            C552902Dn c552902Dn = new C552902Dn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c552902Dn.promotion_items.add(C023K.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c552902Dn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C552902Dn c552902Dn) {
            C552902Dn c552902Dn2 = c552902Dn;
            return C023K.ADAPTER.asRepeated().encodedSizeWithTag(1, c552902Dn2.promotion_items) + c552902Dn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C552902Dn c552902Dn) {
        }
    };
    public List<C023K> promotion_items;

    public C552902Dn() {
        super(ADAPTER, ByteString.EMPTY);
        this.promotion_items = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02MV newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
