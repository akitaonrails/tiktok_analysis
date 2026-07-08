package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224771C5r extends Message<C2224771C5r, C2224781C5s> {
    public static final ProtoAdapter<C2224771C5r> ADAPTER = new ProtoAdapter<C2224771C5r>() { // from class: X.1C5q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224771C5r decode(ProtoReader protoReader) {
            C2224771C5r c2224771C5r = new C2224771C5r();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2224771C5r.shipping_service_tags.add(C2224741C5o.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2224771C5r.header = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224771C5r;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224771C5r c2224771C5r) {
            C2224771C5r c2224771C5r2 = c2224771C5r;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c2224771C5r2.header) + C2224741C5o.ADAPTER.asRepeated().encodedSizeWithTag(2, c2224771C5r2.shipping_service_tags) + c2224771C5r2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224771C5r c2224771C5r) {
        }
    };
    public String header;
    public List<C2224741C5o> shipping_service_tags;

    public C2224771C5r() {
        super(ADAPTER, ByteString.EMPTY);
        this.shipping_service_tags = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2224781C5s newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
