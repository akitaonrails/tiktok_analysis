package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02U6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02U6 extends Message<C02U6, C02U8> {
    public static final ProtoAdapter<C02U6> ADAPTER = new ProtoAdapter<C02U6>() { // from class: X.02U5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02U6 decode(ProtoReader protoReader) {
            C02U6 c02u6 = new C02U6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02u6.pop_content.add(C02U4.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02u6.pop_title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02u6;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02U6 c02u6) {
            C02U6 c02u62 = c02u6;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02u62.pop_title) + C02U4.ADAPTER.asRepeated().encodedSizeWithTag(2, c02u62.pop_content) + c02u62.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02U6 c02u6) {
            C02U6 c02u62 = c02u6;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c02u62.pop_title);
            C02U4.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02u62.pop_content);
            protoWriter.writeBytes(c02u62.unknownFields());
        }
    };
    public List<C02U4> pop_content;
    public String pop_title;

    public C02U6() {
        super(ADAPTER, ByteString.EMPTY);
        this.pop_content = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02U8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
