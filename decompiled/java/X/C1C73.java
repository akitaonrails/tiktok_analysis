package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C73, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C73 extends Message<C1C73, C1C74> {
    public static final ProtoAdapter<C1C73> ADAPTER = new ProtoAdapter<C1C73>() { // from class: X.1C72
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C73 decode(ProtoReader protoReader) {
            C1C73 c1c73 = new C1C73();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c1c73.pdp_banner_info = C1C70.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c73.page_schema = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c73;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C73 c1c73) {
            C1C73 c1c732 = c1c73;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1c732.page_schema) + C1C70.ADAPTER.encodedSizeWithTag(2, c1c732.pdp_banner_info) + c1c732.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C73 c1c73) {
        }
    };
    public String page_schema;
    public C1C70 pdp_banner_info;

    public C1C73() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C74 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
