package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02XL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02XL extends Message<C02XL, C02XM> {
    public static final ProtoAdapter<C02XL> ADAPTER = new ProtoAdapter<C02XL>() { // from class: X.02XK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02XL decode(ProtoReader protoReader) {
            C02XL c02xl = new C02XL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02xl.text_dark_color = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02xl.text_color = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02xl.desc_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02xl;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02XL c02xl) {
            C02XL c02xl2 = c02xl;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02xl2.desc_text) + protoAdapter.encodedSizeWithTag(2, c02xl2.text_color) + protoAdapter.encodedSizeWithTag(3, c02xl2.text_dark_color) + c02xl2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02XL c02xl) {
        }
    };
    public String desc_text;
    public String text_color;
    public String text_dark_color;

    public C02XL() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02XM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
