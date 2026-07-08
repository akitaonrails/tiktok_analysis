package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C607802Yq extends Message<C607802Yq, C607902Yr> {
    public static final ProtoAdapter<C607802Yq> ADAPTER = new ProtoAdapter<C607802Yq>() { // from class: X.02Yp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C607802Yq decode(ProtoReader protoReader) {
            C607802Yq c607802Yq = new C607802Yq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c607802Yq.transit_time_disclaimer_notice = C5434029w.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c607802Yq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C607802Yq c607802Yq) {
            C607802Yq c607802Yq2 = c607802Yq;
            return C5434029w.ADAPTER.encodedSizeWithTag(1, c607802Yq2.transit_time_disclaimer_notice) + c607802Yq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C607802Yq c607802Yq) {
        }
    };
    public C5434029w transit_time_disclaimer_notice;

    public C607802Yq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C607902Yr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
