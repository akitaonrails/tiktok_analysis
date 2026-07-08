package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02YV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02YV extends Message<C02YV, C02YX> {
    public static final ProtoAdapter<C02YV> ADAPTER = new ProtoAdapter<C02YV>() { // from class: X.02YU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02YV decode(ProtoReader protoReader) {
            C02YV c02yv = new C02YV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02yv.save_display_popup_content.add(C02YT.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c02yv.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02yv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02YV c02yv) {
            C02YV c02yv2 = c02yv;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c02yv2.name) + C02YT.ADAPTER.asRepeated().encodedSizeWithTag(2, c02yv2.save_display_popup_content) + c02yv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02YV c02yv) {
        }
    };
    public String name;
    public List<C02YT> save_display_popup_content;

    public C02YV() {
        super(ADAPTER, ByteString.EMPTY);
        this.save_display_popup_content = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02YX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
