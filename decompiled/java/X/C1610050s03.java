package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0s03, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1610050s03 extends Message<C1610050s03, C1610060s04> {
    public static final ProtoAdapter<C1610050s03> ADAPTER = new ProtoAdapter<C1610050s03>() { // from class: X.0s02
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1610050s03 decode(ProtoReader protoReader) {
            C1610050s03 c1610050s03 = new C1610050s03();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1610050s03.interact_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1610050s03.share_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1610050s03;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1610050s03 c1610050s03) {
            C1610050s03 c1610050s032 = c1610050s03;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, c1610050s032.share_type) + protoAdapter.encodedSizeWithTag(2, c1610050s032.interact_type) + c1610050s032.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1610050s03 c1610050s03) {
            C1610050s03 c1610050s032 = c1610050s03;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1610050s032.share_type);
            protoAdapter.encodeWithTag(protoWriter, 2, c1610050s032.interact_type);
            protoWriter.writeBytes(c1610050s032.unknownFields());
        }
    };
    public Integer interact_type;
    public Integer share_type;

    public C1610050s03() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1610060s04 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
