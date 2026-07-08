package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C552402Di extends Message<C552402Di, C02KM> {
    public static final ProtoAdapter<C552402Di> ADAPTER = new ProtoAdapter<C552402Di>() { // from class: X.02A0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C552402Di decode(ProtoReader protoReader) {
            C552402Di c552402Di = new C552402Di();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c552402Di.ttec_suggest_words.add(C5419029h.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c552402Di;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C552402Di c552402Di) {
            C552402Di c552402Di2 = c552402Di;
            return C5419029h.ADAPTER.asRepeated().encodedSizeWithTag(1, c552402Di2.ttec_suggest_words) + c552402Di2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C552402Di c552402Di) {
            C552402Di c552402Di2 = c552402Di;
            C5419029h.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c552402Di2.ttec_suggest_words);
            protoWriter.writeBytes(c552402Di2.unknownFields());
        }
    };
    public List<C5419029h> ttec_suggest_words;

    public C552402Di() {
        super(ADAPTER, ByteString.EMPTY);
        this.ttec_suggest_words = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02KM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
