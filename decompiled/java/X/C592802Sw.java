package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Sw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C592802Sw extends Message<C592802Sw, C592902Sx> {
    public static final ProtoAdapter<C592802Sw> ADAPTER = new ProtoAdapter<C592802Sw>() { // from class: X.02St
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C592802Sw decode(ProtoReader protoReader) {
            C592802Sw c592802Sw = new C592802Sw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c592802Sw.server_base_component_config = C02S2.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c592802Sw;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C592802Sw c592802Sw) {
            C592802Sw c592802Sw2 = c592802Sw;
            return C02S2.ADAPTER.encodedSizeWithTag(1, c592802Sw2.server_base_component_config) + c592802Sw2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C592802Sw c592802Sw) {
            C592802Sw c592802Sw2 = c592802Sw;
            C02S2.ADAPTER.encodeWithTag(protoWriter, 1, c592802Sw2.server_base_component_config);
            protoWriter.writeBytes(c592802Sw2.unknownFields());
        }
    };
    public C02S2 server_base_component_config;

    public C592802Sw() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C592902Sx newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
