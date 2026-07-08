package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CBX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CBX extends Message<C1CBX, C1CBY> {
    public static final ProtoAdapter<C1CBX> ADAPTER = new ProtoAdapter<C1CBX>() { // from class: X.1CBW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CBX decode(ProtoReader protoReader) {
            C1CBX c1cbx = new C1CBX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1cbx.link_info = C2251331D9v.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1cbx.review_status = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cbx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CBX c1cbx) {
            C1CBX c1cbx2 = c1cbx;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c1cbx2.review_status) + C2251331D9v.ADAPTER.encodedSizeWithTag(2, c1cbx2.link_info) + c1cbx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1CBX c1cbx) {
            C1CBX c1cbx2 = c1cbx;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c1cbx2.review_status);
            C2251331D9v.ADAPTER.encodeWithTag(protoWriter, 2, c1cbx2.link_info);
            protoWriter.writeBytes(c1cbx2.unknownFields());
        }
    };
    public C2251331D9v link_info;
    public Integer review_status;

    public C1CBX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CBY newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
