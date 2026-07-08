package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C640802ek extends Message<C640802ek, C640902el> {
    public static final ProtoAdapter<C640802ek> ADAPTER = new ProtoAdapter<C640802ek>() { // from class: X.02ej
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C640802ek decode(ProtoReader protoReader) {
            C640802ek c640802ek = new C640802ek();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c640802ek.fmt_visitor_count = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c640802ek.visitor_count = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c640802ek;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C640802ek c640802ek) {
            C640802ek c640802ek2 = c640802ek;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c640802ek2.visitor_count) + ProtoAdapter.STRING.encodedSizeWithTag(2, c640802ek2.fmt_visitor_count) + c640802ek2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C640802ek c640802ek) {
        }
    };
    public String fmt_visitor_count;
    public Integer visitor_count;

    public C640802ek() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C640902el newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
