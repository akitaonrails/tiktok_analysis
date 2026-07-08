package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C751902wf extends Message<C751902wf, C752002wg> {
    public static final ProtoAdapter<C751902wf> ADAPTER = new ProtoAdapter<C751902wf>() { // from class: X.02we
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C751902wf decode(ProtoReader protoReader) {
            C751902wf c751902wf = new C751902wf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c751902wf.cart_discount_desc = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c751902wf.cart_promotion_summary = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c751902wf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C751902wf c751902wf) {
            C751902wf c751902wf2 = c751902wf;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c751902wf2.cart_promotion_summary) + protoAdapter.encodedSizeWithTag(2, c751902wf2.cart_discount_desc) + c751902wf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C751902wf c751902wf) {
        }
    };
    public String cart_discount_desc;
    public String cart_promotion_summary;

    public C751902wf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C752002wg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
