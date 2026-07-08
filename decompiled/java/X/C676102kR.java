package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02kR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C676102kR extends Message<C676102kR, C676202kS> {
    public static final ProtoAdapter<C676102kR> ADAPTER = new ProtoAdapter<C676102kR>() { // from class: X.02kQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C676102kR decode(ProtoReader protoReader) {
            C676102kR c676102kR = new C676102kR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c676102kR.impr_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c676102kR;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C676102kR c676102kR) {
            C676102kR c676102kR2 = c676102kR;
            return ProtoAdapter.STRING.encodedSizeWithTag(2, c676102kR2.impr_id) + c676102kR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C676102kR c676102kR) {
            C676102kR c676102kR2 = c676102kR;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c676102kR2.impr_id);
            protoWriter.writeBytes(c676102kR2.unknownFields());
        }
    };
    public String impr_id;

    public C676102kR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C676202kS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
