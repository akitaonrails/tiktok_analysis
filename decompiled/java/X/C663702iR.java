package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02iR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C663702iR extends Message<C663702iR, C663802iS> {
    public static final ProtoAdapter<C663702iR> ADAPTER = new ProtoAdapter<C663702iR>() { // from class: X.02iQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C663702iR decode(ProtoReader protoReader) {
            C663702iR c663702iR = new C663702iR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c663702iR.creation_used_functions.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c663702iR;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C663702iR c663702iR) {
            C663702iR c663702iR2 = c663702iR;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c663702iR2.creation_used_functions) + c663702iR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C663702iR c663702iR) {
            C663702iR c663702iR2 = c663702iR;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, c663702iR2.creation_used_functions);
            protoWriter.writeBytes(c663702iR2.unknownFields());
        }
    };
    public List<String> creation_used_functions;

    public C663702iR() {
        super(ADAPTER, ByteString.EMPTY);
        this.creation_used_functions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C663802iS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
