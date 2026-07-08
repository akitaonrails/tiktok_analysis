package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02kI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C675202kI extends Message<C675202kI, C675302kJ> {
    public static final ProtoAdapter<C675202kI> ADAPTER = new ProtoAdapter<C675202kI>() { // from class: X.02kH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C675202kI decode(ProtoReader protoReader) {
            C675202kI c675202kI = new C675202kI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c675202kI.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c675202kI;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C675202kI c675202kI) {
            C675202kI c675202kI2 = c675202kI;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c675202kI2.name) + c675202kI2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C675202kI c675202kI) {
            C675202kI c675202kI2 = c675202kI;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c675202kI2.name);
            protoWriter.writeBytes(c675202kI2.unknownFields());
        }
    };
    public String name;

    public C675202kI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C675302kJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
