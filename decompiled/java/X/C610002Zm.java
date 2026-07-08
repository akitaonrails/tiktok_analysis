package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C610002Zm extends Message<C610002Zm, C610102Zn> {
    public static final ProtoAdapter<C610002Zm> ADAPTER = new ProtoAdapter<C610002Zm>() { // from class: X.02Zl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C610002Zm decode(ProtoReader protoReader) {
            C610002Zm c610002Zm = new C610002Zm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c610002Zm.custom_biz = C609802Zk.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c610002Zm.standard_biz = C610802Zu.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c610002Zm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C610002Zm c610002Zm) {
            C610002Zm c610002Zm2 = c610002Zm;
            return C610802Zu.ADAPTER.encodedSizeWithTag(1, c610002Zm2.standard_biz) + C609802Zk.ADAPTER.encodedSizeWithTag(2, c610002Zm2.custom_biz) + c610002Zm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C610002Zm c610002Zm) {
            C610002Zm c610002Zm2 = c610002Zm;
            C610802Zu.ADAPTER.encodeWithTag(protoWriter, 1, c610002Zm2.standard_biz);
            C609802Zk.ADAPTER.encodeWithTag(protoWriter, 2, c610002Zm2.custom_biz);
            protoWriter.writeBytes(c610002Zm2.unknownFields());
        }
    };
    public C609802Zk custom_biz;
    public C610802Zu standard_biz;

    public C610002Zm() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C610102Zn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
