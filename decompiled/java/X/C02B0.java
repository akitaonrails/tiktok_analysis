package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02B0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02B0 extends Message<C02B0, C02MS> {
    public static final ProtoAdapter<C02B0> ADAPTER = new ProtoAdapter<C02B0>() { // from class: X.0252
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02B0 decode(ProtoReader protoReader) {
            C02B0 c02b0 = new C02B0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02b0.tips = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c02b0.font_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02b0.dark_font_color = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02b0.show_description_default = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c02b0.tooltips = C645302fT.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c02b0.extra_tips = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c02b0.payment_method_tooltips = C561002Gq.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02b0;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02B0 c02b0) {
            C02B0 c02b02 = c02b0;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02b02.tips) + protoAdapter.encodedSizeWithTag(2, c02b02.font_color) + protoAdapter.encodedSizeWithTag(3, c02b02.dark_font_color) + ProtoAdapter.BOOL.encodedSizeWithTag(4, c02b02.show_description_default) + C645302fT.ADAPTER.encodedSizeWithTag(5, c02b02.tooltips) + C5431029t.ADAPTER.encodedSizeWithTag(6, c02b02.extra_tips) + C561002Gq.ADAPTER.encodedSizeWithTag(7, c02b02.payment_method_tooltips) + c02b02.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02B0 c02b0) {
        }
    };
    public String dark_font_color;
    public C5431029t extra_tips;
    public String font_color;
    public C561002Gq payment_method_tooltips;
    public Boolean show_description_default;
    public String tips;
    public C645302fT tooltips;

    public C02B0() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
