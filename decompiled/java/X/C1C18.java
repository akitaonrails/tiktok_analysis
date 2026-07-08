package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C18, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C18 extends Message<C1C18, C1C19> {
    public static final ProtoAdapter<C1C18> ADAPTER = new ProtoAdapter<C1C18>() { // from class: X.1C17
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C18 decode(ProtoReader protoReader) {
            C1C18 c1c18 = new C1C18();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c18.logs.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c1c18.psm = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c18;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C18 c1c18) {
            C1C18 c1c182 = c1c18;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c182.psm) + protoAdapter.asRepeated().encodedSizeWithTag(2, c1c182.logs) + c1c182.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C18 c1c18) {
        }
    };
    public List<String> logs;
    public String psm;

    public C1C18() {
        super(ADAPTER, ByteString.EMPTY);
        this.logs = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C19 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
