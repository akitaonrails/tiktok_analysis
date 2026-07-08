package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C5Z, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C5Z extends Message<C1C5Z, C2224601C5a> {
    public static final ProtoAdapter<C1C5Z> ADAPTER = new ProtoAdapter<C1C5Z>() { // from class: X.1C5Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C5Z decode(ProtoReader protoReader) {
            C1C5Z c1c5z = new C1C5Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c5z.dark_icon = C02U1.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c5z.light_icon = C02U1.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c5z;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C5Z c1c5z) {
            C1C5Z c1c5z2 = c1c5z;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c1c5z2.light_icon) + protoAdapter.encodedSizeWithTag(2, c1c5z2.dark_icon) + c1c5z2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C5Z c1c5z) {
        }
    };
    public C02U1 dark_icon;
    public C02U1 light_icon;

    public C1C5Z() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2224601C5a newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
