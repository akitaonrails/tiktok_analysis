package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C615902aj extends Message<C615902aj, C616002ak> {
    public static final ProtoAdapter<C615902aj> ADAPTER = new ProtoAdapter<C615902aj>() { // from class: X.02ai
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C615902aj decode(ProtoReader protoReader) {
            C615902aj c615902aj = new C615902aj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c615902aj.locations.add(ProtoAdapter.FLOAT.decode(protoReader));
                        }
                    } else {
                        c615902aj.colors.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c615902aj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C615902aj c615902aj) {
            C615902aj c615902aj2 = c615902aj;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c615902aj2.colors) + ProtoAdapter.FLOAT.asRepeated().encodedSizeWithTag(2, c615902aj2.locations) + c615902aj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C615902aj c615902aj) {
            C615902aj c615902aj2 = c615902aj;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, c615902aj2.colors);
            ProtoAdapter.FLOAT.asRepeated().encodeWithTag(protoWriter, 2, c615902aj2.locations);
            protoWriter.writeBytes(c615902aj2.unknownFields());
        }
    };
    public List<String> colors;
    public List<Float> locations;

    public C615902aj() {
        super(ADAPTER, ByteString.EMPTY);
        this.colors = C1516540pZE.LJIIIIZZ();
        this.locations = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C616002ak newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
