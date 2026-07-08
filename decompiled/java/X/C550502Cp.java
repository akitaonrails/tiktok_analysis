package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C550502Cp extends Message<C550502Cp, C02K5> {
    public static final ProtoAdapter<C550502Cp> ADAPTER = new ProtoAdapter<C550502Cp>() { // from class: X.025T
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C550502Cp decode(ProtoReader protoReader) {
            C550502Cp c550502Cp = new C550502Cp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c550502Cp.id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c550502Cp.item_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c550502Cp.user_id = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c550502Cp.username = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c550502Cp.content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c550502Cp.user_avatar = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c550502Cp;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C550502Cp c550502Cp) {
            C550502Cp c550502Cp2 = c550502Cp;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c550502Cp2.id) + protoAdapter.encodedSizeWithTag(2, c550502Cp2.item_id) + protoAdapter.encodedSizeWithTag(3, c550502Cp2.user_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c550502Cp2.username) + protoAdapter2.encodedSizeWithTag(5, c550502Cp2.content) + C673002jw.ADAPTER.encodedSizeWithTag(6, c550502Cp2.user_avatar) + c550502Cp2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C550502Cp c550502Cp) {
            C550502Cp c550502Cp2 = c550502Cp;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c550502Cp2.id);
            protoAdapter.encodeWithTag(protoWriter, 2, c550502Cp2.item_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c550502Cp2.user_id);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, c550502Cp2.username);
            protoAdapter2.encodeWithTag(protoWriter, 5, c550502Cp2.content);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 6, c550502Cp2.user_avatar);
            protoWriter.writeBytes(c550502Cp2.unknownFields());
        }
    };
    public String content;
    public Long id;
    public Long item_id;
    public C673002jw user_avatar;
    public Long user_id;
    public String username;

    public C550502Cp() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02K5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
