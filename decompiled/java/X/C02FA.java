package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02FA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02FA extends Message<C02FA, C02O1> {
    public static final ProtoAdapter<C02FA> ADAPTER = new ProtoAdapter<C02FA>() { // from class: X.029Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02FA decode(ProtoReader protoReader) {
            C02FA c02fa = new C02FA();
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
                                        c02fa.desc_selected = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c02fa.promotion_unique_key = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c02fa.desc = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02fa.bank_meta = C02X9.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02fa.card_bin = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02fa;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02FA c02fa) {
            C02FA c02fa2 = c02fa;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c02fa2.card_bin) + C02X9.ADAPTER.encodedSizeWithTag(2, c02fa2.bank_meta) + protoAdapter.encodedSizeWithTag(3, c02fa2.desc) + protoAdapter.encodedSizeWithTag(4, c02fa2.promotion_unique_key) + protoAdapter.encodedSizeWithTag(5, c02fa2.desc_selected) + c02fa2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02FA c02fa) {
        }
    };
    public C02X9 bank_meta;
    public String card_bin;
    public String desc;
    public String desc_selected;
    public String promotion_unique_key;

    public C02FA() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02O1 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
