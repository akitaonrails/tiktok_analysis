package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02In, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C565902In extends Message<C565902In, C02LB> {
    public static final ProtoAdapter<C565902In> ADAPTER = new ProtoAdapter<C565902In>() { // from class: X.02Im
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C565902In decode(ProtoReader protoReader) {
            C565902In c565902In = new C565902In();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c565902In.origin_content_info.add(C02C1.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c565902In;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C565902In c565902In) {
            C565902In c565902In2 = c565902In;
            return C02C1.ADAPTER.asRepeated().encodedSizeWithTag(1, c565902In2.origin_content_info) + c565902In2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C565902In c565902In) {
            C565902In c565902In2 = c565902In;
            C02C1.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c565902In2.origin_content_info);
            protoWriter.writeBytes(c565902In2.unknownFields());
        }
    };
    public List<C02C1> origin_content_info;

    public C565902In() {
        super(ADAPTER, ByteString.EMPTY);
        this.origin_content_info = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02LB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
