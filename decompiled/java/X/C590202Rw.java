package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C590202Rw extends Message<C590202Rw, C590402Ry> {
    public static final ProtoAdapter<C590202Rw> ADAPTER = new ProtoAdapter<C590202Rw>() { // from class: X.02Rv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C590202Rw decode(ProtoReader protoReader) {
            C590202Rw c590202Rw = new C590202Rw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c590202Rw.actions.add(C590002Ru.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c590202Rw.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c590202Rw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C590202Rw c590202Rw) {
            C590202Rw c590202Rw2 = c590202Rw;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c590202Rw2.type) + C590002Ru.ADAPTER.asRepeated().encodedSizeWithTag(2, c590202Rw2.actions) + c590202Rw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C590202Rw c590202Rw) {
            C590202Rw c590202Rw2 = c590202Rw;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c590202Rw2.type);
            C590002Ru.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c590202Rw2.actions);
            protoWriter.writeBytes(c590202Rw2.unknownFields());
        }
    };
    public List<C590002Ru> actions;
    public Integer type;

    public C590202Rw() {
        super(ADAPTER, ByteString.EMPTY);
        this.actions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C590402Ry newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
