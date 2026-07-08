package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02as, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C616802as extends Message<C616802as, C616902at> {
    public static final ProtoAdapter<C616802as> ADAPTER = new ProtoAdapter<C616802as>() { // from class: X.02ar
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C616802as decode(ProtoReader protoReader) {
            C616802as c616802as = new C616802as();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c616802as.animate_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c616802as.record = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c616802as;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C616802as c616802as) {
            C616802as c616802as2 = c616802as;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c616802as2.record) + ProtoAdapter.INT32.encodedSizeWithTag(2, c616802as2.animate_type) + c616802as2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C616802as c616802as) {
            C616802as c616802as2 = c616802as;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c616802as2.record);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, c616802as2.animate_type);
            protoWriter.writeBytes(c616802as2.unknownFields());
        }
    };
    public Integer animate_type;
    public Long record;

    public C616802as() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C616902at newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
