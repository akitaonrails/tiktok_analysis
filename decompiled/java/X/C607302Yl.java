package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C607302Yl extends Message<C607302Yl, C607402Ym> {
    public static final ProtoAdapter<C607302Yl> ADAPTER = new ProtoAdapter<C607302Yl>() { // from class: X.02Yk
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C607302Yl decode(ProtoReader protoReader) {
            C607302Yl c607302Yl = new C607302Yl();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c607302Yl.texts.add(C607102Yj.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c607302Yl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C607302Yl c607302Yl) {
            C607302Yl c607302Yl2 = c607302Yl;
            return C607102Yj.ADAPTER.asRepeated().encodedSizeWithTag(1, c607302Yl2.texts) + c607302Yl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C607302Yl c607302Yl) {
            C607302Yl c607302Yl2 = c607302Yl;
            C607102Yj.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c607302Yl2.texts);
            protoWriter.writeBytes(c607302Yl2.unknownFields());
        }
    };
    public List<C607102Yj> texts;

    public C607302Yl() {
        super(ADAPTER, ByteString.EMPTY);
        this.texts = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C607402Ym newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
