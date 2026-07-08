package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C79, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1C79 extends Message<C1C79, C1C7A> {
    public static final ProtoAdapter<C1C79> ADAPTER = new ProtoAdapter<C1C79>() { // from class: X.1C78
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1C79 decode(ProtoReader protoReader) {
            C1C79 c1c79 = new C1C79();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c1c79.default_avatar = C029C.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1c79.user_id = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c79.link = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1c79.avatar = C02U1.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c1c79.name = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c79;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1C79 c1c79) {
            C1C79 c1c792 = c1c79;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c1c792.name) + C02U1.ADAPTER.encodedSizeWithTag(2, c1c792.avatar) + protoAdapter.encodedSizeWithTag(3, c1c792.link) + protoAdapter.encodedSizeWithTag(4, c1c792.user_id) + C029C.ADAPTER.encodedSizeWithTag(5, c1c792.default_avatar) + c1c792.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C1C79 c1c79) {
        }
    };
    public C02U1 avatar;
    public C029C default_avatar;
    public String link;
    public String name;
    public String user_id;

    public C1C79() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1C7A newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
