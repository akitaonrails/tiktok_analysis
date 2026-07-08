package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02S8, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02S8 extends Message<C02S8, C02SA> {
    public static final ProtoAdapter<C02S8> ADAPTER = new ProtoAdapter<C02S8>() { // from class: X.02S7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02S8 decode(ProtoReader protoReader) {
            C02S8 c02s8 = new C02S8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c02s8.biz_permissions.add(C02S6.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02s8;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02S8 c02s8) {
            C02S8 c02s82 = c02s8;
            return C02S6.ADAPTER.asRepeated().encodedSizeWithTag(1, c02s82.biz_permissions) + c02s82.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02S8 c02s8) {
            C02S8 c02s82 = c02s8;
            C02S6.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c02s82.biz_permissions);
            protoWriter.writeBytes(c02s82.unknownFields());
        }
    };
    public List<C02S6> biz_permissions;

    public C02S8() {
        super(ADAPTER, ByteString.EMPTY);
        this.biz_permissions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02SA newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
