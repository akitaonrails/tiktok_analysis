package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02eM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C638402eM extends Message<C638402eM, C638502eN> {
    public static final ProtoAdapter<C638402eM> ADAPTER = new ProtoAdapter<C638402eM>() { // from class: X.02eL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C638402eM decode(ProtoReader protoReader) {
            C638402eM c638402eM = new C638402eM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c638402eM.url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c638402eM.keyword = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c638402eM;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C638402eM c638402eM) {
            C638402eM c638402eM2 = c638402eM;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c638402eM2.keyword) + protoAdapter.encodedSizeWithTag(2, c638402eM2.url) + c638402eM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C638402eM c638402eM) {
            C638402eM c638402eM2 = c638402eM;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c638402eM2.keyword);
            protoAdapter.encodeWithTag(protoWriter, 2, c638402eM2.url);
            protoWriter.writeBytes(c638402eM2.unknownFields());
        }
    };
    public String keyword;
    public String url;

    public C638402eM() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C638502eN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
