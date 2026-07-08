package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C639602eY extends Message<C639602eY, C639702eZ> {
    public static final ProtoAdapter<C639602eY> ADAPTER = new ProtoAdapter<C639602eY>() { // from class: X.02eX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C639602eY decode(ProtoReader protoReader) {
            C639602eY c639602eY = new C639602eY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c639602eY.link.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c639602eY.raw_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c639602eY;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C639602eY c639602eY) {
            C639602eY c639602eY2 = c639602eY;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c639602eY2.raw_text) + protoAdapter.asRepeated().encodedSizeWithTag(2, c639602eY2.link) + c639602eY2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C639602eY c639602eY) {
        }
    };
    public List<String> link;
    public String raw_text;

    public C639602eY() {
        super(ADAPTER, ByteString.EMPTY);
        this.link = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C639702eZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
