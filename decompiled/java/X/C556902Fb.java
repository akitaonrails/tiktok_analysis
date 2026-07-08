package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C556902Fb extends Message<C556902Fb, C02N7> {
    public static final ProtoAdapter<C556902Fb> ADAPTER = new ProtoAdapter<C556902Fb>() { // from class: X.02Fa
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C556902Fb decode(ProtoReader protoReader) {
            C556902Fb c556902Fb = new C556902Fb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c556902Fb.button_list.add(C02FZ.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c556902Fb.title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c556902Fb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C556902Fb c556902Fb) {
            C556902Fb c556902Fb2 = c556902Fb;
            return C5431029t.ADAPTER.encodedSizeWithTag(1, c556902Fb2.title) + C02FZ.ADAPTER.asRepeated().encodedSizeWithTag(2, c556902Fb2.button_list) + c556902Fb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C556902Fb c556902Fb) {
        }
    };
    public List<C02FZ> button_list;
    public C5431029t title;

    public C556902Fb() {
        super(ADAPTER, ByteString.EMPTY);
        this.button_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02N7 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
