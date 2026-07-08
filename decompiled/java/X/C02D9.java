package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02D9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02D9 extends Message<C02D9, C02JO> {
    public static final ProtoAdapter<C02D9> ADAPTER = new ProtoAdapter<C02D9>() { // from class: X.026j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02D9 decode(ProtoReader protoReader) {
            C02D9 c02d9 = new C02D9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02d9.tracer_info = C675502kL.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02d9.customized_info = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02d9.standard_ui = C558402Fq.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02d9.key = C635402ds.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02d9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02D9 c02d9) {
            C02D9 c02d92 = c02d9;
            return C635402ds.ADAPTER.encodedSizeWithTag(1, c02d92.key) + C558402Fq.ADAPTER.encodedSizeWithTag(2, c02d92.standard_ui) + ProtoAdapter.STRING.encodedSizeWithTag(3, c02d92.customized_info) + C675502kL.ADAPTER.encodedSizeWithTag(4, c02d92.tracer_info) + c02d92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02D9 c02d9) {
            C02D9 c02d92 = c02d9;
            C635402ds.ADAPTER.encodeWithTag(protoWriter, 1, c02d92.key);
            C558402Fq.ADAPTER.encodeWithTag(protoWriter, 2, c02d92.standard_ui);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c02d92.customized_info);
            C675502kL.ADAPTER.encodeWithTag(protoWriter, 4, c02d92.tracer_info);
            protoWriter.writeBytes(c02d92.unknownFields());
        }
    };
    public String customized_info;
    public C635402ds key;
    public C558402Fq standard_ui;
    public C675502kL tracer_info;

    public C02D9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02JO newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
