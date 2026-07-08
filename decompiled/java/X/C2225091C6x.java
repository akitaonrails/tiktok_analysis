package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225091C6x extends Message<C2225091C6x, C2225101C6y> {
    public static final ProtoAdapter<C2225091C6x> ADAPTER = new ProtoAdapter<C2225091C6x>() { // from class: X.1C6w
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225091C6x decode(ProtoReader protoReader) {
            C2225091C6x c2225091C6x = new C2225091C6x();
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
                                    c2225091C6x.schema_url = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c2225091C6x.logo = C029C.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2225091C6x.description = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2225091C6x.title = C5431029t.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225091C6x;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225091C6x c2225091C6x) {
            C2225091C6x c2225091C6x2 = c2225091C6x;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c2225091C6x2.title) + protoAdapter.encodedSizeWithTag(2, c2225091C6x2.description) + C029C.ADAPTER.encodedSizeWithTag(3, c2225091C6x2.logo) + ProtoAdapter.STRING.encodedSizeWithTag(4, c2225091C6x2.schema_url) + c2225091C6x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2225091C6x c2225091C6x) {
        }
    };
    public C5431029t description;
    public C029C logo;
    public String schema_url;
    public C5431029t title;

    public C2225091C6x() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2225101C6y newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
