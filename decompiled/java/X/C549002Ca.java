package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549002Ca extends Message<C549002Ca, C02PY> {
    public static final ProtoAdapter<C549002Ca> ADAPTER = new ProtoAdapter<C549002Ca>() { // from class: X.028O
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549002Ca decode(ProtoReader protoReader) {
            C549002Ca c549002Ca = new C549002Ca();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c549002Ca.labels.add(AnonymousClass0238.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c549002Ca.placement = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549002Ca;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549002Ca c549002Ca) {
            C549002Ca c549002Ca2 = c549002Ca;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c549002Ca2.placement) + AnonymousClass0238.ADAPTER.asRepeated().encodedSizeWithTag(2, c549002Ca2.labels) + c549002Ca2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C549002Ca c549002Ca) {
        }
    };
    public List<AnonymousClass0238> labels;
    public Integer placement;

    public C549002Ca() {
        super(ADAPTER, ByteString.EMPTY);
        this.labels = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02PY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
