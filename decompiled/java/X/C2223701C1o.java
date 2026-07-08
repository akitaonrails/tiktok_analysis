package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223701C1o extends Message<C2223701C1o, C2223711C1p> {
    public static final ProtoAdapter<C2223701C1o> ADAPTER = new ProtoAdapter<C2223701C1o>() { // from class: X.1C1n
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223701C1o decode(ProtoReader protoReader) {
            C2223701C1o c2223701C1o = new C2223701C1o();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223701C1o.auto_disappearance_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2223701C1o.appear_time = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223701C1o;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223701C1o c2223701C1o) {
            C2223701C1o c2223701C1o2 = c2223701C1o;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c2223701C1o2.appear_time) + protoAdapter.encodedSizeWithTag(2, c2223701C1o2.auto_disappearance_time) + c2223701C1o2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223701C1o c2223701C1o) {
        }
    };
    public Long appear_time;
    public Long auto_disappearance_time;

    public C2223701C1o() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223711C1p newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
