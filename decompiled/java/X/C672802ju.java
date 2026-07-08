package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C672802ju extends Message<C672802ju, C672902jv> {
    public static final ProtoAdapter<C672802ju> ADAPTER = new ProtoAdapter<C672802ju>() { // from class: X.02jt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C672802ju decode(ProtoReader protoReader) {
            C672802ju c672802ju = new C672802ju();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c672802ju.live_related_label = C672502jr.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c672802ju;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C672802ju c672802ju) {
            C672802ju c672802ju2 = c672802ju;
            return C672502jr.ADAPTER.encodedSizeWithTag(1, c672802ju2.live_related_label) + c672802ju2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C672802ju c672802ju) {
            C672802ju c672802ju2 = c672802ju;
            C672502jr.ADAPTER.encodeWithTag(protoWriter, 1, c672802ju2.live_related_label);
            protoWriter.writeBytes(c672802ju2.unknownFields());
        }
    };
    public C672502jr live_related_label;

    public C672802ju() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C672902jv newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
