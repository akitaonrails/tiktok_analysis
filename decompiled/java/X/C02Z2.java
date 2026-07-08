package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Z2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02Z2 extends Message<C02Z2, C02Z3> {
    public static final ProtoAdapter<C02Z2> ADAPTER = new ProtoAdapter<C02Z2>() { // from class: X.02Z1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02Z2 decode(ProtoReader protoReader) {
            C02Z2 c02z2 = new C02Z2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 255) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02z2.da_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02z2.bonus_info = C5224021u.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02z2.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02z2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02Z2 c02z2) {
            C02Z2 c02z22 = c02z2;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02z22.title) + C5224021u.ADAPTER.encodedSizeWithTag(2, c02z22.bonus_info) + protoAdapter.encodedSizeWithTag(255, c02z22.da_info) + c02z22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02Z2 c02z2) {
        }
    };
    public C5224021u bonus_info;
    public String da_info;
    public String title;

    public C02Z2() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Z3 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
