package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02u2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C735602u2 extends Message<C735602u2, C735702u3> {
    public static final ProtoAdapter<C735602u2> ADAPTER = new ProtoAdapter<C735602u2>() { // from class: X.02u1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C735602u2 decode(ProtoReader protoReader) {
            C735602u2 c735602u2 = new C735602u2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c735602u2.description.add(C1COL.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c735602u2.title = C1COL.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c735602u2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C735602u2 c735602u2) {
            C735602u2 c735602u22 = c735602u2;
            ProtoAdapter<C1COL> protoAdapter = C1COL.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c735602u22.title) + protoAdapter.asRepeated().encodedSizeWithTag(2, c735602u22.description) + c735602u22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C735602u2 c735602u2) {
        }
    };
    public List<C1COL> description;
    public C1COL title;

    public C735602u2() {
        super(ADAPTER, ByteString.EMPTY);
        this.description = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C735702u3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
