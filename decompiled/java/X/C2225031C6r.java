package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225031C6r extends Message<C2225031C6r, C2225041C6s> {
    public static final ProtoAdapter<C2225031C6r> ADAPTER = new ProtoAdapter<C2225031C6r>() { // from class: X.1C6q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225031C6r decode(ProtoReader protoReader) {
            C2225031C6r c2225031C6r = new C2225031C6r();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c2225031C6r.group_unique_keys.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c2225031C6r.promotion_group_title = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2225031C6r.page_title = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225031C6r;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225031C6r c2225031C6r) {
            C2225031C6r c2225031C6r2 = c2225031C6r;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2225031C6r2.page_title) + C5431029t.ADAPTER.encodedSizeWithTag(2, c2225031C6r2.promotion_group_title) + protoAdapter.asRepeated().encodedSizeWithTag(3, c2225031C6r2.group_unique_keys) + c2225031C6r2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2225031C6r c2225031C6r) {
        }
    };
    public List<String> group_unique_keys;
    public String page_title;
    public C5431029t promotion_group_title;

    public C2225031C6r() {
        super(ADAPTER, ByteString.EMPTY);
        this.group_unique_keys = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2225041C6s newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
