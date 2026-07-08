package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GU extends Message<C02GU, C567502Jd> {
    public static final ProtoAdapter<C02GU> ADAPTER = new ProtoAdapter<C02GU>() { // from class: X.02GT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GU decode(ProtoReader protoReader) {
            C02GU c02gu = new C02GU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02gu.collaborators.add(C02GS.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02gu.should_display_tag = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GU c02gu) {
            C02GU c02gu2 = c02gu;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, c02gu2.should_display_tag) + C02GS.ADAPTER.asRepeated().encodedSizeWithTag(2, c02gu2.collaborators) + c02gu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02GU c02gu) {
            C02GU c02gu2 = c02gu;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c02gu2.should_display_tag);
            C02GS.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02gu2.collaborators);
            protoWriter.writeBytes(c02gu2.unknownFields());
        }
    };
    public List<C02GS> collaborators;
    public Boolean should_display_tag;

    public C02GU() {
        super(ADAPTER, ByteString.EMPTY);
        this.collaborators = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C567502Jd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
