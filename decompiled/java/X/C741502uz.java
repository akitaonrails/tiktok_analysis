package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02uz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C741502uz extends Message<C741502uz, C741602v0> {
    public static final ProtoAdapter<C741502uz> ADAPTER = new ProtoAdapter<C741502uz>() { // from class: X.02uy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C741502uz decode(ProtoReader protoReader) {
            C741502uz c741502uz = new C741502uz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c741502uz.end_time = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c741502uz.desc = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c741502uz;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C741502uz c741502uz) {
            C741502uz c741502uz2 = c741502uz;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c741502uz2.desc) + ProtoAdapter.INT64.encodedSizeWithTag(2, c741502uz2.end_time) + c741502uz2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C741502uz c741502uz) {
        }
    };
    public String desc;
    public Long end_time;

    public C741502uz() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C741602v0 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
