package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02TI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02TI extends Message<C02TI, C02TJ> {
    public static final ProtoAdapter<C02TI> ADAPTER = new ProtoAdapter<C02TI>() { // from class: X.02TH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02TI decode(ProtoReader protoReader) {
            C02TI c02ti = new C02TI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02ti.template = C562402He.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02ti.customized_ui_content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02ti.ui_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ti;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02TI c02ti) {
            C02TI c02ti2 = c02ti;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02ti2.ui_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02ti2.customized_ui_content) + C562402He.ADAPTER.encodedSizeWithTag(3, c02ti2.template) + c02ti2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02TI c02ti) {
            C02TI c02ti2 = c02ti;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02ti2.ui_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c02ti2.customized_ui_content);
            C562402He.ADAPTER.encodeWithTag(protoWriter, 3, c02ti2.template);
            protoWriter.writeBytes(c02ti2.unknownFields());
        }
    };
    public String customized_ui_content;
    public C562402He template;
    public Integer ui_type;

    public C02TI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02TJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
