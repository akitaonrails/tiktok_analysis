package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223731C1r extends Message<C2223731C1r, C2223741C1s> {
    public static final ProtoAdapter<C2223731C1r> ADAPTER = new ProtoAdapter<C2223731C1r>() { // from class: X.1C1q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223731C1r decode(ProtoReader protoReader) {
            C2223731C1r c2223731C1r = new C2223731C1r();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223731C1r.red_dot_count = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2223731C1r.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223731C1r;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223731C1r c2223731C1r) {
            C2223731C1r c2223731C1r2 = c2223731C1r;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c2223731C1r2.type) + protoAdapter.encodedSizeWithTag(2, c2223731C1r2.red_dot_count) + c2223731C1r2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223731C1r c2223731C1r) {
        }
    };
    public Integer red_dot_count;
    public Integer type;

    public C2223731C1r() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223741C1s newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
