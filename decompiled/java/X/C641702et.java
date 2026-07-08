package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C641702et extends Message<C641702et, C641802eu> {
    public static final ProtoAdapter<C641702et> ADAPTER = new ProtoAdapter<C641702et>() { // from class: X.02es
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C641702et decode(ProtoReader protoReader) {
            C641702et c641702et = new C641702et();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c641702et.shipping_days = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c641702et.shipping_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c641702et;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C641702et c641702et) {
            C641702et c641702et2 = c641702et;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c641702et2.shipping_text) + ProtoAdapter.INT32.encodedSizeWithTag(2, c641702et2.shipping_days) + c641702et2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C641702et c641702et) {
        }
    };
    public Integer shipping_days;
    public String shipping_text;

    public C641702et() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C641802eu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
