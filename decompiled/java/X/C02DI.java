package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DI extends Message<C02DI, C574002Lq> {
    public static final ProtoAdapter<C02DI> ADAPTER = new ProtoAdapter<C02DI>() { // from class: X.026B
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DI decode(ProtoReader protoReader) {
            C02DI c02di = new C02DI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c02di.tracer_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02di.customized_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02di.ui = C02T9.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02di.signal = C02DL.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02di.key = C638102eJ.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02di;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DI c02di) {
            C02DI c02di2 = c02di;
            int iEncodedSizeWithTag = C638102eJ.ADAPTER.encodedSizeWithTag(1, c02di2.key) + C02DL.ADAPTER.encodedSizeWithTag(2, c02di2.signal) + C02T9.ADAPTER.encodedSizeWithTag(3, c02di2.ui);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c02di2.customized_info) + protoAdapter.encodedSizeWithTag(5, c02di2.tracer_info) + c02di2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DI c02di) {
            C02DI c02di2 = c02di;
            C638102eJ.ADAPTER.encodeWithTag(protoWriter, 1, c02di2.key);
            C02DL.ADAPTER.encodeWithTag(protoWriter, 2, c02di2.signal);
            C02T9.ADAPTER.encodeWithTag(protoWriter, 3, c02di2.ui);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c02di2.customized_info);
            protoAdapter.encodeWithTag(protoWriter, 5, c02di2.tracer_info);
            protoWriter.writeBytes(c02di2.unknownFields());
        }
    };
    public String customized_info;
    public C638102eJ key;
    public C02DL signal;
    public String tracer_info;
    public C02T9 ui;

    public C02DI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C574002Lq newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
