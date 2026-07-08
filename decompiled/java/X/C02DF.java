package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02DF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02DF extends Message<C02DF, C570702Kj> {
    public static final ProtoAdapter<C02DF> ADAPTER = new ProtoAdapter<C02DF>() { // from class: X.026A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02DF decode(ProtoReader protoReader) {
            C02DF c02df = new C02DF();
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
                                        c02df.tracer_info = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02df.customized_info = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02df.ui = C02TG.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02df.signal = C02DL.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02df.key = C636602e4.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02df;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02DF c02df) {
            C02DF c02df2 = c02df;
            int iEncodedSizeWithTag = C636602e4.ADAPTER.encodedSizeWithTag(1, c02df2.key) + C02DL.ADAPTER.encodedSizeWithTag(2, c02df2.signal) + C02TG.ADAPTER.encodedSizeWithTag(3, c02df2.ui);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, c02df2.customized_info) + protoAdapter.encodedSizeWithTag(5, c02df2.tracer_info) + c02df2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02DF c02df) {
            C02DF c02df2 = c02df;
            C636602e4.ADAPTER.encodeWithTag(protoWriter, 1, c02df2.key);
            C02DL.ADAPTER.encodeWithTag(protoWriter, 2, c02df2.signal);
            C02TG.ADAPTER.encodeWithTag(protoWriter, 3, c02df2.ui);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 4, c02df2.customized_info);
            protoAdapter.encodeWithTag(protoWriter, 5, c02df2.tracer_info);
            protoWriter.writeBytes(c02df2.unknownFields());
        }
    };
    public String customized_info;
    public C636602e4 key;
    public C02DL signal;
    public String tracer_info;
    public C02TG ui;

    public C02DF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C570702Kj newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
