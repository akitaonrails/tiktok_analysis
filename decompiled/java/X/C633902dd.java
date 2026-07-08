package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C633902dd extends Message<C633902dd, C634002de> {
    public static final ProtoAdapter<C633902dd> ADAPTER = new ProtoAdapter<C633902dd>() { // from class: X.02dc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C633902dd decode(ProtoReader protoReader) {
            C633902dd c633902dd = new C633902dd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c633902dd.web_url = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c633902dd.title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c633902dd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C633902dd c633902dd) {
            C633902dd c633902dd2 = c633902dd;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c633902dd2.title) + protoAdapter.encodedSizeWithTag(2, c633902dd2.web_url) + c633902dd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C633902dd c633902dd) {
            C633902dd c633902dd2 = c633902dd;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c633902dd2.title);
            protoAdapter.encodeWithTag(protoWriter, 2, c633902dd2.web_url);
            protoWriter.writeBytes(c633902dd2.unknownFields());
        }
    };
    public String title;
    public String web_url;

    public C633902dd() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C634002de newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
