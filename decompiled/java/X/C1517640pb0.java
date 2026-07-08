package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517640pb0 extends Message<C1517640pb0, C1517650pb1> {
    public static final ProtoAdapter<C1517640pb0> ADAPTER = new ProtoAdapter<C1517640pb0>() { // from class: X.0paz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517640pb0 decode(ProtoReader protoReader) {
            C1517640pb0 c1517640pb0 = new C1517640pb0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1517640pb0.locations.add(ProtoAdapter.FLOAT.decode(protoReader));
                        }
                    } else {
                        c1517640pb0.colors.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517640pb0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517640pb0 c1517640pb0) {
            C1517640pb0 c1517640pb02 = c1517640pb0;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c1517640pb02.colors) + ProtoAdapter.FLOAT.asRepeated().encodedSizeWithTag(2, c1517640pb02.locations) + c1517640pb02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517640pb0 c1517640pb0) {
            C1517640pb0 c1517640pb02 = c1517640pb0;
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, c1517640pb02.colors);
            ProtoAdapter.FLOAT.asRepeated().encodeWithTag(protoWriter, 2, c1517640pb02.locations);
            protoWriter.writeBytes(c1517640pb02.unknownFields());
        }
    };
    public List<String> colors;
    public List<Float> locations;

    public C1517640pb0() {
        super(ADAPTER, ByteString.EMPTY);
        this.colors = C1516540pZE.LJIIIIZZ();
        this.locations = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1517650pb1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
