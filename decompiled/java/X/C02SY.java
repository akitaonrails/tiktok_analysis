package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02SY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02SY extends Message<C02SY, C02SZ> {
    public static final ProtoAdapter<C02SY> ADAPTER = new ProtoAdapter<C02SY>() { // from class: X.02SX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02SY decode(ProtoReader protoReader) {
            C02SY c02sy = new C02SY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02sy.steps.add(C02SW.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02sy.event = C611102Zx.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02sy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02SY c02sy) {
            C02SY c02sy2 = c02sy;
            return C611102Zx.ADAPTER.encodedSizeWithTag(1, c02sy2.event) + C02SW.ADAPTER.asRepeated().encodedSizeWithTag(2, c02sy2.steps) + c02sy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02SY c02sy) {
            C02SY c02sy2 = c02sy;
            C611102Zx.ADAPTER.encodeWithTag(protoWriter, 1, c02sy2.event);
            C02SW.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, c02sy2.steps);
            protoWriter.writeBytes(c02sy2.unknownFields());
        }
    };
    public C611102Zx event;
    public List<C02SW> steps;

    public C02SY() {
        super(ADAPTER, ByteString.EMPTY);
        this.steps = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02SZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
