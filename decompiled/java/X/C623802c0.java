package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02c0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C623802c0 extends Message<C623802c0, C623902c1> {
    public static final ProtoAdapter<C623802c0> ADAPTER = new ProtoAdapter<C623802c0>() { // from class: X.02bz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C623802c0 decode(ProtoReader protoReader) {
            C623802c0 c623802c0 = new C623802c0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c623802c0.icons.add(C029C.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c623802c0.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c623802c0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C623802c0 c623802c0) {
            C623802c0 c623802c02 = c623802c0;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c623802c02.text) + C029C.ADAPTER.asRepeated().encodedSizeWithTag(2, c623802c02.icons) + c623802c02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C623802c0 c623802c0) {
        }
    };
    public List<C029C> icons;
    public String text;

    public C623802c0() {
        super(ADAPTER, ByteString.EMPTY);
        this.icons = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C623902c1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
