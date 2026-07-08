package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C0D, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C0D extends Message<C1C0D, C1C0E> {
    public static final ProtoAdapter<C1C0D> ADAPTER = new ProtoAdapter<C1C0D>() { // from class: X.1C0C
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C0D decode(ProtoReader protoReader) {
            C1C0D c1c0d = new C1C0D();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c0d.property_value_ids.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c1c0d.display_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c0d;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C0D c1c0d) {
            C1C0D c1c0d2 = c1c0d;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1c0d2.display_text) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, c1c0d2.property_value_ids) + c1c0d2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C0D c1c0d) {
        }
    };
    public String display_text;
    public List<Long> property_value_ids;

    public C1C0D() {
        super(ADAPTER, ByteString.EMPTY);
        this.property_value_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1C0E newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
