package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C558202Fo extends Message<C558202Fo, C567402Jc> {
    public static final ProtoAdapter<C558202Fo> ADAPTER = new ProtoAdapter<C558202Fo>() { // from class: X.02Fn
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C558202Fo decode(ProtoReader protoReader) {
            C558202Fo c558202Fo = new C558202Fo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c558202Fo.max_lines = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c558202Fo.texts.add(C558002Fm.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c558202Fo;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C558202Fo c558202Fo) {
            C558202Fo c558202Fo2 = c558202Fo;
            return C558002Fm.ADAPTER.asRepeated().encodedSizeWithTag(1, c558202Fo2.texts) + ProtoAdapter.INT32.encodedSizeWithTag(2, c558202Fo2.max_lines) + c558202Fo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C558202Fo c558202Fo) {
            C558202Fo c558202Fo2 = c558202Fo;
            C558002Fm.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c558202Fo2.texts);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c558202Fo2.max_lines);
            protoWriter.writeBytes(c558202Fo2.unknownFields());
        }
    };
    public Integer max_lines;
    public List<C558002Fm> texts;

    public C558202Fo() {
        super(ADAPTER, ByteString.EMPTY);
        this.texts = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C567402Jc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
