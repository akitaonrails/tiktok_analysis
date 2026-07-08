package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C625002cC extends Message<C625002cC, C625502cH> {
    public static final ProtoAdapter<C625002cC> ADAPTER = new ProtoAdapter<C625002cC>() { // from class: X.02cD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C625002cC decode(ProtoReader protoReader) {
            C625002cC c625002cC = new C625002cC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c625002cC.deleted_live_rooms.add(C625202cE.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c625002cC;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C625002cC c625002cC) {
            C625002cC c625002cC2 = c625002cC;
            return C625202cE.ADAPTER.asRepeated().encodedSizeWithTag(1, c625002cC2.deleted_live_rooms) + c625002cC2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C625002cC c625002cC) {
            C625002cC c625002cC2 = c625002cC;
            C625202cE.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c625002cC2.deleted_live_rooms);
            protoWriter.writeBytes(c625002cC2.unknownFields());
        }
    };
    public List<C625202cE> deleted_live_rooms;

    public C625002cC() {
        super(ADAPTER, ByteString.EMPTY);
        this.deleted_live_rooms = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C625502cH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
