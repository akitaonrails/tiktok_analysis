package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CGI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1CGI extends Message<C1CGI, C1CGJ> {
    public static final ProtoAdapter<C1CGI> ADAPTER = new ProtoAdapter<C1CGI>() { // from class: X.1CGH
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1CGI decode(ProtoReader protoReader) {
            C1CGI c1cgi = new C1CGI();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c1cgi.short_terms_text = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cgi.half_terms_apply_schema = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1cgi.full_terms_apply_schema = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1cgi.terms_apply_text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cgi;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1CGI c1cgi) {
            C1CGI c1cgi2 = c1cgi;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1cgi2.terms_apply_text) + protoAdapter.encodedSizeWithTag(2, c1cgi2.full_terms_apply_schema) + protoAdapter.encodedSizeWithTag(3, c1cgi2.half_terms_apply_schema) + protoAdapter.encodedSizeWithTag(4, c1cgi2.short_terms_text) + c1cgi2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1CGI c1cgi) {
        }
    };
    public String full_terms_apply_schema;
    public String half_terms_apply_schema;
    public String short_terms_text;
    public String terms_apply_text;

    public C1CGI() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CGJ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
