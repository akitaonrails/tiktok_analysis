package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02T1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02T1 extends Message<C02T1, C02T4> {
    public static final ProtoAdapter<C02T1> ADAPTER = new ProtoAdapter<C02T1>() { // from class: X.02T0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02T1 decode(ProtoReader protoReader) {
            C02T1 c02t1 = new C02T1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02t1.customized_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02t1.standard_ui = C02T6.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02t1.key = C637802eG.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02t1;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02T1 c02t1) {
            C02T1 c02t12 = c02t1;
            return C637802eG.ADAPTER.encodedSizeWithTag(1, c02t12.key) + C02T6.ADAPTER.encodedSizeWithTag(2, c02t12.standard_ui) + ProtoAdapter.STRING.encodedSizeWithTag(3, c02t12.customized_info) + c02t12.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02T1 c02t1) {
            C02T1 c02t12 = c02t1;
            C637802eG.ADAPTER.encodeWithTag(protoWriter, 1, c02t12.key);
            C02T6.ADAPTER.encodeWithTag(protoWriter, 2, c02t12.standard_ui);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c02t12.customized_info);
            protoWriter.writeBytes(c02t12.unknownFields());
        }
    };
    public String customized_info;
    public C637802eG key;
    public C02T6 standard_ui;

    public C02T1() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02T4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
