package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02GN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02GN extends Message<C02GN, C02N0> {
    public static final ProtoAdapter<C02GN> ADAPTER = new ProtoAdapter<C02GN>() { // from class: X.02GF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02GN decode(ProtoReader protoReader) {
            C02GN c02gn = new C02GN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c02gn.common_retain_display_info = C02GG.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02gn.voucher_retain_display_info = C02GE.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02gn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02GN c02gn) {
            C02GN c02gn2 = c02gn;
            return C02GE.ADAPTER.encodedSizeWithTag(1, c02gn2.voucher_retain_display_info) + C02GG.ADAPTER.encodedSizeWithTag(2, c02gn2.common_retain_display_info) + c02gn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02GN c02gn) {
        }
    };
    public C02GG common_retain_display_info;
    public C02GE voucher_retain_display_info;

    public C02GN() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02N0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
