package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223551C0z extends Message<C2223551C0z, C1C10> {
    public static final ProtoAdapter<C2223551C0z> ADAPTER = new ProtoAdapter<C2223551C0z>() { // from class: X.1C0y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223551C0z decode(ProtoReader protoReader) {
            C2223551C0z c2223551C0z = new C2223551C0z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2223551C0z.params.add(C2223521C0w.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c2223551C0z.usage = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223551C0z.template = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223551C0z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223551C0z c2223551C0z) {
            C2223551C0z c2223551C0z2 = c2223551C0z;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2223551C0z2.template) + protoAdapter.encodedSizeWithTag(2, c2223551C0z2.usage) + C2223521C0w.ADAPTER.asRepeated().encodedSizeWithTag(3, c2223551C0z2.params) + c2223551C0z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223551C0z c2223551C0z) {
            C2223551C0z c2223551C0z2 = c2223551C0z;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c2223551C0z2.template);
            protoAdapter.encodeWithTag(protoWriter, 2, c2223551C0z2.usage);
            C2223521C0w.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c2223551C0z2.params);
            protoWriter.writeBytes(c2223551C0z2.unknownFields());
        }
    };
    public List<C2223521C0w> params;
    public String template;
    public String usage;

    public C2223551C0z() {
        super(ADAPTER, ByteString.EMPTY);
        this.params = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C10 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
