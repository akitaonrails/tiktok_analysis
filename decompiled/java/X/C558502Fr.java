package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C558502Fr extends Message<C558502Fr, C570502Kh> {
    public static final ProtoAdapter<C558502Fr> ADAPTER = new ProtoAdapter<C558502Fr>() { // from class: X.02AA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C558502Fr decode(ProtoReader protoReader) {
            C558502Fr c558502Fr = new C558502Fr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c558502Fr.recalled_query_search_ts = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c558502Fr.recalled_query = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c558502Fr.query_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c558502Fr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C558502Fr c558502Fr) {
            C558502Fr c558502Fr2 = c558502Fr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c558502Fr2.query_id) + protoAdapter.encodedSizeWithTag(2, c558502Fr2.recalled_query) + protoAdapter.encodedSizeWithTag(3, c558502Fr2.recalled_query_search_ts) + c558502Fr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C558502Fr c558502Fr) {
            C558502Fr c558502Fr2 = c558502Fr;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c558502Fr2.query_id);
            protoAdapter.encodeWithTag(protoWriter, 2, c558502Fr2.recalled_query);
            protoAdapter.encodeWithTag(protoWriter, 3, c558502Fr2.recalled_query_search_ts);
            protoWriter.writeBytes(c558502Fr2.unknownFields());
        }
    };
    public String query_id;
    public String recalled_query;
    public String recalled_query_search_ts;

    public C558502Fr() {
    }

    @Override // com.squareup.wire.Message
    public C570502Kh newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C558502Fr(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public C558502Fr(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.query_id = str;
        this.recalled_query = str2;
        this.recalled_query_search_ts = str3;
    }
}
