package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DC extends Message<C02DC, C02JX> {
    public static final ProtoAdapter<C02DC> ADAPTER = new ProtoAdapter<C02DC>() { // from class: X.02DB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DC decode(ProtoReader protoReader) {
            C02DC c02dc = new C02DC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02dc.enable_standard_button = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c02dc.buttons.add(C02DA.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02dc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DC c02dc) {
            C02DC c02dc2 = c02dc;
            return C02DA.ADAPTER.asRepeated().encodedSizeWithTag(1, c02dc2.buttons) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c02dc2.enable_standard_button) + c02dc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DC c02dc) {
            C02DC c02dc2 = c02dc;
            C02DA.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c02dc2.buttons);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, c02dc2.enable_standard_button);
            protoWriter.writeBytes(c02dc2.unknownFields());
        }
    };
    public List<C02DA> buttons;
    public Boolean enable_standard_button;

    public C02DC() {
        super(ADAPTER, ByteString.EMPTY);
        this.buttons = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02JX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
