package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Do, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C553002Do extends Message<C553002Do, C576102Ml> {
    public static final ProtoAdapter<C553002Do> ADAPTER = new ProtoAdapter<C553002Do>() { // from class: X.02BI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C553002Do decode(ProtoReader protoReader) {
            C553002Do c553002Do = new C553002Do();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c553002Do.promotion_labels.add(C5256023a.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c553002Do;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C553002Do c553002Do) {
            C553002Do c553002Do2 = c553002Do;
            return C5256023a.ADAPTER.asRepeated().encodedSizeWithTag(1, c553002Do2.promotion_labels) + c553002Do2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C553002Do c553002Do) {
        }
    };
    public List<C5256023a> promotion_labels;

    public C553002Do() {
        super(ADAPTER, ByteString.EMPTY);
        this.promotion_labels = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C576102Ml newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
