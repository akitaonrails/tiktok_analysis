package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02TG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02TG extends Message<C02TG, C02TK> {
    public static final ProtoAdapter<C02TG> ADAPTER = new ProtoAdapter<C02TG>() { // from class: X.02TF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02TG decode(ProtoReader protoReader) {
            C02TG c02tg = new C02TG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02tg.template = C562402He.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02tg.ui_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02tg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02TG c02tg) {
            C02TG c02tg2 = c02tg;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02tg2.ui_type) + C562402He.ADAPTER.encodedSizeWithTag(2, c02tg2.template) + c02tg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02TG c02tg) {
            C02TG c02tg2 = c02tg;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c02tg2.ui_type);
            C562402He.ADAPTER.encodeWithTag(protoWriter, 2, c02tg2.template);
            protoWriter.writeBytes(c02tg2.unknownFields());
        }
    };
    public C562402He template;
    public Integer ui_type;

    public C02TG() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02TK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
