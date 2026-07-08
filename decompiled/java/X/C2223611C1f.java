package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223611C1f extends Message<C2223611C1f, C2223621C1g> {
    public static final ProtoAdapter<C2223611C1f> ADAPTER = new ProtoAdapter<C2223611C1f>() { // from class: X.1C1e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223611C1f decode(ProtoReader protoReader) {
            C2223611C1f c2223611C1f = new C2223611C1f();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2223611C1f.data = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2223611C1f.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223611C1f;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223611C1f c2223611C1f) {
            C2223611C1f c2223611C1f2 = c2223611C1f;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c2223611C1f2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c2223611C1f2.data) + c2223611C1f2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2223611C1f c2223611C1f) {
        }
    };
    public String data;
    public Integer type;

    public C2223611C1f() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2223621C1g newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
