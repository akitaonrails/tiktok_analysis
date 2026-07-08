package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C550602Cq extends Message<C550602Cq, C02LX> {
    public static final ProtoAdapter<C550602Cq> ADAPTER = new ProtoAdapter<C550602Cq>() { // from class: X.025t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C550602Cq decode(ProtoReader protoReader) {
            C550602Cq c550602Cq = new C550602Cq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c550602Cq.sec_uid = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c550602Cq.user_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c550602Cq.user_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c550602Cq.nickname = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c550602Cq.user_avatar_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c550602Cq.scenario = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c550602Cq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C550602Cq c550602Cq) {
            C550602Cq c550602Cq2 = c550602Cq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c550602Cq2.sec_uid) + protoAdapter.encodedSizeWithTag(2, c550602Cq2.user_name) + protoAdapter.encodedSizeWithTag(3, c550602Cq2.user_id) + protoAdapter.encodedSizeWithTag(4, c550602Cq2.nickname) + C673002jw.ADAPTER.encodedSizeWithTag(5, c550602Cq2.user_avatar_url) + ProtoAdapter.INT32.encodedSizeWithTag(6, c550602Cq2.scenario) + c550602Cq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C550602Cq c550602Cq) {
            C550602Cq c550602Cq2 = c550602Cq;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c550602Cq2.sec_uid);
            protoAdapter.encodeWithTag(protoWriter, 2, c550602Cq2.user_name);
            protoAdapter.encodeWithTag(protoWriter, 3, c550602Cq2.user_id);
            protoAdapter.encodeWithTag(protoWriter, 4, c550602Cq2.nickname);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 5, c550602Cq2.user_avatar_url);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, c550602Cq2.scenario);
            protoWriter.writeBytes(c550602Cq2.unknownFields());
        }
    };
    public String nickname;
    public Integer scenario;
    public String sec_uid;
    public C673002jw user_avatar_url;
    public String user_id;
    public String user_name;

    public C550602Cq() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LX newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
