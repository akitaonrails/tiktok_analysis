package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C560702Gn extends Message<C560702Gn, C02MZ> {
    public static final ProtoAdapter<C560702Gn> ADAPTER = new ProtoAdapter<C560702Gn>() { // from class: X.02Al
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C560702Gn decode(ProtoReader protoReader) {
            C560702Gn c560702Gn = new C560702Gn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c560702Gn.payment_tips = C02B0.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c560702Gn.card_bin = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c560702Gn;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C560702Gn c560702Gn) {
            C560702Gn c560702Gn2 = c560702Gn;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c560702Gn2.card_bin) + C02B0.ADAPTER.encodedSizeWithTag(2, c560702Gn2.payment_tips) + c560702Gn2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C560702Gn c560702Gn) {
        }
    };
    public String card_bin;
    public C02B0 payment_tips;

    public C560702Gn() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02MZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
