package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Gp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C560902Gp extends Message<C560902Gp, C579002No> {
    public static final ProtoAdapter<C560902Gp> ADAPTER = new ProtoAdapter<C560902Gp>() { // from class: X.02GL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C560902Gp decode(ProtoReader protoReader) {
            C560902Gp c560902Gp = new C560902Gp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c560902Gp.prefix_icon = C029C.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c560902Gp.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c560902Gp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C560902Gp c560902Gp) {
            C560902Gp c560902Gp2 = c560902Gp;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c560902Gp2.text) + C029C.ADAPTER.encodedSizeWithTag(2, c560902Gp2.prefix_icon) + c560902Gp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C560902Gp c560902Gp) {
        }
    };
    public C029C prefix_icon;
    public String text;

    public C560902Gp() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C579002No newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
