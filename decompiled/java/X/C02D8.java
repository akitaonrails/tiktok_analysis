package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02D8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02D8 extends Message<C02D8, C02J9> {
    public static final ProtoAdapter<C02D8> ADAPTER = new ProtoAdapter<C02D8>() { // from class: X.028D
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02D8 decode(ProtoReader protoReader) {
            C02D8 c02d8 = new C02D8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02d8.text_extra.add(C5312025e.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02d8.markup_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02d8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02D8 c02d8) {
            C02D8 c02d82 = c02d8;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02d82.markup_text) + C5312025e.ADAPTER.asRepeated().encodedSizeWithTag(2, c02d82.text_extra) + c02d82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02D8 c02d8) {
            C02D8 c02d82 = c02d8;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02d82.markup_text);
            C5312025e.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02d82.text_extra);
            protoWriter.writeBytes(c02d82.unknownFields());
        }
    };
    public String markup_text;
    public List<C5312025e> text_extra;

    public C02D8() {
        super(ADAPTER, ByteString.EMPTY);
        this.text_extra = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02J9 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
