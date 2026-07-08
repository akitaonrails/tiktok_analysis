package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GR extends Message<C02GR, C02QK> {
    public static final ProtoAdapter<C02GR> ADAPTER = new ProtoAdapter<C02GR>() { // from class: X.02BV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GR decode(ProtoReader protoReader) {
            C02GR c02gr = new C02GR();
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
                                    c02gr.reject_button_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02gr.confirm_button = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02gr.description = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02gr.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GR c02gr) {
            C02GR c02gr2 = c02gr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02gr2.title) + protoAdapter.encodedSizeWithTag(2, c02gr2.description) + protoAdapter.encodedSizeWithTag(3, c02gr2.confirm_button) + protoAdapter.encodedSizeWithTag(4, c02gr2.reject_button_text) + c02gr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GR c02gr) {
        }
    };
    public String confirm_button;
    public String description;
    public String reject_button_text;
    public String title;

    public C02GR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QK newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
