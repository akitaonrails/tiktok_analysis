package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C562502Hf extends Message<C562502Hf, C02JI> {
    public static final ProtoAdapter<C562502Hf> ADAPTER = new ProtoAdapter<C562502Hf>() { // from class: X.02Hb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C562502Hf decode(ProtoReader protoReader) {
            C562502Hf c562502Hf = new C562502Hf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c562502Hf.next.add(C562502Hf.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c562502Hf.params = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c562502Hf.type = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c562502Hf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C562502Hf c562502Hf) {
            C562502Hf c562502Hf2 = c562502Hf;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c562502Hf2.type) + protoAdapter.encodedSizeWithTag(2, c562502Hf2.params) + C562502Hf.ADAPTER.asRepeated().encodedSizeWithTag(3, c562502Hf2.next) + c562502Hf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C562502Hf c562502Hf) {
            C562502Hf c562502Hf2 = c562502Hf;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c562502Hf2.type);
            protoAdapter.encodeWithTag(protoWriter, 2, c562502Hf2.params);
            C562502Hf.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, c562502Hf2.next);
            protoWriter.writeBytes(c562502Hf2.unknownFields());
        }
    };
    public List<C562502Hf> next;
    public String params;
    public String type;

    public C562502Hf() {
        super(ADAPTER, ByteString.EMPTY);
        this.next = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02JI newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
