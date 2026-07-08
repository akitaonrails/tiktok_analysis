package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02T9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02T9 extends Message<C02T9, C02TE> {
    public static final ProtoAdapter<C02T9> ADAPTER = new ProtoAdapter<C02T9>() { // from class: X.02TA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02T9 decode(ProtoReader protoReader) {
            C02T9 c02t9 = new C02T9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02t9.template = C562402He.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02t9.standard_ui = C02TB.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02t9.ui_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02t9;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02T9 c02t9) {
            C02T9 c02t92 = c02t9;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02t92.ui_type) + C02TB.ADAPTER.encodedSizeWithTag(2, c02t92.standard_ui) + C562402He.ADAPTER.encodedSizeWithTag(3, c02t92.template) + c02t92.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02T9 c02t9) {
            C02T9 c02t92 = c02t9;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02t92.ui_type);
            C02TB.ADAPTER.encodeWithTag(protoWriter, 2, c02t92.standard_ui);
            C562402He.ADAPTER.encodeWithTag(protoWriter, 3, c02t92.template);
            protoWriter.writeBytes(c02t92.unknownFields());
        }
    };
    public C02TB standard_ui;
    public C562402He template;
    public Integer ui_type;

    public C02T9() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02TE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
