package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02VL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02VL extends Message<C02VL, C02VM> {
    public static final ProtoAdapter<C02VL> ADAPTER = new ProtoAdapter<C02VL>() { // from class: X.02VK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02VL decode(ProtoReader protoReader) {
            C02VL c02vl = new C02VL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02vl.filter_reason = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02vl.filter_code = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02vl.status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02vl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02VL c02vl) {
            C02VL c02vl2 = c02vl;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02vl2.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02vl2.filter_code) + protoAdapter.encodedSizeWithTag(3, c02vl2.filter_reason) + c02vl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02VL c02vl) {
            C02VL c02vl2 = c02vl;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02vl2.status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, c02vl2.filter_code);
            protoAdapter.encodeWithTag(protoWriter, 3, c02vl2.filter_reason);
            protoWriter.writeBytes(c02vl2.unknownFields());
        }
    };
    public String filter_code;
    public String filter_reason;
    public Integer status;

    public C02VL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02VM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
