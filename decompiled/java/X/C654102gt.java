package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C654102gt extends Message<C654102gt, C654202gu> {
    public static final ProtoAdapter<C654102gt> ADAPTER = new ProtoAdapter<C654102gt>() { // from class: X.02gs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C654102gt decode(ProtoReader protoReader) {
            C654102gt c654102gt = new C654102gt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c654102gt.user_token = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c654102gt.developer_token = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c654102gt;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C654102gt c654102gt) {
            C654102gt c654102gt2 = c654102gt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c654102gt2.developer_token) + protoAdapter.encodedSizeWithTag(2, c654102gt2.user_token) + c654102gt2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C654102gt c654102gt) {
            C654102gt c654102gt2 = c654102gt;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c654102gt2.developer_token);
            protoAdapter.encodeWithTag(protoWriter, 2, c654102gt2.user_token);
            protoWriter.writeBytes(c654102gt2.unknownFields());
        }
    };
    public String developer_token;
    public String user_token;

    public C654102gt() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C654202gu newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
