package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C639902eb extends Message<C639902eb, C640002ec> {
    public static final ProtoAdapter<C639902eb> ADAPTER = new ProtoAdapter<C639902eb>() { // from class: X.02ea
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C639902eb decode(ProtoReader protoReader) {
            C639902eb c639902eb = new C639902eb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c639902eb.fmt_customer_count = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c639902eb.customer_count = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c639902eb;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C639902eb c639902eb) {
            C639902eb c639902eb2 = c639902eb;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c639902eb2.customer_count) + ProtoAdapter.STRING.encodedSizeWithTag(2, c639902eb2.fmt_customer_count) + c639902eb2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C639902eb c639902eb) {
        }
    };
    public Integer customer_count;
    public String fmt_customer_count;

    public C639902eb() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C640002ec newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
