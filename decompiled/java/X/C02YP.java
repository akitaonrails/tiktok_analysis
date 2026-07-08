package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02YP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02YP extends Message<C02YP, C02YR> {
    public static final ProtoAdapter<C02YP> ADAPTER = new ProtoAdapter<C02YP>() { // from class: X.02YO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02YP decode(ProtoReader protoReader) {
            C02YP c02yp = new C02YP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02yp.links.add(C02YN.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02yp.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02yp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02YP c02yp) {
            C02YP c02yp2 = c02yp;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02yp2.text) + C02YN.ADAPTER.asRepeated().encodedSizeWithTag(2, c02yp2.links) + c02yp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02YP c02yp) {
            C02YP c02yp2 = c02yp;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02yp2.text);
            C02YN.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02yp2.links);
            protoWriter.writeBytes(c02yp2.unknownFields());
        }
    };
    public List<C02YN> links;
    public String text;

    public C02YP() {
        super(ADAPTER, ByteString.EMPTY);
        this.links = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02YR newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
