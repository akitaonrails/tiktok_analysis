package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C15, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C15 extends Message<C1C15, C1C16> {
    public static final ProtoAdapter<C1C15> ADAPTER = new ProtoAdapter<C1C15>() { // from class: X.1C14
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C15 decode(ProtoReader protoReader) {
            C1C15 c1c15 = new C1C15();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1c15.params.add(C1C12.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1c15.usage = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c15.template = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c15;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C15 c1c15) {
            C1C15 c1c152 = c1c15;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c152.template) + protoAdapter.encodedSizeWithTag(2, c1c152.usage) + C1C12.ADAPTER.asRepeated().encodedSizeWithTag(3, c1c152.params) + c1c152.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1C15 c1c15) {
            C1C15 c1c152 = c1c15;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c1c152.template);
            protoAdapter.encodeWithTag(protoWriter, 2, c1c152.usage);
            C1C12.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c1c152.params);
            protoWriter.writeBytes(c1c152.unknownFields());
        }
    };
    public List<C1C12> params;
    public String template;
    public String usage;

    public C1C15() {
        super(ADAPTER, ByteString.EMPTY);
        this.params = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C16 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
