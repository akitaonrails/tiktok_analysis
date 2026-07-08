package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02WB, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02WB extends Message<C02WB, C02WC> {
    public static final ProtoAdapter<C02WB> ADAPTER = new ProtoAdapter<C02WB>() { // from class: X.02WA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02WB decode(ProtoReader protoReader) {
            C02WB c02wb = new C02WB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02wb.trans_bg_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02wb.enter_text = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02wb.process_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02wb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02WB c02wb) {
            C02WB c02wb2 = c02wb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02wb2.process_text) + protoAdapter.encodedSizeWithTag(2, c02wb2.enter_text) + protoAdapter.encodedSizeWithTag(3, c02wb2.trans_bg_text) + c02wb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02WB c02wb) {
            C02WB c02wb2 = c02wb;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c02wb2.process_text);
            protoAdapter.encodeWithTag(protoWriter, 2, c02wb2.enter_text);
            protoAdapter.encodeWithTag(protoWriter, 3, c02wb2.trans_bg_text);
            protoWriter.writeBytes(c02wb2.unknownFields());
        }
    };
    public String enter_text;
    public String process_text;
    public String trans_bg_text;

    public C02WB() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02WC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
