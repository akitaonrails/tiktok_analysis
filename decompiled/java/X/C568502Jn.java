package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Jn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C568502Jn extends Message<C568502Jn, C568602Jo> {
    public static final ProtoAdapter<C568502Jn> ADAPTER = new ProtoAdapter<C568502Jn>() { // from class: X.02Jm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C568502Jn decode(ProtoReader protoReader) {
            C568502Jn c568502Jn = new C568502Jn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c568502Jn.thumbnail_url = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c568502Jn.returned_prompts.add(ProtoAdapter.STRING.decode(protoReader));
                        }
                    } else {
                        c568502Jn.question = C546102Ax.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c568502Jn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C568502Jn c568502Jn) {
            C568502Jn c568502Jn2 = c568502Jn;
            int iEncodedSizeWithTag = C546102Ax.ADAPTER.encodedSizeWithTag(1, c568502Jn2.question);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(2, c568502Jn2.returned_prompts) + protoAdapter.encodedSizeWithTag(3, c568502Jn2.thumbnail_url) + c568502Jn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C568502Jn c568502Jn) {
            C568502Jn c568502Jn2 = c568502Jn;
            C546102Ax.ADAPTER.encodeWithTag(protoWriter, 1, c568502Jn2.question);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, c568502Jn2.returned_prompts);
            protoAdapter.encodeWithTag(protoWriter, 3, c568502Jn2.thumbnail_url);
            protoWriter.writeBytes(c568502Jn2.unknownFields());
        }
    };
    public C546102Ax question;
    public List<String> returned_prompts;
    public String thumbnail_url;

    public C568502Jn() {
        super(ADAPTER, ByteString.EMPTY);
        this.returned_prompts = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C568602Jo newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
