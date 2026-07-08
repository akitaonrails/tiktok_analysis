package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DA extends Message<C02DA, C569202Ju> {
    public static final ProtoAdapter<C02DA> ADAPTER = new ProtoAdapter<C02DA>() { // from class: X.0269
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DA decode(ProtoReader protoReader) {
            C02DA c02da = new C02DA();
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
                                        c02da.tracer_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02da.customized_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02da.ui = C02TI.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02da.signal = C02DL.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02da.key = C635102dp.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02da;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DA c02da) {
            C02DA c02da2 = c02da;
            int iEncodedSizeWithTag = C635102dp.ADAPTER.encodedSizeWithTag(1, c02da2.key) + C02DL.ADAPTER.encodedSizeWithTag(2, c02da2.signal) + C02TI.ADAPTER.encodedSizeWithTag(3, c02da2.ui);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c02da2.customized_info) + protoAdapter.encodedSizeWithTag(5, c02da2.tracer_info) + c02da2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DA c02da) {
            C02DA c02da2 = c02da;
            C635102dp.ADAPTER.encodeWithTag(protoWriter, 1, c02da2.key);
            C02DL.ADAPTER.encodeWithTag(protoWriter, 2, c02da2.signal);
            C02TI.ADAPTER.encodeWithTag(protoWriter, 3, c02da2.ui);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c02da2.customized_info);
            protoAdapter.encodeWithTag(protoWriter, 5, c02da2.tracer_info);
            protoWriter.writeBytes(c02da2.unknownFields());
        }
    };
    public String customized_info;
    public C635102dp key;
    public C02DL signal;
    public String tracer_info;
    public C02TI ui;

    public C02DA() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C569202Ju newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
