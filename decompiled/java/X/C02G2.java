package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02G2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02G2 extends Message<C02G2, C02MT> {
    public static final ProtoAdapter<C02G2> ADAPTER = new ProtoAdapter<C02G2>() { // from class: X.02AG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02G2 decode(ProtoReader protoReader) {
            C02G2 c02g2 = new C02G2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02g2.toast = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c02g2.desc = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02g2.sku_common_text_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02g2;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02G2 c02g2) {
            C02G2 c02g22 = c02g2;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02g22.sku_common_text_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02g22.desc) + protoAdapter.encodedSizeWithTag(3, c02g22.toast) + c02g22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02G2 c02g2) {
        }
    };
    public String desc;
    public Integer sku_common_text_type;
    public String toast;

    public C02G2() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
