package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GE extends Message<C02GE, C02N5> {
    public static final ProtoAdapter<C02GE> ADAPTER = new ProtoAdapter<C02GE>() { // from class: X.02Ao
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GE decode(ProtoReader protoReader) {
            C02GE c02ge = new C02GE();
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
                                        c02ge.voucher_retain_display_text = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02ge.voucher_retain_display_secondary_button_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02ge.voucher_retain_display_primary_button_text = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02ge.voucher_retain_display_title = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02ge.voucher_retain_display_icon_url = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ge;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GE c02ge) {
            C02GE c02ge2 = c02ge;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02ge2.voucher_retain_display_icon_url) + protoAdapter.encodedSizeWithTag(2, c02ge2.voucher_retain_display_title) + protoAdapter.encodedSizeWithTag(3, c02ge2.voucher_retain_display_primary_button_text) + protoAdapter.encodedSizeWithTag(4, c02ge2.voucher_retain_display_secondary_button_text) + protoAdapter.encodedSizeWithTag(5, c02ge2.voucher_retain_display_text) + c02ge2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GE c02ge) {
        }
    };
    public String voucher_retain_display_icon_url;
    public String voucher_retain_display_primary_button_text;
    public String voucher_retain_display_secondary_button_text;
    public String voucher_retain_display_text;
    public String voucher_retain_display_title;

    public C02GE() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02N5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
