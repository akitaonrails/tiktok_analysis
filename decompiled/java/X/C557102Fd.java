package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C557102Fd extends Message<C557102Fd, C02PD> {
    public static final ProtoAdapter<C557102Fd> ADAPTER = new ProtoAdapter<C557102Fd>() { // from class: X.02AC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C557102Fd decode(ProtoReader protoReader) {
            C557102Fd c557102Fd = new C557102Fd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c557102Fd.reachable = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c557102Fd.order_sku = C5217021n.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c557102Fd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C557102Fd c557102Fd) {
            C557102Fd c557102Fd2 = c557102Fd;
            return C5217021n.ADAPTER.encodedSizeWithTag(1, c557102Fd2.order_sku) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c557102Fd2.reachable) + c557102Fd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C557102Fd c557102Fd) {
        }
    };
    public C5217021n order_sku;
    public Boolean reachable;

    public C557102Fd() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PD newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
