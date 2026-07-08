package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C632702dR extends Message<C632702dR, C632802dS> {
    public static final ProtoAdapter<C632702dR> ADAPTER = new ProtoAdapter<C632702dR>() { // from class: X.02dQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C632702dR decode(ProtoReader protoReader) {
            C632702dR c632702dR = new C632702dR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c632702dR.color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c632702dR.label = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c632702dR;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C632702dR c632702dR) {
            C632702dR c632702dR2 = c632702dR;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c632702dR2.label) + protoAdapter.encodedSizeWithTag(2, c632702dR2.color) + c632702dR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C632702dR c632702dR) {
            C632702dR c632702dR2 = c632702dR;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c632702dR2.label);
            protoAdapter.encodeWithTag(protoWriter, 2, c632702dR2.color);
            protoWriter.writeBytes(c632702dR2.unknownFields());
        }
    };
    public String color;
    public String label;

    public C632702dR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C632802dS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
