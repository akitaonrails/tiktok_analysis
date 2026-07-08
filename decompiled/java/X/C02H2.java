package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02H2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02H2 extends Message<C02H2, C582702Oz> {
    public static final ProtoAdapter<C02H2> ADAPTER = new ProtoAdapter<C02H2>() { // from class: X.02H1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02H2 decode(ProtoReader protoReader) {
            C02H2 c02h2 = new C02H2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02h2.expand_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02h2.click_toast.add(C02H0.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02h2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02H2 c02h2) {
            C02H2 c02h22 = c02h2;
            return C02H0.ADAPTER.asRepeated().encodedSizeWithTag(1, c02h22.click_toast) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02h22.expand_text) + c02h22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02H2 c02h2) {
        }
    };
    public List<C02H0> click_toast;
    public String expand_text;

    public C02H2() {
        super(ADAPTER, ByteString.EMPTY);
        this.click_toast = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C582702Oz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
